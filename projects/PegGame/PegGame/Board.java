import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

/**
 * This class will create a board frame that contains all the panels, buttons, and extras.
 * It is the class where the brains of the game are implemented into the buttons and the peg objects.
 * @author (Taylor Douthitt & Brad Hemmingsen)
 * @version (3-29-09)
 */

public class Board extends JFrame
{
        Rules access = new Rules(); //Creates a Rules object so that the rest of the class can access the rules.
        Outcome game = new Outcome(); //Creates an Outcome object so that the rest of the class can access the possible outcomes. 
        ActionListener listener = new Play(); //Creates an ActionListener so that it can be set to all 15 game buttons
        ArrayList<Peg> temp1 = new ArrayList<Peg>(); //Creates an ArrayList of type Peg 
        
        /**
         * Constructor for the class Board. The constructor calls the method createBoard.
         * This then constructs the board frame and initiates the setup of the game. 
         */
        public Board()
        {
            createBoard();     
        }
        
        /**
         *  This method will call other methods at the same time. This essentially sets up and puts
         *  together the brains of the system. It creates all of the buttons, organizes all of the panels, and sets the parameters for the frame. It also adds an asthetic character to the frame.
         */
        public void createBoard()
        {
            createButtons();
            organizePanels();
            setFrame();
            setTheme();         
        }
             
