package filaduplamenteencadeada;

/**
 *
 * @author adrian
 */
public class Run {

 public static void main(String[] args) {
        FilaDuplamenteEncadeada<Integer> fila = new FilaDuplamenteEncadeada<>();

        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);

        fila.exibirFila(); // Saída esperada: Fila: 1 2 3

        System.out.println("Elemento removido: " + fila.desenfileirar()); // Saída esperada: Elemento removido: 1

        fila.exibirFila(); // Saída esperada: Fila: 2 3
    }
    
}
