/**
 * This class creates a clicker object that keeps track of the number of clicks
 * the player has used. The player will either be on their first click or their 
 * second click. Once they reach their second click, the clicker sets itself back
 * to the first click. This allows the program to tell whether a peg is being selected
 * or an empty space is being pressed to jump a peg.
 * @author(Taylor Douthitt & Brad Hemmingsen)
 * @version (3-29-09)
 */

public class Clicker
{   
    // Declares the integer check private
    private int check;
 
    /**
     * Constructor for the clicker object of the class Clicker
     */
    public Clicker()
    {
        check = 0;
    }
    /**
     * This method will return the clicker object's current 'check' or the
     * number of clicks that the system is currently at.
     * @return check- the number signifying which click the user is on (1 or 2)
     */ 
    public int checkClick()
    {
        return check;
    }
    /**
     * This method sets the clicker object so that it has an integer value of 
     * 1. This means that the user has clicked something on the board, and it is
     * their first time clicking a button.
     */
    public void clickOne()
    {
        check = 1; // This sets the check to 1 so the system knows that the next
                   // click is the second one.
    }
    /**
     * This method sets the clicker object so that it has an integer value of 
     * 2. This means that the user has clicked something on the board, 
     * and that it is their second time clicking a button.
     */ 
    public void clickTwo()
    {
        check = 0; // This resets check back to zero so the system know the 
                   // the next next click is the first one again.
    }
        
}
