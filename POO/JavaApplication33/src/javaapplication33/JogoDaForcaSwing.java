package javaapplication33;

/**
 *
 * @author adrian
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JogoDaForcaSwing extends JFrame {
    private String palavraSecreta;
    private char[] palavraOculta;
    private int tentativasRestantes;
    private HangmanDrawingPanel hangmanDrawingPanel;
    private JLabel palavraLabel;
    private JLabel statusLabel;

    public JogoDaForcaSwing() {
        setTitle("Jogo da Forca");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        palavraSecreta = escolherPalavra();
        palavraOculta = new char[palavraSecreta.length()];
        for (int i = 0; i < palavraOculta.length; i++) {
            palavraOculta[i] = '_';
        }

        tentativasRestantes = 6;

        hangmanDrawingPanel = new HangmanDrawingPanel();
        palavraLabel = new JLabel("Palavra: " + new String(palavraOculta));
        statusLabel = new JLabel("Tentativas restantes: " + tentativasRestantes);

        JTextField letraInput = new JTextField(1);
        JButton tentarButton = new JButton("Tentar");
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

    private String escolherPalavra() {
        String[] palavras = {"java", "python", "javascript", "html", "css", "php"};
        return palavras[(int) (Math.random() * palavras.length)];
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
            }
            reiniciarJogo();
        } else {
            atualizarInterface();
        }
    }

    private boolean verificarFimDeJogo() {
        return tentativasRestantes == 0 || new String(palavraOculta).equals(palavraSecreta);
    }

    private void reiniciarJogo() {
        palavraSecreta = escolherPalavra();
        palavraOculta = new char[palavraSecreta.length()];
        for (int i = 0; i < palavraOculta.length; i++) {
            palavraOculta[i] = '_';
        }
        tentativasRestantes = 6;
        hangmanDrawingPanel.reiniciarDesenho();
    }

    private void atualizarInterface() {
        palavraLabel.setText("Palavra: " + new String(palavraOculta));
        statusLabel.setText("Tentativas restantes: " + tentativasRestantes);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JogoDaForcaSwing().setVisible(true);
            }
        });
    }
}

class HangmanDrawingPanel extends JPanel {
    private int tentativas = 0;

    public void desenharProximaParte() {
        tentativas++;
        repaint();
    }

    public void reiniciarDesenho() {
        tentativas = 0;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (tentativas > 0) {
            // Desenhar a forca e as partes do corpo conforme as tentativas
            g.drawLine(50, 150, 150, 150); // base
            g.drawLine(100, 150, 100, 50); // poste
            g.drawLine(100, 50, 150, 50);  // trave horizontal superior

            if (tentativas >= 2) {
                g.drawOval(135, 50, 30, 30); // cabeça
            }

            if (tentativas >= 3) {
                g.drawLine(150, 80, 150, 120); // tronco
            }

            if (tentativas >= 4) {
                g.drawLine(150, 90, 130, 100); // braço esquerdo
            }

            if (tentativas >= 5) {
                g.drawLine(150, 90, 170, 100); // braço direito
            }

            if (tentativas >= 6) {
                g.drawLine(150, 120, 130, 130); // perna esquerda
            }

            if (tentativas >= 7) {
                g.drawLine(150, 120, 170, 130); // perna direita
            }
        }
    }
}
