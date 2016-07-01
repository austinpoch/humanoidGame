/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humanoid;

import View.StartProgramView;
import humanoidGame.Game;
import humanoidGame.Player;

/**
 *
 * @author Austin Poch
 */
public class Humanoid {

    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
        
      //create StartProgramViev and display the start program view
      StartProgramView startProgramView = new StartProgramView();
      startProgramView.display();
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Humanoid.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player palyer) {
        Humanoid.player = palyer;
    }  
}
