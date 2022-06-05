package net.mcreator.fridaysnarutomod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.fridaysnarutomod.init.FridaysNarutoModModItems;

public class ShinobiRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(FridaysNarutoModModItems.CHAKRA.get()))
				: false) {
			if (sourceentity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(FridaysNarutoModModItems.CHAKRA.get());
				_setstack.setCount(-1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FridaysNarutoModModItems.SCROLL.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
