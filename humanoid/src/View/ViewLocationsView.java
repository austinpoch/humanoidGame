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
public class ViewLocationsView extends View {
    
    public ViewLocationsView() {
        
        super("\n***************************************************"
            + "\n*                                                 *"
            + "\n* 1    2    3    4  5     6  7    8    9    10    *"
            + "\n*  \\  / \\  / \\  / \\ | / \\ | / \\  / \\  / \\  /      *"
            + "\n*   11   12   13    14   15    16   17   18       *"
            + "\n*     \\__/     \\___/       \\___/     \\__/         *"
            + "\n*      l9        20         21        22          *"
            + "\n*        \\______/             \\______/            *"
            + "\n*           23                   24               *"
            + "\n*            \\___________________/                *"
            + "\n*                      25                         *"
            + "\n*                                                 *"
            + "\n* L - Level Key                                   *"
            + "\n* G - Game Play Menu                              *"
            + "\n* Q - Quit                                        *"
            + "\n*                                                 *"
            + "\n***************************************************");
        
       
    }

    @Override
    public boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase(); // convert to uppercase
        
        switch (menuOption){
            case "L":
                LevelKeyView levelKeyView = new LevelKeyView();
                levelKeyView.display();
                break;
            case "G":
                GameMenuView gameMenuView = new GameMenuView();
                gameMenuView.display();
                break;
            default:
                System.out.println("\n*** Invalid selection ** Try again");
                break;
        }
        return false;
    }
}
