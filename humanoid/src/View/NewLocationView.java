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
public class NewLocationView extends View{
    
    public NewLocationView() {
        
        super("\n*************************************************"
            + "\n*                                               *"
            + "\n* Choose an available location:                 *"
            + "\n*                                               *"
            + "\n* A - City            N - Gun Shop              *"
            + "\n* B - Home            O - Grocery Store         *"
            + "\n* C - Hotel           P - Forest                *"
            + "\n* D - House           Q - Mountain              *"
            + "\n* E - Sky Scraper     R - Magic Shop            *"                         
            + "\n* F - Bar             S - Fire Dungeon          *"
            + "\n* G - Car             T - Ice Dungeon           *"
            + "\n* H - School          U - Wind Dungeon          *"
            + "\n* I - Town            V - Sky                   *"
            + "\n* J - Gold Mine       W - Beaver Dam            *"
            + "\n* K - Iron Shop       X - Cave                  *"
            + "\n* L - Silver Mine     Y - Underground Layer     *"
            + "\n* M - Saloon          Z -                       *"
            + "\n*                                               *"
            + "\n*************************************************");
    }
    
    @Override
    public boolean doAction(String menuOption) {
        
        menuOption = menuOption.toUpperCase(); // convert to uppercase
        
        switch (menuOption){
            case "A": 
                CityView setOptionA = new CityView();
                setOptionA.display();
                break;
            case "B":
                HomeView setOptionB = new HomeView();
                setOptionB.display();
                break;
            case "C": 
                HotelView setOptionC = new HotelView();
                setOptionC.display();
                break;
            case "D": 
                HouseView setOptionD = new HouseView();
                setOptionD.display();
                break;
            case "E": 
                SkyScraperView setOptionE = new SkyScraperView();
                setOptionE.display();
                break;
            case "F":
                BarView setOptionF = new BarView();
                setOptionF.display();
                break;
            case "G": 
                CarView setOptionG = new CarView();
                setOptionG.display();
                break;
            case "H": 
                SchoolView setOptionH = new SchoolView();
                setOptionH.display();
                break;
            case "I": 
                TownView setOptionI = new TownView();
                setOptionI.display();
                break;
            case "J":
                GoldMineView setOptionJ = new GoldMineView();
                setOptionJ.display();
                break;
            case "K": 
                IronShopView setOptionK = new IronShopView();
                setOptionK.displayIronShopView();
                break;
            case "L": 
                SilverMineView setOptionL = new SilverMineView();
                setOptionL.display();
                break;
            case "M": 
                SaloonView setOptionM = new SaloonView();
                setOptionM.display();
                break;
            case "N":
                GunShopView setOptionN = new GunShopView();
                setOptionN.displayGunShopView();
                break;
            case "O": 
                GroceryStoreView setOptionO = new GroceryStoreView();
                setOptionO.display();
                break;
            case "P": 
                ForestView setOptionP = new ForestView();
                setOptionP.displayForestView();
                break;
            case "Q": 
                MountainView setOptionQ = new MountainView();
                setOptionQ.display();
                break;
            case "R":
                MagicShopView setOptionR = new MagicShopView();
                setOptionR.display();
                break;
            case "S": 
                FireDungeonView setOptionS = new FireDungeonView();
                setOptionS.display();
                break;
            case "T": 
                IceDungeonView setOptionT = new IceDungeonView();
                setOptionT.display();
                break;
            case "U": 
                WindDungeonView setOptionU = new WindDungeonView();
                setOptionU.display();
                break;
            case "V":
                SkyView setOptionV = new SkyView();
                setOptionV.display();
                break;
            case "W": 
                BeaverDamView setOptionW = new BeaverDamView();
                setOptionW.display();
                break;
            case "X": 
                CaveView setOptionX = new CaveView();
                setOptionX.display();
                break;
            case "Y": 
                UndergroundLayerView setOptionY = new UndergroundLayerView();
                setOptionY.display();
                break;
            case "Z": 
                CityView setOptionA = new CityView();
                setOptionA.display();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;  
    }
}
