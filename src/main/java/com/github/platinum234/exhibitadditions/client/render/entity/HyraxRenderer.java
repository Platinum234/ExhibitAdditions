package com.github.platinum234.exhibitadditions.client.render.entity;

import com.github.platinum234.exhibitadditions.client.model.HyraxModel;
import com.github.platinum234.exhibitadditions.entity.HyraxEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class HyraxRenderer extends ZawaMobRenderer<HyraxEntity, HyraxModel> {
    public HyraxRenderer(EntityRendererManager manager) {
        super(manager, new HyraxModel.Adult(), new HyraxModel.Child(), 0.3F);
    }

    @Override
    protected void scale(HyraxEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.55F : 0.75F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
