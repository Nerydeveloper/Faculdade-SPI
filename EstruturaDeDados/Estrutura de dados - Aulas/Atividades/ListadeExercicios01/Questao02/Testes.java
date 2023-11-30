package Atividades.ListadeExercicios01.Questao02;

/**
 *
 * @author adrian
 */
public class Testes {
     public static void main(String[] args) {
        Lista<Integer> list = new Lista<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);        
        list.add(24);
        list.add(43);
        list.add(123);
        list.add(321);
        list.add(10);


        System.out.println("Lista original:");
        list.printList();

        int position = 3; // Defina a posição do nó que deseja remover
        Integer removedData = list.removeNodeAtPosition(position);

        System.out.println("Informações removidas: " + removedData);
        System.out.println("Lista resultante:");
        list.printList();
    }
    
}
