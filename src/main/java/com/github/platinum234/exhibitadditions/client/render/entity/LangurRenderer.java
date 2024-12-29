package com.github.platinum234.exhibitadditions.client.render.entity;

import com.github.platinum234.exhibitadditions.client.model.LangurModel;
import com.github.platinum234.exhibitadditions.entity.LangurEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class LangurRenderer extends ZawaMobRenderer<LangurEntity, LangurModel> {
    public LangurRenderer(EntityRendererManager manager) {
        super(manager, new LangurModel.Adult(), new LangurModel.Child(), 0.4F);
    }

    @Override
    protected void scale(LangurEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }

    @Override
    protected boolean hasBabyVariants(LangurEntity entity) {
        return false;
    }
}
