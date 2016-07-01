/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import humanoid.Humanoid;
import humanoidGame.Game;
import humanoidGame.Player;
import javafx.scene.Scene;

/**
 *
 * @author Austin Poch
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
       
        if (playersName == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(playersName);
        
        Humanoid.setPlayer(player); // save the player
        
        return player;
    }

    public static void createNewGame(Player player) {
       Game game = new Game();
       Humanoid.setCurrentGame(game);
       
       game.setPlayer(player);
       
       InventoryItem[] inventoryList = GameControl.createInventoryList();
       game.setInventory(inventoryList);
       
       MapControl map = MapControl.createMap();
       game.setMap(map);
       
       MapControl.moveActorsToStartingLocation(map);
    }

    private static InventoryItem[] createInventoryList() {
       InventoryItem[] inventory = new InventoryItem[16];  
       
       InventoryItem gold = new InventoryItem();
       gold.setDescription("Gold");
       gold.setQuantityInStock(0);
       gold.setRequiredAmount(0);
       inventory[Item.gold.ordinal()] = gold;
       
       InventoryItem iron = new InventoryItem();
       iron.setDescription("Iron");
       iron.setQuantityInStock(0);
       iron.setRequiredAmount(0);
       inventory[Item.iron.ordinal()] = iron;
       
       InventoryItem silver = new InventoryItem();
       silver.setDescription("Silver");
       silver.setQuantityInStock(0);
       silver.setRequiredAmount(0);
       inventory[Item.silver.ordinal()] = silver;
       
       InventoryItem wood = new InventoryItem();
       wood.setDescription("Wood");
       wood.setQuantityInStock(0);
       wood.setRequiredAmount(0);
       inventory[Item.wood.ordinal()] = wood;
       
       InventoryItem glass = new InventoryItem();
       glass.setDescription("Glass");
       glass.setQuantityInStock(0);
       glass.setRequiredAmount(0);
       inventory[Item.glass.ordinal()] = glass;
       
       InventoryItem gunPowder = new InventoryItem();
       gunPowder.setDescription("Gun Powder");
       gunPowder.setQuantityInStock(0);
       gunPowder.setRequiredAmount(0);
       inventory[Item.gunPowder.ordinal()] = gunPowder;
       
       InventoryItem magicIngrediantOne = new InventoryItem();
       magicIngrediantOne.setDescription("Magic Ingrediant One");
       magicIngrediantOne.setQuantityInStock(0);
       magicIngrediantOne.setRequiredAmount(0);
       inventory[Item.magicIngrediantOne.ordinal()] = magicIngrediantOne;
       
       InventoryItem magicIngrediantTwo = new InventoryItem();
       magicIngrediantTwo.setDescription("Magic Ingrediant Two");
       magicIngrediantTwo.setQuantityInStock(0);
       magicIngrediantTwo.setRequiredAmount(0);
       inventory[Item.magicIngrediantTwo.ordinal()] = magicIngrediantTwo;
       
       InventoryItem magicIngrediantThree = new InventoryItem();
       magicIngrediantThree.setDescription("Magic Ingrediant Three");
       magicIngrediantThree.setQuantityInStock(0);
       magicIngrediantThree.setRequiredAmount(0);
       inventory[Item.magicIngrediantThree.ordinal()] = magicIngrediantThree;
       
       InventoryItem magicIngrediantFour = new InventoryItem();
       magicIngrediantFour.setDescription("Magic Ingrediant Four");
       magicIngrediantFour.setQuantityInStock(0);
       magicIngrediantFour.setRequiredAmount(0);
       inventory[Item.magicIngrediantFour.ordinal()] = magicIngrediantFour;
       
       InventoryItem magicIngrediantFive = new InventoryItem();
       magicIngrediantFive.setDescription("Magic Ingrediant Five");
       magicIngrediantFive.setQuantityInStock(0);
       magicIngrediantFive.setRequiredAmount(0);
       inventory[Item.magicIngrediantFive.ordinal()] = magicIngrediantFive;
       
       InventoryItem strengthItemOne = new InventoryItem();
       strengthItemOne.setDescription("Strength Item One");
       strengthItemOne.setQuantityInStock(0);
       strengthItemOne.setRequiredAmount(0);
       inventory[Item.strengthItemOne.ordinal()] = strengthItemOne;
       
       InventoryItem strengthItemTwo = new InventoryItem();
       strengthItemTwo.setDescription("Strength Item Two");
       strengthItemTwo.setQuantityInStock(0);
       strengthItemTwo.setRequiredAmount(0);
       inventory[Item.strengthItemTwo.ordinal()] = strengthItemTwo;
       
       InventoryItem strengthItemThree = new InventoryItem();
       strengthItemThree.setDescription("Strength Item Three");
       strengthItemThree.setQuantityInStock(0);
       strengthItemThree.setRequiredAmount(0);
       inventory[Item.strengthItemThree.ordinal()] = strengthItemThree;
       
       InventoryItem strengthItemFour = new InventoryItem();
       strengthItemFour.setDescription("Strength Item Four");
       strengthItemFour.setQuantityInStock(0);
       strengthItemFour.setRequiredAmount(0);
       inventory[Item.strengthItemFour.ordinal()] = strengthItemFour;
       
       InventoryItem strengthItemFive = new InventoryItem();
       strengthItemFive.setDescription("Strength Item Five");
       strengthItemFive.setQuantityInStock(0);
       strengthItemFive.setRequiredAmount(0);
       inventory[Item.strengthItemFive.ordinal()] = strengthItemFive;
       
       return inventory;
    }

    static void assignScenesToLocations(MapControl mapControl, Scene[] scenes) {
        System.out.println("*** assignScenesToLocations function called ***");
    }

    public static class InventoryItem {

        public InventoryItem() {
        }

        private void setDescription(String gold) {
            System.out.println("*** setDescriptione function called ***");
        }

        private void setQuantityInStock(int i) {
            System.out.println("*** setQuantityInStock function called ***");
        }

        private void setRequiredAmount(int i) {
            System.out.println("*** setRequiredAmount function called ***");
        }
    }
    
}
