
package net.mcreator.fridaysnarutomod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.fridaysnarutomod.procedures.RasenganRightclickedProcedure;
import net.mcreator.fridaysnarutomod.procedures.RasenganLivingEntityIsHitWithItemProcedure;
import net.mcreator.fridaysnarutomod.procedures.RasenganEntitySwingsItemProcedure;
import net.mcreator.fridaysnarutomod.init.FridaysNarutoModModTabs;

import java.util.List;

public class RasenganItem extends Item {
	public RasenganItem() {
		super(new Item.Properties().tab(FridaysNarutoModModTabs.TAB_FRIDAYSNARUTOMOD).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Right click to throw vanishing rasengan"));
		list.add(new TextComponent("swing to get speed"));
		list.add(new TextComponent("and hit to do damage"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		RasenganRightclickedProcedure.execute(entity);
		return ar;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		RasenganLivingEntityIsHitWithItemProcedure.execute(entity);
		return retval;
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		RasenganEntitySwingsItemProcedure.execute(entity);
		return retval;
	}
}
