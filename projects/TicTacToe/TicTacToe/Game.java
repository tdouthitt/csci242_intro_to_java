//Imports all necessary packages in order to compile the Game Class
import java.awt.Graphics; 
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;



/**
 * Write a description of class Game here.
 * 
 * @author (Brad Hemmingsen, Taylor Douthitt, Josh Kaufman) 
 * @version (11/6/08)
 */
public class Game 
{
    
    
    public static void main(String[] args)
    {
        //Creates the Top Menu
        JFrame menu = new MenuFrame();
        
        // Creates Frame
        JFrame frame = new JFrame();
        
        final JButton button1 = new JButton ();
        button1.setActionCommand("Click1");
        button1.setEnabled(true);
        
        final JButton button2 = new JButton ();
        button2.setActionCommand("Click2");
        button2.setEnabled(true);
        
        final JButton button3 = new JButton ();
        button3.setActionCommand("Click3");
        button3.setEnabled(true);
        
        final JButton button4 = new JButton ();
        button4.setActionCommand("Click4");
        button4.setEnabled(true);
        
        final JButton button5 = new JButton ();
        button5.setActionCommand("Click5");
        button5.setEnabled(true);
        
        final JButton button6 = new JButton ();
        button6.setActionCommand("Click6");
        button6.setEnabled(true);
        
        final JButton button7 = new JButton ();
        button7.setActionCommand("Click7");
        button7.setEnabled(true);
        
        final JButton button8 = new JButton ();
        button8.setActionCommand("Click8");
        button8.setEnabled(true);
        
        final JButton button9 = new JButton ();
        button9.setActionCommand("Click9");
        button9.setEnabled(true);
        
    

        //Creates Panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,3));
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6); 
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        menu.add(panel);
        
        //
        final WinMatch winner = new WinMatch();
        
        class PlayGame implements ActionListener
        {
            ImageIcon x = new ImageIcon("X.jpg");
            ImageIcon o = new ImageIcon("o.jpg");
            ImageIcon icon;
            int b1 = 0;
            int b2 = 0;
            int b3 = 0;
            int b4 = 0;
            int b5 = 0;
            int b6 = 0;
            int b7 = 0;
            int b8 = 0;
            int b9 = 0;
            int result;
            
