package com.github.platinum234.exhibitadditions.client.model;

import com.github.platinum234.exhibitadditions.entity.WallabyEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class WallabyModel extends ZawaBaseModel<WallabyEntity> {
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

    public static class Adult extends WallabyModel {

        public ModelRenderer RightArmBase;
        public ModelRenderer Neck;
        public ModelRenderer LeftArmBase;
        public ModelRenderer Body;
        public ModelRenderer RightArm;
        public ModelRenderer RightForeArm;
        public ModelRenderer RightHand;
        public ModelRenderer NeckLower;
        public ModelRenderer Head;
        public ModelRenderer NeckLower_1;
        public ModelRenderer Muzzle;
        public ModelRenderer LeftAntler;
        public ModelRenderer RightAntler;
        public ModelRenderer RightEar;
        public ModelRenderer LeftEar;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;
        public ModelRenderer LeftAntler_1;
        public ModelRenderer LeftAntler_2;
        public ModelRenderer RightAntler_1;
        public ModelRenderer RightAntler_2;
        public ModelRenderer LeftArm;
        public ModelRenderer LeftForearm;
        public ModelRenderer LeftHand;
        public ModelRenderer Hips;
        public ModelRenderer LeftThigh;
        public ModelRenderer RightThigh;
        public ModelRenderer Tail1;
        public ModelRenderer LeftUpperLeg;
        public ModelRenderer LeftLeg;
        public ModelRenderer LeftFoot;
        public ModelRenderer RightUpperLeg;
        public ModelRenderer RightLeg;
        public ModelRenderer RightFoot;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;


        public Adult() {
            this.texWidth = 64;
            this.texHeight = 48;
            this.LeftAntler_2 = new ModelRenderer(this, 41, 36);
            this.LeftAntler_2.setPos(0.0F, -3.9F, 1.1F);
            this.LeftAntler_2.addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftAntler_2, 0.5110324169681646F, 0.11728612207217244F, -0.35185837453889574F);
            this.Body = new ModelRenderer(this, 0, 9);
            this.Body.setPos(0.0F, -4.0F, 1.0F);
            this.Body.addBox(-3.5F, 0.0F, 0.0F, 7.0F, 8.0F, 11.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.2399827721492203F, 0.0F, 0.0F);
            this.RightForeArm = new ModelRenderer(this, 56, 28);
            this.RightForeArm.mirror = true;
            this.RightForeArm.setPos(0.1F, 3.0F, -2.5F);
            this.RightForeArm.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.LeftForearm = new ModelRenderer(this, 56, 28);
            this.LeftForearm.setPos(-0.1F, 3.0F, -2.5F);
            this.LeftForearm.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 42, 0);
            this.NeckLower.setPos(0.0F, 0.9F, -0.8F);
            this.NeckLower.addBox(-1.5F, -1.5F, -9.0F, 3.0F, 3.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.5913175692178064F, 0.0F, 0.0F);
            this.RightThigh = new ModelRenderer(this, 22, 28);
            this.RightThigh.mirror = true;
            this.RightThigh.setPos(-2.2F, 2.8F, 2.7F);
            this.RightThigh.addBox(-1.5F, 0.0F, -2.5F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightThigh, 0.2399827721492203F, 0.0F, 0.0F);
            this.Muzzle = new ModelRenderer(this, 25, 0);
            this.Muzzle.setPos(0.0F, -0.6F, -2.3F);
            this.Muzzle.addBox(-1.5F, 0.1F, -3.5F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Muzzle, 0.18291049761952247F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 12, 43);
            this.Tail3.setPos(0.0F, 3.0F, 0.0F);
            this.Tail3.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.LeftHand = new ModelRenderer(this, 0, 15);
            this.LeftHand.setPos(0.1F, 5.8F, 0.8F);
            this.LeftHand.addBox(-1.0F, -0.2F, -1.3F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.LeftAntler_1 = new ModelRenderer(this, 45, 39);
            this.LeftAntler_1.setPos(0.0F, -3.0F, 0.0F);
            this.LeftAntler_1.addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftAntler_1, -0.4663519641486599F, 0.0F, 0.0F);
            this.RightHand = new ModelRenderer(this, 0, 15);
            this.RightHand.mirror = true;
            this.RightHand.setPos(-0.1F, 5.8F, 0.8F);
            this.RightHand.addBox(-1.0F, -0.2F, -1.3F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.RightLeg = new ModelRenderer(this, 33, 39);
            this.RightLeg.mirror = true;
            this.RightLeg.setPos(0.1F, 5.0F, 2.5F);
            this.RightLeg.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightLeg, -0.30997047914893455F, 0.0F, 0.0F);
            this.LeftArmBase = new ModelRenderer(this, 36, 27);
            this.LeftArmBase.setPos(1.9F, 0.5F, -0.5F);
            this.LeftArmBase.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftArmBase, 0.279950827998857F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 28);
            this.Hips.setPos(0.0F, 0.0F, 11.0F);
            this.Hips.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.3490658503988659F, 0.0F, 0.0F);
            this.LeftAntler = new ModelRenderer(this, 41, 40);
            this.LeftAntler.setPos(1.3F, -1.9F, -2.0F);
            this.LeftAntler.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.1F, 0.1F, 0.1F);
            this.setRotateAngle(LeftAntler, -0.3490658503988659F, 0.0F, 0.3127630032889644F);
            this.RightEar = new ModelRenderer(this, 0, 9);
            this.RightEar.mirror = true;
            this.RightEar.setPos(-2.0F, -1.3F, 0.4F);
            this.RightEar.addBox(0.0F, -3.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightEar, -0.8000589317773618F, -0.7009242249377616F, -0.10471975511965977F);
            this.RightArm = new ModelRenderer(this, 46, 25);
            this.RightArm.mirror = true;
            this.RightArm.setPos(0.0F, 5.0F, 1.6F);
            this.RightArm.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightArm, -0.06998770699971425F, 0.0F, 0.0F);
            this.RightAntler_1 = new ModelRenderer(this, 45, 39);
            this.RightAntler_1.mirror = true;
            this.RightAntler_1.setPos(0.0F, -3.0F, 0.0F);
            this.RightAntler_1.addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightAntler_1, -0.4663519641486599F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 40);
            this.Tail1.setPos(0.0F, 0.0F, 5.0F);
            this.Tail1.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.3000221077388891F, 0.015009831816822585F, 0.0F);
            this.LeftLeg = new ModelRenderer(this, 33, 39);
            this.LeftLeg.setPos(-0.1F, 5.0F, 2.5F);
            this.LeftLeg.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftLeg, -0.30997047914893455F, 0.0F, 0.0F);
            this.RightFoot = new ModelRenderer(this, 0, 15);
            this.RightFoot.mirror = true;
            this.RightFoot.setPos(-0.1F, 4.8F, -1.2F);
            this.RightFoot.addBox(-1.0F, -0.2F, -1.3F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFoot, 0.04991641477611458F, 0.0F, 0.0F);
            this.RightArmBase = new ModelRenderer(this, 36, 27);
            this.RightArmBase.mirror = true;
            this.RightArmBase.setPos(-1.9F, 0.5F, -0.5F);
            this.RightArmBase.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightArmBase, 0.279950827998857F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 4, 41);
            this.Tail2.setPos(0.0F, 4.8F, -0.5F);
            this.Tail2.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.056723200689815706F, 0.0F, -0.0031415927784254694F);
            this.Head = new ModelRenderer(this, 0, 0);
            this.Head.setPos(0.0F, 0.2F, -8.9F);
            this.Head.addBox(-2.0F, -2.0F, -3.0F, 4.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 1.471836190164751F, -0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 18, 5);
            this.Mouth.setPos(0.0F, 1.9F, -0.7F);
            this.Mouth.addBox(-1.0F, -0.2F, -2.6F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.06981317007977318F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 36, 12);
            this.Chest.setPos(0.0F, 8.0F, -6.5F);
            this.Chest.addBox(-3.0F, -4.0F, -3.0F, 6.0F, 7.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.20996310435438595F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 25, 6);
            this.Neck.setPos(0.0F, -0.8F, -2.7F);
            this.Neck.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.5827654265882622F, 0.0F, 0.0F);
            this.LeftArm = new ModelRenderer(this, 46, 25);
            this.LeftArm.setPos(0.0F, 5.0F, 1.6F);
            this.LeftArm.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftArm, -0.06998770699971425F, 0.0F, 0.0F);
            this.NeckLower_1 = new ModelRenderer(this, 42, 35);
            this.NeckLower_1.setPos(0.0F, 2.3F, 0.0F);
            this.NeckLower_1.addBox(-1.0F, -2.0F, -9.0F, 2.0F, 2.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower_1, -0.04398229681736197F, 0.0F, 0.0F);
            this.LeftFoot = new ModelRenderer(this, 0, 15);
            this.LeftFoot.setPos(0.1F, 4.8F, -1.2F);
            this.LeftFoot.addBox(-1.0F, -0.2F, -1.3F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFoot, 0.04991641477611458F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 13, 0);
            this.TopSnout.setPos(-0.1F, -0.8F, -0.3F);
            this.TopSnout.addBox(-1.0F, 0.0F, -3.4F, 2.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.2227040165492181F, 0.0F, 0.0F);
            this.RightAntler_2 = new ModelRenderer(this, 41, 36);
            this.RightAntler_2.mirror = true;
            this.RightAntler_2.setPos(0.0F, -3.9F, 1.1F);
            this.RightAntler_2.addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightAntler_2, 0.5110324169681646F, -0.11728612207217244F, 0.35185837453889574F);
            this.LeftEar = new ModelRenderer(this, 0, 9);
            this.LeftEar.setPos(2.0F, -1.3F, 0.4F);
            this.LeftEar.addBox(-1.0F, -3.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftEar, -0.8000589317773618F, 0.7009242249377616F, 0.10471975511965977F);
            this.LeftThigh = new ModelRenderer(this, 22, 28);
            this.LeftThigh.setPos(2.2F, 2.8F, 2.7F);
            this.LeftThigh.addBox(-1.5F, 0.0F, -2.5F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftThigh, 0.2399827721492203F, 0.0F, 0.0F);
            this.LeftUpperLeg = new ModelRenderer(this, 23, 38);
            this.LeftUpperLeg.setPos(0.0F, 6.0F, -2.2F);
            this.LeftUpperLeg.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftUpperLeg, 0.3499385017090576F, 0.0F, 0.0F);
            this.RightAntler = new ModelRenderer(this, 41, 40);
            this.RightAntler.mirror = true;
            this.RightAntler.setPos(-1.3F, -1.9F, -2.0F);
            this.RightAntler.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.1F, 0.1F, 0.1F);
            this.setRotateAngle(RightAntler, -0.3490658503988659F, 0.0F, -0.3127630032889644F);
            this.RightUpperLeg = new ModelRenderer(this, 23, 38);
            this.RightUpperLeg.mirror = true;
            this.RightUpperLeg.setPos(0.0F, 6.0F, -2.2F);
            this.RightUpperLeg.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightUpperLeg, 0.3499385017090576F, 0.0F, 0.0F);
            this.LeftAntler_1.addChild(this.LeftAntler_2);
            this.Chest.addChild(this.Body);
            this.RightArm.addChild(this.RightForeArm);
            this.LeftArm.addChild(this.LeftForearm);
            this.Neck.addChild(this.NeckLower);
            this.Hips.addChild(this.RightThigh);
            this.Head.addChild(this.Muzzle);
            this.Tail2.addChild(this.Tail3);
            this.LeftForearm.addChild(this.LeftHand);
            this.LeftAntler.addChild(this.LeftAntler_1);
            this.RightForeArm.addChild(this.RightHand);
            this.RightUpperLeg.addChild(this.RightLeg);
            this.Chest.addChild(this.LeftArmBase);
            this.Body.addChild(this.Hips);
            this.Head.addChild(this.LeftAntler);
            this.Head.addChild(this.RightEar);
            this.RightArmBase.addChild(this.RightArm);
            this.RightAntler.addChild(this.RightAntler_1);
            this.Hips.addChild(this.Tail1);
            this.LeftUpperLeg.addChild(this.LeftLeg);
            this.RightLeg.addChild(this.RightFoot);
            this.Chest.addChild(this.RightArmBase);
            this.Tail1.addChild(this.Tail2);
            this.NeckLower.addChild(this.Head);
            this.Muzzle.addChild(this.Mouth);
            this.Chest.addChild(this.Neck);
            this.LeftArmBase.addChild(this.LeftArm);
            this.NeckLower.addChild(this.NeckLower_1);
            this.LeftLeg.addChild(this.LeftFoot);
            this.Muzzle.addChild(this.TopSnout);
            this.RightAntler_1.addChild(this.RightAntler_2);
            this.Head.addChild(this.LeftEar);
            this.Hips.addChild(this.LeftThigh);
            this.LeftThigh.addChild(this.LeftUpperLeg);
            this.Head.addChild(this.RightAntler);
            this.RightThigh.addChild(this.RightUpperLeg);
            this.saveBase();
        }

        @Override
        public void setupAnim(WallabyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.47F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.583F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 1.47F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 0.8f;
                float degree = 0.5f;

            } else {
                float speed = 1.1f;
                float degree = 0.6f;
                this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.583F;
                this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 1.47F;

                this.Chest.y = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 8.0F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.209F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.239F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.349F;

                this.LeftArmBase.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.279F;
                this.LeftArm.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.069F;
                this.LeftForearm.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F;
                this.LeftHand.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.RightArmBase.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.279F;
                this.RightArm.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.069F;
                this.RightForeArm.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F;
                this.RightHand.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;

                this.LeftThigh.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.239F;
                this.LeftUpperLeg.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.349F;
                this.LeftLeg.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.309F;
                this.LeftFoot.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.049F;
                this.RightThigh.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.239F;
                this.RightUpperLeg.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.349F;
                this.RightLeg.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.309F;
                this.RightFoot.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.049F;
            }
        }
    }


    public static class Child extends WallabyModel {

        public ModelRenderer RightArmBase;
        public ModelRenderer Neck;
        public ModelRenderer LeftArmBase;
        public ModelRenderer Body;
        public ModelRenderer RightArm;
        public ModelRenderer RightForeArm;
        public ModelRenderer RightHand;
        public ModelRenderer NeckLower;
        public ModelRenderer Head;
        public ModelRenderer NeckLower_1;
        public ModelRenderer Muzzle;
        public ModelRenderer LeftAntler;
        public ModelRenderer RightAntler;
        public ModelRenderer RightEar;
        public ModelRenderer LeftEar;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;
        public ModelRenderer LeftAntler_1;
        public ModelRenderer LeftAntler_2;
        public ModelRenderer RightAntler_1;
        public ModelRenderer RightAntler_2;
        public ModelRenderer LeftArm;
        public ModelRenderer LeftForearm;
        public ModelRenderer LeftHand;
        public ModelRenderer Hips;
        public ModelRenderer LeftThigh;
        public ModelRenderer RightThigh;
        public ModelRenderer Tail1;
        public ModelRenderer LeftUpperLeg;
        public ModelRenderer LeftLeg;
        public ModelRenderer LeftFoot;
        public ModelRenderer RightUpperLeg;
        public ModelRenderer RightLeg;
        public ModelRenderer RightFoot;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;

        public Child() {
            this.texWidth = 64;
            this.texHeight = 48;
            this.LeftAntler_2 = new ModelRenderer(this, 41, 36);
            this.LeftAntler_2.setPos(0.0F, -3.9F, 1.1F);
            this.LeftAntler_2.addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftAntler_2, 0.5110324169681646F, 0.11728612207217244F, -0.35185837453889574F);
            this.Body = new ModelRenderer(this, 0, 9);
            this.Body.setPos(0.0F, -4.0F, 1.0F);
            this.Body.addBox(-3.5F, 0.0F, 0.0F, 7.0F, 8.0F, 11.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.2399827721492203F, 0.0F, 0.0F);
            this.RightForeArm = new ModelRenderer(this, 56, 28);
            this.RightForeArm.mirror = true;
            this.RightForeArm.setPos(0.1F, 3.0F, -2.5F);
            this.RightForeArm.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.LeftForearm = new ModelRenderer(this, 56, 28);
            this.LeftForearm.setPos(-0.1F, 3.0F, -2.5F);
            this.LeftForearm.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 42, 0);
            this.NeckLower.setPos(0.0F, 0.9F, -0.8F);
            this.NeckLower.addBox(-1.5F, -1.5F, -9.0F, 3.0F, 3.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.5913175692178064F, 0.0F, 0.0F);
            this.RightThigh = new ModelRenderer(this, 22, 28);
            this.RightThigh.mirror = true;
            this.RightThigh.setPos(-2.2F, 2.8F, 2.7F);
            this.RightThigh.addBox(-1.5F, 0.0F, -2.5F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightThigh, 0.2399827721492203F, 0.0F, 0.0F);
            this.Muzzle = new ModelRenderer(this, 25, 0);
            this.Muzzle.setPos(0.0F, -0.6F, -2.3F);
            this.Muzzle.addBox(-1.5F, 0.1F, -3.5F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Muzzle, 0.18291049761952247F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 12, 43);
            this.Tail3.setPos(0.0F, 3.0F, 0.0F);
            this.Tail3.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.LeftHand = new ModelRenderer(this, 0, 15);
            this.LeftHand.setPos(0.1F, 5.8F, 0.8F);
            this.LeftHand.addBox(-1.0F, -0.2F, -1.3F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.LeftAntler_1 = new ModelRenderer(this, 45, 39);
            this.LeftAntler_1.setPos(0.0F, -3.0F, 0.0F);
            this.LeftAntler_1.addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftAntler_1, -0.4663519641486599F, 0.0F, 0.0F);
            this.RightHand = new ModelRenderer(this, 0, 15);
            this.RightHand.mirror = true;
            this.RightHand.setPos(-0.1F, 5.8F, 0.8F);
            this.RightHand.addBox(-1.0F, -0.2F, -1.3F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.RightLeg = new ModelRenderer(this, 33, 39);
            this.RightLeg.mirror = true;
            this.RightLeg.setPos(0.1F, 5.0F, 2.5F);
            this.RightLeg.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightLeg, -0.30997047914893455F, 0.0F, 0.0F);
            this.LeftArmBase = new ModelRenderer(this, 36, 27);
            this.LeftArmBase.setPos(1.9F, 0.5F, -0.5F);
            this.LeftArmBase.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftArmBase, 0.279950827998857F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 28);
            this.Hips.setPos(0.0F, 0.0F, 11.0F);
            this.Hips.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.3490658503988659F, 0.0F, 0.0F);
            this.LeftAntler = new ModelRenderer(this, 41, 40);
            this.LeftAntler.setPos(1.3F, -1.9F, -2.0F);
            this.LeftAntler.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.1F, 0.1F, 0.1F);
            this.setRotateAngle(LeftAntler, -0.3490658503988659F, 0.0F, 0.3127630032889644F);
            this.RightEar = new ModelRenderer(this, 0, 9);
            this.RightEar.mirror = true;
            this.RightEar.setPos(-2.0F, -1.3F, 0.4F);
            this.RightEar.addBox(0.0F, -3.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightEar, -0.8000589317773618F, -0.7009242249377616F, -0.10471975511965977F);
            this.RightArm = new ModelRenderer(this, 46, 25);
            this.RightArm.mirror = true;
            this.RightArm.setPos(0.0F, 5.0F, 1.6F);
            this.RightArm.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightArm, -0.06998770699971425F, 0.0F, 0.0F);
            this.RightAntler_1 = new ModelRenderer(this, 45, 39);
            this.RightAntler_1.mirror = true;
            this.RightAntler_1.setPos(0.0F, -3.0F, 0.0F);
            this.RightAntler_1.addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightAntler_1, -0.4663519641486599F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 40);
            this.Tail1.setPos(0.0F, 0.0F, 5.0F);
            this.Tail1.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.3000221077388891F, 0.015009831816822585F, 0.0F);
            this.LeftLeg = new ModelRenderer(this, 33, 39);
            this.LeftLeg.setPos(-0.1F, 5.0F, 2.5F);
            this.LeftLeg.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftLeg, -0.30997047914893455F, 0.0F, 0.0F);
            this.RightFoot = new ModelRenderer(this, 0, 15);
            this.RightFoot.mirror = true;
            this.RightFoot.setPos(-0.1F, 4.8F, -1.2F);
            this.RightFoot.addBox(-1.0F, -0.2F, -1.3F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFoot, 0.04991641477611458F, 0.0F, 0.0F);
            this.RightArmBase = new ModelRenderer(this, 36, 27);
            this.RightArmBase.mirror = true;
            this.RightArmBase.setPos(-1.9F, 0.5F, -0.5F);
            this.RightArmBase.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightArmBase, 0.279950827998857F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 4, 41);
            this.Tail2.setPos(0.0F, 4.8F, -0.5F);
            this.Tail2.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.056723200689815706F, 0.0F, -0.0031415927784254694F);
            this.Head = new ModelRenderer(this, 0, 0);
            this.Head.setPos(0.0F, 0.2F, -8.9F);
            this.Head.addBox(-2.0F, -2.0F, -3.0F, 4.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 1.471836190164751F, -0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 18, 5);
            this.Mouth.setPos(0.0F, 1.9F, -0.7F);
            this.Mouth.addBox(-1.0F, -0.2F, -2.6F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.06981317007977318F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 36, 12);
            this.Chest.setPos(0.0F, 8.0F, -6.5F);
            this.Chest.addBox(-3.0F, -4.0F, -3.0F, 6.0F, 7.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.20996310435438595F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 25, 6);
            this.Neck.setPos(0.0F, -0.8F, -2.7F);
            this.Neck.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.5827654265882622F, 0.0F, 0.0F);
            this.LeftArm = new ModelRenderer(this, 46, 25);
            this.LeftArm.setPos(0.0F, 5.0F, 1.6F);
            this.LeftArm.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftArm, -0.06998770699971425F, 0.0F, 0.0F);
            this.NeckLower_1 = new ModelRenderer(this, 42, 35);
            this.NeckLower_1.setPos(0.0F, 2.3F, 0.0F);
            this.NeckLower_1.addBox(-1.0F, -2.0F, -9.0F, 2.0F, 2.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower_1, -0.04398229681736197F, 0.0F, 0.0F);
            this.LeftFoot = new ModelRenderer(this, 0, 15);
            this.LeftFoot.setPos(0.1F, 4.8F, -1.2F);
            this.LeftFoot.addBox(-1.0F, -0.2F, -1.3F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFoot, 0.04991641477611458F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 13, 0);
            this.TopSnout.setPos(-0.1F, -0.8F, -0.3F);
            this.TopSnout.addBox(-1.0F, 0.0F, -3.4F, 2.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.2227040165492181F, 0.0F, 0.0F);
            this.RightAntler_2 = new ModelRenderer(this, 41, 36);
            this.RightAntler_2.mirror = true;
            this.RightAntler_2.setPos(0.0F, -3.9F, 1.1F);
            this.RightAntler_2.addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightAntler_2, 0.5110324169681646F, -0.11728612207217244F, 0.35185837453889574F);
            this.LeftEar = new ModelRenderer(this, 0, 9);
            this.LeftEar.setPos(2.0F, -1.3F, 0.4F);
            this.LeftEar.addBox(-1.0F, -3.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftEar, -0.8000589317773618F, 0.7009242249377616F, 0.10471975511965977F);
            this.LeftThigh = new ModelRenderer(this, 22, 28);
            this.LeftThigh.setPos(2.2F, 2.8F, 2.7F);
            this.LeftThigh.addBox(-1.5F, 0.0F, -2.5F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftThigh, 0.2399827721492203F, 0.0F, 0.0F);
            this.LeftUpperLeg = new ModelRenderer(this, 23, 38);
            this.LeftUpperLeg.setPos(0.0F, 6.0F, -2.2F);
            this.LeftUpperLeg.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftUpperLeg, 0.3499385017090576F, 0.0F, 0.0F);
            this.RightAntler = new ModelRenderer(this, 41, 40);
            this.RightAntler.mirror = true;
            this.RightAntler.setPos(-1.3F, -1.9F, -2.0F);
            this.RightAntler.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.1F, 0.1F, 0.1F);
            this.setRotateAngle(RightAntler, -0.3490658503988659F, 0.0F, -0.3127630032889644F);
            this.RightUpperLeg = new ModelRenderer(this, 23, 38);
            this.RightUpperLeg.mirror = true;
            this.RightUpperLeg.setPos(0.0F, 6.0F, -2.2F);
            this.RightUpperLeg.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightUpperLeg, 0.3499385017090576F, 0.0F, 0.0F);
            this.LeftAntler_1.addChild(this.LeftAntler_2);
            this.Chest.addChild(this.Body);
            this.RightArm.addChild(this.RightForeArm);
            this.LeftArm.addChild(this.LeftForearm);
            this.Neck.addChild(this.NeckLower);
            this.Hips.addChild(this.RightThigh);
            this.Head.addChild(this.Muzzle);
            this.Tail2.addChild(this.Tail3);
            this.LeftForearm.addChild(this.LeftHand);
            this.LeftAntler.addChild(this.LeftAntler_1);
            this.RightForeArm.addChild(this.RightHand);
            this.RightUpperLeg.addChild(this.RightLeg);
            this.Chest.addChild(this.LeftArmBase);
            this.Body.addChild(this.Hips);
            this.Head.addChild(this.LeftAntler);
            this.Head.addChild(this.RightEar);
            this.RightArmBase.addChild(this.RightArm);
            this.RightAntler.addChild(this.RightAntler_1);
            this.Hips.addChild(this.Tail1);
            this.LeftUpperLeg.addChild(this.LeftLeg);
            this.RightLeg.addChild(this.RightFoot);
            this.Chest.addChild(this.RightArmBase);
            this.Tail1.addChild(this.Tail2);
            this.NeckLower.addChild(this.Head);
            this.Muzzle.addChild(this.Mouth);
            this.Chest.addChild(this.Neck);
            this.LeftArmBase.addChild(this.LeftArm);
            this.NeckLower.addChild(this.NeckLower_1);
            this.LeftLeg.addChild(this.LeftFoot);
            this.Muzzle.addChild(this.TopSnout);
            this.RightAntler_1.addChild(this.RightAntler_2);
            this.Head.addChild(this.LeftEar);
            this.Hips.addChild(this.LeftThigh);
            this.LeftThigh.addChild(this.LeftUpperLeg);
            this.Head.addChild(this.RightAntler);
            this.RightThigh.addChild(this.RightUpperLeg);
            this.saveBase();

        }

        @Override
        public void setupAnim(WallabyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.47F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.583F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 1.47F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 0.8f;
                float degree = 0.5f;

            } else {
                float speed = 1.7f;
                float degree = 0.6f;
                this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.583F;
                this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 1.47F;

                this.Chest.y = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 8.0F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.209F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.239F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.349F;

                this.LeftArmBase.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.279F;
                this.LeftArm.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.069F;
                this.LeftForearm.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F;
                this.LeftHand.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.RightArmBase.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.279F;
                this.RightArm.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.069F;
                this.RightForeArm.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F;
                this.RightHand.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;

                this.LeftThigh.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.239F;
                this.LeftUpperLeg.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.349F;
                this.LeftLeg.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.309F;
                this.LeftFoot.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.049F;
                this.RightThigh.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.239F;
                this.RightUpperLeg.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.349F;
                this.RightLeg.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.309F;
                this.RightFoot.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.049F;
            }
        }
    }
}
