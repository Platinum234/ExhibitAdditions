package com.github.platinum234.exhibitadditions.client.render.entity;

import com.github.platinum234.exhibitadditions.client.model.DuikerModel;
import com.github.platinum234.exhibitadditions.client.model.ExhibitAdditionsModelLayers;
import com.github.platinum234.exhibitadditions.entity.DuikerEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class DuikerRenderer extends ZawaMobRenderer<DuikerEntity, DuikerModel> {
    public DuikerRenderer(EntityRendererProvider.Context context) {
        super(context, new DuikerModel.Adult(context.bakeLayer(ExhibitAdditionsModelLayers.DUIKER_ADULT)), new DuikerModel.Child(context.bakeLayer(ExhibitAdditionsModelLayers.DUIKER_CHILD)), 0.4F);
    }

    @Override
    protected void scale(DuikerEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.55F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
   @Override
   protected boolean isSexuallyDimorphic() {
    return true;
}
}
