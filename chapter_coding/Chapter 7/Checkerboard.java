import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

public class Checkerboard
{
    public Checkerboard(int xSquares, int ySquares, int pickSize)
    {
        squares = xSquares;
        squares1 = ySquares;
        size = pickSize;
        
    }
    public void draw(Graphics2D g2)
    {
            
            int x1 = 0;
            int y1 = 0;
            int mult1 = 0;
            int mult = 0;
            
            
        
        for (int a = 0; a < squares; a++)
        {
            
            
            for (int b = 0; b < squares1; b++)
            {
                int s = (a + b) % 2;
                
                
                if (s == 0)
                {
                    Rectangle box = new Rectangle(x1 + mult1, y1 + mult, size, size);
                    g2.setColor(Color.BLACK);
                    g2.fill(box);
                }
                else
                {
                    Rectangle box = new Rectangle(x1 + mult1, y1 + mult, size, size);
                    g2.setColor(Color.WHITE);
                    g2.fill(box);
                    
                }
                 mult1 = mult1 + size;
                 
             }
             mult = mult + size;
             mult1 = 0;
         }
     }
    private int squares;
    private int squares1;
    private int size;
    
}