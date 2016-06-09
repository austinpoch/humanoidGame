/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.GameControl;
import humanoidGame.Player;
import java.util.Scanner;

/**
 *
 * @author Austin Poch
 */
public class StartProgramView {
    
        private String promptMessage;
        
        public StartProgramView(){
            this.promptMessage = "\nPlease enter your name: ";
            //display the banner when view is created
            this.displayBanner();
        }

    private void displayBanner() {
        System.out.println(
          "\n****************************************************"
        + "\n*                                                  *"
        + "\n* The objective of the game is to select one of    *"
        + "\n* three characters and collect the resources or    *"
        + "\n* items needed to defeat both of the other         *"
        + "\n* characters. In order to do this, you mus travel  *"
        + "\n* to diffrent locations and collecet recources or  *"
        + "\n* items. Recources and items can be combined to    *" 
        + "\n* create weapons, spells or even strength. By      *"
        + "\n* using available weapons, spells or strengths     *"
        + "\n* will help you to defeat the other characters.    *" 
        + "\n*                                                  *"
        + "\n* Once you have defeated both your opponents the   *"
        + "\n* game has been won. If you die, it's game over.   *" 
        + "\n* There will be challanges along the way that can  *"
        + "\n* hurt or even kill you.                           *"
        + "\n*                                                  *"
        + "\n****************************************************"
        );
    }

    public void displayStartProgramView() {
        boolean done = false;
        do {
            //prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))//user wants to quit
                return; //exit the game
            
            // do the requested action and display the next view
            done = this.doAction(playersName);
        } while (!done);
    }

    private String getPlayersName() {
        
        Scanner keyboard = new Scanner(System.in);//get infile for keyboard
        String value = "";// value to be returned
        boolean valid = false; // initalized to not valid
        
        while (!valid){ // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalad value: value can not be blank");
                continue;
            }
            
            break; //end the loop         
        }
        return value; // return the value entered
    }

    private boolean doAction(String playersName) {
        
        if (playersName.length() < 2){
            System.out.println("\nInvalad players name: "
                + "The name must be greater than one character in length");
            return false;
        }
        
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { // if unsuccessful
            System.out.println("\nError creating the player.");
            return false;
        }
        
        // display next view
        this.displayNextView(player);
        
        return true; // success !
    }
    
    private void displayNextView(Player player) {
        
        // display a custom welcome message
        System.out.println("\n====================================="
                         + "\n Welcome to the game " + player.getName()
                         + "\n We hope you have a lot of fun!"
                         + "\n====================================="
                         );
        // create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        // display main menu view
        mainMenuView.displayMainMenuView();
    }

}
