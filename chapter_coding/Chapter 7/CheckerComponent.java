import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class CheckerComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Checkerboard cb = new Checkerboard(8, 8, 45);

        cb.draw(g2);
    }
}