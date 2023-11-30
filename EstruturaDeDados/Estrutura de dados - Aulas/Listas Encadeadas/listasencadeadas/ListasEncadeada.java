package com.mycompany.listasencadeadas;

/**
 *
 * @author Adrian Nery Me siga no github https://github.com/Nerydeveloper
 */
public class ListasEncadeada {

    private No inicio;
    private No fim;
    private int totalDeElementos;

    private No pegaNo(int posicao) {

        if (!this.posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posição incválida");

        }
        No atual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    public Object pega(int posicao) {
        return this.pegaNo(posicao).getElemento();
    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;
    }

    public void adicionaNoInicio(Object elemento) {
        No novo = new No(elemento, this.inicio);
        this.inicio = novo;
        if (this.totalDeElementos == 0) {
            this.fim = novo;
        }
        this.totalDeElementos++;

    }

    public void adicionaNoFinal(Object elemento) {
        if (this.totalDeElementos == 0) {
            this.adicionaNoInicio(elemento);
        } else {
            No novo = new No(elemento);
            this.fim.setProximo(novo);
            this.fim = novo;
            this.totalDeElementos++;
        }
    }

    public void adiciona(int posicao, Object elemento) {
        if (posicao == 0) {
            this.adicionaNoInicio(elemento);

        } else if (posicao == this.totalDeElementos) {
            this.adicionaNoFinal(elemento);
        } else {
            No anterior = this.pegaNo(posicao - 1);
            No atual = anterior.getProximo();
            No novo = new No(elemento, atual);
            anterior.setProximo(novo);
            this.totalDeElementos++;
        }
    }

    public void removeDoinicio(){
        if(this.totalDeElementos > 0){
            this.inicio = this.inicio.getProximo();
            this.totalDeElementos--;
        }
        if(this.totalDeElementos == 0){
            this.fim = null;
        }
    }
    public void removeDoFinal(){
        if(this.totalDeElementos == 0 ){
            System.out.println("Lista vazia");
        }else if(this.totalDeElementos == 1){
            this.removeDoinicio();
        }else{
            No penutimoElemento = this.pegaNo(totalDeElementos-2);
            penutimoElemento.setProximo(null);
            this.fim = penutimoElemento;
            this.totalDeElementos--;
        }
    }
    public boolean removeDeQualquerPosicao(int posicao){ 
        if(this.posicaoValida(posicao)){ 
            if(posicao == 0 ){
                this.removeDoinicio();
            }else if(posicao == this.totalDeElementos-1){
                this.removeDoFinal();
            }else{
                No anterior = this.pegaNo(posicao-1);
                No atual = anterior.getProximo();
                No proximo = atual.getProximo();
                anterior.setProximo(proximo);
                this.totalDeElementos--;
            }
            return true;
            
        }
     
        return false;
    }
    
    public boolean contem(Object elemento){ 
        No atual = this.inicio;
        for(int i = 0; i <= this.totalDeElementos; i++){
            if(atual.getElemento().equals(elemento)){ 
                No no = pegaNo(i);
                System.out.println(""+ no);
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }
    
    
    
    
    
    @Override
    public String toString() {
        return "ListaEncadeada [inicio=" + inicio.getElemento() + ", fim=" + fim.getElemento() + ", totalDeElementos=" + totalDeElementos + "]";

    }

    /**
     * @return the inicio
     */
    public No getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the fim
     */
    public No getFim() {
        return fim;
    }

    /**
     * @param fim the fim to set
     */
    public void setFim(No fim) {
        this.fim = fim;
    }

    /**
     * @return the totalDeElementos
     */
    public int getTotalDeElementos() {
        return totalDeElementos;
    }

    /**
     * @param totalDeElementos the totalDeElementos to set
     */
    public void setTotalDeElementos(int totalDeElementos) {
        this.totalDeElementos = totalDeElementos;
    }

}
