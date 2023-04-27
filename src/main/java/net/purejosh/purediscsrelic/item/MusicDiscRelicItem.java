
package net.purejosh.purediscsrelic.item;

import net.purejosh.purediscsrelic.init.PurediscsrelicModSounds;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class MusicDiscRelicItem extends RecordItem {
	public MusicDiscRelicItem() {
		super(14, PurediscsrelicModSounds.RELIC, new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE), 4380);
	}
}
