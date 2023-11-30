package javaapplication33;

/**
 *
 * @author adrian
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {
    private WordBank wordBank;
    private Player currentPlayer;
    private String palavraSecreta;
    private char[] palavraOculta;
    private int tentativasRestantes;
    private HangmanDrawingPanel hangmanDrawingPanel;
    private JLabel palavraLabel;
    private JLabel statusLabel;
    private JTextField letraInput;
    private JButton tentarButton;

    public Game(String playerName) {
        setTitle("Jogo da Forca");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new BorderLayout());

        wordBank = new WordBank();
        currentPlayer = new Player(playerName);

        novaRodada();

        hangmanDrawingPanel = new HangmanDrawingPanel();
        palavraLabel = new JLabel("Palavra: " + new String(palavraOculta));
        statusLabel = new JLabel("Tentativas restantes: " + tentativasRestantes);

        letraInput = new JTextField(1);
        tentarButton = new JButton("Tentar");
        tentarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tentarLetra(letraInput.getText().toLowerCase().charAt(0));
                letraInput.setText("");
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Digite uma letra: "));
        inputPanel.add(letraInput);
        inputPanel.add(tentarButton);

        add(hangmanDrawingPanel, BorderLayout.CENTER);
        add(palavraLabel, BorderLayout.NORTH);
        add(statusLabel, BorderLayout.SOUTH);
        add(inputPanel, BorderLayout.SOUTH);

        atualizarInterface();
    }

    private void novaRodada() {
        palavraSecreta = wordBank.getRandomWord();
        palavraOculta = new char[palavraSecreta.length()];
        for (int i = 0; i < palavraOculta.length; i++) {
            palavraOculta[i] = '_';
        }
        tentativasRestantes = 6;
    }

    private void tentarLetra(char letra) {
        boolean letraCorreta = false;

        for (int i = 0; i < palavraSecreta.length(); i++) {
            if (palavraSecreta.charAt(i) == letra) {
                palavraOculta[i] = letra;
                letraCorreta = true;
            }
        }

        if (!letraCorreta) {
            tentativasRestantes--;
            hangmanDrawingPanel.desenharProximaParte();
        }

        if (verificarFimDeJogo()) {
            if (tentativasRestantes == 0) {
                statusLabel.setText("Game Over. A palavra era: " + palavraSecreta);
            } else {
                statusLabel.setText("Parabéns! Você acertou a palavra.");
                currentPlayer.incrementScore();
            }
            novaRodada();
        } else {
            atualizarInterface();
        }
    }

    private boolean verificarFimDeJogo() {
        return tentativasRestantes == 0 || new String(palavraOculta).equals(palavraSecreta);
    }

    private void atualizarInterface() {
        palavraLabel.setText("Palavra: " + new String(palavraOculta));
        statusLabel.setText("Tentativas restantes: " + tentativasRestantes + " | Pontuação: " + currentPlayer.getScore());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Game("Player1").setVisible(true);
            }
        });
    }
}
