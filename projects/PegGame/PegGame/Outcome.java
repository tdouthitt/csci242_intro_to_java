import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
/**
 * This class will determine when the game has ended and whether
 * the game is a win or a loss, it also displays a message depending on
 * the outcome(win or loss) of the game.
 * @author (Taylor Douthitt & Brad Hemmingsen)
 * @version (3-29-09)
 */
public class Outcome
{
    /**
     * Constructor for object of class Outcome.
     */
    public Outcome()
    {
        
    }
    /**
     * This method will run through the Array holding the peg objects,
     * the method will loop through the array testing to see if each peg can move,
     * if a peg may move endGame is false indicating acceptable moves are available,
     * if none of the pegs may move then endGame is true indicating the game is over.
     * @param   button - passes GameButton[] object for use in the method
     *          temp - passes ArrayList<Peg> object for use in the method
     *          access - passes Rules object for use in the method
     * @return      false if acceptable moves available, true if no moves available
     */
    public boolean endGame(GameButton[] button, Peg[] temp, Rules access)
    {
            if(access.canMove(temp[0], button, temp) == true || access.canMove(temp[1], button, temp) == true || access.canMove(temp[2], button, temp) == true || access.canMove(temp[3], button, temp) == true || access.canMove(temp[4], button, temp) == true || access.canMove(temp[5], button, temp) == true || access.canMove(temp[6], button, temp) == true || access.canMove(temp[7], button, temp) == true || access.canMove(temp[8], button, temp) == true || access.canMove(temp[9], button, temp) == true || access.canMove(temp[10], button, temp) == true || access.canMove(temp[11], button, temp) == true || access.canMove(temp[12], button, temp) == true || access.canMove(temp[13], button, temp) == true)
            {
                endGame = false;
            }
            else if(access.canMove(temp[0], button, temp) == false && access.canMove(temp[1], button, temp) == false && access.canMove(temp[2], button, temp) == false && access.canMove(temp[3], button, temp) == false && access.canMove(temp[4], button, temp) == false && access.canMove(temp[5], button, temp) == false && access.canMove(temp[6], button, temp) == false && access.canMove(temp[7], button, temp) == false && access.canMove(temp[8], button, temp) == false && access.canMove(temp[9], button, temp) == false && access.canMove(temp[10], button, temp) == false && access.canMove(temp[11], button, temp) == false && access.canMove(temp[12], button, temp) == false && access.canMove(temp[13], button, temp) == false)
            {
                endGame = true;
            }
        
        return endGame;
     }
     private boolean endGame = true;
     /**
      * this method determines whether the game is a win or a loss depending on the number
      * of pegs left on the board when endGame is found to be true.
      * @param   button - passes GameButton[] object for use in the method
      *          temp - passes Peg[] object for use in the method
      *          access - passes Rules object for use in the method
      *          temp1 - passes ArrayList<Peg> object for use in the method
      * @return  isWinner - false if pegs on board exceed one, true if pegs on board are one
      */
     public boolean isWinner(GameButton[] button, Peg[] temp, Rules access, ArrayList<Peg> temp1)
     {
        if(endGame(button, temp, access) == true)
        {
            
            int pegs = temp1.size();
            if(pegs == 13)
            {
                isWinner = true;
            }
            else if(pegs < 13)
            {
                isWinner = false;
            }
        }
        else
        {
            isWinner = false;
        }
        return isWinner;
     }
     private boolean isWinner = true;
    /**
     * this method will display a message depending on the Outcome found in isWinner,
     * depending on the number of pegs left on the board it will display different messages.
     * @param   button - passes GameButton[] object for use in the method
     *          temp - passes Peg[] object for use in the method
     *          access - passes Rules object for use in the method
     *          temp1 - passes ArrayList<Peg> object for use in the method
     */
    public void message(GameButton[] button, Peg[] temp, Rules access, ArrayList<Peg> temp1)
    {
        if(isWinner(button, temp, access, temp1) == true && endGame(button, temp, access) == true)
        {
            JOptionPane.showMessageDialog(null, "!!!You have won!!! CONGRATULATIONS!!!");
            System.exit(0);
        }
        else if(isWinner(button, temp, access, temp1) == false && endGame(button, temp, access) == true)
        {
            JOptionPane.showMessageDialog(null, "FAILURE, try again");
            System.exit(0);
        }
    }

}