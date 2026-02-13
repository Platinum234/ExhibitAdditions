package com.github.platinum234.exhibitadditions.client.render.entity;

import com.github.platinum234.exhibitadditions.client.model.BlueWildebeestModel;
import com.github.platinum234.exhibitadditions.entity.BlueWildebeestEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class BlueWildebeestRenderer extends ZawaMobRenderer<BlueWildebeestEntity, BlueWildebeestModel> {
    public BlueWildebeestRenderer(EntityRendererManager manager) {
        super(manager, new BlueWildebeestModel.Adult(), new BlueWildebeestModel.Child(), 0.75F);
    }

    @Override
    protected void scale(BlueWildebeestEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.8F : 1.2F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
