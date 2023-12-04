package filaduplamenteencadeada;

/**
 *
 * @author adrian
 */
public class NoFila<T> {
    T dado;
    NoFila<T> proximo;
    NoFila<T> anterior;

    public NoFila(T dado) {
        this.dado = dado;
        this.proximo = null;
        this.anterior = null;
    }
}
