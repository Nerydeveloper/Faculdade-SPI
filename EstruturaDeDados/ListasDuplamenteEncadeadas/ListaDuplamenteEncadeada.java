package ListasDuplamenteEncadeadas;

/**
 *
 * @author adrian
 */
public class ListaDuplamenteEncadeada  {
    private Node head;
    private Node tail;

    public ListaDuplamenteEncadeada() {
        this.head = null;
        this.tail = null;
    }

    // Adicionar no início da lista
    public void adicionarNoInicio(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Adicionar em qualquer posição da lista
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
            newNode.prev = current;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
            if (current == tail) {
                tail = newNode;
            }
        }
    }

    // Adicionar no fim da lista
    public void adicionarNoFim(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }
    
    
      // Remoção no início da lista
    public void removerNoInicio() {
        if (head != null) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
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

        while (current != null && contador < posicao) {
            current = current.next;
            contador++;
        }

        if (current == null) {
            System.out.println("Posição " + posicao + " não encontrada na lista.");
            return;
        }

        if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    // Remoção no fim da lista
    public void removerNoFim() {
        if (tail != null) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
        }
    }
    
    
    // Remoção por valor
    public void removerPorValor(int valor) {
        Node current = head;

        while (current != null) {
            if (current.data == valor) {
                if (current == head) {
                    removerNoInicio();
                } else if (current == tail) {
                    removerNoFim();
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                return; // Valor encontrado e removido
            }
            current = current.next;
        }

        System.out.println("Valor " + valor + " não encontrado na lista.");
    }

    
    
    // Método para exibir a lista da esquerda para a direita
    public void exibirLista() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
}
