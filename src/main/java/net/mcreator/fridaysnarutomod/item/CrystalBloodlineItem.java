
package net.mcreator.fridaysnarutomod.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.fridaysnarutomod.procedures.CrystalBloodlineRightclickedProcedure;
import net.mcreator.fridaysnarutomod.procedures.CrystalBloodlineItemIsDroppedByPlayerProcedure;
import net.mcreator.fridaysnarutomod.init.FridaysNarutoModModTabs;

import java.util.List;

public class CrystalBloodlineItem extends Item {
	public CrystalBloodlineItem() {
		super(new Item.Properties().tab(FridaysNarutoModModTabs.TAB_FRIDAYSNARUTOMOD).stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Right click to shoot crystal dragon"));
		list.add(new TextComponent("drop to get crystal blade"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		CrystalBloodlineRightclickedProcedure.execute(entity);
		return ar;
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		CrystalBloodlineItemIsDroppedByPlayerProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
		return true;
	}
}
