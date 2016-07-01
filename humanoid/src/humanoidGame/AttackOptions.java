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
public class AttackOptions {
     private boolean sword;
     private boolean gun;
     private boolean missile;
     private boolean spellOne;
     private boolean spellTwo;
     private boolean spellThree;
     private boolean strengthLevelOne;
     private boolean strengthLevelTwo;
     private boolean strengthLevelThree;
     
     private Scenes scenes;
     private Items items[];

    public AttackOptions() {
    }

    public boolean isSword() {
        return sword;
    }

    public void setSword(boolean sword) {
        this.sword = sword;
    }

    public boolean isGun() {
        return gun;
    }

    public void setGun(boolean gun) {
        this.gun = gun;
    }

    public boolean isMissile() {
        return missile;
    }

    public void setMissile(boolean missile) {
        this.missile = missile;
    }

    public boolean isSpellOne() {
        return spellOne;
    }

    public void setSpellOne(boolean spellOne) {
        this.spellOne = spellOne;
    }

    public boolean isSpellTwo() {
        return spellTwo;
    }

    public void setSpellTwo(boolean spellTwo) {
        this.spellTwo = spellTwo;
    }

    public boolean isSpellThree() {
        return spellThree;
    }

    public void setSpellThree(boolean spellThree) {
        this.spellThree = spellThree;
    }

    public boolean isStrengthLevelOne() {
        return strengthLevelOne;
    }

    public void setStrengthLevelOne(boolean strengthLevelOne) {
        this.strengthLevelOne = strengthLevelOne;
    }

    public boolean isStrengthLevelTwo() {
        return strengthLevelTwo;
    }

    public void setStrengthLevelTwo(boolean strengthLevelTwo) {
        this.strengthLevelTwo = strengthLevelTwo;
    }

    public boolean isStrengthLevelThree() {
        return strengthLevelThree;
    }

    public void setStrengthLevelThree(boolean strengthLevelThree) {
        this.strengthLevelThree = strengthLevelThree;
    }

    public Scenes getScenes() {
        return scenes;
    }

    public void setScenes(Scenes scenes) {
        this.scenes = scenes;
    }

    public Items[] getItems() {
        return items;
    }

    public void setItems(Items[] items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.sword ? 1 : 0);
        hash = 97 * hash + (this.gun ? 1 : 0);
        hash = 97 * hash + (this.missile ? 1 : 0);
        hash = 97 * hash + (this.spellOne ? 1 : 0);
        hash = 97 * hash + (this.spellTwo ? 1 : 0);
        hash = 97 * hash + (this.spellThree ? 1 : 0);
        hash = 97 * hash + (this.strengthLevelOne ? 1 : 0);
        hash = 97 * hash + (this.strengthLevelTwo ? 1 : 0);
        hash = 97 * hash + (this.strengthLevelThree ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "AttackOptions{" + "sword=" + sword + ", gun=" + gun + ", missile=" + missile + ", spellOne=" + spellOne + ", spellTwo=" + spellTwo + ", spellThree=" + spellThree + ", strengthLevelOne=" + strengthLevelOne + ", strengthLevelTwo=" + strengthLevelTwo + ", strengthLevelThree=" + strengthLevelThree + '}';
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
        final AttackOptions other = (AttackOptions) obj;
        if (this.sword != other.sword) {
            return false;
        }
        if (this.gun != other.gun) {
            return false;
        }
        if (this.missile != other.missile) {
            return false;
        }
        if (this.spellOne != other.spellOne) {
            return false;
        }
        if (this.spellTwo != other.spellTwo) {
            return false;
        }
        if (this.spellThree != other.spellThree) {
            return false;
        }
        if (this.strengthLevelOne != other.strengthLevelOne) {
            return false;
        }
        if (this.strengthLevelTwo != other.strengthLevelTwo) {
            return false;
        }
        if (this.strengthLevelThree != other.strengthLevelThree) {
            return false;
        }
        return true;
    }
     
     
}
