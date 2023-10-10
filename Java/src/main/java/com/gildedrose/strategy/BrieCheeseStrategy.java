package com.gildedrose.strategy;

public class BrieCheeseStrategy implements ItemStrategy {
    private final int defaultPickupRate = 1;
    @Override
    public int updateQuality(int quality, int sellIn) {
        if (quality < 50){
            quality += defaultPickupRate;
        }
        return quality;
    }
}
