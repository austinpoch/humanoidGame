/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humanoidGame;

/**
 *
 * @author Austin Poch
 */
public class Characters {
    
    private boolean opponentOneAlive;
    private int opponentOneHealth;
    private boolean opponentTwoAlive;
    private int opponentTwoHealth;

    public Characters() {
    }

        public boolean isOpponentOneAlive() {
        return opponentOneAlive;
    }

    public void setOpponentOneAlive(boolean opponentOneAlive) {
        this.opponentOneAlive = opponentOneAlive;
    }

    public int getOpponentOneHealth() {
        return opponentOneHealth;
    }

    public void setOpponentOneHealth(int opponentOneHealth) {
        this.opponentOneHealth = opponentOneHealth;
    }

    public boolean isOpponentTwoAlive() {
        return opponentTwoAlive;
    }

    public void setOpponentTwoAlive(boolean opponentTwoAlive) {
        this.opponentTwoAlive = opponentTwoAlive;
    }

    public int getOpponentTwoHealth() {
        return opponentTwoHealth;
    }

    public void setOpponentTwoHealth(int opponentTwoHealth) {
        this.opponentTwoHealth = opponentTwoHealth;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + (this.opponentOneAlive ? 1 : 0);
        hash = 83 * hash + this.opponentOneHealth;
        hash = 83 * hash + (this.opponentTwoAlive ? 1 : 0);
        hash = 83 * hash + this.opponentTwoHealth;
        return hash;
    }

    @Override
    public String toString() {
        return "Characters{" + "opponentOneAlive=" + opponentOneAlive + ", opponentOneHealth=" + opponentOneHealth + ", opponentTwoAlive=" + opponentTwoAlive + ", opponentTwoHealth=" + opponentTwoHealth + '}';
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
        final Characters other = (Characters) obj;
        if (this.opponentOneAlive != other.opponentOneAlive) {
            return false;
        }
        if (this.opponentOneHealth != other.opponentOneHealth) {
            return false;
        }
        if (this.opponentTwoAlive != other.opponentTwoAlive) {
            return false;
        }
        if (this.opponentTwoHealth != other.opponentTwoHealth) {
            return false;
        }
        return true;
    }

       
    
}
