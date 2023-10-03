package com.gildedrose.strategy;

import com.gildedrose.item.Item;
import com.gildedrose.item.NormalItem;

public class NormalItemStrategy implements ItemStrategy{

    @Override
    public void decreaseQuality(Item item) {
        if (item.sellIn < 0){
            item.quality -= 2;
            return;
        }
        item.quality-= 1;
    }
}
