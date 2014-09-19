/**
 * This is the basis of the Peg Game.
 * The pegs are used for displaying
 * and holding information about the board.
 * 
 * @author (Nikita Shulzhenko) 
 * @version (March 14th, 2008 : Ver 1.0)
 */
import java.awt.Color;

public class Peg extends GameButton
{
    /**
     * Constructs a GameButton with
     * all of the added benefits and
     * methods of a Peg button.
     */
    public Peg()
    {
        super();
        setCondition("full");
    }
    
    /**
     * Method used to change the 
     * graphic on the button to indicate
     * the status of the Peg.
     * @param String s The condition to set.
     */
    public void setCondition(String s)
    {
        // Pass "full" to display a green peg.
        if(s.compareToIgnoreCase("full") == 0)
        {
            setIcon(icogen.getFullIcon());
            holeStatus = 1;
        }
        // Pass "empty" to display a hole.
        else if(s.compareToIgnoreCase("empty") == 0)
        {
            setIcon(icogen.getEmptyIcon());
            holeStatus = 0;
        }
        // Pass "selected" to indicate a peg
        // which is ready to leap over another.
        else if(s.compareToIgnoreCase("selected") == 0)
        {
            setIcon(icogen.getSelectedIcon());
            holeStatus = 1;
        }
    }
    
    /**
     * Method used to return the
     * value of the hole status.
     * @return int holeStatus The status of the hole
     */
    public int getCondition()
    {
        return holeStatus;
    }
    // The holeStatus instance variable.
    // A '0' indicates an empty hole.
    // A '1' indicates its a full hole.
    private int holeStatus;
}

