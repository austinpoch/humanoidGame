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
public class GameHintView extends View {
    
    public GameHintView() {
        
        super("\n*************************************************"
            + "\n*                                               *"
            + "\n* If you want to be able to win this game you   *"
            + "\n* must make a sacrafice, your own health! When  *"
            + "\n* you explore locations your opponents might    *"
            + "\n* attack, there is no way arround this. The     *"
            + "\n* trick is visiting as few locations as         *"
            + "\n* possible. You cant be attacked if you dont go *"
            + "\n* to any locations.                             *"
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
