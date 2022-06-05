
package net.mcreator.fridaysnarutomod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.fridaysnarutomod.init.FridaysNarutoModModTabs;

public class RamenItem extends Item {
	public RamenItem() {
		super(new Item.Properties().tab(FridaysNarutoModModTabs.TAB_FRIDAYSNARUTOMOD).stacksTo(64).rarity(Rarity.EPIC)
				.food((new FoodProperties.Builder()).nutrition(1000).saturationMod(2f)

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}
}
