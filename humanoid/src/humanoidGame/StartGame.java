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
public class StartGame implements Serializable{
    
    private boolean humanoidOne;
    private boolean humanoidTwo;
    private boolean humanoidThree;

    public StartGame() {
    }
    
    public boolean isHumanoidOne() {
        return humanoidOne;
    }

    public void setHumanoidOne(boolean humanoidOne) {
        this.humanoidOne = humanoidOne;
    }

    public boolean isHumanoidTwo() {
        return humanoidTwo;
    }

    public void setHumanoidTwo(boolean humanoidTwo) {
        this.humanoidTwo = humanoidTwo;
    }

    public boolean isHumanoidThree() {
        return humanoidThree;
    }

    public void setHumanoidThree(boolean humanoidThree) {
        this.humanoidThree = humanoidThree;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (this.humanoidOne ? 1 : 0);
        hash = 31 * hash + (this.humanoidTwo ? 1 : 0);
        hash = 31 * hash + (this.humanoidThree ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "StartGame{" + "humanoidOne=" + humanoidOne + ", humanoidTwo=" + humanoidTwo + ", humanoidThree=" + humanoidThree + '}';
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
        final StartGame other = (StartGame) obj;
        if (this.humanoidOne != other.humanoidOne) {
            return false;
        }
        if (this.humanoidTwo != other.humanoidTwo) {
            return false;
        }
        if (this.humanoidThree != other.humanoidThree) {
            return false;
        }
        return true;
    }
    
    
}
