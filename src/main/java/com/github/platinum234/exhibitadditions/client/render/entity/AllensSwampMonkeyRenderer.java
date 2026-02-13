package com.github.platinum234.exhibitadditions.client.render.entity;

import com.github.platinum234.exhibitadditions.client.model.AllensSwampMonkeyModel;
import com.github.platinum234.exhibitadditions.entity.AllensSwampMonkeyEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class AllensSwampMonkeyRenderer extends ZawaMobRenderer<AllensSwampMonkeyEntity, AllensSwampMonkeyModel> {
    public AllensSwampMonkeyRenderer(EntityRendererManager manager) {
        super(manager, new AllensSwampMonkeyModel.Adult(), new AllensSwampMonkeyModel.Child(), 0.5F);
    }

    @Override
    protected void scale(AllensSwampMonkeyEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.65F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
