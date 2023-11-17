package layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author adrian
 */
public class LayoutFlow extends JFrame {

    JButton btn00= new JButton();
    JButton btn01= new JButton();
    JButton btn02 = new JButton();

    public LayoutFlow() {

        setLayout(new FlowLayout());

        btn00.setText("00");
        btn01.setText("01");
        btn02.setText("02");
        add(btn00);
        add(btn01);
        add(btn02);

        setTitle("FlowLayout");
        setSize(480, 280);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
