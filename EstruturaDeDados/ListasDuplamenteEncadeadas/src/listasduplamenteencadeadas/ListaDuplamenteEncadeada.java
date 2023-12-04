package listasduplamenteencadeadas;

/**
 *
 * @author adrian
 */
public class ListaDuplamenteEncadeada<T> {
    private No<T> primeiro;
    private No<T> ultimo;
    
    public ListaDuplamenteEncadeada(){
        this.primeiro = null;
        this.ultimo = null;
    }
    
    public boolean estaVazia(){ 
        return primeiro == null; //se o primeiro for igual a null retorna True
    }
    
    public void adicionarNoInicio(T elemento){ 
        No<T> novoNo = new No<>(elemento);
        if (estaVazia()) {
            primeiro = novoNo;
            ultimo = novoNo;
        }else{ 
            novoNo.proximo = primeiro; // potando a referencia do primeiro para o novo no
            primeiro.anterior = novoNo; // Apontando a referencia do novo no para o antigo primeiro no
            primeiro = novoNo; // alocando o novo no para o inicio
        }
    }
        public void adicionarNoFim(T elemento) {
        No<T> novoNo = new No<>(elemento);
        if (estaVazia()) {
            primeiro = novoNo;
            ultimo = novoNo;
        } else {
            novoNo.anterior = ultimo;
            ultimo.proximo = novoNo;
            ultimo = novoNo;
        }
    }
        
    public void exibirLista() {
        if (estaVazia()) {
            System.out.println("A lista está vazia.");
        } else {
            No<T> atual = primeiro;
            System.out.print("Lista: ");
            while (atual != null) {
                System.out.print(atual.dado + " ");
                atual = atual.proximo;
            }
            System.out.println();
        }
    }
    
}
