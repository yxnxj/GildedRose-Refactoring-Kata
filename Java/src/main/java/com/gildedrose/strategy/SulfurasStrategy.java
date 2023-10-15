package com.gildedrose.strategy;

public class SulfurasStrategy implements ItemStrategy {

    @Override
    public int updateSellIn(int sellIn){
        return sellIn;
    }
    @Override
    public int updateQuality(int sellIn, int quality) {
        return quality;
    }
}
