package atividades.RevisaoProva02;

/**
 *
 * @author adrian
 */
public class Fila {

    private static final int TAMANHO_MAXIMO = 5;
    private int[] fila;
    private int tamanho;
    private int inicio;
    private int fim;

    public Fila() {
        fila = new int[TAMANHO_MAXIMO];
        tamanho = 0;
        inicio = 0;
        fim = -1;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public boolean estaCheia() {
        return tamanho == TAMANHO_MAXIMO;
    }

    public void enfileirar(int elemento) {
        if (estaCheia()) {
            System.out.println("A fila está cheia. Não é possível enfileirar mais elementos.");
        } else {
            fim = (fim + 1) % TAMANHO_MAXIMO;
            fila[fim] = elemento;
            tamanho++;
            System.out.println("Enfileirado: " + elemento);
        }
    }

    public int desenfileirar() {
        if (estaVazia()) {
            System.out.println("A fila está vazia. Não é possível desenfileirar.");
        }

        int elementoRemovido = fila[inicio];
        inicio = (inicio + 1) % TAMANHO_MAXIMO;
        tamanho--;
        System.out.println("Desenfileirado: " + elementoRemovido);
        return elementoRemovido;

    }

    public int primeiroElemento() {
        if (estaVazia()) {
            System.out.println("A fila está vazia. Não há primeiro elemento.");
            return -1; // Poderia ser lançada uma exceção em uma implementação mais robusta.
        } else {
            return fila[inicio];
        }
    }

    public int tamanho() {
        return tamanho;
    }

    /**
     * 1. Implemente um algoritmo que receba três filas estáticas, F, F_Impares
     * e F_Pares, e separe todos os valores guardados em F de tal forma que os
     * valores pares são movidos para a fila F_Pares e os valores ímpares são
     * movidos para F_Impares.
     *
     * @param f
     * @param F_Impares
     * @param F_Pares
     * @return
     */
    public Fila questao01(Fila f, Fila F_Impares, Fila F_Pares) {
        int result;
        int nElemento;
        for (int i = 0; i < f.tamanho; i++) {
            nElemento = f.desenfileirar();
            result = nElemento % 2;
            if (result != 0) {
                F_Impares.enfileirar(nElemento);
                System.out.println("Adicionei no impar: ");
            } else {
                F_Pares.enfileirar(nElemento);
                System.out.println("Adicionei no par: ");
            }
            f.tamanho--;
        }

        return this;
    }



    public static int getTAMANHO_MAXIMO() {
        return TAMANHO_MAXIMO;
    }

   
        @Override
    public String toString() {
        return "Fila{" + "fila=" + fila.toString() + '}';
    }
    
}
