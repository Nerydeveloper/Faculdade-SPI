package layout;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author adrian Usando os 3 principais Layout ( Grid, Flow e Border )
 */
public class LayoutGlobal extends JFrame {

    private JLabel labNota1, labNota2, results;
    private JTextField tefNota1, tefNota2;
    private JButton btnCalc;
    private JPanel painelBorder, painelGrid, painelFlow, painelFlow1;

    //Metodo construtor
    public LayoutGlobal() {
        setTitle("LayoutGlobal");
        setLayout(new GridLayout(2, 1));
        painelFlow = new JPanel(new FlowLayout());
        painelFlow1 = new JPanel(new FlowLayout());
        painelBorder = new JPanel(new BorderLayout());
        painelGrid = new JPanel(new GridLayout(2, 1));

        labNota1 = new JLabel("Nota 1:");
        tefNota1 = new JTextField(10);
        labNota2 = new JLabel("Nota 2:");
        tefNota2 = new JTextField(10);

        painelFlow.add(labNota1);
        painelFlow.add(tefNota1);
        painelFlow1.add(labNota2);
        painelFlow1.add(tefNota2);

        painelGrid.add(painelFlow);
        painelGrid.add(painelFlow1);
        
        

        btnCalc = new JButton("Calcular");
 // Define as dimensões preferidas do botão
        Dimension btnSize = new Dimension(10, 30); // Ajuste conforme necessário
        btnCalc.setPreferredSize(btnSize);
        results = new JLabel("Resultado: ");
    
        //Adicionando os componentes a janela
        add(painelGrid);
        add(btnCalc);
        add(results);

        setSize(480, 280);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    //Metodos
}
