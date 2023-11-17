package layout;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author adrian
 * Aprendendo sobre o Fluxo do BorderLayout
 */
public class LayoutBorder extends JFrame{
    
    
    // Inicializando os componentes
    JButton botao00 = new JButton();
    JButton botao01 = new JButton();
    //Metodo construtor
    public LayoutBorder(){
        
        //Definindo um Layout, nesse caso o Border
        setLayout(new BorderLayout());
        
        //Definindo nomes para os botões
        botao00.setText("Adrian");
        botao01.setText("Anna");
        
        //Adicionando os botões a janela com o Layout Border
        add(BorderLayout.EAST,botao00);
        add(BorderLayout.NORTH,botao01);

        
        setTitle("BorderLayout");
        setSize(400,250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    };
}
