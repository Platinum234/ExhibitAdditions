package com.github.platinum234.exhibitadditions.client.model;

import com.github.platinum234.exhibitadditions.entity.AllensSwampMonkeyEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class AllensSwampMonkeyModel extends ZawaBaseModel<AllensSwampMonkeyEntity> {
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

    public static class Adult extends AllensSwampMonkeyModel {

        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer Hips;
        public ModelRenderer Tail1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer Tail4;
        public ModelRenderer Tail5;
        public ModelRenderer Tail6;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Head;
        public ModelRenderer SideburnLeft;
        public ModelRenderer EyebrowRight;
        public ModelRenderer SideburnRight;
        public ModelRenderer Mouth;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer EyebrowLeft;
        public ModelRenderer TopMouth;
        public ModelRenderer Nose;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ThumbLeft;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;
        public ModelRenderer ThumbRight;


        public Adult() {
            this.texWidth = 48;
            this.texHeight = 48;
            this.FootRight = new ModelRenderer(this, 24, 38);
            this.FootRight.setPos(0.1F, 3.5F, -0.1F);
            this.FootRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.ThumbRight = new ModelRenderer(this, 0, 0);
            this.ThumbRight.setPos(0.5F, 0.05F, 0.1F);
            this.ThumbRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThumbRight, 0.0F, -0.33161255787892263F, 0.0F);
            this.Nose = new ModelRenderer(this, 19, 0);
            this.Nose.setPos(0.0F, 0.0F, 0.1F);
            this.Nose.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, -0.6923720823082175F, 0.0F, 0.0F);
            this.EyebrowRight = new ModelRenderer(this, 23, 18);
            this.EyebrowRight.mirror = true;
            this.EyebrowRight.setPos(0.0F, -1.9F, -2.2F);
            this.EyebrowRight.addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EyebrowRight, 0.10594148859211201F, 0.0F, -0.11693705655466871F);
            this.Neck = new ModelRenderer(this, 0, 31);
            this.Neck.setPos(0.0F, -0.3F, -1.3F);
            this.Neck.addBox(-1.5F, -2.5F, -2.0F, 3.0F, 4.0F, 3.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.2792526803190927F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 33, 1);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.7F, -1.9F, 0.2F);
            this.EarRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0F, -0.5715953300281429F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 30, 24);
            this.ThighLeft.setPos(2.2F, 1.8F, 1.1F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 19, 10);
            this.Mouth.setPos(0.0F, 2.0F, -1.5F);
            this.Mouth.addBox(-1.0F, -0.5F, -0.8F, 2.0F, 1.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 24, 38);
            this.FootLeft.setPos(-0.1F, 3.5F, -0.1F);
            this.FootLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 15, 33);
            this.ForearmLeft.setPos(-0.2F, 3.4F, 0.6F);
            this.ForearmLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.13962634015954636F, 0.0F, 0.13962634015954636F);
            this.HandLeft = new ModelRenderer(this, 24, 33);
            this.HandLeft.setPos(0.0F, 4.6F, -1.0F);
            this.HandLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.05235987755982988F, 0.0F, -0.13962634015954636F);
            this.EyebrowLeft = new ModelRenderer(this, 23, 18);
            this.EyebrowLeft.setPos(0.0F, -1.9F, -2.2F);
            this.EyebrowLeft.addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EyebrowLeft, 0.10594148859211201F, 0.0F, 0.11693705655466871F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 15.8F, -2.5F);
            this.Chest.addBox(-2.5F, -2.5F, -2.0F, 5.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.05951572899103476F, 0.0F, 0.0F);
            this.SideburnRight = new ModelRenderer(this, 25, 1);
            this.SideburnRight.mirror = true;
            this.SideburnRight.setPos(-1.6F, -1.5F, -1.6F);
            this.SideburnRight.addBox(-1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(SideburnRight, -0.14451325740459856F, 0.0F, -0.22689280275926282F);
            this.Tail6 = new ModelRenderer(this, 0, 38);
            this.Tail6.setPos(0.01F, 0.0F, 3.0F);
            this.Tail6.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail6, 0.20943951023931953F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 30, 24);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.2F, 1.8F, 1.1F);
            this.ThighRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 0, 38);
            this.Tail4.setPos(0.01F, 0.0F, 3.0F);
            this.Tail4.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail4, 0.2485348814892509F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 38);
            this.Tail1.setPos(0.0F, 0.0F, 3.0F);
            this.Tail1.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.9627236127369111F, 0.0F, 0.0F);
            this.ThumbLeft = new ModelRenderer(this, 0, 0);
            this.ThumbLeft.setPos(-0.5F, 0.05F, 0.1F);
            this.ThumbLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThumbLeft, 0.0F, 0.33161255787892263F, 0.0F);
            this.Head = new ModelRenderer(this, 27, 9);
            this.Head.setPos(0.0F, -0.6F, -2.3F);
            this.Head.addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.3717551173589867F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 15, 33);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.2F, 3.4F, 0.6F);
            this.ForearmRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.13962634015954636F, 0.0F, -0.13962634015954636F);
            this.LegLeft = new ModelRenderer(this, 35, 33);
            this.LegLeft.setPos(0.0F, 4.6F, -0.5F);
            this.LegLeft.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.08726646259971647F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 24, 33);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 4.6F, -1.0F);
            this.HandRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.05235987755982988F, 0.0F, 0.13962634015954636F);
            this.ArmLeft = new ModelRenderer(this, 17, 24);
            this.ArmLeft.setPos(2.1F, -0.6F, 0.0F);
            this.ArmLeft.addBox(-2.0F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.13962634015954636F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 33, 1);
            this.EarLeft.setPos(1.7F, -1.8F, 0.2F);
            this.EarLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0F, 0.5715953300281429F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 0, 38);
            this.Tail2.setPos(0.01F, 2.0F, 3.0F);
            this.Tail2.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.28763025273918225F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 35, 33);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.0F, 4.6F, -0.5F);
            this.LegRight.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.08726646259971647F, 0.0F, 0.0F);
            this.SideburnLeft = new ModelRenderer(this, 25, 1);
            this.SideburnLeft.setPos(1.6F, -1.5F, -1.6F);
            this.SideburnLeft.addBox(0.0F, 0.0F, 0.0F, 1.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(SideburnLeft, -0.14451325740459856F, 0.0F, 0.22689280275926282F);
            this.Tail5 = new ModelRenderer(this, 0, 38);
            this.Tail5.setPos(-0.01F, 0.0F, 3.0F);
            this.Tail5.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail5, 0.20943951023931953F, 0.0F, 0.0F);
            this.TopMouth = new ModelRenderer(this, 16, 6);
            this.TopMouth.setPos(0.0F, 1.0F, -2.6F);
            this.TopMouth.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopMouth, 0.25289820461923673F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 0, 38);
            this.Tail3.setPos(-0.01F, 0.0F, 3.0F);
            this.Tail3.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.28763025273918225F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 10);
            this.Body.setPos(0.0F, -2.5F, 0.5F);
            this.Body.addBox(-3.0F, 0.0F, -0.2F, 6.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.09145524880976123F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 22);
            this.Hips.setPos(0.0F, 0.0F, 5.5F);
            this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.1424188642995762F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 17, 24);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-2.1F, -0.6F, 0.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.13962634015954636F, 0.0F, 0.0F);
            this.LegRight.addChild(this.FootRight);
            this.HandRight.addChild(this.ThumbRight);
            this.TopMouth.addChild(this.Nose);
            this.Head.addChild(this.EyebrowRight);
            this.Chest.addChild(this.Neck);
            this.Head.addChild(this.EarRight);
            this.Hips.addChild(this.ThighLeft);
            this.Head.addChild(this.Mouth);
            this.LegLeft.addChild(this.FootLeft);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.EyebrowLeft);
            this.Head.addChild(this.SideburnRight);
            this.Tail5.addChild(this.Tail6);
            this.Hips.addChild(this.ThighRight);
            this.Tail3.addChild(this.Tail4);
            this.Hips.addChild(this.Tail1);
            this.HandLeft.addChild(this.ThumbLeft);
            this.Neck.addChild(this.Head);
            this.ArmRight.addChild(this.ForearmRight);
            this.ThighLeft.addChild(this.LegLeft);
            this.ForearmRight.addChild(this.HandRight);
            this.Chest.addChild(this.ArmLeft);
            this.Head.addChild(this.EarLeft);
            this.Tail1.addChild(this.Tail2);
            this.ThighRight.addChild(this.LegRight);
            this.Head.addChild(this.SideburnLeft);
            this.Tail4.addChild(this.Tail5);
            this.Head.addChild(this.TopMouth);
            this.Tail2.addChild(this.Tail3);
            this.Chest.addChild(this.Body);
            this.Body.addChild(this.Hips);
            this.Chest.addChild(this.ArmRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(AllensSwampMonkeyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Tail1.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isHeld ? -1.2F : -0.61F);
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F - 0.279F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 0.6f;
            this.ArmLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + 0.139F;
            this.HandLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.052F;
            this.ArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F + 0.139F;
            this.HandRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.052F;

            this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
            this.LegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.087F;
            this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F;
            this.ThighRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F;
            this.LegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.087F;
            this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F;

            this.Chest.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.15F * limbSwingAmount * 0.5F + (this.isSwimming ? -0.2F : -0.059F);
            this.Body.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * -0.17F * limbSwingAmount * 0.5F + 0.091F;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F - 0.279F;
            this.Tail1.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : -0.61F);
        }
    }


    public static class Child extends AllensSwampMonkeyModel {

        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Body;
        public ModelRenderer Tail1;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegRight;
        public ModelRenderer Right;
        public ModelRenderer Neck;
        public ModelRenderer ArmLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer Head;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Crest;
        public ModelRenderer Faceplate;
        public ModelRenderer Snout1;
        public ModelRenderer Snout2;
        public ModelRenderer Mouth;
        public ModelRenderer Nose;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer Tail4;
        public ModelRenderer Tail5;


        public Child() {
            this.texWidth = 48;
            this.texHeight = 32;
            this.FootLeft = new ModelRenderer(this, 0, 19);
            this.FootLeft.setPos(0.0F, 2.6F, 0.3F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.33161255787892263F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 22);
            this.Tail1.setPos(0.0F, -1.8F, 2.0F);
            this.Tail1.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.7155849933176751F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 22, 15);
            this.Head.setPos(0.0F, 0.2F, -1.8F);
            this.Head.addBox(-2.0F, -2.0F, -1.5F, 4.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.6408849226376065F, 0.0F, 0.0F);
            this.Right = new ModelRenderer(this, 0, 19);
            this.Right.mirror = true;
            this.Right.setPos(0.0F, 2.6F, 0.3F);
            this.Right.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Right, -0.33161255787892263F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 18.1F, 0.0F);
            this.Chest.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.08726646259971647F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 14, 13);
            this.ForearmLeft.setPos(-0.2F, 2.8F, 1.0F);
            this.ForearmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.4363323129985824F, 0.0F, 0.24434609527920614F);
            this.Tail4 = new ModelRenderer(this, 0, 22);
            this.Tail4.setPos(0.01F, 0.0F, 3.0F);
            this.Tail4.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail4, 0.3490658503988659F, 0.0F, 0.0F);
            this.Snout1 = new ModelRenderer(this, 18, 24);
            this.Snout1.setPos(0.0F, 0.4F, -1.4F);
            this.Snout1.addBox(-0.2F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout1, 0.1563815016444822F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 16, 0);
            this.Body.setPos(0.0F, -2.0F, -2.0F);
            this.Body.addBox(-1.5F, 0.0F, -4.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.22689280275926282F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 14, 13);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.2F, 2.8F, 1.0F);
            this.ForearmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.4363323129985824F, 0.0F, -0.24434609527920614F);
            this.Crest = new ModelRenderer(this, 27, 28);
            this.Crest.setPos(0.0F, -1.1F, 1.1F);
            this.Crest.addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 14, 18);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 2.8F, -1.7F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.20943951023931953F, 0.0F, 0.10471975511965977F);
            this.Tail3 = new ModelRenderer(this, 0, 22);
            this.Tail3.setPos(-0.01F, 0.0F, 3.0F);
            this.Tail3.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.3490658503988659F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 16, 21);
            this.Nose.setPos(0.0F, 0.0F, -0.9F);
            this.Nose.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.9382889765773795F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 0, 22);
            this.Tail2.setPos(0.01F, 2.0F, 3.0F);
            this.Tail2.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.3490658503988659F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 33, 15);
            this.EarLeft.setPos(1.5F, -0.5F, 0.2F);
            this.EarLeft.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.03490658503988659F, 0.6108652381980153F, 0.1308996938995747F);
            this.EarRight = new ModelRenderer(this, 33, 15);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.5F, -0.5F, 0.2F);
            this.EarRight.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.03490658503988659F, -0.6108652381980153F, -0.1308996938995747F);
            this.ThighRight = new ModelRenderer(this, 0, 8);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.3F, -0.9F, 1.3F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, -0.20943951023931953F, 0.0F, 0.0F);
            this.Tail5 = new ModelRenderer(this, 0, 22);
            this.Tail5.setPos(-0.0F, 0.0F, 3.0F);
            this.Tail5.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail5, 0.3490658503988659F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 23, 8);
            this.Neck.setPos(0.0F, 0.9F, -3.8F);
            this.Neck.addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.7239625657377646F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 8);
            this.ThighLeft.setPos(1.3F, -0.9F, 1.3F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, -0.20943951023931953F, 0.0F, 0.0F);
            this.Snout2 = new ModelRenderer(this, 18, 24);
            this.Snout2.mirror = true;
            this.Snout2.setPos(0.0F, 0.0F, 0.0F);
            this.Snout2.addBox(-0.8F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 18, 26);
            this.Mouth.setPos(0.0F, 0.4F, 0.1F);
            this.Mouth.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 14, 18);
            this.HandLeft.setPos(0.0F, 2.8F, -1.7F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.20943951023931953F, 0.0F, -0.10471975511965977F);
            this.ArmLeft = new ModelRenderer(this, 14, 8);
            this.ArmLeft.setPos(1.1F, 1.9F, -2.6F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.06981317007977318F, 0.0F, -0.13962634015954636F);
            this.LegRight = new ModelRenderer(this, 0, 14);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.0F, 4.0F, -1.0F);
            this.LegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, -0.1F, 0.0F, -0.1F);
            this.setRotateAngle(LegRight, 0.6457718232379019F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 0, 14);
            this.LegLeft.setPos(0.0F, 4.0F, -1.0F);
            this.LegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, -0.1F, 0.0F, -0.1F);
            this.setRotateAngle(LegLeft, 0.6457718232379019F, 0.0F, 0.0F);
            this.Faceplate = new ModelRenderer(this, 22, 22);
            this.Faceplate.setPos(0.0F, -0.4F, -1.3F);
            this.Faceplate.addBox(-1.5F, -1.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 14, 8);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-1.1F, 1.9F, -2.6F);
            this.ArmRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.06981317007977318F, 0.0F, 0.13962634015954636F);
            this.LegLeft.addChild(this.FootLeft);
            this.Chest.addChild(this.Tail1);
            this.Neck.addChild(this.Head);
            this.LegRight.addChild(this.Right);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Tail3.addChild(this.Tail4);
            this.Head.addChild(this.Snout1);
            this.Chest.addChild(this.Body);
            this.ArmRight.addChild(this.ForearmRight);
            this.Head.addChild(this.Crest);
            this.ForearmRight.addChild(this.HandRight);
            this.Tail2.addChild(this.Tail3);
            this.Snout1.addChild(this.Nose);
            this.Tail1.addChild(this.Tail2);
            this.Head.addChild(this.EarLeft);
            this.Head.addChild(this.EarRight);
            this.Chest.addChild(this.ThighRight);
            this.Tail4.addChild(this.Tail5);
            this.Body.addChild(this.Neck);
            this.Chest.addChild(this.ThighLeft);
            this.Snout1.addChild(this.Snout2);
            this.Snout1.addChild(this.Mouth);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Body.addChild(this.ArmLeft);
            this.ThighRight.addChild(this.LegRight);
            this.ThighLeft.addChild(this.LegLeft);
            this.Head.addChild(this.Faceplate);
            this.Body.addChild(this.ArmRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(AllensSwampMonkeyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float)Math.toRadians((double)netHeadYaw) * 0.5F;
            this.Head.yRot = (float)Math.toRadians((double)netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Tail1.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.1F + (float)Math.PI) * degree * 0.3F * limbSwingAmount * 0.5F - 0.715F;
            this.Tail2.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F + (float)Math.PI) * degree * 0.1F * limbSwingAmount * 0.5F + 0.349F;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.1F + (float)Math.PI) * degree * 0.2F * limbSwingAmount * 0.5F - 0.723F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.ArmLeft.xRot = MathHelper.cos(limbSwing * speed * 0.3F + (float)Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + 0.069F;
            this.ForearmLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + (float)Math.PI) * degree * -1.5F * limbSwingAmount * 0.5F - 0.436F;
            this.HandLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + (float)Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F + 0.209F;
            this.ArmRight.xRot = MathHelper.cos(limbSwing * speed * 0.3F + (float)Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F + 0.069F;
            this.ForearmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + (float)Math.PI) * degree * 1.5F * limbSwingAmount * 0.5F - 0.436F;
            this.HandRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + (float)Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + 0.209F;
            this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + (float)Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F - 0.309F;
            this.LegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + (float)Math.PI) * degree * -3.0F * limbSwingAmount * 0.5F + 0.645F;
            this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + (float)Math.PI) * degree * 1.5F * limbSwingAmount * 0.5F - 0.331F;
            this.ThighRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + (float)Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F - 0.309F;
            this.LegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + (float)Math.PI) * degree * 3.0F * limbSwingAmount * 0.5F + 0.645F;
            this.Right.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + (float)Math.PI) * degree * -1.5F * limbSwingAmount * 0.5F - 0.331F;
            this.Chest.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F + (float)Math.PI) * degree * 0.15F * limbSwingAmount * 0.5F + 0.226F;
            this.Body.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F + (float)Math.PI) * degree * -0.17F * limbSwingAmount * 0.5F - 0.087F;
            this.Tail1.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F + (float)Math.PI) * degree * 0.3F * limbSwingAmount * 0.5F - 0.715F;
            this.Tail2.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F + (float)Math.PI) * degree * 0.1F * limbSwingAmount * 0.5F + 0.349F;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.0F + (float)Math.PI) * degree * 0.0F * limbSwingAmount * 0.5F - 0.723F;

        }
    }
}