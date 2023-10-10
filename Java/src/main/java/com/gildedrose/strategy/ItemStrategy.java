package com.gildedrose.strategy;

import com.gildedrose.item.Item;

public interface ItemStrategy {

    int updateQuality(int quality, int sellIn);
}
