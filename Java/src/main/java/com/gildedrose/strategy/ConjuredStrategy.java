package com.gildedrose.strategy;

import com.gildedrose.item.Item;

public class ConjuredStrategy implements ItemStrategy{
    private final int defaultDropRate = 2;
    @Override
    public void updateQuality(Item item) {
        if (item.sellIn < 0){
            item.quality -= (defaultDropRate*2);
            return;
        }
        item.quality -= defaultDropRate;
    }
}
