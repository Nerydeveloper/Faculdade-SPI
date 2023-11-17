package projetogui04;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame {
    private JButton botoes[] = new JButton[5];
    
    public Janela(){
        super("Exemplo de BorderLayout");
        setLayout(new BorderLayout());
        
        for(int i = 0; i < botoes.length; i++){
            botoes[i] = new JButton("Botão");
        }
        
        add(botoes[0], BorderLayout.NORTH);
        add(botoes[1], BorderLayout.SOUTH);
        add(botoes[2], BorderLayout.WEST);
        add(botoes[3], BorderLayout.EAST);
        add(botoes[4], BorderLayout.CENTER);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        setVisible(true);
    }
}
