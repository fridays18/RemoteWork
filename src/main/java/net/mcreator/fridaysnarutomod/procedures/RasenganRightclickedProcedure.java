package net.mcreator.fridaysnarutomod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.fridaysnarutomod.entity.VanishingrasenganEntity;

public class RasenganRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
			VanishingrasenganEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 1, 0, 0);
		}
	}
}
