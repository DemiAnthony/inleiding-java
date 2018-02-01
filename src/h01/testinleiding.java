package h01;

import java.applet.Applet;
import java.awt.*;
import java.awt.Color;

import static java.awt.Color.black;
import static java.awt.Color.white;

public class testinleiding extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.white);

    }

    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
    g.drawString("Hallo ROC", 20,20);

    }
}