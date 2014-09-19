import java.awt.Rectangle;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

 public class DouthittP2_4 extends Applet
 {
	 public void paint(Graphics g)
	 {
		 Graphics2D g2 = (Graphics2D)g;
		 Rectangle box = new Rectangle(5, 10, 50 ,50);
		 Rectangle box1 = new Rectangle(20, 30, 50 ,50);
		 Rectangle box2 = box.intersection(box1);
		 g2.draw(box);
		 g2.draw(box1);
		 g2.setColor(Color.RED);
		 g2.fill(box2);
		 g2.draw(box2);

	 }
 }