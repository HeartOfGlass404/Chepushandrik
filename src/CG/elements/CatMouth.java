package CG.elements;

import java.awt.*;

public class CatMouth {
    private final int x;
    private final int y;
    private final int r;
    private final int angle;
    private final int arcAng;
    private final Color c;

    public CatMouth(int x, int y, int r, int angle,int arcAng, Color c) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.angle = angle;
        this.c = c;
        this.arcAng=arcAng;
    }
    public void draw(Graphics2D g){
        g.setColor(c);
        g.setStroke(new BasicStroke(2));
        g.drawArc(x,y,r,r,angle,arcAng);
        g.rotate(180);
    }
}
