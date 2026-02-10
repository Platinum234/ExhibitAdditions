package com.github.platinum234.exhibitadditions.client.render.entity;

import com.github.platinum234.exhibitadditions.client.model.DuikerModel;
import com.github.platinum234.exhibitadditions.entity.DuikerEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class DuikerRenderer extends ZawaMobRenderer<DuikerEntity, DuikerModel> {
    public DuikerRenderer(EntityRendererManager manager) {
        super(manager, new DuikerModel.Adult(), new DuikerModel.Child(), 0.4F);
    }

    @Override
    protected void scale(DuikerEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.55F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
   @Override
   protected boolean isSexuallyDimorphic() {
    return true;
}
}
