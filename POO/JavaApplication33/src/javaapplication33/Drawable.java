package javaapplication33;

/**
 *
 * @author adrian
 */
import java.awt.*;

// Interface para representar diferentes estados do desenho da forca
interface Drawable {
    void draw(Graphics g);
}

// Implementação da interface para representar o desenho inicial
class InitialDrawing implements Drawable {
    @Override
    public void draw(Graphics g) {
        // Desenhar a base da forca
        g.drawLine(50, 150, 150, 150); // base
        g.drawLine(100, 150, 100, 50); // poste
        g.drawLine(100, 50, 150, 50);  // trave horizontal superior
    }
}

// Implementação da interface para representar o desenho da cabeça
class HeadDrawing implements Drawable {
    @Override
    public void draw(Graphics g) {
        // Desenhar a cabeça
        g.drawOval(135, 50, 30, 30);
    }
}

// Implementação da interface para representar o desenho do tronco
class BodyDrawing implements Drawable {
    @Override
    public void draw(Graphics g) {
        // Desenhar o tronco
        g.drawLine(150, 80, 150, 120);
    }
}

// Implementação da interface para representar o desenho dos braços
class ArmsDrawing implements Drawable {
    @Override
    public void draw(Graphics g) {
        // Desenhar os braços
        g.drawLine(150, 90, 130, 100); // braço esquerdo
        g.drawLine(150, 90, 170, 100); // braço direito
    }
}

// Implementação da interface para representar o desenho das pernas
class LegsDrawing implements Drawable {
    @Override
    public void draw(Graphics g) {
        // Desenhar as pernas
        g.drawLine(150, 120, 130, 130); // perna esquerda
        g.drawLine(150, 120, 170, 130); // perna direita
    }
}
