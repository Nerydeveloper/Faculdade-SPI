package ListasEstaticas;

import java.util.Arrays;

/**
 *
 * @author adrian
 */
public class Testes {
    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica(10); // Criando uma lista estática com capacidade para 10 elementos

        lista.adicionarNoFim(1);
        lista.adicionarNoFim(2);
        lista.adicionarNoFim(3);
        lista.adicionarNoFim(2);
        lista.adicionarNoFim(4);
        lista.adicionarNoFim(2);
        lista.adicionarNoFim(17);

        lista.exibirLista(); // Deve exibir: 1 -> 2 -> 3 -> 2 -> 4 -> 2 -> null

        int somaValoresIguais = lista.calcularSomaDeValoresIguais();
        System.out.println("Soma de valores iguais: " + somaValoresIguais); // Deve imprimir: 6 (2 + 2 + 2)

        int somaIndicesPares = lista.calcularSomaIndicesPares();
        System.out.println("Soma de valores em índices pares: " + somaIndicesPares); // Deve imprimir: 7 (1 + 3 + 4)
        
        int somaIndicesImpares = lista.somaIndicesImpares();

        System.out.println("Soma de valores em índices Impares: " + somaIndicesImpares); // Deve imprimir: 7 (1 + 3 + 4)
        
        System.out.println("Maior valor: " + lista.maiorValor());
        System.out.println("Menor valor: " + lista.menorValor());
        lista.removerImpares();
        lista.removerValoresPares();
        lista.exibirLista();
    }
    
}
