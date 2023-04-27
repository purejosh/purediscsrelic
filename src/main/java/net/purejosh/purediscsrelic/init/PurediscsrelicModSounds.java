
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.purediscsrelic.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class PurediscsrelicModSounds {
	public static SoundEvent RELIC = new SoundEvent(new ResourceLocation("purediscsrelic", "relic"));

	public static void load() {
		Registry.register(Registry.SOUND_EVENT, new ResourceLocation("purediscsrelic", "relic"), RELIC);
	}
}
