package listassimplesmenteencadeadas;

/**
 *
 * @author adrian
 */
public class Run {


    public static void main(String[] args) {
        ListaSimplesmenteEncadeada<Integer> lista = new ListaSimplesmenteEncadeada<>();

        lista.adicionarNoInicio(1);
        lista.adicionarNoInicio(2);
        lista.adicionarNoFim(3);

        lista.exibirLista(); // Saída esperada: Lista: 2 1 3
    }
    
}
