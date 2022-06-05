
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fridaysnarutomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.fridaysnarutomod.block.ShinobiworldPortalBlock;
import net.mcreator.fridaysnarutomod.FridaysNarutoModMod;

public class FridaysNarutoModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FridaysNarutoModMod.MODID);
	public static final RegistryObject<Block> SHINOBIWORLD_PORTAL = REGISTRY.register("shinobiworld_portal", () -> new ShinobiworldPortalBlock());
}
