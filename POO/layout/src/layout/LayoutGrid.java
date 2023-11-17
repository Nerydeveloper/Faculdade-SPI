package layout;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author adrian
 */
public class LayoutGrid extends JFrame{
    
    
    //Instanciando os componentes
    JButton btn00 = new JButton();
    JButton btn01 = new JButton();
    JButton btn02 = new JButton();
    JButton btn03 = new JButton();

    
    public LayoutGrid(){
        
        //Definindo um titulo para janela
        setTitle("LayoutGrid");
        
        //Setando o Layout
        setLayout(new GridLayout(2, 2)); // GridLayout com 2 linhas e 2 colunas
        
        //Setando os btns
        btn00.setText("btn00");
        btn01.setText("btn01");
        btn02.setText("btn02");
        btn03.setText("btn03");
        
        //Adicionando os btns à janela
        add(btn00);
        add(btn01);
        add(btn02);
        add(btn03);


        //Configurações básicas
        setSize(480,280);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        
    }
    
}
