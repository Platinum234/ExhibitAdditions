package com.github.platinum234.exhibitadditions.client.render.entity;

import com.github.platinum234.exhibitadditions.client.model.WallabyModel;
import com.github.platinum234.exhibitadditions.entity.WallabyEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class WallabyRenderer extends ZawaMobRenderer<WallabyEntity, WallabyModel> {
    public WallabyRenderer(EntityRendererManager manager) {
        super(manager, new WallabyModel.Adult(), new WallabyModel.Child(), 0.6F);
    }

    @Override
    protected void scale(WallabyEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 0.85F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}
