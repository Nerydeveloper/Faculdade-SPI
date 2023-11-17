package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt(); teclado.nextLine();
         
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
       
        
        System.out.println("Olá, " + nome + "!");
        
      
    }
    
}
