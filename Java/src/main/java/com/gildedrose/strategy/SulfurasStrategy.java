package com.gildedrose.strategy;

import com.gildedrose.item.Item;

public class SulfurasStrategy implements ItemStrategy {

    @Override
    public int updateQuality(int quality, int sellIn) {
        return quality;
    }
}
