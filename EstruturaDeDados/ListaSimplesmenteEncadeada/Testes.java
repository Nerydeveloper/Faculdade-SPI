
package ListaSimplesmenteEncadeada;

/**
 *
 * @author adrian
 */
public class Testes {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(3);

        System.out.print("Lista ligada: ");
        lista.imprimirLista();

        System.out.println("Total de elementos na lista: " + lista.getTotalElementos());
        
        
        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(3);

        System.out.print("Lista ligada: ");
        lista.imprimirLista();

        System.out.println("Total de elementos na lista: " + lista.getTotalElementos());

        lista.adicionarEmPosicao(4, 1);
        lista.adicionarNoFinal(5);
        lista.removerDoInicio();
        lista.removerDoFinal();
        lista.removerEmPosicao(2);

        System.out.print("Lista ligada após modificações: ");
        lista.imprimirLista();

        System.out.println("Total de elementos na lista após modificações: " + lista.getTotalElementos());
   
    }
 
}
