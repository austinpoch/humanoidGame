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
      System.out.println("\n*** createNewGame stub called ***");
    }
}