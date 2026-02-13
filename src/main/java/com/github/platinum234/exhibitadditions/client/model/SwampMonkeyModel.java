package com.github.platinum234.exhibitadditions.client.model;

import com.github.platinum234.exhibitadditions.entity.SwampMonkeyEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class SwampMonkeyModel extends ZawaBaseModel<SwampMonkeyEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends SwampMonkeyModel {
        public ModelPart Body;
        public ModelPart Neck;
        public ModelPart ArmLeft;
        public ModelPart ArmRight;
        public ModelPart Hips;
        public ModelPart Tail1;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart Tail4;
        public ModelPart Tail5;
        public ModelPart Tail6;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart Head;
        public ModelPart SideburnLeft;
        public ModelPart EyebrowRight;
        public ModelPart SideburnRight;
        public ModelPart Mouth;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart EyebrowLeft;
        public ModelPart TopMouth;
        public ModelPart Nose;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart ThumbLeft;
        public ModelPart ForearmRight;
        public ModelPart HandRight;
        public ModelPart ThumbRight;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.ThumbRight = this.HandRight.getChild("ThumbRight");
            this.Nose = this.TopMouth.getChild("Nose");
            this.EyebrowRight = this.Head.getChild("EyebrowRight");
            this.Neck = this.Chest.getChild("Neck");
            this.EarRight = this.Head.getChild("EarRight");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.Mouth = this.Head.getChild("Mouth");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
            this.EyebrowLeft = this.Head.getChild("EyebrowLeft");
            this.SideburnRight = this.Head.getChild("SideburnRight");
            this.Tail6 = this.Tail5.getChild("Tail6");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.Tail4 = this.Tail3.getChild("Tail4");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.ThumbLeft = this.HandLeft.getChild("ThumbLeft");
            this.Head = this.Neck.getChild("Head");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.HandRight = this.ForearmRight.getChild("HandRight");
            this.ArmLeft = this.Chest.getChild("ArmLeft");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.SideburnLeft = this.Head.getChild("SideburnLeft");
            this.Tail5 = this.Tail4.getChild("Tail5");
            this.TopMouth = this.Head.getChild("TopMouth");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.ArmRight = this.Chest.getChild("ArmRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(24, 38).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F), PartPose.offset(0.1F, 3.5F, -0.1F));
            partDefinition.addOrReplaceChild("ThumbRight", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.05F, 0.1F, 0.0F, -0.33161255787892263F, 0.0F));
            partDefinition.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, -0.6923720823082175F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EyebrowRight", CubeListBuilder.create().texOffs(23, 18).mirror(true).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -1.9F, -2.2F, 0.10594148859211201F, 0.0F, -0.11693705655466871F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 31).addBox(-1.5F, -2.5F, -2.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -1.3F, -0.2792526803190927F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(33, 1).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.7F, -1.9F, 0.2F, 0.0F, -0.5715953300281429F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(30, 24).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F), PartPose.offset(2.2F, 1.8F, 1.1F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(19, 10).addBox(-1.0F, -0.5F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offset(0.0F, 2.0F, -1.5F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(24, 38).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F), PartPose.offset(-0.1F, 3.5F, -0.1F));
            partDefinition.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(15, 33).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(-0.2F, 3.4F, 0.6F, -0.13962634015954636F, 0.0F, 0.13962634015954636F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(24, 33).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 4.6F, -1.0F, 0.05235987755982988F, 0.0F, -0.13962634015954636F));
            partDefinition.addOrReplaceChild("EyebrowLeft", CubeListBuilder.create().texOffs(23, 18).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -1.9F, -2.2F, 0.10594148859211201F, 0.0F, 0.11693705655466871F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.5F, -2.0F, 5.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 15.8F, -2.5F, -0.05951572899103476F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("SideburnRight", CubeListBuilder.create().texOffs(25, 1).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-1.6F, -1.5F, -1.6F, -0.14451325740459856F, 0.0F, -0.22689280275926282F));
            partDefinition.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 0.0F, 3.0F, 0.20943951023931953F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(30, 24).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F), PartPose.offset(-2.2F, 1.8F, 1.1F));
            partDefinition.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 0.0F, 3.0F, 0.2485348814892509F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.9627236127369111F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThumbLeft", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.05F, 0.1F, 0.0F, 0.33161255787892263F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(27, 9).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.6F, -2.3F, 0.3717551173589867F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(15, 33).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.2F, 3.4F, 0.6F, -0.13962634015954636F, 0.0F, -0.13962634015954636F));
            partDefinition.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(35, 33).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.6F, -0.5F, 0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(24, 33).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 4.6F, -1.0F, 0.05235987755982988F, 0.0F, 0.13962634015954636F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(17, 24).addBox(-2.0F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(2.1F, -0.6F, 0.0F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(33, 1).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.7F, -1.8F, 0.2F, 0.0F, 0.5715953300281429F, 0.0F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 2.0F, 3.0F, 0.28763025273918225F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(35, 33).mirror(true).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.6F, -0.5F, 0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("SideburnLeft", CubeListBuilder.create().texOffs(25, 1).addBox(0.0F, 0.0F, 0.0F, 1.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(1.6F, -1.5F, -1.6F, -0.14451325740459856F, 0.0F, 0.22689280275926282F));
            partDefinition.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-0.01F, 0.0F, 3.0F, 0.20943951023931953F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TopMouth", CubeListBuilder.create().texOffs(16, 6).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.0F, -2.6F, 0.25289820461923673F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-0.01F, 0.0F, 3.0F, 0.28763025273918225F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 10).addBox(-3.0F, 0.0F, -0.2F, 6.0F, 5.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -2.5F, 0.5F, 0.09145524880976123F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 22).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 5.5F, -0.1424188642995762F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(17, 24).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(-2.1F, -0.6F, 0.0F, 0.13962634015954636F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 48, 48);
        }

        @Override
        public void setupAnim(SwampMonkeyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Tail1.xRot = Mth.cos(5.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isHeld ? -1.2F : -0.61F);
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F - 0.279F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 0.6f;
            this.ArmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + 0.139F;
            this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.052F;
            this.ArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F + 0.139F;
            this.HandRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.052F;

            this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
            this.LegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.087F;
            this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F;
            this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F;
            this.LegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.087F;
            this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F;

            this.Chest.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.15F * limbSwingAmount * 0.5F + (this.isSwimming ? -0.2F : -0.059F);
            this.Body.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * -0.17F * limbSwingAmount * 0.5F + 0.091F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F - 0.279F;
            this.Tail1.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : -0.61F);
        }
    }

    public static class Child extends SwampMonkeyModel {
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Body;
        public ModelPart Tail1;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LegRight;
        public ModelPart Right;
        public ModelPart Neck;
        public ModelPart ArmLeft;
        public ModelPart ArmRight;
        public ModelPart Head;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Crest;
        public ModelPart Faceplate;
        public ModelPart Snout1;
        public ModelPart Snout2;
        public ModelPart Mouth;
        public ModelPart Nose;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart ForearmRight;
        public ModelPart HandRight;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart Tail4;
        public ModelPart Tail5;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.Tail1 = this.Chest.getChild("Tail1");
            this.Head = this.Neck.getChild("Head");
            this.Right = this.LegRight.getChild("Right");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.Tail4 = this.Tail3.getChild("Tail4");
            this.Snout1 = this.Head.getChild("Snout1");
            this.Body = this.Chest.getChild("Body");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.Crest = this.Head.getChild("Crest");
            this.HandRight = this.ForearmRight.getChild("HandRight");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.Nose = this.Snout1.getChild("Nose");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.EarRight = this.Head.getChild("EarRight");
            this.ThighRight = this.Chest.getChild("ThighRight");
            this.Tail5 = this.Tail4.getChild("Tail5");
            this.Neck = this.Body.getChild("Neck");
            this.ThighLeft = this.Chest.getChild("ThighLeft");
            this.Snout2 = this.Snout1.getChild("Snout2");
            this.Mouth = this.Snout1.getChild("Mouth");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
            this.ArmLeft = this.Body.getChild("ArmLeft");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.Faceplate = this.Head.getChild("Faceplate");
            this.ArmRight = this.Body.getChild("ArmRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.6F, 0.3F, -0.33161255787892263F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 22).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.8F, 2.0F, -0.7155849933176751F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(22, 15).addBox(-2.0F, -2.0F, -1.5F, 4.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -1.8F, 0.6408849226376065F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Right", CubeListBuilder.create().texOffs(0, 19).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.6F, 0.3F, -0.33161255787892263F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 18.1F, 0.0F, -0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(14, 13).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.2F, 2.8F, 1.0F, -0.4363323129985824F, 0.0F, 0.24434609527920614F));
            partDefinition.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 22).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 0.0F, 3.0F, 0.3490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Snout1", CubeListBuilder.create().texOffs(18, 24).addBox(-0.2F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.4F, -1.4F, 0.1563815016444822F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(16, 0).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.22689280275926282F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(14, 13).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.2F, 2.8F, 1.0F, -0.4363323129985824F, 0.0F, -0.24434609527920614F));
            partDefinition.addOrReplaceChild("Crest", CubeListBuilder.create().texOffs(27, 28).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offset(0.0F, -1.1F, 1.1F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(14, 18).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.8F, -1.7F, 0.20943951023931953F, 0.0F, 0.10471975511965977F));
            partDefinition.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 22).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-0.01F, 0.0F, 3.0F, 0.3490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(16, 21).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.9F, 0.9382889765773795F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 22).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 2.0F, 3.0F, 0.3490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(33, 15).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.5F, -0.5F, 0.2F, 0.03490658503988659F, 0.6108652381980153F, 0.1308996938995747F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(33, 15).mirror(true).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.5F, -0.5F, 0.2F, 0.03490658503988659F, -0.6108652381980153F, -0.1308996938995747F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(0, 8).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(-1.3F, -0.9F, 1.3F, -0.20943951023931953F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 22).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-0.0F, 0.0F, 3.0F, 0.3490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(23, 8).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -3.8F, -0.7239625657377646F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(1.3F, -0.9F, 1.3F, -0.20943951023931953F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Snout2", CubeListBuilder.create().texOffs(18, 24).mirror(true).addBox(-0.8F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(18, 26).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.0F, 0.4F, 0.1F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(14, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.8F, -1.7F, 0.20943951023931953F, 0.0F, -0.10471975511965977F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(14, 8).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.1F, 1.9F, -2.6F, 0.06981317007977318F, 0.0F, -0.13962634015954636F));
            partDefinition.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(0, 14).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, -0.1F)), PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, 0.6457718232379019F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, -0.1F)), PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, 0.6457718232379019F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Faceplate", CubeListBuilder.create().texOffs(22, 22).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 3.0F, 1.0F), PartPose.offset(0.0F, -0.4F, -1.3F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(14, 8).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.1F, 1.9F, -2.6F, 0.06981317007977318F, 0.0F, 0.13962634015954636F));

            return LayerDefinition.create(meshDefinition, 48, 32);
        }

        @Override
        public void setupAnim(SwampMonkeyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Tail1.xRot = Mth.cos(5.0F + limbSwing * speed * 0.1F + (float) Math.PI) * degree * 0.3F * limbSwingAmount * 0.5F - 0.715F;
            this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F + (float) Math.PI) * degree * 0.1F * limbSwingAmount * 0.5F + 0.349F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F + (float) Math.PI) * degree * 0.2F * limbSwingAmount * 0.5F - 0.723F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.ArmLeft.xRot = Mth.cos(limbSwing * speed * 0.3F + (float) Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + 0.069F;
            this.ForearmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * -1.5F * limbSwingAmount * 0.5F - 0.436F;
            this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F + 0.209F;
            this.ArmRight.xRot = Mth.cos(limbSwing * speed * 0.3F + (float) Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F + 0.069F;
            this.ForearmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * 1.5F * limbSwingAmount * 0.5F - 0.436F;
            this.HandRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + 0.209F;
            this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F - 0.309F;
            this.LegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * -3.0F * limbSwingAmount * 0.5F + 0.645F;
            this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * 1.5F * limbSwingAmount * 0.5F - 0.331F;
            this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F - 0.309F;
            this.LegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * 3.0F * limbSwingAmount * 0.5F + 0.645F;
            this.Right.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * -1.5F * limbSwingAmount * 0.5F - 0.331F;
            this.Chest.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F + (float) Math.PI) * degree * 0.15F * limbSwingAmount * 0.5F + 0.226F;
            this.Body.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + (float) Math.PI) * degree * -0.17F * limbSwingAmount * 0.5F - 0.087F;
            this.Tail1.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F + (float) Math.PI) * degree * 0.3F * limbSwingAmount * 0.5F - 0.715F;
            this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + (float) Math.PI) * degree * 0.1F * limbSwingAmount * 0.5F + 0.349F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.0F + (float) Math.PI) * degree * 0.0F * limbSwingAmount * 0.5F - 0.723F;

        }
    }
}