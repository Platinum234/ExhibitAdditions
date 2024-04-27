package com.github.platinum234.exhibitadditions.client.render.entity;

import com.github.platinum234.exhibitadditions.client.model.PeccaryModel;
import com.github.platinum234.exhibitadditions.entity.PeccaryEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class PeccaryRenderer extends ZawaMobRenderer<PeccaryEntity, PeccaryModel> {
    public PeccaryRenderer(EntityRendererManager manager) {
        super(manager, new PeccaryModel.Adult(), new PeccaryModel.Child(), 0.65F);
    }

    @Override
    protected void scale(PeccaryEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.8F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
