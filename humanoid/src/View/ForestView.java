/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.LocationControl;
import java.util.Scanner;

/**
 *
 * @author Austin Poch
 */
class ForestView {
    private String menu;
      
    public ForestView() {
        this.menu = ("\n*************************************************"
                   + "\n*                                               *"
                   + "\n* To get the wood you must be able to solve a   *"
                   + "\n* complex equation. If there are 'A' loggers    *"
                   + "\n* cutting down trees and each tree takes 'B'    *"
                   + "\n* hours to cut down and take home, how many     *"
                   + "\n* trees can the loggers take home in 'C' hours? *"                            
                   + "\n*                                               *"
                   + "\n*************************************************"
                   );
    }
    public void displayForestView() {
       
        boolean done = false; // set flag to not done
        
        System.out.println(menu);
        
        do{
            System.out.println("\nLoggers (1-5): ");
            int loggers = this.getLoggersInput();
            System.out.println("\nHours per tree (1-5): ");
            int hoursPerTree = this.gethoursPerTreeInput();
            System.out.println("\nTotal hours (8-20): ");
            int totalHours = this.getTotalHoursInput();
            System.out.println("\nAnwser (8-500): ");
            int anwser = this.getAnwserInput();
            
            done = this.doAction(loggers, hoursPerTree, totalHours, anwser);
            
        }while (!done);
    }

    private int getLoggersInput() {
        Scanner keyboard = new Scanner(System.in);
        boolean done = false;
        int number = 0;
        
        while (!done){ // loop while an invalid value is entered
            number = keyboard.nextInt();
            if (number < 1 & number > 5) { 
                System.out.println("\nInvalad value, choose a number between 1"
                                   + " and 5 ");
                continue;
            }
            
            break; //end the loop         
        }
        return number; // return the value entered
    }

    private int gethoursPerTreeInput() {
        Scanner keyboard = new Scanner(System.in);
        boolean done = false;
        int number = 0;
        
        while (!done){ // loop while an invalid value is entered
            number = keyboard.nextInt();
            if (number < 1 & number > 5) { 
                System.out.println("\nInvalad value, choose a number between 1"
                                   + " and 5 ");
                continue;
            }
            
            break; //end the loop         
        }
        return number; // return the value entered
    }

    private int getTotalHoursInput() {
        Scanner keyboard = new Scanner(System.in);
        boolean done = false;
        int number = 0;
        
        while (!done){ // loop while an invalid value is entered
            number = keyboard.nextInt();
            if (number < 8 & number > 20) { 
                System.out.println("\nInvalad value, choose a number between 8"
                                   + " and 20 ");
                continue;
            }
            
            break; //end the loop         
        }
        return number; // return the value entered
    }

    private int getAnwserInput() {
        Scanner keyboard = new Scanner(System.in);
        boolean done = false;
        int number = 0;
        
        while (!done){ // loop while an invalid value is entered
            number = keyboard.nextInt();
            if (number < 8 & number > 500) { 
                System.out.println("\nInvalad value, choose a number between 8"
                                   + " and 500 ");
                continue;
            }
            
            break; //end the loop         
        }
        return number; // return the value entered
    }

    private boolean doAction(int loggers, int hoursPerTree, int totalHours, int anwser) {
        LocationControl locationControl = new LocationControl();
        int match = locationControl.forestCalculations(loggers, hoursPerTree, totalHours);
        
        if (match == anwser){
        this.correct();
        }
        else if (match != anwser){
            this.incorrect();
        }
        this.gameMenuView();
        return true;
    }

    private void correct() {
        System.out.println("\n************************************"
                         + "\n*                                  *"
                         + "\n*   Congratulations! You got the   *"
                         + "\n*    anwser correct! You will      *"
                         + "\n*         recieve 5 wood           *"
                         + "\n*                                  *"
                         + "\n************************************"
                         );
    }

    private void incorrect() {
        System.out.println("\n************************************"
                         + "\n*                                  *"
                         + "\n*      Better luck next time,      *"
                         + "\n*        you recieve wood          *"
                         + "\n*                                  *"
                         + "\n************************************"
                         );
    }

    private void gameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }
}
