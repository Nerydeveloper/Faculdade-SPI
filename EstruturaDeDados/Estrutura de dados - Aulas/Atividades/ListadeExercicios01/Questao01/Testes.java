package Atividades.ListadeExercicios01.Questao01;

/**
 *
 * @author adrian
 */
public class Testes {
   
    public static void main(String[] args) {
        Lista list = new Lista();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Lista original:");
        list.printList();

        int elementToRemove = 3;
        list.remove(elementToRemove);

        System.out.println("Lista após a remoção do elemento " + elementToRemove + ":");
        list.printList();
        
        
   
    }
    
}
