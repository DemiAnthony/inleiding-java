package Hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {

    @Override
    public void paint(Graphics g) {
        g.fillRect(30, 30, 30, 200);
        g.setColor(Color.red);
        g.fillRect(60, 30, 60, 30);
        g.setColor(Color.blue);
        g.fillRect(60, 90, 60, 30);
    }
}
