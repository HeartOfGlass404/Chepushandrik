package CG;

import CG.elements.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawPanel extends JPanel {
    Sun s1;
    CatHead head;
    CatEye eye1,eye2;
    CatPupil pup1,pup2;
    CatEar ear1,ear2;
    CatNose nose;
    CatMouth mouth1,mouth2;
    public DrawPanel() {
        s1= new Sun(20, 20,50, 90, 15, Color.ORANGE);
        head = new CatHead(300, 300,50, Color.DARK_GRAY);
        eye1= new CatEye(280,290,15, Color.WHITE);
        eye2= new CatEye(330,290,15, Color.WHITE);
        pup1= new CatPupil(290, 280, 5, Color.BLACK);
        pup2= new CatPupil(340, 280, 5, Color.BLACK);
        ear1 = new CatEar(250,260,280,300,220,270,Color.DARK_GRAY);
        ear2= new CatEar(380,370,350,300,220,270,Color.DARK_GRAY);
        nose= new CatNose(305,315,325,310,320,310,Color.RED);
        mouth1 = new CatMouth(315,320,10,0,90,Color.BLACK);
        mouth2 = new CatMouth(270,320,10,0,90,Color.BLACK);
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                s1.setX(s1.getX()+100);
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        s1.draw(g);
        head.draw(g);
        eye1.draw(g);
        eye2.draw(g);
        pup1.draw(g);
        pup2.draw(g);
        ear1.draw(g);
        ear2.draw(g);
        nose.draw(g);
        mouth1.draw(g);
        mouth2.draw(g);


    }
}
