package com.gildedrose.strategy;

import com.gildedrose.item.Item;
import com.gildedrose.item.NormalItem;

public class BrieItemStrategy implements ItemStrategy {
    private final int defaultPickupRate = 1;
    @Override
    public void updateQuality(Item item) {
        if (item.quality < 50){
            item.quality += defaultPickupRate;
        }
    }
}
