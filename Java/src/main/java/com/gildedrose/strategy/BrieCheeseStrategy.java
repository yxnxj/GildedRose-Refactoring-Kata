package com.gildedrose.strategy;

public class BrieCheeseStrategy implements ItemStrategy {
    private final int defaultPickupRate = 1;
    @Override
    public int updateQuality(int sellIn, int quality) {
        if (sellIn < 0){
            quality += defaultPickupRate*2;
        }else {
            quality += defaultPickupRate;
        }
        return quality;
    }
}
