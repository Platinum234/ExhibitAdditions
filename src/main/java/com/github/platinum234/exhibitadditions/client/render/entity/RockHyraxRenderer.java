package com.github.platinum234.exhibitadditions.client.render.entity;

import com.github.platinum234.exhibitadditions.client.model.RockHyraxModel;
import com.github.platinum234.exhibitadditions.entity.RockHyraxEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class RockHyraxRenderer extends ZawaMobRenderer<RockHyraxEntity, RockHyraxModel> {
    public RockHyraxRenderer(EntityRendererManager manager) {
        super(manager, new RockHyraxModel.Adult(), new RockHyraxModel.Child(), 0.25F);
    }

    @Override
    protected void scale(RockHyraxEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
