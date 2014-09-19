/**
 * Calls image files from root folder and assigns them to variables.
 * Also returns those image files to be used elsewhere.
 * 
 * @author (Nikita Shulzhenko) 
 * @version (March 17th, 2008 : Ver 2.0)
 */
import javax.swing.ImageIcon;

public class IconGenerator
{
    /**
     * Constructs an IconGenerator object
     * with four icon images stored:
     * a hole with a peg, and an empty hole, a title,
     * and a red 'selected-peg' graphic
     * (Precondition: the files "empty.gif", "title.gif,"
     * "full.gif" and "selected.gif" are in the folder of the project.)
     */
    public IconGenerator()
    {
        emptyIcon = new ImageIcon("empty.gif");
        fullIcon = new ImageIcon("full.gif");
        titleIcon = new ImageIcon("title.gif");
        selectedIcon = new ImageIcon("selected.gif");
    }
    
    /**
     * Returns the emptyIcon
     * @return ImageIcon emptyIcon
     */
    public ImageIcon getEmptyIcon() 
    {
        return emptyIcon;
    }
    
    /**
     * Returns the fullIcon
     * @return ImageIcon fullIcon
     */
    public ImageIcon getFullIcon()
    {
        return fullIcon;
    }
    
    /**
     * Returns the titleIcon
     * @return ImageIcon titleIcon
     */
    public ImageIcon getTitleIcon()
    {
        return titleIcon;
    }
    
    /**
     * Returns the selectedIcon
     * @return ImageIcon selectedIcon
     */
    public ImageIcon getSelectedIcon()
    {
        return selectedIcon;
    }
    
    // Instance Variables
    private ImageIcon emptyIcon;
    private ImageIcon fullIcon;
    private ImageIcon titleIcon;
    private ImageIcon selectedIcon;
}