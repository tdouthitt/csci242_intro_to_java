import javax.swing.JButton;
/**
 * This class will create an extension of the JButton class
 * with additional parameters and methods for use in 
 * the PegGame package
 * @author (Taylor Douthitt & Brad Hemmingsen)
 * @version (3-26-09)
 */
public class Card extends JButton
{
    /**
     * Basic Constructor for object of class Card.
     */
    public Card()
    {
        
    }
    public Card(int aMatch, boolean aClicked)
    {
        match = aMatch;
        clicked = aClicked;
        JButton button = new JButton();
        
    }
    public int getMatch()
    {
        return match;
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

    public void setClicked(boolean y)
    {
        clicked = y;
    }
    private int match;
    private boolean clicked;
}