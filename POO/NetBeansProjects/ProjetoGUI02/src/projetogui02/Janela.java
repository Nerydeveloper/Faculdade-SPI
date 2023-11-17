package projetogui02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Janela extends JFrame{
    private JButton myButton;
    
    public Janela(){
        super("Tratamento de eventos");
        setLayout(new FlowLayout());
        
        myButton = new JButton("OK");
        myButton.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JOptionPane.showMessageDialog(
                                rootPane, "Fui clicado!");
                    }
                }
        );
        add(myButton);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }
}
