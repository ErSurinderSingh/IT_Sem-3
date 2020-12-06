package Practicals;

import java.applet.Applet;
import java.awt.Graphics;

public class HelloWorldApplet extends Applet {

    public void paint(Graphics g) {
        g.drawString("Hello World", 120, 250);
    }

}  


/*<applet code="HelloWorldApplet.class" width="300" height="300">  
</applet>  */
