package com.github.platinum234.exhibitadditions.client.render.entity;

import com.github.platinum234.exhibitadditions.client.model.PronghornModel;
import com.github.platinum234.exhibitadditions.entity.PronghornEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class PronghornRenderer extends ZawaMobRenderer<PronghornEntity, PronghornModel> {
    public PronghornRenderer(EntityRendererManager manager) {
        super(manager, new PronghornModel.Adult(), new PronghornModel.Child(), 0.5F);
    }

    @Override
    protected void scale(PronghornEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}
