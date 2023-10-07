package com.gildedrose.strategy;

import com.gildedrose.item.Item;

public class BackPassStrategy implements ItemStrategy{
    private final int defaultPickupRate = 1;
    @Override
    public void updateQuality(Item item) {
        if (item.sellIn <= 0){
            item.quality = 0;
            return;
        }

        if(item.sellIn <= 5){
            item.quality += (defaultPickupRate * 3);
        }
        else if (item.sellIn <= 10){
            item.quality += (defaultPickupRate * 2);
        }else{
            item.quality += defaultPickupRate;
        }

        if (item.quality > 50){
            item.quality = 50;
        }
    }
}
