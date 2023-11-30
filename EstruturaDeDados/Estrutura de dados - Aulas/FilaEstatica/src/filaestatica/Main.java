package filaestatica;

/**
 *
 * @author Adrian
 */
public class Main {

       public static void main(String[] args) {
        FilaEstatica minhaFila = new FilaEstatica();

        System.out.println("Está vazia? " + minhaFila.estaVazia());
        System.out.println("Está cheia? " + minhaFila.estaCheia());

        minhaFila.enfileirar(10);
        minhaFila.enfileirar(20);
        minhaFila.enfileirar(30);

        System.out.println("Primeiro elemento: " + minhaFila.primeiroElemento());
        System.out.println("Tamanho da fila: " + minhaFila.tamanho());

        minhaFila.desenfileirar();

        System.out.println("Tamanho da fila após desenfileirar: " + minhaFila.tamanho());
    }
    
}
