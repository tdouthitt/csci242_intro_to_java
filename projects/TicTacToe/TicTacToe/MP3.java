//imports all neccessary classes to run the MP3 class.

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

/**
 * Class MP3 sets the filename to be played in the MenuFrame. Provides methods to play music and to close
 * the music player.
 * 
 * @author (Taylor Douthitt) 
 * @version (11-06-08)
 */
public class MP3 
{
    private String filename="Sandstorm.mp3";//Sets the filename to specified file destination.
    private Player player; 

    // constructor that takes the name of an MP3 file
    public MP3(String filename) 
    {
        this.filename = filename;//Sets the constructor filename to filename.
    }
    //This method is used to close out of the player and terminate the music player.
    public void close() 
    { 
        if (player != null) player.close();//assesses if player is null and whether or not to close it. 
    }

    // play the MP3 file to the sound card
    public void play() 
    {
        try 
        {
            FileInputStream fis     = new FileInputStream(filename);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
        }
        catch (Exception e) 
        {
            System.out.println("Problem playing file " + filename);
            System.out.println(e);
        }

        // run in new thread to play in background
        new Thread() 
        {
            public void run() 
            {
                try 
                { 
                    player.play();
                
                }
                catch (Exception e) 
                {
                    System.out.println(e); 
                }
            }
        }.start();

    }
} 



