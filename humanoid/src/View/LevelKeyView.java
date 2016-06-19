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
public class LevelKeyView extends View {
    
    public LevelKeyView() {
        
        super("\n*************************************************"
            + "\n*                                               *"
            + "\n* These are the locations that corrispond with  *"
            + "\n* the numbers on the other page.                *"
            + "\n*                                               *"
            + "\n* 1 - City            14 - Gun Shop             *"
            + "\n* 2 - Home            15 - Grocery Store        *"
            + "\n* 3 - Hotel           16 - Forest               *"
            + "\n* 4 - House           17 - Mountain             *"
            + "\n* 5 - Sky Scraper     18 - Magic Shop           *"                         
            + "\n* 6 - Bar             19 - Fire Dungeon         *"
            + "\n* 7 - Car             20 - Ice Dungeon          *"
            + "\n* 8 - School          21 - Wind Dungeon         *"
            + "\n* 9 - Town            22 - Sky                  *"
            + "\n* 10 - Gold Mine      23 - Beaver Dam           *"
            + "\n* 11 - Iron Shop      24 - Cave                 *"
            + "\n* 12 - Silver Mine    25 - Underground Layer    *"
            + "\n* 13 - Saloon                                   *"
            + "\n*                                               *"
            + "\n* V - View Map                                  *"
            + "\n*                                               *"    
            + "\n*************************************************");
    } 
    @Override
    public boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase(); // convert to uppercase
        
        switch (menuOption){
            case "V":
                ViewLocationsView viewLocationsView = new ViewLocationsView();
                viewLocationsView.display();
                break;
            default:
                System.out.println("\n*** Invalid selection ** Try again");
                break;
        }
        return false;
    }
}
