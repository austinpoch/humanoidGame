/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import humanoidGame.StartGame;
import java.util.Scanner;

/**
 *
 * @author Austin Poch
 */
class HumanoidTypeView {
    
    private final String menu;
    
    public HumanoidTypeView(){
    
        this.menu = ("\n****************************************************"
                   + "\n*                                                  *"
                   + "\n* There are three types of humanoids in this game. *"      
                   + "\n* You must choose a type of humanoid to play with  *"
                   + "\n* as your character.                               *"
                   + "\n*                                                  *"
                   + "\n*                  A - Humanoid 1                  *"
                   + "\n*                  B - Humanoid 2                  *"
                   + "\n*                  C - Humanoid 3                  *"
                   + "\n*                                                  *"
                   + "\n****************************************************"
                   );
    }
    public void displayHumanoidTypeView() {
       
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
            case "A": // humanoid 1
                this.humanoidOne();
                StartGame setHumanoidOne = new StartGame();
                setHumanoidOne.setHumanoidOne(true);
                break;
            case "B": // humanoid 2
                this.humanoidTwo();
                StartGame setHumanoidTwo = new StartGame();
                setHumanoidTwo.setHumanoidTwo(true);
                break;
            case "C": // humanoid 3
                this.humanoidThree();
                StartGame setHumanoidThree = new StartGame();
                setHumanoidThree.setHumanoidThree(true);
                break;
            default:
                System.out.println("\n*** Invalid selection ** Try again");
                this.getInput();
                break;
        }
        this.displayNextView();
        return false;
    }



    private void humanoidOne() {
        System.out.println("\n******************************************"
                         + "\n*                                        *"
                         + "\n*     Congratulations! you are now a     *"
                         + "\n*               Humanoid 1               *"
                         + "\n*                                        *"
                         + "\n******************************************"
                         );
    }

    private void humanoidTwo() {
        System.out.println("\n******************************************"
                         + "\n*                                        *"
                         + "\n*     Congratulations! you are now a     *"
                         + "\n*               Humanoid 2               *"
                         + "\n*                                        *"
                         + "\n******************************************"
                         );
    }

    private void humanoidThree() {
        System.out.println("\n******************************************"
                         + "\n*                                        *"
                         + "\n*     Congratulations! you are now a     *"
                         + "\n*               Humanoid 3               *"
                         + "\n*                                        *"
                         + "\n******************************************"
                         );
    }
    
    private void displayNextView() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }
}
