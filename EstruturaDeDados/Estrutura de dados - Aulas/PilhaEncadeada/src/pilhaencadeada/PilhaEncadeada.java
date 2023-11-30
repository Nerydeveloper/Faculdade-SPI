package pilhaencadeada;

/**
 *
 * @author adrian
 * o conceito de encadeado serve para facilitar a remoção de qualquer elemento em qualquer possição
 * o conceito de dinamico serve para facilitar a adicção e/ou remoção de elemetos 
 */
public class PilhaEncadeada {
    private No topo;
    
    public PilhaEncadeada(){ 
        this.topo = null;
    }
    
    public boolean estaVazia(){ 
        return topo == null;
    }
    
    public void empilhar(int elemento){
        No novoNo = new No(elemento); //criando um novo No
        novoNo.proximo = topo; // apontando o topo para o novoNo
        topo = novoNo; // apontando o novoNo para o topo
        System.out.println("Elemento adicionado: " + elemento);
    }
    public void desempilhar(){ 
        if (estaVazia()) {
            System.out.println("Tem mais nada aqui não fi.");
        } else {
            int elementoRemovido = topo.valor;
            topo = topo.proximo; // Aqui vai pegar o valor abaixo do topo e tornalo o novo topo da pilha apois a remoção antigo topo 
            System.out.println("Desempilhado: "+ elementoRemovido);
       
        }
    }
    public int topoElemento(){ 
        if (estaVazia()) {
            System.out.println("Tem nada aqui não. Não há topo");
            return -1;
        } else {
            return topo.valor;
        }
    }
}
