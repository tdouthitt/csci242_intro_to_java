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
public class ButtonTester
{  
   public static void main(String[] args)
   {  
      JPanel panel = new JPanel();
      JFrame frame = new JFrame();
      JLabel labelA = new JLabel("Button A");
      JButton buttonA = new JButton("CLICK ME");
      buttonA.setActionCommand("Click1");
      JLabel labelB = new JLabel("Button B");
      JButton buttonB = new JButton("CLICK ME");
      buttonB.setActionCommand("Click2");
      panel.add(labelA);
      panel.add(buttonA);
      panel.add(labelB);
      panel.add(buttonB);
      frame.add(panel);
    
      
      /**
       * An action listener that prints a message.
       * */
       class ClickListener implements ActionListener
       {
           int count = 1;
           int count1 = 1;
           int counter = 1;
           public void actionPerformed(ActionEvent event)
           {
               String x = "";
               if (event.getActionCommand().equals("Click1"))
                {
                    x =  "A";
                    counter = count;
                    count++;
                }
                if (event.getActionCommand().equals("Click2"))
                {
                    x = "B";
                    counter = count1;
                    count1++;
                }
               
               Date time = new Date();
               System.out.println("Button " + x + " was clicked " + counter + " times at " + time);
               
               
           } 
            
       }

     
      ActionListener listener = new ClickListener();
      buttonB.addActionListener(listener);
      buttonA.addActionListener(listener);
      
      

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
   


   private static final int FRAME_WIDTH = 200;
   private static final int FRAME_HEIGHT = 100;
}

