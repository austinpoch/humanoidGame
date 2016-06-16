/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.GameControl;
import humanoid.Humanoid;

/**
 *
 * @author Austin Poch
 */
public class MainMenuView extends View {

    public MainMenuView() {
        
        super("\n"
            + "\n-----------------------------"
            + "\n| Main Menu                 |"
            + "\n-----------------------------"
            + "\nG - Start Game"
            + "\nL - Load Game"
            + "\nH - Help Menu"
            + "\nS - Save Game"
            + "\nQ - Quit"
            + "\n-----------------------------");
    }


    @Override
    public boolean doAction(String menuOption) {
       
        menuOption = menuOption.toUpperCase(); // convert to uppercase
        
        switch (menuOption){
            case "G": // create and start new game
                this.startNewGame();
                break;
            case "L": // get and start an existing game
                this.startExistingGame();
                break;
            case "H": // display help menu
                this.displayHelpMenu();
                break;
            case "S": // save game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection ** Try again");
                break;
        }
        return false;
    }

        
    private void startNewGame() {
        
       // create a new game
       GameControl.createNewGame(Humanoid.getPlayer());
             
       // display the game
       HumanoidTypeView humanoidTypeView = new HumanoidTypeView();
       humanoidTypeView.display();
    }

    private void startExistingGame() {
         System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
         HelpMenuView helpMenuView = new HelpMenuView();
         helpMenuView.display();
    }

    private void saveGame() {
         System.out.println("*** saveGame function called ***");
    }



  
}
