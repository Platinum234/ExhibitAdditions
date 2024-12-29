package com.github.platinum234.exhibitadditions.client.render.entity;

import com.github.platinum234.exhibitadditions.client.model.SwampMonkeyModel;
import com.github.platinum234.exhibitadditions.entity.SwampMonkeyEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SwampMonkeyRenderer extends ZawaMobRenderer<SwampMonkeyEntity, SwampMonkeyModel> {
    public SwampMonkeyRenderer(EntityRendererManager manager) {
        super(manager, new SwampMonkeyModel.Adult(), new SwampMonkeyModel.Child(), 0.5F);
    }

    @Override
    protected void scale(SwampMonkeyEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
