package Pilhas.encadeadas;

/**
 *
 * @author adrian
 */
public class Teste {
    public static void main(String[] args) {
        PilhaEncadeada pilha = new PilhaEncadeada();

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
