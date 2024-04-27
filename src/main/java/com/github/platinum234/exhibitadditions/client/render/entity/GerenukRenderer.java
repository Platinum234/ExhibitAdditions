package com.github.platinum234.exhibitadditions.client.render.entity;

import com.github.platinum234.exhibitadditions.client.model.GerenukModel;
import com.github.platinum234.exhibitadditions.entity.GerenukEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class GerenukRenderer extends ZawaMobRenderer<GerenukEntity, GerenukModel> {
    public GerenukRenderer(EntityRendererManager manager) {
        super(manager, new GerenukModel.Adult(), new GerenukModel.Child(), 0.65F);
    }

    @Override
    protected void scale(GerenukEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.8F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
