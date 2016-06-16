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
class HumanoidTypeView extends View {
    
    public HumanoidTypeView(){
    
        super("\n****************************************************"
            + "\n*                                                  *"
            + "\n* There are three types of humanoids in this game. *"      
            + "\n* You must choose a type of humanoid to play with  *"
            + "\n* as your character.                               *"
            + "\n*                                                  *"
            + "\n*                  A - Humanoid 1                  *"
            + "\n*                  B - Humanoid 2                  *"
            + "\n*                  C - Humanoid 3                  *"
            + "\n*                                                  *"
            + "\n****************************************************");
    } 
    
    @Override
    public boolean doAction(String menuOption) {
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
        gameMenuView.display();
    }
}
