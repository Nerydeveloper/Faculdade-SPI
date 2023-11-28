package jogodaforca;

/**
 *
 * @author adrian
 * Mantém informações sobre o jogador,
 * como nome e pontuação.
 */
public class Player {
    private String nome;
    private double pontuacao;

    public Player(String nome, double pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }
    
    
}