        /**
         * This method creates all of the buttons for the came. It creates 45 buttons, 15 actual game buttons and 30 
         * fake buttons to initialize the layout. This class also adds all of the buttons their panel 
         * and adds the action listeners to the buttons.
         */
        public void createButtons()
        {
            //
            button1.setEnabled(false);       //This sets the button so that it cannot be clicked. This is the same for all of the fake buttons. 
            button1.setBorderPainted(false); //This sets the button so that the border is not shown. This is the same for all of the fake buttons.
 
            button2.setEnabled(false);
            button2.setBorderPainted(false);
   
            button3.setEnabled(false);
            button3.setBorderPainted(false);

            button4.setEnabled(false);
            button4.setBorderPainted(false);

            button5.setActionCommand("Click1"); //This sets a specific action command to the active buttons. This allows the system to know exactly which button has been clicked.
            button5.setEnabled(true); //This sets the button sot that it can be clicked. This is the same for all of the game butons.
            button5.setIcon(empty); //This sets this buttons icon so that it is empty. This is the only button with this setting because it is the designated open hole button.
            button5.setBorderPainted(false);
            
            button6.setEnabled(false);
            button6.setBorderPainted(false);

            button7.setEnabled(false);
            button7.setBorderPainted(false);
   
            button8.setEnabled(false);
            button8.setBorderPainted(false);
  
            button9.setEnabled(false);
            button9.setBorderPainted(false);
     
            button10.setEnabled(false);
            button10.setBorderPainted(false);
     
            button11.setEnabled(false);
            button11.setBorderPainted(false);
       
            button12.setEnabled(false);
            button12.setBorderPainted(false);
 
            button13.setActionCommand("Click2"); //This sets a specific action command to the active buttons. This allows the system to know exactly which button has been clicked.
            button13.setEnabled(true);
            button13.setIcon(full);
            button13.setBorderPainted(false);

            button14.setEnabled(false);
            button14.setBorderPainted(false);
 
            button15.setActionCommand("Click3");
            button15.setEnabled(true);
            button15.setIcon(full);
            button15.setBorderPainted(false);
        
            button16.setEnabled(false);
            button16.setBorderPainted(false);
     
            button17.setEnabled(false);
            button17.setBorderPainted(false);

            button18.setEnabled(false);
            button18.setBorderPainted(false);
 
            button19.setEnabled(false);
            button19.setBorderPainted(false);

            button20.setEnabled(false);
            button20.setBorderPainted(false);
 
            button21.setActionCommand("Click4"); //This sets a specific action command to the active buttons. This allows the system to know exactly which button has been clicked.
            button21.setEnabled(true);
            button21.setIcon(full);
            button21.setBorderPainted(false);
   
            button22.setEnabled(false);
            button22.setBorderPainted(false);
        
            button23.setActionCommand("Click5"); //This sets a specific action command to the active buttons. This allows the system to know exactly which button has been clicked.
            button23.setEnabled(true);
            button23.setIcon(full);
            button23.setBorderPainted(false);

            button24.setEnabled(false);
            button24.setBorderPainted(false);
        
            button25.setActionCommand("Click6"); //This sets a specific action command to the active buttons. This allows the system to know exactly which button has been clicked.
            button25.setEnabled(true);
            button25.setIcon(full);
            button25.setBorderPainted(false);

            button26.setEnabled(false);
            button26.setBorderPainted(false);

            button27.setEnabled(false);
            button27.setBorderPainted(false);  
    
            button28.setEnabled(false);
            button28.setBorderPainted(false);

            button29.setActionCommand("Click7");//This sets a specific action command to the active buttons. This allows the system to know exactly which button has been clicked.
            button29.setEnabled(true);
            button29.setIcon(full);
            button29.setBorderPainted(false);

            button30.setEnabled(false);
            button30.setBorderPainted(false);
       
            button31.setActionCommand("Click8"); //This sets a specific action command to the active buttons. This allows the system to know exactly which button has been clicked.
            button31.setEnabled(true);
            button31.setIcon(full);
            button31.setBorderPainted(false);

            button32.setEnabled(false);
            button32.setBorderPainted(false);

            button33.setActionCommand("Click9"); //This sets a specific action command to the active buttons. This allows the system to know exactly which button has been clicked.
            button33.setEnabled(true);
            button33.setIcon(full);
            button33.setBorderPainted(false);

            button34.setEnabled(false);
            button34.setBorderPainted(false);

            button35.setActionCommand("Click10"); //This sets a specific action command to the active buttons. This allows the system to know exactly which button has been clicked.
            button35.setEnabled(true);
            button35.setIcon(full);
            button35.setBorderPainted(false);

            button36.setEnabled(false);
            button36.setBorderPainted(false);

            button37.setActionCommand("Click11"); //This sets a specific action command to the active buttons. This allows the system to know exactly which button has been clicked.
            button37.setEnabled(true);
            button37.setIcon(full);
            button37.setBorderPainted(false);

            button38.setEnabled(false);
            button38.setBorderPainted(false);

            button39.setActionCommand("Click12"); //This sets a specific action command to the active buttons. This allows the system to know exactly which button has been clicked.
            button39.setEnabled(true);
            button39.setIcon(full);
            button39.setBorderPainted(false);
            
            button40.setEnabled(false);
            button40.setBorderPainted(false);

            button41.setActionCommand("Click13"); //This sets a specific action command to the active buttons. This allows the system to know exactly which button has been clicked.
            button41.setEnabled(true);
            button41.setIcon(full);
            button41.setBorderPainted(false);

            button42.setEnabled(false);
            button42.setBorderPainted(false);
        
            button43.setActionCommand("Click14"); //This sets a specific action command to the active buttons. This allows the system to know exactly which button has been clicked.
            button43.setEnabled(true);
            button43.setIcon(full);
            button43.setBorderPainted(false);
        
            button44.setEnabled(false);
            button44.setBorderPainted(false);
        
            button45.setActionCommand("Click15"); //This sets a specific action command to the active buttons. This allows the system to know exactly which button has been clicked.
            button45.setEnabled(true);
            button45.setIcon(full); 
            button45.setBorderPainted(false);

        
            panel.setLayout(new GridLayout(5,9));//Sets the layout of the panel to a 5 by 9 grid
        
            //Adds all 45 buttons to the panel.
            panel.add(button1);
            panel.add(button2);
            panel.add(button3);
            panel.add(button4);
            panel.add(button5);
            panel.add(button6);
            panel.add(button7);
            panel.add(button8);
            panel.add(button9);
            panel.add(button10);
            panel.add(button11);
            panel.add(button12);
            panel.add(button13);
            panel.add(button14);
            panel.add(button15);
            panel.add(button16);
            panel.add(button17);
            panel.add(button18);
            panel.add(button19);
            panel.add(button20);
            panel.add(button21);
            panel.add(button22);
            panel.add(button23);
            panel.add(button24);
            panel.add(button25);
            panel.add(button26);
            panel.add(button27);
            panel.add(button28);
            panel.add(button29);
            panel.add(button30);
            panel.add(button31);
            panel.add(button32);
            panel.add(button33);
            panel.add(button34);
            panel.add(button35);
            panel.add(button36);
            panel.add(button37);
            panel.add(button38);
            panel.add(button39);
            panel.add(button40);
            panel.add(button41);
            panel.add(button42);
            panel.add(button43);
            panel.add(button44);
            panel.add(button45);
            
            //Adds the action listener to all 15 game buttons.
            button5.addActionListener(listener);
            button13.addActionListener(listener);
            button15.addActionListener(listener);
            button21.addActionListener(listener);
            button23.addActionListener(listener);
            button25.addActionListener(listener);
            button29.addActionListener(listener);
            button31.addActionListener(listener);
            button33.addActionListener(listener);
            button35.addActionListener(listener);
            button37.addActionListener(listener);
            button39.addActionListener(listener);
            button41.addActionListener(listener);
            button43.addActionListener(listener);
            button45.addActionListener(listener);
            
            
        }
        
