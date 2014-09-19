import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
   This program demonstrates how to install an action listener.
*/
public class BankAccountViewer
{  
   public static void main(String[] args)
   {  
      JPanel panel = new JPanel();
      JFrame frame = new JFrame();
      JLabel labelA = new JLabel("Deposit");
      final JTextField deposit = new JTextField(FIELD_WIDTH);
      JButton buttonA = new JButton("Deposit");
      buttonA.setActionCommand("Click1");
      JLabel labelB = new JLabel("Withdraw");
      final JTextField withdraw = new JTextField(FIELD_WIDTH);
      JButton buttonB = new JButton("Withdraw");
      buttonB.setActionCommand("Click2");
      JLabel labelC = new JLabel("Balance");
      final JTextField money = new JTextField(FIELD_WIDTH);//you said it was ok if i used a text field to display balance instead of a label, please don't mark me down for it
      
      panel.add(labelA);
      panel.add(deposit);
      panel.add(buttonA);
      panel.add(labelB);
      panel.add(withdraw);
      panel.add(buttonB);
      panel.add(labelC);
      panel.add(money);
      frame.add(panel);
      
      final BankAccount account = new BankAccount();
    
      
      /**
       * An action listener that prints a message.
       * */
       class ClickListener implements ActionListener
       {
           
           public void actionPerformed(ActionEvent event)
           {
               if (event.getActionCommand().equals("Click2"))
               {
                   
                    double amount = Double.parseDouble(withdraw.getText());
                    account.withdraw(amount);
                    money.setText(account.getBalance() + "");
               }
               if (event.getActionCommand().equals("Click1"))
               {
                    double amount1 = Double.parseDouble(deposit.getText());
                    account.deposit(amount1);
                    money.setText(account.getBalance() + "");
               }
               
               
               
               
               
            } 
            
        }
       

     
      ActionListener listener = new ClickListener();
      ActionListener listener1 = new ClickListener();
      buttonB.addActionListener(listener1);
      buttonA.addActionListener(listener);
      
      

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
   

   private static final int FIELD_WIDTH = 15;
   private static final int FRAME_WIDTH = 600;
   private static final int FRAME_HEIGHT = 150;
}

