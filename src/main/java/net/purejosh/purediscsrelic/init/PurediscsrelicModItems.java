
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.purediscsrelic.init;

import net.purejosh.purediscsrelic.item.MusicDiscRelicItem;
import net.purejosh.purediscsrelic.PurediscsrelicMod;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class PurediscsrelicModItems {
	public static Item MUSIC_DISC_RELIC;

	public static void load() {
		MUSIC_DISC_RELIC = Registry.register(Registry.ITEM, new ResourceLocation(PurediscsrelicMod.MODID, "music_disc_relic"), new MusicDiscRelicItem());
	}
}
