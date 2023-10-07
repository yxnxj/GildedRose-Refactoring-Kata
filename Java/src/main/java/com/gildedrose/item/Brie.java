package com.gildedrose.item;

import com.gildedrose.strategy.BrieItemStrategy;
import com.gildedrose.strategy.ItemStrategy;

public class Brie extends Item{
    private final ItemStrategy BrieItemStrategy;
    public Brie(String name, int sellIn, int quality, BrieItemStrategy brieItemStrategy) {
        super(name, sellIn, quality);
        BrieItemStrategy = brieItemStrategy;
    }
}
