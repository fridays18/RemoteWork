
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fridaysnarutomod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class FridaysNarutoModModTabs {
	public static CreativeModeTab TAB_FRIDAYSNARUTOMOD;

	public static void load() {
		TAB_FRIDAYSNARUTOMOD = new CreativeModeTab("tabfridaysnarutomod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FridaysNarutoModModItems.SHARINGAN.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
