package aluno;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author adrian
 */
public class Aluno extends JFrame{
    
       // Atributos encapsulados
    private String nome;
    private double nota1;
    private double nota2;


    // Método para calcular a média das notas
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    // Método para verificar se o aluno foi aprovado
    public boolean verificarAprovacao() {
        return calcularMedia() >= 6.0;
    }

    // Método para exibir informações do aluno
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + calcularMedia());
        System.out.println("Situação: " + (verificarAprovacao() ? "Aprovado" : "Reprovado"));
    }

    
   private JTextField nomeField, nota1Field, nota2Field;

    public Aluno() {
        setTitle("Cadastro de Aluno");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 2));

        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField();

        JLabel nota1Label = new JLabel("Nota 1:");
        nota1Field = new JTextField();

        JLabel nota2Label = new JLabel("Nota 2:");
        nota2Field = new JTextField();

        JButton calcularButton = new JButton("Calcular");

        panel.add(nomeLabel);
        panel.add(nomeField);
        panel.add(nota1Label);
        panel.add(nota1Field);
        panel.add(nota2Label);
        panel.add(nota2Field);
        panel.add(calcularButton);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularResultado();
            }
        });

        getContentPane().add(panel);

        setSize(480, 280);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void calcularResultado() {
        Aluno aluno = new Aluno();
        aluno.setNome(nomeField.getText());
     
        try {
            aluno.setNota1(Double.parseDouble(nota1Field.getText()));
            aluno.setNota2(Double.parseDouble(nota2Field.getText()));

            // Criação da segunda janela
            JFrame resultadoFrame = new JFrame("Resultado");
            resultadoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            JPanel resultadoPanel = new JPanel(new GridLayout(3, 1));

            JLabel mediaLabel = new JLabel("Média: " + aluno.calcularMedia());

            JLabel situacaoLabel = new JLabel("Situação:");
         
            Color cor;

            if (aluno.verificarAprovacao()) {
                situacaoLabel.setText("Situação: Aprovado");
                situacaoLabel.setForeground(Color.GREEN);
            } else if (aluno.calcularMedia() < 4.0) {
                situacaoLabel.setText("Situação: Reprovado");
                situacaoLabel.setForeground(Color.RED);

            } else {
                situacaoLabel.setText("Situação: Em recuperação");
                situacaoLabel.setForeground(Color.YELLOW);
                
            }
            
            resultadoPanel.add(mediaLabel);
            resultadoPanel.add(situacaoLabel);

            resultadoFrame.getContentPane().add(resultadoPanel);
            resultadoFrame.setSize(400, 190);
            resultadoFrame.setLocationRelativeTo(null);
            resultadoFrame.setVisible(true);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira valores numéricos para as notas.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Métodos de acesso para os atributos encapsulados

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

}
