package com.github.platinum234.exhibitadditions.client.render.entity;

import com.github.platinum234.exhibitadditions.client.model.ExhibitAdditionsModelLayers;
import com.github.platinum234.exhibitadditions.client.model.PronghornModel;
import com.github.platinum234.exhibitadditions.entity.PronghornEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class PronghornRenderer extends ZawaMobRenderer<PronghornEntity, PronghornModel> {
    public PronghornRenderer(EntityRendererProvider.Context context) {
        super(context, new PronghornModel.Adult(context.bakeLayer(ExhibitAdditionsModelLayers.PRONGHORN_ADULT)), new PronghornModel.Child(context.bakeLayer(ExhibitAdditionsModelLayers.PRONGHORN_CHILD)), 0.5F);
    }

    @Override
    protected void scale(PronghornEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.9F : 0.9F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}
