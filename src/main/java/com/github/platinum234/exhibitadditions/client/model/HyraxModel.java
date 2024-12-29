package com.github.platinum234.exhibitadditions.client.model;

import com.github.platinum234.exhibitadditions.entity.HyraxEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class HyraxModel extends ZawaBaseModel<HyraxEntity> {
    public ModelRenderer Hips;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Hips);
        }

        return this.parts;
    }

    public static class Adult extends HyraxModel {

        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Rump;
        public ModelRenderer Body;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Neck;
        public ModelRenderer Belly;
        public ModelRenderer ArmLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer Head;
        public ModelRenderer LowerNeck;
        public ModelRenderer SnoutRight;
        public ModelRenderer Nose;
        public ModelRenderer SnoutLeft;
        public ModelRenderer Mouth;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer CheekLeft;
        public ModelRenderer CheekRight;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;


        public Adult() {
            this.texWidth = 42;
            this.texHeight = 32;
            this.Neck = new ModelRenderer(this, 14, 8);
            this.Neck.setPos(0.0F, 0.7F, -3.3F);
            this.Neck.addBox(-1.0F, -0.8F, -0.9F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.7740534966278743F, 0.0F, 0.0F);
            this.Rump = new ModelRenderer(this, 30, 14);
            this.Rump.setPos(0.0F, -2.0F, 1.5F);
            this.Rump.addBox(-2.0F, -0.5F, 0.0F, 4.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Rump, -0.4098033003787853F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 25, 0);
            this.ArmLeft.setPos(1.1F, 2.1F, -2.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.04555309164612875F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 13, 0);
            this.HandLeft.setPos(0.0F, 2.5F, -0.5F);
            this.HandLeft.addBox(-1.0F, -0.3F, -0.7F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.0911061832922575F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 12, 2);
            this.Mouth.setPos(0.0F, 1.0F, -0.9F);
            this.Mouth.addBox(-1.0F, -0.5F, -1.4F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.04555309164612875F, 0.0F, 0.0F);
            this.CheekLeft = new ModelRenderer(this, 0, 0);
            this.CheekLeft.mirror = true;
            this.CheekLeft.setPos(1.0F, 0.6F, 0.01F);
            this.CheekLeft.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekLeft, 0.0F, 0.0F, -0.0911061832922575F);
            this.SnoutRight = new ModelRenderer(this, 16, 5);
            this.SnoutRight.mirror = true;
            this.SnoutRight.setPos(-0.25F, 0.5F, -1.0F);
            this.SnoutRight.addBox(-0.8F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(SnoutRight, 0.13665927909957545F, 0.0F, -0.04555309164612875F);
            this.Nose = new ModelRenderer(this, 9, 5);
            this.Nose.setPos(0.0F, -0.1F, 0.0F);
            this.Nose.addBox(-0.5F, -0.7F, -2.6F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.3186971254089062F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 20, 0);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.0F, 1.4F, 0.5F);
            this.ForearmRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.3186971254089062F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 18, 22);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.1F, 2.0F, -1.0F);
            this.LegRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.5462880425584197F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 6);
            this.EarRight.setPos(-1.3F, -0.6F, 1.0F);
            this.EarRight.addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.27314402127920984F, -1.2747885016356248F, 0.0F);
            this.LowerNeck = new ModelRenderer(this, 24, 8);
            this.LowerNeck.setPos(0.0F, 1.5F, 0.0F);
            this.LowerNeck.addBox(-1.0F, 0.1F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerNeck, 0.2275909337942703F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 22);
            this.Hips.setPos(0.0F, 19.4F, 1.7F);
            this.Hips.addBox(-2.5F, -2.5F, -2.0F, 5.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, 0.008726646259971648F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 8);
            this.Head.setPos(0.0F, 1.0F, -1.0F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.5462880425584197F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 20, 16);
            this.ThighLeft.setPos(1.6F, -0.1F, 0.3F);
            this.ThighLeft.addBox(-1.0F, -0.3F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.CheekRight = new ModelRenderer(this, 0, 0);
            this.CheekRight.setPos(-1.0F, 0.6F, 0.01F);
            this.CheekRight.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekRight, 0.0F, 0.0F, 0.0911061832922575F);
            this.FootLeft = new ModelRenderer(this, 25, 23);
            this.FootLeft.setPos(0.0F, 2.5F, 0.7F);
            this.FootLeft.addBox(-1.0F, 0.0F, -2.5F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.5462880425584197F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 6);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.3F, -0.6F, 1.0F);
            this.EarLeft.addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.27314402127920984F, 1.2747885016356248F, 0.0F);
            this.Belly = new ModelRenderer(this, 14, 27);
            this.Belly.setPos(0.0F, 3.5F, -2.8F);
            this.Belly.addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 4.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Belly, -0.3186971254089062F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 20, 16);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.6F, -0.1F, 0.3F);
            this.ThighRight.addBox(-1.0F, -0.3F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 25, 23);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 2.5F, 0.7F);
            this.FootRight.addBox(-1.0F, 0.0F, -2.5F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.5462880425584197F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 18, 22);
            this.LegLeft.setPos(0.1F, 2.0F, -1.0F);
            this.LegLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.5462880425584197F, 0.0F, 0.0F);
            this.SnoutLeft = new ModelRenderer(this, 16, 5);
            this.SnoutLeft.setPos(0.25F, 0.5F, -1.0F);
            this.SnoutLeft.addBox(-0.2F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(SnoutLeft, 0.13665927909957545F, 0.0F, 0.0911061832922575F);
            this.Body = new ModelRenderer(this, 4, 14);
            this.Body.setPos(0.0F, -2.3F, -2.5F);
            this.Body.addBox(-2.0F, 0.0F, -3.5F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.27314402127920984F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 20, 0);
            this.ForearmLeft.setPos(0.0F, 1.4F, 0.5F);
            this.ForearmLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.3186971254089062F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 25, 0);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-1.1F, 2.1F, -2.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.04555309164612875F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 13, 0);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 2.5F, -0.5F);
            this.HandRight.addBox(-1.0F, -0.3F, -0.7F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.0911061832922575F, 0.0F, 0.0F);
            this.Body.addChild(this.Neck);
            this.Hips.addChild(this.Rump);
            this.Body.addChild(this.ArmLeft);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.Mouth);
            this.Head.addChild(this.CheekLeft);
            this.Head.addChild(this.SnoutRight);
            this.Head.addChild(this.Nose);
            this.ArmRight.addChild(this.ForearmRight);
            this.ThighRight.addChild(this.LegRight);
            this.Head.addChild(this.EarRight);
            this.Neck.addChild(this.LowerNeck);
            this.Neck.addChild(this.Head);
            this.Hips.addChild(this.ThighLeft);
            this.Head.addChild(this.CheekRight);
            this.LegLeft.addChild(this.FootLeft);
            this.Head.addChild(this.EarLeft);
            this.Body.addChild(this.Belly);
            this.Hips.addChild(this.ThighRight);
            this.LegRight.addChild(this.FootRight);
            this.ThighLeft.addChild(this.LegLeft);
            this.Head.addChild(this.SnoutLeft);
            this.Hips.addChild(this.Body);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Body.addChild(this.ArmRight);
            this.ForearmRight.addChild(this.HandRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(HyraxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.546F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0f;
            float degree = 1.0f;
            this.Head.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.05F) * degree * -0.1F * limbSwingAmount + 0.546F;
            this.EarLeft.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.273F;
            this.EarRight.xRot = MathHelper.cos(-1.5F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.273F;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.05F) * degree * 0.1F * limbSwingAmount - 0.774F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();

            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;

            } else {
                float speed = 1.0f;
                float degree = 0.6f;
                this.ArmLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.045F;
                this.HandLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.091F;
                this.ArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.045F;
                this.HandRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.091F;

                this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
                this.LegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.546F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.546F;
                this.ThighRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F;
                this.LegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.546F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.546F;

                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.15F * limbSwingAmount * 0.5F + (this.isSwimming ? -0.2F : 0.273F);
                this.Hips.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * -0.17F * limbSwingAmount * 0.5F + 0.008F;
                this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F - 0.774F;

            }
        }
    }


    public static class Child extends HyraxModel {

        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Rump;
        public ModelRenderer Body;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Neck;
        public ModelRenderer Belly;
        public ModelRenderer ArmLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer Head;
        public ModelRenderer LowerNeck;
        public ModelRenderer SnoutRight;
        public ModelRenderer Nose;
        public ModelRenderer SnoutLeft;
        public ModelRenderer Mouth;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer CheekLeft;
        public ModelRenderer CheekRight;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;


        public Child() {
            this.texWidth = 42;
            this.texHeight = 32;
            this.Neck = new ModelRenderer(this, 14, 8);
            this.Neck.setPos(0.0F, 0.7F, -3.3F);
            this.Neck.addBox(-1.0F, -0.8F, -0.9F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.7740534966278743F, 0.0F, 0.0F);
            this.Rump = new ModelRenderer(this, 30, 14);
            this.Rump.setPos(0.0F, -2.0F, 1.5F);
            this.Rump.addBox(-2.0F, -0.5F, 0.0F, 4.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Rump, -0.4098033003787853F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 25, 0);
            this.ArmLeft.setPos(1.1F, 2.1F, -2.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.04555309164612875F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 13, 0);
            this.HandLeft.setPos(0.0F, 2.5F, -0.5F);
            this.HandLeft.addBox(-1.0F, -0.3F, -0.7F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.0911061832922575F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 12, 2);
            this.Mouth.setPos(0.0F, 1.0F, -0.9F);
            this.Mouth.addBox(-1.0F, -0.5F, -1.4F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.04555309164612875F, 0.0F, 0.0F);
            this.CheekLeft = new ModelRenderer(this, 0, 0);
            this.CheekLeft.mirror = true;
            this.CheekLeft.setPos(1.0F, 0.6F, 0.01F);
            this.CheekLeft.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekLeft, 0.0F, 0.0F, -0.0911061832922575F);
            this.SnoutRight = new ModelRenderer(this, 16, 5);
            this.SnoutRight.mirror = true;
            this.SnoutRight.setPos(-0.25F, 0.5F, -1.0F);
            this.SnoutRight.addBox(-0.8F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(SnoutRight, 0.13665927909957545F, 0.0F, -0.04555309164612875F);
            this.Nose = new ModelRenderer(this, 9, 5);
            this.Nose.setPos(0.0F, -0.1F, 0.0F);
            this.Nose.addBox(-0.5F, -0.7F, -2.6F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.3186971254089062F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 20, 0);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.0F, 1.4F, 0.5F);
            this.ForearmRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.3186971254089062F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 18, 22);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.1F, 2.0F, -1.0F);
            this.LegRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.5462880425584197F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 6);
            this.EarRight.setPos(-1.3F, -0.6F, 1.0F);
            this.EarRight.addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.27314402127920984F, -1.2747885016356248F, 0.0F);
            this.LowerNeck = new ModelRenderer(this, 24, 8);
            this.LowerNeck.setPos(0.0F, 1.5F, 0.0F);
            this.LowerNeck.addBox(-1.0F, 0.1F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerNeck, 0.2275909337942703F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 22);
            this.Hips.setPos(0.0F, 19.4F, 1.7F);
            this.Hips.addBox(-2.5F, -2.5F, -2.0F, 5.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, 0.008726646259971648F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 8);
            this.Head.setPos(0.0F, 1.0F, -1.0F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.5462880425584197F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 20, 16);
            this.ThighLeft.setPos(1.6F, -0.1F, 0.3F);
            this.ThighLeft.addBox(-1.0F, -0.3F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.CheekRight = new ModelRenderer(this, 0, 0);
            this.CheekRight.setPos(-1.0F, 0.6F, 0.01F);
            this.CheekRight.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekRight, 0.0F, 0.0F, 0.0911061832922575F);
            this.FootLeft = new ModelRenderer(this, 25, 23);
            this.FootLeft.setPos(0.0F, 2.5F, 0.7F);
            this.FootLeft.addBox(-1.0F, 0.0F, -2.5F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.5462880425584197F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 6);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.3F, -0.6F, 1.0F);
            this.EarLeft.addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.27314402127920984F, 1.2747885016356248F, 0.0F);
            this.Belly = new ModelRenderer(this, 14, 27);
            this.Belly.setPos(0.0F, 3.5F, -2.8F);
            this.Belly.addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 4.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Belly, -0.3186971254089062F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 20, 16);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.6F, -0.1F, 0.3F);
            this.ThighRight.addBox(-1.0F, -0.3F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 25, 23);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 2.5F, 0.7F);
            this.FootRight.addBox(-1.0F, 0.0F, -2.5F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.5462880425584197F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 18, 22);
            this.LegLeft.setPos(0.1F, 2.0F, -1.0F);
            this.LegLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.5462880425584197F, 0.0F, 0.0F);
            this.SnoutLeft = new ModelRenderer(this, 16, 5);
            this.SnoutLeft.setPos(0.25F, 0.5F, -1.0F);
            this.SnoutLeft.addBox(-0.2F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(SnoutLeft, 0.13665927909957545F, 0.0F, 0.0911061832922575F);
            this.Body = new ModelRenderer(this, 4, 14);
            this.Body.setPos(0.0F, -2.3F, -2.5F);
            this.Body.addBox(-2.0F, 0.0F, -3.5F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.27314402127920984F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 20, 0);
            this.ForearmLeft.setPos(0.0F, 1.4F, 0.5F);
            this.ForearmLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.3186971254089062F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 25, 0);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-1.1F, 2.1F, -2.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.04555309164612875F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 13, 0);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 2.5F, -0.5F);
            this.HandRight.addBox(-1.0F, -0.3F, -0.7F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.0911061832922575F, 0.0F, 0.0F);
            this.Body.addChild(this.Neck);
            this.Hips.addChild(this.Rump);
            this.Body.addChild(this.ArmLeft);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.Mouth);
            this.Head.addChild(this.CheekLeft);
            this.Head.addChild(this.SnoutRight);
            this.Head.addChild(this.Nose);
            this.ArmRight.addChild(this.ForearmRight);
            this.ThighRight.addChild(this.LegRight);
            this.Head.addChild(this.EarRight);
            this.Neck.addChild(this.LowerNeck);
            this.Neck.addChild(this.Head);
            this.Hips.addChild(this.ThighLeft);
            this.Head.addChild(this.CheekRight);
            this.LegLeft.addChild(this.FootLeft);
            this.Head.addChild(this.EarLeft);
            this.Body.addChild(this.Belly);
            this.Hips.addChild(this.ThighRight);
            this.LegRight.addChild(this.FootRight);
            this.ThighLeft.addChild(this.LegLeft);
            this.Head.addChild(this.SnoutLeft);
            this.Hips.addChild(this.Body);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Body.addChild(this.ArmRight);
            this.ForearmRight.addChild(this.HandRight);
            this.saveBase();

        }

        @Override
        public void setupAnim(HyraxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.546F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0f;
            float degree = 1.0f;
            this.Head.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.05F) * degree * -0.1F * limbSwingAmount + 0.546F;
            this.EarLeft.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.273F;
            this.EarRight.xRot = MathHelper.cos(-1.5F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.273F;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.05F) * degree * 0.1F * limbSwingAmount - 0.774F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();

            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;

            } else {
                float speed = 1.0f;
                float degree = 0.6f;
                this.ArmLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.045F;
                this.HandLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.091F;
                this.ArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.045F;
                this.HandRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.091F;

                this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
                this.LegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.546F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.546F;
                this.ThighRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F;
                this.LegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.546F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.546F;

                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.15F * limbSwingAmount * 0.5F + (this.isSwimming ? -0.2F : 0.273F);
                this.Hips.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * -0.17F * limbSwingAmount * 0.5F + 0.008F;
                this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F - 0.774F;

            }
        }
    }
}
