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
public class GameGoalView extends View{
    
    public GameGoalView() {
        
        super("\n*************************************************"
            + "\n*                                               *"
            + "\n* The goal of this game is to defeat your two   *"
            + "\n* humanoid opponents. In order to do this you   *"
            + "\n* must travel to diffrent locations and         *"
            + "\n* complete certain tasks in order to earn items.*"
            + "\n* When you have enough items you will be able   *"
            + "\n* combine them to create a way to attack your   *"
            + "\n* opponents. Be careful! When you explore       *"
            + "\n* locations your opponents just might attack!   *"
            + "\n*                                               *"
            + "\n* H - Help Menu                                 *"
            + "\n* Q - Quit                                      *"
            + "\n*                                               *"
            + "\n*************************************************");
    }

    @Override
    public boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase(); // convert to uppercase
        
        switch (menuOption){
            case "H":
                HelpMenuView helpMenuView = new HelpMenuView();
                helpMenuView.display();
                break;
            default:
                System.out.println("\n*** Invalid selection ** Try again");
                break;
        }
        return false;
    }     
}
