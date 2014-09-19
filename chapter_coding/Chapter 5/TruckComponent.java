
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;

/**
   This component draws two car shapes.
*/
public class TruckComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;

      Truck truck1 = new Truck(0, 0, Color.GREEN);
      
      int x = getWidth() - Truck.WIDTH;
      int y = getHeight() - Truck.HEIGHT;

      Truck truck2 = new Truck(x - 95, y - 60, Color.BLUE);

      truck1.draw(g2);
      truck2.draw(g2);      
   }
}

