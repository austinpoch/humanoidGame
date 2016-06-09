/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.GameControl;
import humanoid.Humanoid;
import java.util.Scanner;

/**
 *
 * @author Austin Poch
 */
public class MainMenuView {

    private String menu;
    
    /**
     *
     */
    public MainMenuView() {
        this.menu = "\n"
                + "\n-----------------------------"
                + "\n| Main Menu                 |"
                + "\n-----------------------------"
                + "\nG - Start Game"
                + "\nL - Load Game"
                + "\nH - Help Menu"
                + "\nS - Save Game"
                + "\nQ - Quit"
                + "\n-----------------------------";
    }

    public void displayMainMenuView() {
       
        boolean done = false; // set flag to not done
        
        System.out.println(menu);
        
        do{
            //prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))// user wants to quit
                return; // exit game
            
            // do the requested action and display the next view
            done = this. doAction(menuOption);
            
        }while (!done);
    }
    
    private String getMenuOption() {
        
        Scanner keyboard = new Scanner(System.in);//get infile for keyboard
        String value = "";// value to be returned
        boolean valid = false; // initalized to not valid
        
        while (!valid){ // loop while an invalid value is entered
            System.out.println("\nPlease enter an option: ");
            
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

    private boolean doAction(String menuOption) {
       
        menuOption = menuOption.toUpperCase(); // convert to uppercase
        
        switch (menuOption){
            case "G": // create and start new game
                this.startNewGame();
                break;
            case "L": // get and start an existing game
                this.startExistingGame();
                break;
            case "H": // display help menu
                this.displayHelpMenu();
                break;
            case "S": // save game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection ** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
       // create a new game
       GameControl.createNewGame(Humanoid.getPlayer());
       
       // display the game
       GameMenuView gameMenu = new GameMenuView();
       gameMenu.displayMenu();
    }

    private void startExistingGame() {
         System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
         HelpMenuView helpMenuView = new HelpMenuView();
         helpMenuView.displayHelpMenuView();
    }

    private void saveGame() {
         System.out.println("*** saveGame function called ***");
    }



  
}
