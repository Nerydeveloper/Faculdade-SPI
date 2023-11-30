
package ListaSimplesmenteEncadeada;

/**
 *
 * @author adrian
 */
public class Testes {
    public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.adicionarNoInicio(1);
        lista.adicionarNoInicio(2);
        lista.adicionarNoInicio(3);

        lista.adicionarNoFim(4);
        lista.adicionarNoFim(5);

        lista.adicionarNoMeio(10, 2); // Adiciona 10 após o elemento com valor 2

        lista.exibirLista(); // Deve exibir: 3 -> 2 -> 10 -> 1 -> 4 -> 5 -> null
    }
    }
}