        /**
         * This method organizes the two sub-panels. It takes the game panel with all the buttons in it 
         * and sets it to the middle of the main panel. It takes the other panel with the asthetic character and adds it
         * to the main panel at the west position.
         */ 
        public void organizePanels()
        {
            mainPanel.setLayout(new BorderLayout());
            mainPanel.add(panel, BorderLayout.CENTER);
            mainPanel.add(panel2, BorderLayout.WEST);
        }
        /**
         * This method sets all the settings for the frame.This includes the frames dimensions, title, 
         * close operation, visibility, and adding in the main panel
         */
        public void setFrame()
        {
             frame.setSize(FRAME_WIDTH, FRAME_HEIGHT); //Gets the Frame height
             frame.setTitle("PEG GAME"); //Sets the title of the Frame
             frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             frame.setVisible(true); //Sets the Frame so that it is visible
             frame.setContentPane(mainPanel); //Adds the mainPanel to the frame.
        }
        
        /**
         * This method adds the asthetic character button to the extra frame. It also adds to fake buttons to set
         * the proper layout of the panel. It sets icon of the character to the asthetic button. Lastly it adds the buttons
         * to the panel.
         */
         public void setTheme()
        {
            panel2.setLayout(new GridLayout(3,1));

            JButton buttonDude = new JButton();
            buttonDude.setEnabled(true);
            buttonDude.setBorderPainted(false);
            buttonDude.setIcon(trippy);
            
            JButton fakebutton = new JButton();
            fakebutton.setEnabled(true);
            fakebutton.setBorderPainted(false);
            fakebutton.setIcon(happy); 
            
            JButton fakebutton2 = new JButton();
            fakebutton2.setEnabled(true);
            fakebutton2.setBorderPainted(false);
            fakebutton2.setIcon(normal);
           
            
            
            
            panel2.add(fakebutton);
            panel2.add(buttonDude);
            panel2.add(fakebutton2);
        }
        
