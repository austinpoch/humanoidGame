/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humanoid;

import humanoidGame.AttackOptions;
import humanoidGame.Characters;
import humanoidGame.Game;
import humanoidGame.Items;
import humanoidGame.Locations;
import humanoidGame.Player;
import humanoidGame.Scenes;
import humanoidGame.StartGame;

/**
 *
 * @author Austin Poch
 */
public class Humanoid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Game gameOne = new Game();
        gameOne.setSelfAlive(true);
        gameOne.setOpponentsAlive(2);
        gameOne.setSelfHealth(100);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        
        StartGame humanoidOne = new StartGame();
        humanoidOne.setHumanoidOne(true);
        humanoidOne.setHumanoidTwo(false);
        humanoidOne.setHumanoidThree(false);
        
        StartGame humanoidTwo = new StartGame();
        humanoidTwo.setHumanoidOne(false);
        humanoidTwo.setHumanoidTwo(true);
        humanoidTwo.setHumanoidThree(false);
        
        StartGame humanoidThree = new StartGame();
        humanoidThree.setHumanoidOne(false);
        humanoidThree.setHumanoidTwo(false);
        humanoidThree.setHumanoidThree(true);
        
        String startGameInfo = humanoidOne.toString();
        System.out.println(startGameInfo);
      
        
        Player name = new Player();
        name.setName("Austin");
        name.setHumanoidType("type 1");
        
        Player humanoidType = new Player();
        humanoidType.setHumanoidType("type 1");
        humanoidType.setName("Austin");
        
        String playerName = name.toString();
        String playerType = humanoidType.toString();
        System.out.println(playerName + playerType);
    
        
        Characters opponentOne = new Characters();
        opponentOne.setOpponentOneAlive(true);
        opponentOne.setOpponentOneHealth(100);
        opponentOne.setOpponentTwoAlive(true);
        opponentOne.setOpponentTwoHealth(100);
        
        Characters opponentTwo = new Characters();
        opponentTwo.setOpponentOneAlive(true);
        opponentTwo.setOpponentOneHealth(100);
        opponentTwo.setOpponentTwoAlive(true);
        opponentTwo.setOpponentTwoHealth(100);
        
        String characterOneInfo = opponentOne.toString();
        String characterTwoInfo = opponentTwo.toString();
        System.out.println(characterOneInfo + characterTwoInfo);
        
        
        Scenes startProgram = new Scenes();
        startProgram.setStartProgram(true);

        Scenes gameGoal = new Scenes();
        gameGoal.setGameGoal(true);
        
        Scenes hint = new Scenes();
        hint.setHint(true);
        
        Scenes viewLocations = new Scenes();
        viewLocations.setViewLocations(true);
        
        Scenes viewInventory = new Scenes();
        viewInventory.setViewInventory(true);
        
        Scenes viewAttackOptions = new Scenes();
        viewAttackOptions.setViewAttackOptions(true);
        
        Scenes viewEveryonesHealth = new Scenes();
        viewEveryonesHealth.setViewEveryonesHealth(true);
        
        Scenes attackOpponent = new Scenes();
        attackOpponent.setAttackOpponent(true);
        
        Scenes locations = new Scenes();
        locations.setLocations(true);
        
        String gameGoalInfo = gameGoal.toString();
        System.out.println(gameGoal);
        
        
        Locations city = new Locations();
        city.setCity(true);
        
        Locations home = new Locations();
        home.setHome(true);
        
        Locations hotel = new Locations();
        hotel.setHotel(true);
        
        Locations house = new Locations();
        house.setHouse(true);
        
        Locations skyScraper = new Locations();
        skyScraper.setSkyScraper(true);
        
        Locations bar = new Locations();
        bar.setBar(true);
        
        Locations car = new Locations();
        car.setCar(true);
        
        Locations school = new Locations();
        school.setSchool(true);
        
        Locations town = new Locations();
        town.setTown(true);
        
        Locations goldMine = new Locations();
        goldMine.setGoldMine(true);
        
        Locations ironShop = new Locations();
        ironShop.setIronShop(true);
        
        Locations silverMine = new Locations();
        silverMine.setSilverMine(true);
        
        Locations saloon = new Locations();
        saloon.setSaloon(true);
        
        Locations gunShop = new Locations();
        gunShop.setGunShop(true);
        
        Locations groceryStore = new Locations();
        groceryStore.setGroceryStore(true);
        
        Locations forest = new Locations();
        forest.setForest(true);
        
        Locations mountain = new Locations();
        mountain.setMountain(true);
        
        Locations magicShop = new Locations();
        magicShop.setMagicShop(true);
        
        Locations fireDungeon = new Locations();
        fireDungeon.setFireDungeon(true);
        
        Locations iceDungeon = new Locations();
        iceDungeon.setIceDungeon(true);
        
        Locations windDungeon = new Locations();
        windDungeon.setWindDungeon(true);
        
        Locations sky = new Locations();
        sky.setSky(true);
        
        Locations beaverDam = new Locations();
        beaverDam.setBeaverDam(true);
        
        Locations cave = new Locations();
        cave.setCave(true);
        
        Locations undergroundLayer = new Locations();
        undergroundLayer.setUndergroundLayer(true);
        
        String homeInfo = home.toString();
        System.out.println(homeInfo);
        
        
        Items gold = new Items();
        gold.setGold(0);
        
        Items iron = new Items();
        iron.setIron(0);
        
        Items silver = new Items();
        silver.setSilver(0);
        
        Items wood = new Items();
        wood.setWood(0);
        
        Items glass = new Items();
        glass.setGlass(0);
        
        Items gunPowder = new Items();
        gunPowder.setGunPowder(0);
        
        Items magicIngrediantOne = new Items();
        magicIngrediantOne.setMagicIngrediantOne(0);
        
        Items magicIngrediantTwo = new Items();
        magicIngrediantTwo.setMagicIngrediantTwo(0);
        
        Items magicIngrediantThree = new Items();
        magicIngrediantThree.setMagicIngrediantThree(0);
        
        Items magicIngrediantFour = new Items();
        magicIngrediantFour.setMagicIngrediantFour(0);
        
        Items magicIngrediantFive = new Items();
        magicIngrediantFive.setMagicIngrediantFive(0);
        
        Items strengthItemOne = new Items();
        strengthItemOne.setStrengthItemOne(0);
        
        Items strengthItemTwo = new Items();
        strengthItemTwo.setStrengthItemTwo(0);
        
        Items strengthItemThree = new Items();
        strengthItemThree.setStrengthItemThree(0);
        
        Items strengthItemFour = new Items();
        strengthItemFour.setStrengthItemFour(0);
        
        Items strengthItemFive = new Items();
        strengthItemFive.setStrengthItemFive(0);
        
        String itemsInfo = gold.toString();
        System.out.println(itemsInfo);
        
        
        AttackOptions sword = new AttackOptions();
        sword.setSword(false);
        
        AttackOptions gun = new AttackOptions();
        gun.setGun(false);
        
        AttackOptions missile = new AttackOptions();
        missile.setMissile(false);
        
        AttackOptions spellOne = new AttackOptions();
        spellOne.setSpellTwo(false);
        
        AttackOptions spellTwo = new AttackOptions();
        spellTwo.setSpellTwo(false);
        
        AttackOptions spellThree = new AttackOptions();
        spellThree.setSpellThree(false);
        
        AttackOptions strengthLevelOne = new AttackOptions();
        strengthLevelOne.setStrengthLevelOne(false);
        
        AttackOptions strengthLevelTwo = new AttackOptions();
        strengthLevelTwo.setStrengthLevelTwo(false);
        
        AttackOptions strengthLevelThree = new AttackOptions();
        strengthLevelThree.setStrengthLevelThree(false);
        
        String attackInfo = sword.toString();
        System.out.println(attackInfo);
    }
    
}
