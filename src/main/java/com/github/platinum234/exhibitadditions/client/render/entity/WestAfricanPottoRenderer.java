package com.github.platinum234.exhibitadditions.client.render.entity;

import com.github.platinum234.exhibitadditions.client.model.WestAfricanPottoModel;
import com.github.platinum234.exhibitadditions.entity.WestAfricanPottoEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class WestAfricanPottoRenderer extends ZawaMobRenderer<WestAfricanPottoEntity, WestAfricanPottoModel> {
    public WestAfricanPottoRenderer(EntityRendererManager manager) {
        super(manager, new WestAfricanPottoModel.Adult(), new WestAfricanPottoModel.Child(), 0.35F);
    }

    @Override
    protected void scale(WestAfricanPottoEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.45F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}

