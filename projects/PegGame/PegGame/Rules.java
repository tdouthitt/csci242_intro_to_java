import javax.swing.JButton;
import java.util.ArrayList;
/**
 * This class sets up the rules for how peg may move on the board,
 * it specifies conditions for when it may jump another peg.
 * @author (Taylor Douthitt)
 * @version (3-29-09)
 */
public class Rules
{
    /**
     * Constructor for object of class Rules.
     */
    public Rules()
    {
        
    }
    /**
     * This method determines whether or not the peg has an acceptable move it can make
     * @param   button - passes GameButton[] object for use in the method
     *          temp - passes Peg[] object for use in the method
     *          peg - passes a Peg object for use in the method
     *@return   canMove - true if the peg has an acceptable move, false if the peg does not have an acceptable move
     */
    public boolean canMove(Peg peg, GameButton[] button, Peg[] temp)
    {
        
        if(peg.getLocation() == button[0].getPosition())
        {
            if(button[1].getOccupied() == true && button[3].getOccupied() == false)
            {
                canMove = true;
            }
            else if(button[2].getOccupied() == true && button[5].getOccupied() == false)
            {
                canMove = true;
            }
            else
            {
                canMove = false;
            }
        }
        if(peg.getLocation() == button[1].getPosition())
        {
            if(button[3].getOccupied() == true && button[6].getOccupied() == false)
            {
                canMove = true;
            }
            else if(button[4].getOccupied() == true && button[8].getOccupied() == false)
            {
                canMove = true;
            }
            else
            {
                canMove = false;
            }
        }
        if(peg.getLocation() == button[2].getPosition())
        {
            if(button[4].getOccupied() == true && button[7].getOccupied() == false)
            {
                canMove = true;
            }
            else if(button[5].getOccupied() == true && button[9].getOccupied() == false)
            {
                canMove = true;
            }
            else
            {
                canMove = false;
            }
        }
        if(peg.getLocation() == button[3].getPosition())
        {
            if(button[1].getOccupied() == true && button[0].getOccupied() == false)
            {
                canMove = true;
            }
            else if(button[4].getOccupied() == true && button[5].getOccupied() == false)
            {
                canMove = true;
            }
            else if(button[7].getOccupied() == true && button[12].getOccupied() == false)
            {
                canMove = true;
            }
            else if(button[6].getOccupied() == true && button[10].getOccupied() == false)
            {
                canMove = true;
            }
            else
            {
                canMove = false;
            }
        }
        if(peg.getLocation() == button[4].getPosition())
        {
            if(button[7].getOccupied() == true && button[11].getOccupied() == false)
            {
                canMove = true;
            }
            else if(button[8].getOccupied() == true && button[13].getOccupied() == false)
            {
                canMove = true;
            }
            else
            {
                canMove = false;
            }
        }
        if(peg.getLocation() == button[5].getPosition())
        {
            if(button[2].getOccupied() == true && button[0].getOccupied() == false)
            {
                canMove = true;
            }
            else if(button[4].getOccupied() == true && button[3].getOccupied() == false)
            {
                canMove = true;
            }
            else if(button[8].getOccupied() == true && button[12].getOccupied() == false)
            {
                canMove = true;
            }
            else if(button[9].getOccupied() == true && button[14].getOccupied() == false)
            {
                canMove = true;
            }
            else
            {
                canMove = false;
            }
        }
        if(peg.getLocation() == button[6].getPosition())
        {
            if(button[3].getOccupied() == true && button[1].getOccupied() == false)
            {
                canMove = true;
            }
            else if(button[7].getOccupied() == true && button[8].getOccupied() == false)
            {
                canMove = true;
            }
            else
            {
                canMove = false;
            }
        }
        if(peg.getLocation() == button[7].getPosition())
        {
            if(button[4].getOccupied() == true && button[2].getOccupied() == false)
            {
                canMove = true;
            }
            else if(button[8].getOccupied() == true && button[9].getOccupied() == false)
            {
                canMove = true;
            }
            else
            {
                canMove = false;
            }
        }
        if(peg.getLocation() == button[8].getPosition())
        {
            if(button[4].getOccupied() == true && button[1].getOccupied() == false)
            {
                canMove = true;
            }
            else if(button[7].getOccupied() == true && button[6].getOccupied() == false)
            {
                canMove = true;
            }
            else
            {
                canMove = false;
            }
        }
        if(peg.getLocation() == button[9].getPosition())
        {
            if(button[5].getOccupied() == true && button[2].getOccupied() == false)
            {
                canMove = true;
            }
            else if(button[8].getOccupied() == true && button[7].getOccupied() == false)
            {
                canMove = true;
            }
            else
            {
                canMove = false;
            }
        }
        if(peg.getLocation() == button[10].getPosition())
        {
            if(button[6].getOccupied() == true && button[3].getOccupied() == false)
            {
                canMove = true;
            }
            else if(button[11].getOccupied() == true && button[12].getOccupied() == false)
            {
                canMove = true;
            }
            else
            {
                canMove = false;
            }
        }
        if(peg.getLocation() == button[11].getPosition())
        {
            if(button[7].getOccupied() == true && button[4].getOccupied() == false)
            {
                canMove = true;
            }
            else if(button[12].getOccupied() == true && button[13].getOccupied() == false)
            {
                canMove = true;
            }
            else
            {
                canMove = false;
            }
        }
        if(peg.getLocation() == button[12].getPosition())
        {
            if(button[7].getOccupied() == true && button[3].getOccupied() == false)
            {
                canMove = true;
            }
            else if(button[8].getOccupied() == true && button[5].getOccupied() == false)
            {
                canMove = true;
            }
            else if(button[11].getOccupied() == true && button[10].getOccupied() == false)
            {
                canMove = true;
            }
            else if(button[13].getOccupied() == true && button[14].getOccupied() == false)
            {
                canMove = true;
            }
            else
            {
                canMove = false;
            }
        }
        if(peg.getLocation() == button[13].getPosition())
        {
            if(button[8].getOccupied() == true && button[4].getOccupied() == false)
            {
                canMove = true;
            }
            else if(button[12].getOccupied() == true && button[11].getOccupied() == false)
            {
                canMove = true;
            }
            else
            {
                canMove = false;
            }
        }
        if(peg.getLocation() == button[14].getPosition())
        {
            if(button[9].getOccupied() == true && button[5].getOccupied() == false)
            {
                canMove = true;
            }
            else if(button[13].getOccupied() == true && button[12].getOccupied() == false)
            {
                canMove = true;
            }
            else
            {
                canMove = false;
            }
        }
        else if(peg.getLocation() == -1)
        {
            canMove = false;
        }
        return canMove;
    }
    
    private boolean canMove = true;         
}