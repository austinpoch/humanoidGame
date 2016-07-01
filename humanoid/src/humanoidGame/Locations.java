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
public class Locations {
    
    private boolean city;
    private boolean home;
    private boolean hotel;
    private boolean house;
    private boolean skyScraper;
    private boolean bar;
    private boolean car;
    private boolean school;
    private boolean town;
    private boolean goldMine;
    private boolean ironShop;
    private boolean silverMine;
    private boolean saloon;
    private boolean gunShop;
    private boolean groceryStore;
    private boolean forest;
    private boolean mountain;
    private boolean magicShop;
    private boolean fireDungeon;
    private boolean iceDungeon;
    private boolean windDungeon;
    private boolean sky;
    private boolean beaverDam;
    private boolean cave;
    private boolean undergroundLayer;
    

    public Locations() {
    }

    public boolean isCity() {
        return city;
    }

    public void setCity(boolean city) {
        this.city = city;
    }

    public boolean isHome() {
        return home;
    }

    public void setHome(boolean home) {
        this.home = home;
    }

    public boolean isHotel() {
        return hotel;
    }

    public void setHotel(boolean hotel) {
        this.hotel = hotel;
    }

    public boolean isHouse() {
        return house;
    }

    public void setHouse(boolean house) {
        this.house = house;
    }

    public boolean isSkyScraper() {
        return skyScraper;
    }

    public void setSkyScraper(boolean skyScraper) {
        this.skyScraper = skyScraper;
    }

    public boolean isBar() {
        return bar;
    }

    public void setBar(boolean bar) {
        this.bar = bar;
    }

    public boolean isCar() {
        return car;
    }

    public void setCar(boolean car) {
        this.car = car;
    }

    public boolean isSchool() {
        return school;
    }

    public void setSchool(boolean school) {
        this.school = school;
    }

    public boolean isTown() {
        return town;
    }

    public void setTown(boolean town) {
        this.town = town;
    }

    public boolean isGoldMine() {
        return goldMine;
    }

    public void setGoldMine(boolean goldMine) {
        this.goldMine = goldMine;
    }

    public boolean isIronShop() {
        return ironShop;
    }

    public void setIronShop(boolean ironShop) {
        this.ironShop = ironShop;
    }

    public boolean isSilverMine() {
        return silverMine;
    }

    public void setSilverMine(boolean silverMine) {
        this.silverMine = silverMine;
    }

    public boolean isSaloon() {
        return saloon;
    }

    public void setSaloon(boolean saloon) {
        this.saloon = saloon;
    }

    public boolean isGunShop() {
        return gunShop;
    }

    public void setGunShop(boolean gunShop) {
        this.gunShop = gunShop;
    }

    public boolean isGroceryStore() {
        return groceryStore;
    }

    public void setGroceryStore(boolean groceryStore) {
        this.groceryStore = groceryStore;
    }

    public boolean isForest() {
        return forest;
    }

    public void setForest(boolean forest) {
        this.forest = forest;
    }

    public boolean isMountain() {
        return mountain;
    }

    public void setMountain(boolean mountain) {
        this.mountain = mountain;
    }

    public boolean isMagicShop() {
        return magicShop;
    }

    public void setMagicShop(boolean magicShop) {
        this.magicShop = magicShop;
    }

    public boolean isFireDungeon() {
        return fireDungeon;
    }

    public void setFireDungeon(boolean fireDungeon) {
        this.fireDungeon = fireDungeon;
    }

    public boolean isIceDungeon() {
        return iceDungeon;
    }

    public void setIceDungeon(boolean iceDungeon) {
        this.iceDungeon = iceDungeon;
    }

    public boolean isWindDungeon() {
        return windDungeon;
    }

    public void setWindDungeon(boolean windDungeon) {
        this.windDungeon = windDungeon;
    }

    public boolean isSky() {
        return sky;
    }

    public void setSky(boolean sky) {
        this.sky = sky;
    }

    public boolean isBeaverDam() {
        return beaverDam;
    }

    public void setBeaverDam(boolean beaverDam) {
        this.beaverDam = beaverDam;
    }

    public boolean isCave() {
        return cave;
    }

    public void setCave(boolean cave) {
        this.cave = cave;
    }

    public boolean isUndergroundLayer() {
        return undergroundLayer;
    }

