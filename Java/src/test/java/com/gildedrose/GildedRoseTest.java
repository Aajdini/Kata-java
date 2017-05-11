package com.gildedrose;

import java.util.ArrayList;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;

import org.junit.Test;

public class GildedRoseTest {
    GlidedRoseNew app;
    ArrayList listeItem = new ArrayList();
    Item item;
    
    @Before
    public void setUp() {
        item  = new Item("foo", 0, 0,false,true);
        item  = new Item("Sulfuras", 0, 0,true,false);
        item  = new Item("fooIncrease", 0, 0,false,true);
        item  = new Item("Elixir", 0, 0,false,false);
        listeItem.add(item);
        app = new GlidedRoseNew(listeItem);
    }//setUp()
    @Test
    public void testFoo() {
        Item itemFoo = (Item)listeItem.get(0);
        app.updateQuality(itemFoo);
        assertEquals("foo", itemFoo.getName());
    }
    @Test
    public void testSulfurasIsLengendary() {
        Item itemSulfuras = (Item)listeItem.get(1);
        app.updateQuality(itemSulfuras);
        Assert.assertTrue("Devrait être TRUE", itemSulfuras.isIsLegendary());
    }
    @Test
    public void testfooIncrease() {
        Item itemFooIncrease = (Item)listeItem.get(2);
        app.updateQuality(itemFooIncrease);
        Assert.assertTrue("Devrait être TRUE", itemFooIncrease.isIsIncrease());
    }

}
