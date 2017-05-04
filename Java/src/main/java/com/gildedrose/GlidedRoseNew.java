package com.gildedrose;

import java.util.ArrayList;

/**
 *
 * @author Artrit
 */
public class GlidedRoseNew {
    ArrayList listeItem = new ArrayList();
    
    public GlidedRoseNew(ArrayList liste) {
        this.listeItem = liste;
    }
    
    public void updateQuality(Item item) {
        if(item.isIsIncrease()){increaseQuality(item);}
        else{decreaseQuality(item);}
        updateSellIn(item);
    }
    
    private void updateSellIn(Item item){
        if(item.getSellIn() <= 0){return;}
        else{item.setSellIn(item.getSellIn()-1);}
    }
    
    private void increaseQuality(Item item){
        if(item.getSellIn() <= 0){item.setQuality(0);}
        else if(item.getSellIn() <= 5){item.setQuality(item.getQuality() + 3);}
        else if(item.getSellIn() <= 10){item.setQuality(item.getQuality() + 2);}
        else{return;}
    }
    private void decreaseQuality(Item item){
        if(item.getSellIn() == -1){return;}
        else if(item.getSellIn() <= 0){item.setQuality(item.getQuality() - 2);}
        else{item.setQuality(item.getQuality() - 1);}
    }
    
}
