package javaapplication33;

/**
 *
 * @author adrian
 */
// Classe Player para manter informações sobre o jogador
public class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void incrementScore() {
        score++;
    }

    // Outros métodos podem ser adicionados conforme necessário
}
