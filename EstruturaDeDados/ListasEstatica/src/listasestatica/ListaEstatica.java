package listasestatica;

/**
 *
 * @author adrian
 */
public class ListaEstatica<T> {
    private Object[] elementos;
    private int tamanho;
    private static final int CAPACIDADE_PADRAO = 10;

    public ListaEstatica() {
        this.elementos = new Object[CAPACIDADE_PADRAO];
        this.tamanho = 0;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public boolean estaCheia() {
        return tamanho == elementos.length;
    }

    public int tamanho() {
        return tamanho;
    }

    public void adicionar(T elemento) {
        if (estaCheia()) {
            System.out.println("A lista está cheia. Não é possível adicionar mais elementos.");
            return;
        }

        elementos[tamanho] = elemento;
        tamanho++;
    }

    public T obter(int indice) {
        if (indice < 0 || indice >= tamanho) {
            System.out.println("Índice inválido.");
            return null;
        }

        return (T) elementos[indice];
    }

    public void exibirLista() {
        if (estaVazia()) {
            System.out.println("A lista está vazia.");
        } else {
            System.out.print("Lista: ");
            for (int i = 0; i < tamanho; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }

  
}
