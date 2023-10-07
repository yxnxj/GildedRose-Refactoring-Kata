package com.gildedrose.item;

import com.gildedrose.strategy.BackPassStrategy;
import com.gildedrose.strategy.ItemStrategy;

public class BackPass extends Item{
    private final ItemStrategy BackPassItemStrategy;
    public BackPass(String name, int sellIn, int quality, BackPassStrategy backPassItemStrategy) {
        super(name, sellIn, quality);
        BackPassItemStrategy = backPassItemStrategy;
    }
}
