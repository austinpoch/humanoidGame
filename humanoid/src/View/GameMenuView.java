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
public class GameMenuView {

    private String menu;
    
    public GameMenuView() {
        this.menu = "\n"
                  + "\n-----------------------------"
                  + "\n| Game Play Menu            |"
                  + "\n-----------------------------"
                  + "\nE - Explore new location"
                  + "\nL - View Locations"
                  + "\nO - View Attack Options"
                  + "\nV - View Everyone's Health"
                  + "\nA - Attack Opponent"
                  + "\nH - Help Menu"
                  + "\nM - Main Menu"
                  + "\n-----------------------------";
    }
    
    void displayGameMenuView() {
        
    boolean done = false; // set flag to not done
        
        System.out.println(menu);
        
        do{
            //prompt for and get players name
            String menuOption = this.getInput();
            if (menuOption.toUpperCase().equals("Q"))// user wants to quit
                return; // exit game
            
            // do the requested action and display the next view
            done = this. doAction(menuOption);
            
        }while (!done);
    }

    private String getInput() {
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
            case "E": // explore new location
                this.newLocation();
                break;
            case "L": // view locations
                this.viewLocations();
                break;
            case "O": // view attack options
                this.viewAttackOptions();
                break;
            case "V": // view everyones health
                this.viewEveryonesHealth();
                break;
            case "A": // attack opponent
                this.attackOpponent();
                break;
            case "H": // display help menu
                HelpMenuView helpMenuView = new HelpMenuView();
                helpMenuView.displayHelpMenuView();
                break;
            case "M": // main menu
                MainMenuView mainMenuView = new MainMenuView();
                mainMenuView.displayMainMenuView();
                break;
            default:
                System.out.println("\n*** Invalid selection ** Try again");
                break;
        }
        return false;
    }

    private void newLocation() {
        NewLocationView newLocationView = new NewLocationView();
        newLocationView.displayNewLocationView();
    }

    private void viewLocations() {
        System.out.println("\n*** viewLocations called ***");
    }

    private void viewAttackOptions() {
        System.out.println("\n*** viewAttackOptions called ***");
    }

    private void viewEveryonesHealth() {
        System.out.println("\n*** viewEveryonesHealth called ***");
    }

    private void attackOpponent() {
        System.out.println("\n*** attackOpponent called ***");
    }
}