        /**
         * This class is a subclass that implements the action listener. This is where the brains of the game are implemented.
         */
        class Play implements ActionListener
        {
            /**
             * This method determines what happens when the buttons are clicked
             * @param event- passes ActionEvent so that it can be used in the method.
             */
            public void actionPerformed(ActionEvent event)
            {
                // This checks if the first button has been clicked.
                if (event.getActionCommand().equals("Click1"))
                {   
                    if(clicker.checkClick() == 0)//This checks if the system is on click 1
                    {
                        if(button5.getOccupied() == true)//This checks if the button is occupied
                        {
                            movingButton[0] = button5; //This sets the button that has been click into the movingButton array
                            button5.setIcon(selected); //This sets the buttons icon to the selected image
                            clicker.clickOne(); //This sets the clicker object to 1 which will tell the system on the next click that it is the second click.
                            for(int i = 0; i < temp.length; i++) //This for loop checks each i until temp[i] = button [0]
                            {
                                if(temp[i].getLocation() == button[0].getPosition())
                                {
                                    mover = temp[i]; //Sets the mover to temp[i]
                                }
                            }
                            
                        }
                      
                    }
                    else if(clicker.checkClick() == 1)//This checks if the system is on the second click.
                    {
                                               
                        if(button5.getOccupied() == false) //This checks if the button is occupied.
                        {
                            clicker.clickTwo(); //This sets the clicker object back to 0 so the system will know the next click is the first click.
                            button5.setClicked(true); 
                            mover.makeMove(button, access, temp, temp1); //This maniuplates move with makeMove and passes (button, access, temp, and temp1) 
                            game.endGame(button, temp, access); //This manipulates game with endGame and passes (button, access, and temp)
                            game.isWinner(button, temp, access, temp1);// This manipulates game with isWinner and passes (button, and temp)
                            game.message(button, temp, access, temp1); // This manipulates game with message and passes (button, and temp)
                            mover = null; //Sets the mover to null
                        }
                        else if(button5.getOccupied() == true) //This checks if the button is occupied
                        {
                            button5.setIcon(selected); //Sets the button icon to selected
                            movingButton[0].setIcon(full); //Sets the previously clicked button back to full
                            movingButton[0]= button5; //Updates the movingButton
                        }
                    }
                    
                }
                 
                //The same process is then repeated for each of the 15 buttons.
                
                if (event.getActionCommand().equals("Click2"))
                {
                    if(clicker.checkClick() == 0)
                    {
                        
                        if(button13.getOccupied() == true)
                        {
                            movingButton[0] = button13;
                            button13.setIcon(selected);
                            clicker.clickOne();
                            for(int i = 0; i < temp.length; i++)
                            {
                                if(temp[i].getLocation() == button[1].getPosition())
                                {
                                    mover = temp[i];
                                }
                            }
                            
                        }
                        
                    }
                   else if(clicker.checkClick() == 1)
                    {
                        
                        if(button13.getOccupied() == false)
                        {
                            clicker.clickTwo();
                            button13.setClicked(true);
                            mover.makeMove(button, access, temp, temp1);
                            game.endGame(button, temp, access);
                            game.isWinner(button, temp, access, temp1);
                            game.message(button, temp, access, temp1);
                            mover = null;
                        }
                        else if(button13.getOccupied() == true)
                        {
                            button13.setIcon(selected);
                            movingButton[0].setIcon(full);
                            movingButton[0]= button13;
                        }
                    }
                }
                
                if (event.getActionCommand().equals("Click3"))
                {
                    if(clicker.checkClick() == 0)
                    {
                       
                        if(button15.getOccupied() == true)
                        {
                            movingButton[0] = button15;
                            button15.setIcon(selected);
                            clicker.clickOne();
                            for(int i = 0; i < temp.length; i++)
                            {
                                if(temp[i].getLocation() == button[2].getPosition())
                                {
                                    mover = temp[i];
                                }
                            }
                       
                        }
                       
                    }
                    else if(clicker.checkClick() == 1)
                    {
                        
                        if(button15.getOccupied() == false)
                        {
                            clicker.clickTwo();
                            button15.setClicked(true);
                            mover.makeMove(button, access, temp, temp1);
                            game.endGame(button, temp, access);
                            game.isWinner(button, temp, access, temp1);
                            game.message(button, temp, access, temp1);
                            mover = null;
                        }
                        else if(button15.getOccupied() == true)
                        {
                            button15.setIcon(selected);
                            movingButton[0].setIcon(full);
                            movingButton[0]= button15;
                        }
                    }
                }
                
                if (event.getActionCommand().equals("Click4"))
                {
                    if(clicker.checkClick() == 0)
                    {
                        if(button21.getOccupied() == true)
                        {
                            movingButton[0] = button21;
                            button21.setIcon(selected);
                            clicker.clickOne();
                            for(int i = 0; i < temp.length; i++)
                            {
                                if(temp[i].getLocation() == button[3].getPosition())
                                {
                                    mover = temp[i];
                                }
                            }
                      
                        }
                    }
                    else if(clicker.checkClick() == 1)
                    {
                        
                        if(button21.getOccupied() == false)
                        {
                            clicker.clickTwo();
                            button21.setClicked(true);
                            mover.makeMove(button, access, temp, temp1);
                            game.endGame(button, temp, access);
                            game.isWinner(button, temp, access, temp1);
                            game.message(button, temp, access, temp1);
                            mover = null;
                        }
                        else if(button21.getOccupied() == true)
                        {
                            button21.setIcon(selected);
                            movingButton[0].setIcon(full);
                            movingButton[0]= button21;
                        }
                    }
                }
                
                if (event.getActionCommand().equals("Click5"))
                {
                    if(clicker.checkClick() == 0)
                    {
                        
                        if(button23.getOccupied() == true)
                        {
                            movingButton[0] = button23;
                            button23.setIcon(selected);
                            clicker.clickOne();
                            for(int i = 0; i < temp.length; i++)
                            {
                                if(temp[i].getLocation() == button[4].getPosition())
                                {
                                    mover = temp[i];
                                }
                            }
                        
                        }
                    }
                    else if(clicker.checkClick() == 1)
                    {
                        
                        if(button23.getOccupied() == false)
                        {
                            clicker.clickTwo();
                            button23.setClicked(true);
                            mover.makeMove(button, access, temp, temp1);
                            game.endGame(button, temp, access);
                            game.isWinner(button, temp, access, temp1);
                            game.message(button, temp, access, temp1);
                            mover = null;
                        }
                        else if(button23.getOccupied() == true)
                        {
                            button23.setIcon(selected);
                            movingButton[0].setIcon(full);
                            movingButton[0]= button23;
                        }
                    }
                }
                
                if (event.getActionCommand().equals("Click6"))
                {
                    if(clicker.checkClick() == 0)
                    {
                        
                        if(button25.getOccupied() == true)
                        {
                            movingButton[0] = button25;
                            button25.setIcon(selected);
                            clicker.clickOne();
                            for(int i = 0; i < temp.length; i++)
                            {
                                if(temp[i].getLocation() == button[5].getPosition())
                                {
                                    mover = temp[i];
                                }
                            }
                        
                        }
                    }
                    else if(clicker.checkClick() == 1)
                    {
                        
                        if(button25.getOccupied() == false)
                        {
                            clicker.clickTwo();
                            button25.setClicked(true);
                            mover.makeMove(button, access, temp, temp1); 
                            game.endGame(button, temp, access);
                            game.isWinner(button, temp, access, temp1);
                            game.message(button, temp, access, temp1);
                            mover = null;
                        }
                        else if(button25.getOccupied() == true)
                        {
                            button25.setIcon(selected);
                            movingButton[0].setIcon(full);
                            movingButton[0]= button25;
                        }
                    }
                }
                
                if (event.getActionCommand().equals("Click7"))
                {
                    if(clicker.checkClick() == 0)
                    {
                        
                        if(button29.getOccupied() == true)
                        {
                            movingButton[0] = button29;
                            button29.setIcon(selected);
                            clicker.clickOne();
                            for(int i = 0; i < temp.length; i++)
                            {
                                if(temp[i].getLocation() == button[6].getPosition())
                                {
                                    mover = temp[i];
                                }
                            }
                       
                        }
                    }
                    else if(clicker.checkClick() == 1)
                    {
                        
                        if(button29.getOccupied() == false)
                        {
                            clicker.clickTwo();
                            button29.setClicked(true);
                            mover.makeMove(button, access, temp, temp1); 
                            game.endGame(button, temp, access);
                            game.isWinner(button, temp, access, temp1);
                            game.message(button, temp, access, temp1);
                            mover = null;
                        }
                        else if(button29.getOccupied() == true)
                        {
                            button29.setIcon(selected);
                            movingButton[0].setIcon(full);
                            movingButton[0]= button29;
                        }
                    }
                }
                
                if (event.getActionCommand().equals("Click8"))
                {
                    if(clicker.checkClick() == 0)
                    {
                        
                        if(button31.getOccupied() == true)
                        {
                            movingButton[0] = button31;
                            button31.setIcon(selected);
                            clicker.clickOne();
                            for(int i = 0; i < temp.length; i++)
                            {
                                if(temp[i].getLocation() == button[7].getPosition())
                                {
                                    mover = temp[i];
                                }
                            }
                        
  
                        }
                    }
                    else if(clicker.checkClick() == 1)
                    {
                        
                        if(button31.getOccupied() == false)
                        {
                            clicker.clickTwo();
                            button31.setClicked(true);
                            mover.makeMove(button, access, temp, temp1);
                            game.endGame(button, temp, access);
                            game.isWinner(button, temp, access, temp1);
                            game.message(button, temp, access, temp1);
                            mover = null;
                        }
                        else if(button31.getOccupied() == true)
                        {
                            button31.setIcon(selected);
                            movingButton[0].setIcon(full);
                            movingButton[0]= button31;
                        }
                    }
                }
                
                if (event.getActionCommand().equals("Click9"))
                {
                    if(clicker.checkClick() == 0)
                    {
                        
                        if(button33.getOccupied() == true)
                        {
                            movingButton[0] = button33;
                            button33.setIcon(selected);
                            clicker.clickOne();
                            for(int i = 0; i < temp.length; i++)
                            {
                                if(temp[i].getLocation() == button[8].getPosition())
                                {
                                    mover = temp[i];
                                }
                            }
                        
                        }
                    }
                    else if(clicker.checkClick() == 1)
                    {
                        
                        if(button33.getOccupied() == false)
                        {
                            clicker.clickTwo();
                            button33.setClicked(true);
                            mover.makeMove(button, access, temp, temp1); 
                            game.endGame(button, temp, access);
                            game.isWinner(button, temp, access, temp1);
                            game.message(button, temp, access, temp1);
                            mover = null;
                        }
                        else if(button33.getOccupied() == true)
                        {
                            button33.setIcon(selected);
                            movingButton[0].setIcon(full);
                            movingButton[0]= button33;
                        }
                    }
                }
                
                if (event.getActionCommand().equals("Click10"))
                {
                    if(clicker.checkClick() == 0)
                    {
                        
                        movingButton[0] = button35;
                        if(button35.getOccupied() == true)
                        {
                            movingButton[0] = button35;
                            button35.setIcon(selected);
                            clicker.clickOne();
                            for(int i = 0; i < temp.length; i++)
                            {
                                if(temp[i].getLocation() == button[9].getPosition())
                                {
                                    mover = temp[i];
                                }
                            }
                        
                        }
                    }
                    else if(clicker.checkClick() == 1)
                    {
                        
                        if(button35.getOccupied() == false)
                        {
                            clicker.clickTwo();
                            button35.setClicked(true);
                            mover.makeMove(button, access, temp, temp1);
                            game.endGame(button, temp, access);
                            game.isWinner(button, temp, access, temp1);
                            game.message(button, temp, access, temp1);
                            mover = null;
                        }
                        else if(button35.getOccupied() == true)
                        {
                            button35.setIcon(selected);
                            movingButton[0].setIcon(full);
                            movingButton[0]= button35;
                        }
                    }
                }
                
                if (event.getActionCommand().equals("Click11"))
                {
                    if(clicker.checkClick() == 0)
                    {
                        
                        if(button37.getOccupied() == true)
                        {
                            movingButton[0] = button37;
                            button37.setIcon(selected);
                            clicker.clickOne();
                            for(int i = 0; i < temp.length; i++)
                            {
                                if(temp[i].getLocation() == button[10].getPosition())
                                {
                                    mover = temp[i];
                                }
                            }
                       
                        }
                    }
                    else if(clicker.checkClick() == 1)
                    {
                        
                        if(button37.getOccupied() == false)
                        {
                            clicker.clickTwo();
                            button37.setClicked(true);
                            mover.makeMove(button, access, temp, temp1);
                            game.endGame(button, temp, access);
                            game.isWinner(button, temp, access, temp1);
                            game.message(button, temp, access, temp1);
                            mover = null;
                        }
                        else if(button37.getOccupied() == true)
                        {
                            button37.setIcon(selected);
                            movingButton[0].setIcon(full);
                            movingButton[0]= button37;
                        }
                    }
                }
                
                if (event.getActionCommand().equals("Click12"))
                {
                    if(clicker.checkClick() == 0)
                    {
                        
                        if(button39.getOccupied() == true)
                        {
                            movingButton[0] = button39;
                            button39.setIcon(selected);
                            clicker.clickOne();
                            for(int i = 0; i < temp.length; i++)
                            {
                                if(temp[i].getLocation() == button[11].getPosition())
                                {
                                    mover = temp[i];
                                }
                            }
                        
                        }
                    }
                    else if(clicker.checkClick() == 1)
                    {
                        
                        if(button39.getOccupied() == false)
                        {
                            clicker.clickTwo();
                            button39.setClicked(true);
                            mover.makeMove(button, access, temp, temp1);
                            game.endGame(button, temp, access);
                            game.isWinner(button, temp, access, temp1);
                            game.message(button, temp, access, temp1);
                            mover = null;
                        }
                        else if(button39.getOccupied() == true)
                        {
                            button39.setIcon(selected);
                    //        movingButton[0].setIcon(full);
                    //        movingButton[0]= button39;
                        }
                    }
                }
                
                if (event.getActionCommand().equals("Click13"))
                {
                    if(clicker.checkClick() == 0)
                    {
                        
                        if(button41.getOccupied() == true)
                        {
                            movingButton[0] = button41;
                            button41.setIcon(selected);
                            clicker.clickOne();
                            for(int i = 0; i < temp.length; i++)
                            {
                                if(temp[i].getLocation() == button[12].getPosition())
                                {
                                    mover = temp[i];
                                }
                            }
                          
                        }
                    }
                    else if(clicker.checkClick() == 1)
                    {
                        
                        if(button41.getOccupied() == false)
                        {
                            clicker.clickTwo();
                            button41.setClicked(true);
                            mover.makeMove(button, access, temp, temp1);
                            game.endGame(button, temp, access);
                            game.isWinner(button, temp, access, temp1);
                            game.message(button, temp, access, temp1);
                            mover = null;
                        }
                        else if(button41.getOccupied() == true)
                        {
                            button41.setIcon(selected);
                            movingButton[0].setIcon(full);
                            movingButton[0]= button41;
                        }
                    }
                }
                
                if (event.getActionCommand().equals("Click14"))
                {
                    if(clicker.checkClick() == 0)
                    {
                        
                        if(button43.getOccupied() == true)
                        {
                            movingButton[0] = button43;
                            button43.setIcon(selected);
                            clicker.clickOne();
                            for(int i = 0; i < temp.length; i++)
                            {
                                if(temp[i].getLocation() == button[13].getPosition())
                                {
                                    mover = temp[i];
                                }
                            }
                          
                        }
                       
                            
                    }
                    else if(clicker.checkClick() == 1)
                    {
                        
                        if(button43.getOccupied() == false)
                        {
                            clicker.clickTwo();
                            button43.setClicked(true);
                            mover.makeMove(button, access, temp, temp1); 
                            game.endGame(button, temp, access);
                            game.isWinner(button, temp, access, temp1);
                            game.message(button, temp, access, temp1);
                            mover = null;
                        }
                        else if(button43.getOccupied() == true)
                        {
                            button43.setIcon(selected);
                            movingButton[0].setIcon(full);
                            movingButton[0]= button43;
                        }
                    }
                }
                
                if (event.getActionCommand().equals("Click15")) 
                {
                    if(clicker.checkClick() == 0)
                    {
                        
                        if(button45.getOccupied() == true)
                        {
                            movingButton[0] = button45;
                            button45.setIcon(selected);
                            clicker.clickOne();
                            for(int i = 0; i < temp.length; i++)
                            {
                                if(temp[i].getLocation() == button[14].getPosition())
                                {
                                    mover = temp[i];
                                }
                            }
                            
                        }
                    }
                    else if(clicker.checkClick() == 1)
                    {
                        
                        if(button45.getOccupied() == false)
                        {
                            clicker.clickTwo();
                            button45.setClicked(true);
                            mover.makeMove(button, access, temp, temp1); 
                            game.endGame(button, temp, access);
                            game.isWinner(button, temp, access, temp1);
                            game.message(button, temp, access, temp1);
                            mover = null;
                        }
                        else if(button45.getOccupied() == true)
                        {
                            button45.setIcon(selected);
                            movingButton[0].setIcon(full);
                            movingButton[0]= button45;
                        }
                        
                    }
                }
                
            }
        }

