package com.gildedrose.strategy;

import com.gildedrose.item.Item;

public interface ItemStrategy {

    default void decreaseSellIn(Item item){
        item.sellIn -= 1;
    }
    void updateQuality(Item item);
}
