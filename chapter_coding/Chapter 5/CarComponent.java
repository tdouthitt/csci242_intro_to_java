
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;

/**
   This component draws two car shapes.
*/
public class CarComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;

      Car car1 = new Car(0, 0, Color.GREEN);
      
      int x = getWidth() - Car.WIDTH;
      int y = getHeight() - Car.HEIGHT;

      Car car2 = new Car(x, y, Color.BLUE);

      car1.draw(g2);
      car2.draw(g2);      
   }
}

