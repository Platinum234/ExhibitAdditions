package com.github.platinum234.exhibitadditions.client.model;

import com.github.platinum234.exhibitadditions.entity.KlipspringerEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class KlipspringerModel extends ZawaBaseModel<KlipspringerEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends KlipspringerModel {
        public ModelPart RightArmBase;
        public ModelPart Neck;
        public ModelPart LeftArmBase;
        public ModelPart Body;
        public ModelPart RightArm;
        public ModelPart RightForeArm;
        public ModelPart RightHand;
        public ModelPart Head;
        public ModelPart Muzzle;
        public ModelPart LeftAntler;
        public ModelPart RightAntler;
        public ModelPart RightEar;
        public ModelPart LeftEar;
        public ModelPart TopSnout;
        public ModelPart Mouth;
        public ModelPart LeftArm;
        public ModelPart LeftForearm;
        public ModelPart LeftHand;
        public ModelPart Hips;
        public ModelPart Tail;
        public ModelPart LeftThigh;
        public ModelPart RightThigh;
        public ModelPart LeftUpperLeg;
        public ModelPart LeftLeg;
        public ModelPart LeftFoot;
        public ModelPart RightUpperLeg;
        public ModelPart RightLeg;
        public ModelPart RightFoot;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.LeftEar = this.Head.getChild("LeftEar");
            this.RightFoot = this.RightLeg.getChild("RightFoot");
            this.LeftAntler = this.Head.getChild("LeftAntler");
            this.RightHand = this.RightForeArm.getChild("RightHand");
            this.Head = this.Neck.getChild("Head");
            this.LeftUpperLeg = this.LeftThigh.getChild("LeftUpperLeg");
            this.RightEar = this.Head.getChild("RightEar");
            this.LeftLeg = this.LeftUpperLeg.getChild("LeftLeg");
            this.TopSnout = this.Muzzle.getChild("TopSnout");
            this.LeftThigh = this.Hips.getChild("LeftThigh");
            this.Tail = this.Hips.getChild("Tail");
            this.RightArmBase = this.Chest.getChild("RightArmBase");
            this.LeftArmBase = this.Chest.getChild("LeftArmBase");
            this.Mouth = this.Muzzle.getChild("Mouth");
            this.RightThigh = this.Hips.getChild("RightThigh");
            this.LeftFoot = this.LeftLeg.getChild("LeftFoot");
            this.LeftArm = this.LeftArmBase.getChild("LeftArm");
            this.LeftForearm = this.LeftArm.getChild("LeftForearm");
            this.RightLeg = this.RightUpperLeg.getChild("RightLeg");
            this.Muzzle = this.Head.getChild("Muzzle");
            this.RightArm = this.RightArmBase.getChild("RightArm");
            this.Body = this.Chest.getChild("Body");
            this.RightAntler = this.Head.getChild("RightAntler");
            this.RightUpperLeg = this.RightThigh.getChild("RightUpperLeg");
            this.Neck = this.Chest.getChild("Neck");
            this.RightForeArm = this.RightArm.getChild("RightForeArm");
            this.LeftHand = this.LeftForearm.getChild("LeftHand");
            this.Hips = this.Body.getChild("Hips");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("LeftEar", CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(2.0F, -0.3F, 0.0F, 0.3490658503988659F, -0.6981317007977318F, 0.3490658503988659F));
            partDefinition.addOrReplaceChild("RightFoot", CubeListBuilder.create().texOffs(0, 14).mirror(true).addBox(-1.0F, -0.2F, -1.3F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 4.9F, -1.2F, 0.10227629649713366F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftAntler", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(1.3F, -1.0F, -2.6F, -0.3490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightHand", CubeListBuilder.create().texOffs(0, 14).mirror(true).addBox(-1.0F, -0.2F, -1.3F, 2.0F, 2.0F, 2.0F), PartPose.offset(-0.1F, 2.8F, 0.8F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -1.0F, -4.0F, 4.0F, 4.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -1.6F, -5.3F, 1.4327407190462789F, -0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftUpperLeg", CubeListBuilder.create().texOffs(38, 30).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.0F, -2.2F, 0.3499385017090576F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightEar", CubeListBuilder.create().texOffs(0, 9).mirror(true).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-2.0F, -0.3F, -0.2F, 0.3490658503988659F, 0.6981317007977318F, -0.3490658503988659F));
            partDefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(48, 33).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 3.0F, 2.5F, -0.36233035670876446F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(13, 0).addBox(-1.0F, -0.2F, -0.1F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.2F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -3.0F, 0.41818087279887484F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftThigh", CubeListBuilder.create().texOffs(24, 29).addBox(-1.5F, 0.0F, -2.5F, 3.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(2.2F, 3.3F, 2.0F, 0.23999999947252176F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(22, 27).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.4F, 4.5F, 0.2799999966104826F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightArmBase", CubeListBuilder.create().texOffs(34, 21).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(-1.9F, 0.4F, 0.5F, 0.279950827998857F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftArmBase", CubeListBuilder.create().texOffs(34, 21).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(1.9F, 0.4F, 0.5F, 0.279950827998857F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(18, 5).addBox(-1.0F, -0.2F, -2.6F, 2.0F, 1.0F, 3.0F), PartPose.offset(0.0F, 1.3F, -0.2F));
            partDefinition.addOrReplaceChild("RightThigh", CubeListBuilder.create().texOffs(24, 29).mirror(true).addBox(-1.5F, 0.0F, -2.5F, 3.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(-2.2F, 3.3F, 2.0F, 0.2399827721492203F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftFoot", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, -0.2F, -1.3F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 4.9F, -1.2F, 0.10227629649713366F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(48, 21).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 5.0F, 1.0F, -0.06998770699971425F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftForearm", CubeListBuilder.create().texOffs(48, 27).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F), PartPose.offset(-0.1F, 3.0F, -2.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(42, 0).addBox(-3.0F, -4.0F, -2.0F, 6.0F, 7.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 11.0F, -5.0F, -0.20996310435438595F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(48, 33).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 3.0F, 2.5F, -0.36233035670876446F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Muzzle", CubeListBuilder.create().texOffs(23, 0).addBox(-1.5F, 0.1F, -3.0F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.9F, -3.0F, 0.10471975511965977F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(48, 21).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 5.0F, 1.0F, -0.06998770699971425F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 9).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 8.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -4.0F, 0.5F, 0.23999999947252176F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightAntler", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-1.3F, -1.0F, -2.6F, -0.3490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightUpperLeg", CubeListBuilder.create().texOffs(38, 30).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.0F, -2.2F, 0.3499385017090576F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(24, 5).addBox(-1.5F, -2.5F, -4.8F, 3.0F, 4.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -1.7F, -1.7F, -1.0910052861268835F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightForeArm", CubeListBuilder.create().texOffs(48, 27).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F), PartPose.offset(0.1F, 3.0F, -2.0F));
            partDefinition.addOrReplaceChild("LeftHand", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, -0.2F, -1.3F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.1F, 2.8F, 0.8F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 27).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 7.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, -0.3490658503988659F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 48);
        }

        @Override
        public void setupAnim(KlipspringerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.43F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 1.09F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 1.43F;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.1f;
            float degree = 0.6f;
            this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 1.09F;
            this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 1.43F;
            this.Chest.y = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 11.0F;
            this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.21F;
            this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.23F;
            this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.349F;

            this.LeftArmBase.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.279F;
            this.LeftArm.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.069F;
            this.LeftForearm.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F;
            this.LeftHand.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
            this.RightArmBase.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.279F;
            this.RightArm.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.069F;
            this.RightForeArm.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F;
            this.RightHand.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;

            this.LeftThigh.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.239F;
            this.LeftUpperLeg.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.349F;
            this.LeftLeg.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.362F;
            this.LeftFoot.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.1F;
            this.RightThigh.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.239F;
            this.RightUpperLeg.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.349F;
            this.RightLeg.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.362F;
            this.RightFoot.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.1F;

        }
    }

    public static class Child extends KlipspringerModel {
        public ModelPart Body;
        public ModelPart Neck1;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
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
        public ModelPart Head;
        public ModelPart TopMouth;
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
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");
            this.Nose = this.TopMouth.getChild("Nose");
            this.Hips = this.Body.getChild("Hips");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.EarRight = this.Head.getChild("EarRight");
            this.Neck1 = this.Chest.getChild("Neck1");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");
            this.Tail = this.Hips.getChild("Tail");
            this.HandRight = this.ForearmRight.getChild("HandRight");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.Mouth = this.Head.getChild("Mouth");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
            this.Body = this.Chest.getChild("Body");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.TopMouth = this.Head.getChild("TopMouth");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.Head = this.Neck1.getChild("Head");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(33, 17).mirror(true).addBox(-1.0F, 0.0F, -0.9F, 2.0F, 2.0F, 2.0F), PartPose.offset(-0.1F, 2.8F, -1.3F));
            partDefinition.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(0, 38).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.1F, 0.3789109646290024F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(22, 0).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 6.0F, -0.21485003824419496F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(36, 0).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-1.4F, 0.0F, 0.0F, 0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(22, 15).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 4.0F, -1.0F, 0.4363323129985824F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(8, 43).mirror(true).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-1.5F, -1.0F, 0.8F, 0.3490658503988659F, 0.2617993877991494F, -0.3490658503988659F));
            partDefinition.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(0, 21).addBox(-1.51F, -5.0F, -1.5F, 3.0F, 6.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.8F, -0.8F, 0.32253683777906883F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(37, 6).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 3.0F, 1.0F, -0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 12).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 13.1F, -3.0F, -0.05235987755982988F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(22, 8).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-1.6F, 2.1F, 1.4F, 0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(33, 17).addBox(-1.0F, 0.0F, -0.9F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.1F, 2.8F, -1.3F));
            partDefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(32, 8).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.35F, 2.0F, 0.33964105645913F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(33, 17).addBox(-1.0F, 0.0F, -0.9F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.1F, 2.2F, 0.6F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(37, 6).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 3.0F, 1.0F, -0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(8, 43).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(1.5F, -1.0F, 0.8F, 0.3490658503988659F, -0.2617993877991494F, 0.3490658503988659F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, -0.05742133172482317F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(33, 17).mirror(true).addBox(-1.0F, 0.0F, -0.9F, 2.0F, 2.0F, 2.0F), PartPose.offset(-0.1F, 2.2F, 0.6F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -2.5F, 1.0F, 0.1075122792596896F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(35, 11).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offset(0.0F, 3.0F, -2.0F));
            partDefinition.addOrReplaceChild("TopMouth", CubeListBuilder.create().texOffs(8, 38).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 3.0F), PartPose.offset(0.0F, -0.4F, -2.1F));
            partDefinition.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(22, 21).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 2.8F, 2.0F, -0.4363323129985824F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(22, 21).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 2.8F, 2.0F, -0.4363323129985824F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(22, 8).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(1.6F, 2.1F, 1.4F, 0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 30).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -4.7F, -0.2F, -0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(22, 15).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 4.0F, -1.0F, 0.4363323129985824F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(36, 0).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(1.4F, 0.0F, 0.0F, 0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(35, 11).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offset(0.0F, 3.0F, -2.0F));

            return LayerDefinition.create(meshDefinition, 64, 48);
        }

        @Override
        public void setupAnim(KlipspringerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.174F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.32F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F - 0.174F;
            this.Tail.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.339F;
            this.Tail.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.2f;
            float degree = 0.8f;
            this.Neck1.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.15F) * 0.5F + 0.32F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.174F;
            this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 13.1F;
            this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.052F;
            this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.107F;
            this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.174F;
            this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.139F;
            this.ForearmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F;
            this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
            this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.9F) * 0.5F + 0.174F;
            this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.139F;
            this.ForearmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F;
            this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
            this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.174F;
            this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.436F;
            this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.436F;
            this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
            this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.174F;
            this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.436F;
            this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.436F;
            this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;

        }
    }
}
