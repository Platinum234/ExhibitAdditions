package com.github.platinum234.exhibitadditions.client.model;

import com.github.platinum234.exhibitadditions.entity.KlipspringerEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class KlipspringerModel extends ZawaBaseModel<KlipspringerEntity> {
    public ModelRenderer Chest;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends KlipspringerModel {

        public ModelRenderer RightArmBase;
        public ModelRenderer Neck;
        public ModelRenderer LeftArmBase;
        public ModelRenderer Body;
        public ModelRenderer RightArm;
        public ModelRenderer RightForeArm;
        public ModelRenderer RightHand;
        public ModelRenderer Head;
        public ModelRenderer Muzzle;
        public ModelRenderer LeftAntler;
        public ModelRenderer RightAntler;
        public ModelRenderer RightEar;
        public ModelRenderer LeftEar;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;
        public ModelRenderer LeftArm;
        public ModelRenderer LeftForearm;
        public ModelRenderer LeftHand;
        public ModelRenderer Hips;
        public ModelRenderer Tail;
        public ModelRenderer LeftThigh;
        public ModelRenderer RightThigh;
        public ModelRenderer LeftUpperLeg;
        public ModelRenderer LeftLeg;
        public ModelRenderer LeftFoot;
        public ModelRenderer RightUpperLeg;
        public ModelRenderer RightLeg;
        public ModelRenderer RightFoot;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 48;
            this.LeftEar = new ModelRenderer(this, 0, 9);
            this.LeftEar.setPos(2.0F, -0.3F, 0.0F);
            this.LeftEar.addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftEar, 0.3490658503988659F, -0.6981317007977318F, 0.3490658503988659F);
            this.RightFoot = new ModelRenderer(this, 0, 14);
            this.RightFoot.mirror = true;
            this.RightFoot.setPos(-0.1F, 4.9F, -1.2F);
            this.RightFoot.addBox(-1.0F, -0.2F, -1.3F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFoot, 0.10227629649713366F, 0.0F, 0.0F);
            this.LeftAntler = new ModelRenderer(this, 0, 0);
            this.LeftAntler.setPos(1.3F, -1.0F, -2.6F);
            this.LeftAntler.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftAntler, -0.3490658503988659F, 0.0F, 0.0F);
            this.RightHand = new ModelRenderer(this, 0, 14);
            this.RightHand.mirror = true;
            this.RightHand.setPos(-0.1F, 2.8F, 0.8F);
            this.RightHand.addBox(-1.0F, -0.2F, -1.3F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 0);
            this.Head.setPos(0.0F, -1.6F, -5.3F);
            this.Head.addBox(-2.0F, -1.0F, -4.0F, 4.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 1.4327407190462789F, -0.0F, 0.0F);
            this.LeftUpperLeg = new ModelRenderer(this, 38, 30);
            this.LeftUpperLeg.setPos(0.0F, 5.0F, -2.2F);
            this.LeftUpperLeg.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftUpperLeg, 0.3499385017090576F, 0.0F, 0.0F);
            this.RightEar = new ModelRenderer(this, 0, 9);
            this.RightEar.mirror = true;
            this.RightEar.setPos(-2.0F, -0.3F, -0.2F);
            this.RightEar.addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightEar, 0.3490658503988659F, 0.6981317007977318F, -0.3490658503988659F);
            this.LeftLeg = new ModelRenderer(this, 48, 33);
            this.LeftLeg.setPos(-0.1F, 3.0F, 2.5F);
            this.LeftLeg.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftLeg, -0.36233035670876446F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 13, 0);
            this.TopSnout.setPos(0.0F, 0.2F, -3.0F);
            this.TopSnout.addBox(-1.0F, -0.2F, -0.1F, 2.0F, 1.0F, 3.0F, 0.0F, 0.2F, 0.0F);
            this.setRotateAngle(TopSnout, 0.41818087279887484F, 0.0F, 0.0F);
            this.LeftThigh = new ModelRenderer(this, 24, 29);
            this.LeftThigh.setPos(2.2F, 3.3F, 2.0F);
            this.LeftThigh.addBox(-1.5F, 0.0F, -2.5F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftThigh, 0.23999999947252176F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 22, 27);
            this.Tail.setPos(0.0F, 0.4F, 4.5F);
            this.Tail.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.2799999966104826F, 0.0F, 0.0F);
            this.RightArmBase = new ModelRenderer(this, 34, 21);
            this.RightArmBase.mirror = true;
            this.RightArmBase.setPos(-1.9F, 0.4F, 0.5F);
            this.RightArmBase.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightArmBase, 0.279950827998857F, 0.0F, 0.0F);
            this.LeftArmBase = new ModelRenderer(this, 34, 21);
            this.LeftArmBase.setPos(1.9F, 0.4F, 0.5F);
            this.LeftArmBase.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftArmBase, 0.279950827998857F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 18, 5);
            this.Mouth.setPos(0.0F, 1.3F, -0.2F);
            this.Mouth.addBox(-1.0F, -0.2F, -2.6F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.RightThigh = new ModelRenderer(this, 24, 29);
            this.RightThigh.mirror = true;
            this.RightThigh.setPos(-2.2F, 3.3F, 2.0F);
            this.RightThigh.addBox(-1.5F, 0.0F, -2.5F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightThigh, 0.2399827721492203F, 0.0F, 0.0F);
            this.LeftFoot = new ModelRenderer(this, 0, 14);
            this.LeftFoot.setPos(0.1F, 4.9F, -1.2F);
            this.LeftFoot.addBox(-1.0F, -0.2F, -1.3F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFoot, 0.10227629649713366F, 0.0F, 0.0F);
            this.LeftArm = new ModelRenderer(this, 48, 21);
            this.LeftArm.setPos(0.0F, 5.0F, 1.0F);
            this.LeftArm.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftArm, -0.06998770699971425F, 0.0F, 0.0F);
            this.LeftForearm = new ModelRenderer(this, 48, 27);
            this.LeftForearm.setPos(-0.1F, 3.0F, -2.0F);
            this.LeftForearm.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 42, 0);
            this.Chest.setPos(0.0F, 11.0F, -5.0F);
            this.Chest.addBox(-3.0F, -4.0F, -2.0F, 6.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.20996310435438595F, 0.0F, 0.0F);
            this.RightLeg = new ModelRenderer(this, 48, 33);
            this.RightLeg.mirror = true;
            this.RightLeg.setPos(0.1F, 3.0F, 2.5F);
            this.RightLeg.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightLeg, -0.36233035670876446F, 0.0F, 0.0F);
            this.Muzzle = new ModelRenderer(this, 23, 0);
            this.Muzzle.setPos(0.0F, 0.9F, -3.0F);
            this.Muzzle.addBox(-1.5F, 0.1F, -3.0F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Muzzle, 0.10471975511965977F, 0.0F, 0.0F);
            this.RightArm = new ModelRenderer(this, 48, 21);
            this.RightArm.mirror = true;
            this.RightArm.setPos(0.0F, 5.0F, 1.0F);
            this.RightArm.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightArm, -0.06998770699971425F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 9);
            this.Body.setPos(0.0F, -4.0F, 0.5F);
            this.Body.addBox(-3.5F, 0.0F, 0.0F, 7.0F, 8.0F, 10.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.23999999947252176F, 0.0F, 0.0F);
            this.RightAntler = new ModelRenderer(this, 0, 0);
            this.RightAntler.mirror = true;
            this.RightAntler.setPos(-1.3F, -1.0F, -2.6F);
            this.RightAntler.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightAntler, -0.3490658503988659F, 0.0F, 0.0F);
            this.RightUpperLeg = new ModelRenderer(this, 38, 30);
            this.RightUpperLeg.mirror = true;
            this.RightUpperLeg.setPos(0.0F, 5.0F, -2.2F);
            this.RightUpperLeg.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightUpperLeg, 0.3499385017090576F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 24, 5);
            this.Neck.setPos(0.0F, -1.7F, -1.7F);
            this.Neck.addBox(-1.5F, -2.5F, -4.8F, 3.0F, 4.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -1.0910052861268835F, 0.0F, 0.0F);
            this.RightForeArm = new ModelRenderer(this, 48, 27);
            this.RightForeArm.mirror = true;
            this.RightForeArm.setPos(0.1F, 3.0F, -2.0F);
            this.RightForeArm.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.LeftHand = new ModelRenderer(this, 0, 14);
            this.LeftHand.setPos(0.1F, 2.8F, 0.8F);
            this.LeftHand.addBox(-1.0F, -0.2F, -1.3F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 27);
            this.Hips.setPos(0.0F, 0.0F, 10.0F);
            this.Hips.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.3490658503988659F, 0.0F, 0.0F);
            this.Head.addChild(this.LeftEar);
            this.RightLeg.addChild(this.RightFoot);
            this.Head.addChild(this.LeftAntler);
            this.RightForeArm.addChild(this.RightHand);
            this.Neck.addChild(this.Head);
            this.LeftThigh.addChild(this.LeftUpperLeg);
            this.Head.addChild(this.RightEar);
            this.LeftUpperLeg.addChild(this.LeftLeg);
            this.Muzzle.addChild(this.TopSnout);
            this.Hips.addChild(this.LeftThigh);
            this.Hips.addChild(this.Tail);
            this.Chest.addChild(this.RightArmBase);
            this.Chest.addChild(this.LeftArmBase);
            this.Muzzle.addChild(this.Mouth);
            this.Hips.addChild(this.RightThigh);
            this.LeftLeg.addChild(this.LeftFoot);
            this.LeftArmBase.addChild(this.LeftArm);
            this.LeftArm.addChild(this.LeftForearm);
            this.RightUpperLeg.addChild(this.RightLeg);
            this.Head.addChild(this.Muzzle);
            this.RightArmBase.addChild(this.RightArm);
            this.Chest.addChild(this.Body);
            this.Head.addChild(this.RightAntler);
            this.RightThigh.addChild(this.RightUpperLeg);
            this.Chest.addChild(this.Neck);
            this.RightArm.addChild(this.RightForeArm);
            this.LeftForearm.addChild(this.LeftHand);
            this.Body.addChild(this.Hips);
            this.saveBase();
        }

        @Override
        public void setupAnim(KlipspringerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
          //  super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            super.setupAnim(entity, entity.tickCount, 0.3F, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.43F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 1.09F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 1.43F;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.1f;
            float degree = 0.6f;
        }
    }


    public static class Child extends KlipspringerModel {

        public ModelRenderer Body;
        public ModelRenderer Neck1;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail;
        public ModelRenderer ThighRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Head;
        public ModelRenderer TopMouth;
        public ModelRenderer Mouth;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Nose;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Child() {
            this.texWidth = 64;
            this.texHeight = 48;
            this.ThighLeft = new ModelRenderer(this, 22, 8);
            this.ThighLeft.setPos(1.6F, 2.1F, 1.4F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.17453292519943295F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 22, 21);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.1F, 3.8F, 2.0F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.4363323129985824F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 36, 0);
            this.ArmBaseRight.setPos(-1.4F, 0.0F, 0.0F);
            this.ArmBaseRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.17453292519943295F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 12);
            this.Chest.setPos(0.0F, 13.1F, -3.0F);
            this.Chest.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.05235987755982988F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 8, 43);
            this.EarRight.setPos(-1.5F, -1.0F, 0.8F);
            this.EarRight.addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.3490658503988659F, 0.2617993877991494F, -0.3490658503988659F);
            this.ForearmRight = new ModelRenderer(this, 35, 11);
            this.ForearmRight.setPos(0.1F, 3.0F, -2.0F);
            this.ForearmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 0, 21);
            this.Neck1.setPos(0.0F, -0.8F, -0.7F);
            this.Neck1.addBox(-1.51F, -5.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.24434609527920614F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 22, 15);
            this.UpperLegLeft.setPos(-0.1F, 4.0F, -1.0F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.4363323129985824F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 0, 42);
            this.Mouth.setPos(0.0F, 1.0F, -2.1F);
            this.Mouth.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.05742133172482317F, 0.0F, 0.0F);
            this.TopMouth = new ModelRenderer(this, 8, 38);
            this.TopMouth.setPos(0.0F, -0.4F, -2.1F);
            this.TopMouth.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 22, 8);
            this.ThighRight.setPos(-1.6F, 2.1F, 1.4F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.17453292519943295F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 33, 17);
            this.HandLeft.setPos(-0.1F, 3.2F, 0.6F);
            this.HandLeft.addBox(-1.0F, 0.0F, -0.9F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 36, 0);
            this.ArmBaseLeft.setPos(1.4F, 0.0F, 0.0F);
            this.ArmBaseLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.17453292519943295F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 37, 6);
            this.ArmRight.setPos(0.1F, 3.0F, 1.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.13962634015954636F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, -2.5F, 1.0F);
            this.Body.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.1075122792596896F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 37, 6);
            this.ArmLeft.setPos(-0.1F, 3.0F, 1.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.13962634015954636F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 35, 11);
            this.ForearmLeft.setPos(-0.1F, 3.0F, -2.0F);
            this.ForearmLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 33, 17);
            this.HandRight.setPos(0.1F, 3.2F, 0.6F);
            this.HandRight.addBox(-1.0F, 0.0F, -0.9F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 32, 8);
            this.Tail.setPos(0.0F, 0.3F, 2.0F);
            this.Tail.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.33964105645913F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 22, 0);
            this.Hips.setPos(0.0F, 0.1F, 6.0F);
            this.Hips.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.21485003824419496F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 33, 17);
            this.FootLeft.setPos(-0.1F, 2.8F, -1.3F);
            this.FootLeft.addBox(-1.0F, 0.0F, -0.9F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 30);
            this.Head.setPos(0.0F, -4.5F, -0.5F);
            this.Head.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.17453292519943295F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 8, 43);
            this.EarLeft.setPos(1.5F, -1.0F, 0.8F);
            this.EarLeft.addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.3490658503988659F, -0.2617993877991494F, 0.3490658503988659F);
            this.LowerLegLeft = new ModelRenderer(this, 22, 21);
            this.LowerLegLeft.setPos(-0.1F, 3.8F, 2.0F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.4363323129985824F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 22, 15);
            this.UpperLegRight.setPos(0.1F, 4.0F, -1.0F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.4363323129985824F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 0, 38);
            this.Nose.setPos(0.0F, 0.2F, -0.1F);
            this.Nose.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.3789109646290024F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 33, 17);
            this.FootRight.setPos(0.1F, 2.8F, -1.3F);
            this.FootRight.addBox(-1.0F, 0.0F, -0.9F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Hips.addChild(this.ThighLeft);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.Head.addChild(this.EarRight);
            this.ArmRight.addChild(this.ForearmRight);
            this.Chest.addChild(this.Neck1);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Head.addChild(this.Mouth);
            this.Head.addChild(this.TopMouth);
            this.Hips.addChild(this.ThighRight);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Chest.addChild(this.ArmBaseLeft);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Chest.addChild(this.Body);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.ForearmRight.addChild(this.HandRight);
            this.Hips.addChild(this.Tail);
            this.Body.addChild(this.Hips);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Neck1.addChild(this.Head);
            this.Head.addChild(this.EarLeft);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.TopMouth.addChild(this.Nose);
            this.LowerLegRight.addChild(this.FootRight);
            this.saveBase();

        }

        @Override
        public void setupAnim(KlipspringerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.7f;
            float degree = 0.6f;
         }
    }
}
