package com.github.platinum234.exhibitadditions.client.model;

import com.github.platinum234.exhibitadditions.entity.PronghornEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class PronghornModel extends ZawaBaseModel<PronghornEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends PronghornModel {
        public ModelPart Body;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart Neck;
        public ModelPart Hips;
        public ModelPart ThighLeft;
        public ModelPart Tail;
        public ModelPart ThighRight;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart UpperArmLeft;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart UpperArmRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart Head;
        public ModelPart LowerNeck;
        public ModelPart Snout;
        public ModelPart Mouth;
        public ModelPart EarLeft;
        public ModelPart Horn1Left;
        public ModelPart EarRight;
        public ModelPart Horn1Right;
        public ModelPart Nose;
        public ModelPart Horn2Left;
        public ModelPart Horn3Left;
        public ModelPart Horn5Left;
        public ModelPart Horn4Left;
        public ModelPart Horn6Left;
        public ModelPart Horn2Right;
        public ModelPart Horn3Right;
        public ModelPart Horn5Right;
        public ModelPart Horn4Right;
        public ModelPart Horn6Right;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Horn1Right = this.Head.getChild("Horn1Right");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.Tail = this.Hips.getChild("Tail");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.Head = this.Neck.getChild("Head");
            this.Horn4Left = this.Horn3Left.getChild("Horn4Left");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.EarRight = this.Head.getChild("EarRight");
            this.Horn3Right = this.Horn2Right.getChild("Horn3Right");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.Horn4Right = this.Horn3Right.getChild("Horn4Right");
            this.Horn6Right = this.Horn5Right.getChild("Horn6Right");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");
            this.FootRight = this.LowerLegRight.getChild("FootRight");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.Horn5Right = this.Horn2Right.getChild("Horn5Right");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.Nose = this.Snout.getChild("Nose");
            this.Hips = this.Body.getChild("Hips");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.Horn1Left = this.Head.getChild("Horn1Left");
            this.Horn5Left = this.Horn2Left.getChild("Horn5Left");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.Body = this.Chest.getChild("Body");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.Mouth = this.Head.getChild("Mouth");
            this.Horn6Left = this.Horn5Left.getChild("Horn6Left");
            this.Horn3Left = this.Horn2Left.getChild("Horn3Left");
            this.Horn2Right = this.Horn1Right.getChild("Horn2Right");
            this.Neck = this.Chest.getChild("Neck");
            this.LowerNeck = this.Neck.getChild("LowerNeck");
            this.Horn2Left = this.Horn1Left.getChild("Horn2Left");
            this.Snout = this.Head.getChild("Snout");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("Horn1Right", CubeListBuilder.create().texOffs(8, 29).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.5F, -2.0F, -0.8F, 0.4098033003787853F, 0.0F, -0.500909508638178F));
            partDefinition.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(19, 54).mirror(true).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.9F, -0.5F, 0.8196066007575706F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(50, 52).addBox(-1.0F, -0.6F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 4.5F, -0.8651597048872669F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(0, 49).mirror(true).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 8.0F, 5.0F), PartPose.offset(-2.1F, 1.5F, 2.3F));
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(22, 34).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(-2.0F, -1.3F, -0.7F, 0.2275909337942703F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 34).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 2.0F, -3.5F, 1.0016444470669013F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn4Left", CubeListBuilder.create().texOffs(15, 32).mirror(true).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 1.6F, -0.45535640450848164F, -0.45535640450848164F, 0.0F));
            partDefinition.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(37, 35).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 5.8F, 1.0F, -0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(46, 35).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F), PartPose.offset(0.01F, 3.8F, -2.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(0, 29).mirror(true).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-1.5F, 0.0F, 1.0F, 0.13665927909957545F, 0.6373942508178124F, -0.6373942508178124F));
            partDefinition.addOrReplaceChild("Horn3Right", CubeListBuilder.create().texOffs(16, 36).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.01F, -0.5F, -0.5F, 0.591841146688116F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(22, 34).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(2.0F, -1.3F, -0.7F, 0.2275909337942703F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn4Right", CubeListBuilder.create().texOffs(15, 32).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 1.6F, -0.45535640450848164F, 0.45535640450848164F, 0.0F));
            partDefinition.addOrReplaceChild("Horn6Right", CubeListBuilder.create().texOffs(22, 35).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.01F, -1.5F, 0.0F, -0.45535640450848164F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(55, 37).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 6.0F, -1.4F, 0.18203784630933073F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(55, 37).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 6.0F, -1.4F, 0.18203784630933073F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(37, 35).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 5.8F, 1.0F, -0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn5Right", CubeListBuilder.create().texOffs(16, 36).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.01F, -0.5F, -0.5F, -0.591841146688116F, -0.45535640450848164F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(55, 37).mirror(true).addBox(-1.0F, -0.0F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.1F, 2.9F, 0.8F));
            partDefinition.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(26, 44).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, 0.27314402127920984F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 16).addBox(-2.5F, -0.5F, 0.0F, 5.0F, 8.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 5.5F, -0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(32, 53).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F), PartPose.offsetAndRotation(0.05F, 3.5F, 1.5F, -0.956091342937205F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn1Left", CubeListBuilder.create().texOffs(8, 29).mirror(true).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.5F, -2.0F, -0.8F, 0.4098033003787853F, 0.0F, 0.500909508638178F));
            partDefinition.addOrReplaceChild("Horn5Left", CubeListBuilder.create().texOffs(16, 36).mirror(true).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.01F, -0.5F, -0.5F, -0.591841146688116F, 0.45535640450848164F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(0, 29).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(1.5F, 0.0F, 1.0F, 0.13665927909957545F, -0.6373942508178124F, 0.6373942508178124F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(46, 35).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F), PartPose.offset(-0.01F, 3.8F, -2.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(27, 1).addBox(-3.0F, -0.5F, -1.0F, 6.0F, 8.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -3.5F, 2.5F, 0.18203784630933073F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(55, 37).addBox(-1.0F, -0.0F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offset(-0.1F, 2.9F, 0.8F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -4.0F, -3.0F, 5.0F, 8.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 11.0F, -6.1F, -0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(19, 54).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 6.0F, -0.5F, 0.8196066007575706F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(32, 53).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F), PartPose.offsetAndRotation(-0.05F, 3.5F, 1.5F, -0.956091342937205F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(0, 49).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 8.0F, 5.0F), PartPose.offset(2.0F, 1.5F, 2.3F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(15, 45).addBox(-1.0F, -0.5F, -3.3F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.0F, -1.5F, 0.04555309164612875F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn6Left", CubeListBuilder.create().texOffs(22, 35).mirror(true).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.01F, -1.5F, 0.0F, 0.45535640450848164F, 0.0F));
            partDefinition.addOrReplaceChild("Horn3Left", CubeListBuilder.create().texOffs(16, 36).mirror(true).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.01F, -0.5F, -0.5F, 0.591841146688116F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn2Right", CubeListBuilder.create().texOffs(16, 39).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, -2.8F, 0.01F, 0.0F, 0.0F, 0.3642502295386026F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(31, 17).addBox(-1.5F, -1.0F, -4.4F, 3.0F, 4.0F, 8.0F), PartPose.offsetAndRotation(0.0F, -3.5F, -2.5F, -0.8196066007575706F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerNeck", CubeListBuilder.create().texOffs(17, 22).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 2.9F, 0.0F, -0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn2Left", CubeListBuilder.create().texOffs(16, 39).mirror(true).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.1F, -2.8F, 0.01F, 0.0F, 0.0F, -0.3642502295386026F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 43).addBox(-1.5F, -1.0F, -3.5F, 3.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -1.8F, 0.27314402127920984F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(PronghornEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.00F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.819F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 1.00F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.7f;
            float degree = 0.6f;
            this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.819F;
            this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 1.00F;
            this.Chest.y = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 11.0F;
            this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.139F;
            this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.182F;
            this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.091F;

            this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.228F;
            this.UpperArmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.087F;
            this.ArmLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F;
            this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
            this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.228F;
            this.UpperArmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.087F;
            this.ArmRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F;
            this.HandRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;

            this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F;
            this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.819F;
            this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.956F;
            this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.182F;
            this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F;
            this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.819F;
            this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.956F;
            this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.182F;
        }
    }

    public static class Child extends PronghornModel {
        public ModelPart Body;
        public ModelPart Neck;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart Head;
        public ModelPart NeckBottom;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Snout;
        public ModelPart TopSnout;
        public ModelPart Mouth;
        public ModelPart UpperArmLeft;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart UpperArmRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.TopSnout = this.Snout.getChild("TopSnout");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.NeckBottom = this.Neck.getChild("NeckBottom");
            this.Mouth = this.Snout.getChild("Mouth");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.Neck = this.Chest.getChild("Neck");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.Tail = this.Body.getChild("Tail");
            this.Snout = this.Head.getChild("Snout");
            this.ThighRight = this.Body.getChild("ThighRight");
            this.Body = this.Chest.getChild("Body");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.EarRight = this.Head.getChild("EarRight");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.Head = this.Neck.getChild("Head");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(24, 1).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.7F, -0.1F, 0.4098033003787853F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(10, 21).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.05F, 3.0F, 1.7F, -0.767944870877505F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(6, 30).mirror(true).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.1F, 3.7F, -0.7F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(15, 22).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.1F, 0.2F, -1.0F, 0.3490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("NeckBottom", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, -2.0F, -1.3F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, -0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.4F, 0.1F, -0.04555309164612875F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(0, 27).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.5F, -1.2F, 0.6632251157578453F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(26, 28).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(1.0F, -0.5F, 0.6F, 0.0F, -0.4098033003787853F, 0.7740534966278743F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(16, 27).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offset(-0.05F, 2.0F, -1.0F));
            partDefinition.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.5F, -1.2F, 0.6632251157578453F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(21, 29).mirror(true).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offset(-0.1F, 2.5F, 0.3F));
            partDefinition.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(10, 21).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-0.05F, 3.0F, 1.7F, -0.767944870877505F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, 0.9105382388075086F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(15, 22).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.1F, 0.2F, -1.0F, 0.3490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(6, 30).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 3.7F, -0.7F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(24, 23).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.8F, 0.5F, -0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(13, 0).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 15.9F, -2.5F, -0.2275909337942703F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(9, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 5.5F, 0.45535640450848164F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(24, 5).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-1.4F, 1.3F, 4.5F, -0.05235987755982988F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 9).addBox(-2.0F, -0.5F, -1.0F, 4.0F, 4.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -1.5F, 0.0F, 0.2275909337942703F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(24, 23).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.8F, 0.5F, -0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(26, 28).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, -0.5F, 0.6F, 0.0F, 0.4098033003787853F, -0.7740534966278743F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(21, 29).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.1F, 2.5F, 0.3F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(0, 21).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(1.4F, 1.3F, 4.5F, -0.05235987755982988F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(19, 9).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.6F, -1.0F, -0.591841146688116F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(16, 27).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offset(0.05F, 2.0F, -1.0F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(PronghornEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.59F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.91F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F - 0.59F;

            this.Tail.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.46F;
            this.Tail.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.2f;
            float degree = 0.8f;
            this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.15F) * 0.5F + 0.91F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.59F;
            this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 15.9F;
            this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.23F;
            this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.23F;
            this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.35F;
            this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F + 0.0F;
            this.UpperArmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.09F;
            this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F + 0.0F;
            this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.9F) * 0.5F + 0.35F;
            this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F + 0.0F;
            this.UpperArmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.09F;
            this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F + 0.0F;
            this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F - 0.05F;
            this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.66F;
            this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.77F;
            this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
            this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F - 0.05F;
            this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.66F;
            this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.77F;
            this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;

        }
    }
}

