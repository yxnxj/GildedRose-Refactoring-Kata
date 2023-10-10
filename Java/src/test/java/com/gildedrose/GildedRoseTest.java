package com.gildedrose;

import com.gildedrose.item.Item;
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
        app.update();

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
        app.update();

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
        app.update();

        //then
        assertNotEquals(0, app.items.length);
        Item item = app.items[0];
        assertEquals("Sulfuras, Hand of Ragnaros", item.name);
        assertEquals(50, item.quality);
        assertEquals(10, item.sellIn);
    }

    @Test
    void brieSpend1Day() {
        //given
        Item[] items = new Item[] { new Item("Aged Brie", 1, 20) };
        GildedRose app = new GildedRose(items);

        //when
        app.update();

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
        app.update();

        //then
        assertNotEquals(0, app.items.length);
        Item item = app.items[0];
        assertEquals("Aged Brie", item.name);
        assertEquals(22, item.quality);
        assertEquals(-1, item.sellIn);
    }

    @Test
    void concert1Day() {
        //given
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20), new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20), new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20) };
        GildedRose app = new GildedRose(items);

        //when
        app.update();

        //then
        assertEquals(3, app.items.length);

        Item left15 = app.items[0];
        assertEquals("Backstage passes to a TAFKAL80ETC concert", left15.name);
        assertEquals(21, left15.quality);
        assertEquals(14, left15.sellIn);

        Item left10 = app.items[1];
        assertEquals("Backstage passes to a TAFKAL80ETC concert", left10.name);
        assertEquals(22, left10.quality);
        assertEquals(9, left10.sellIn);

        Item left5 = app.items[2];
        assertEquals("Backstage passes to a TAFKAL80ETC concert", left5.name);
        assertEquals(23, left5.quality);
        assertEquals(4, left5.sellIn);
    }


    @Test
    void concertAfterSellIn() {
        //given
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20)};
        GildedRose app = new GildedRose(items);

        //when
        app.update();

        //then
        assertNotEquals(0, app.items.length);
        Item item = app.items[0];
        assertEquals("Backstage passes to a TAFKAL80ETC concert", item.name);
        assertEquals(0, item.quality);
        assertEquals(-1, item.sellIn);

    }
}
