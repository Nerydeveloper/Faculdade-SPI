package listasduplamenteencadeadas;

/**
 *
 * @author adrian
 */
public class No<T> {
    T dado;
    No<T> proximo;
    No<T> anterior;
    
    public No(T dado){ 
        this.dado = dado;
        this.anterior = null;
        this.proximo = null;
    }

    public No(T dado, No<T> proximo, No<T> anterior) {
        this.dado = dado;
        this.proximo = proximo;
        this.anterior = anterior;
    }
    
  

    
}
