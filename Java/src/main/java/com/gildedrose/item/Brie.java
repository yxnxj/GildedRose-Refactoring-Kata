package com.gildedrose.item;

import com.gildedrose.strategy.BackPassStrategy;
import com.gildedrose.strategy.BrieCheeseStrategy;
import com.gildedrose.strategy.ItemStrategy;

public class Brie extends Item{
    private final ItemStrategy BrieItemStrategy = new BrieCheeseStrategy();
    public Brie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }


    @Override
    public void update(){
        updateSellIn(sellIn);
        updateQuality(sellIn, quality);
    }
    private void updateQuality(int sellIn, int quality) {
        this.quality = BrieItemStrategy.updateQuality(sellIn, quality);
    }

    private void updateSellIn(int sellIn) {
        this.sellIn = BrieItemStrategy.updateSellIn(sellIn);
    }
}
