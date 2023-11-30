package pilhaencadeada;

/**
 *
 * @author adrian
 */
public class Run {
public static void main(String[] args) {
        PilhaEncadeada minhaPilha = new PilhaEncadeada();

        System.out.println("Está vazia? " + minhaPilha.estaVazia());

        minhaPilha.empilhar(10);
        minhaPilha.empilhar(20);
        minhaPilha.empilhar(30);

        System.out.println("Topo da pilha: " + minhaPilha.topoElemento());

        minhaPilha.desempilhar();
        minhaPilha.desempilhar();
        minhaPilha.desempilhar();

        System.out.println("Está vazia? " + minhaPilha.estaVazia());
    }
    
}
