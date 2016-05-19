/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humanoidGame;

import java.io.Serializable;

/**
 *
 * @author Austin Poch
 */
public class Game implements Serializable{
    
    private int opponentsAlive;
    private boolean selfAlive;
    private int selfHealth;

    public Game() {
    }

    public int getOpponentsAlive() {
        return opponentsAlive;
    }

    public void setOpponentsAlive(int opponentsAlive) {
        this.opponentsAlive = opponentsAlive;
    }

    public boolean isSelfAlive() {
        return selfAlive;
    }

    public void setSelfAlive(boolean selfAlive) {
        this.selfAlive = selfAlive;
    }

    public int getSelfHealth() {
        return selfHealth;
    }

    public void setSelfHealth(int selfHealth) {
        this.selfHealth = selfHealth;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.opponentsAlive;
        hash = 29 * hash + (this.selfAlive ? 1 : 0);
        hash = 29 * hash + this.selfHealth;
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "opponentsAlive=" + opponentsAlive + ", selfAlive=" + selfAlive + ", selfHealth=" + selfHealth + '}';
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
        final Game other = (Game) obj;
        if (this.opponentsAlive != other.opponentsAlive) {
            return false;
        }
        if (this.selfAlive != other.selfAlive) {
            return false;
        }
        if (this.selfHealth != other.selfHealth) {
            return false;
        }
        return true;
    }

    public String toStirng() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