    public void setUndergroundLayer(boolean undergroundLayer) {
        this.undergroundLayer = undergroundLayer;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + (this.city ? 1 : 0);
        hash = 43 * hash + (this.home ? 1 : 0);
        hash = 43 * hash + (this.hotel ? 1 : 0);
        hash = 43 * hash + (this.house ? 1 : 0);
        hash = 43 * hash + (this.skyScraper ? 1 : 0);
        hash = 43 * hash + (this.bar ? 1 : 0);
        hash = 43 * hash + (this.car ? 1 : 0);
        hash = 43 * hash + (this.school ? 1 : 0);
        hash = 43 * hash + (this.town ? 1 : 0);
        hash = 43 * hash + (this.goldMine ? 1 : 0);
        hash = 43 * hash + (this.ironShop ? 1 : 0);
        hash = 43 * hash + (this.silverMine ? 1 : 0);
        hash = 43 * hash + (this.saloon ? 1 : 0);
        hash = 43 * hash + (this.gunShop ? 1 : 0);
        hash = 43 * hash + (this.groceryStore ? 1 : 0);
        hash = 43 * hash + (this.forest ? 1 : 0);
        hash = 43 * hash + (this.mountain ? 1 : 0);
        hash = 43 * hash + (this.magicShop ? 1 : 0);
        hash = 43 * hash + (this.fireDungeon ? 1 : 0);
        hash = 43 * hash + (this.iceDungeon ? 1 : 0);
        hash = 43 * hash + (this.windDungeon ? 1 : 0);
        hash = 43 * hash + (this.sky ? 1 : 0);
        hash = 43 * hash + (this.beaverDam ? 1 : 0);
        hash = 43 * hash + (this.cave ? 1 : 0);
        hash = 43 * hash + (this.undergroundLayer ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Locations{" + "city=" + city + ", home=" + home + ", hotel=" + hotel + ", house=" + house + ", skyScraper=" + skyScraper + ", bar=" + bar + ", car=" + car + ", school=" + school + ", town=" + town + ", goldMine=" + goldMine + ", ironShop=" + ironShop + ", silverMine=" + silverMine + ", saloon=" + saloon + ", gunShop=" + gunShop + ", groceryStore=" + groceryStore + ", forest=" + forest + ", mountain=" + mountain + ", magicShop=" + magicShop + ", fireDungeon=" + fireDungeon + ", iceDungeon=" + iceDungeon + ", windDungeon=" + windDungeon + ", sky=" + sky + ", beaverDam=" + beaverDam + ", cave=" + cave + ", undergroundLayer=" + undergroundLayer + '}';
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
        final Locations other = (Locations) obj;
        if (this.city != other.city) {
            return false;
        }
        if (this.home != other.home) {
            return false;
        }
        if (this.hotel != other.hotel) {
            return false;
        }
        if (this.house != other.house) {
            return false;
        }
        if (this.skyScraper != other.skyScraper) {
            return false;
        }
        if (this.bar != other.bar) {
            return false;
        }
        if (this.car != other.car) {
            return false;
        }
        if (this.school != other.school) {
            return false;
        }
        if (this.town != other.town) {
            return false;
        }
        if (this.goldMine != other.goldMine) {
            return false;
        }
        if (this.ironShop != other.ironShop) {
            return false;
        }
        if (this.silverMine != other.silverMine) {
            return false;
        }
        if (this.saloon != other.saloon) {
            return false;
        }
        if (this.gunShop != other.gunShop) {
            return false;
        }
        if (this.groceryStore != other.groceryStore) {
            return false;
        }
        if (this.forest != other.forest) {
            return false;
        }
        if (this.mountain != other.mountain) {
            return false;
        }
        if (this.magicShop != other.magicShop) {
            return false;
        }
        if (this.fireDungeon != other.fireDungeon) {
            return false;
        }
        if (this.iceDungeon != other.iceDungeon) {
            return false;
        }
        if (this.windDungeon != other.windDungeon) {
            return false;
        }
        if (this.sky != other.sky) {
            return false;
        }
        if (this.beaverDam != other.beaverDam) {
            return false;
        }
        if (this.cave != other.cave) {
            return false;
        }
        if (this.undergroundLayer != other.undergroundLayer) {
            return false;
        }
        return true;
    }       
}
