package com.github.platinum234.exhibitadditions.client.render.entity;

import com.github.platinum234.exhibitadditions.client.model.ExhibitAdditionsModelLayers;
import com.github.platinum234.exhibitadditions.client.model.PottoModel;
import com.github.platinum234.exhibitadditions.entity.PottoEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class PottoRenderer extends ZawaMobRenderer<PottoEntity, PottoModel> {
    public PottoRenderer(EntityRendererProvider.Context context) {
        super(context, new PottoModel.Adult(context.bakeLayer(ExhibitAdditionsModelLayers.POTTO_ADULT)), new PottoModel.Child(context.bakeLayer(ExhibitAdditionsModelLayers.POTTO_CHILD)), 0.35F);
    }

    @Override
    protected void scale(PottoEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.45F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}

