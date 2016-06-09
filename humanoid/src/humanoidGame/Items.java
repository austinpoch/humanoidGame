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
public class Items {
    
    private int gold;
    private int iron;
    private int silver;
    private int wood;
    private int glass;
    private int gunPowder;
    private int magicIngrediantOne;
    private int magicIngrediantTwo;
    private int magicIngrediantThree;
    private int magicIngrediantFour;
    private int magicIngrediantFive;
    private int strengthItemOne;
    private int strengthItemTwo;
    private int strengthItemThree;
    private int strengthItemFour;
    private int strengthItemFive;

    public Items() {
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold += gold;
    }

    public int getIron() {
        return iron;
    }

    public void setIron(int iron) {
        this.iron = iron;
    }

    public int getSilver() {
        return silver;
    }

    public void setSilver(int silver) {
        this.silver = silver;
    }

    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public int getGlass() {
        return glass;
    }

    public void setGlass(int glass) {
        this.glass = glass;
    }

    public int getGunPowder() {
        return gunPowder;
    }

    public void setGunPowder(int gunPowder) {
        this.gunPowder = gunPowder;
    }

    public int getMagicIngrediantOne() {
        return magicIngrediantOne;
    }

    public void setMagicIngrediantOne(int magicIngrediantOne) {
        this.magicIngrediantOne = magicIngrediantOne;
    }

    public int getMagicIngrediantTwo() {
        return magicIngrediantTwo;
    }

    public void setMagicIngrediantTwo(int magicIngrediantTwo) {
        this.magicIngrediantTwo = magicIngrediantTwo;
    }

    public int getMagicIngrediantThree() {
        return magicIngrediantThree;
    }

    public void setMagicIngrediantThree(int magicIngrediantThree) {
        this.magicIngrediantThree = magicIngrediantThree;
    }

    public int getMagicIngrediantFour() {
        return magicIngrediantFour;
    }

    public void setMagicIngrediantFour(int magicIngrediantFour) {
        this.magicIngrediantFour = magicIngrediantFour;
    }

    public int getMagicIngrediantFive() {
        return magicIngrediantFive;
    }

    public void setMagicIngrediantFive(int magicIngrediantFive) {
        this.magicIngrediantFive = magicIngrediantFive;
    }

    public int getStrengthItemOne() {
        return strengthItemOne;
    }

    public void setStrengthItemOne(int strengthItemOne) {
        this.strengthItemOne = strengthItemOne;
    }

    public int getStrengthItemTwo() {
        return strengthItemTwo;
    }

    public void setStrengthItemTwo(int strengthItemTwo) {
        this.strengthItemTwo = strengthItemTwo;
    }

    public int getStrengthItemThree() {
        return strengthItemThree;
    }

    public void setStrengthItemThree(int strengthItemThree) {
        this.strengthItemThree = strengthItemThree;
    }

    public int getStrengthItemFour() {
        return strengthItemFour;
    }

    public void setStrengthItemFour(int strengthItemFour) {
        this.strengthItemFour = strengthItemFour;
    }

    public int getStrengthItemFive() {
        return strengthItemFive;
    }

    public void setStrengthItemFive(int strengthItemFive) {
        this.strengthItemFive = strengthItemFive;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.gold;
        hash = 79 * hash + this.iron;
        hash = 79 * hash + this.silver;
        hash = 79 * hash + this.wood;
        hash = 79 * hash + this.glass;
        hash = 79 * hash + this.gunPowder;
        hash = 79 * hash + this.magicIngrediantOne;
        hash = 79 * hash + this.magicIngrediantTwo;
        hash = 79 * hash + this.magicIngrediantThree;
        hash = 79 * hash + this.magicIngrediantFour;
        hash = 79 * hash + this.magicIngrediantFive;
        hash = 79 * hash + this.strengthItemOne;
        hash = 79 * hash + this.strengthItemTwo;
        hash = 79 * hash + this.strengthItemThree;
        hash = 79 * hash + this.strengthItemFour;
        hash = 79 * hash + this.strengthItemFive;
        return hash;
    }

    @Override
    public String toString() {
        return "Items{" + "gold=" + gold + ", iron=" + iron + ", silver=" + silver + ", wood=" + wood + ", glass=" + glass + ", gunPowder=" + gunPowder + ", magicIngrediantOne=" + magicIngrediantOne + ", magicIngrediantTwo=" + magicIngrediantTwo + ", magicIngrediantThree=" + magicIngrediantThree + ", magicIngrediantFour=" + magicIngrediantFour + ", magicIngrediantFive=" + magicIngrediantFive + ", strengthItemOne=" + strengthItemOne + ", strengthItemTwo=" + strengthItemTwo + ", strengthItemThree=" + strengthItemThree + ", strengthItemFour=" + strengthItemFour + ", strengthItemFive=" + strengthItemFive + '}';
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
        final Items other = (Items) obj;
        if (this.gold != other.gold) {
            return false;
        }
        if (this.iron != other.iron) {
            return false;
        }
        if (this.silver != other.silver) {
            return false;
        }
        if (this.wood != other.wood) {
            return false;
        }
        if (this.glass != other.glass) {
            return false;
        }
        if (this.gunPowder != other.gunPowder) {
            return false;
        }
        if (this.magicIngrediantOne != other.magicIngrediantOne) {
            return false;
        }
        if (this.magicIngrediantTwo != other.magicIngrediantTwo) {
            return false;
        }
        if (this.magicIngrediantThree != other.magicIngrediantThree) {
            return false;
        }
        if (this.magicIngrediantFour != other.magicIngrediantFour) {
            return false;
        }
        if (this.magicIngrediantFive != other.magicIngrediantFive) {
            return false;
        }
        if (this.strengthItemOne != other.strengthItemOne) {
            return false;
        }
        if (this.strengthItemTwo != other.strengthItemTwo) {
            return false;
        }
        if (this.strengthItemThree != other.strengthItemThree) {
            return false;
        }
        if (this.strengthItemFour != other.strengthItemFour) {
            return false;
        }
        if (this.strengthItemFive != other.strengthItemFive) {
            return false;
        }
        return true;
    }

    
            
}
