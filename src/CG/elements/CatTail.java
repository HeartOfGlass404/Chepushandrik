package CG.elements;

import java.awt.*;

public class CatTail {
    int x1,x2,y1,y2;
    public double angle;

    public CatTail(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;

    }
    public void draw(Graphics2D g) {
        g.setColor(Color.DARK_GRAY);
        g.setStroke(new BasicStroke(10));
        g.drawLine(x1,y1,x2,y2);
        g.drawOval(x2,y2-5,5,5);

    }
}