        //This section creates 45 game buttons and declares the final so that they can be used in the inner class.
        final GameButton button1 = new GameButton();

        final GameButton button2 = new GameButton();
   
        final GameButton button3 = new GameButton();
  
        final GameButton button4 = new GameButton();
  
        final GameButton button5 = new GameButton(1, false, false); //Sets this buttons position, occupancy, and if it has been clicked.
         
        final GameButton button6 = new GameButton();
     
        final GameButton button7 = new GameButton();
    
        final GameButton button8 = new GameButton();
        
        final GameButton button9 = new GameButton();
      
        final GameButton button10 = new GameButton();  
        
        final GameButton button11 = new GameButton();
     
        final GameButton button12 = new GameButton();
     
        final GameButton button13 = new GameButton(2, true, false);//Sets this buttons position, occupancy, and if it has been clicked.
           
        final GameButton button14 = new GameButton();
   
        final GameButton button15 = new GameButton(3, true, false);//Sets this buttons position, occupancy, and if it has been clicked.
  
        final GameButton button16 = new GameButton();
  
        final GameButton button17 = new GameButton();
   
        final GameButton button18 = new GameButton();
    
        final GameButton button19 = new GameButton();
    
        final GameButton button20 = new GameButton();
 
        final GameButton button21 = new GameButton(4, true, false);//Sets this buttons position, occupancy, and if it has been clicked.
   
