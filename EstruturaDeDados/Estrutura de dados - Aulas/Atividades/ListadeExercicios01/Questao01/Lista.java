package Atividades.ListadeExercicios01.Questao01;

/**
 *
 * @author adrian
 */
public class Lista {
    private Node head;
     Node primeiro;

    public Lista() {
        this.primeiro = null;
    }

    // Método para adicionar um elemento à lista
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Método para imprimir a lista (apenas para fins de teste)
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Método para remover um elemento da lista
    public void remove(int dataToRemove) {
        if (head == null) {
            System.out.println("A lista está vazia.");
            return;
        }

        if (head.data == dataToRemove) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != dataToRemove) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Elemento não encontrado na lista.");
        }
    }
   
}