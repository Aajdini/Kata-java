package com.gildedrose;

import java.util.ArrayList;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;

import org.junit.Test;

public class GildedRoseTest {
    GlidedRoseNew app;
    ArrayList listeItem = new ArrayList();
    @Before
    public void setUp() {
        Item item0  = new Item("foo", 0, 0,false,true);
        Item item1  = new Item("Sulfuras", 0, 0,true,false);
        Item item2  = new Item("fooIncrease", 0, 0,false,true);
        Item item3  = new Item("Elixir", 0, 0,false,false);
        listeItem.add(item0);
        listeItem.add(item1);
        listeItem.add(item2);
        listeItem.add(item3);
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
