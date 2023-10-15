package com.gildedrose.item;

import com.gildedrose.strategy.BackPassStrategy;
import com.gildedrose.strategy.ItemStrategy;

public class BackPass extends Item{
    private final ItemStrategy BackPassItemStrategy = new BackPassStrategy();
    public BackPass(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update(){
        updateSellIn(sellIn);
        updateQuality(sellIn, quality);
    }
    private void updateQuality(int sellIn, int quality) {
        this.quality = BackPassItemStrategy.updateQuality(sellIn, quality);
    }

    private void updateSellIn(int sellIn) {
        this.sellIn = BackPassItemStrategy.updateSellIn(sellIn);
    }
}
