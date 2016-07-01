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
public class Player {
    
    private String name;
    private String humanoidType;
    

    public Player() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHumanoidType() {
        return humanoidType;
    }

    public void setHumanoidType(String humanoidType) {
        this.humanoidType = humanoidType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.humanoidType);
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", humanoidType=" + humanoidType + '}';
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.humanoidType, other.humanoidType)) {
            return false;
        }
        return true;
    }
    
    
    
}
