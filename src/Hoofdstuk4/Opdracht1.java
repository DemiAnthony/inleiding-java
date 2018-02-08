package Hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    public void paint(Graphics g) {
        g.drawLine(69, 51, 100, 100);
        g.drawLine(100, 100, 30, 100);
        g.drawLine(30, 100, 69, 51);
    }
}
