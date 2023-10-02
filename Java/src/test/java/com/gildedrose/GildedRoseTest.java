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

}
