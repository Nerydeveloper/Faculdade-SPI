package jogodavelha;

/**
 *
 * @author adrian
 * Classe Player: Mantém informações sobre o jogador, como nome e pontuação.
 */
public class Player {
    private String nome;
    private int pontuacao;
    
    public Player(String nome){
        this.nome = nome;
        this.pontuacao = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    
    
}
