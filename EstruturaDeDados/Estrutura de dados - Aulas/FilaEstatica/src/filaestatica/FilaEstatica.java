package filaestatica;

/**
 *
 * @author adrian
 */
public class FilaEstatica {
    private static final int TAMANHO_MAXIMO = 5;
    private int[] fila;
    private int tamanho;
    private int inicio;
    private int fim;

    public FilaEstatica() {
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

    public void desenfileirar() {
        if (estaVazia()) {
            System.out.println("A fila está vazia. Não é possível desenfileirar.");
        } else {
            int elementoRemovido = fila[inicio];
            inicio = (inicio + 1) % TAMANHO_MAXIMO;
            tamanho--;
            System.out.println("Desenfileirado: " + elementoRemovido);
        }
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


}
