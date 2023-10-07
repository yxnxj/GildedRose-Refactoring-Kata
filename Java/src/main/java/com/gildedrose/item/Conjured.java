package com.gildedrose.item;

import com.gildedrose.strategy.ConjuredStrategy;
import com.gildedrose.strategy.ItemStrategy;

public class Conjured extends Item{
    private final ItemStrategy conjuredItemStrategy;
    public Conjured(String name, int sellIn, int quality, ConjuredStrategy conjuredItemStrategy) {
        super(name, sellIn, quality);
        this.conjuredItemStrategy = conjuredItemStrategy;
    }
}
