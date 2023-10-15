package com.gildedrose.item;

import com.gildedrose.strategy.ConjuredStrategy;
import com.gildedrose.strategy.ItemStrategy;

public class Conjured extends Item{
    private final ItemStrategy conjuredItemStrategy = new ConjuredStrategy();
    public Conjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update(){
        updateSellIn(sellIn);
        updateQuality(sellIn, quality);
    }
    private void updateQuality(int sellIn, int quality) {
        this.quality = conjuredItemStrategy.updateQuality(sellIn, quality);
    }

    private void updateSellIn(int sellIn) {
        this.sellIn = conjuredItemStrategy.updateSellIn(sellIn);
    }
}
