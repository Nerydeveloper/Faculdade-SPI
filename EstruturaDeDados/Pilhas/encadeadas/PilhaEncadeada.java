package Pilhas.encadeadas;

/**
 *
 * @author adrian
 */
public class PilhaEncadeada {
    private No topo;

    public PilhaEncadeada() {
        topo = null;
    }

    public boolean estaVazia() {
        return topo == null;
    }

    public void empilhar(int valor) {
        No novoNo = new No(valor);
        if (estaVazia()) {
            topo = novoNo;
        } else {
            novoNo.setProximo(topo);
            topo = novoNo;
        }
    }

    public int desempilhar() {
        if (estaVazia()) {
            System.out.println("A pilha está vazia. Não é possível desempilhar.");
            return -1; // Valor padrão para indicar erro
        } else {
            int valorDesempilhado = topo.getDado();
            topo = topo.getProximo();
            return valorDesempilhado;
        }
    }

    public int topo() {
        if (estaVazia()) {
            System.out.println("A pilha está vazia. Não há topo.");
            return -1; // Valor padrão para indicar erro
        } else {
            return topo.getDado();
        }
    }
}