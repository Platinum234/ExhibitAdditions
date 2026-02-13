package com.github.platinum234.exhibitadditions.client.render.entity;

import com.github.platinum234.exhibitadditions.client.model.GerenukModel;
import com.github.platinum234.exhibitadditions.entity.GerenukEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class GerenukRenderer extends ZawaMobRenderer<GerenukEntity, GerenukModel> {
    public GerenukRenderer(EntityRendererProvider.Context context) {
        super(context, new GerenukModel.Adult(), new GerenukModel.Child(), 0.6F);
    }

    @Override
    protected void scale(GerenukEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.9F : 0.9F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}
