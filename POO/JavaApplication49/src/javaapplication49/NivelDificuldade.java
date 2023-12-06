package javaapplication49;

/**
 *
 * @author adrian
 */
public enum NivelDificuldade {
    FACIL(8, 10), // Por exemplo, 8 tentativas e palavras de até 10 letras
    MEDIO(6, 12),
    DIFICIL(4, 15);

    private int numTentativas;
    private int tamanhoMaximoPalavra;

    NivelDificuldade(int numTentativas, int tamanhoMaximoPalavra) {
        this.numTentativas = numTentativas;
        this.tamanhoMaximoPalavra = tamanhoMaximoPalavra;
    }

    public int getNumTentativas() {
        return numTentativas;
    }

    public int getTamanhoMaximoPalavra() {
        return tamanhoMaximoPalavra;
    }
}
