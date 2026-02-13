package com.github.platinum234.exhibitadditions.client.model;

import com.github.platinum234.exhibitadditions.entity.GerenukEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class GerenukModel extends ZawaBaseModel<GerenukEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends GerenukModel {
        public ModelPart RightArmBase;
        public ModelPart Neck;
        public ModelPart LeftArmBase;
        public ModelPart Body;
        public ModelPart RightArm;
        public ModelPart RightForeArm;
        public ModelPart RightHand;
        public ModelPart NeckLower;
        public ModelPart Head;
        public ModelPart NeckLower_1;
        public ModelPart Muzzle;
        public ModelPart LeftAntler;
        public ModelPart RightAntler;
        public ModelPart RightEar;
        public ModelPart LeftEar;
        public ModelPart TopSnout;
        public ModelPart Mouth;
        public ModelPart LeftAntler_1;
        public ModelPart LeftAntler_2;
        public ModelPart RightAntler_1;
        public ModelPart RightAntler_2;
        public ModelPart LeftArm;
        public ModelPart LeftForearm;
        public ModelPart LeftHand;
        public ModelPart Hips;
        public ModelPart LeftThigh;
        public ModelPart RightThigh;
        public ModelPart Tail1;
        public ModelPart LeftUpperLeg;
        public ModelPart LeftLeg;
        public ModelPart LeftFoot;
        public ModelPart RightUpperLeg;
        public ModelPart RightLeg;
        public ModelPart RightFoot;
        public ModelPart Tail2;
        public ModelPart Tail3;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.RightThigh = this.Hips.getChild("RightThigh");
            this.RightUpperLeg = this.RightThigh.getChild("RightUpperLeg");
            this.RightLeg = this.RightUpperLeg.getChild("RightLeg");
            this.RightFoot = this.RightLeg.getChild("RightFoot");

            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");

            this.LeftThigh = this.Hips.getChild("LeftThigh");
            this.LeftUpperLeg = this.LeftThigh.getChild("LeftUpperLeg");
            this.LeftLeg = this.LeftUpperLeg.getChild("LeftLeg");
            this.LeftFoot = this.LeftLeg.getChild("LeftFoot");

            this.LeftArmBase = this.Chest.getChild("LeftArmBase");
            this.LeftArm = this.LeftArmBase.getChild("LeftArm");
            this.LeftForearm = this.LeftArm.getChild("LeftForearm");
            this.LeftHand = this.LeftForearm.getChild("LeftHand");

            this.RightArmBase = this.Chest.getChild("RightArmBase");
            this.RightArm = this.RightArmBase.getChild("RightArm");
            this.RightForeArm = this.RightArm.getChild("RightForeArm");
            this.RightHand = this.RightForeArm.getChild("RightHand");

            this.Neck = this.Chest.getChild("Neck");
            this.NeckLower = this.Neck.getChild("NeckLower");
            this.Head = this.NeckLower.getChild("Head");
            this.Muzzle = this.Head.getChild("Muzzle");
            this.Mouth = this.Muzzle.getChild("Mouth");

            this.TopSnout = this.Muzzle.getChild("TopSnout");

            this.LeftAntler = this.Head.getChild("LeftAntler");
            this.LeftAntler_1 = this.LeftAntler.getChild("LeftAntler_1");
            this.LeftAntler_2 = this.LeftAntler_1.getChild("LeftAntler_2");

            this.RightEar = this.Head.getChild("RightEar");

            this.LeftEar = this.Head.getChild("LeftEar");

            this.RightAntler = this.Head.getChild("RightAntler");
            this.RightAntler_1 = this.RightAntler.getChild("RightAntler_1");
            this.RightAntler_2 = this.RightAntler_1.getChild("RightAntler_2");

            this.NeckLower_1 = this.NeckLower.getChild("NeckLower_1");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(36, 12).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 7.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 8.0F, -6.5F, -0.20996310435438595F, 0.0F, 0.0F));
            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 9).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 8.0F, 11.0F), PartPose.offsetAndRotation(0.0F, -4.0F, 1.0F, 0.2399827721492203F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 28).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 7.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 11.0F, -0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition RightThigh = Hips.addOrReplaceChild("RightThigh", CubeListBuilder.create().texOffs(22, 28).mirror(true).addBox(-1.5F, 0.0F, -2.5F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(-2.2F, 2.8F, 2.7F, 0.2399827721492203F, 0.0F, 0.0F));
            PartDefinition RightUpperLeg = RightThigh.addOrReplaceChild("RightUpperLeg", CubeListBuilder.create().texOffs(23, 38).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 6.0F, -2.2F, 0.3499385017090576F, 0.0F, 0.0F));
            PartDefinition RightLeg = RightUpperLeg.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(33, 39).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 5.0F, 2.5F, -0.30997047914893455F, 0.0F, 0.0F));
            PartDefinition RightFoot = RightLeg.addOrReplaceChild("RightFoot", CubeListBuilder.create().texOffs(0, 15).mirror(true).addBox(-1.0F, -0.2F, -1.3F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 4.8F, -1.2F, 0.04991641477611458F, 0.0F, 0.0F));

            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.3000221077388891F, 0.015009831816822585F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(4, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.8F, -0.5F, -0.056723200689815706F, 0.0F, -0.0031415927784254694F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(12, 43).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offset(0.0F, 3.0F, 0.0F));

            PartDefinition LeftThigh = Hips.addOrReplaceChild("LeftThigh", CubeListBuilder.create().texOffs(22, 28).addBox(-1.5F, 0.0F, -2.5F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(2.2F, 2.8F, 2.7F, 0.2399827721492203F, 0.0F, 0.0F));
            PartDefinition LeftUpperLeg = LeftThigh.addOrReplaceChild("LeftUpperLeg", CubeListBuilder.create().texOffs(23, 38).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 6.0F, -2.2F, 0.3499385017090576F, 0.0F, 0.0F));
            PartDefinition LeftLeg = LeftUpperLeg.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(33, 39).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 5.0F, 2.5F, -0.30997047914893455F, 0.0F, 0.0F));
            PartDefinition LeftFoot = LeftLeg.addOrReplaceChild("LeftFoot", CubeListBuilder.create().texOffs(0, 15).addBox(-1.0F, -0.2F, -1.3F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 4.8F, -1.2F, 0.04991641477611458F, 0.0F, 0.0F));

            PartDefinition LeftArmBase = Chest.addOrReplaceChild("LeftArmBase", CubeListBuilder.create().texOffs(36, 27).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(1.9F, 0.5F, -0.5F, 0.279950827998857F, 0.0F, 0.0F));
            PartDefinition LeftArm = LeftArmBase.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(46, 25).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.0F, 1.6F, -0.06998770699971425F, 0.0F, 0.0F));
            PartDefinition LeftForearm = LeftArm.addOrReplaceChild("LeftForearm", CubeListBuilder.create().texOffs(56, 28).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 2.0F), PartPose.offset(-0.1F, 3.0F, -2.5F));
            PartDefinition LeftHand = LeftForearm.addOrReplaceChild("LeftHand", CubeListBuilder.create().texOffs(0, 15).addBox(-1.0F, -0.2F, -1.3F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.1F, 5.8F, 0.8F));

            PartDefinition RightArmBase = Chest.addOrReplaceChild("RightArmBase", CubeListBuilder.create().texOffs(36, 27).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(-1.9F, 0.5F, -0.5F, 0.279950827998857F, 0.0F, 0.0F));
            PartDefinition RightArm = RightArmBase.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(46, 25).mirror(true).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.0F, 1.6F, -0.06998770699971425F, 0.0F, 0.0F));
            PartDefinition RightForeArm = RightArm.addOrReplaceChild("RightForeArm", CubeListBuilder.create().texOffs(56, 28).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 2.0F), PartPose.offset(0.1F, 3.0F, -2.5F));
            PartDefinition RightHand = RightForeArm.addOrReplaceChild("RightHand", CubeListBuilder.create().texOffs(0, 15).mirror(true).addBox(-1.0F, -0.2F, -1.3F, 2.0F, 2.0F, 2.0F), PartPose.offset(-0.1F, 5.8F, 0.8F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(25, 6).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -0.8F, -2.7F, -0.5827654265882622F, 0.0F, 0.0F));
            PartDefinition NeckLower = Neck.addOrReplaceChild("NeckLower", CubeListBuilder.create().texOffs(42, 0).addBox(-1.5F, -1.5F, -9.0F, 3.0F, 3.0F, 9.0F), PartPose.offsetAndRotation(0.0F, 0.9F, -0.8F, -0.5913175692178064F, 0.0F, 0.0F));
            PartDefinition Head = NeckLower.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 4.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -8.9F, 1.471836190164751F, -0.0F, 0.0F));
            PartDefinition Muzzle = Head.addOrReplaceChild("Muzzle", CubeListBuilder.create().texOffs(25, 0).addBox(-1.5F, 0.1F, -3.5F, 3.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -0.6F, -2.3F, 0.18291049761952247F, 0.0F, 0.0F));
            PartDefinition Mouth = Muzzle.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(18, 5).addBox(-1.0F, -0.2F, -2.6F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.9F, -0.7F, -0.06981317007977318F, 0.0F, 0.0F));

            PartDefinition TopSnout = Muzzle.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(13, 0).addBox(-1.0F, 0.0F, -3.4F, 2.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(-0.1F, -0.8F, -0.3F, 0.2227040165492181F, 0.0F, 0.0F));

            PartDefinition LeftAntler = Head.addOrReplaceChild("LeftAntler", CubeListBuilder.create().texOffs(41, 40).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F, 0.1F, 0.1F)), PartPose.offsetAndRotation(1.3F, -1.9F, -2.0F, -0.3490658503988659F, 0.0F, 0.3127630032889644F));
            PartDefinition LeftAntler_1 = LeftAntler.addOrReplaceChild("LeftAntler_1", CubeListBuilder.create().texOffs(45, 39).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, -0.4663519641486599F, 0.0F, 0.0F));
            PartDefinition LeftAntler_2 = LeftAntler_1.addOrReplaceChild("LeftAntler_2", CubeListBuilder.create().texOffs(41, 36).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -3.9F, 1.1F, 0.5110324169681646F, 0.11728612207217244F, -0.35185837453889574F));

            PartDefinition RightEar = Head.addOrReplaceChild("RightEar", CubeListBuilder.create().texOffs(0, 9).mirror(true).addBox(0.0F, -3.0F, -1.0F, 1.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(-2.0F, -1.3F, 0.4F, -0.8000589317773618F, -0.7009242249377616F, -0.10471975511965977F));

            PartDefinition LeftEar = Head.addOrReplaceChild("LeftEar", CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(2.0F, -1.3F, 0.4F, -0.8000589317773618F, 0.7009242249377616F, 0.10471975511965977F));

            PartDefinition RightAntler = Head.addOrReplaceChild("RightAntler", CubeListBuilder.create().texOffs(41, 40).mirror(true).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F, 0.1F, 0.1F)), PartPose.offsetAndRotation(-1.3F, -1.9F, -2.0F, -0.3490658503988659F, 0.0F, -0.3127630032889644F));
            PartDefinition RightAntler_1 = RightAntler.addOrReplaceChild("RightAntler_1", CubeListBuilder.create().texOffs(45, 39).mirror(true).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, -0.4663519641486599F, 0.0F, 0.0F));
            PartDefinition RightAntler_2 = RightAntler_1.addOrReplaceChild("RightAntler_2", CubeListBuilder.create().texOffs(41, 36).mirror(true).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -3.9F, 1.1F, 0.5110324169681646F, -0.11728612207217244F, 0.35185837453889574F));

            PartDefinition NeckLower_1 = NeckLower.addOrReplaceChild("NeckLower_1", CubeListBuilder.create().texOffs(42, 35).addBox(-1.0F, -2.0F, -9.0F, 2.0F, 2.0F, 9.0F), PartPose.offsetAndRotation(0.0F, 2.3F, 0.0F, -0.04398229681736197F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 48);
        }

        @Override
        public void setupAnim(GerenukEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.471F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.582F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 1.471F;

            this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.3F;
            this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.05F;
            this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.5f;
            float degree = 0.6f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.582F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 1.471F;
            this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.3F;
            this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.05F;
            this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

            this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 8.0F;
            this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.2F;
            this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.239F;
            this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.349F;

            this.LeftArmBase.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.279F;
            this.LeftArm.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.06F;
            this.LeftForearm.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
            this.LeftHand.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
            this.RightArmBase.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.279F;
            this.RightArm.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.06F;
            this.RightForeArm.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
            this.RightHand.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

            this.LeftThigh.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.239F;
            this.LeftUpperLeg.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.349F;
            this.LeftLeg.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.309F;
            this.LeftFoot.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
            this.RightThigh.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.239F;
            this.RightUpperLeg.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.349F;
            this.RightLeg.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.309F;
            this.RightFoot.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;

        }
    }

    public static class Child extends GerenukModel {
        public ModelPart Body;
        public ModelPart Neck1;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart Hips;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail1;
        public ModelPart UpperLegLeft;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperLegRight;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart Neck2;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart Mouth;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Nose;
        public ModelPart ArmLeft;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart ArmRight;
        public ModelPart ForearmRight;
        public ModelPart HandRight;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.HandRight = this.ForearmRight.getChild("HandRight");

            this.Neck1 = this.Chest.getChild("Neck1");
            this.Neck2 = this.Neck1.getChild("Neck2");
            this.Head = this.Neck2.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.Nose = this.Snout.getChild("Nose");

            this.Mouth = this.Head.getChild("Mouth");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.EarRight = this.Head.getChild("EarRight");

            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LegRight = this.UpperLegRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.Tail1 = this.Hips.getChild("Tail1");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LegLeft = this.UpperLegLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 19).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 13.9F, -3.7F, -0.17453292519943295F, 0.0F, 0.0F));
            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(30, 6).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-1.2F, 0.0F, -0.5F, 0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition ArmRight = ArmBaseRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(31, 12).mirror(true).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 2.8F, 0.9F, -0.05235987755982988F, 0.0F, 0.0F));
            PartDefinition ForearmRight = ArmRight.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(31, 17).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F), PartPose.offset(0.0F, 2.8F, -1.6F));
            PartDefinition HandRight = ForearmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(35, 18).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.01F, 3.7F, 0.3F));

            PartDefinition Neck1 = Chest.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(19, 13).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.9F, -1.2F, 0.6576400674777856F, 0.0F, 0.0F));
            PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(22, 6).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.45F, -0.2841396142089017F, 0.0F, 0.0F));
            PartDefinition Head = Neck2.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(22, 0).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -5.3F, -0.3F, -0.1265363707695889F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(14, 29).addBox(-1.0F, 0.0F, -1.4F, 2.0F, 1.0F, 2.0F), PartPose.offset(0.0F, -0.1F, -1.6F));
            PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(6, 29).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, 0.2617993877991494F, 0.0F, 0.0F));

            PartDefinition Mouth = Head.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(22, 29).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F, 0.0F, 0.0F)), PartPose.offset(0.0F, 0.4F, -1.4F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(28, 27).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.8F, -1.2F, 1.1F, -0.8782496742772243F, 0.7009242249377616F, 0.10471975511965977F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(28, 27).mirror(true).addBox(0.0F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.8F, -1.2F, 1.1F, -0.8782496742772243F, -0.7009242249377616F, -0.10471975511965977F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, 0.0F, -1.5F, 5.0F, 5.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -2.5F, 1.5F, 0.22689280275926282F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 11).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 5.0F, 3.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.3F, -0.27366763203903305F, 0.0F, 0.0F));
            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(37, 0).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-1.6F, 1.5F, 1.5F, 0.2181661564992912F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(40, 7).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.9F, -0.8F, 0.47123889803846897F, 0.0F, 0.0F));
            PartDefinition LegRight = UpperLegRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(37, 12).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.01F, 2.8F, 1.4F, -0.45378560551852565F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(35, 18).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.01F, 4.2F, -0.8F));

            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(14, 11).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.3F, 3.0F, -1.239183768915974F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(37, 0).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(1.6F, 1.5F, 1.5F, 0.2181661564992912F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(40, 7).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.9F, -0.8F, 0.47123889803846897F, 0.0F, 0.0F));
            PartDefinition LegLeft = UpperLegLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(37, 12).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, 2.8F, 1.4F, -0.45378560551852565F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(35, 18).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offset(-0.01F, 4.2F, -0.8F));

            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(30, 6).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(1.2F, 0.0F, -0.5F, 0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition ArmLeft = ArmBaseLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(31, 12).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 2.8F, 0.9F, -0.05235987755982988F, 0.0F, 0.0F));
            PartDefinition ForearmLeft = ArmLeft.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(31, 17).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F), PartPose.offset(0.0F, 2.8F, -1.6F));
            PartDefinition HandLeft = ForearmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(35, 18).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offset(-0.01F, 3.7F, 0.3F));

            return LayerDefinition.create(meshDefinition, 48, 32);
        }

        @Override
        public void setupAnim(GerenukEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.126F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.657F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F - 0.126F;

            this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 1.239F;
            this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.2f;
            float degree = 0.8f;
            this.Neck1.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.15F) * 0.5F + 0.657F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.126F;
            this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 13.9F;
            this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.174F;
            this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.226F;
            this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.234F;
            this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.052F;
            this.ForearmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F;
            this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
            this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.9F) * 0.5F + 0.234F;
            this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.052F;
            this.ForearmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F;
            this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
            this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.218F;
            this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.471F;
            this.LegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.453F;
            this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
            this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.218F;
            this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.471F;
            this.LegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.453F;
            this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;

        }
    }
}