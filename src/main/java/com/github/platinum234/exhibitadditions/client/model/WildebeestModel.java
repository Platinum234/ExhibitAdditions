package com.github.platinum234.exhibitadditions.client.model;

import com.github.platinum234.exhibitadditions.entity.WildebeestEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class WildebeestModel extends ZawaBaseModel<WildebeestEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends WildebeestModel {
        public ModelPart Neck;
        public ModelPart ArmBaseRight;
        public ModelPart Body;
        public ModelPart ArmBaseLeft;
        public ModelPart NeckLower;
        public ModelPart Head;
        public ModelPart Mane;
        public ModelPart NeckBeard;
        public ModelPart Snout;
        public ModelPart HornRight;
        public ModelPart HornLeft;
        public ModelPart EarRight;
        public ModelPart EarLeft;
        public ModelPart Jaw;
        public ModelPart TopSnout;
        public ModelPart Mouth;
        public ModelPart Beard;
        public ModelPart TopSnout_1;
        public ModelPart Horn2Right;
        public ModelPart Horn3Right;
        public ModelPart Horn4Right;
        public ModelPart Horn2Left;
        public ModelPart Horn3Left;
        public ModelPart Horn4Left;
        public ModelPart HeadMane;
        public ModelPart UpperArmRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart Hips;
        public ModelPart Tail1;
        public ModelPart ThighRight;
        public ModelPart ThighLeft;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart Tail4;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperArmLeft;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.EarRight = this.Head.getChild("EarRight");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.HornLeft = this.Head.getChild("HornLeft");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.Mouth = this.Jaw.getChild("Mouth");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.Hips = this.Body.getChild("Hips");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.Tail4 = this.Tail3.getChild("Tail4");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.Jaw = this.Snout.getChild("Jaw");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.Horn2Right = this.HornRight.getChild("Horn2Right");
            this.Horn2Left = this.HornLeft.getChild("Horn2Left");
            this.Horn3Left = this.Horn2Left.getChild("Horn3Left");
            this.NeckLower = this.Neck.getChild("NeckLower");
            this.HornRight = this.Head.getChild("HornRight");
            this.Mane = this.Neck.getChild("Mane");
            this.HeadMane = this.Mane.getChild("HeadMane");
            this.Body = this.Chest.getChild("Body");
            this.Head = this.Neck.getChild("Head");
            this.NeckBeard = this.NeckLower.getChild("NeckBeard");
            this.Horn3Right = this.Horn2Right.getChild("Horn3Right");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.Horn4Left = this.Horn3Left.getChild("Horn4Left");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.TopSnout_1 = this.TopSnout.getChild("TopSnout_1");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");
            this.Horn4Right = this.Horn3Right.getChild("Horn4Right");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.TopSnout = this.Snout.getChild("TopSnout");
            this.Beard = this.Jaw.getChild("Beard");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.Neck = this.Chest.getChild("Neck");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.Snout = this.Head.getChild("Snout");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -6.0F, -3.5F, 8.0F, 12.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 3.8F, -8.1F, -0.26005405188925235F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(0, 23).mirror(true).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(-1.8F, -0.3F, -1.1F, 0.3672172905985735F, -1.242674374156741F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(53, 27).mirror(true).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 7.0F, 5.0F), PartPose.offsetAndRotation(-3.0F, 1.8F, -0.4F, 0.365995532158986F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HornLeft", CubeListBuilder.create().texOffs(0, 90).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.4F, -2.5F, -1.9F, -0.17819811729441132F, -0.35185837453889574F, 0.1563815016444822F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(21, 67).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.3296997091364596F, 0.015009831816822585F, 0.024314981163992097F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(59, 55).mirror(true).addBox(-0.9F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.0F, 5.7F, 1.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(8, 122).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.2F, -4.1F, 0.18849556254433897F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(59, 47).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 5.0F, -2.5F, -0.03900000095458209F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 43).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 10.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 12.0F, -0.23599999809424999F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(78, 17).addBox(-0.5F, 0.0F, -3.0F, 4.0F, 8.0F, 6.0F), PartPose.offsetAndRotation(1.2F, 2.9F, 4.4F, 0.16899999165295476F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(21, 87).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offset(0.0F, 3.7F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(59, 55).addBox(-1.2F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offset(-0.4F, 5.7F, 1.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(0, 23).addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(1.8F, -0.3F, -1.1F, 0.3672172905985735F, 1.242674374156741F, 0.0F));
            partDefinition.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(20, 104).addBox(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 2.1F, 0.0F, -0.3122393925291412F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(85, 49).mirror(true).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.0F, 3.5F, -0.22999999602684235F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(85, 49).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.0F, 3.5F, -0.22999999602684235F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn2Right", CubeListBuilder.create().texOffs(0, 84).mirror(true).addBox(-4.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.0F, 0.6646214111173737F, -0.1563815016444822F));
            partDefinition.addOrReplaceChild("Horn2Left", CubeListBuilder.create().texOffs(0, 84).addBox(0.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 0.0F, -0.6646214111173737F, 0.1563815016444822F));
            partDefinition.addOrReplaceChild("Horn3Left", CubeListBuilder.create().texOffs(0, 79).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(4.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.5864306020384839F));
            partDefinition.addOrReplaceChild("NeckLower", CubeListBuilder.create().texOffs(32, 0).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 10.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -7.2F, -1.1F, -0.5864306020384839F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HornRight", CubeListBuilder.create().texOffs(0, 90).mirror(true).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.4F, -2.5F, -1.9F, -0.17819811729441132F, 0.35185837453889574F, -0.15620696472454113F));
            partDefinition.addOrReplaceChild("Mane", CubeListBuilder.create().texOffs(32, 15).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 9.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 1.2F, -0.0781907508222411F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HeadMane", CubeListBuilder.create().texOffs(15, 99).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -6.0F, 3.0F, -0.9773843811168246F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 19).addBox(-4.5F, 0.0F, 0.0F, 9.0F, 12.0F, 12.0F), PartPose.offsetAndRotation(0.0F, -5.0F, 0.8F, 0.24399702143932397F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 103).addBox(-2.5F, -2.5F, -4.5F, 5.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -6.3F, 0.8F, -1.2487831330651644F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("NeckBeard", CubeListBuilder.create().texOffs(42, 15).addBox(-1.0F, 0.0F, -5.0F, 2.0F, 9.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, 0.3127630032889644F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn3Right", CubeListBuilder.create().texOffs(0, 79).mirror(true).addBox(-0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-4.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5864306020384839F));
            partDefinition.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(82, 36).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(1.5F, 8.0F, -2.0F, 0.31899999340387547F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(59, 47).addBox(-1.5F, 0.0F, 0.0F, 2.0F, 6.0F, 2.0F), PartPose.offsetAndRotation(0.5F, 5.0F, -2.5F, -0.03900000095458209F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn4Left", CubeListBuilder.create().texOffs(0, 72).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.055749693826142F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(85, 65).addBox(-1.1F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.0F, 7.9F, -2.0F));
            partDefinition.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(57, 39).mirror(true).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 7.0F, 1.5F, -0.06499999742978094F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TopSnout_1", CubeListBuilder.create().texOffs(20, 121).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.319744313639039F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(78, 17).mirror(true).addBox(-3.5F, 0.0F, -3.0F, 4.0F, 8.0F, 6.0F), PartPose.offsetAndRotation(-1.2F, 2.9F, 4.4F, 0.16899999165295476F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(85, 65).mirror(true).addBox(-0.9F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.0F, 7.9F, -2.0F));
            partDefinition.addOrReplaceChild("Horn4Right", CubeListBuilder.create().texOffs(0, 72).mirror(true).addBox(-0.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.9382889765773795F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(53, 27).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 7.0F, 5.0F), PartPose.offsetAndRotation(3.0F, 1.8F, -0.4F, 0.365995532158986F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(20, 115).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -6.3F, 0.46216317793861517F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Beard", CubeListBuilder.create().texOffs(58, 16).addBox(-0.5F, -0.8F, -2.0F, 1.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, -0.35185837453889574F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(57, 39).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 7.0F, 1.5F, -0.06499999742978094F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(48, 0).addBox(-2.0F, -8.0F, -2.5F, 4.0F, 10.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -3.0F, -3.8F, 1.7484708499742416F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(82, 36).mirror(true).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(-1.5F, 8.0F, -2.0F, 0.31899999340387547F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 114).addBox(-2.0F, 0.0F, -6.5F, 4.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -0.4F, -3.2F, 0.6839945098881279F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(19, 74).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 5.8F, -0.5F, -0.06947778239118053F, 0.0F, -0.03744728233171422F));
            partDefinition.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(19, 81).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F), PartPose.offset(0.0F, 5.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 128, 128);
        }

        @Override
        public void setupAnim(WildebeestEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 1.327F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.8F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F - 1.327F;

            this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.3F;
            this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.095F;
            this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (entity.isSprinting()) {
                float speed = 0.8f;
                float degree = 0.5f;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F + 1.8F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 1.327F;
                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1F) * 0.5F + 0.3F;
                this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree) * 0.5F - 0.095F;
                this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F + 4.2F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.26F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.244F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.236F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F + 0.366F;
                this.UpperArmLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.065F;
                this.ArmLeft.xRot = Mth.cos(2F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F - 0.039F;
                this.HandLeft.xRot = Mth.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F + 0.366F;
                this.UpperArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.065F;
                this.ArmRight.xRot = Mth.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F - 0.039F;
                this.HandRight.xRot = Mth.cos(4F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.169F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.319F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.23F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.169F;
                this.UpperLegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.319F;
                this.LowerLegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.23F;
                this.FootRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;

            } else {
                float speed = 1.5f;
                float degree = 0.6f;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.8F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 1.327F;
                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.3F;
                this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.095F;
                this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 4.2F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.26F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.244F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.236F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.366F;
                this.UpperArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.065F;
                this.ArmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F - 0.039F;
                this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.366F;
                this.UpperArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.065F;
                this.ArmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F - 0.039F;
                this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.169F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.319F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.23F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.169F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.319F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.23F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }

    public static class Child extends WildebeestModel {
        public ModelPart Body;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart Neck;
        public ModelPart Hips;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail1;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart Tail2;
        public ModelPart UpperArmLeft;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart UpperArmRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart NeckLower;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart Jaw;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart TopSnout;
        public ModelPart Mouth;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Hips = this.Body.getChild("Hips");
            this.Body = this.Chest.getChild("Body");
            this.Neck = this.Chest.getChild("Neck");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.NeckLower = this.Neck.getChild("NeckLower");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.Snout = this.Head.getChild("Snout");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.Jaw = this.Head.getChild("Jaw");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.FootRight = this.LowerLegRight.getChild("FootRight");
            this.EarRight = this.Head.getChild("EarRight");
            this.Mouth = this.Jaw.getChild("Mouth");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.TopSnout = this.Snout.getChild("TopSnout");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.Head = this.Neck.getChild("Head");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(20, 18).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 9.0F, -0.296705972839036F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 8.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -3.2F, 0.1F, 0.24434609527920614F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(22, 1).addBox(-1.5F, -2.0F, -3.5F, 3.0F, 4.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -1.7F, -2.0F, -0.2617993877991494F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(0, 55).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.1F, 4.8F, 0.5F));
            partDefinition.addOrReplaceChild("NeckLower", CubeListBuilder.create().texOffs(38, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 1.1F, -2.5F, -0.20943951023931953F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(0, 30).mirror(true).addBox(-1.5F, 0.0F, -1.8F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(1.8F, 1.5F, -0.3F, 0.296705972839036F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(55, 0).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F), PartPose.offsetAndRotation(0.01F, 5.0F, 2.4F, -0.4799655442984406F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(16, 30).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F), PartPose.offsetAndRotation(1.9F, 2.3F, 3.2F, 0.3665191429188092F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(0, 47).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 2.0F), PartPose.offset(0.01F, 3.8F, -2.5F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(37, 17).addBox(-1.5F, -1.0F, -3.5F, 3.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.3F, -2.1F, 0.7330382858376184F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(34, 30).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.5F, 0.0F, 0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(0, 47).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 2.0F), PartPose.offset(-0.01F, 3.8F, -2.5F));
            partDefinition.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(52, 28).addBox(-1.0F, -1.0F, -3.5F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 1.1F, -0.6F, 0.46914448828868976F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(55, 0).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F), PartPose.offsetAndRotation(-0.01F, 5.0F, 2.4F, -0.4799655442984406F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(0, 55).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.1F, 5.0F, -1.6F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(54, 11).mirror(true).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-1.8F, -1.2F, 1.0F, 0.3672172905985735F, -1.242674374156741F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(44, 29).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -3.0F, 0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(30, 30).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 5.5F, 0.33161255787892263F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(42, 23).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -0.5F, -2.5F, 0.2738421523142173F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(54, 20).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 7.0F, -1.3F, 0.4363323129985824F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(0, 30).addBox(-1.5F, 0.0F, -1.8F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(-1.8F, 1.5F, -0.3F, 0.296705972839036F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(0, 55).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offset(-0.1F, 4.8F, 0.5F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(0, 55).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offset(-0.1F, 5.0F, -1.6F));
            partDefinition.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(0, 40).mirror(true).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.8F, 1.7F, -0.03490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 18).addBox(-2.5F, -3.5F, -2.5F, 5.0F, 7.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 6.4F, -5.0F, -0.2617993877991494F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(54, 11).addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(1.8F, -1.2F, 1.0F, 0.3672172905985735F, 1.242674374156741F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(16, 30).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F), PartPose.offsetAndRotation(-1.9F, 2.3F, 3.2F, 0.3665191429188092F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(0, 40).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.8F, 1.7F, -0.03490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(54, 20).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 7.0F, -1.3F, 0.4363323129985824F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(38, 8).addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.4F, -4.0F, 0.5235987755982988F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(WildebeestEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.523F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.261F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.523F;

            this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.331F;
            this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.2f;
            float degree = 0.8f;
            this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.15F) * 0.5F - 0.261F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.523F;
            this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 6.4F;
            this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.261F;
            this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.244F;
            this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.296F;
            this.UpperArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.034F;
            this.ArmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F;
            this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
            this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.9F) * 0.5F + 0.296F;
            this.UpperArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.034F;
            this.ArmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F;
            this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
            this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.366F;
            this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.436F;
            this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.479F;
            this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
            this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.366F;
            this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.436F;
            this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.479F;
            this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;

        }
    }
}
