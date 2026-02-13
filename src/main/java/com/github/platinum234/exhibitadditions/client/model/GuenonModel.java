package com.github.platinum234.exhibitadditions.client.model;

import com.github.platinum234.exhibitadditions.entity.GuenonEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class GuenonModel extends ZawaBaseModel<GuenonEntity> {
    public ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends GuenonModel {
        public ModelPart ArmLeft;
        public ModelPart ArmLeft_1;
        public ModelPart Neck;
        public ModelPart Hips;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart ThumbLeft;
        public ModelPart ForearmLeft_1;
        public ModelPart HandLeft_1;
        public ModelPart ThumbLeft_1;
        public ModelPart Head;
        public ModelPart LowerNeck;
        public ModelPart Snout;
        public ModelPart Crest1;
        public ModelPart SideburnLeft;
        public ModelPart SideburnRight;
        public ModelPart CheekLeft1;
        public ModelPart CheekRight1;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart CheekLeft3;
        public ModelPart EarRight2;
        public ModelPart EarLeft2;
        public ModelPart Nose;
        public ModelPart Mouth;
        public ModelPart Beard1;
        public ModelPart Beard2;
        public ModelPart Crest1_1;
        public ModelPart Crest1_2;
        public ModelPart CheekLeft2;
        public ModelPart CheekRight2;
        public ModelPart EarTuftRight;
        public ModelPart EarzTuftLeft;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail1;
        public ModelPart LeftLeg;
        public ModelPart FootLeft;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart Tail4;
        public ModelPart Tail5;
        public ModelPart Tail6;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.ThumbLeft = this.HandLeft.getChild("ThumbLeft");
            this.CheekLeft1 = this.Head.getChild("CheekLeft1");
            this.Mouth = this.Snout.getChild("Mouth");
            this.Hips = this.Body.getChild("Hips");
            this.ForearmLeft_1 = this.ArmLeft_1.getChild("ForearmLeft_1");
            this.LeftLeg = this.ThighLeft.getChild("LeftLeg");
            this.Tail5 = this.Tail4.getChild("Tail5");
            this.SideburnLeft = this.Head.getChild("SideburnLeft");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.EarzTuftLeft = this.EarLeft2.getChild("EarzTuftLeft");
            this.Tail6 = this.Tail5.getChild("Tail6");
            this.CheekRight1 = this.Head.getChild("CheekRight1");
            this.EarTuftRight = this.EarRight2.getChild("EarTuftRight");
            this.Nose = this.Snout.getChild("Nose");
            this.EarLeft2 = this.Head.getChild("EarLeft2");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.LowerNeck = this.Neck.getChild("LowerNeck");
            this.CheekLeft3 = this.Head.getChild("CheekLeft3");
            this.SideburnRight = this.Head.getChild("SideburnRight");
            this.Snout = this.Head.getChild("Snout");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
            this.ArmLeft = this.Body.getChild("ArmLeft");
            this.CheekRight2 = this.CheekRight1.getChild("CheekRight2");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Head = this.Neck.getChild("Head");
            this.ArmLeft_1 = this.Body.getChild("ArmLeft_1");
            this.EarRight2 = this.Head.getChild("EarRight2");
            this.Beard2 = this.Mouth.getChild("Beard2");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.HandLeft_1 = this.ForearmLeft_1.getChild("HandLeft_1");
            this.CheekLeft2 = this.CheekLeft1.getChild("CheekLeft2");
            this.Neck = this.Body.getChild("Neck");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.ThumbLeft_1 = this.HandLeft_1.getChild("ThumbLeft_1");
            this.Crest1 = this.Head.getChild("Crest1");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.EarRight = this.Head.getChild("EarRight");
            this.Crest1_2 = this.Crest1.getChild("Crest1_2");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.FootLeft = this.LeftLeg.getChild("FootLeft");
            this.Beard1 = this.Mouth.getChild("Beard1");
            this.Crest1_1 = this.Crest1.getChild("Crest1_1");
            this.Tail4 = this.Tail3.getChild("Tail4");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(54, 52).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F), PartPose.offset(0.1F, 5.4F, 0.0F));
            partDefinition.addOrReplaceChild("ThumbLeft", CubeListBuilder.create().texOffs(38, 46).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.9F, 0.1F, -0.4F, 0.0F, 0.5410520681182421F, 0.0F));
            partDefinition.addOrReplaceChild("CheekLeft1", CubeListBuilder.create().texOffs(0, 15).addBox(-2.1F, -1.0F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(2.7F, 0.6F, -0.5F, -0.23457224414434488F, 0.1563815016444822F, -0.23474678106428595F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(5, 34).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offset(0.0F, 0.5F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(28, 0).addBox(-3.5F, -0.5F, 0.0F, 7.0F, 6.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -2.7F, 3.4F, -0.10471975511965977F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmLeft_1", CubeListBuilder.create().texOffs(44, 42).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 4.7F, 0.5F, -0.22689280275926282F, 0.0F, -0.13962634015954636F));
            partDefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(54, 42).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 6.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 5.9F, -0.5F, 0.24364796424419868F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(64, 32).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(-0.01F, 0.0F, 5.0F, 0.5602506632585689F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("SideburnLeft", CubeListBuilder.create().texOffs(42, 22).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F), PartPose.offset(1.95F, -0.2F, 0.1F));
            partDefinition.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(64, 16).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(-0.01F, 0.0F, 4.0F, -0.25132740562928074F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarzTuftLeft", CubeListBuilder.create().texOffs(27, 36).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 0.5F, -0.6255260065779288F, 0.0781907508222411F, 0.3909537457888271F));
            partDefinition.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(64, 40).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.01F, 0.0F, 5.0F, 0.5138249411081944F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("CheekRight1", CubeListBuilder.create().texOffs(0, 15).mirror(true).addBox(0.1F, -1.0F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-2.7F, 0.6F, -0.5F, -0.23457224414434488F, -0.1563815016444822F, 0.23474678106428595F));
            partDefinition.addOrReplaceChild("EarTuftRight", CubeListBuilder.create().texOffs(27, 36).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 0.5F, -0.6255260065779288F, -0.0781907508222411F, -0.3909537457888271F));
            partDefinition.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(0, 35).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -1.0F, -0.9F, -0.5208062514582691F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -3.9F, 6.0F, 6.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 13.1F, -3.0F, 0.09599310885968812F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft2", CubeListBuilder.create().texOffs(25, 38).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(2.5F, -0.4F, -1.0F, -0.23457224414434488F, -0.5462880425584197F, 0.6391395534381958F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(65, 1).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.5F, 7.0F, -0.6059783375977199F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerNeck", CubeListBuilder.create().texOffs(12, 16).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.8F, -1.7F, -0.23457224414434488F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("CheekLeft3", CubeListBuilder.create().texOffs(0, 44).addBox(-1.6F, 0.0F, -1.5F, 3.0F, 1.0F, 4.0F), PartPose.offset(-0.0F, 1.8F, -0.5F));
            partDefinition.addOrReplaceChild("SideburnRight", CubeListBuilder.create().texOffs(42, 22).mirror(true).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F), PartPose.offset(-1.95F, -0.2F, 0.1F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 40).addBox(-1.0F, -1.0F, -1.1F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.7F, -1.6F, 0.22689280275926282F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(42, 52).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 4.6F, -1.0F, 0.05235987755982988F, 0.0F, -0.13962634015954636F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(40, 34).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(2.5F, 0.5F, -3.2F, 0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("CheekRight2", CubeListBuilder.create().texOffs(10, 38).mirror(true).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -1.2F, -1.1F, 0.0F, 0.46914448828868976F, -0.3839724354387525F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(50, 32).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F), PartPose.offsetAndRotation(2.4F, 1.8F, 5.4F, -0.23492131798422702F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(64, 8).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.01F, 0.0F, 3.0F, -0.5263912997383287F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(18, 27).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.4F, -4.4F, 0.30159290672884503F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmLeft_1", CubeListBuilder.create().texOffs(40, 34).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(-2.5F, 0.5F, -3.2F, 0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight2", CubeListBuilder.create().texOffs(25, 38).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-2.5F, -0.3F, -1.0F, -0.23457224414434488F, 0.5462880425584197F, -0.6391395534381958F));
            partDefinition.addOrReplaceChild("Beard2", CubeListBuilder.create().texOffs(38, 16).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -0.6F, -0.15358897750445236F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(54, 42).mirror(true).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 6.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 5.9F, -0.5F, 0.24364796424419868F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft_1", CubeListBuilder.create().texOffs(42, 52).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 4.6F, -1.0F, 0.05235987755982988F, 0.0F, 0.13962634015954636F));
            partDefinition.addOrReplaceChild("CheekLeft2", CubeListBuilder.create().texOffs(10, 38).addBox(0.0F, 0.0F, 0.0F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -1.6F, -1.1F, 0.0F, -0.46914448828868976F, 0.3839724354387525F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 23).addBox(-1.5F, -2.0F, -4.0F, 3.0F, 4.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -1.0F, -3.0F, -0.2841396142089017F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(44, 42).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 4.7F, 0.5F, -0.22689280275926282F, 0.0F, 0.13962634015954636F));
            partDefinition.addOrReplaceChild("ThumbLeft_1", CubeListBuilder.create().texOffs(38, 46).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.9F, 0.1F, -0.4F, 0.0F, -0.5410520681182421F, 0.0F));
            partDefinition.addOrReplaceChild("Crest1", CubeListBuilder.create().texOffs(14, 44).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -1.55F, -2.2F, 0.11728612207217244F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(21, 38).addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.7F, -0.2F, 0.0F, 0.0F, -0.5462880425584197F, 0.32637658343874504F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(21, 38).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.7F, -0.2F, 0.0F, 0.0F, 0.5462880425584197F, -0.32637658343874504F));
            partDefinition.addOrReplaceChild("Crest1_2", CubeListBuilder.create().texOffs(24, 44).mirror(true).addBox(-0.5F, -1.0F, 0.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-1.7F, 0.3F, 0.5F, 0.0F, -0.3127630032889644F, -0.19547687289441354F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(50, 32).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F), PartPose.offsetAndRotation(-2.4F, 1.8F, 5.4F, -0.23492131798422702F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(54, 52).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F), PartPose.offset(-0.1F, 5.4F, 0.0F));
            partDefinition.addOrReplaceChild("Beard1", CubeListBuilder.create().texOffs(27, 16).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.1F, -0.4F, -0.3490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Crest1_1", CubeListBuilder.create().texOffs(24, 44).addBox(-1.5F, -1.0F, 0.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(1.7F, 0.3F, 0.5F, 0.0F, 0.3127630032889644F, 0.19547687289441354F));
            partDefinition.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(64, 24).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.01F, 2.0F, 5.0F, 0.7004006474674521F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 96, 64);
        }

        @Override
        public void setupAnim(GuenonEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Tail1.xRot = Mth.cos(5.0F + limbSwing * speed * 0.1F + (float) Math.PI) * degree * 0.3F * limbSwingAmount * 0.5F - 0.605F;
            this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F + (float) Math.PI) * degree * 0.1F * limbSwingAmount * 0.5F - 0.526F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F + (float) Math.PI) * degree * 0.2F * limbSwingAmount * 0.5F - 0.284F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 0.6f;
            this.ArmLeft.xRot = Mth.cos(limbSwing * speed * 0.3F + (float) Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + 0.0872F;
            this.ForearmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * -1.5F * limbSwingAmount * 0.5F - 0.226F;
            this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F + 0.052F;
            this.ArmLeft_1.xRot = Mth.cos(limbSwing * speed * 0.3F + (float) Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F + 0.0872F;
            this.ForearmLeft_1.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * 1.5F * limbSwingAmount * 0.5F - 0.226F;
            this.HandLeft_1.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + 0.052F;
            this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F - 0.234F;
            this.LeftLeg.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * -3.0F * limbSwingAmount * 0.5F + 0.243F;
            this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * 1.5F * limbSwingAmount * 0.5F;
            this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F - 0.234F;
            this.LegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * 3.0F * limbSwingAmount * 0.5F + 0.243F;
            this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * -1.5F * limbSwingAmount * 0.5F;
            this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F + (float) Math.PI) * degree * 0.15F * limbSwingAmount * 0.5F + 0.095F;
            this.Hips.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + (float) Math.PI) * degree * -0.17F * limbSwingAmount * 0.5F - 0.104F;
            this.Tail1.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F + (float) Math.PI) * degree * 0.3F * limbSwingAmount * 0.5F - 0.605F;
            this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + (float) Math.PI) * degree * 0.1F * limbSwingAmount * 0.5F - 0.526F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.0F + (float) Math.PI) * degree * 0.0F * limbSwingAmount * 0.5F - 0.284F;
        }
    }

    public static class Child extends GuenonModel {
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Hips;
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
            this.Body = root.getChild("Body");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.Tail1 = this.Body.getChild("Tail1");
            this.Head = this.Neck.getChild("Head");
            this.Right = this.LegRight.getChild("Right");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.Tail4 = this.Tail3.getChild("Tail4");
            this.Snout1 = this.Head.getChild("Snout1");
            this.Hips = this.Body.getChild("Hips");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.Crest = this.Head.getChild("Crest");
            this.HandRight = this.ForearmRight.getChild("HandRight");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.Nose = this.Snout1.getChild("Nose");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.EarRight = this.Head.getChild("EarRight");
            this.ThighRight = this.Body.getChild("ThighRight");
            this.Tail5 = this.Tail4.getChild("Tail5");
            this.Neck = this.Hips.getChild("Neck");
            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.Snout2 = this.Snout1.getChild("Snout2");
            this.Mouth = this.Snout1.getChild("Mouth");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
            this.ArmLeft = this.Hips.getChild("ArmLeft");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.Faceplate = this.Head.getChild("Faceplate");
            this.ArmRight = this.Hips.getChild("ArmRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.6F, 0.3F, -0.33161255787892263F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 22).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.8F, 2.0F, -0.7155849933176751F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(22, 15).addBox(-2.0F, -2.0F, -1.5F, 4.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -1.8F, 0.6408849226376065F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Right", CubeListBuilder.create().texOffs(0, 19).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.6F, 0.3F, -0.33161255787892263F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 18.1F, 0.0F, -0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(14, 13).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.2F, 2.8F, 1.0F, -0.4363323129985824F, 0.0F, 0.24434609527920614F));
            partDefinition.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 22).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 0.0F, 3.0F, 0.3490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Snout1", CubeListBuilder.create().texOffs(18, 24).addBox(-0.2F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.4F, -1.4F, 0.1563815016444822F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(16, 0).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.22689280275926282F, 0.0F, 0.0F));
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
        public void setupAnim(GuenonEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
            this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F + (float) Math.PI) * degree * 0.15F * limbSwingAmount * 0.5F + 0.226F;
            this.Hips.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + (float) Math.PI) * degree * -0.17F * limbSwingAmount * 0.5F - 0.087F;
            this.Tail1.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F + (float) Math.PI) * degree * 0.3F * limbSwingAmount * 0.5F - 0.715F;
            this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + (float) Math.PI) * degree * 0.1F * limbSwingAmount * 0.5F + 0.349F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.0F + (float) Math.PI) * degree * 0.0F * limbSwingAmount * 0.5F - 0.723F;
        }
    }
}
