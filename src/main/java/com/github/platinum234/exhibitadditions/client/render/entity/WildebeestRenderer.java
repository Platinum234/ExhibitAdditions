package com.github.platinum234.exhibitadditions.client.render.entity;

import com.github.platinum234.exhibitadditions.client.model.WildebeestModel;
import com.github.platinum234.exhibitadditions.entity.WildebeestEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class WildebeestRenderer extends ZawaMobRenderer<WildebeestEntity, WildebeestModel> {
    public WildebeestRenderer(EntityRendererManager manager) {
        super(manager, new WildebeestModel.Adult(), new WildebeestModel.Child(), 0.75F);
    }

    @Override
    protected void scale(WildebeestEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.6F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
