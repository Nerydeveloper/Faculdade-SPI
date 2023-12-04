package listassimplesmenteencadeadas;

/**
 *
 * @author adrian
 */

public class ListaSimplesmenteEncadeada<T> {
    private NoLista<T> primeiro;

    public ListaSimplesmenteEncadeada() {
        this.primeiro = null;
    }

    public boolean estaVazia() {
        return primeiro == null;
    }

    public void adicionarNoInicio(T elemento) {
        NoLista<T> novoNo = new NoLista<>(elemento);
        novoNo.proximo = primeiro;
        primeiro = novoNo;
    }

    public void adicionarNoFim(T elemento) {
        NoLista<T> novoNo = new NoLista<>(elemento);
        if (estaVazia()) {
            primeiro = novoNo;
        } else {
            NoLista<T> atual = primeiro;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }

    public void exibirLista() {
        if (estaVazia()) {
            System.out.println("A lista está vazia.");
        } else {
            NoLista<T> atual = primeiro;
            System.out.print("Lista: ");
            while (atual != null) {
                System.out.print(atual.dado + " ");
                atual = atual.proximo;
            }
            System.out.println();
        }
    }


}