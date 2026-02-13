package com.github.platinum234.exhibitadditions.client.model;

import com.github.platinum234.exhibitadditions.entity.WallabyEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class WallabyModel extends ZawaBaseModel<WallabyEntity> {
    public ModelPart Hips;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Hips);
        }

        return this.parts;
    }

    public static class Adult extends WallabyModel {
        public ModelPart Body;
        public ModelPart Pouch;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail1;
        public ModelPart Chest;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart Neck;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart Mouth;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart Tail2;
        public ModelPart Tail3;

        public Adult(ModelPart root) {
            this.Hips = root.getChild("Hips");
            this.Chest = this.Body.getChild("Chest");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.Snout = this.Head.getChild("Snout");
            this.Body = this.Hips.getChild("Body");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.Mouth = this.Head.getChild("Mouth");
            this.EarRight = this.Head.getChild("EarRight");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.Neck = this.Chest.getChild("Neck");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.Head = this.Neck.getChild("Head");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.Tail2 = this.Tail1.getChild("Tail2");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(14, 12).addBox(-3.5F, -3.5F, -3.0F, 7.0F, 7.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 16.3F, 0.0F, -0.9075712110370513F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 8).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 4.5F, 0.0F, -0.22689280275926282F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(38, 0).mirror(true).addBox(-1.5F, -2.5F, -6.0F, 3.0F, 5.0F, 6.0F), PartPose.offsetAndRotation(-2.8F, -0.5F, 2.5F, 0.9677850835466613F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 17).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.0F, -1.4F, 0.2617993877991494F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(16, 0).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -3.2F, -3.0F, -0.9773843811168246F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(35, 11).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.7F, -5.5F, 0.10471975511965977F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(14, 41).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.8F, 4.0F, 0.5082398928281348F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(0, 31).mirror(true).addBox(0.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.9F, 2.0F, 3.4F, 2.1816615649929116F, -0.22689280275926282F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(0, 31).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.9F, 2.0F, 3.4F, 2.1816615649929116F, 0.22689280275926282F, 0.0F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(12, 25).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.9F, 3.0F, -0.12217304763960307F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(0, 36).mirror(true).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.5F, 3.0F, 1.0F, -0.3490658503988659F, -0.3141592653589793F, -0.3490658503988659F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(38, 0).addBox(-1.5F, -2.5F, -6.0F, 3.0F, 5.0F, 6.0F), PartPose.offsetAndRotation(2.8F, -0.5F, 2.5F, 0.9677850835466613F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.5F, 3.0F, 1.0F, -0.3490658503988659F, 0.3141592653589793F, 0.3490658503988659F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 22).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.9F, 1.0F), PartPose.offset(0.0F, 0.4F, 1.8F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(0, 26).mirror(true).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(-0.9F, -1.7F, -1.4F, 0.19198621771937624F, 0.4223696922984332F, 0.5864306020384839F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(40, 11).addBox(-1.5F, 0.0F, -6.5F, 3.0F, 1.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 3.5F, 3.0F, -0.15707963267948966F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(0, 41).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.7F, -2.2F, 0.45378560551852565F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(28, 25).addBox(-1.5F, -2.0F, -4.0F, 3.0F, 4.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 1.5F, 2.8F, 1.0471975511965976F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(0, 26).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.9F, -1.7F, -1.4F, 0.19198621771937624F, -0.4223696922984332F, -0.5864306020384839F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -5.1F, -0.3909537457888271F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(0, 41).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.7F, -2.2F, 0.45378560551852565F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(40, 11).mirror(true).addBox(-1.5F, 0.0F, -6.5F, 3.0F, 1.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 3.5F, 3.0F, -0.15707963267948966F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(35, 11).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.7F, -5.5F, 0.10471975511965977F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(13, 33).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 4.9F), PartPose.offsetAndRotation(0.0F, 0.3F, 2.5F, 0.5082398928281348F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(WallabyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;

        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F + (float) Math.PI) * degree * 0.1F * limbSwingAmount * 0.5F + 1.04F;
            this.Head.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F + (float) Math.PI) * degree * -0.1F * limbSwingAmount * 0.5F - 0.39F;
            this.ArmBaseLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F + (float) Math.PI) * degree * 0.1F * limbSwingAmount * 0.5F + 2.18F;
            this.ArmBaseRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F + (float) Math.PI) * degree * 0.1F * limbSwingAmount * 0.5F + 2.18F;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 4.0F;
            float degree = 0.5F;
            this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * 1.0F * limbSwingAmount * 0.5F;
            this.Hips.y = Mth.cos(limbSwing * speed * 0.2F + (float) Math.PI) * degree * -0.3F * limbSwingAmount * 0.5F + -0.05F + 17.95F;
            this.Hips.z = Mth.cos(limbSwing * speed * 0.2F + (float) Math.PI) * degree * 0.8F * limbSwingAmount * 0.5F;
            this.Chest.xRot = Mth.cos(limbSwing * speed * 0.2F + (float) Math.PI) * degree * -0.7F * limbSwingAmount * 0.5F + -0.3F;
            this.Head.xRot = Mth.cos(limbSwing * speed * 0.2F + (float) Math.PI) * degree * 0.0F * limbSwingAmount * 0.5F + -0.5F;
            this.ArmBaseLeft.xRot = Mth.cos(limbSwing * speed * 0.2F + (float) Math.PI) * degree * 6.0F * limbSwingAmount * 0.5F + 1.5F;
            this.ArmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * 3.0F * limbSwingAmount * 0.5F + -0.9F;
            this.HandLeft.xRot = Mth.cos(limbSwing * speed * 0.2F + (float) Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + 0.2F;
            this.ArmBaseRight.xRot = Mth.cos(limbSwing * speed * 0.2F + (float) Math.PI) * degree * 5.0F * limbSwingAmount * 0.5F + 1.5F;
            this.ArmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * 3.0F * limbSwingAmount * 0.5F + -0.9F;
            this.HandRight.xRot = Mth.cos(limbSwing * speed * 0.2F + (float) Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + 0.2F;
            this.Body.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * -1.9F * limbSwingAmount * 0.5F + -1F;
            this.Neck.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * 2.5F * limbSwingAmount * 0.5F + 0.65F;
            this.Head.xRot = Mth.cos(6.0F + limbSwing * speed * 0.0F + (float) Math.PI) * degree * -1.0F * limbSwingAmount * 0.5F + -0.8F;
            this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * -1.85F * limbSwingAmount * 0.5F + 0.15F;
            this.ThighLeft.z = Mth.cos(limbSwing * speed * 0.2F + (float) Math.PI) * degree * -1.0F * limbSwingAmount * 0.5F + 2.5F;
            this.ThighLeft.y = Mth.cos(limbSwing * speed * 0.0F + (float) Math.PI) * degree * 0.0F * limbSwingAmount * 0.5F + -0.5F;
            this.LegLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + 0.1F;
            this.FootLeft.xRot = Mth.cos(limbSwing * speed * 0.2F + (float) Math.PI) * degree * 3.0F * limbSwingAmount * 0.5F + -0.2F;
            this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * -1.85F * limbSwingAmount * 0.5F + 0.15F;
            this.ThighRight.z = Mth.cos(limbSwing * speed * 0.2F + (float) Math.PI) * degree * -1.0F * limbSwingAmount * 0.5F + -0.01F + 2.5F;
            this.ThighRight.y = Mth.cos(limbSwing * speed * 0.0F + (float) Math.PI) * degree * 0.0F * limbSwingAmount * 0.5F + 0.15F + -0.5F;
            this.LegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + 0.1F;
            this.FootRight.xRot = Mth.cos(limbSwing * speed * 0.2F + (float) Math.PI) * degree * 3.0F * limbSwingAmount * 0.5F + -0.2F;
            this.Tail1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + -0.4F;
            this.Tail2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F + (float) Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F + -0.4F;
            this.Tail3.xRot = Mth.cos(limbSwing * speed * 0.2F + (float) Math.PI) * degree * -1.0F * limbSwingAmount * 0.5F + 0.6F;
        }
    }

    public static class Child extends WallabyModel {
        public ModelPart Tail1;
        public ModelPart ThighRight;
        public ModelPart Body;
        public ModelPart ThighLeft;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart Tail4;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart Neck;
        public ModelPart ArmBaseRight;
        public ModelPart ArmBaseLeft;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart HeadRight;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Mouth;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart LegLeft;
        public ModelPart FootLeft;

        public Child(ModelPart root) {
            this.Hips = root.getChild("Hips");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.Head = this.Neck.getChild("Head");
            this.ArmBaseLeft = this.Body.getChild("ArmBaseLeft");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.Mouth = this.Snout.getChild("Mouth");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.EarRight = this.Head.getChild("EarRight");
            this.ArmBaseRight = this.Body.getChild("ArmBaseRight");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.HeadRight = this.Head.getChild("HeadRight");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.Snout = this.Head.getChild("Snout");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.Body = this.Hips.getChild("Body");
            this.Neck = this.Body.getChild("Neck");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail4 = this.Tail3.getChild("Tail4");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(38, 7).mirror(true).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 3.0F, 1.1F, -0.03909537541112055F, 0.0911061832922575F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 20).addBox(-1.49F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -3.6F, 0.0F, -0.4243149650271679F, -0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(12, 11).addBox(-1.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(2.5F, 3.3F, 2.5F, 1.5934856603340446F, 0.13665927909957545F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(20, 8).addBox(0.0F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.3F, -1.6F, 0.4F, -0.27314403792396663F, -0.8651597048872669F, 0.7285004590772052F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(30, 10).mirror(true).addBox(-2.0F, -2.0F, -4.0F, 2.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(-1.2F, -1.0F, 2.7F, 0.6373942508178124F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(16, 0).addBox(-1.0F, 0.0F, -1.75F, 1.98F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.01F, 1.8F, 0.0F, -0.3186971254089062F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(34, 18).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F), PartPose.offset(-1.0F, 1.5F, -3.9F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(20, 8).mirror(true).addBox(-2.0F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-0.3F, -1.6F, 0.4F, -0.27314403792396663F, 0.8651597048872669F, -0.7285004590772052F));
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(12, 11).mirror(true).addBox(0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-2.5F, 3.3F, 2.5F, 1.5934856603340446F, -0.13665927909957545F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, -2.0F, -2.0F, -0.9105382388075086F, 0.4098033003787853F, 0.0911061832922575F));
            partDefinition.addOrReplaceChild("HeadRight", CubeListBuilder.create().texOffs(0, 20).addBox(-1.51F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(15, 24).addBox(-2.0F, -2.0F, -1.0F, 4.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.5F, 1.5F, -0.5462880425584197F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(16, 13).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.5F, 1.5F, 1.0F, 1.0471975511965976F, 0.0911061832922575F, 0.0911061832922575F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(38, 7).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 3.0F, 1.1F, -0.03909537541112055F, -0.0911061832922575F, 0.0F));
            partDefinition.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(29, 3).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.500909508638178F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(16, 13).mirror(true).addBox(0.0F, -2.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.5F, 1.5F, 1.0F, 1.0471975511965976F, -0.0911061832922575F, -0.0911061832922575F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(12, 20).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.3F, -2.0F, 0.3642502295386026F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(34, 18).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F), PartPose.offset(1.0F, 1.5F, -3.9F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 11).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -3.0F, -3.0F, -0.8651597048872669F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(22, 0).addBox(-1.5F, -5.0F, -1.5F, 3.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.5F, 1.9F, 2.045002252603823F, -0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(0, 28).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.5F, -2.0F, -2.0F, -0.9105382388075086F, -0.4098033003787853F, -0.0911061832922575F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(20, 17).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 1.5F, 0.500909508638178F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(38, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F), PartPose.offset(0.0F, 0.0F, 3.8F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 18.7F, 0.0F, -0.591841146688116F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(30, 10).addBox(0.0F, -2.0F, -4.0F, 2.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(1.2F, -1.0F, 2.7F, 0.6373942508178124F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(WallabyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians((double) (-netHeadYaw)) * 0.25F;
            this.Head.yRot = (float) Math.toRadians((double) (-netHeadYaw)) * 0.25F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F + (float) Math.PI) * degree * -0.3F * limbSwingAmount * 0.5F + 1.8F;
            this.Head.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F + (float) Math.PI) * degree * 0.3F * limbSwingAmount * 0.5F - 0.424F;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Hips.xRot = Mth.cos(limbSwing * speed * 0.3F + (float) Math.PI) * degree * 1.0F * limbSwingAmount * 0.5F + -0.3F;
            this.ThighLeft.xRot = Mth.cos(0.2F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F + 0.25F;
            this.ThighLeft.y = Mth.cos(limbSwing * speed * 0.3F + (float) Math.PI) * degree * -0.2F * limbSwingAmount * 0.5F + 0.05F - 1.0F;
            this.LegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * -1.0F * limbSwingAmount * 0.5F;
            this.FootLeft.xRot = Mth.cos(limbSwing * speed * 0.3F + (float) Math.PI) * degree * -3.0F * limbSwingAmount * 0.5F;
            this.ThighRight.xRot = Mth.cos(0.2F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F + 0.25F;
            this.ThighRight.y = Mth.cos(limbSwing * speed * 0.3F + (float) Math.PI) * degree * -0.2F * limbSwingAmount * 0.5F + 0.05F - 1.0F;
            this.LegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * -1.0F * limbSwingAmount * 0.5F;
            this.FootRight.xRot = Mth.cos(limbSwing * speed * 0.3F + (float) Math.PI) * degree * -3.0F * limbSwingAmount * 0.5F;
            this.Tail1.xRot = Mth.cos(3.5F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F - 0.546F;
            this.Body.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * 1.0F * limbSwingAmount * 0.5F - 0.9F;
            this.Neck.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F + 1.8F;
            this.Head.xRot = Mth.cos(limbSwing * speed * 0.3F + (float) Math.PI) * degree * -1.0F * limbSwingAmount * 0.5F - 0.424F;
            this.Hips.y = Mth.cos(2.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * -7.0F * limbSwingAmount * 0.5F + 18.7F;
        }
    }
}
