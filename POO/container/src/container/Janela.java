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
/**
 * setLayout(new FlowLayout());
        
        painelGrid = new JPanel(new GridLayout(2, 2));
        labNota1 = new JLabel("Nota 1:");
        painelGrid.add(labNota1);
        tefNota1 = new JTextField(10);
        painelGrid.add(tefNota1);
        labNota2 = new JLabel("Nota 2:");
        painelGrid.add(labNota2);
        tefNota2 = new JTextField(10);
        painelGrid.add(tefNota2);
        
        painelFlow = new JPanel(new FlowLayout());        
        butOk = new JButton("Ok");
        butOk.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        String snota1 = tefNota1.getText();
                        String snota2 = tefNota2.getText();
                        double nota1 = Double.parseDouble(snota1);
                        double nota2 = Double.parseDouble(snota2);
                        double media = (nota1 + nota2) / 2;
                        
                        JOptionPane.showMessageDialog(rootPane,
                                "Sua média foi " + media, 
                                "Resultado", 
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                }
        );
        painelFlow.add(butOk);
        
        painelBorder = new JPanel(new BorderLayout());
        painelBorder.add(painelGrid, BorderLayout.CENTER);
        painelBorder.add(painelFlow, BorderLayout.SOUTH);
        
        add(painelBorder);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,100);
        setResizable(false);
        setVisible(true);
    }
 */