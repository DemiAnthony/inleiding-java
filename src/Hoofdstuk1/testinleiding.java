package Hoofdstuk1;

import java.applet.Applet;
import java.awt.*;
import java.awt.Color;

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