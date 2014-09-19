import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddInterestListener implements ActionListener
{
    
    public AddInterestListener(BankAccount aAccount, JLabel aLabel)
    {
        account = aAccount;
        label = aLabel;
        INTEREST_RATE = 10;
    }
    public void actionPerformed(ActionEvent event)
    {
            double interest = account.getBalance() 
                  * INTEREST_RATE / 100;
            account.deposit(interest);
            label.setText(
                  "balance=" + account.getBalance());
    } 
    private BankAccount account;
    private int INTEREST_RATE;
    private JLabel label;
    
}