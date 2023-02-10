import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RmiServer {
	public static void main(String[] args) throws MalformedURLException {
		try {
			ICalculadora calc = new Calculadora();
			String objNome = "rmi://localhost/calc";
			System.out.println("\nRegistrando o objeto no RMIRegistry...");
			LocateRegistry.createRegistry(1099);
			Naming.rebind(objNome, calc);
		} catch (RemoteException e) {
			// TODO: handle exception
			e.printStackTrace();
		};
	}
}
