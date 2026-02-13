package com.github.platinum234.exhibitadditions.client.model;

import com.github.platinum234.exhibitadditions.entity.HyraxEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class HyraxModel extends ZawaBaseModel<HyraxEntity> {
    public ModelPart Hips;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Hips);
        }

        return this.parts;
    }

    public static class Adult extends HyraxModel {
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Hips_1;
        public ModelPart Body;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart Neck;
        public ModelPart Belly;
        public ModelPart ArmLeft;
        public ModelPart ArmRight;
        public ModelPart Head;
        public ModelPart LowerNeck;
        public ModelPart SnoutRight;
        public ModelPart Nose;
        public ModelPart Mouth;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart CheekLeft;
        public ModelPart CheekRight;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart ForearmRight;
        public ModelPart HandRight;

        public Adult(ModelPart root) {
            this.Hips = root.getChild("Hips");
            this.Body = this.Hips.getChild("Body");
            this.Belly = this.Body.getChild("Belly");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.EarRight = this.Head.getChild("EarRight");
            this.ArmRight = this.Body.getChild("ArmRight");
            this.Head = this.Neck.getChild("Head");
            this.CheekRight = this.Head.getChild("CheekRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.LowerNeck = this.Neck.getChild("LowerNeck");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.SnoutRight = this.Head.getChild("SnoutRight");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.Neck = this.Body.getChild("Neck");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.HandRight = this.ForearmRight.getChild("HandRight");
            this.CheekLeft = this.Head.getChild("CheekLeft");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
            this.Mouth = this.Head.getChild("Mouth");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.Nose = this.Head.getChild("Nose");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.Hips_1 = this.Hips.getChild("Hips_1");
            this.ArmLeft = this.Body.getChild("ArmLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, -3.5F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.3F, -2.5F, 0.27314402127920984F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Belly", CubeListBuilder.create().texOffs(20, 27).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 3.5F, -2.8F, -0.3186971254089062F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(27, 4).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.4F, 0.5F, -0.3186971254089062F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(12, 27).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, -1.0F, 0.7F, 0.8204792520677623F, -1.2747885016356248F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(26, 0).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.3F, 2.1F, -2.0F, -0.04555309164612875F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 23).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.0F, -1.0F, 0.6244787850582824F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("CheekRight", CubeListBuilder.create().texOffs(18, 13).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-1.0F, 0.6F, 0.01F, 0.0F, 0.0F, 0.0911061832922575F));
            partDefinition.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(16, 6).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 2.0F, -1.0F, 0.5462880425584197F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerNeck", CubeListBuilder.create().texOffs(12, 23).addBox(-1.0F, 0.1F, -1.5F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.5F, 0.0F, 0.2275909337942703F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(27, 4).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.4F, 0.5F, -0.3186971254089062F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(22, 6).addBox(-1.0F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.49F, 2.5F, 0.7F, -0.5462880425584197F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(16, 0).mirror(true).addBox(-1.0F, -0.3F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offset(-1.9F, -0.1F, 0.3F));
            partDefinition.addOrReplaceChild("SnoutRight", CubeListBuilder.create().texOffs(6, 29).mirror(true).addBox(-0.8F, -0.5F, -1.5F, 2.02F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.21F, 0.0F, -1.0F, 0.13665927909957545F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(16, 6).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 2.0F, -1.0F, 0.5462880425584197F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(12, 17).addBox(-1.0F, -0.8F, -0.9F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.7F, -3.3F, -0.7740534966278743F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(16, 0).addBox(-1.0F, -0.3F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offset(1.9F, -0.1F, 0.3F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(31, 4).mirror(true).addBox(-1.0F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.49F, 2.5F, -0.5F, 0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("CheekLeft", CubeListBuilder.create().texOffs(18, 13).mirror(true).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(1.0F, 0.6F, 0.01F, 0.0F, 0.0F, -0.0911061832922575F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(31, 4).addBox(-1.0F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.49F, 2.5F, -0.5F, 0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(12, 29).addBox(-1.0F, -0.5F, -1.4F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.9F, -0.9F, -0.04555309164612875F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(22, 6).mirror(true).addBox(-1.0F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.49F, 2.5F, 0.7F, -0.5462880425584197F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 8).addBox(-2.5F, -2.5F, -2.0F, 5.0F, 4.8F, 4.0F), PartPose.offsetAndRotation(0.0F, 19.4F, 1.7F, 0.008726646259971648F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, -0.7F, -2.6F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.8F, -0.02F, 0.3186971254089062F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(12, 27).mirror(true).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.0F, -1.0F, 0.7F, 0.8204792520677623F, 1.2747885016356248F, 0.0F));
            partDefinition.addOrReplaceChild("Hips_1", CubeListBuilder.create().texOffs(0, 17).addBox(-2.0F, -0.5F, 0.0F, 4.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 1.5F, -0.4098033003787853F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(26, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.3F, 2.1F, -2.0F, -0.04555309164612875F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 48, 32);
        }

        @Override
        public void setupAnim(HyraxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.62F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Head.xRot = Mth.cos(0.5F + limbSwing * speed * 0.05F) * degree * -0.1F * limbSwingAmount + 0.62F;
            this.EarLeft.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.82F;
            this.EarRight.xRot = Mth.cos(-1.5F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.82F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.05F) * degree * 0.1F * limbSwingAmount - 0.77F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 6.0f, degree = 0.8f;
            this.ArmLeft.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.04F;
            this.ForearmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.31F;
            this.HandLeft.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount - 0.09F;
            this.ThighLeft.xRot = Mth.cos(1.5F + limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount;
            this.LegLeft.xRot = Mth.cos(-0.5F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount + 0.54F;
            this.FootLeft.xRot = Mth.cos(-2.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.54F;
            this.ThighRight.xRot = Mth.cos(1.5F + limbSwing * speed * 0.1F) * degree * -1.5F * limbSwingAmount;
            this.LegRight.xRot = Mth.cos(-0.5F + limbSwing * speed * 0.1F) * degree * -0.8F * limbSwingAmount + 0.54F;
            this.FootRight.xRot = Mth.cos(-2.5F + limbSwing * speed * -0.1F) * degree * -1.0F * limbSwingAmount - 0.54F;
            this.ArmRight.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount - 0.04F;
            this.ForearmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount - 0.31F;
            this.HandRight.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.09F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount - 0.77F;
            this.Head.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.62F;
            this.EarLeft.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.82F;
            this.EarRight.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.82F;
            this.Hips.y = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.8F * limbSwingAmount + 19.4F;
        }
    }


    public static class Child extends HyraxModel {
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Hips_1;
        public ModelPart Body;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart Neck;
        public ModelPart Belly;
        public ModelPart ArmLeft;
        public ModelPart ArmRight;
        public ModelPart Head;
        public ModelPart LowerNeck;
        public ModelPart SnoutRight;
        public ModelPart Nose;
        public ModelPart Mouth;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart CheekLeft;
        public ModelPart CheekRight;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart ForearmRight;
        public ModelPart HandRight;

        public Child(ModelPart root) {
            this.Hips = root.getChild("Hips");
            this.Body = this.Hips.getChild("Body");
            this.Belly = this.Body.getChild("Belly");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.EarRight = this.Head.getChild("EarRight");
            this.ArmRight = this.Body.getChild("ArmRight");
            this.Head = this.Neck.getChild("Head");
            this.CheekRight = this.Head.getChild("CheekRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.LowerNeck = this.Neck.getChild("LowerNeck");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.SnoutRight = this.Head.getChild("SnoutRight");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.Neck = this.Body.getChild("Neck");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.HandRight = this.ForearmRight.getChild("HandRight");
            this.CheekLeft = this.Head.getChild("CheekLeft");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
            this.Mouth = this.Head.getChild("Mouth");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.Nose = this.Head.getChild("Nose");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.Hips_1 = this.Hips.getChild("Hips_1");
            this.ArmLeft = this.Body.getChild("ArmLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, -3.5F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.3F, -2.5F, 0.27314402127920984F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Belly", CubeListBuilder.create().texOffs(20, 27).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 3.5F, -2.8F, -0.3186971254089062F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(27, 4).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.4F, 0.5F, -0.3186971254089062F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(12, 27).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, -1.0F, 0.7F, 0.8204792520677623F, -1.2747885016356248F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(26, 0).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.3F, 2.1F, -2.0F, -0.04555309164612875F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 23).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.0F, -1.0F, 0.6244787850582824F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("CheekRight", CubeListBuilder.create().texOffs(18, 13).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-1.0F, 0.6F, 0.01F, 0.0F, 0.0F, 0.0911061832922575F));
            partDefinition.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(16, 6).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 2.0F, -1.0F, 0.5462880425584197F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerNeck", CubeListBuilder.create().texOffs(12, 23).addBox(-1.0F, 0.1F, -1.5F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.5F, 0.0F, 0.2275909337942703F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(27, 4).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.4F, 0.5F, -0.3186971254089062F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(22, 6).addBox(-1.0F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.49F, 2.5F, 0.7F, -0.5462880425584197F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(16, 0).mirror(true).addBox(-1.0F, -0.3F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offset(-1.9F, -0.1F, 0.3F));
            partDefinition.addOrReplaceChild("SnoutRight", CubeListBuilder.create().texOffs(6, 29).mirror(true).addBox(-0.8F, -0.5F, -1.5F, 2.02F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.21F, 0.0F, -1.0F, 0.13665927909957545F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(16, 6).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 2.0F, -1.0F, 0.5462880425584197F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(12, 17).addBox(-1.0F, -0.8F, -0.9F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.7F, -3.3F, -0.7740534966278743F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(16, 0).addBox(-1.0F, -0.3F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offset(1.9F, -0.1F, 0.3F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(31, 4).mirror(true).addBox(-1.0F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.49F, 2.5F, -0.5F, 0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("CheekLeft", CubeListBuilder.create().texOffs(18, 13).mirror(true).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(1.0F, 0.6F, 0.01F, 0.0F, 0.0F, -0.0911061832922575F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(31, 4).addBox(-1.0F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.49F, 2.5F, -0.5F, 0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(12, 29).addBox(-1.0F, -0.5F, -1.4F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.9F, -0.9F, -0.04555309164612875F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(22, 6).mirror(true).addBox(-1.0F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.49F, 2.5F, 0.7F, -0.5462880425584197F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 8).addBox(-2.5F, -2.5F, -2.0F, 5.0F, 4.8F, 4.0F), PartPose.offsetAndRotation(0.0F, 19.4F, 1.7F, 0.008726646259971648F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, -0.7F, -2.6F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.8F, -0.02F, 0.3186971254089062F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(12, 27).mirror(true).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.0F, -1.0F, 0.7F, 0.8204792520677623F, 1.2747885016356248F, 0.0F));
            partDefinition.addOrReplaceChild("Hips_1", CubeListBuilder.create().texOffs(0, 17).addBox(-2.0F, -0.5F, 0.0F, 4.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 1.5F, -0.4098033003787853F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(26, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.3F, 2.1F, -2.0F, -0.04555309164612875F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 48, 32);
        }

        @Override
        public void setupAnim(HyraxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.62F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Head.xRot = Mth.cos(0.5F + limbSwing * speed * 0.05F) * degree * -0.1F * limbSwingAmount + 0.62F;
            this.EarLeft.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.82F;
            this.EarRight.xRot = Mth.cos(-1.5F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.82F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.05F) * degree * 0.1F * limbSwingAmount - 0.77F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 6.0f, degree = 0.8f;
            this.ArmLeft.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.04F;
            this.ForearmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.31F;
            this.HandLeft.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount - 0.09F;
            this.ThighLeft.xRot = Mth.cos(1.5F + limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount;
            this.LegLeft.xRot = Mth.cos(-0.5F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount + 0.54F;
            this.FootLeft.xRot = Mth.cos(-2.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.54F;
            this.ThighRight.xRot = Mth.cos(1.5F + limbSwing * speed * 0.1F) * degree * -1.5F * limbSwingAmount;
            this.LegRight.xRot = Mth.cos(-0.5F + limbSwing * speed * 0.1F) * degree * -0.8F * limbSwingAmount + 0.54F;
            this.FootRight.xRot = Mth.cos(-2.5F + limbSwing * speed * -0.1F) * degree * -1.0F * limbSwingAmount - 0.54F;
            this.ArmRight.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount - 0.04F;
            this.ForearmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount - 0.31F;
            this.HandRight.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.09F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount - 0.77F;
            this.Head.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.62F;
            this.EarLeft.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.82F;
            this.EarRight.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.82F;
            this.Hips.y = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.8F * limbSwingAmount + 19.4F;
        }
    }
}
