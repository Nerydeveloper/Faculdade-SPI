package Atividades.ListadeExercicios01.Questao02;

/**
 *
 * @author adrian
 */
public class Node<T> {
   
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
    
}
