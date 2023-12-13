package pilhasimplesmenteencadeada;

/**
 *
 * @author adrian
 */
public class PilhaEncadeada {
    private No topo;

    public PilhaEncadeada() {
        this.topo = null; // Inicialmente, a pilha está vazia
    }

    public void push(int valor) {
        No novoNo = new No(valor);
        novoNo.setProximo(topo);
        topo = novoNo;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Erro: Pilha vazia. Não é possível remover elementos.");
            return -1; // Valor de erro, pois a pilha está vazia
        }

        int valorRemovido = topo.getValor();
        topo = topo.getProximo();
        return valorRemovido;
    }
    //exibir topo
    public int peek() {
        if (isEmpty()) {
            System.out.println("Erro: Pilha vazia. Não há elementos para visualizar.");
            return -1; // Valor de erro, pois a pilha está vazia
        }

        return topo.getValor();
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public void exibirPilha() {
        if (isEmpty()) {
            System.out.println("Pilha vazia.");
            return;
        }

        No atual = topo;
        System.out.print("Pilha: ");
        while (atual != null) {
            System.out.print(atual.getValor() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }

    public int tamanho() {
        int tamanho = 0;
        No atual = topo;
        while (atual != null) {
            tamanho++;
            atual = atual.getProximo();
        }
        return tamanho;
    }
}
