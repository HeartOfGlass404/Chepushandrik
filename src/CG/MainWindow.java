package CG;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame{

    private final static int FPS = 24;
    private double t;
    private final DrawPanel dp;

    public MainWindow() throws HeadlessException {
        dp = new DrawPanel();
        this.add(dp);


    }
}