        final GameButton button22 = new GameButton();
  
        final GameButton button23 = new GameButton(5, true, false);//Sets this buttons position, occupancy, and if it has been clicked.
    
        final GameButton button24 = new GameButton();
         
        final GameButton button25 = new GameButton(6, true, false);//Sets this buttons position, occupancy, and if it has been clicked.
   
        final GameButton button26 = new GameButton();
    
        final GameButton button27 = new GameButton();
    
        final GameButton button28 = new GameButton();
 
        final GameButton button29 = new GameButton(7, true, false);//Sets this buttons position, occupancy, and if it has been clicked.
      
        final GameButton button30 = new GameButton();
      
        final GameButton button31 = new GameButton(8, true, false);//Sets this buttons position, occupancy, and if it has been clicked.
     
        final GameButton button32 = new GameButton();
    
        final GameButton button33 = new GameButton(9, true, false);//Sets this buttons position, occupancy, and if it has been clicked.
    
        final GameButton button34 = new GameButton();
     
        final GameButton button35 = new GameButton(10, true, false);//Sets this buttons position, occupancy, and if it has been clicked.
      
        final GameButton button36 = new GameButton();
    
        final GameButton button37 = new GameButton(11, true, false);//Sets this buttons position, occupancy, and if it has been clicked.
    
