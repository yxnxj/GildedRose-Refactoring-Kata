package com.gildedrose.item;

import com.gildedrose.strategy.ItemStrategy;
import com.gildedrose.strategy.SulfurasStrategy;

public class Sulfuras extends Item{
    private final ItemStrategy sulfurasItemStrategy;

    public Sulfuras(String name, int sellIn, int quality, SulfurasStrategy sulfurasItemStrategy) {
        super(name, sellIn, quality);
        this.sulfurasItemStrategy = sulfurasItemStrategy;
    }
}
