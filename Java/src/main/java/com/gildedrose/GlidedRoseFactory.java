package com.gildedrose;

import com.gildedrose.item.*;
import com.gildedrose.strategy.*;

public class GlidedRoseFactory {

    public static Item create(String name, int sellIn, int quality){
        if (name.contains("Conjured")){
            return new Conjured(name, sellIn, quality);
        }else if (name.contains("Brie")){
            return new Brie(name, sellIn, quality);
        }else if(name.contains("Backstage passes")){
            return new BackPass(name, sellIn, quality);
        }else if (name.contains("Sulfuras")){
            return new Sulfuras(name, sellIn, quality);
        }else{

            return new NormalItem(name, sellIn, quality);
        }
    }
}
