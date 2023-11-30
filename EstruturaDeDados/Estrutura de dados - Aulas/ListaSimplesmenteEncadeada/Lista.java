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
class Lista {

    private Node head;

    public Lista() {
        this.head = null;
    }

    // Adição no início da lista
    public void adicionarNoInicio(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Adição no fim da lista
    public void adicionarNoFim(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Adição no meio da lista após um elemento específico
    public void adicionarNoMeio(int data, int afterValue) {
        Node newNode = new Node(data);
        Node current = head;
        while (current != null && current.data != afterValue) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Elemento " + afterValue + " não encontrado na lista.");
        } else {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Adição em qualquer posição da lista
    public void adicionarEmQualquerPosicao(int data, int posicao) {
        if (posicao < 0) {
            System.out.println("Posição inválida.");
            return;
        }

        if (posicao == 0) {
            adicionarNoInicio(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        int contador = 0;

        while (current != null && contador < posicao - 1) {
            current = current.next;
            contador++;
        }

        if (current == null) {
            System.out.println("Posição " + posicao + " não encontrada na lista.");
        } else {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Remoção por valor
    public void removerPorValor(int valor) {
        if (head == null) {
            return;
        }

        if (head.data == valor) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != valor) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Valor " + valor + " não encontrado na lista.");
        } else {
            current.next = current.next.next;
        }
    }

    // Remoção por índice
    public void removerPorIndice(int indice) {
        if (indice < 0 || head == null) {
            System.out.println("Índice inválido ou lista vazia.");
            return;
        }

        if (indice == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        int contador = 0;

        while (current != null && contador < indice - 1) {
            current = current.next;
            contador++;
        }

        if (current == null || current.next == null) {
            System.out.println("Índice " + indice + " não encontrado na lista.");
        } else {
            current.next = current.next.next;
        }
    }

    // Remoção no início da lista
    public void removerNoInicio() {
        if (head != null) {
            head = head.next;
        }
    }

    // Remoção em qualquer posição da lista
    public void removerEmQualquerPosicao(int posicao) {
        if (posicao < 0) {
            System.out.println("Posição inválida.");
            return;
        }

        if (posicao == 0) {
            removerNoInicio();
            return;
        }

        Node current = head;
        int contador = 0;

        while (current != null && contador < posicao - 1) {
            current = current.next;
            contador++;
        }

        if (current == null || current.next == null) {
            System.out.println("Posição " + posicao + " não encontrada na lista.");
        } else {
            current.next = current.next.next;
        }
    }

    // Remoção no fim da lista
    public void removerNoFim() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    // Método para calcular a soma de valores iguais
    public int calcularSomaDeValoresIguais() {
        Map<Integer, Integer> frequencia = new HashMap<>();
        int soma = 0;
        Node current = head;

        while (current != null) {
            int valor = current.data;
            frequencia.put(valor, frequencia.getOrDefault(valor, 0) + 1);
            current = current.next;
        }

        for (int valor : frequencia.keySet()) {
            int ocorrencias = frequencia.get(valor);
            if (ocorrencias > 1) {
                soma += valor * ocorrencias;
            }
        }

        return soma;
    }

    // Método para calcular a soma dos valores em índices pares (base 0)
    public int calcularSomaIndicesPares() {
        int soma = 0;
        Node current = head;
        int indice = 0;

        while (current != null) {
            if (indice % 2 == 0) { // Verifica se o índice é par
                soma += current.data;
            }
            current = current.next;
            indice++;
        }

        return soma;
    }

    // Método para exibir a lista
    public void exibirLista() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
