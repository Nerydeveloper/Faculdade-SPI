package projetogui01;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Janela extends JFrame {
    private JLabel meuLabel;
    
    public Janela(){
        //setTitle("Exemplo de Janela");
        super("Exemplo de Janela");
        setLayout(new FlowLayout());
        
        meuLabel = new JLabel("Meu primeiro JLabel.");
        add(meuLabel);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }
}
