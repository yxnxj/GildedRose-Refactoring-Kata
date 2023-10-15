package com.gildedrose.item;

import com.gildedrose.strategy.ItemStrategy;
import com.gildedrose.strategy.SulfurasStrategy;

public class Sulfuras extends Item{
    private final ItemStrategy sulfurasItemStrategy = new SulfurasStrategy();

    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    @Override
    public void update(){
    }
}