        final GameButton button38 = new GameButton();
        
        final GameButton button39 = new GameButton(12, true, false);//Sets this buttons position, occupancy, and if it has been clicked.   
        
        final GameButton button40 = new GameButton();
     
        final GameButton button41 = new GameButton(13, true, false);//Sets this buttons position, occupancy, and if it has been clicked.
      
        final GameButton button42 = new GameButton();
    
        final GameButton button43 = new GameButton(14, true, false);//Sets this buttons position, occupancy, and if it has been clicked.
      
        final GameButton button44 = new GameButton();
        
        final GameButton button45 = new GameButton(15, true, false);//Sets this buttons position, occupancy, and if it has been clicked.
            
        final JButton buttonDude = new JButton();
         
        // This creates a GameButton array and adds all of the game buttons to it
        final GameButton[] button = {button5, button13, button15, button21, button23, button25, button29, button31, button33, button35, button37, button39, button41, button43, button45};
        
        //This creates another GameButton array that will help keep track of what button was just clicked.
        final GameButton[] movingButton = new GameButton[1];
        
        // This creates 15 peg objects and declares them final so that they can be used in the inner class.
        final Peg peg1 = new Peg(2);
        
        final Peg peg2 = new Peg(3);
           
        final Peg peg3 = new Peg(4);
         
