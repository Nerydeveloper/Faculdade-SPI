package ListasEstaticas;

import java.util.Arrays;

/**
 *
 * @author adrian Listas Estática:
 *
 * Uma lista estática, também conhecida como array, é uma estrutura de dados que
 * armazena um conjunto fixo de elementos em uma única área contígua de memória.
 * O tamanho de uma lista estática é definido no momento da criação e não pode
 * ser facilmente alterado durante a execução do programa. A inserção e a
 * remoção de elementos em uma lista estática podem ser ineficientes,
 * especialmente quando se deseja adicionar ou remover elementos no meio da
 * lista, porque pode ser necessário mover outros elementos para abrir espaço ou
 * preencher lacunas.
 */
public class ListaEstatica {

    private int[] elementos;
    private int tamanho;

    public ListaEstatica(int capacidade) {
        this.elementos = new int[capacidade];
        this.tamanho = 0;
    }

    // Método para adicionar no início da lista estática
    public void adicionarNoInicio(int valor) {
        if (tamanho < elementos.length) {
            // Desloca todos os elementos para a direita
            for (int i = tamanho - 1; i >= 0; i--) {
                elementos[i + 1] = elementos[i];
            }
            elementos[0] = valor;
            tamanho++;
        } else {
            System.out.println("Lista estática cheia. Não é possível adicionar mais elementos.");
        }
    }

    // Método para adicionar em qualquer posição da lista estática
    public void adicionarEmQualquerPosicao(int valor, int posicao) {
        if (posicao < 0 || posicao > tamanho) {
            System.out.println("Posição inválida.");
            return;
        }

        if (tamanho < elementos.length) {
            // Desloca todos os elementos à direita da posição especificada
            for (int i = tamanho - 1; i >= posicao; i--) {
                elementos[i + 1] = elementos[i];
            }
            elementos[posicao] = valor;
            tamanho++;
        } else {
            System.out.println("Lista estática cheia. Não é possível adicionar mais elementos.");
        }
    }

    // Método para adicionar no fim da lista estática
    public void adicionarNoFim(int valor) {
        if (tamanho < elementos.length) {
            elementos[tamanho] = valor;
            tamanho++;
        } else {
            System.out.println("Lista estática cheia. Não é possível adicionar mais elementos.");
        }
    }

    // Método para remover no início da lista estática
    public void removerNoInicio() {
        if (tamanho > 0) {
            // Desloca todos os elementos à esquerda
            for (int i = 0; i < tamanho - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            tamanho--;
        } else {
            System.out.println("Lista estática vazia. Não é possível remover elementos.");
        }
    }

    // Método para remover em qualquer posição da lista estática
    public void removerEmQualquerPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            System.out.println("Posição inválida.");
            return;
        }

