package com.github.platinum234.exhibitadditions.client.render.entity;

import com.github.platinum234.exhibitadditions.client.model.ExhibitAdditionsModelLayers;
import com.github.platinum234.exhibitadditions.client.model.WallabyModel;
import com.github.platinum234.exhibitadditions.entity.WallabyEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class WallabyRenderer extends ZawaMobRenderer<WallabyEntity, WallabyModel> {
    public WallabyRenderer(EntityRendererProvider.Context context) {
        super(context, new WallabyModel.Adult(context.bakeLayer(ExhibitAdditionsModelLayers.WALLABY_ADULT)), new WallabyModel.Child(context.bakeLayer(ExhibitAdditionsModelLayers.WALLABY_CHILD)), 0.45F);
    }

    @Override
    protected void scale(WallabyEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 0.70F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
    @Override
    protected boolean hasBabyVariants(WallabyEntity entity) {
        return false;
    }
}
