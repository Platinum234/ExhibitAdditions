package com.github.platinum234.exhibitadditions.client.render.entity;

import com.github.platinum234.exhibitadditions.client.model.PottoModel;
import com.github.platinum234.exhibitadditions.entity.PottoEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class PottoRenderer extends ZawaMobRenderer<PottoEntity, PottoModel> {
    public PottoRenderer(EntityRendererManager manager) {
        super(manager, new PottoModel.Adult(), new PottoModel.Child(), 0.35F);
    }

    @Override
    protected void scale(PottoEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.45F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}

