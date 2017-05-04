package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }
    public int getSellIn() {
        return sellIn;
    }
    public int getQuality() {
        return quality;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }
    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    public int compareTo(String anotherString) {
        return name.compareTo(anotherString);
    }
   
   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
