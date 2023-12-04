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

    void drawHead(Graphics x, Graphics y, Graphics x1, Graphics y1);

    void drawTronco(Graphics x, Graphics y, Graphics x1, Graphics y1);

    void drawCorpo(Graphics x, Graphics y, Graphics x1, Graphics y1);

    void drawPernaDireita(Graphics x, Graphics y, Graphics x1, Graphics y1);

    void drawPernaEsquerda(Graphics x, Graphics y, Graphics x1, Graphics y1);

    void drawBracoDireito(Graphics x, Graphics y, Graphics x1, Graphics y1);

    void drawBracoEsquerda(Graphics x, Graphics y, Graphics x1, Graphics y1);

}

