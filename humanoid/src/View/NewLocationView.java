/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;

/**
 *
 * @author Austin Poch
 */
public class NewLocationView {
private String menu;
    
    public NewLocationView() {
        this.menu = "\n*************************************************"
                  + "\n*                                               *"
                  + "\n* Choose an available location:                 *"
                  + "\n*                                               *"
                  + "\n* A - City            N - Gun Shop              *"
                  + "\n* B - Home            O - Grocery Store         *"
                  + "\n* C - Hotel           P - Forest                *"
                  + "\n* D - House           Q - Mountain              *"
                  + "\n* E - Sky Scraper     R - Magic Shop            *"                         + "\n* F - Bar             S - Fire Dungeon          *"
                  + "\n* G - Car             T - Ice Dungeon           *"
                  + "\n* H - School          U - Wind Dungeon          *"
                  + "\n* I - Town            V - Sky                   *"
                  + "\n* J - Gold Mine       W - Beaver Dam            *"
                  + "\n* K - Iron Shop       X - Cave                  *"
                  + "\n* L - Silver Mine     Y - Underground Layer     *"
                  + "\n* M - Saloon          Z -                       *"
                  + "\n*                                               *"
                  + "\n*************************************************"
                  ;
    }
    
    void displayNewLocationView() {
        boolean done = false; // set flag to not done
        
        System.out.println(menu);
        
        do{
            //prompt for and get players name
            String menuOption = this.getInput();
                        
            // do the requested action and display the next view
            done = this. doAction(menuOption);
            
        }while (!done);
    }

    private String getInput() {
        Scanner keyboard = new Scanner(System.in);//get infile for keyboard
        String value = "";// value to be returned
        boolean valid = false; // initalized to not valid
        
        while (!valid){ // loop while an invalid value is entered
            System.out.println("\nPlease enter an option: ");
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalad value: value can not be blank");
                continue;
            }
            
            break; //end the loop         
        }
        return value; // return the value entered
    }

    private boolean doAction(String menuOption) {
        
        menuOption = menuOption.toUpperCase(); // convert to uppercase
        
        switch (menuOption){
            case "A": 
                CityView setOptionA = new CityView();
                setOptionA.displayCityView();
                break;
            case "B":
                HomeView setOptionB = new HomeView();
                setOptionB.displayHomeView();
                break;
            case "C": 
                HotelView setOptionC = new HotelView();
                setOptionC.displayHotelView();
                break;
            case "D": 
                HouseView setOptionD = new HouseView();
                setOptionD.displayHouseView();
                break;
            case "E": 
                SkyScraperView setOptionE = new SkyScraperView();
                setOptionE.displaySkyScraperView();
                break;
            case "F":
                BarView setOptionF = new BarView();
                setOptionF.displayBarView();
                break;
            case "G": 
                CarView setOptionG = new CarView();
                setOptionG.displayCarView();
                break;
            case "H": 
                SchoolView setOptionH = new SchoolView();
                setOptionH.displaySchoolView();
                break;
            case "I": 
                TownView setOptionI = new TownView();
                setOptionI.displayTownView();
                break;
            case "J":
                GoldMineView setOptionJ = new GoldMineView();
                setOptionJ.displayGoldMineView();
                break;
            case "K": 
                IronShopView setOptionK = new IronShopView();
                setOptionK.displayIronShopView();
                break;
            case "L": 
                SilverMineView setOptionL = new SilverMineView();
                setOptionL.displaySilverMineView();
                break;
            case "M": 
                SaloonView setOptionM = new SaloonView();
                setOptionM.displaySaloonView();
                break;
            case "N":
                GunShopView setOptionN = new GunShopView();
                setOptionN.displayGunShopView();
                break;
            case "O": 
                GroceryStoreView setOptionO = new GroceryStoreView();
                setOptionO.displayGroceryStoreView();
                break;
            case "P": 
                ForestView setOptionP = new ForestView();
                setOptionP.displayForestView();
                break;
            case "Q": 
                MountainView setOptionQ = new MountainView();
                setOptionQ.displayMountainView();
                break;
            case "R":
                MagicShopView setOptionR = new MagicShopView();
                setOptionR.displayMagicShopView();
                break;
            case "S": 
                FireDungeonView setOptionS = new FireDungeonView();
                setOptionS.displayFireDungeonView();
                break;
            case "T": 
                IceDungeonView setOptionT = new IceDungeonView();
                setOptionT.displayIceDungeonView();
                break;
            case "U": 
                WindDungeonView setOptionU = new WindDungeonView();
                setOptionU.displayWindDungeonView();
                break;
            case "V":
                SkyView setOptionV = new SkyView();
                setOptionV.displaySkyView();
                break;
            case "W": 
                BeaverDamView setOptionW = new BeaverDamView();
                setOptionW.displayBeaverDamView();
                break;
            case "X": 
                CaveView setOptionX = new CaveView();
                setOptionX.displayCaveView();
                break;
            case "Y": 
                UndergroundLayerView setOptionY = new UndergroundLayerView();
                setOptionY.displayUndergroundLayerView();
                break;
            case "Z": 
                CityView setOptionA = new CityView();
                setOptionA.displayCityView();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;  
    }
}
