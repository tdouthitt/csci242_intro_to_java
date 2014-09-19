import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D.Double;

/**
   An applet that draws two rectangles.
*/
public class DouthittP5_10 extends Applet
{
   public void paint(Graphics g)
   {
      // recover Graphics2D

      Graphics2D g2 = (Graphics2D)g;

      // construct a rectangle and draw it

      Double circle = new Double(160, 100, 50, 50);
      Double circle1 = new Double(170, 110, 10, 10);
      Double circle2 = new Double(190, 110, 10, 10);
      Double circle3 = new Double(172, 135, 25, 0);

      g2.draw(circle);
      g2.draw(circle1);
      g2.draw(circle2);
      g2.draw(circle3);




   }
}

