package CG.elements;

import java.awt.*;

public class CatEye {
    private final int x;
    private final int y;
    private final int r;
    private final Color c;

    public CatEye(int x, int y, int r, Color c) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.c= c;
    }

    public void draw(Graphics2D g){
        g.setColor(c);
        g.fillOval(x - r, y - r, r + 35, r + r);
        g.fillOval(x - r+50, y - r, r + 35, r + r);

    }
}
