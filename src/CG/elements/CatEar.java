package CG.elements;

import java.awt.*;

public class CatEar {
     private final int x1;
     private final int x2;
     private final int x3;
     private final int y1;
     private final int y2;
     private final int y3;
     private final Color c;

     public CatEar(int x1, int x2,int x3, int y1, int y2, int y3, Color c) {
          this.x1 = x1;
          this.x2 = x2;
          this.x3= x3;
          this.y1 = y1;
          this.y2 = y2;
          this.y3=y3;
          this.c = c;
     }

     public void draw(Graphics2D g){
          g.setColor(c);
          g.fillPolygon(new int [] {x1, x2, x3}, new int [] {y1, y2, y3}, 3);
          g.fillPolygon(new int [] {x1+130, x2+110, x3+70}, new int [] {y1, y2, y3}, 3);
     }
}
