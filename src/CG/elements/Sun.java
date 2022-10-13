package CG.elements;
import java.awt.*;

public class Sun {
    private  int x;
    private int y;
    private int r;
    private final int R;
    private int n;
    private  Color c;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getR() {
        return r;
    }

    public int getN() {
        return n;
    }

    public Color getC() {
        return c;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public Sun(int x, int y, int r, int rayLength, int n, Color c) {
        this.x = x;
        this.y = y;
        this.r = r;
        R =r + rayLength;
        this.n = n;
        this.c = c;
    }

    public void draw(Graphics2D g) {
            g.setColor(c);
            g.fillOval(x - r, y - r, r + r, r + r);
            double da = 2 * Math.PI / n;

            for (int i = 0; i < n; i++) {
                double a = da * i;
                double x1 = x + r * Math.cos(a);
                double y1 = y + r * Math.sin(a);
                double x2 = x + R * Math.cos(a);
                double y2 = y + R * Math.sin(a);
                g.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
            }
    }
}
