package listasestatica;

/**
 *
 * @author adrian
 */
public class Run {
      public static void main(String[] args) {
        ListaEstatica<Integer> lista = new ListaEstatica<>();

        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(3);

        lista.exibirLista(); // Saída esperada: Lista: 1 2 3
    }
    
}
