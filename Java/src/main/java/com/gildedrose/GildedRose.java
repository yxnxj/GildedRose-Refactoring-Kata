package com.gildedrose;

import com.gildedrose.item.Item;
import com.gildedrose.strategy.*;

class GildedRose {
    private final int QUALITY_LIMIT = 50;
    Item[] items;
    ItemStrategy itemStrategy;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality(){
        for (int i = 0; i < items.length; i++){
            Item item = items[i];
            this.itemStrategy = selectStrategy(item.name);
            item.sellIn = updateSellIn(item.sellIn);
            item.quality = updateQuality(this.itemStrategy, item.quality, item.sellIn);
        }
    }
    private ItemStrategy selectStrategy(String name){
        if (name.contains("Conjured")){
            return new ConjuredStrategy();
        }else if (name.contains("Brie")){
            return new BrieCheeseStrategy();
        }else if(name.contains("Backstage passes")){
            return new BackPassStrategy();
        }else if (name.contains("Sulfuras")){
            return new SulfurasStrategy();
        }else{
            return new NormalItemStrategy();
        }
    }
    private int updateQuality(ItemStrategy itemStrategy, int quality, int sellIn){
        return checkQualityLimit(itemStrategy.updateQuality(quality, sellIn));
    }

    private int updateSellIn(int sellIn){
        return itemStrategy.updateSellIn(sellIn);
    }

    private int checkQualityLimit(int quality){
        if (quality > QUALITY_LIMIT)
            quality = QUALITY_LIMIT;
        return  quality;
    }

//    public void updateQuality() {
//        for (int i = 0; i < items.length; i++) {
//            /**
//             * 품질 하락 구현
//             */
//            if (!items[i].name.equals("Aged Brie")
//                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                if (items[i].quality > 0) {
//                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//                        items[i].quality = items[i].quality - 1;
//                    }
//                }
//            } else {
//                if (items[i].quality < 50) {
//                    items[i].quality = items[i].quality + 1;
//
//                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                        if (items[i].sellIn < 11) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//
//                        if (items[i].sellIn < 6) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//                    }
//                }
//            }
//
//            /**
//             * 전설의 아이템은 품질이 떨어지지 않는다.
//             * sellin의 속성도 의미가 없다.
//             */
//            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//                items[i].sellIn = items[i].sellIn - 1;
//            }
//            /**
//             * 판매 기한이 지났을 때
//             * 한번 더 품질을 낮춘다
//             */
//            if (items[i].sellIn < 0) {
//                if (!items[i].name.equals("Aged Brie")) {
//                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                        if (items[i].quality > 0) {
//                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//                                items[i].quality = items[i].quality - 1;
//                            }
//                        }
//                    } else {
//                        items[i].quality = items[i].quality - items[i].quality;
//                    }
//                } else {
//                    if (items[i].quality < 50) {
//                        items[i].quality = items[i].quality + 1;
//                    }
//                }
//            }
//        }
//    }
}
