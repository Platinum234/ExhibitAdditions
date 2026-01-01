package com.github.platinum234.exhibitadditions.client.render.entity;

import com.github.platinum234.exhibitadditions.client.model.KlipspringerModel;
import com.github.platinum234.exhibitadditions.entity.KlipspringerEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class KlipspringerRenderer extends ZawaMobRenderer<KlipspringerEntity, KlipspringerModel> {
    public KlipspringerRenderer(EntityRendererManager manager) {
        super(manager, new KlipspringerModel.Adult(), new KlipspringerModel.Child(), 0.4F);
    }

    @Override
    protected void scale(KlipspringerEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.45F : 0.7F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}

