package filaestatica;

/**
 *
 * @author adrian
 */
public class FilaEstatica {
    private int capacidade;
    private int[] elementos;
    private int tamanho;
    private int frente;
    private int fim;

    public FilaEstatica(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.tamanho = 0;
        this.frente = 0;
        this.fim = -1;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public boolean estaCheia() {
        return tamanho == capacidade;
    }

    public int tamanho() {
        return tamanho;
    }

    public void enfileirar(int elemento) {
        if (estaCheia()) {
            System.out.println("A fila está cheia. Não é possível enfileirar.");
        } else {
            fim = (fim + 1) % capacidade;
            elementos[fim] = elemento;
            tamanho++;
        }
    }

    public int desenfileirar() {
        if (estaVazia()) {
            System.out.println("A fila está vazia. Não é possível desenfileirar.");
            return -1; // Valor de retorno indicando erro
        } else {
            int elementoRemovido = elementos[frente];
            frente = (frente + 1) % capacidade;
            tamanho--;
            return elementoRemovido;
        }
    }

    public int consultarFrente() {
        if (estaVazia()) {
            System.out.println("A fila está vazia. Não há elemento na frente.");
            return -1; // Valor de retorno indicando erro
        } else {
            return elementos[frente];
        }
    }

    public void exibirFila() {
        if (estaVazia()) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.print("Fila: ");
            for (int i = 0; i < tamanho; i++) {
                int indice = (frente + i) % capacidade;
                System.out.print(elementos[indice] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FilaEstatica fila = new FilaEstatica(5);

        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);

        fila.exibirFila(); // Saída esperada: Fila: 1 2 3

        System.out.println("Elemento removido: " + fila.desenfileirar()); // Saída esperada: Elemento removido: 1

        fila.exibirFila(); // Saída esperada: Fila: 2 3
    }
}
