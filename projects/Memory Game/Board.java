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

public class Board extends JFrame
{
    public Board()
    {
       createBoard();     
    }
  
 
    public void createBoard()
    {
        createButtons();
        setFrame();
     }
        
     public void createButtons()
     {

      final Card button1 = new Card();
      button1.setActionCommand("Click1");
      button1.setEnabled(true);
        
      final Card button2 = new Card();
      button2.setActionCommand("Click2");
      button2.setEnabled(true);
        
      final Card button3 = new Card();
      button3.setActionCommand("Click3");
      button3.setEnabled(true);
        
      final Card button4 = new Card();
      button4.setActionCommand("Click4");
      button4.setEnabled(true);
        
      final Card button5 = new Card();
      button5.setActionCommand("Click5");
      button5.setEnabled(true);
        
      final Card button6 = new Card();
      button6.setActionCommand("Click6");
      button6.setEnabled(true);
        
      final Card button7 = new Card();
      button7.setActionCommand("Click7");
      button7.setEnabled(true);
        
      final Card button8 = new Card();
      button8.setActionCommand("Click8");
      button8.setEnabled(true);
        
      final Card button9 = new Card();
      button9.setActionCommand("Click9");
      button9.setEnabled(true);
        
      final Card button10 = new Card();
      button10.setActionCommand("Click10");
      button10.setEnabled(true);
        
      final Card button11 = new Card();
      button11.setActionCommand("Click11");
      button11.setEnabled(true);
        
      final Card button12 = new Card();
      button12.setActionCommand("Click12");
      button12.setEnabled(true);
        
      final JButton button13 = new JButton ();
      button13.setActionCommand("Click13");
      button13.setEnabled(true);
        
      final JButton button14 = new JButton ();
      button14.setActionCommand("Click14");
      button14.setEnabled(true);
        
      final JButton button15 = new JButton ();
      button15.setActionCommand("Click15");
      button15.setEnabled(true);
        
      final JButton button16 = new JButton ();
      button16.setActionCommand("Click16");
      button16.setEnabled(true);
    

      panel.setLayout(new GridLayout(4,4));//Adds the buttons to the panel in a 4 by 4 grid
      panel.add(button1);
      panel.add(button2);
      panel.add(button3);
      panel.add(button4);
      panel.add(button5);
      panel.add(button6); 
      panel.add(button7);
      panel.add(button8);
      panel.add(button9);
      panel.add(button10);
      panel.add(button11);
      panel.add(button12);
      panel.add(button13);
      panel.add(button14);
      panel.add(button15);
      panel.add(button16);
      }
      
   //  class Play implements ActionListener
     //{}
        
      public void setFrame()
      { 
           frame.add(panel);
           frame.setSize(FRAME_WIDTH, FRAME_HEIGHT); //Gets the Frame height
           frame.setTitle("Memory Game"); //Sets the title of the Frame
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setVisible(true); //Sets the Frame so that it is visible
       }


        
      private int FRAME_WIDTH = 700;
      private int FRAME_HEIGHT = 700; 
      private JFrame frame = new JFrame();
      private JPanel panel = new JPanel();
    }
    
    
    
       


