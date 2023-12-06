package pilhaduplamenteencadeada;

/**
 *
 * @author adrian
 */
public class NoDuplo {
    private int valor;
    private NoDuplo proximo;
    private NoDuplo anterior;

    public NoDuplo(int valor) {
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;
    }

    // Métodos getters e setters para acessar os atributos privados

    public int getValor() {
        return valor;
    }

    public NoDuplo getProximo() {
        return proximo;
    }

    public void setProximo(NoDuplo proximo) {
        this.proximo = proximo;
    }

    public NoDuplo getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDuplo anterior) {
        this.anterior = anterior;
    }
}