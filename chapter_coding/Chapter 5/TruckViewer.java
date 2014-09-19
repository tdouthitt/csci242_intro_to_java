
/**
 * Write a description of class CarViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


import javax.swing.JFrame;

public class TruckViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      final int FRAME_WIDTH = 300;
      final int FRAME_HEIGHT = 400;

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setTitle("Two Trucks");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      TruckComponent component = new TruckComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}

