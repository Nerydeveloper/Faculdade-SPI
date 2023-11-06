package ListaSimplesmenteEncadeada;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author adrian 
 * 
 * Lista Encadeada:
 *
 * Uma lista encadeada é uma estrutura de dados na qual os elementos (nós) são
 * organizados de forma não contígua na memória. Cada nó possui um campo de
 * dados e um ponteiro (ou referência) para o próximo nó. A lista encadeada é
 * mais flexível em relação ao tamanho, uma vez que você pode adicionar ou
 * remover elementos com facilidade, pois não há necessidade de mover outros
 * elementos para acomodar as mudanças. Existem vários tipos de listas
 * encadeadas, como simplesmente encadeadas (cada nó aponta para o próximo),
 * duplamente encadeadas (cada nó aponta para o próximo e o anterior) e
 * circulares (a última aponta para a primeira).
 */
public class ListaLigada {
    private No cabeca;
    private int totalElementos;

    public ListaLigada() {
        cabeca = null;
        totalElementos = 0; // Inicialmente, a lista está vazia.
    }

    public void adicionar(int dado) {
        No novoNo = new No(dado);

        if (cabeca == null) {
            cabeca = novoNo;
        } else {
            No atual = cabeca;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoNo);
        }

        totalElementos++; // Incrementa o total de elementos sempre que um novo nó é adicionado.
    }
        // Método para adicionar em uma posição específica
    public void adicionarEmPosicao(int dado, int posicao) {
        if (posicao < 0 || posicao > totalElementos) {
            throw new IllegalArgumentException("Posição inválida");
        }

        No novoNo = new No(dado);

        if (posicao == 0) {
            novoNo.setProximo(cabeca);
            cabeca = novoNo;
        } else {
            No anterior = obterNoNaPosicao(posicao - 1);
            novoNo.setProximo(anterior.getProximo());
            anterior.setProximo(novoNo);
        }

        totalElementos++;
    }

    // Método para adicionar no final
    public void adicionarNoFinal(int dado) {
        adicionarEmPosicao(dado, totalElementos);
    }

    // Método para remover do início
    public void removerDoInicio() {
        if (totalElementos == 0) {
            throw new IllegalStateException("A lista está vazia. Não é possível remover.");
        }

        cabeca = cabeca.getProximo();
        totalElementos--;
    }

    // Método para remover no final
    public void removerDoFinal() {
        if (totalElementos == 0) {
            throw new IllegalStateException("A lista está vazia. Não é possível remover.");
        }

        if (totalElementos == 1) {
            cabeca = null;
        } else {
            No penultimo = obterNoNaPosicao(totalElementos - 2);
            penultimo.setProximo(null);
        }

        totalElementos--;
    }

    // Método para remover em uma posição específica
    public void removerEmPosicao(int posicao) {
        if (posicao < 0 || posicao >= totalElementos) {
            throw new IllegalArgumentException("Posição inválida");
        }

        if (posicao == 0) {
            cabeca = cabeca.getProximo();
        } else {
            No anterior = obterNoNaPosicao(posicao - 1);
            anterior.setProximo(anterior.getProximo().getProximo());
        }

        totalElementos--;
    }

    // Método auxiliar para obter o nó na posição especificada
    private No obterNoNaPosicao(int posicao) {
        No atual = cabeca;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }


    
    

    public int getTotalElementos() {
        return totalElementos;
    }

    public void imprimirLista() {
        No atual = cabeca;
        while (atual != null) {
            System.out.print(atual.getDado() + " -> ");
            atual = atual.getProximo();
        }
        System.out.println("null");
    }

}
