package com.github.platinum234.exhibitadditions.entity;

import com.github.platinum234.exhibitadditions.ExhibitAdditions;
import com.github.platinum234.exhibitadditions.client.render.entity.*;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.fml.RegistryObject;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.config.ZawaSpawnCategory;
import org.zawamod.zawa.world.entity.ZawaEntityRegistry;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;

public class ExhibitAdditionsEntities {
    public static final ZawaEntityRegistry REGISTRY = new ZawaEntityRegistry(ExhibitAdditions.MOD_ID, Zawa.ENTITIES_GROUP);

    public static final RegistryObject<EntityType<SwampMonkeyEntity>> SWAMP_MONKEY =
            REGISTRY.builder(SwampMonkeyEntity::new, EntityClassification.CREATURE)
                    .attributes(SwampMonkeyEntity::registerAttributes)
                    .renderer(() -> SwampMonkeyRenderer::new)
                    .spawns(10, 3, 4, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build("swamp_monkey");
    public static final RegistryObject<EntityType<GerenukEntity>> GERENUK =
            REGISTRY.builder(GerenukEntity::new, EntityClassification.CREATURE)
                    .attributes(GerenukEntity::registerAttributes)
                    .renderer(() -> GerenukRenderer::new)
                    .spawns(8, 2, 3, ZawaSpawnCategory.WET_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(1.1F, 1.5F).clientTrackingRange(10))
                    .build("gerenuk");
    public static final RegistryObject<EntityType<PeccaryEntity>> PECCARY =
            REGISTRY.builder(PeccaryEntity::new, EntityClassification.CREATURE)
                    .attributes(PeccaryEntity::registerAttributes)
                    .renderer(() -> PeccaryRenderer::new)
                    .spawns(10, 2, 4, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.9F, 0.9F).clientTrackingRange(10))
                    .build("peccary");
    public static final RegistryObject<EntityType<PottoEntity>> POTTO =
            REGISTRY.builder(PottoEntity::new, EntityClassification.CREATURE)
                    .attributes(PottoEntity::registerAttributes)
                    .renderer(() -> PottoRenderer::new)
                    .spawns(2, 1, 1, ZawaSpawnCategory.DEEP_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.4F, 0.4F).clientTrackingRange(10))
                    .build("potto");
    public static final RegistryObject<EntityType<HyraxEntity>> HYRAX =
            REGISTRY.builder(HyraxEntity::new, EntityClassification.CREATURE)
                    .attributes(HyraxEntity::registerAttributes)
                    .renderer(() -> HyraxRenderer::new)
                    .spawns(15, 1, 2, ZawaSpawnCategory.DRY_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(0.35F, 0.35F).clientTrackingRange(10))
                    .build("hyrax");
    public static final RegistryObject<EntityType<LangurEntity>> LANGUR =
            REGISTRY.builder(LangurEntity::new, EntityClassification.CREATURE)
                    .attributes(LangurEntity::registerAttributes)
                    .renderer(() -> LangurRenderer::new)
                    .spawns(10, 3, 4, ZawaSpawnCategory.WET_RAINFOREST, ZawaSpawnCategory.DRY_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.65F, 0.5F).clientTrackingRange(10))
                    .build("langur");
    public static final RegistryObject<EntityType<PronghornEntity>> PRONGHORN =
            REGISTRY.builder(PronghornEntity::new, EntityClassification.CREATURE)
                    .attributes(PronghornEntity::registerAttributes)
                    .renderer(() -> PronghornRenderer::new)
                    .spawns(15, 3, 4, ZawaSpawnCategory.DRY_GRASSLAND)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.4F).clientTrackingRange(10))
                    .build("pronghorn");
    public static final RegistryObject<EntityType<WildebeestEntity>> WILDEBEEST =
            REGISTRY.builder(WildebeestEntity::new, EntityClassification.CREATURE)
                    .attributes(WildebeestEntity::registerAttributes)
                    .renderer(() -> WildebeestRenderer::new)
                    .spawns(10, 4, 5, ZawaSpawnCategory.DRY_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(1.8F, 2.0F).clientTrackingRange(10))
                    .build("wildebeest");
    public static final RegistryObject<EntityType<WallabyEntity>> WALLABY =
            REGISTRY.builder(WallabyEntity::new, EntityClassification.CREATURE)
                    .attributes(WallabyEntity::registerAttributes)
                    .renderer(() -> WallabyRenderer::new)
                    .spawns(8, 2, 3, ZawaSpawnCategory.WET_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(1.1F, 1.5F).clientTrackingRange(10))
                    .build("wallaby");
    public static final RegistryObject<EntityType<KlipspringerEntity>> KLIPSPRINGER =
            REGISTRY.builder(KlipspringerEntity::new, EntityClassification.CREATURE)
                    .attributes(KlipspringerEntity::registerAttributes)
                    .renderer(() -> KlipspringerRenderer::new)
                    .spawns(8, 2, 3, ZawaSpawnCategory.WET_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(1.1F, 1.5F).clientTrackingRange(10))
                    .build("klipspringer");

    public static void registerSpawnPlacements() {
        EntitySpawnPlacementRegistry.register(POTTO.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(PECCARY.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(GERENUK.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(SWAMP_MONKEY.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(HYRAX.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(LANGUR.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(PRONGHORN.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(WILDEBEEST.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(WALLABY.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(KLIPSPRINGER.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);

    }
}

