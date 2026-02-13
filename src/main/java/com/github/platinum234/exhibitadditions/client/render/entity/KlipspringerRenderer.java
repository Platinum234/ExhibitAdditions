package com.github.platinum234.exhibitadditions.client.render.entity;

import com.github.platinum234.exhibitadditions.client.model.KlipspringerModel;
import com.github.platinum234.exhibitadditions.entity.KlipspringerEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class KlipspringerRenderer extends ZawaMobRenderer<KlipspringerEntity, KlipspringerModel> {
    public KlipspringerRenderer(EntityRendererProvider.Context context) {
        super(context, new KlipspringerModel.Adult(), new KlipspringerModel.Child(), 0.4F);
    }

    @Override
    protected void scale(KlipspringerEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.45F : 0.7F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}

