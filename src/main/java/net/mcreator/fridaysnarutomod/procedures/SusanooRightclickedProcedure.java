package net.mcreator.fridaysnarutomod.procedures;

import net.minecraft.world.entity.Entity;

public class SusanooRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(15);
	}
}
