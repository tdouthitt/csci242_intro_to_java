//Imports all necessary packages in order to compile the MenuFrame Class
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
*  This Frame has an exit item, as well as option to play a song
 
*/

public class MenuFrame extends JFrame
{
   /**
      Constructs the frame.
   */
   public MenuFrame()
   {  
     // Constructs  the main menu      
      JMenuBar menuBar = new JMenuBar();     
      setJMenuBar(menuBar);
      menuBar.add(createFileMenu());  // adds a menu item named File
      menuBar.add(createMusicMenu()); // Adds a menu item named Music

      fontsize = 24;                  // Sets the menu font size to 24
      fontstyle = Font.PLAIN;         // Sets the mnue font to PlAIN

      setSize(FRAME_WIDTH, FRAME_HEIGHT); // Sets the size of the Frame Width and Height
    }

   /**
      Creates the File menu.
      @return the menu
   */
   public JMenu createFileMenu()
   {
      JMenu menu = new JMenu("File");
      menu.add(createFileExitItem());
      return menu;
   }

  
   /**
      Creates the File->Exit menu item and sets its action listener.
      @return the menu item
   */
   public JMenuItem createFileExitItem()
   {
      JMenuItem item = new JMenuItem("Exit");      
      class MenuItemListener implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {
            System.exit(0);
         }
      }      
      ActionListener listener = new MenuItemListener();
      item.addActionListener(listener);
      return item;
   }

 
   
   /**
      Creates the Music menu.
      @return the menu
   */
   public JMenu createMusicMenu()
   {
      JMenu menu = new JMenu("Music");
      menu.add(createMusicSongItem());
      
      return menu;
   }
   
  
    public JMenuItem createMusicSongItem()
    {
       JMenuItem item = new JMenuItem("SandStorm");
       class MenuItemListener implements ActionListener
       {
           public void actionPerformed(ActionEvent event)
           {
               String filename="Sandstorm.mp3";
        
               // play from the beginning
               final MP3 mp3 = new MP3(filename);
               mp3.play();
           }

         
       }
       ActionListener listener = new MenuItemListener();
       item.addActionListener(listener);
       return item;
   }
     
   private JLabel sampleField;
   private String facename;
   private int fontstyle;
   private int fontsize;

   private static final int FRAME_WIDTH = 720;
   private static final int FRAME_HEIGHT = 720;
}



