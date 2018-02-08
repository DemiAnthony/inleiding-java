package Hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {


    public void paint(Graphics g) {

        g.drawString("jeroen", 100, 210);
        g.drawString("hans", 150, 210);
        g.drawString("valerie",200, 210 );
        g.setColor(Color.blue);
        g.fillRect(100, 100, 30, 100);
        g.setColor(Color.red);
        g.fillRect(150, 120, 30, 80);
        g.setColor(Color.yellow);
        g.fillRect(200, 160, 30, 40);



    }
}
