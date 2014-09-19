/**
 * This is the button-type which is used
 * for aesthetic purposes, such as blank
 * boxes or titles and graphics.
 * 
 * @author (Nikita Shulzhenko) 
 * @version (March 15th, 2008 : Ver 1.0)
 */
import java.awt.Color;

public class AestheticButton extends GameButton
{
    /**
     * Constructs a GameButton
     * with the benefits of an
     * Aesthetic button.
     */
    public AestheticButton()
    {
        super();
    }
    
    /**
     * Method used for
     * creating completely
     * empty and white buttons
     * with no purpose or use.
     */
    public void makeEmpty()
    {
        setEnabled(false);
    }
    
    /**
     * Method used to display
     * the title in a big,
     * colorful button.
     */
    public void makeTitle()
    {
        setEnabled(true);
        setIcon(icogen.getTitleIcon()); 
        setContentAreaFilled(false);
    }    
}
