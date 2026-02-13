package com.github.platinum234.exhibitadditions.entity;

import com.github.platinum234.exhibitadditions.ExhibitAdditions;
import com.github.platinum234.exhibitadditions.client.render.entity.*;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.registries.RegistryObject;
import org.zawamod.zawa.config.ZawaSpawnCategory;
import org.zawamod.zawa.world.entity.ZawaEntityRegistry;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;

public class ExhibitAdditionsEntities {
    public static final ZawaEntityRegistry REGISTRY = new ZawaEntityRegistry(ExhibitAdditions.MOD_ID);

    public static final RegistryObject<EntityType<SwampMonkeyEntity>> SWAMP_MONKEY =
            REGISTRY.builder(SwampMonkeyEntity::new, MobCategory.CREATURE)
                    .attributes(SwampMonkeyEntity::registerAttributes)
                    .spawns(10, 3, 4, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build("swamp_monkey");
    public static final RegistryObject<EntityType<GerenukEntity>> GERENUK =
            REGISTRY.builder(GerenukEntity::new, MobCategory.CREATURE)
                    .attributes(GerenukEntity::registerAttributes)
                    .spawns(8, 2, 3, ZawaSpawnCategory.WET_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(1.1F, 1.4F).clientTrackingRange(10))
                    .build("gerenuk");
    public static final RegistryObject<EntityType<PeccaryEntity>> PECCARY =
            REGISTRY.builder(PeccaryEntity::new, MobCategory.CREATURE)
                    .attributes(PeccaryEntity::registerAttributes)
                    .spawns(10, 2, 4, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.9F, 0.9F).clientTrackingRange(10))
                    .build("peccary");
    public static final RegistryObject<EntityType<PottoEntity>> POTTO =
            REGISTRY.builder(PottoEntity::new, MobCategory.CREATURE)
                    .attributes(PottoEntity::registerAttributes)
                    .spawns(2, 1, 1, ZawaSpawnCategory.DEEP_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.4F, 0.4F).clientTrackingRange(10))
                    .build("potto");
    public static final RegistryObject<EntityType<HyraxEntity>> HYRAX =
            REGISTRY.builder(HyraxEntity::new, MobCategory.CREATURE)
                    .attributes(HyraxEntity::registerAttributes)
                    .spawns(15, 1, 2, ZawaSpawnCategory.DRY_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(0.35F, 0.35F).clientTrackingRange(10))
                    .build("hyrax");
    public static final RegistryObject<EntityType<LangurEntity>> LANGUR =
            REGISTRY.builder(LangurEntity::new, MobCategory.CREATURE)
                    .attributes(LangurEntity::registerAttributes)
                    .spawns(10, 3, 4, ZawaSpawnCategory.WET_RAINFOREST, ZawaSpawnCategory.DRY_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.65F, 0.7F).clientTrackingRange(10))
                    .build("langur");
    public static final RegistryObject<EntityType<PronghornEntity>> PRONGHORN =
            REGISTRY.builder(PronghornEntity::new, MobCategory.CREATURE)
                    .attributes(PronghornEntity::registerAttributes)
                    .spawns(15, 3, 4, ZawaSpawnCategory.DRY_GRASSLAND)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.35F).clientTrackingRange(10))
                    .build("pronghorn");
    public static final RegistryObject<EntityType<WildebeestEntity>> WILDEBEEST =
            REGISTRY.builder(WildebeestEntity::new, MobCategory.CREATURE)
                    .attributes(WildebeestEntity::registerAttributes)
                    .spawns(10, 4, 5, ZawaSpawnCategory.DRY_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(1.8F, 2.0F).clientTrackingRange(10))
                    .build("wildebeest");
    public static final RegistryObject<EntityType<WallabyEntity>> WALLABY =
            REGISTRY.builder(WallabyEntity::new, MobCategory.CREATURE)
                    .attributes(WallabyEntity::registerAttributes)
                    .spawns(8, 2, 3, ZawaSpawnCategory.WET_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(0.8F, 0.9F).clientTrackingRange(10))
                    .build("wallaby");
    public static final RegistryObject<EntityType<KlipspringerEntity>> KLIPSPRINGER =
            REGISTRY.builder(KlipspringerEntity::new, MobCategory.CREATURE)
                    .attributes(KlipspringerEntity::registerAttributes)
                    .spawns(8, 2, 3, ZawaSpawnCategory.WET_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(0.8F, 0.9F).clientTrackingRange(10))
                    .build("klipspringer");
    public static final RegistryObject<EntityType<DuikerEntity>> DUIKER =
            REGISTRY.builder(DuikerEntity::new, MobCategory.CREATURE)
                    .attributes(DuikerEntity::registerAttributes)
                    .spawns(8, 2, 3, ZawaSpawnCategory.WET_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(0.8F, 0.9F).clientTrackingRange(10))
                    .build("duiker");
    public static final RegistryObject<EntityType<GuenonEntity>> GUENON =
            REGISTRY.builder(GuenonEntity::new, MobCategory.CREATURE)
                    .attributes(GuenonEntity::registerAttributes)
                    .spawns(10, 3, 4, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.65F, 0.7F).clientTrackingRange(10))
                    .build("guenon");

    public static void registerSpawnPlacements() {
        SpawnPlacements.register(POTTO.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        SpawnPlacements.register(PECCARY.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        SpawnPlacements.register(GERENUK.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        SpawnPlacements.register(SWAMP_MONKEY.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        SpawnPlacements.register(HYRAX.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        SpawnPlacements.register(LANGUR.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        SpawnPlacements.register(PRONGHORN.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        SpawnPlacements.register(WILDEBEEST.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        SpawnPlacements.register(WALLABY.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        SpawnPlacements.register(KLIPSPRINGER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        SpawnPlacements.register(GUENON.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
    }

    public static void registerRenderers() {
        EntityRenderers.register(SWAMP_MONKEY.get(), SwampMonkeyRenderer::new);
        EntityRenderers.register(GERENUK.get(), GerenukRenderer::new);
        EntityRenderers.register(PECCARY.get(), PeccaryRenderer::new);
        EntityRenderers.register(POTTO.get(), PottoRenderer::new);
        EntityRenderers.register(HYRAX.get(), HyraxRenderer::new);
        EntityRenderers.register(LANGUR.get(), LangurRenderer::new);
        EntityRenderers.register(PRONGHORN.get(), PronghornRenderer::new);
        EntityRenderers.register(WILDEBEEST.get(), WildebeestRenderer::new);
        EntityRenderers.register(WALLABY.get(), WallabyRenderer::new);
        EntityRenderers.register(KLIPSPRINGER.get(), KlipspringerRenderer::new);
        EntityRenderers.register(DUIKER.get(), DuikerRenderer::new);
        EntityRenderers.register(GUENON.get(), GuenonRenderer::new);
    }
}

