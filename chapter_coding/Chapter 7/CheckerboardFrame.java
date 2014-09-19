import javax.swing.JFrame;

public class CheckerboardFrame
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      final int FRAME_WIDTH = 360;
      final int FRAME_HEIGHT = 360;

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setTitle("Checkerboard");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      CheckerComponent component = new CheckerComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}
