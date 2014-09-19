/**
 * Class WinMatch is used to check for and initiate the win, tie, and, losing statements of the game.
 * 
 * @author (Josh Kaufman) 
 * @version (11-06-08)
 */
public class WinMatch
{

    private int check;
    
    private int X;
    private int O;
    
    private int b1;
    private int b2;
    private int b3;
    private int b4;
    private int b5;
    private int b6;
    private int b7;
    private int b8;
    private int b9;
    //This method sets the variables to be used in determining a win, lose, or a tie.
    public WinMatch()
    {
        check = 0;
        X = 1;
        O = 2;
    }
    //This method checks if either player has met the neccessary requirements to win the game or if the players tied.
    public int checkWinner(int box1, int box2, int box3, int box4, int box5, int box6, int box7, int box8, int box9)
    {
        b1 = box1;
        b2 = box2;
        b3 = box3;
        b4 = box4;
        b5 = box5;
        b6 = box6;
        b7 = box7;
        b8 = box8;
        b9 = box9;
        
        check = b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8 + b9;
        //Check for a tie in the game.
        if((check == 21))
        return -1;  

// Checks rows
   //Checks for win in first row.
    check = b1 + b2 + b3;
    if(check == 12)
        return O;
    else if(check == 3)
        return X;
    //Checks for win in second row.
    check = b4 + b5 + b6;
    if(check == 12)
        return O;
    else if(check == 3)
        return X;
    //Checks for win in third row.
    check = b7 + b8 + b9;
    if(check == 12)
        return O;
    else if(check == 3)
        return X;

// Checks colums
    //Checks for win in first column.
    check = b1 + b4 + b7;
    if(check == 12)
        return O;
    else if(check == 3)
        return X;
    //Checks for win in second column.      
    check = b2 + b5 + b8;
    if(check == 12)
        return O;
    else if(check == 3)
        return X;
    //Checks for win in third column.
    check = b3 + b6 + b9;
    if(check == 12)
        return O;
    else if(check == 3)
        return X;

// Checks Diagnally
    //Checks for a win in the diagonal from upper left to lower right or vise versa.
    check = b1 + b5 + b9;
    if(check == 12)
        return O;
    else if(check == 3)
        return X;
    //Checks for a win in the diagonal from upper right to lower left or vise versa.
    check = b3 + b5 + b7;
    if(check == 12)
        return O;
    else if(check == 3)
        return X;

        return 0;
    }
    
    
    

    
}