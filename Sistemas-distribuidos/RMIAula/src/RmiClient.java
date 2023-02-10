import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RmiClient {
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		String objNome = "rmi://localhost:1099/calc";
		ICalculadora calc = (ICalculadora) Naming.lookup(objNome);
		System.out.println("----------------------------------------------");
		System.out.println("A soma é:" + calc.adicao(4, 3));
		
	}
}
