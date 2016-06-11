/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import humanoidGame.Items;
import humanoidGame.StartGame;
import java.util.Scanner;

/**
 *
 * @author Austin Poch
 */
public class GoldMineView {
    private String menu;
    
    public GoldMineView() {
        this.menu = "\n*************************************************"
                  + "\n*                                               *"
                  + "\n* You enter the gold mine and there is a guard  *"
                  + "\n* standing in your way, you need to get past    *"
                  + "\n* him in order to get the gold you need, so you *"
                  + "\n* think up a plan. If you can trick the guard,  *"
                  + "\n* you will be able to get all the gold you need.*"
                  + "\n*                                               *"
                  + "\n* Should You:                                   *"
                  + "\n*                                               *"
                  + "\n* A - Tell him you saw his wife slip and fall   *"
                  + "\n* B - Tell him someone put poison in his wifes  *"
                  + "\n*     lunch and she has not eaten it yet        *"
                  + "\n* C - Tell him you saw a shady character at his *"
                  + "\n*     house                                     *"
                  + "\n* D - Tell him that you need some of that gold  *"
                  + "\n*     right behind him                          *"
                  + "\n*                                               *"
                  + "\n*************************************************"
                  ;
    }
    void displayGoldMineView() {
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
            case "A": 
                this.optionA();
                Items setGold = new Items();
                setGold.setGold(5);
                break;
            case "B":
                this.optionB();
                break;
            case "C": 
                this.optionC();
                break;
            case "D": 
                this.optionD();
                break;
            default:
                System.out.println("\n*** Invalid selection ** Try again");
                break;
        }
        this.gameMenuView();
        return false;
    }     

    private void optionA() {
        System.out.println("\n************************************"
                         + "\n*                                  *"
                         + "\n*  You have just recieved 5 gold   *"
                         + "\n*                                  *"
                         + "\n************************************"
                         );
    }

    private void optionB() {
        System.out.println("\n************************************"
                         + "\n*                                  *"
                         + "\n*      Better luck next time,      *"
                         + "\n*       you recieve no gold        *"
                         + "\n*                                  *"
                         + "\n************************************"
                         );
    }

    private void optionC() {
         System.out.println("\n************************************"
                         + "\n*                                  *"
                         + "\n*      Better luck next time,      *"
                         + "\n*       you recieve no gold        *"
                         + "\n*                                  *"
                         + "\n************************************"
                         );
    }

    private void optionD() {
        System.out.println("\n************************************"
                         + "\n*                                  *"
                         + "\n*      Better luck next time,      *"
                         + "\n*       you recieve no gold        *"
                         + "\n*                                  *"
                         + "\n************************************"
                         );
    }
       
    private void gameMenuView() {
         GameMenuView gameMenuView = new GameMenuView();
         gameMenuView.displayGameMenuView();
    }
}
