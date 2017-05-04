package com.gildedrose;

public class Item {

    private String name;
    private int sellIn;
    private int quality;
    private boolean isLegendary;
    private boolean isIncrease;
    
    public Item(String name, int sellIn, int quality, boolean isLegendary, boolean isIncrease) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.isLegendary = isLegendary;
        this.isIncrease = isIncrease;
    }

    public void setIsIncrease(boolean isIncrease) {
        this.isIncrease = isIncrease;
    }

    public boolean isIsIncrease() {
        return isIncrease;
    }

    public boolean isIsLegendary() {
        return isLegendary;
    }

    public void setIsLegendary(boolean isLegendary) {
        this.isLegendary = isLegendary;
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
        Item item = (Item)obj;
        return this.name.equals(item.getName());
    }//equals
   
   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
