/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Austin Poch
 */
public class HelpMenuView extends View{
        
    public HelpMenuView() {
        
        super("\n"
            + "\n-----------------------------"
            + "\n| Help Menu                 |"
            + "\n-----------------------------"
            + "\nO - Game Goal"
            + "\nH - Hint"
            + "\nM - Main Menu"
            + "\nG - Game Play Menu"
            + "\nQ - Quit"
            + "\n-----------------------------");
    }
    
    @Override
    public boolean doAction(String menuOption) {
        
        menuOption = menuOption.toUpperCase(); // convert to uppercase
        
        switch (menuOption){
            case "O": // game goal
                this.gameGoal();
                break;
            case "H": // hint
                this.hint();
                break;
            case "M": // display main menu
                MainMenuView mainMenuView = new MainMenuView();
                mainMenuView.display();
                break;
            case "G": // game play menu
                this.gameMenuView();
                break;
            default:
                System.out.println("\n*** Invalid selection ** Try again");
                break;
        }
        return false;
    }

    private void gameGoal() {
        System.out.println("*** gameGoal called ***");
    }

    private void hint() {
          System.out.println("*** hint called ***");
    }

    private void gameMenuView() {
         GameMenuView gameMenuView = new GameMenuView();
         gameMenuView.display();
    }
}
