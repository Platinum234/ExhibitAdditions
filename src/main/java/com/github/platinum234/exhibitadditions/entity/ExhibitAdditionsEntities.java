package com.github.platinum234.exhibitadditions.entity;

import com.github.platinum234.exhibitadditions.ExhibitAdditions;
import com.github.platinum234.exhibitadditions.client.render.entity.GerenukRenderer;
import com.github.platinum234.exhibitadditions.client.render.entity.PeccaryRenderer;
import com.github.platinum234.exhibitadditions.client.render.entity.PottoRenderer;
import com.github.platinum234.exhibitadditions.client.render.entity.SwampMonkeyRenderer;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.fml.RegistryObject;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.config.ZawaSpawnCategory;
import org.zawamod.zawa.world.entity.ZawaEntityRegistry;
import org.zawamod.zawa.world.entity.ambient.ZawaAmbientFishEntity;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;

public class ExhibitAdditionsEntities {
    public static final ZawaEntityRegistry REGISTRY = new ZawaEntityRegistry(ExhibitAdditions.MOD_ID, Zawa.ENTITIES_GROUP);

    public static final RegistryObject<EntityType<SwampMonkeyEntity>> SWAMP_MONKEY =
            REGISTRY.builder(SwampMonkeyEntity::new, EntityClassification.CREATURE)
                    .attributes(SwampMonkeyEntity::registerAttributes)
                    //.renderer(() -> SwampMonkeyRenderer::new)
                    .renderer(() -> SwampMonkeyRenderer::new)
                    .spawns(2, 2, 3, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.DRY_RAINFOREST, ZawaSpawnCategory.TROPICAL_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build("swamp_monkey");
    public static final RegistryObject<EntityType<GerenukEntity>> GERENUK =
            REGISTRY.builder(GerenukEntity::new, EntityClassification.CREATURE)
                    .attributes(GerenukEntity::registerAttributes)
                    .renderer(() -> GerenukRenderer::new)
                    .spawns(2, 2, 3, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.DRY_RAINFOREST, ZawaSpawnCategory.TROPICAL_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build("gerenuk");
    public static final RegistryObject<EntityType<PeccaryEntity>> PECCARY =
            REGISTRY.builder(PeccaryEntity::new, EntityClassification.CREATURE)
                    .attributes(PeccaryEntity::registerAttributes)
                    .renderer(() -> PeccaryRenderer::new)
                    .spawns(2, 2, 3, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.DRY_RAINFOREST, ZawaSpawnCategory.TROPICAL_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build("peccary");
    public static final RegistryObject<EntityType<PottoEntity>> POTTO =
            REGISTRY.builder(PottoEntity::new, EntityClassification.CREATURE)
                    .attributes(PottoEntity::registerAttributes)
                    .renderer(() -> PottoRenderer::new)
                    .spawns(2, 2, 3, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.DRY_RAINFOREST, ZawaSpawnCategory.TROPICAL_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build("potto");

    public static void registerSpawnPlacements() {

    }
}

