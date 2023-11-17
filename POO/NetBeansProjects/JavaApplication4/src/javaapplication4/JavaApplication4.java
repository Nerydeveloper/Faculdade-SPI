package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String nome = "Fulano";
        
        for(int i = 0; i < nome.length(); i++){
            System.out.println(nome.charAt(i));
        }
    }
    
    public static double dobrar(int x){
        return Math.pow(x, 2);
    }
    
}
