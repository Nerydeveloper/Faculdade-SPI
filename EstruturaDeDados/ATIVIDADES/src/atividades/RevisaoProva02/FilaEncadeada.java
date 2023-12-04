package atividades.RevisaoProva02;

/**
 *
 * @author adria
 */
public class FilaEncadeada {

    private No inicio;
    private No fim;
    private int totalDeElementos;

    //CRIA A FILA
    public FilaEncadeada() {
        this.inicio = null;
        this.fim = null;
        this.totalDeElementos = 0;
    }

    //ENFILEIRAR - INSERIR
    public void enqueue(int elemento) {
        No novo = new No(elemento);
        if (this.isEmpty()) {
            this.inicio = novo;
        } else {
            this.fim.setProximo(novo);
        }
        this.fim = novo;
        this.totalDeElementos++;
    }
    //DESENFILEIRAR - REMOVER

    public int dequeue() {
        if (!this.isEmpty()) {
            this.inicio = this.inicio.getProximo();
            this.totalDeElementos--;
            if (totalDeElementos == 0) {
                this.fim = null;
            }
        }
        return this.inicio.getElemento();
    }

    //VERIFICA SE É VAZIA
    public boolean isEmpty() {
        return this.totalDeElementos == 0;
    }

    //TAMANHO DA LISTA
    public int size() {
        return this.totalDeElementos;
    }

    //PRIMEIRO DA FILA
    public int front() {
        return this.inicio.getElemento();
    }

    //TOSTRING - IMPRIMIR
    @Override
    public String toString() {
        if (this.totalDeElementos == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        No atual = this.inicio;
        for (int i = 0; i < this.totalDeElementos - 1; i++) {
            builder.append(atual.getElemento());
            builder.append(", ");
            atual = atual.getProximo();
        }
        builder.append(atual.getElemento());
        builder.append("]");

        //System.out.println("Início: "+this.inicio.getElemento());
        //System.out.println("Fim: "+this.fim.getElemento());
        return builder.toString();
    }

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getFim() {
        return fim;
    }

    public void setFim(No fim) {
        this.fim = fim;
    }

    public int getTamanho() {
        return totalDeElementos;
    }

    public void setTamanho(int tamanho) {
        this.totalDeElementos = tamanho;
    }

    /**
     * 2. Escreva um algoritmo que recebe duas filas encadeadas, sendo que cada
     * uma delas contém valores numéricos ordenados. O algoritmo deverá formar
     * uma terceira fila encadeada, também ordenada, na qual estarão os valores
     * armazenados nas filas originais.
     */
    public FilaEncadeada questao02(FilaEncadeada f1, FilaEncadeada f2) {
        FilaEncadeada novaFila = new FilaEncadeada();
        while (!f1.isEmpty()&& !f2.isEmpty()) {
            if (f1.front() < f2.front()) {
                novaFila.enqueue(f1.dequeue());
            } else {
                novaFila.enqueue(f2.dequeue());
            }
        }

        // Adiciona os elementos restantes da fila1, se houver
        while (!f1.isEmpty()) {
            novaFila.enqueue(f1.dequeue());
        }

        // Adiciona os elementos restantes da fila2, se houver
        while (!f2.isEmpty()) {
            novaFila.enqueue(f2.dequeue());
        }

        return novaFila;
    }
}
