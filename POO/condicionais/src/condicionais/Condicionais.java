package condicionais;

import java.util.Scanner;

/**
 *
 * @author adrian nery
 */
public class Condicionais {

    public static void main(String[] args) {
        
        //Importa a classe Scanner para permitir a entrada de dados a partir do console.
        
        //Cria uma instância do objeto Scanner chamada input para receber entrada do usuário.
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        //Lê um número inteiro do usuário usando input.nextInt() e atribui o valor lido à variável num.
        int num = input.nextInt();
        
        
        /*
        * Inicia a estrutura condicional if-else if-else para determinar o valor de num:
        * Se num for maior que 10, ele imprime "Número maior que 10."
        * Se num for igual a 10, ele imprime "Número igual a 10."
        * Caso contrário, ou seja, se num for menor que 10, ele imprime "Número menor que 10."
        */
        if (num > 10) {
            System.out.println("Número maior que 10.");
        }else if (num == 10) {
            System.out.println("Número igual a 10.");
        }else{
            System.out.println("Número menor que 10.");
        }
    }
    
}
