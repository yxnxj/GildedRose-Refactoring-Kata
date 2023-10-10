package com.gildedrose.item;

import com.gildedrose.strategy.BrieCheeseStrategy;
import com.gildedrose.strategy.ItemStrategy;

public class Brie extends Item{
    private final ItemStrategy BrieItemStrategy;
    public Brie(String name, int sellIn, int quality, BrieCheeseStrategy brieCheeseStrategy) {
        super(name, sellIn, quality);
        BrieItemStrategy = brieCheeseStrategy;
    }
}
