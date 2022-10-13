package CG.elements;

import java.awt.*;

public class CatHead {
    private final int x;
    private final int y;
    private final int r;
    private final Color c;

    public CatHead(int x, int y, int r, Color c) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.c= c;
    }

    public void draw(Graphics2D g){
        g.setColor(c);
        g.fillOval(x - r, y - r, r +80, r + r);

    }
}
