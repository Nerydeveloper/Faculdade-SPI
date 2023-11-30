package filadinamica;

/**
 *
 * @author adrian
 */
public class FilaDinamica {
    private No inicio;
    private No fim;

    public FilaDinamica() {
        this.inicio = null;
        this.fim = null;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public void enfileirar(int elemento) {
        No novoNo = new No(elemento);

        if (estaVazia()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            fim = novoNo;
        }

        System.out.println("Enfileirado: " + elemento);
    }

    public void desenfileirar() {
        if (estaVazia()) {
            System.out.println("A fila está vazia. Não é possível desenfileirar.");
        } else {
            int elementoRemovido = inicio.valor;
            inicio = inicio.proximo;

            System.out.println("Desenfileirado: " + elementoRemovido);

            if (inicio == null) {
                // Se o início for null, a fila ficou vazia
                fim = null;
            }
        }
    }

    public int primeiroElemento() {
        if (estaVazia()) {
            System.out.println("A fila está vazia. Não há primeiro elemento.");
            return -1; // Poderia ser lançada uma exceção em uma implementação mais robusta.
        } else {
            return inicio.valor;
        }
    }

   
}