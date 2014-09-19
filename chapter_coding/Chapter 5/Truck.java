
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
   A car shape that can be positioned anywhere on the screen.
*/
public class Truck
{
   /**
      Constructs a car with a given top left corner
      @param x the x coordinate of the top left corner
      @param y the y coordinate of the top left corner
   */
   public Truck(int x, int y, Color carColor)
   {
      xLeft = x;
      yTop = y;
      color = carColor;
   }

   /**
      Draws the car.
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2)
   {
      Rectangle body 
            = new Rectangle(xLeft + 10, yTop + 30, 90, 35);      
      Ellipse2D.Double backTire1 
            = new Ellipse2D.Double(xLeft + 10, yTop + 60, 20, 20);
      Ellipse2D.Double backTire2 
            = new Ellipse2D.Double(xLeft + 30, yTop + 60, 20, 20);
      Ellipse2D.Double backTire3 
            = new Ellipse2D.Double(xLeft + 50, yTop + 60, 20, 20);
      Ellipse2D.Double frontTire1
            = new Ellipse2D.Double(xLeft + 115, yTop + 60, 20, 20);
      Ellipse2D.Double frontTire2
            = new Ellipse2D.Double(xLeft + 95, yTop + 60, 20, 20);
      
            

      Point2D.Double r1 
            = new Point2D.Double(xLeft + 10, yTop + 30);
     
      Point2D.Double r2 
            = new Point2D.Double(xLeft + 30, yTop + 10);
      
      Point2D.Double r3 
            = new Point2D.Double(xLeft + 100, yTop + 30);
      
      Point2D.Double r4 
            = new Point2D.Double(xLeft + 100, yTop + 65);
      Point2D.Double r5 
            = new Point2D.Double(xLeft + 120, yTop + 65);
      Point2D.Double r6 
            = new Point2D.Double(xLeft + 140, yTop + 65);
      Point2D.Double r7 
            = new Point2D.Double(xLeft + 100, yTop + 50);
    
      Point2D.Double r8 
            = new Point2D.Double(xLeft + 120, yTop + 50);
     
      Point2D.Double r9 
            = new Point2D.Double(xLeft + 140, yTop + 50);
      
      Point2D.Double r10 
            = new Point2D.Double(xLeft + 150, yTop + 50);
      Point2D.Double r11 
            = new Point2D.Double(xLeft + 150, yTop + 35);
      Point2D.Double r12 
            = new Point2D.Double(xLeft + 130, yTop + 35);
      Point2D.Double r13 
            = new Point2D.Double(xLeft + 110, yTop + 30);
   
      Point2D.Double r14 
            = new Point2D.Double(xLeft + 120, yTop + 10);
  
      Point2D.Double r15 
            = new Point2D.Double(xLeft + 110, yTop + 10);
  
      Point2D.Double r16
            = new Point2D.Double(xLeft + 110, yTop + 55);
      Point2D.Double r17 
            = new Point2D.Double(xLeft + 105, yTop + 55);
      

      Line2D.Double backTrailer 
            = new Line2D.Double(r1, r2);
      Line2D.Double topTrailer 
            = new Line2D.Double(r2, r15);
      Line2D.Double cabinBackTop 
            = new Line2D.Double(r3, r15);
      Line2D.Double cabinFrontTop
            = new Line2D.Double(r13, r14);
      Line2D.Double cabinCloseTop
            = new Line2D.Double(r3, r13);
      Line2D.Double cabinFarTop
            = new Line2D.Double(r15, r14);
      Line2D.Double cabinSideTop
            = new Line2D.Double(r3, r7);
      Line2D.Double cabinSideBottom
            = new Line2D.Double(r7, r4);
      Line2D.Double doorTop 
            = new Line2D.Double(r7, r8);
      Line2D.Double doorBottom
            = new Line2D.Double(r4, r5);
      Line2D.Double windowClose
            = new Line2D.Double(r8, r13);
      Line2D.Double windowFar
            = new Line2D.Double(r12, r14);
      Line2D.Double doorHinge 
            = new Line2D.Double(r8, r5);
      Line2D.Double hoodSideBottom 
            = new Line2D.Double(r5, r6);
      Line2D.Double hoodSideTop 
            = new Line2D.Double(r8, r9);
      Line2D.Double hoodCrease
            = new Line2D.Double(r8, r12);
      Line2D.Double hoodClose
            = new Line2D.Double(r9, r6);
      Line2D.Double hoodFar
            = new Line2D.Double(r10, r11);
      Line2D.Double hoodTop 
            = new Line2D.Double(r9, r11);
      Line2D.Double hoodBottom
            = new Line2D.Double(r6, r10);
      Line2D.Double hoodTopFar
            = new Line2D.Double(r11, r12);
      Line2D.Double handle
            = new Line2D.Double(r16, r17);
            
      
      g2.setColor(color);
      g2.draw(body);
      g2.draw(frontTire1);
      g2.draw(frontTire2);
      g2.draw(frontTire2);
      g2.draw(backTire1);
      g2.draw(backTire2);
      g2.draw(backTire3);
      g2.draw(backTrailer);      
      g2.draw(topTrailer);      
      g2.draw(cabinBackTop);
      g2.draw(cabinFrontTop);
      g2.draw(cabinCloseTop);
      g2.draw(cabinFarTop);      
      g2.draw(cabinSideTop);      
      g2.draw(cabinSideBottom);
      g2.draw(doorTop);
      g2.draw(doorBottom);
      g2.draw(windowClose);      
      g2.draw(windowFar);      
      g2.draw(doorHinge);
      g2.draw(hoodSideTop);
      g2.draw(hoodSideBottom);
      g2.draw(hoodCrease);      
      g2.draw(hoodClose);      
      g2.draw(hoodFar);
      g2.draw(hoodTop);
      g2.draw(hoodBottom);
      g2.draw(hoodTopFar);
      g2.draw(handle);
  
    }   
       
  
  

   public static int WIDTH = 60;
   public static int HEIGHT = 30;
   private int xLeft;
   private int yTop;
   private Color color;
}