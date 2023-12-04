package jogodavelha;

import javax.swing.SwingUtilities;

/**
 *
 * @author adria
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Game jogo = new Game();
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Game().setVisible(true);
            }
        });

    }

}
