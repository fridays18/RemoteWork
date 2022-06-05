
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fridaysnarutomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.fridaysnarutomod.entity.WooddragonEntity;
import net.mcreator.fridaysnarutomod.entity.WindbladeEntity;
import net.mcreator.fridaysnarutomod.entity.WaterbulletEntity;
import net.mcreator.fridaysnarutomod.entity.VanishingrasenganEntity;
import net.mcreator.fridaysnarutomod.entity.TruthseekingorbsEntity;
import net.mcreator.fridaysnarutomod.entity.ToadoilEntity;
import net.mcreator.fridaysnarutomod.entity.ShinobiEntity;
import net.mcreator.fridaysnarutomod.entity.SharshootEntity;
import net.mcreator.fridaysnarutomod.entity.RinneshootEntity;
import net.mcreator.fridaysnarutomod.entity.PhoenixflowerEntity;
import net.mcreator.fridaysnarutomod.entity.KunaiEntity;
import net.mcreator.fridaysnarutomod.entity.HiramekareishootEntity;
import net.mcreator.fridaysnarutomod.entity.GourdEntity;
import net.mcreator.fridaysnarutomod.entity.ExplosivebirdsEntity;
import net.mcreator.fridaysnarutomod.entity.EvilAnbuEntity;
import net.mcreator.fridaysnarutomod.entity.EarthgrudgeEntity;
import net.mcreator.fridaysnarutomod.entity.CrystaldragonEntity;
import net.mcreator.fridaysnarutomod.entity.BuujuBulletEntity;
import net.mcreator.fridaysnarutomod.entity.BugshotEntity;
import net.mcreator.fridaysnarutomod.entity.AshkillingashbonesEntity;
import net.mcreator.fridaysnarutomod.entity.AmaterasuEntity;
import net.mcreator.fridaysnarutomod.FridaysNarutoModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FridaysNarutoModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, FridaysNarutoModMod.MODID);
	public static final RegistryObject<EntityType<WaterbulletEntity>> WATERBULLET = register("projectile_waterbullet",
			EntityType.Builder.<WaterbulletEntity>of(WaterbulletEntity::new, MobCategory.MISC).setCustomClientFactory(WaterbulletEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PhoenixflowerEntity>> PHOENIXFLOWER = register("projectile_phoenixflower",
			EntityType.Builder.<PhoenixflowerEntity>of(PhoenixflowerEntity::new, MobCategory.MISC).setCustomClientFactory(PhoenixflowerEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EarthgrudgeEntity>> EARTHGRUDGE = register("projectile_earthgrudge",
			EntityType.Builder.<EarthgrudgeEntity>of(EarthgrudgeEntity::new, MobCategory.MISC).setCustomClientFactory(EarthgrudgeEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WindbladeEntity>> WINDBLADE = register("projectile_windblade",
			EntityType.Builder.<WindbladeEntity>of(WindbladeEntity::new, MobCategory.MISC).setCustomClientFactory(WindbladeEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RinneshootEntity>> RINNESHOOT = register("projectile_rinneshoot",
			EntityType.Builder.<RinneshootEntity>of(RinneshootEntity::new, MobCategory.MISC).setCustomClientFactory(RinneshootEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SharshootEntity>> SHARSHOOT = register("projectile_sharshoot",
			EntityType.Builder.<SharshootEntity>of(SharshootEntity::new, MobCategory.MISC).setCustomClientFactory(SharshootEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CrystaldragonEntity>> CRYSTALDRAGON = register("projectile_crystaldragon",
			EntityType.Builder.<CrystaldragonEntity>of(CrystaldragonEntity::new, MobCategory.MISC).setCustomClientFactory(CrystaldragonEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WooddragonEntity>> WOODDRAGON = register("projectile_wooddragon",
			EntityType.Builder.<WooddragonEntity>of(WooddragonEntity::new, MobCategory.MISC).setCustomClientFactory(WooddragonEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GourdEntity>> GOURD = register("projectile_gourd",
			EntityType.Builder.<GourdEntity>of(GourdEntity::new, MobCategory.MISC).setCustomClientFactory(GourdEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<VanishingrasenganEntity>> VANISHINGRASENGAN = register("projectile_vanishingrasengan",
			EntityType.Builder.<VanishingrasenganEntity>of(VanishingrasenganEntity::new, MobCategory.MISC)
					.setCustomClientFactory(VanishingrasenganEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AmaterasuEntity>> AMATERASU = register("projectile_amaterasu",
			EntityType.Builder.<AmaterasuEntity>of(AmaterasuEntity::new, MobCategory.MISC).setCustomClientFactory(AmaterasuEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AshkillingashbonesEntity>> ASHKILLINGASHBONES = register("projectile_ashkillingashbones",
			EntityType.Builder.<AshkillingashbonesEntity>of(AshkillingashbonesEntity::new, MobCategory.MISC)
					.setCustomClientFactory(AshkillingashbonesEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BuujuBulletEntity>> BUUJU_BULLET = register("projectile_buuju_bullet",
			EntityType.Builder.<BuujuBulletEntity>of(BuujuBulletEntity::new, MobCategory.MISC).setCustomClientFactory(BuujuBulletEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TruthseekingorbsEntity>> TRUTHSEEKINGORBS = register("projectile_truthseekingorbs",
			EntityType.Builder.<TruthseekingorbsEntity>of(TruthseekingorbsEntity::new, MobCategory.MISC)
					.setCustomClientFactory(TruthseekingorbsEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ToadoilEntity>> TOADOIL = register("projectile_toadoil",
			EntityType.Builder.<ToadoilEntity>of(ToadoilEntity::new, MobCategory.MISC).setCustomClientFactory(ToadoilEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ShinobiEntity>> SHINOBI = register("shinobi",
			EntityType.Builder.<ShinobiEntity>of(ShinobiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ShinobiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EvilAnbuEntity>> EVIL_ANBU = register("evil_anbu",
			EntityType.Builder.<EvilAnbuEntity>of(EvilAnbuEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(EvilAnbuEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HiramekareishootEntity>> HIRAMEKAREISHOOT = register("projectile_hiramekareishoot",
			EntityType.Builder.<HiramekareishootEntity>of(HiramekareishootEntity::new, MobCategory.MISC)
					.setCustomClientFactory(HiramekareishootEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KunaiEntity>> KUNAI = register("projectile_kunai",
			EntityType.Builder.<KunaiEntity>of(KunaiEntity::new, MobCategory.MISC).setCustomClientFactory(KunaiEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ExplosivebirdsEntity>> EXPLOSIVEBIRDS = register("projectile_explosivebirds",
			EntityType.Builder.<ExplosivebirdsEntity>of(ExplosivebirdsEntity::new, MobCategory.MISC).setCustomClientFactory(ExplosivebirdsEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BugshotEntity>> BUGSHOT = register("projectile_bugshot",
			EntityType.Builder.<BugshotEntity>of(BugshotEntity::new, MobCategory.MISC).setCustomClientFactory(BugshotEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ShinobiEntity.init();
			EvilAnbuEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SHINOBI.get(), ShinobiEntity.createAttributes().build());
		event.put(EVIL_ANBU.get(), EvilAnbuEntity.createAttributes().build());
	}
}
