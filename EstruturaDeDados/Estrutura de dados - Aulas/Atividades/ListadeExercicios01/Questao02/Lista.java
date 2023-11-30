package Atividades.ListadeExercicios01.Questao02;

/**
 *
 * @author adria
 */
public class Lista<T> {
    private Node<T> head;

    public Lista() {
        head = null;
    }

    // Método para inserir um elemento no final da lista
    public void add(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Método para imprimir os elementos da lista
    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Método para encontrar o nó na posição especificada e remover
    public T removeNodeAtPosition(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("A posição deve ser maior ou igual a zero.");
        }

        if (position == 0) {
            if (head == null) {
                throw new IndexOutOfBoundsException("A lista está vazia.");
            }
            T removedData = head.data;
            head = head.next;
            return removedData;
        }

        Node<T> current = head;
        Node<T> previous = null;
        int currentPosition = 0;

        while (current != null && currentPosition < position) {
            previous = current;
            current = current.next;
            currentPosition++;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("A posição especificada não existe na lista.");
        }

        T removedData = current.data;
        previous.next = current.next;

        return removedData;
    }
}