package CG;

import CG.elements.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPanel extends JPanel implements ActionListener {
    Timer t = new Timer(15, this);
    boolean flag=false;
    Sun s1;
    CatHead head;
    CatEye eye;
    CatPupil pup;
    CatEar ear;
    CatNose nose;
    CatMouth mouth;
    CatBody body;
    CatTail tail;
    Grass grass;
    public double angle=0.4;

    public DrawPanel() {

        t.start();
        s1 = new Sun(20, 20,50, 90, 15, Color.ORANGE);
        head = new CatHead(300, 300,50, Color.DARK_GRAY);
        eye = new CatEye(280,290,15, Color.WHITE);
        pup = new CatPupil(290, 280, 5, Color.BLACK);
        ear = new CatEar(250,260,280,300,220,270,Color.DARK_GRAY);
        nose = new CatNose(305,315,325,310,320,310,Color.RED);
        mouth =new CatMouth(295,310,20,Color.BLACK);
        body = new CatBody(260,340,20,Color.DARK_GRAY);
        grass = new Grass();
        tail= new CatTail(360,450,480,350);


    }


    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        setBackground(Color.CYAN);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        s1.draw(g);
        head.draw(g);
        eye.draw(g);
        pup.draw(g);
        ear.draw(g);
        nose.draw(g);
        mouth.draw(g);
        body.draw(g);
        grass.draw(g);
        g.rotate(angle, 360, 480);
        tail.draw(g);
        g.rotate(-angle, 360, 480);

        if (angle > 0.8)
            flag = true;
        if (angle<0.4)
            flag = false;
        if (flag)
            angle -= 0.02;
        else angle += 0.02;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
