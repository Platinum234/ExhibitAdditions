package com.github.platinum234.exhibitadditions.client.render.entity;

import com.github.platinum234.exhibitadditions.client.model.GuenonModel;
import com.github.platinum234.exhibitadditions.entity.GuenonEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class GuenonRenderer extends ZawaMobRenderer<GuenonEntity, GuenonModel> {
    public GuenonRenderer(EntityRendererManager manager) {
        super(manager, new GuenonModel.Adult(), new GuenonModel.Child(), 0.4F);
    }

    @Override
    protected void scale(GuenonEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.6F : 0.75F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
