package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class GildedRoseTest {

    @Test
    void normalItemSpend1Day() {
        //given
        Item[] items = new Item[] { new Item("normal", 1, 1) };
        GildedRose app = new GildedRose(items);

        //when
        app.updateQuality();

        //then
        assertNotEquals(0, app.items.length);
        Item item = app.items[0];
        assertEquals("normal", item.name);
        assertEquals(0, item.quality);
        assertEquals(0, item.sellIn);
    }

    @Test
    void normalItemAfterSellIn() {
        //given
        Item[] items = new Item[] { new Item("normal", 0, 2) };
        GildedRose app = new GildedRose(items);

        //when
        app.updateQuality();

        //then
        assertNotEquals(0, app.items.length);
        Item item = app.items[0];
        assertEquals("normal", item.name);
        assertEquals(0, item.quality);
        assertEquals(-1, item.sellIn);
    }

    @Test
    void sulfurasSpend1Day() {
        //given
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 10, 80) };
        GildedRose app = new GildedRose(items);

        //when
        app.updateQuality();

        //then
        assertNotEquals(0, app.items.length);
        Item item = app.items[0];
        assertEquals("Sulfuras, Hand of Ragnaros", item.name);
        assertEquals(80, item.quality);
        assertEquals(10, item.sellIn);
    }

    @Test
    void brieSpend1Day() {
        //given
        Item[] items = new Item[] { new Item("Aged Brie", 1, 20) };
        GildedRose app = new GildedRose(items);

        //when
        app.updateQuality();

        //then
        assertNotEquals(0, app.items.length);
        Item item = app.items[0];
        assertEquals("Aged Brie", item.name);
        assertEquals(21, item.quality);
        assertEquals(0, item.sellIn);
    }

    @Test
    void brieSpendAfterSellIn() {
        //given
        Item[] items = new Item[] { new Item("Aged Brie", 0, 20) };
        GildedRose app = new GildedRose(items);

        //when
        app.updateQuality();

        //then
        assertNotEquals(0, app.items.length);
        Item item = app.items[0];
        assertEquals("Aged Brie", item.name);
        assertEquals(22, item.quality);
        assertEquals(-1, item.sellIn);
    }

}
