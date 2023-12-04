package filaduplamenteencadeada;

/**
 *
 * @author adrian
 */
public class FilaDuplamenteEncadeada<T> {
    private NoFila<T> frente;
    private NoFila<T> fim;

    public FilaDuplamenteEncadeada() {
        this.frente = null;
        this.fim = null;
    }

    public boolean estaVazia() {
        return frente == null;
    }

    public void enfileirar(T elemento) {
        NoFila<T> novoNo = new NoFila<>(elemento);
        if (estaVazia()) {
            frente = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
    }

    public T desenfileirar() {
        if (estaVazia()) {
            System.out.println("A fila está vazia. Não é possível desenfileirar.");
            return null; // Valor de retorno indicando erro
        } else {
            T elementoRemovido = frente.dado;
            frente = frente.proximo;

            // Se a fila ficou vazia após a remoção
            if (frente == null) {
                fim = null;
            } else {
                frente.anterior = null;
            }

            return elementoRemovido;
        }
    }

    public T consultarFrente() {
        if (estaVazia()) {
            System.out.println("A fila está vazia. Não há elemento na frente.");
            return null; // Valor de retorno indicando erro
        } else {
            return frente.dado;
        }
    }

    public void exibirFila() {
        if (estaVazia()) {
            System.out.println("A fila está vazia.");
        } else {
            NoFila<T> atual = frente;
            System.out.print("Fila: ");
            while (atual != null) {
                System.out.print(atual.dado + " ");
                atual = atual.proximo;
            }
            System.out.println();
        }
    }

   
}