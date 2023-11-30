package pilhaestatica;

/**
 *
 * @author adrian
 */
public class PilhaEstatica {
    private static final int TAMANHO_MAXIMO = 5;
    private int[] pilha;
    private int topo; // topo é o ultimo elemento adicionado
    
    public PilhaEstatica(){ 
        pilha = new int[TAMANHO_MAXIMO];
        topo = -1;
    }
    // VERIFICA SE ESTA VAZIA
    public boolean estaVazia(){ 
        return topo == -1;
    }
    // VERIFICA SE  ESTÁ CHEIA
    public boolean estaCheia(){ 
        return topo == TAMANHO_MAXIMO-1;
    }
    // EMPILHAR
    public void empilhar(int elemento){ 
        if (estaCheia()) {
            System.out.println("Não há mais espaço na pilha");
            
        }else{ 
            topo++;
            pilha[topo] = elemento;
            System.out.printf("Elemento `{elemento}` empilhado com sucesso!!!".formatted(elemento));
        }
    }
    // DESEMPILHAR
    public  void desempilhar(){ 
         if (estaVazia()) {
            System.out.println("A pilha está vazia.");
        }else{ 
             int elementoRemovido = pilha[topo];
            topo--;
            System.out.printf("Elemento `{elementoRemovido}` empilhado com sucesso!!!".formatted(elementoRemovido));
        }
    }
    // RETORNA O ELEMENTO TOPO DA PILHA
    public int topoElemento(){ 
        if (estaVazia()) {
            System.out.println("A pilha está vazia.");
            return -1;
        } else {
            return pilha[topo]; // topo é o ultimo elemento adicionado
        }
    }
}
