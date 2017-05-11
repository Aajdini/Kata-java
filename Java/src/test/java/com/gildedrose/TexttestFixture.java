package com.gildedrose;

import java.util.ArrayList;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");
        ArrayList listOfItem = new ArrayList();
        listOfItem.add(new Item("+5 Dexterity Vest", 10, 20,false,false));
        listOfItem.add(new Item("Aged Brie", 2, 0,false,true));
        listOfItem.add(new Item("Elixir of the Mongoose", 5, 7,false,false));
        listOfItem.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80,true,false));
        listOfItem.add(new Item("Sulfuras, Hand of Ragnaros", -1, 80,true,false));
        listOfItem.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20,false,true));
        listOfItem.add(new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49,false,true));
        listOfItem.add(new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49,false,true));
        // this conjured item does not work properly yet
        listOfItem.add(new Item("Conjured Mana Cake", 3, 6,false,false));


        GlidedRoseNew app = new GlidedRoseNew(listOfItem);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for(int k = 0 ; k<listOfItem.size();k++){
                System.out.println((Item)listOfItem.get(k));
                System.out.println();
                app.updateQuality((Item)listOfItem.get(k));
            }

        }
    }

}
