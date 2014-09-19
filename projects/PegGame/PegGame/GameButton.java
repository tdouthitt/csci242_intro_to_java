import javax.swing.JButton;
/**
 * This class will create an extension of the JButton class
 * with additional parameters and methods for use in 
 * the PegGame package
 * @author (Taylor Douthitt & Brad Hemmingsen)
 * @version (3-29-09)
 */
public class GameButton extends JButton
{
    /**
     * Basic Constructor for object of class GameButton.
     */
    public GameButton()
    {
        
    }
    /**
     * Constructor for object of class GameButton
     * @param   aPosition - position number in board layout
     *          aOccupied - true if spot is occupied, false is empty
     */
    public GameButton(int aPosition, boolean aOccupied, boolean aClicked)
    {
        position = aPosition;
        occupied = aOccupied;
        clicked = aClicked;
        JButton button = new JButton();
        
    }
    /**
     * This method will return the position number assigned to 
     * the button object calling it
     * @return  position - the position number assigned to the corresponding button
     */
    public int getPosition()
    {
        return position;
    }
    /**
     * This method will return whether or not the button is 
     * occupied or empty
     * @return  occupied - true if space is occupied, false if empty
     */
    public boolean getOccupied()
    {
        return occupied;
    }
    /**
     * This method will return whether or not the button is 
     * clicked or not
     * @return  clicked - true if button was clicked, false if not clicked
     */
    public boolean getClicked()
    {
        return clicked;
    }
    /**
     * This method is used to set a button's occupied parameter to
     * a corresponding boolean assignment.(true, false)
     * @param   x - this is the new value to be assigned to the button
     * 
     */
    public void setOccupied(boolean x)
    {
        occupied = x;
    }
    /**
     * This method is used to set a button's clicked parameter to
     * a corresponding boolean assignment.(true, false)
     * @param   y - this is the new value to be assigned to the button
     * 
     */
    public void setClicked(boolean y)
    {
        clicked = y;
    }
    private int position;
    private boolean clicked;
    private boolean occupied;
}