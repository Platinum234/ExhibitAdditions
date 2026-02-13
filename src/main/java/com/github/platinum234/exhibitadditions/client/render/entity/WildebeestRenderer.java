package com.github.platinum234.exhibitadditions.client.render.entity;

import com.github.platinum234.exhibitadditions.client.model.WildebeestModel;
import com.github.platinum234.exhibitadditions.entity.WildebeestEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class WildebeestRenderer extends ZawaMobRenderer<WildebeestEntity, WildebeestModel> {
    public WildebeestRenderer(EntityRendererProvider.Context context) {
        super(context, new WildebeestModel.Adult(), new WildebeestModel.Child(), 0.75F);
    }

    @Override
    protected void scale(WildebeestEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.8F : 1.2F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
