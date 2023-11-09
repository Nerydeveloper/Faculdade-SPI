package container;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author adrian
 */
public class Janela extends JFrame{
    private JButton botoes[] = new JButton[5];
    
    
    public Janela(){
        super("Aula sobre contêiners");
        setLayout(new FlowLayout());
        int i = 1;
        for(JButton b: botoes){ 
         b = new JButton("Botão " + i);
         add(b);
         i++;
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(480,280);
        setVisible(true);
    }
}
