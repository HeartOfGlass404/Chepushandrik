package CG.elements;

import java.awt.*;

public class CatMouth {
    private final int x;
    private final int y;
    private final int r;

    private final Color c;

    public CatMouth(int x, int y, int r, Color c) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.c = c;
    }
    public void draw(Graphics2D g){
        g.setColor(c);
        g.setStroke(new BasicStroke(2));
        g.drawArc(x,y,r,r,0,-90);
        g.drawArc(x+20,y,r,r,270,-90);
    }
}
