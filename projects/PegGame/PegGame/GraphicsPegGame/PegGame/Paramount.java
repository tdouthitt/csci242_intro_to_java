/**
 * This is the main for the Peg Game. 
 * The object of the game is to eliminate all
 * but one peg from the board. This is done by
 * clicking on the peg you wish to select, allowing
 * it to turn red, and then clicking an empty space
 * 2 spaces away. Through using this process you can
 * slowly eliminate the pegs. Best Wishes.
 * 
 * @author (Nikita Shulzhenko) 
 * @version (March 11th, 2008 : Ver 1.0)
 */
import javax.swing.JFrame;

public class Paramount
{
   public static void main(String[] args)
   {
       // Creates a custom frame where all
       // actions are automatically carried out.
       JFrame frame = new LathGUI();
       // Enjoy!
   }
}