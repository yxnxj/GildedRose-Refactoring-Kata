package com.gildedrose.strategy;

public class NormalItemStrategy implements ItemStrategy{
    private final int defaultDropRate = 1;
    @Override
    public int updateQuality(int sellIn, int quality) {
        if (sellIn < 0){
            quality -= (defaultDropRate*2);
        }else{
            quality -= defaultDropRate;
        }
        return quality;
    }
}
