package exercíciosobreguisswing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author adrian
 */
public class Aluno extends JFrame{
    
    private String nome;
    private double nota1, nota2;
    private JButton botao00, botao01, botao02;
    private JTextField texto00,texto01,texto02;
   
    
    
    public Aluno(){
        setTitle("Exercício sobre GUIs Swing");
        setSize(480,260);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        //Definindo um local padrão para a janela aparecer
        setLocationRelativeTo(null);

        
        //Definindo as propriedades dos Textos
        texto00 = new JTextField("Text");
        texto01 = new JTextField("Text");
        texto02 = new JTextField("Text");
        
  

        
        
        add(texto00);
        add(texto01);
        add(texto02);

        
        //Definindo as propriedades do botão
        botao00.setText("Calcular");
        botao00.setBounds(190, 150, 100, 50);
        botao00.setForeground(new Color(225,225,225));
        botao00.setBackground(new Color(28,28,28));
        
        //Adicionando uma ação ao botão
        //Obs.: Há outras formas de fazer isso
        botao00.addActionListener(
               new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JOptionPane.showMessageDialog(
                                null,
                                "Deu certo fi.",
                                "Resultado",
                                JOptionPane.WARNING_MESSAGE
                        ); //Cria uma nova janela informativa
                    }
                }
        );
        //EX.:
        botao02.addActionListener(this::acao02);
     
        //Adicionando o botão ao Frame
        add(botao00);
  
        
        
    }

    private void acao02(ActionEvent e) {
        //Criando uma ação para o botão 02...
    }
    
    
}
