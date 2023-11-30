package jogodaforca;

import java.util.Scanner;

/**
 *
 * @author adrian
 */
// Classe principal para teste
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName);

        Game game = new Game(player);

        // Adiciona um observador para imprimir o estado do jogo
        game.addObserver((currentState, remainingAttempts) -> {
            game.draw();
        });

        while (true) {
            System.out.print("Digite uma letra: ");
            char guess = scanner.next().charAt(0);
            game.makeGuess(guess);
        }
    }
}
