import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.util.Date;

/**
   This program demonstrates how to install an action listener.
*/
public class RoachTester
{  
   public static void main(String[] args)
   {  
      JPanel panel = new JPanel();
      JFrame frame = new JFrame();
      JButton buttonA = new JButton("MAKE ROACH BABIES!!!");
      panel.add(buttonA);
      frame.add(panel);
      
    
      
      /**
       * An action listener that prints a message.
       * */
       class ClickListener implements ActionListener
       {
           int roach = 2;
           int x = 2;
           public void actionPerformed(ActionEvent event)
           {
               x = x * roach;
               System.out.println("There are now " + x + " roaches ");
               
           } 
           
            
       }

     
      ActionListener listener = new ClickListener();
      buttonA.addActionListener(listener);
      
      

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
   

   
   private static final int FRAME_WIDTH = 200;
   private static final int FRAME_HEIGHT = 100;
}

