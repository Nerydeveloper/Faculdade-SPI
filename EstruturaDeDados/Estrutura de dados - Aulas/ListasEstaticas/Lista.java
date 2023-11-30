public class Lista{
    
    // atributos
    public int[] elementos;
    public int tamanho; // = qtdElementos
    public int capacidade; // = total do vetor

    // construtor
    public Lista(int capacidade) {
        elementos = new int[capacidade];
        tamanho = 0;
    }

    // metodos
    public Lista() {
    }

    public void adiciona(int elemento) {
        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
        } else {
            aumentaCapacidade();
            elementos[tamanho] = elemento;
        }
        tamanho++;
    }

    // aumentar (capacidade * 2) se o vetor já estiver cheio
    public void aumentaCapacidade() {
        int[] elementosNovos = new int[elementos.length * 2];
        for (int i = 0; i < elementos.length; i++) {
            elementosNovos[i] = elementos[i];
        }
        elementos = elementosNovos;
    }

    // verificar se a posiçao é válida
    public boolean verificaPosicao(int posicao) {
        if (posicao >= 0 && posicao <= capacidade) {
            return true;
        }
        return false;
    }

    //buscar a posição do elemento no vetor
    public void buscaPosicao(int posicao) {
        try {
            verificaPosicao(posicao);
            System.out.println("elemento na posicao[" + posicao + "] -> " + elementos[posicao]);
        } catch (Exception e) {
            System.out.println("posicão " +posicao+ ", inválida louco!!!");
        }
    }

    //buscar se existe o elemento no vetor
    public boolean buscaElemento(int elemento){
        for(int i = 0; i < capacidade;){
            if(elementos[i] == (elemento)){
                return true;
            }else{
                return false;
            }           
        }
        return null != null;                
    }

    //inserir em qualquer posicao do vetor]
    public void inserirPosicao(int posicao, int elemento){
        if(verificaPosicao(posicao)){
            for(int i=posicao; i < tamanho; i++){
                elementos[i+1] = elementos[i] ;
            }
            elementos[posicao] = elemento;
        }        
    }

    public int tamanho() {
        return tamanho;
    }

    public int capacidade() {
        capacidade = elementos.length;
        return capacidade;
    }

    public void imprimir() {
        System.out.println("\n== Vetor ==");
        for (int i = 0; i < elementos.length; i++) {
            System.out.println("[" + i + "] -> " + elementos[i]);
        }
        System.out.println("===========");
    }

/* questão 1 */

    public void trocaPosicoes(int elemento){
        for(int i=1; i<=20; i++){
            elementos[i] = elementos[i+19];         
            elementos[i+19] = elementos[i];
        }
    }

/* questao 2 */
    public void multiplicaIndice(Lista A, Lista B){
        Lista C = new Lista(10);
        int res;
        for(int i=0; i<=10; i++){
            res = ((int)A[i] * B[i];)
            C.adiciona(res);                        
        }
        System.out.println("=== Lista C ====");
        C.imprimir();
    }


}//fim class