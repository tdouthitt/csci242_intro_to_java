import java.util.ArrayList;
import javax.swing.ImageIcon;
/**
 * This class will create a Peg object and various methods acting upon
 * the peg for use in the PegGame package. This includes how the peg moves.
 * @author (Taylor Douthitt & Brad Hemmingsen)
 * @version (3-26-09)
 */
public class Peg
{
    /**
     * Constructor for object of class Peg
     * @param   aLocation - this number will be the peg's starting 
     *                      position on the board
     */   
    public Peg(int aLocation)
    {
        location = aLocation;
    }
    /**
     * This method will return the peg object's current location
     * number
     * @return  location - number designating place on Peg board
     */
    public int getLocation()
    {
        return location;
    }
    public void setLocation(int set)
    {
        location = set;
    }
    /**
     * This method will call canMove() to see if it is able to move,
     * if it can it will simulate the movement of a Peg by changing
     * values of the button and peg objects following the guidelines of 
     * the PegGame rules
     * 
     * @param   button - passes GameButton[] object for use in the method
     *          temp - passes ArrayList<Peg> object for use in the method
     *          access - passes Rules object for use in the method
     * 
     */
    public void makeMove(GameButton[] button, Rules access, Peg[] temp, ArrayList<Peg> temp1)
    {
       if(access.canMove(this, button, temp))
       {
           if(location == button[0].getPosition())
           {
                if(button[1].getOccupied() == true && button[3].getOccupied() == false && button[3].getClicked() == true)
                {
                    button[0].setIcon(empty);
                    button[1].setIcon(empty);
                    button[3].setIcon(full);
                    button[0].setOccupied(false);
                    button[1].setOccupied(false);
                    button[3].setOccupied(true);
                    location = button[3].getPosition();
                    //remove peg with same position as button[1] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[1].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
                else if(button[2].getOccupied() == true && button[5].getOccupied() == false && button[5].getClicked() == true)
                {
                    button[0].setIcon(empty);
                    button[2].setIcon(empty);
                    button[5].setIcon(full);
                    button[0].setOccupied(false);
                    button[2].setOccupied(false);
                    button[5].setOccupied(true);
                    button[5].setIcon(full);
                    location = button[5].getPosition();
                    //remove peg with same position as button[2] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[2].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
            
            }
            if(location == button[1].getPosition())
            {
                if(button[3].getOccupied() == true && button[6].getOccupied() == false && button[6].getClicked() == true)
                {
                    button[1].setIcon(empty);
                    button[3].setIcon(empty);
                    button[6].setIcon(full);
                    button[1].setOccupied(false);
                    button[3].setOccupied(false);
                    button[6].setOccupied(true);
                    button[6].setIcon(full);
                    location = button[6].getPosition();
                    //remove peg with same position as button[3] from Array;
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[3].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
                else if(button[4].getOccupied() == true && button[8].getOccupied() == false && button[8].getClicked() == true)
                {
                    button[1].setIcon(empty);
                    button[4].setIcon(empty);
                    button[8].setIcon(full);
                    button[1].setOccupied(false);
                    button[4].setOccupied(false);
                    button[8].setOccupied(true);
                    button[8].setIcon(full);
                    location = button[8].getPosition();
                    //remove peg with same position as button23 from Array;
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[4].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
           
            }
            if(location == button[2].getPosition())
            {
                if(button[4].getOccupied() == true && button[7].getOccupied() == false && button[7].getClicked() == true)
                {
                    button[2].setIcon(empty);
                    button[4].setIcon(empty);
                    button[7].setIcon(full);
                    button[2].setOccupied(false);
                    button[4].setOccupied(false);
                    button[7].setOccupied(true);
                    button[7].setIcon(full);
                    location = button[7].getPosition();
                    //remove peg with same position as button[4] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[4].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
                else if(button[5].getOccupied() == true && button[9].getOccupied() == false && button[9].getClicked() == true)
                {
                    button[2].setIcon(empty);
                    button[5].setIcon(empty);
                    button[9].setIcon(full);
                    button[2].setOccupied(false);
                    button[5].setOccupied(false);
                    button[9].setOccupied(true);
                    button[9].setIcon(full);
                    location = button[9].getPosition();
                    //remove peg with same position as button[5] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[5].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
           
            }
            if(location == button[3].getPosition())
            {
                if(button[1].getOccupied() == true && button[0].getOccupied() == false && button[0].getClicked() == true)
                {
                    button[3].setIcon(empty);
                    button[1].setIcon(empty);
                    button[0].setIcon(full);
                    button[3].setOccupied(false);
                    button[1].setOccupied(false);
                    button[0].setOccupied(true);
                    button[0].setIcon(full);
                    location = button[0].getPosition();
                    //remove peg with same position as button[1] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[1].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
                else if(button[4].getOccupied() == true && button[5].getOccupied() == false && button[5].getClicked() == true)
                {
                    button[3].setIcon(empty);
                    button[4].setIcon(empty);
                    button[5].setIcon(full);
                    button[3].setOccupied(false);
                    button[4].setOccupied(false);
                    button[5].setOccupied(true);
                    button[5].setIcon(full);
                    location = button[5].getPosition();
                    //remove peg with same position as button[4] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[4].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
                else if(button[7].getOccupied() == true && button[12].getOccupied() == false && button[12].getClicked() == true)
                {
                    button[3].setIcon(empty);
                    button[7].setIcon(empty);
                    button[12].setIcon(full);
                    button[3].setOccupied(false);
                    button[7].setOccupied(false);
                    button[12].setOccupied(true);
                    button[12].setIcon(full);
                    location = button[12].getPosition();
                    //remove peg with same position as button[7] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[7].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
                else if(button[6].getOccupied() == true && button[10].getOccupied() == false && button[10].getClicked() == true)
                {
                    button[3].setIcon(empty);
                    button[6].setIcon(empty);
                    button[10].setIcon(full);
                    button[3].setOccupied(false);
                    button[6].setOccupied(false);
                    button[10].setOccupied(true);
                    button[10].setIcon(full);
                    location = button[10].getPosition();
                    //remove peg with same position as button[6] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[6].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
            
            }
            if(location == button[4].getPosition())
            {
                if(button[7].getOccupied() == true && button[11].getOccupied() == false && button[11].getClicked() == true)
                {
                    button[4].setIcon(empty);
                    button[7].setIcon(empty);
                    button[11].setIcon(full);
                    button[4].setOccupied(false);
                    button[7].setOccupied(false);
                    button[11].setOccupied(true);
                    button[11].setIcon(full);
                    location = button[11].getPosition();
                    //remove peg with same position as button[7] from Array;
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[7].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
                else if(button[8].getOccupied() == true && button[13].getOccupied() == false && button[13].getClicked() == true)
                {
                    button[4].setIcon(empty);
                    button[8].setIcon(empty);
                    button[13].setIcon(full);
                    button[4].setOccupied(false);
                    button[8].setOccupied(false);
                    button[13].setOccupied(true);
                    button[13].setIcon(full);
                    location = button[13].getPosition();
                    //remove peg with same position as button[8] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[8].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
           
            }
            if(location == button[5].getPosition())
            {
                if(button[2].getOccupied() == true && button[0].getOccupied() == false && button[0].getClicked() == true)
                {
                    button[5].setIcon(empty);
                    button[2].setIcon(empty);
                    button[0].setIcon(full);
                    button[5].setOccupied(false);
                    button[2].setOccupied(false);
                    button[0].setOccupied(true);
                    button[0].setIcon(full);
                    location = button[0].getPosition();
                    //remove peg with same position as button[2] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[2].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
                else if(button[4].getOccupied() == true && button[3].getOccupied() == false && button[3].getClicked() == true)
                {
                    button[5].setIcon(empty);
                    button[4].setIcon(empty);
                    button[3].setIcon(full);
                    button[5].setOccupied(false);
                    button[4].setOccupied(false);
                    button[3].setOccupied(true);
                    button[3].setIcon(full);
                    location = button[3].getPosition();
                    //remove peg with same position as button[4] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[4].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
                else if(button[8].getOccupied() == true && button[12].getOccupied() == false && button[12].getClicked() == true)
                {
                    button[5].setIcon(empty);
                    button[8].setIcon(empty);
                    button[12].setIcon(full);
                    button[5].setOccupied(false);
                    button[8].setOccupied(false);
                    button[12].setOccupied(true);
                    button[12].setIcon(full);  
                    location = button[12].getPosition();
                    //remove peg with same position as button[8] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[8].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
                else if(button[9].getOccupied() == true && button[14].getOccupied() == false && button[14].getClicked() == true)
                {
                    button[5].setIcon(empty);
                    button[9].setIcon(empty);
                    button[14].setIcon(full);
                    button[5].setOccupied(false);
                    button[9].setOccupied(false);
                    button[14].setOccupied(true);
                    button[14].setIcon(full);
                    location = button[14].getPosition();
                    //remove peg with same position as button[9] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[9].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
            
            }
            if(location == button[6].getPosition())
            {
                if(button[3].getOccupied() == true && button[1].getOccupied() == false && button[1].getClicked() == true)
                {
                    button[6].setIcon(empty);
                    button[3].setIcon(empty);
                    button[1].setIcon(full);
                    button[6].setOccupied(false);
                    button[3].setOccupied(false);
                    button[1].setOccupied(true);
                    button[1].setIcon(full);
                    location = button[1].getPosition();
                    //remove peg with same position as button[3] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[3].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
                else if(button[7].getOccupied() == true && button[8].getOccupied() == false && button[8].getClicked() == true)
                {
                    button[6].setIcon(empty);
                    button[7].setIcon(empty);
                    button[8].setIcon(full);
                    button[6].setOccupied(false);
                    button[7].setOccupied(false);
                    button[8].setOccupied(true);
                    button[8].setIcon(full);
                    location = button[8].getPosition();
                    //remove peg with same position as button[7] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[7].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
         
            }
            if(location == button[7].getPosition())
            {
                if(button[4].getOccupied() == true && button[2].getOccupied() == false && button[2].getClicked() == true)
                {
                    button[7].setIcon(empty);
                    button[4].setIcon(empty);
                    button[2].setIcon(full);
                    button[7].setOccupied(false);
                    button[4].setOccupied(false);
                    button[2].setOccupied(true);
                    button[2].setIcon(full);
                    location = button[2].getPosition();
                    //remove peg with same position as button[4] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[4].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
                else if(button[8].getOccupied() == true && button[9].getOccupied() == false && button[9].getClicked() == true)
                {
                    button[7].setIcon(empty);
                    button[8].setIcon(empty);
                    button[9].setIcon(full);
                    button[7].setOccupied(false);
                    button[8].setOccupied(false);
                    button[9].setOccupied(true);
                    button[9].setIcon(full);
                    location = button[9].getPosition();
                    //remove peg with same position as button[8] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[8].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
           
            }
            if(location == button[8].getPosition())
            {
                if(button[4].getOccupied() == true && button[1].getOccupied() == false && button[1].getClicked() == true)
                {
                    button[8].setIcon(empty);
                    button[4].setIcon(empty);
                    button[1].setIcon(full);
                    button[8].setOccupied(false);
                    button[4].setOccupied(false);
                    button[1].setOccupied(true);
                    button[1].setIcon(full);
                    location = button[1].getPosition();
                    //remove peg with same position as button[4] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[4].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
                else if(button[7].getOccupied() == true && button[6].getOccupied() == false && button[6].getClicked() == true)
                {
                    button[8].setIcon(empty);
                    button[7].setIcon(empty);
                    button[6].setIcon(full);
                    button[8].setOccupied(false);
                    button[7].setOccupied(false);
                    button[6].setOccupied(true);
                    button[6].setIcon(full);
                    location = button[6].getPosition();
                    //remove peg with same position as button[7] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[7].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
            
            }
            if(location == button[9].getPosition())
            {
                if(button[5].getOccupied() == true && button[2].getOccupied() == false && button[2].getClicked() == true)
                {
                    button[9].setIcon(empty);
                    button[5].setIcon(empty);
                    button[2].setIcon(full);
                    button[9].setOccupied(false);
                    button[5].setOccupied(false);
                    button[2].setOccupied(true);
                    button[2].setIcon(full);
                    location = button[2].getPosition();
                    //remove peg with same position as button[5] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[5].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
                else if(button[8].getOccupied() == true && button[7].getOccupied() == false && button[7].getClicked() == true)
                {
                    button[9].setIcon(empty);
                    button[8].setIcon(empty);
                    button[7].setIcon(full);
                    button[9].setOccupied(false);
                    button[8].setOccupied(false);
                    button[7].setOccupied(true);
                    button[7].setIcon(full);
                    location = button[7].getPosition();
                    //remove peg with same position as button[8] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[8].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
           
            }
            if(location == button[10].getPosition())
            {
                if(button[6].getOccupied() == true && button[3].getOccupied() == false)
                {
                    button[10].setIcon(empty);
                    button[6].setIcon(empty);
                    button[3].setIcon(full);
                    button[10].setOccupied(false);
                    button[6].setOccupied(false);
                    button[3].setOccupied(true);
                    button[3].setIcon(full);
                    location = button[3].getPosition();
                    //remove peg with same position as button[6] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[6].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
                else if(button[11].getOccupied() == true && button[12].getOccupied() == false && button[12].getClicked() == true)
                {
                    button[10].setIcon(empty);
                    button[11].setIcon(empty);
                    button[12].setIcon(full);
                    button[10].setOccupied(false);
                    button[11].setOccupied(false);
                    button[12].setOccupied(true);
                    button[12].setIcon(full);
                    location = button[12].getPosition();
                    //remove peg with same position as button[11] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[11].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
            
            }
            if(location == button[11].getPosition())
            {
                if(button[7].getOccupied() == true && button[4].getOccupied() == false && button[4].getClicked() == true)
                {
                    button[11].setIcon(empty);
                    button[7].setIcon(empty);
                    button[4].setIcon(full);
                    button[11].setOccupied(false);
                    button[7].setOccupied(false);
                    button[4].setOccupied(true);
                    button[4].setIcon(full);
                    location = button[4].getPosition();
                    //remove peg with same position as button[7] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[7].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
                else if(button[12].getOccupied() == true && button[13].getOccupied() == false && button[13].getClicked() == true)
                {
                    button[11].setIcon(empty);
                    button[12].setIcon(empty);
                    button[13].setIcon(full);
                    button[11].setOccupied(false);
                    button[12].setOccupied(false);
                    button[13].setOccupied(true);
                    button[13].setIcon(full);
                    location = button[13].getPosition();
                    //remove peg with same position as button[12] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[12].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
            
            }
            if(location == button[12].getPosition())
            {
                if(button[7].getOccupied() == true && button[3].getOccupied() == false && button[3].getClicked() == true)
                {
                    button[12].setIcon(empty);
                    button[7].setIcon(empty);
                    button[3].setIcon(full);
                    button[12].setOccupied(false);
                    button[7].setOccupied(false);
                    button[3].setOccupied(true);
                    button[3].setIcon(full);
                    location = button[3].getPosition();
                    //remove peg with same position as button[7] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[7].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
                else if(button[8].getOccupied() == true && button[5].getOccupied() == false && button[5].getClicked() == true)
                {
                    button[12].setIcon(empty);
                    button[8].setIcon(empty);
                    button[5].setIcon(full);
                    button[12].setOccupied(false);
                    button[8].setOccupied(false);
                    button[5].setOccupied(true);
                    button[5].setIcon(full);
                    location = button[5].getPosition();
                    //remove peg with same position as button[8] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[8].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
                else if(button[11].getOccupied() == true && button[10].getOccupied() == false && button[10].getClicked() == true)
                {
                    button[12].setIcon(empty);
                    button[11].setIcon(empty);
                    button[10].setIcon(full);
                    button[12].setOccupied(false);
                    button[11].setOccupied(false);
                    button[10].setOccupied(true);
                    button[10].setIcon(full);
                    location = button[10].getPosition();
                    //remove peg with same position as button[11] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[11].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
                else if(button[13].getOccupied() == true && button[14].getOccupied() == false && button[14].getClicked() == true)
                {
                    button[12].setIcon(empty);
                    button[13].setIcon(empty);
                    button[14].setIcon(full);
                    button[12].setOccupied(false);
                    button[13].setOccupied(false);
                    button[14].setOccupied(true);
                    button[14].setIcon(full);
                    location = button[14].getPosition();
                    //remove peg with same position as button[13] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[13].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
           
            }
            if(location == button[13].getPosition())
            {
                if(button[8].getOccupied() == true && button[4].getOccupied() == false && button[4].getClicked() == true)
                {
                    button[13].setIcon(empty);
                    button[8].setIcon(empty);
                    button[4].setIcon(full);
                    button[13].setOccupied(false);
                    button[8].setOccupied(false);
                    button[4].setOccupied(true);
                    button[4].setIcon(full);
                    location = button[4].getPosition();
                    //remove peg with same position as button[8] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[8].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                    
                }
                else if(button[12].getOccupied() == true && button[11].getOccupied() == false && button[11].getClicked() == true)
                {
                    button[13].setIcon(empty);
                    button[12].setIcon(empty);
                    button[11].setIcon(full);
                    button[13].setOccupied(false);
                    button[12].setOccupied(false);
                    button[11].setOccupied(true);
                    button[11].setIcon(full);
                    location = button[11].getPosition();
                    //remove peg with same position as button[12] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[12].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
            
            }
            if(location == button[14].getPosition())
            {
                if(button[9].getOccupied() == true && button[5].getOccupied() == false && button[5].getClicked() == true)
                {
                    button[14].setIcon(empty);
                    button[9].setIcon(empty);
                    button[5].setIcon(full);
                    button[14].setOccupied(false);
                    button[9].setOccupied(false);
                    button[5].setOccupied(true);
                    button[5].setIcon(full);
                    location = button[5].getPosition();
                    //remove peg with same position as button[9] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[9].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
                else if(button[13].getOccupied() == true && button[12].getOccupied() == false && button[12].getClicked() == true)
                {
                    button[14].setIcon(empty);
                    button[13].setIcon(empty);
                    button[12].setIcon(full);
                    button[14].setOccupied(false);
                    button[13].setOccupied(false);
                    button[12].setOccupied(true);
                    button[12].setIcon(full);
                    location = button[12].getPosition();
                    //remove peg with same position as button[13] from Array
                    for(int i = 0; i < temp.length; i++)
                    {
                         
                        if(temp[i].getLocation() == button[13].getPosition())
                        {
                            temp[i].setLocation(-1);
                            temp1.add(temp[i]);
                        }
                    }
                    for(int x = 0; x < button.length; x++)
                    {
                        button[x].setClicked(false);
                    }
                }
            
            } 
            
       }
    }
   private int location;
   private ImageIcon full = new ImageIcon("full.gif");
   private ImageIcon empty = new ImageIcon("empty.gif");
   private ImageIcon selected = new ImageIcon("selected.gif");
   
}
