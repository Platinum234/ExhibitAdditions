package com.github.platinum234.exhibitadditions;

import com.github.platinum234.exhibitadditions.client.model.ExhibitAdditionsModelLayers;
import com.github.platinum234.exhibitadditions.entity.ExhibitAdditionsEntities;
import com.github.platinum234.exhibitadditions.item.ExhibitAdditionsItems;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.util.Tuple;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.zawamod.zawa.Zawa;

import java.util.function.Supplier;

@Mod(ExhibitAdditions.MOD_ID)
public class ExhibitAdditions {
    public static final String MOD_ID = "exhibitadditions";

    public ExhibitAdditions() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ExhibitAdditionsEntities.REGISTRY.initialize();
        ExhibitAdditionsItems.ITEMS_REGISTRAR.register(bus);

        bus.addListener(this::addCreativeTabs);
        bus.addListener(this::setup);
        bus.addListener(this::registerLayerDefinitions);
        bus.addListener(this::setupClient);
    }

    private void addCreativeTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == Zawa.ITEMS_GROUP.getKey()) {
            ExhibitAdditionsItems.ITEMS_REGISTRAR.getEntries().forEach(item -> event.accept(item.get()));
        }
        if (event.getTabKey() == Zawa.DECORATIONS_GROUP.getKey()) {
            ExhibitAdditionsItems.DECORATIONS_REGISTRAR.getEntries().forEach(item -> event.accept(item.get()));
        }
        if (event.getTabKey() == Zawa.ENTITIES_GROUP.getKey()) {
            ExhibitAdditionsEntities.REGISTRY.itemRegistrar.getEntries().forEach(item -> event.accept(item.get()));
        }
    }

    private void setup(final FMLCommonSetupEvent event) {
        ExhibitAdditionsEntities.registerSpawnPlacements();
    }

    private void setupClient(final FMLClientSetupEvent event) {
        ExhibitAdditionsEntities.registerRenderers();
//        ExhibitAdditionsBlocks.setRenderLayers();
    }

    public void registerLayerDefinitions(final EntityRenderersEvent.RegisterLayerDefinitions event) {
        for (Tuple<ModelLayerLocation, Supplier<LayerDefinition>> layer : ExhibitAdditionsModelLayers.MODEL_LAYERS_LIST) {
            event.registerLayerDefinition(layer.getA(), layer.getB());
        }
    }
}