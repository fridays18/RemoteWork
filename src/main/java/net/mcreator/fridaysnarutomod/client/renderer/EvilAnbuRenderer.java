
package net.mcreator.fridaysnarutomod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.fridaysnarutomod.entity.EvilAnbuEntity;

public class EvilAnbuRenderer extends HumanoidMobRenderer<EvilAnbuEntity, HumanoidModel<EvilAnbuEntity>> {
	public EvilAnbuRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(EvilAnbuEntity entity) {
		return new ResourceLocation("fridays_naruto_mod:textures/2016_04_27_skin_2016042721025651985.png");
	}
}
