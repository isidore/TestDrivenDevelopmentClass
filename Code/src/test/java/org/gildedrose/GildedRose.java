package org.gildedrose;

import java.util.Arrays;

class GildedRose {
	@Override
	public String toString() {
		return "GildedRose [items=" + Arrays.toString(items) + "]";
	}

	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {
			Item item = items[i];
			stuffWithItem(item);
		}
	}

	public void stuffWithItem(Item item) {
		if (item.name.equals("Aged Brie")) {
			stuffWithAgedBrie(item);
		} else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
			doStuffWithBackstagePasses(item);
		} else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
			doStuffWithSulfuras();

		} else {

			doStuffWithEverythingElse(item);
		}
	}

	public void doStuffWithEverythingElse(Item item) {
		if (item.quality > 0) {
			item.quality = item.quality - 1;
		}

		item.sellIn = item.sellIn - 1;

		if (item.sellIn < 0) {
			if (item.quality > 0) {
				item.quality = item.quality - 1;
			}
		}
	}

	private void doStuffWithSulfuras() {
		// TODO Auto-generated method stub

	}

	public void doStuffWithBackstagePasses(Item item) {
		{
			if (item.quality < 50) {
				item.quality = item.quality + 1;

				if (item.sellIn < 11) {
					if (item.quality < 50) {
						item.quality = item.quality + 1;
					}
				}

				if (item.sellIn < 6) {
					if (item.quality < 50) {
						item.quality = item.quality + 1;
					}
				}

			}
		}

		item.sellIn = item.sellIn - 1;

		if (item.sellIn < 0) {
			{
				item.quality = item.quality - item.quality;
			}
		}
	}

	public void stuffWithAgedBrie(Item item) {
		if (item.quality < 50) {
			item.quality = item.quality + 1;

		}
		item.sellIn = item.sellIn - 1;
		if (item.sellIn < 0) {
			{
				if (item.quality < 50) {
					item.quality = item.quality + 1;
				}
			}
		}
	}
}