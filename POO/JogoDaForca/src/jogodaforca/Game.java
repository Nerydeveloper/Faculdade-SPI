package jogodaforca;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author adrian Gerencia o estado do jogo, incluindo a palavra atual, o número
 * de tentativas restantes e a lógica para verificar as tentativas do jogador.
 */
// Classe Principal (Game)
class Game implements Drawable {

    private String currentWord;
    private StringBuilder currentGuess;
    private int remainingAttempts;
    private WordBank wordBank;
    private Player player;
    private List<GameObserver> observers;
    private int currentWordDifficulty;  // Adicionado para representar a dificuldade da palavra

    public Game(Player player) {
        this.wordBank = new WordBank();
        this.player = player;
        this.observers = new ArrayList<>();
        
        startNewGame();
        this.currentWordDifficulty = currentWord.length();
    }

    public void addObserver(GameObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        String currentState = currentGuess.toString();
        for (GameObserver observer : observers) {
            observer.onGameUpdate(currentState, remainingAttempts);
        }
    }

    private void startNewGame() {
        currentWord = wordBank.getRandomWord();
        currentGuess = new StringBuilder("_".repeat(currentWord.length()));
        remainingAttempts = 6; // Número arbitrário de tentativas

        currentWordDifficulty = currentWord.length();
        notifyObservers();
    }

    public void makeGuess(char guess) {
        boolean correctGuess = false;
        for (int i = 0; i < currentWord.length(); i++) {
            if (currentWord.charAt(i) == guess) {
                currentGuess.setCharAt(i, guess);
                correctGuess = true;
            }
        }

        if (!correctGuess) {
            remainingAttempts--;
            player.decreaseScore(1); // Penalizar por tentativa errada
        } else {
            player.increaseScore(currentWordDifficulty); // Aumentar pontuação por letra correta
        }

        notifyObservers();

        if (currentGuess.toString().equals(currentWord)) {
            player.increaseScore(currentWordDifficulty * 2); // Pontuação extra por adivinhar a palavra
            System.out.println("Parabéns! Você adivinhou a palavra: " + currentWord);
            startNewGame();
        } else if (remainingAttempts == 0) {
            System.out.println("Game Over. A palavra era: " + currentWord);
            startNewGame();
        }
    }

    @Override
    public void draw() {
        // Implemente a lógica para desenhar a forca aqui
        System.out.println("Palavra atual: " + currentGuess);
        System.out.println("Tentativas restantes: " + remainingAttempts);
    }
}
