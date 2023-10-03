package com.gildedrose.item;

import com.gildedrose.strategy.ItemStrategy;
import com.gildedrose.strategy.NormalItemStrategy;

public class NormalItem extends Item{
    private final ItemStrategy normalItemStrategy;
    public NormalItem(String name, int sellIn, int quality, NormalItemStrategy normalItemStrategy) {
        super(name, sellIn, quality);
        this.normalItemStrategy = normalItemStrategy;
    }
}
