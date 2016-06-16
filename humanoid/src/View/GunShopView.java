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
class GunShopView {
    private String menu;
      
    public GunShopView() {
        this.menu = ("\n*************************************************"
                   + "\n*                                               *"
                   + "\n* To get the gun powder you must be able to     *"
                   + "\n* slove a complex equation. If you have 'A'     *"
                   + "\n* number of magazines for your gun, and they    *"
                   + "\n* all take 'B' rounds each, and the bullets     *"
                   + "\n* take 'C' grains of gun powder each, how much  *"                    
                   + "\n* gun powder does it take to load all of the    *"                  
                   + "\n* magazines?                                    *"           
                   + "\n*                                               *"
                   + "\n*************************************************"
                      );
    }
    public void displayGunShopView() {
       
        boolean done = false; // set flag to not done
        
        System.out.println(menu);
        
        do{
            System.out.println("\nGun magazines (1-5): ");
            int mags = this.getMagsInput();
            System.out.println("\nGun rounds (10-20): ");
            int rounds = this.getRoundsInput();
            System.out.println("\nGrain of gun powder (100-150): ");
            int grains = this.getGrainsInput();
            System.out.println("\nAnwser (1000-15000): ");
            int anwser = this.getAnwserInput();
            
            done = this.doAction(mags, rounds, grains, anwser);
            
        }while (!done);
    }

    private int getMagsInput() {
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

    private int getRoundsInput() {
        Scanner keyboard = new Scanner(System.in);
        boolean done = false;
        int number = 0;
        
        while (!done){ // loop while an invalid value is entered
            number = keyboard.nextInt();
            if (number < 10 & number > 20) { 
                System.out.println("\nInvalad value, choose a number between 10"
                                   + " and 20 ");
                continue;
            }
            
            break; //end the loop         
        }
        return number; // return the value entered
    }

    private int getGrainsInput() {
        Scanner keyboard = new Scanner(System.in);
        boolean done = false;
        int number = 0;
        
        while (!done){ // loop while an invalid value is entered
            number = keyboard.nextInt();
            if (number < 100 & number > 150) { 
                System.out.println("\nInvalad value, choose a number between 100"
                                   + " and 150 ");
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
            if (number < 1000 & number > 15000) { 
                System.out.println("\nInvalad value, choose a number between "
                                   + "1000 and 15000 ");
                continue;
            }
            
            break; //end the loop         
        }
        return number; // return the value entered
    }

    private boolean doAction(int mags, int rounds, int grains, int anwser) {
        LocationControl locationControl = new LocationControl();
        int match = locationControl.gunShopCalculations(mags, rounds, grains);
        
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
                         + "\n*     recieve 1000 gun powder      *"
                         + "\n*                                  *"
                         + "\n************************************"
                         );
    }

    private void incorrect() {
        System.out.println("\n************************************"
                         + "\n*                                  *"
                         + "\n*      Better luck next time,      *"
                         + "\n*    you recieve no gun powder     *"
                         + "\n*                                  *"
                         + "\n************************************"
                         );
    }

    private void gameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }
}
