package com.gildedrose.strategy;

public class ConjuredStrategy implements ItemStrategy{
    private final int defaultDropRate = 2;
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
