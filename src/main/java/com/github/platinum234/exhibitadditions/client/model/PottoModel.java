package com.github.platinum234.exhibitadditions.client.model;

import com.github.platinum234.exhibitadditions.entity.PottoEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class PottoModel extends ZawaBaseModel<PottoEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends PottoModel {
        public ModelPart Body;
        public ModelPart ArmLeft;
        public ModelPart Neck;
        public ModelPart ArmLeft_1;
        public ModelPart Hips;
        public ModelPart Tail;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart Head;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Snout;
        public ModelPart Nose;
        public ModelPart ForearmRight;
        public ModelPart HandRight;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.Body = this.Chest.getChild("Body");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.ArmLeft_1 = this.Chest.getChild("ArmLeft_1");
            this.Head = this.Neck.getChild("Head");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.ForearmRight = this.ArmLeft_1.getChild("ForearmRight");
            this.Neck = this.Chest.getChild("Neck");
            this.Tail = this.Hips.getChild("Tail");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.Snout = this.Head.getChild("Snout");
            this.Hips = this.Body.getChild("Hips");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.ArmLeft = this.Chest.getChild("ArmLeft");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.EarRight = this.Head.getChild("EarRight");
            this.Nose = this.Head.getChild("Nose");
            this.HandRight = this.ForearmRight.getChild("HandRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.6F, 1.2F, 1.2F, -0.2001892698642815F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 7).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -1.5F, 0.1F, 0.04555309164612875F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(33, 7).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offset(-0.1F, 2.1F, -0.9F));
            partDefinition.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(7, 24).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 2.7F, -0.9F, 0.47036624672827726F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmLeft_1", CubeListBuilder.create().texOffs(14, 0).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.0F, 0.5F, -0.3F, 0.0F, 0.0F, 0.3642502295386026F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.2F, -0.07452555872726274F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(0, 20).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.6F, 1.2F, 1.2F, -0.2001892698642815F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(8, 16).mirror(true).addBox(-1.0F, -0.2F, -1.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.2F, 1.5F, 0.4F, 0.0F, 0.0F, -0.3186971254089062F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(34, 1).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -1.3F, 0.05235987755982988F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(18, 17).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.3F, 1.8F, -1.242674374156741F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(0, 28).addBox(0.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.8F, 2.5F, 0.8F, -0.26616271092913524F, 0.0F, -0.004014257352407769F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(1, 16).addBox(-1.0F, 0.0F, -0.9F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.7F, -1.2F, 0.1464331302344367F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(19, 9).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 3.7F, -0.1408480653096202F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(7, 24).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 2.7F, -0.9F, 0.47036624672827726F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(8, 16).addBox(-1.0F, -0.2F, -1.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.2F, 1.5F, 0.4F, 0.0F, 0.0F, 0.3186971254089062F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(14, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.0F, 0.5F, -0.3F, 0.0F, 0.0F, -0.3642502295386026F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(0, 28).mirror(true).addBox(-0.9F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.5F, 0.8F, -0.26616271092913524F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.0F, 0.3F, -0.3F, 0.0F, 0.2617993877991494F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(23, 0).mirror(true).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, 0.3F, -0.3F, 0.0F, -0.3490658503988659F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(22, 3).addBox(-2.0F, -1.5F, -1.5F, 4.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 19.2F, -1.5F, 0.03700097814490897F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(15, 6).addBox(-0.5F, -0.6F, -0.7F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.2F, -0.9F, -0.7086036496780869F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(33, 7).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offset(0.1F, 2.1F, -0.9F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(PottoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Tail.xRot = Mth.cos(5.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isHeld ? -1.2F : -1.24F);
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F - 0.052F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 0.6f;
            this.ArmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F;
            this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
            this.ArmLeft_1.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F;
            this.HandRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F;

            this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.2F;
            this.LegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.47F;
            this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.27F;
            this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.2F;
            this.LegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.47F;
            this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.27F;

            this.Chest.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.15F * limbSwingAmount * 0.5F + (this.isSwimming ? -0.2F : 0.037F);
            this.Body.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * -0.17F * limbSwingAmount * 0.5F + 0.046F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F + 0.052F;
            this.Tail.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : -1.24F);

        }
    }

    public static class Child extends PottoModel {
        public ModelPart Body;
        public ModelPart ArmLeft;
        public ModelPart Neck;
        public ModelPart ArmLeft_1;
        public ModelPart Hips;
        public ModelPart Tail;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart Head;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Snout;
        public ModelPart Nose;
        public ModelPart ForearmRight;
        public ModelPart HandRight;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.Body = this.Chest.getChild("Body");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.ArmLeft_1 = this.Chest.getChild("ArmLeft_1");
            this.Head = this.Neck.getChild("Head");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.ForearmRight = this.ArmLeft_1.getChild("ForearmRight");
            this.Neck = this.Chest.getChild("Neck");
            this.Tail = this.Hips.getChild("Tail");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.Snout = this.Head.getChild("Snout");
            this.Hips = this.Body.getChild("Hips");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.ArmLeft = this.Chest.getChild("ArmLeft");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.EarRight = this.Head.getChild("EarRight");
            this.Nose = this.Head.getChild("Nose");
            this.HandRight = this.ForearmRight.getChild("HandRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.6F, 1.2F, 1.2F, -0.2001892698642815F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 7).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -1.5F, 0.1F, 0.04555309164612875F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(33, 7).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offset(-0.1F, 2.1F, -0.9F));
            partDefinition.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(7, 24).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 2.7F, -0.9F, 0.47036624672827726F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmLeft_1", CubeListBuilder.create().texOffs(14, 0).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.0F, 0.5F, -0.3F, 0.0F, 0.0F, 0.3642502295386026F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.2F, -0.07452555872726274F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(0, 20).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.6F, 1.2F, 1.2F, -0.2001892698642815F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(8, 16).mirror(true).addBox(-1.0F, -0.2F, -1.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.2F, 1.5F, 0.4F, 0.0F, 0.0F, -0.3186971254089062F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(34, 1).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -1.3F, 0.05235987755982988F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(18, 17).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.3F, 1.8F, -1.242674374156741F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(0, 28).addBox(0.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.8F, 2.5F, 0.8F, -0.26616271092913524F, 0.0F, -0.004014257352407769F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(1, 16).addBox(-1.0F, 0.0F, -0.9F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.7F, -1.2F, 0.1464331302344367F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(19, 9).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 3.7F, -0.1408480653096202F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(7, 24).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 2.7F, -0.9F, 0.47036624672827726F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(8, 16).addBox(-1.0F, -0.2F, -1.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.2F, 1.5F, 0.4F, 0.0F, 0.0F, 0.3186971254089062F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(14, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.0F, 0.5F, -0.3F, 0.0F, 0.0F, -0.3642502295386026F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(0, 28).mirror(true).addBox(-0.9F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.5F, 0.8F, -0.26616271092913524F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.0F, 0.3F, -0.3F, 0.0F, 0.2617993877991494F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(23, 0).mirror(true).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, 0.3F, -0.3F, 0.0F, -0.3490658503988659F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(22, 3).addBox(-2.0F, -1.5F, -1.5F, 4.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 19.2F, -1.5F, 0.03700097814490897F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(15, 6).addBox(-0.5F, -0.6F, -0.7F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.2F, -0.9F, -0.7086036496780869F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(33, 7).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offset(0.1F, 2.1F, -0.9F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(PottoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Tail.xRot = Mth.cos(5.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isHeld ? -1.2F : -1.24F);
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F - 0.052F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 0.6f;
            this.ArmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F;
            this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
            this.ArmLeft_1.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F;
            this.HandRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F;

            this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.2F;
            this.LegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.47F;
            this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.27F;
            this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.2F;
            this.LegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.47F;
            this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.27F;

            this.Chest.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.15F * limbSwingAmount * 0.5F + (this.isSwimming ? -0.2F : 0.037F);
            this.Body.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * -0.17F * limbSwingAmount * 0.5F + 0.046F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F + 0.052F;
            this.Tail.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : -1.24F);

        }
    }
}
