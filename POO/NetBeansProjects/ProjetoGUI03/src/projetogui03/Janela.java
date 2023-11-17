package projetogui03;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame{
    private String nomes[] = {"jan","fev","mar","abr","mai","jun",
        "jul","ago","set","out","nov","dez"};
    private JButton botoes[] = new JButton[nomes.length];
    
    public Janela(){
        super("Exemplo FlowLayout");
        setLayout(new FlowLayout());
        
        for(int i = 0; i < botoes.length; i++){
            botoes[i] = new JButton(nomes[i]);
            add(botoes[i]);
        }
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }
}
