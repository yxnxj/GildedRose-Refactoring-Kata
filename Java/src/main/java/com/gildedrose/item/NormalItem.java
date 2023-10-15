package com.gildedrose.item;

import com.gildedrose.strategy.ItemStrategy;
import com.gildedrose.strategy.NormalItemStrategy;

public class NormalItem extends Item{
    private final ItemStrategy normalItemStrategy = new NormalItemStrategy();
    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update(){
        updateSellIn();
        updateQuality();
    }
    private void updateQuality() {
        this.quality = normalItemStrategy.updateQuality(this.sellIn, this.quality);
    }

    private void updateSellIn() {
        this.sellIn = normalItemStrategy.updateSellIn(this.sellIn);
    }
}
