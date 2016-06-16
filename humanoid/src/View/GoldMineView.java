/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import humanoidGame.Items;

/**
 *
 * @author Austin Poch
 */
public class GoldMineView extends View{
    
    public GoldMineView() {
        
        super("\n*************************************************"
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
            + "\n*************************************************");
    }
    
    @Override
    public boolean doAction(String menuOption) {
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
         gameMenuView.display();
    }
}
