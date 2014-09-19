/**
 * The 'brains' of the Peg Game.
 * Decides what can move, where and when. And whether
 * or not a game is over or won.
 * 
 * @author (Nikita Shulzhenko) 
 * @version (March 18th, 2008 : Ver 1.0)
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reticulation implements ActionListener
{
    /**
     * Constructs a Reticulation Object
     */
    public Reticulation(){/*Empty space*/}
    
    /**
     * Allows the rules to recieve the set of 
     * pegs being played with.
     * @param ArrayList<Peg> pegs The pegs being used.
     */
    public void setUpGame(ArrayList<Peg> pegs)
    {
        pegSet = pegs;
    }
    
    /**
     * Performs a set of actions to determine the
     * outcome and progress of the game after an 
     * action has been triggered.
     * @param ActionEvent event The triggered event
     */
    public void actionPerformed(ActionEvent event)
    {
        // First loop used to find the button that triggered the action.
        for(int pegNumber = 0; pegNumber < pegSet.size(); pegNumber++)
        {
            if(event.getSource() == pegSet.get(pegNumber))
            {
                // Once the button is found, it is put through a series of checks.
                //
                // If the button is full and the 'moving peg' (peg that leaps over)
                // has yet been defined, then...
                if(pegSet.get(pegNumber).getCondition() == 1 && movingPeg == -1)
                {
                    // The peg's index is stored in movingPeg.
                    movingPeg = pegNumber;
                    // It is turned to the color red -- 'selected'.
                    pegSet.get(pegNumber).setCondition("selected");
                    // And is refreshed.
                    pegSet.get(pegNumber).updateUI();
                }
                // If the button is full and the 'moving peg' has already
                // been defined, then...
                if(pegSet.get(pegNumber).getCondition() == 1 && movingPeg != -1)
                {
                    // The old moving peg is cleared of its red taint
                    pegSet.get(movingPeg).setCondition("full");
                    // And the newly clicked peg becomes the movingPeg
                    movingPeg = pegNumber;
                    pegSet.get(pegNumber).setCondition("selected");
                    // The button is repainted.
                    pegSet.get(pegNumber).updateUI();
                }
                // If the button is empty and a 'moving peg' has already been
                // defined, then...
                if(pegSet.get(pegNumber).getCondition() == 0 && movingPeg != -1)
                {
                    // The empty button is set as the empty hole which the
                    // movingPeg is set to move into.
                    emptyHole = pegNumber;
                    // And the UI is updated.
                    pegSet.get(pegNumber).updateUI();
                }
                // An 'if' for a hole with no 'moving peg' defined is a pointless
                // waste of space so I decided not to implement it. It would do nothing.
            }
        }
        
        // This 'if-statement' will only run once an emptyHole
        // has been targeted by a movingPeg.
        if(emptyHole != -1)
        {
            // This for loops runs through and tries to guess the peg being jumped over.
            for(int deletedPeg = 1; deletedPeg < 14; deletedPeg++)
            {
                // This for loop is used to run through one dimension of the solutions array.
                for(int cordCycle = 0; cordCycle < solutions.length; cordCycle++)
                {
                    // Here the if-statement matches up what the user has input, and all possible cordinations, to see
                    // what processes can be carried out to update the game and fulfill the users requests.
                    if(movingPeg == solutions[cordCycle][0] && deletedPeg == solutions[cordCycle][1] && emptyHole == solutions[cordCycle][2])
                    {
                        // Checks to make sure that the peg being jumped over
                        // contains a peg, and is not an empty hole.
                        if(pegSet.get(deletedPeg).getCondition() == 1)
                        {
                            // If a match has been found, then the buttons are updated.
                            //
                            // The emptyHole now becomes full and updated.
                            pegSet.get(emptyHole).setCondition("full");
                            pegSet.get(emptyHole).updateUI();
                            // The deleptedPeg now disapears and updates.
                            pegSet.get(deletedPeg).setCondition("empty");
                            pegSet.get(deletedPeg).updateUI();
                            // And the movingPeg is deleted as well for it moved.
                            pegSet.get(movingPeg).setCondition("empty");
                            pegSet.get(movingPeg).updateUI();
                        }
                    }
                }            
            }
            // Once the pegs have been processed
            // The utility variables are reset to
            // prepare for the next wave of clicks.
            clearVars();
        }   
        
        // Now that a full turn has been establised. 
        // The program checks to see if the game had
        // become impossible to finish or finished.
        if(isWin())
        {
            // If the game is won, the frame displays a congratulatory message and quits on the player.
            JOptionPane.showMessageDialog(null, "   Congratulations!\n You Are Too Smart... ", "              Smarter Than Nikita?", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        if(isGameOver())
        {
            // If the game is over, the frame displays a pity message and quits on the player.
            JOptionPane.showConfirmDialog(null, "        Wow! " + pegsLeft + " Pegs Left.\nLet's Hope You Do Better Next Time ", "                         Good Luck",  JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
    }
    
    /**
     * Performs a loop-ful check of all combinations
     * of pegs and solutions to see if the game
     * is over due to a lack of moves.
     */
    public boolean isGameOver()
    {
        // Boolean
        boolean gameOver = true;
        // The checker array used to compare
        // whats on the board with what works.
        int[][] checker = new int[15][3];
        // First loop is for checker[x][].
        // This allows for the cycling of the diff buttons.
        for(int x = 0; x < pegSet.size(); x++)
        {
            // Second loop is for the zeroth index
            // of the second dimension.
            for(int y = 0; y < pegSet.size(); y++)
            {
                // Third loop is for the first index
                // of the second dimension.
                for(int z = 0; z < pegSet.size(); z++)
                {
                    // Fourth loop is for the second index
                    // of the second dimension.
                    for(int a = 0; a < pegSet.size(); a++)
                    {
                        // With all the loops runnning, they 
                        // check to see what is in each spot 
                        // on the board, and then add it to the arry.
                        //
                        //If the first peg is filled, it is added.
                        if(pegSet.get(y).getCondition() == 1)
                        {
                            checker[x][0] = y;
                        }
                        // Otherwise an impossible number is placed.
                        else checker[x][0] = -1;
                        // If the middle peg is filled, it is added.
                        if(pegSet.get(z).getCondition() == 1)
                        {                          
                            checker[x][1] = z;
                        }
                        // Otherwise an impossible number is placed.
                        else checker[x][1] = -1;
                        // If the last peg is empty, it is added.
                        if(pegSet.get(a).getCondition() == 0)
                        {
                            checker[x][2] = a;
                        }
                        // Otherwise an impossible number is placed.
                        else checker[x][2] = -1;
                        // The final loop cycles through the list of solutions
                        // comparing them to each of the possible combinations
                        // which exsist on the board at that time.
                        for(int b = 0; b < solutions.length; b++)
                        {
                            if(checker[x][0] == solutions[b][0] && checker[x][1] == solutions[b][1] && checker[x][2] == solutions[b][2])
                            {
                                // If a match is found, the game is not over.
                                gameOver = false;
                            }
                        }
                    }
                }
            }
        }
        // Returns whether or not the game is over.
        return gameOver;
    }
    
    /**
     * Method that checks whether
     * or not the game has been won
     * by the player.
     * @return boolean playerWins Whether or not the player has won.
     */
    public boolean isWin()
    {
        // The number of pegs remaining.
        pegsLeft = 0;
        // Boolean
        boolean playerWins = false;
        // Cycles through all the pegs to see which
        // are full. Then adds 1 to pegsLeft if a
        // button is a full-hole.
        for(int i = 0; i < pegSet.size(); i++)
        {
            if(pegSet.get(i).getCondition() == 1)
            {
                pegsLeft++;
            }
        }
        // If there is only one peg left
        // then that means that the player has won.
        if(pegsLeft == 1)
        {
            playerWins = true;
        }
       // Return Value
       return playerWins;
    }                                    
    
    /**
     * Sets the utility variables
     * to thier default, 'un-toucehed'
     * states for the next round of pegs.
     */
    public void clearVars()
    {
        movingPeg = -1;
        emptyHole = -1;
    }
    // Instance Variables
    private ArrayList<Peg> pegSet;
    private int movingPeg = -1;
    private int emptyHole = -1;
    private int pegsLeft;
    
    // This is the list of all jumps that can be made
    // assuming that the triangle being used is in the
    // form of:
    //
    //          0     
    //        1   2     
    //      3   4   5
    //    6   7   8   9
    //  10  11  12  13  14
    //
    // The notation is as follows:
    // For Example -- { 3, 7, 12}
    //     The peg 3, when full, 
    //     can leap over the full
    //     peg 7, and into empty
    //     hole number 12.
    private int[][] solutions = {       {0, 1, 3},
                                        {0, 2, 5},
                                        {1, 3, 6},
                                        {1, 4, 8},
                                        {2, 4, 7},
                                        {2, 5, 9},
                                        {3, 1, 0},
                                        {3, 4, 5},
                                        {3, 7, 12},
                                        {3, 6, 10},
                                        {4, 7, 11},
                                        {4, 8, 13},
                                        {5, 2, 0},
                                        {5, 4, 3},
                                        {5, 8, 12},
                                        {5, 9, 14},
                                        {6, 3, 1},
                                        {6, 7, 8},
                                        {7, 4, 2},
                                        {7, 8, 9},
                                        {8, 4, 1},
                                        {8, 7, 6},
                                        {9, 5, 2},
                                        {9, 8, 7},
                                        {10, 6, 3},
                                        {10, 11, 12},
                                        {11, 7, 4},
                                        {11, 12, 13},
                                        {12, 11, 10},
                                        {12, 7, 3},
                                        {12, 8, 5},
                                        {12, 13, 14},
                                        {13, 8, 4},
                                        {13, 12, 11},
                                        {14, 9, 5},
                                        {14, 13, 12}    };                                             
    }