            private int counter = 0;
            
            
            public void actionPerformed(ActionEvent event1)
            { 
                if (counter % 2 ==0)
                {
                    icon = x;
                }
                else 
                {
                    icon = o; 
                }
            

                if (event1.getActionCommand().equals("Click1"))
                {
                     button1.setEnabled(false);
                     //button1.setIcon(icon);
                     button1.setIcon(icon);
                     if (counter % 2 == 0)
                     {
                         b1 = 1;
                     }
                     else
                     {
                         b1 = 4;
                     }
                    result = winner.checkWinner(b1, b2, b3, b4, b5, b6, b7, b8, b9);
                    if (result == 1)
                    {
                        JOptionPane.showMessageDialog(null, "Player X is the Winner!");
                        System.exit(0);
                    }
                    //X is winner
                    else if (result == -1)
                    {
                        
                    }
                    //cat's
                    else if (result == 2)
                    {
                        JOptionPane.showMessageDialog(null, "Player O is the Winner!");
                        System.exit(0);
                    }
                    //keep playing
                    counter++;
                }
               
                if (event1.getActionCommand().equals("Click2"))
                {
                     button2.setEnabled(false);
                     button2.setIcon(icon);
                     if (counter % 2 == 0)
                     {
                         b2 = 1;
                     }
                     else
                     {
                         b2 = 4;
                     }
                     
                    result = winner.checkWinner(b1, b2, b3, b4, b5, b6, b7, b8, b9);
                    if (result == 1)
                    {
                        JOptionPane.showMessageDialog(null, "Player X is the Winner!");
                        System.exit(0);
                    }
                    //X is winner
                    else if (result == -1)
                    {
                        
                    }
                    //cat's
                    else if (result == 2)
                    {
                        JOptionPane.showMessageDialog(null, "Player O is the Winner!");
                        System.exit(0);
                    }
                    counter++;
                }
                  
                if (event1.getActionCommand().equals("Click3"))
                {
                    button3.setEnabled(false);
                    button3.setIcon(icon);
                    if (counter % 2 == 0)
                    {
                         b3 = 1;
                    }
                    else
                    {
                        b3 = 4;
                    }
                    
                    result = winner.checkWinner(b1, b2, b3, b4, b5, b6, b7, b8, b9);
                    if (result == 1)
                    {   
                        JOptionPane.showMessageDialog(null, "Player X is the Winner!");
                        System.exit(0);
                    }
                    //Y is winner
                    else if (result == -1)
                    {
                        
                    }
                    //cat's
                    else if (result == 2)
                    {
                        JOptionPane.showMessageDialog(null, "Player O is the Winner!");
                        System.exit(0);
                    } 
                    counter++;
                }
                  
                if (event1.getActionCommand().equals("Click4"))
                {
                     button4.setEnabled(false);
                     button4.setIcon(icon);
                     if (counter % 2 == 0)
                     {
                         b4 = 1;
                     }
                     else
                     {
                         b4 = 4;
                     }
                    
                    result = winner.checkWinner(b1, b2, b3, b4, b5, b6, b7, b8, b9);
                    if (result == 1)
                    {
                        JOptionPane.showMessageDialog(null, "Player X is the Winner!"); 
                        System.exit(0);
                    }
                    //X is winner
                    else if (result == -1)
                    {
                      
                    }
                    //cat's
                    else if (result == 2)
                    {
                        JOptionPane.showMessageDialog(null, "Player O is the Winner!");
                        System.exit(0);
                    } 
                    counter++;
                }
                 
                if (event1.getActionCommand().equals("Click5"))
                {
                     button5.setEnabled(false);
                     button5.setIcon(icon);
                     if (counter % 2 == 0)
                     {
                         b5 = 1;
                     }
                     else
                     {
                         b5 = 4;
                     }
                     
                  result = winner.checkWinner(b1, b2, b3, b4, b5, b6, b7, b8, b9);
                  if (result == 1)
                    {
                      JOptionPane.showMessageDialog(null, "Player X is the Winner!");
                      System.exit(0);
                    }
                    //Y is winner
                    else if (result == -1)
                    {
                       
                    }
                    //cat's
                    else if (result == 2)
                    {
                        JOptionPane.showMessageDialog(null, "Player O is the Winner!");
                        System.exit(0);
                    } 
                    counter++;
                }
                  
                if (event1.getActionCommand().equals("Click6"))
                {
                     button6.setEnabled(false);
                     button6.setIcon(icon);
                     if (counter % 2 == 0)
                     {
                         b6 = 1;
                     }
                     else
                     {
                         b6 = 4;
                     }
                     
                   result = winner.checkWinner(b1, b2, b3, b4, b5, b6, b7, b8, b9);
                   if (result == 1)
                    {
                        JOptionPane.showMessageDialog(null, "Player X is the Winner!"); 
                        System.exit(0);
                    }
                    //X is winner
                    else if (result == -1)
                    {
                        
                    }
                    //cat's
                    else if (result == 2)
                    {
                        JOptionPane.showMessageDialog(null, "Player O is the Winner!");
                        System.exit(0);
                    }
                    counter++;
                }
                  
                if (event1.getActionCommand().equals("Click7"))
                {
                     button7.setEnabled(false);
                     button7.setIcon(icon);
                     if (counter % 2 == 0)
                     {
                         b7 = 1;
                     }
                     else
                     {
                         b7 = 4;
                     }
                   
                    result = winner.checkWinner(b1, b2, b3, b4, b5, b6, b7, b8, b9);
                    if (result == 1)
                    {
                        JOptionPane.showMessageDialog(null, "Player X is the Winner!");
                        System.exit(0);
                    }
                    //Y is winner
                    else if (result == -1)
                    {
                      
                    }
                    //cat's
                    else if (result == 2)
                    {
                        JOptionPane.showMessageDialog(null, "Player O is the Winner!");
                        System.exit(0);
                    }
                    counter++;
                }
                 
                if (event1.getActionCommand().equals("Click8"))
                {
                    button8.setEnabled(false);
                    button8.setIcon(icon);
                    if (counter % 2 == 0)
                     {
                         b8 = 1;
                     }
                     else
                     {
                         b8 = 4;
                     }
                     
                    result = winner.checkWinner(b1, b2, b3, b4, b5, b6, b7, b8, b9);
                    if (result == 1)
                    {
                        JOptionPane.showMessageDialog(null, "Player X is the Winner!");
                        System.exit(0);
                    }
                    //X is winner
                    else if (result == -1)
                    {
                       
                    }
                    //cat's
                    else if (result == 2)
                    {
                        JOptionPane.showMessageDialog(null, "Player O is the Winner!");
                        System.exit(0);
                    }
                    counter++;
                }
                  
                if (event1.getActionCommand().equals("Click9"))
                {
                     button9.setEnabled(false);
                     button9.setIcon(icon);
                     
                     if (counter % 2 == 0)
                     {
                         b9 = 1;
                     }
                     else
                     {
                         b9 = 4;
                     }
                     
                    result = winner.checkWinner(b1, b2, b3, b4, b5, b6, b7, b8, b9);
                     if (result == 1)
                    {
                        //X is the Winner
                        JOptionPane.showMessageDialog(null, "Player X is the Winner!");
                        System.exit(0);
                    }
                    //Y is winner
                    else if (result == -1)
                    {
                        JOptionPane.showMessageDialog(null, "Cat wins the game!");
                        System.exit(0);
                    }
                    //Cat's Game
                    else if (result == 2)
                    {
                      JOptionPane.showMessageDialog(null, "Player O is the Winner!");
                      System.exit(0);
                    }
                    counter++;
                    
                }
            
                
               
                
            }
        }
        
        ActionListener listener = new PlayGame();
        button1.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
        button4.addActionListener(listener);
        button5.addActionListener(listener);
        button6.addActionListener(listener);
        button7.addActionListener(listener);
        button8.addActionListener(listener);
        button9.addActionListener(listener);
       
      
       final int FRAME_WIDTH = 720;
       final int FRAME_HEIGHT = 720;
     
       frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
       frame.setTitle("TicTacToe");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(false);
       menu.setVisible(true);
  

      
      
     
    }
}
    
    

    
    
    
   