        final Peg peg4 = new Peg(5);
   
        final Peg peg5 = new Peg(6);
           
        final Peg peg6 = new Peg(7);
    
        final Peg peg7 = new Peg(8);
          
        final Peg peg8 = new Peg(9);
      
        final Peg peg9 = new Peg(10);

        final Peg peg10 = new Peg(11);

        final Peg peg11 = new Peg(12);

        final Peg peg12 = new Peg(13);

        final Peg peg13 = new Peg(14);
 
        final Peg peg14 = new Peg(15);
        
        //This creats an array of type Peg and adds all of the pegs to it.
        final Peg[] temp = {peg1, peg2, peg3, peg4, peg5, peg6, peg7, peg8, peg9, peg10, peg11, peg12, peg13, peg14};
        //This creates a clicker object and declares it final
        final Clicker clicker = new Clicker();

        final int FRAME_WIDTH = 1000;
        final int FRAME_HEIGHT = 900;
        private Peg mover = peg1;
        private ImageIcon full = new ImageIcon("full.gif");
        private ImageIcon empty = new ImageIcon("empty.gif");
        private ImageIcon selected = new ImageIcon("selected.gif");
        private ImageIcon angry = new ImageIcon("Kitty-Angry.gif");
        private ImageIcon happy = new ImageIcon("Kitty-Happy.gif");   
        private ImageIcon sad = new ImageIcon("Kitty-Sad.gif");
        private ImageIcon shock = new ImageIcon("Kitty-Shock.gif");
        private ImageIcon normal = new ImageIcon("Normal.gif");
        private ImageIcon trippy = new ImageIcon("trippy.gif");
        private JPanel mainPanel = new JPanel();
        private JPanel panel = new JPanel();
        private JPanel panel2 = new JPanel();
        private JFrame frame = new MenuFrame();

} 
     
