import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.BasicStroke;
import java.awt.Color;

/**
   An applet that draws two rectangles.
*/
public class DouthittP5_14 extends Applet
{
   public void paint(Graphics g)
   {
      // recover Graphics2D

      Graphics2D g2 = (Graphics2D)g;

      // construct a rectangle and draw it

      Double circle = new Double(150, 100, 50, 50);
      Double circle1 = new Double(202, 100, 50, 50);
      Double circle2 = new Double(254, 100, 50, 50);
      Double circle3 = new Double(175, 125, 50, 50);
      Double circle4 = new Double(228, 125, 50, 50);

      g2.setStroke(new BasicStroke(4));
      g2.setColor(Color.BLUE);

      g2.draw(circle);
      g2.setColor(Color.BLACK);

      g2.draw(circle1);
      g2.setColor(Color.RED);

      g2.draw(circle2);
      g2.setColor(Color.YELLOW);

      g2.draw(circle3);
      g2.setColor(Color.GREEN);

      g2.draw(circle4);




   }
}

