package filasencadeadas;

/**
 *
 * @author adrian
 */
public class FilaEncadeada {
    private No inicio;
    private No fim;

    public FilaEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public void enfileirar(int dado) {
        No novoNo = new No(dado);

        if (estaVazia()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.setProximo(novoNo);
            fim = novoNo;
        }
    }

    public int desenfileirar() {
        if (estaVazia()) {
            throw new IllegalStateException("A fila está vazia");
        }

        int dadoRemovido = inicio.getDado();
        inicio = inicio.getProximo();

        if (inicio == null) {
            fim = null;
        }

        return dadoRemovido;
    }

    public int primeiroElemento() {
        if (estaVazia()) {
            throw new IllegalStateException("A fila está vazia");
        }

        return inicio.getDado();
    }
}