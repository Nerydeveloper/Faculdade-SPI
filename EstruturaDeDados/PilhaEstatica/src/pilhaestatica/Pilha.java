/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilhaestatica;

/**
 *
 * @author adria
 */
public class Pilha {
    private int tamanhoMaximo;
    private int[] array;
    private int topo;

    public Pilha(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.array = new int[tamanhoMaximo];
        this.topo = -1; // Inicialmente, a pilha está vazia
    }

    public void push(int elemento) {
        if (topo < tamanhoMaximo - 1) {
            array[++topo] = elemento;
        } else {
            System.out.println("Erro: Pilha cheia. Não é possível adicionar mais elementos.");
        }
    }

    public int pop() {
        if (topo >= 0) {
            return array[topo--];
        } else {
            System.out.println("Erro: Pilha vazia. Não é possível remover elementos.");
            return -1; // Valor de erro, pois a pilha está vazia
        }
    }

    public int peek() {
        if (topo >= 0) {
            return array[topo];
        } else {
            System.out.println("Erro: Pilha vazia. Não há elementos para visualizar.");
            return -1; // Valor de erro, pois a pilha está vazia
        }
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return topo == tamanhoMaximo - 1;
    }
}
