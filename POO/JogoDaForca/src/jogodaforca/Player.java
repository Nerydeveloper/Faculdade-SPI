package jogodaforca;

/**
 *
 * @author adrian
 * Mantém informações sobre o jogador,
 * como nome e pontuação.
 */
class Player {
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

    public void increaseScore(int points) {
        score += points;
    }
        public void decreaseScore(int points) {
        score -= points;
        if (score < 0) {
            score = 0;
        }
    }
}
// Interface GameObserver
interface GameObserver {
    void onGameUpdate(String currentState, int remainingAttempts);
}


