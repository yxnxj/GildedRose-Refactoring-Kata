package com.gildedrose.strategy;

public class BackPassStrategy implements ItemStrategy{
    private final int defaultPickupRate = 1;
    @Override
    public int updateQuality(int sellIn, int quality) {
        if (sellIn <= 0){
            return 0;
        }

        if(sellIn <= 5){
            quality += (defaultPickupRate * 3);
        }
        else if (sellIn <= 10){
            quality += (defaultPickupRate * 2);
        }else{
            quality += defaultPickupRate;
        }

        return quality;
    }
}
