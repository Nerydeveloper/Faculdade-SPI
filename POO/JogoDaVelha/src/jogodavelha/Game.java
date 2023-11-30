package jogodavelha;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author adrian
 */
public class Game extends JFrame{


    private JLabel wordLabel;
    private JLabel statusLabel;
    private JTextField letterTextField;
    private JButton submitButton;
    private DrawingPanel drawingPanel;

    // Adicione mais variáveis conforme necessário

    public Game() {
        super("Hangman Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 400);
        setLocationRelativeTo(null);

        wordLabel = new JLabel("Word: ______"); // Substitua ______ pela palavra atual
        statusLabel = new JLabel("Status: ");
        letterTextField = new JTextField(10);
        submitButton = new JButton("Submit");

        // Inicialização do painel de desenho
        drawingPanel = new DrawingPanel();

        // Layout
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Enter a letter: "));
        inputPanel.add(letterTextField);
        inputPanel.add(submitButton);

        add(wordLabel, BorderLayout.NORTH);
        add(statusLabel, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.SOUTH);
        add(drawingPanel, BorderLayout.EAST);

        // Adicione a lógica do botão
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Adicione a lógica de processamento da letra submetida
                String letter = letterTextField.getText().toUpperCase();
                // Chame um método no jogo para processar a letra
                // Atualize as JLabels conforme necessário
                // Atualize o desenho no painel de desenho
            }
        });
    }

    // Painel para desenhar a forca e as partes do corpo
    private class DrawingPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            // Adicione a lógica para desenhar a forca e as partes do corpo aqui
            // Use as coordenadas e métodos de desenho que você definiu na interface Drawable
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Game().setVisible(true);
            }
        });
    }
}

