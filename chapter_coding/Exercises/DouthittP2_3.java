import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.applet.Applet;



public class DouthittP2_3 extends Applet
{
	public void paint(Graphics g)
	{
	Graphics2D g2 = (Graphics2D)g;
	Rectangle box = new Rectangle(5, 10, 50, 50);
	g2.draw(box);
	box.translate(50, 0);
    g2.draw(box);
	box.translate(0, 50);
	g2.draw(box);
	box.translate(-50, 0);
	g2.draw(box);
	}
}