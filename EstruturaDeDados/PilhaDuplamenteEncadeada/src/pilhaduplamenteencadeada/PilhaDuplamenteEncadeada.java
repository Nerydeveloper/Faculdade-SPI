package pilhaduplamenteencadeada;

/**
 *
 * @author adrian
 */
public class PilhaDuplamenteEncadeada {

    private NoDuplo topo;

    public PilhaDuplamenteEncadeada() {
        this.topo = null; // Inicialmente, a pilha está vazia
    }

    public void push(int valor) {
        NoDuplo novoNo = new NoDuplo(valor);
        novoNo.setProximo(topo);
        if (topo != null) {
            topo.setAnterior(novoNo);
        }
        topo = novoNo;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Erro: Pilha vazia. Não é possível remover elementos.");
            return -1; // Valor de erro, pois a pilha está vazia
        }

        int valorRemovido = topo.getValor();
        topo = topo.getProximo();

        if (topo != null) {
            topo.setAnterior(null);
        }

        return valorRemovido;
    }

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
    
    /*
    * Dado uma pilha que armazene números, escreva um método para ordenar os valores da pilha em ordem crescente.
    */
    public PilhaDuplamenteEncadeada ordenarPilha(PilhaDuplamenteEncadeada pilha) {
        PilhaDuplamenteEncadeada pilhaOrdenada = new PilhaDuplamenteEncadeada();

        while (!pilha.isEmpty()) {
            int temp = pilha.pop();

            // Desempilha elementos maiores da pilha ordenada
            while (!pilhaOrdenada.isEmpty() && temp > pilhaOrdenada.peek()) {
                pilha.push(pilhaOrdenada.pop());
            }

            // Empilha o elemento temporário na pilha ordenada
            pilhaOrdenada.push(temp);
        }

        return pilhaOrdenada;
    }
    
     public void inverterPilha() {
        NoDuplo atual = topo;
        NoDuplo temp;

        while (atual != null) {
            // Trocar as referências próximo e anterior
            temp = atual.getProximo();
            atual.setProximo(atual.getAnterior());
            atual.setAnterior(temp);

            // Mover para o próximo nó
            atual = temp;
        }

        // Atualizar o topo para o último nó (que se tornou o primeiro após a inversão)
        topo = topo.getAnterior();
    }
}
