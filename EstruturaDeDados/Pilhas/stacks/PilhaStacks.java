package Pilhas.stacks;

/**
 *
 * @author adrian
 */
public class PilhaStacks {
    private int tamanhoMaximo;
    private int topo;
    private int[] elementos;

    public PilhaStacks(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.topo = -1; // Inicializa o topo como -1 (indicando pilha vazia)
        this.elementos = new int[tamanhoMaximo];
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public boolean estaCheia() {
        return topo == tamanhoMaximo - 1;
    }

    public void empilhar(int valor) {
        if (estaCheia()) {
            System.out.println("A pilha está cheia. Não é possível empilhar.");
        } else {
            elementos[++topo] = valor;
        }
    }

    public int desempilhar() {
        if (estaVazia()) {
            System.out.println("A pilha está vazia. Não é possível desempilhar.");
            return -1; // Valor padrão para indicar erro
        } else {
            return elementos[topo--];
        }
    }

    public int topo() {
        if (estaVazia()) {
            System.out.println("A pilha está vazia. Não há topo.");
            return -1; // Valor padrão para indicar erro
        } else {
            return elementos[topo];
        }
    }

  
}
