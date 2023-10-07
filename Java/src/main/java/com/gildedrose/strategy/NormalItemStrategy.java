package com.gildedrose.strategy;

import com.gildedrose.item.Item;
import com.gildedrose.item.NormalItem;

public class NormalItemStrategy implements ItemStrategy{
    private final int defaultDropRate = 1;
    @Override
    public void updateQuality(Item item) {
        if (item.sellIn < 0){
            item.quality -= (defaultDropRate * 2);
            return;
        }
        item.quality-= defaultDropRate;
    }
}
