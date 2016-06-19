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
public class GameMenuView extends View{
    
    public GameMenuView() {
        
        super("\n"
            + "\n-----------------------------"
            + "\n| Game Play Menu            |"
            + "\n-----------------------------"
            + "\nE - Explore new location"
            + "\nL - View Locations"
            + "\nO - View Attack Options"
            + "\nV - View Everyone's Health"
            + "\nA - Attack Opponent"
            + "\nH - Help Menu"
            + "\nM - Main Menu"
            + "\n-----------------------------");
    }
    
    @Override
    public boolean doAction(String menuOption) {
       menuOption = menuOption.toUpperCase(); // convert to uppercase
        
        switch (menuOption){
            case "E": // explore new location
                this.newLocation();
                break;
            case "L": // view locations
                ViewLocationsView viewLocationsView = new ViewLocationsView();
                viewLocationsView.display();
                break;
            case "O": // view attack options
                this.viewAttackOptions();
                break;
            case "V": // view everyones health
                this.viewEveryonesHealth();
                break;
            case "A": // attack opponent
                this.attackOpponent();
                break;
            case "H": // display help menu
                HelpMenuView helpMenuView = new HelpMenuView();
                helpMenuView.display();
                break;
            case "M": // main menu
                MainMenuView mainMenuView = new MainMenuView();
                mainMenuView.display();
                break;
            default:
                System.out.println("\n*** Invalid selection ** Try again");
                break;
        }
        return false;
    }

    private void newLocation() {
        NewLocationView newLocationView = new NewLocationView();
        newLocationView.display();
    }

    private void viewAttackOptions() {
        System.out.println("\n*** viewAttackOptions called ***");
    }

    private void viewEveryonesHealth() {
        System.out.println("\n*** viewEveryonesHealth called ***");
    }

    private void attackOpponent() {
        System.out.println("\n*** attackOpponent called ***");
    }
}