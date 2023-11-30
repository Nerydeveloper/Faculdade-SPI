package jogodavelha;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author adrian Interface Drawable: Pode ser usada para representar diferentes
 * estados do desenho da forca, demonstrando polimorfismo. Devo criar os metodos
 * e atributos que terão seu uso obrigatorio em outras classes
 */
// Interface Drawable
interface Drawable {

    void draw(Graphics g);
}

private int tentativas = 0;

    public void desenharProximaParte() {
        tentativas++;
        repaint();
    }

    public void reiniciarDesenho() {
        tentativas = 0;
        repaint();
    }

    @Override
protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (tentativas > 0) {
            // Desenhar a forca e as partes do corpo conforme as tentativas
            g.drawLine(50, 150, 150, 150); // base
            g.drawLine(100, 150, 100, 50); // poste
            g.drawLine(100, 50, 150, 50);  // trave horizontal superior

            if (tentativas >= 2) {
                g.drawOval(135, 50, 30, 30); // cabeça
            }

            if (tentativas >= 3) {
                g.drawLine(150, 80, 150, 120); // tronco
            }

            if (tentativas >= 4) {
                g.drawLine(150, 90, 130, 100); // braço esquerdo
            }

            if (tentativas >= 5) {
                g.drawLine(150, 90, 170, 100); // braço direito
            }

            if (tentativas >= 6) {
                g.drawLine(150, 120, 130, 130); // perna esquerda
            }

            if (tentativas >= 7) {
                g.drawLine(150, 120, 170, 130); // perna direita
            }
        }
    }
