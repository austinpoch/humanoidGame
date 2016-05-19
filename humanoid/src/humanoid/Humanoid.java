/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humanoid;

import humanoidGame.Game;

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
    }
    
}
