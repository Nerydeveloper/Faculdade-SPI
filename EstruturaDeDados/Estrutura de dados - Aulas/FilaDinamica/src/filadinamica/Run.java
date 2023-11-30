/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filadinamica;

/**
 *
 * @author Aluno
 */
public class Run {

   public static void main(String[] args) {
        FilaDinamica minhaFila = new FilaDinamica();

        System.out.println("Está vazia? " + minhaFila.estaVazia());

        minhaFila.enfileirar(10);
        minhaFila.enfileirar(20);
        minhaFila.enfileirar(30);

        System.out.println("Primeiro elemento: " + minhaFila.primeiroElemento());

        minhaFila.desenfileirar();
        minhaFila.desenfileirar();
        minhaFila.desenfileirar();

        System.out.println("Está vazia? " + minhaFila.estaVazia());
    }
    
}
