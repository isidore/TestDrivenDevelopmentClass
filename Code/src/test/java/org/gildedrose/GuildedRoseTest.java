package org.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.approvaltests.legacycode.Range;
import org.approvaltests.reporters.ClipboardReporter;
import org.approvaltests.reporters.UseReporter;
import org.junit.Test;

@UseReporter(ClipboardReporter.class)
public class GuildedRoseTest {

	@Test
	public void test() throws Exception {
		String names[] = { "name", "Aged Brie", "Backstage passes to a TAFKAL80ETC concert",
				"Sulfuras, Hand of Ragnaros" };
		Integer qualites[] = Range.get(-5, 100);
		Integer sellIns[] = Range.get(-5, 100);
		CombinationApprovals.verifyAllCombinations(this::doStuff, names, qualites, sellIns);
	}

	public GildedRose doStuff(String name, Integer quality, Integer sellIn) {
		Item item = new Item(name, sellIn, quality);
		Item[] items = { item };
		GildedRose rose = new GildedRose(items);
		rose.updateQuality();
		return rose;
	}

}
