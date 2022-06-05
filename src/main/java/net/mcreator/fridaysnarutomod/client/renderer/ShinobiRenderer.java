
package net.mcreator.fridaysnarutomod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.fridaysnarutomod.entity.ShinobiEntity;

public class ShinobiRenderer extends HumanoidMobRenderer<ShinobiEntity, HumanoidModel<ShinobiEntity>> {
	public ShinobiRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(ShinobiEntity entity) {
		return new ResourceLocation("fridays_naruto_mod:textures/8075dc484e991f890aadcb2a5dfdcf47b90d3909.png");
	}
}
