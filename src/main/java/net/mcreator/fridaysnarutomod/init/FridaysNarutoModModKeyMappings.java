
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fridaysnarutomod.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.fridaysnarutomod.network.TalknojutsuMessage;
import net.mcreator.fridaysnarutomod.FridaysNarutoModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class FridaysNarutoModModKeyMappings {
	public static final KeyMapping TALKNOJUTSU = new KeyMapping("key.fridays_naruto_mod.talknojutsu", GLFW.GLFW_KEY_V, "key.categories.misc");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(TALKNOJUTSU);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == TALKNOJUTSU.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						FridaysNarutoModMod.PACKET_HANDLER.sendToServer(new TalknojutsuMessage(0, 0));
						TalknojutsuMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
