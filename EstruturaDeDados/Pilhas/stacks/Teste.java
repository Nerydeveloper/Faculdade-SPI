package Pilhas.stacks;

/**
 *
 * @author adrian
 */
public class Teste {
      public static void main(String[] args) {
        PilhaStacks pilha = new PilhaStacks(5);

        pilha.empilhar(1);
        pilha.empilhar(2);
        pilha.empilhar(3);

        System.out.println("Topo da pilha: " + pilha.topo());

        System.out.println("Desempilhando elementos:");
        while (!pilha.estaVazia()) {
            System.out.println(pilha.desempilhar());
        }
    }
    
}
