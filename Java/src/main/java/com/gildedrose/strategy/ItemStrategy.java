package com.gildedrose.strategy;

import com.gildedrose.item.Item;

public interface ItemStrategy {

    default int updateSellIn(int sellIn){
        return sellIn - 1;
    }

    int updateQuality(int quality, int sellIn);
}
