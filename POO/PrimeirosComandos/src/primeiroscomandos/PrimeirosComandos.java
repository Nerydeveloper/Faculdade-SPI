package primeiroscomandos;

import java.util.Scanner;

/**
 *
 * @author adrian nery
 */
public class PrimeirosComandos {

    public static void main(String[] args) {
        
        //Escrevendo olá mundo na tela
        System.out.println("Olá mundo");
        
        
        //Recebendo dados do usuario
        /*
        * para receber dados devemos usar a classe Scanner do java
        * com isso podemos manipular( definir ) o objeto para o valor 
        * que esperamos receber do usuario.
        */
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número: ");
        
        int numero = leia.nextInt();
        
        System.out.println("Você digitou o número: " + numero);

        
        
    }
    
}
