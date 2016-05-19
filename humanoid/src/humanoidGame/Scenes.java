/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humanoidGame;

import java.util.Objects;

/**
 *
 * @author Austin Poch
 */
public class Scenes {
    
    private boolean startProgram;
    private boolean gameGoal;
    private boolean hint;
    private boolean viewLocations;
    private boolean viewInventory;
    private boolean viewAttackOptions;
    private boolean viewEveryonesHealth;
    private boolean attackOpponent;
    private boolean locations;

    public Scenes() {
    }

    public boolean isStartProgram() {
        return startProgram;
    }

    public void setStartProgram(boolean startProgram) {
        this.startProgram = startProgram;
    }

    public boolean isGameGoal() {
        return gameGoal;
    }

    public void setGameGoal(boolean gameGoal) {
        this.gameGoal = gameGoal;
    }

    public boolean isHint() {
        return hint;
    }

    public void setHint(boolean hint) {
        this.hint = hint;
    }

    public boolean isViewLocations() {
        return viewLocations;
    }

    public void setViewLocations(boolean viewLocations) {
        this.viewLocations = viewLocations;
    }

    public boolean isViewInventory() {
        return viewInventory;
    }

    public void setViewInventory(boolean viewInventory) {
        this.viewInventory = viewInventory;
    }

    public boolean isViewAttackOptions() {
        return viewAttackOptions;
    }

    public void setViewAttackOptions(boolean viewAttackOptions) {
        this.viewAttackOptions = viewAttackOptions;
    }

    public boolean isViewEveryonesHealth() {
        return viewEveryonesHealth;
    }

    public void setViewEveryonesHealth(boolean viewEveryonesHealth) {
        this.viewEveryonesHealth = viewEveryonesHealth;
    }

    public boolean isAttackOpponent() {
        return attackOpponent;
    }

    public void setAttackOpponent(boolean attackOpponent) {
        this.attackOpponent = attackOpponent;
    }

    public boolean isLocations() {
        return locations;
    }

    public void setLocations(boolean locations) {
        this.locations = locations;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.startProgram ? 1 : 0);
        hash = 79 * hash + (this.gameGoal ? 1 : 0);
        hash = 79 * hash + (this.hint ? 1 : 0);
        hash = 79 * hash + (this.viewLocations ? 1 : 0);
        hash = 79 * hash + (this.viewInventory ? 1 : 0);
        hash = 79 * hash + (this.viewAttackOptions ? 1 : 0);
        hash = 79 * hash + (this.viewEveryonesHealth ? 1 : 0);
        hash = 79 * hash + (this.attackOpponent ? 1 : 0);
        hash = 79 * hash + (this.locations ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Scenes{" + "startProgram=" + startProgram + ", gameGoal=" + gameGoal + ", hint=" + hint + ", viewLocations=" + viewLocations + ", viewInventory=" + viewInventory + ", viewAttackOptions=" + viewAttackOptions + ", viewEveryonesHealth=" + viewEveryonesHealth + ", attackOpponent=" + attackOpponent + ", locations=" + locations + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scenes other = (Scenes) obj;
        if (this.startProgram != other.startProgram) {
            return false;
        }
        if (this.gameGoal != other.gameGoal) {
            return false;
        }
        if (this.hint != other.hint) {
            return false;
        }
        if (this.viewLocations != other.viewLocations) {
            return false;
        }
        if (this.viewInventory != other.viewInventory) {
            return false;
        }
        if (this.viewAttackOptions != other.viewAttackOptions) {
            return false;
        }
        if (this.viewEveryonesHealth != other.viewEveryonesHealth) {
            return false;
        }
        if (this.attackOpponent != other.attackOpponent) {
            return false;
        }
        if (this.locations != other.locations) {
            return false;
        }
        return true;
    }

    

   
}
