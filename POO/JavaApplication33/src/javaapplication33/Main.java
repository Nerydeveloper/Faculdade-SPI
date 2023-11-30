package javaapplication33;

/**
 *
 * @author adrian
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Game("Player1");

        // Simulação de algumas tentativas para teste
        game.guessLetter('a');
        game.guessLetter('z');
        game.guessLetter('o');
        game.guessLetter('j');
        game.guessLetter('v');
    }
}