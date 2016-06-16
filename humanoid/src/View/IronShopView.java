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
public class IronShopView {
    private String menu;
      
    public IronShopView() {
        this.menu = ("\n*************************************************"
                   + "\n*                                               *"
                   + "\n* To get the iron you must be able to solve a   *"
                   + "\n* complex equation. You will be prompted to     *"
                   + "\n* input three numbers within certain ranges. The*"
                   + "\n* three numbers will be used in the equation.   *"
                   + "\n* If there are A pounds of iron, and it takes B *"                    
                   + "\n* pounds to make a gun and C pounds to make a   *"                  
                   + "\n* sword, how many swords can be made if there   *"
                   + "\n* are already 3 guns?                           *"                
                   + "\n*                                               *"
                   + "\n*************************************************"
                      );
    }
    public void displayIronShopView() {
       
        boolean done = false; // set flag to not done
        
        System.out.println(menu);
        
        do{
            System.out.println("\nPounds of Iron (18-36): ");
            int lbsOfIron = this.getLbsOfIronInput();
            System.out.println("\nPounds per gun (1, 3 or 6): ");
            int lbsPerGun = this.getLbsPerGunInput();
            System.out.println("\nPounds per sword(1, 3 or 6): ");
            int lbsPerSword = this.getLbsPerSwordInput();
            System.out.println("\nAnwser (0-33): ");
            int anwser = this.getAnwserInput();
            
            done = this.doAction(lbsOfIron, lbsPerGun, lbsPerSword, anwser);
            
        }while (!done);
    }

    private int getLbsOfIronInput() {
        Scanner keyboard = new Scanner(System.in);
        boolean done = false;
        int number = 0;
        
        while (!done){ // loop while an invalid value is entered
            number = keyboard.nextInt();
            if (number < 18 && number > 36) { 
                System.out.println("\nInvalad value, choose a number between 18"
                                   + " and 36 ");
                continue;
            }
            
            break; //end the loop         
        }
        return number; // return the value entered
    }

    private int getLbsPerGunInput() {
        Scanner keyboard = new Scanner(System.in);
        boolean done = false;
        int number = 0;
        
        while (!done){ // loop while an invalid value is entered
            number = keyboard.nextInt();
            if (number != 1 ^
                number != 3 ^
                number != 6){
                System.out.println("\nInvalad value, choose either 1, 3 or 6");
                continue; 
            }
            
                break; //end the loop       
        }
        return number; // return the value entered
    }

    private int getLbsPerSwordInput() {
        Scanner keyboard = new Scanner(System.in);
        boolean done = false;
        int number = 0;
        
        while (!done){ // loop while an invalid value is entered
            number = keyboard.nextInt();
            if (number != 1 ^
                number != 3 ^
                number != 6){
                System.out.println("\nInvalad value, choose either 1, 3 or 6");
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
            if (number < 0 &
                number > 33) { 
                System.out.println("\nInvalad value, choose a number between 0"
                                   + " and 33 ");
                continue;
            }
            
            break; //end the loop         
        }
        return number; // return the value entered
    }

    private boolean doAction(int lbsOfIron, int lbsPerGun, int lbsPerSword, int anwser) {
        LocationControl locationControl = new LocationControl();
        int match = locationControl.ironShopCalculations(lbsOfIron, lbsPerGun, lbsPerSword);
        
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
                         + "\n*         recieve 5 Iron           *"
                         + "\n*                                  *"
                         + "\n************************************"
                         );
    }

    private void incorrect() {
        System.out.println("\n************************************"
                         + "\n*                                  *"
                         + "\n*      Better luck next time,      *"
                         + "\n*       you recieve no Iron        *"
                         + "\n*                                  *"
                         + "\n************************************"
                         );
    }
    private void gameMenuView() {
         GameMenuView gameMenuView = new GameMenuView();
         gameMenuView.display();
    }
}