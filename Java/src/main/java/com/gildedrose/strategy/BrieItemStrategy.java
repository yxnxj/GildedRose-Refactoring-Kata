package com.gildedrose.strategy;

import com.gildedrose.item.Item;
import com.gildedrose.item.NormalItem;

public class BrieItemStrategy implements ItemStrategy {

    @Override
    public void decreaseQuality(Item item) {
        if (item.quality < 50){
            item.quality += 1;
        }
    }
}
