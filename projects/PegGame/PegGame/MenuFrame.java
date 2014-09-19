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
 * This class creates the menu where the players can exit the game as well as select a song.
 * When the song is seleted, it the plays.
 * 
 * @author (Brad Hemmingsen) 
 * @version (11/6/08)
 */

public class MenuFrame extends JFrame
{
   //Constructs the Frame 
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
      JMenuItem item = new JMenuItem("Exit"); //Creates a new menu item     
      class MenuItemListener implements ActionListener //Adds action listener to that item
      {
         public void actionPerformed(ActionEvent event)
         {
            System.exit(0); //When the item is clicked, the program is closed.
         }
      }      
      ActionListener listener = new MenuItemListener(); //Creates a new variable for action listener
      item.addActionListener(listener);//Sets the action listener variable to the item 
      return item;
   }

 
   
   /**
      Creates the Music menu.
      @return the menu
   */
   public JMenu createMusicMenu()
   {
      JMenu menu = new JMenu("Music"); //Creates a new menu 
      menu.add(createMusicSongItem());//Adds an item to that menu
      
      return menu;
   }
   
    /**
      Creates the Music->SandStorm menu item and sets its action listener.
      @return the menu item
   */
    public JMenuItem createMusicSongItem()
   {
      JMenuItem item = new JMenuItem("Techno");//Sets the file path to the variable
      class MenuItemListener implements ActionListener //Implements action listener to the menu item
      {
          public void actionPerformed(ActionEvent event)
          {
              String filename="electronaut.mp3";
        
              // play from the beginning
              final MP3 mp3 = new MP3(filename); 
              mp3.play(); //Plays the song when the item on the menu is selected
          }

         
       }
       ActionListener listener = new MenuItemListener();//Creates a new action listener for the menu item
       item.addActionListener(listener);//Sets the listener variable to the menu item
       return item;
   }
     
   private JLabel sampleField;
   private String facename;
   private int fontstyle;
   private int fontsize;
  
   //Sets the Frame Size
   private static final int FRAME_WIDTH = 720;
   private static final int FRAME_HEIGHT = 720;
}


