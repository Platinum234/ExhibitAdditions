package com.github.platinum234.exhibitadditions.client.render.entity;

import com.github.platinum234.exhibitadditions.client.model.ExhibitAdditionsModelLayers;
import com.github.platinum234.exhibitadditions.client.model.PeccaryModel;
import com.github.platinum234.exhibitadditions.entity.PeccaryEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class PeccaryRenderer extends ZawaMobRenderer<PeccaryEntity, PeccaryModel> {
    public PeccaryRenderer(EntityRendererProvider.Context context) {
        super(context, new PeccaryModel.Adult(context.bakeLayer(ExhibitAdditionsModelLayers.PECCARY_ADULT)), new PeccaryModel.Child(context.bakeLayer(ExhibitAdditionsModelLayers.PECCARY_CHILD)), 0.5F);
    }

    @Override
    protected void scale(PeccaryEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.7F : 0.95F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
    @Override
    protected boolean hasBabyVariants(PeccaryEntity entity) {
        return false;
    }
}
