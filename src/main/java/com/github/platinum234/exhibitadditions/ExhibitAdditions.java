package com.github.platinum234.exhibitadditions;

import com.github.platinum234.exhibitadditions.entity.ExhibitAdditionsEntities;
import com.github.platinum234.exhibitadditions.item.ExhibitAdditionsItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExhibitAdditions.MOD_ID)
public class ExhibitAdditions {
    public static final String MOD_ID = "exhibitadditions";

    public ExhibitAdditions() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ExhibitAdditionsEntities.REGISTRY.initialize();
        ExhibitAdditionsItems.REGISTRAR.register(bus);

        bus.addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        ExhibitAdditionsEntities.registerSpawnPlacements();
    }
}