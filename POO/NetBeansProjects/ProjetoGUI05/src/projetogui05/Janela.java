package projetogui05;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Janela extends JFrame{
    private JLabel labNota1, labNota2;
    private JTextField tefNota1, tefNota2;
    private JButton butOk;
    private JPanel painelBorder, painelGrid, painelFlow;
    
    public Janela(){
        super("Exemplo de GridLayout");
        setLayout(new FlowLayout());
        
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
    
}
