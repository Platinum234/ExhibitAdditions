package com.github.platinum234.exhibitadditions.client.render.entity;

import com.github.platinum234.exhibitadditions.client.model.ExhibitAdditionsModelLayers;
import com.github.platinum234.exhibitadditions.client.model.LangurModel;
import com.github.platinum234.exhibitadditions.entity.LangurEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class LangurRenderer extends ZawaMobRenderer<LangurEntity, LangurModel> {
    public LangurRenderer(EntityRendererProvider.Context context) {
        super(context, new LangurModel.Adult(context.bakeLayer(ExhibitAdditionsModelLayers.LANGUR_ADULT)), new LangurModel.Child(context.bakeLayer(ExhibitAdditionsModelLayers.LANGUR_CHILD)), 0.4F);
    }

    @Override
    protected void scale(LangurEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.6F : 0.7F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
