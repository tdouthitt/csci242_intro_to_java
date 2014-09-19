/**
 * This is the graphical interface for the Peg Game.
 * It creates a frame as well as all the panels
 * and layouts and then, begins the game.
 * 
 * @author (Nikita Shulzhenko) 
 * @version (March 16th 2008 : Ver 1.0)
 */
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.util.ArrayList;
import java.awt.BorderLayout;

public class LathGUI extends JFrame
{
    // Instance Variables
    private final int FRAME_WIDTH = 625;
    private final int FRAME_HEIGHT = 675;
    private JPanel mainPane = new JPanel();
    private JPanel titlePane = new JPanel();
    private JPanel trianglePane = new JPanel();
    private JFrame frame = new JFrame("The Peg Game");
    private Reticulation rules = new Reticulation();
    private ArrayList<Peg> gamePegs = new ArrayList<Peg>();
    
    /**
     * Calls the method to
     * construct the "board".
     */
    public LathGUI()
    {     
        makeFrame();
    }
    
    /**
     * Calls the order of sequence
     * in order to create the
     * game and the board.
     */
    public void makeFrame()
    {
        // I put them in order as they
        // go down the class, so it should
        // be easier.
        setLayouts();
        addPegs();
        addTitle();
        organizePanes();
        initializeGame();
        frameConfig();
    }
    
    /**
     * Establishes the layouts
     * for both panes of the game.
     */
    public void setLayouts()
    {
        titlePane.setLayout(new GridLayout(1,1));
        trianglePane.setLayout(new GridLayout(5,9));
    }
    
    /**
     * Adds multiple pegs to the
     * GridLayout of the triangle panel.
     * Also writes those pegs to an array
     * to be used for calculating rules.
     */
    public void addPegs()
    {
        // Temp Buttons
        Peg tempPeg;
        AestheticButton tempButton;
        // Counter to be used for naming the buttons
        // as they are added to the board.
        int pegNum = 0;
        // Loops through and adds 45 buttons, some
        // are aesthetic while others are functional.
        // This is to create the triangle shape.
        for(int i = 0; i < 45; i++)
        {
            // These I worked out to be the buttons I wish to be functional.
            if(i==4||i==12|i==14||i==20||i==22|i==24||i==28||i==30||i==32||i==34||i==36||i==38||i==40||i==42||i==44)
            {
                // Creates a new Peg and labels it.
                tempPeg = new Peg();
                tempPeg.setText(Integer.toString(pegNum));
                // Establishes the peg which is absent.
                if(i==22)
                {
                    tempPeg.setCondition("empty");
                }
                // Links an action listener to the button
                // and adds it to the panel.
                tempPeg.addActionListener(rules);
                trianglePane.add(tempPeg);
                // Adds a reference to the object in an array
                // and increases the counter to be used for
                // labeling the next functional button.
                gamePegs.add(tempPeg);
                pegNum++;
            }
            // If not chosen, the button merely is a blank aesthetic.
            else
            {
                tempButton = new AestheticButton();
                tempButton.makeEmpty();
                trianglePane.add(tempButton);
            }
        }
    }
    
    /**
     * Configures the titlePanel with
     * graphics and specifications. 
     */
    public void addTitle()
    {
        // Color-codes it to the color of the pegs :D
        titlePane.setBackground(new Color(49, 106, 34));
        // Add the prebuilt titleButton
        // as well as its corresponding graphic.
        AestheticButton title = new AestheticButton();
        title.makeTitle();
        // Adds it to the pane.
        titlePane.add(title);        
    }              
    
    /**
     * Places the sub-panels onto the main one.
     */
    public void organizePanes()
    {
        mainPane.setLayout(new BorderLayout());
        mainPane.add(titlePane, BorderLayout.NORTH);
        mainPane.add(trianglePane, BorderLayout.CENTER);
    }
    
    /**
     * Sends the array of pegs to the 
     * powerhouse of the game to being playing.
     */
    public void initializeGame()
    {
        rules.setUpGame(gamePegs);
    }        
    
    /**
     * Sets the content pane and
     * configures the last settings of
     * the frame. 
     */
    public void frameConfig()
    {
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(mainPane);
        frame.setVisible(true);
    }
}
