/**
 * This is the basic object of all
 * buttons within the Peg Game.
 * 
 * @author (Nikita Shulzhenko) 
 * @version (March 14th, 2008 : Ver 1.0)
 */
import java.awt.Color;
import java.awt.Insets;
import javax.swing.JButton;

public class GameButton extends JButton
{
    /**
     * Constructs a GameButton without
     * a border, or margins. Also,
     * flaunts a white background.
     */
    public GameButton()
    {
        super();
        setBorderPainted(false);
        setBackground(Color.WHITE);
        setMargin(new Insets(0, 0, 0, 0));
    }
    // This is placed here for inheritance-acessibility
    protected IconGenerator icogen = new IconGenerator();
}