        // Desloca todos os elementos à esquerda da posição especificada
        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
    }

    // Método para remover no fim da lista estática
    public void removerNoFim() {
        if (tamanho > 0) {
            tamanho--;
        } else {
            System.out.println("Lista estática vazia. Não é possível remover elementos.");
        }
    }

    // Método para remover por valor na lista estática
    public void removerPorValor(int valor) {
        int indice = -1;
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == valor) {
                indice = i;
                break;
            }
        }

        if (indice != -1) {
            for (int i = indice; i < tamanho - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            tamanho--;
        } else {
            System.out.println("Valor " + valor + " não encontrado na lista.");
        }
    }

    // Método para calcular a soma de valores iguais na lista estática
    public int calcularSomaDeValoresIguais() {
        int soma = 0;
        for (int i = 0; i < tamanho; i++) {
            for (int j = i + 1; j < tamanho; j++) {
                if (elementos[i] == elementos[j]) {
                    soma += elementos[i];
                }
            }
        }
        return soma;
    }

    // Método para calcular a soma de valores em índices pares na lista estática
    public int calcularSomaIndicesPares() {
        int soma = 0;
        for (int i = 0; i < tamanho; i += 2) {
            soma += elementos[i];
        }
        return soma;
    }

    // Método para calcular a soma de valores em índices pares na lista estática
    public int somaIndicesImpares() {
        int soma = 0;
        for (int i = 1; i < tamanho; i += 2) {
            soma += elementos[i];
        }
        return soma;
    }

    public int[] valoresNaoRepetidos() {
        int[] valoresNaoRepetidos = new int[tamanho];
        int contador = 0;

        for (int i = 0; i < tamanho; i++) {
            int elementoAtual = elementos[i];
            boolean repetido = false;

            // Verifica se o elemento já apareceu antes na lista
            for (int j = 0; j < i; j++) {
                if (elementos[j] == elementoAtual) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                valoresNaoRepetidos[contador] = elementoAtual;
                contador++;
            }
        }

        // Redimensiona o array para o tamanho real dos valores não repetidos
        return Arrays.copyOf(valoresNaoRepetidos, contador);
    }

    //Somar os valores não repetidos
    public int somaValoresNaoRepetidos() {
        int[] valoresNaoRepetidos = valoresNaoRepetidos();
        int soma = 0;
        for (int valor : valoresNaoRepetidos) {
            soma += valor;
        }
        return soma;
    }

    // Retornar o maior valor da lista
    public int maiorValor() {
        if (tamanho == 0) {
            System.out.println("A lista está vazia. Não há maior valor.");
            return -1; // Retorna um valor indicando que a lista está vazia
        }

        int maior = elementos[0]; // Supomos que o primeiro elemento é o maior

        for (int i = 1; i < tamanho; i++) {
            if (elementos[i] > maior) {
                maior = elementos[i];
            }
        }

        return maior;
    }

    public int menorValor() {
        if (tamanho == 0) {
            System.out.println("A lista está vazia. Não há maior valor.");
            return -1; // Retorna um valor indicando que a lista está vazia
        }

        int menor = elementos[0];

        for (int i = 1; i < tamanho; i++) {
            if (elementos[i] < menor) {
                menor = elementos[i];
            }
        }
        return menor;

    }

    public void dividirEmParesEImpares() {
        int[] pares = new int[tamanho];
        int[] impares = new int[tamanho];
        int contadorPares = 0;
        int contadorImpares = 0;

        for (int i = 0; i < tamanho; i++) {
            int elemento = elementos[i];
            if (elemento % 2 == 0) {
                pares[contadorPares] = elemento;
                contadorPares++;
            } else {
                impares[contadorImpares] = elemento;
                contadorImpares++;
            }
        }

        // Redimensiona os arrays para o tamanho real de elementos pares e ímpares
        pares = Arrays.copyOf(pares, contadorPares);
        impares = Arrays.copyOf(impares, contadorImpares);

        // Imprime as três listas
        System.out.println("Lista Original: " + Arrays.toString(elementos));
        System.out.println("Lista de Pares: " + Arrays.toString(pares));
        System.out.println("Lista de Ímpares: " + Arrays.toString(impares));
    }

    public int[] removerImpares() {
        int[] listaOriginal = Arrays.copyOf(elementos, tamanho);
        int[] listaResultante = new int[tamanho];
        int contador = 0;

        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] % 2 == 0) {
                listaResultante[contador] = elementos[i];
                contador++;
            }
        }

        listaResultante = Arrays.copyOf(listaResultante, contador);
        elementos = listaResultante;
        tamanho = contador;

        return listaOriginal;
    }

    public int[] removerValoresPares() {
        int[] listaAntesExclusao = Arrays.copyOf(elementos, tamanho); // Copia a lista original
        int novoTamanho = 0;

        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] % 2 != 0) { // Verifica se o elemento é ímpar
                elementos[novoTamanho] = elementos[i];
                novoTamanho++;
            }
        }

        tamanho = novoTamanho;
        return listaAntesExclusao; // Retorna a lista antes da exclusão dos pares
    }
    
    public static int[] somarListas(ListaEstatica lista1, ListaEstatica lista2) {
        int tamanhoResultado = Math.min(lista1.tamanho, lista2.tamanho);
        int[] resultado = new int[tamanhoResultado];

        for (int i = 0; i < tamanhoResultado; i++) {
            resultado[i] = lista1.elementos[i] + lista2.elementos[i];
        }

        return resultado;
    }
    
    public void exibir() {
        if (tamanho == 0) {
            System.out.println("A lista está vazia.");
        } else {
            System.out.print("Lista: ");
            for (int i = 0; i < tamanho; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }



    // Método para exibir a lista estática
    public void exibirLista() {
        if (tamanho == 0) {
            System.out.println("Lista estática vazia.");
            return;
        }

        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i] + " -> ");
        }
        System.out.println("null");
    }
}
