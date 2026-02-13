package com.github.platinum234.exhibitadditions.client.render.entity;

import com.github.platinum234.exhibitadditions.client.model.SwampMonkeyModel;
import com.github.platinum234.exhibitadditions.entity.SwampMonkeyEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SwampMonkeyRenderer extends ZawaMobRenderer<SwampMonkeyEntity, SwampMonkeyModel> {
    public SwampMonkeyRenderer(EntityRendererProvider.Context context) {
        super(context, new SwampMonkeyModel.Adult(), new SwampMonkeyModel.Child(), 0.5F);
    }

    @Override
    protected void scale(SwampMonkeyEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.65F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
