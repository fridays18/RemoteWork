
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fridaysnarutomod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.fridaysnarutomod.client.renderer.ShinobiRenderer;
import net.mcreator.fridaysnarutomod.client.renderer.EvilAnbuRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FridaysNarutoModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(FridaysNarutoModModEntities.WATERBULLET.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FridaysNarutoModModEntities.PHOENIXFLOWER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FridaysNarutoModModEntities.EARTHGRUDGE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FridaysNarutoModModEntities.WINDBLADE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FridaysNarutoModModEntities.RINNESHOOT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FridaysNarutoModModEntities.SHARSHOOT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FridaysNarutoModModEntities.CRYSTALDRAGON.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FridaysNarutoModModEntities.WOODDRAGON.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FridaysNarutoModModEntities.GOURD.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FridaysNarutoModModEntities.VANISHINGRASENGAN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FridaysNarutoModModEntities.AMATERASU.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FridaysNarutoModModEntities.ASHKILLINGASHBONES.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FridaysNarutoModModEntities.BUUJU_BULLET.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FridaysNarutoModModEntities.TRUTHSEEKINGORBS.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FridaysNarutoModModEntities.TOADOIL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FridaysNarutoModModEntities.SHINOBI.get(), ShinobiRenderer::new);
		event.registerEntityRenderer(FridaysNarutoModModEntities.EVIL_ANBU.get(), EvilAnbuRenderer::new);
		event.registerEntityRenderer(FridaysNarutoModModEntities.HIRAMEKAREISHOOT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FridaysNarutoModModEntities.KUNAI.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FridaysNarutoModModEntities.EXPLOSIVEBIRDS.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FridaysNarutoModModEntities.BUGSHOT.get(), ThrownItemRenderer::new);
	}
}
