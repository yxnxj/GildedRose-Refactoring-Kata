package com.gildedrose.strategy;

import com.gildedrose.item.Item;
import com.gildedrose.item.NormalItem;

public class NormalItemStrategy implements ItemStrategy{
    private final int defaultDropRate = 1;
    @Override
    public int updateQuality(int quality, int sellIn) {
        if (sellIn < 0){
            quality -= (defaultDropRate*2);
        }else{
            quality -= defaultDropRate;
        }
        return quality;
    }
}
