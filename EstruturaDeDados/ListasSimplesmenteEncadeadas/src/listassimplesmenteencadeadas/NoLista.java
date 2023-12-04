package listassimplesmenteencadeadas;

/**
 *
 * @author adrian
 */
public class NoLista<T> {
    T dado;
    NoLista<T> proximo;

    public NoLista(T dado) {
        this.dado = dado;
        this.proximo = null;
    }
}