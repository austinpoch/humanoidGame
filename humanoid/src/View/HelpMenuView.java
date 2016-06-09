/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;

/**
 *
 * @author Austin Poch
 */
public class HelpMenuView {
    private String menu;
    
    public HelpMenuView() {
        this.menu = "\n"
                + "\n-----------------------------"
                + "\n| Help Menu                 |"
                + "\n-----------------------------"
                + "\nO - Game Goal"
                + "\nH - Hint"
                + "\nM - Main Menu"
                + "\nG - Game Play Menu"
                + "\nQ - Quit"
                + "\n-----------------------------";
    }


    void displayHelpMenuView() {
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
            case "O": // create and start new game
                this.gameGoal();
                break;
            case "H": // get and start an existing game
                this.hint();
                break;
            case "M": // display main menu
                MainMenuView mainMenuView = new MainMenuView();
                mainMenuView.displayMainMenuView();
                break;
            case "G": // save game
                this.gamePlayMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection ** Try again");
                break;
        }
        return false;
    }

    private void gameGoal() {
        System.out.println("*** gameGoal called ***");
    }

    private void hint() {
          System.out.println("*** hint called ***");
    }

    private void gamePlayMenu() {
          System.out.println("*** gamePlayMenu called ***");
    }
}
