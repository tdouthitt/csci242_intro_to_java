import  sun.audio.*;   
import  java.io.*;
import  javazoom.jl.player.*;
import  javazoom.jl.decoder.*;
import  javazoom.jl.converter.*;
public class Music  
{
    String filename = "SoA.mp3";
    public Music()
    {
        try
        {
            InputStream in = new FileInputStream(filename);
                                      
            AudioStream as = new AudioStream (in);         

            out = new javazoom.jl.player.Player(in);
        }
            catch (Exception e)
            {
                System.out.println("Can't open file");
            }
    }
    public void start()
    {
        try
        {
            
            out.play();
        }
            catch (Exception e)
            {
                System.out.println("Can't play file");
            }
    }

     private javazoom.jl.player.Player out;   

   
}