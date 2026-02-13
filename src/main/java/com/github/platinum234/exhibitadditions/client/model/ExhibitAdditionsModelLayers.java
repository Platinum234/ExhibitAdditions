package com.github.platinum234.exhibitadditions.client.model;

import com.github.platinum234.exhibitadditions.ExhibitAdditions;
import com.google.common.collect.Sets;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Tuple;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

@OnlyIn(Dist.CLIENT)
public class ExhibitAdditionsModelLayers {
    public static final Set<ModelLayerLocation> ALL_MODELS = Sets.newHashSet();
    public static final List<Tuple<ModelLayerLocation, Supplier<LayerDefinition>>> MODEL_LAYERS_LIST = new ArrayList<>();
    public static final ModelLayerLocation SWAMP_MONKEY_ADULT = register("swamp_monkey", "adult", SwampMonkeyModel.Adult::createBodyLayer);
    public static final ModelLayerLocation SWAMP_MONKEY_CHILD = register("swamp_monkey", "child", SwampMonkeyModel.Child::createBodyLayer);
    public static final ModelLayerLocation GERENUK_ADULT = register("gerenuk", "adult", GerenukModel.Adult::createBodyLayer);
    public static final ModelLayerLocation GERENUK_CHILD = register("gerenuk", "child", GerenukModel.Child::createBodyLayer);
    public static final ModelLayerLocation PECCARY_ADULT = register("peccary", "adult", PeccaryModel.Adult::createBodyLayer);
    public static final ModelLayerLocation PECCARY_CHILD = register("peccary", "child", PeccaryModel.Child::createBodyLayer);
    public static final ModelLayerLocation POTTO_ADULT = register("potto", "adult", PottoModel.Adult::createBodyLayer);
    public static final ModelLayerLocation POTTO_CHILD = register("potto", "child", PottoModel.Child::createBodyLayer);
    public static final ModelLayerLocation HYRAX_ADULT = register("hyrax", "adult", HyraxModel.Adult::createBodyLayer);
    public static final ModelLayerLocation HYRAX_CHILD = register("hyrax", "child", HyraxModel.Child::createBodyLayer);
    public static final ModelLayerLocation LANGUR_ADULT = register("langur", "adult", LangurModel.Adult::createBodyLayer);
    public static final ModelLayerLocation LANGUR_CHILD = register("langur", "child", LangurModel.Child::createBodyLayer);
    public static final ModelLayerLocation PRONGHORN_ADULT = register("pronghorn", "adult", PronghornModel.Adult::createBodyLayer);
    public static final ModelLayerLocation PRONGHORN_CHILD = register("pronghorn", "child", PronghornModel.Child::createBodyLayer);
    public static final ModelLayerLocation WILDEBEEST_ADULT = register("wildebeest", "adult", WildebeestModel.Adult::createBodyLayer);
    public static final ModelLayerLocation WILDEBEEST_CHILD = register("wildebeest", "child", WildebeestModel.Child::createBodyLayer);
    public static final ModelLayerLocation WALLABY_ADULT = register("wallaby", "adult", WallabyModel.Adult::createBodyLayer);
    public static final ModelLayerLocation WALLABY_CHILD = register("wallaby", "child", WallabyModel.Child::createBodyLayer);
    public static final ModelLayerLocation KLIPSPRINGER_ADULT = register("klipspringer", "adult", KlipspringerModel.Adult::createBodyLayer);
    public static final ModelLayerLocation KLIPSPRINGER_CHILD = register("klipspringer", "child", KlipspringerModel.Child::createBodyLayer);
    public static final ModelLayerLocation DUIKER_ADULT = register("duiker", "adult", DuikerModel.Adult::createBodyLayer);
    public static final ModelLayerLocation DUIKER_CHILD = register("duiker", "child", DuikerModel.Child::createBodyLayer);
    public static final ModelLayerLocation GUENON_ADULT = register("guenon", "adult", GuenonModel.Adult::createBodyLayer);
    public static final ModelLayerLocation GUENON_CHILD = register("guenon", "child", GuenonModel.Child::createBodyLayer);

    public ExhibitAdditionsModelLayers() {
    }

    private static ModelLayerLocation register(String path, Supplier<LayerDefinition> layerDefinition) {
        return register(path, "main", layerDefinition);
    }

    private static ModelLayerLocation register(String path, String model, Supplier<LayerDefinition> layerDefinition) {
        ModelLayerLocation modellayerlocation = createLocation(path, model);
        MODEL_LAYERS_LIST.add(new Tuple<>(modellayerlocation, layerDefinition));
        if (!ALL_MODELS.add(modellayerlocation))
            throw new IllegalStateException("Duplicate registration for " + modellayerlocation);
        else return modellayerlocation;
    }

    private static ModelLayerLocation createLocation(String path, String model) {
        return new ModelLayerLocation(new ResourceLocation(ExhibitAdditions.MOD_ID, path), model);
    }
}
