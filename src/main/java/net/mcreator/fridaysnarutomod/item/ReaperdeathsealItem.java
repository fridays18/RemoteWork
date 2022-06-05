
package net.mcreator.fridaysnarutomod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.fridaysnarutomod.procedures.ReaperdeathsealLivingEntityIsHitWithItemProcedure;
import net.mcreator.fridaysnarutomod.init.FridaysNarutoModModTabs;

public class ReaperdeathsealItem extends Item {
	public ReaperdeathsealItem() {
		super(new Item.Properties().tab(FridaysNarutoModModTabs.TAB_FRIDAYSNARUTOMOD).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		ReaperdeathsealLivingEntityIsHitWithItemProcedure.execute(entity);
		return retval;
	}
}
