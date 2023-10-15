package com.gildedrose;

import com.gildedrose.item.Item;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[] {
            GlidedRoseFactory.create("+5 Dexterity Vest", 10, 20), //
            GlidedRoseFactory.create("Aged Brie", 2, 0), //
            GlidedRoseFactory.create("Elixir of the Mongoose", 5, 7), //
            GlidedRoseFactory.create("Sulfuras, Hand of Ragnaros", 0, 80), //
            GlidedRoseFactory.create("Sulfuras, Hand of Ragnaros", -1, 80),
            GlidedRoseFactory.create("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            GlidedRoseFactory.create("Backstage passes to a TAFKAL80ETC concert", 10, 40),
            GlidedRoseFactory.create("Backstage passes to a TAFKAL80ETC concert", 5, 40),
                // this conjured item does not work properly yet
            GlidedRoseFactory.create("Conjured Mana Cake", 3, 6) };

        GildedRose app = new GildedRose(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.update();
        }
    }

}
