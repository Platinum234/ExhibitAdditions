package com.github.platinum234.exhibitadditions.client.render.entity;

import com.github.platinum234.exhibitadditions.client.model.ExhibitAdditionsModelLayers;
import com.github.platinum234.exhibitadditions.client.model.HyraxModel;
import com.github.platinum234.exhibitadditions.entity.HyraxEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class HyraxRenderer extends ZawaMobRenderer<HyraxEntity, HyraxModel> {
    public HyraxRenderer(EntityRendererProvider.Context context) {
        super(context, new HyraxModel.Adult(context.bakeLayer(ExhibitAdditionsModelLayers.HYRAX_ADULT)), new HyraxModel.Child(context.bakeLayer(ExhibitAdditionsModelLayers.HYRAX_CHILD)), 0.25F);
    }

    @Override
    protected void scale(HyraxEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
