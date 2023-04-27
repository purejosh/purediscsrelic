package net.purejosh.purediscsrelic.procedures;

import net.purejosh.purediscsrelic.init.PurediscsrelicModItems;
import net.purejosh.purediscsrelic.PurediscsrelicMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Husk;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;

import java.util.Map;
import java.util.HashMap;

public class HuskLootDropRelicProcedure {
	public HuskLootDropRelicProcedure() {
		ServerLivingEntityEvents.ALLOW_DEATH.register((entity, damageSource, amount) -> {
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("entity", entity);
			dependencies.put("x", entity.getX());
			dependencies.put("y", entity.getY());
			dependencies.put("z", entity.getZ());
			dependencies.put("world", entity.level);
			dependencies.put("sourceentity", damageSource.getEntity());
			execute(dependencies);
			return true;
		});
	}

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PurediscsrelicMod.LOGGER.warn("Failed to load dependency world for procedure HuskLootDropRelic!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				PurediscsrelicMod.LOGGER.warn("Failed to load dependency x for procedure HuskLootDropRelic!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				PurediscsrelicMod.LOGGER.warn("Failed to load dependency y for procedure HuskLootDropRelic!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				PurediscsrelicMod.LOGGER.warn("Failed to load dependency z for procedure HuskLootDropRelic!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PurediscsrelicMod.LOGGER.warn("Failed to load dependency entity for procedure HuskLootDropRelic!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				PurediscsrelicMod.LOGGER.warn("Failed to load dependency sourceentity for procedure HuskLootDropRelic!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (entity instanceof Husk && sourceentity instanceof Player) {
			if (Mth.nextDouble(RandomSource.create(), 0, 100) < 5) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(PurediscsrelicModItems.MUSIC_DISC_RELIC));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
