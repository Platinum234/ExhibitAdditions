package com.github.platinum234.exhibitadditions.client.model;

import com.github.platinum234.exhibitadditions.entity.LangurEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class LangurModel extends ZawaBaseModel<LangurEntity> {
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

    public static class Adult extends LangurModel {

        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer LeftArm;
        public ModelRenderer RightArm;
        public ModelRenderer Hips;
        public ModelRenderer LeftThigh;
        public ModelRenderer RightThigh;
        public ModelRenderer Tail1;
        public ModelRenderer LeftLeg;
        public ModelRenderer LeftFoot;
        public ModelRenderer RightLeg;
        public ModelRenderer RightFoot;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer Tail4;
        public ModelRenderer Tail5;
        public ModelRenderer Tail6;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer Forehead;
        public ModelRenderer LeftEar;
        public ModelRenderer RightEar;
        public ModelRenderer LeftCheek;
        public ModelRenderer RightCheek;
        public ModelRenderer LeftSideburn;
        public ModelRenderer RightSideburn;
        public ModelRenderer Nose;
        public ModelRenderer Crest;
        public ModelRenderer LeftForearm;
        public ModelRenderer LeftHand;
        public ModelRenderer LeftThumb;
        public ModelRenderer RightForearm;
        public ModelRenderer RightHand;
        public ModelRenderer RightThumb;


        public Adult() {
            this.texWidth = 80;
            this.texHeight = 64;
            this.Forehead = new ModelRenderer(this, 55, 5);
            this.Forehead.setPos(0.0F, -1.8F, -2.1F);
            this.Forehead.addBox(-2.0F, -1.0F, 0.0F, 4.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Forehead, 0.12269665007704787F, 0.0F, 0.0F);
            this.LeftCheek = new ModelRenderer(this, 58, 11);
            this.LeftCheek.setPos(1.6F, -0.5F, -1.0F);
            this.LeftCheek.addBox(0.0F, -0.3F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftCheek, -0.3839724354387525F, 0.0F, 0.3839724354387525F);
            this.LeftSideburn = new ModelRenderer(this, 60, 16);
            this.LeftSideburn.setPos(1.5F, -1.5F, -0.1F);
            this.LeftSideburn.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftSideburn, 0.0F, 0.0F, -0.2617993877991494F);
            this.RightCheek = new ModelRenderer(this, 58, 11);
            this.RightCheek.mirror = true;
            this.RightCheek.setPos(-1.5F, -0.4F, -1.0F);
            this.RightCheek.addBox(-2.0F, -0.3F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightCheek, -0.3839724354387525F, 0.0F, -0.3839724354387525F);
            this.LeftLeg = new ModelRenderer(this, 34, 33);
            this.LeftLeg.setPos(0.0F, 4.6F, -0.5F);
            this.LeftLeg.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftLeg, 0.08726646259971647F, 0.0F, 0.0F);
            this.RightThigh = new ModelRenderer(this, 30, 24);
            this.RightThigh.mirror = true;
            this.RightThigh.setPos(-2.3F, 4.4F, 1.6F);
            this.RightThigh.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightThigh, 0.020943951856169794F, 0.0F, 0.0F);
            this.LeftThumb = new ModelRenderer(this, 19, 13);
            this.LeftThumb.setPos(-0.9F, 0.1F, -0.4F);
            this.LeftThumb.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftThumb, 0.0F, 0.5410520681182421F, 0.0F);
            this.RightLeg = new ModelRenderer(this, 34, 33);
            this.RightLeg.mirror = true;
            this.RightLeg.setPos(0.0F, 4.6F, -0.6F);
            this.RightLeg.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightLeg, 0.08726646259971647F, 0.0F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 43, 19);
            this.Tail4.setPos(0.01F, 0.0F, 3.5F);
            this.Tail4.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail4, 0.0822050084347232F, 0.0F, 0.0F);
            this.LeftHand = new ModelRenderer(this, 30, 44);
            this.LeftHand.setPos(0.0F, 4.6F, -1.0F);
            this.LeftHand.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftHand, 0.05235987755982988F, 0.0F, -0.13962634015954636F);
            this.LeftThigh = new ModelRenderer(this, 30, 24);
            this.LeftThigh.setPos(2.3F, 4.4F, 1.6F);
            this.LeftThigh.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftThigh, 0.020943951856169794F, 0.0F, 0.0F);
            this.RightSideburn = new ModelRenderer(this, 60, 16);
            this.RightSideburn.mirror = true;
            this.RightSideburn.setPos(-1.6F, -1.5F, -0.1F);
            this.RightSideburn.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightSideburn, 0.0F, 0.0F, 0.2617993877991494F);
            this.Mouth = new ModelRenderer(this, 9, 7);
            this.Mouth.setPos(0.0F, 1.3F, -1.3F);
            this.Mouth.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 0.10471975511965977F, 0.0F, 0.0F);
            this.LeftEar = new ModelRenderer(this, 37, 1);
            this.LeftEar.setPos(2.0F, -2.0F, 0.0F);
            this.LeftEar.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftEar, 0.0F, 0.5715953300281429F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 28);
            this.Body.setPos(0.0F, -3.0F, 0.7F);
            this.Body.addBox(-3.5F, -0.3F, 0.0F, 7.0F, 7.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.10471975511965977F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 14);
            this.Chest.setPos(0.0F, 14.0F, -2.0F);
            this.Chest.addBox(-3.0F, -3.0F, -2.5F, 6.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 16, 4);
            this.Snout.setPos(0.0F, 0.0F, -1.6F);
            this.Snout.addBox(-1.0F, 0.0F, -1.3F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 43, 1);
            this.Tail1.setPos(0.0F, 0.2F, 2.7F);
            this.Tail1.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.49096110393861886F, 0.0F, 0.0F);
            this.RightArm = new ModelRenderer(this, 27, 5);
            this.RightArm.mirror = true;
            this.RightArm.setPos(-2.6F, 1.2F, -0.3F);
            this.RightArm.addBox(-1.0F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightArm, 0.08726646259971647F, 0.0F, 0.0F);
            this.RightFoot = new ModelRenderer(this, 39, 40);
            this.RightFoot.mirror = true;
            this.RightFoot.setPos(0.1F, 3.7F, 0.0F);
            this.RightFoot.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.LeftForearm = new ModelRenderer(this, 27, 15);
            this.LeftForearm.setPos(-0.2F, 3.6F, 0.7F);
            this.LeftForearm.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftForearm, -0.13962634015954636F, 0.0F, 0.13962634015954636F);
            this.RightThumb = new ModelRenderer(this, 19, 13);
            this.RightThumb.mirror = true;
            this.RightThumb.setPos(0.9F, 0.1F, -0.4F);
            this.RightThumb.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightThumb, 0.0F, -0.5410520681182421F, 0.0F);
            this.LeftArm = new ModelRenderer(this, 27, 5);
            this.LeftArm.setPos(2.6F, 1.2F, -0.3F);
            this.LeftArm.addBox(-2.0F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftArm, 0.08726646259971647F, 0.0F, 0.0F);
            this.Crest = new ModelRenderer(this, 57, 0);
            this.Crest.setPos(0.0F, -1.4F, 2.5F);
            this.Crest.addBox(-1.0F, -1.5F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest, -0.5235987755982988F, 0.0F, 0.0F);
            this.Tail6 = new ModelRenderer(this, 43, 31);
            this.Tail6.setPos(0.01F, 0.0F, 3.5F);
            this.Tail6.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail6, 0.20839230536442993F, 0.0F, 0.0F);
            this.RightForearm = new ModelRenderer(this, 27, 15);
            this.RightForearm.mirror = true;
            this.RightForearm.setPos(0.2F, 3.6F, 0.7F);
            this.RightForearm.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightForearm, -0.13962634015954636F, 0.0F, -0.13962634015954636F);
            this.Neck = new ModelRenderer(this, 20, 49);
            this.Neck.setPos(0.0F, -1.0F, -2.2F);
            this.Neck.addBox(-2.0F, -2.5F, -3.0F, 4.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.20298179400431135F, 0.0F, 0.0F);
            this.LeftFoot = new ModelRenderer(this, 39, 40);
            this.LeftFoot.setPos(-0.1F, 3.7F, 0.0F);
            this.LeftFoot.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.RightHand = new ModelRenderer(this, 30, 44);
            this.RightHand.mirror = true;
            this.RightHand.setPos(0.0F, 4.6F, -1.0F);
            this.RightHand.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightHand, 0.05235987755982988F, 0.0F, 0.13962634015954636F);
            this.Tail2 = new ModelRenderer(this, 43, 7);
            this.Tail2.setPos(0.01F, 0.0F, 3.5F);
            this.Tail2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.14137167606944342F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 43, 13);
            this.Tail3.setPos(-0.01F, 0.0F, 3.5F);
            this.Tail3.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.023736478076794236F, 0.0F, 0.0F);
            this.Tail5 = new ModelRenderer(this, 43, 25);
            this.Tail5.setPos(-0.01F, 0.0F, 3.5F);
            this.Tail5.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail5, 0.20839230536442993F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 24, 1);
            this.Nose.setPos(0.0F, -1.3F, 0.0F);
            this.Nose.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, -0.593411945678072F, 0.0F, 0.0F);
            this.RightEar = new ModelRenderer(this, 37, 1);
            this.RightEar.mirror = true;
            this.RightEar.setPos(-2.0F, -2.0F, 0.0F);
            this.RightEar.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightEar, 0.0F, -0.5715953300281429F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 52);
            this.Head.setPos(0.0F, 0.0F, -3.0F);
            this.Head.addBox(-2.5F, -2.5F, -2.0F, 5.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.22794000763415243F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 42);
            this.Hips.setPos(0.0F, 0.0F, 6.9F);
            this.Hips.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.19198621771937624F, 0.0F, 0.0F);
            this.Head.addChild(this.Forehead);
            this.Head.addChild(this.LeftCheek);
            this.Head.addChild(this.LeftSideburn);
            this.Head.addChild(this.RightCheek);
            this.LeftThigh.addChild(this.LeftLeg);
            this.Hips.addChild(this.RightThigh);
            this.LeftHand.addChild(this.LeftThumb);
            this.RightThigh.addChild(this.RightLeg);
            this.Tail3.addChild(this.Tail4);
            this.LeftForearm.addChild(this.LeftHand);
            this.Hips.addChild(this.LeftThigh);
            this.Head.addChild(this.RightSideburn);
            this.Head.addChild(this.Mouth);
            this.Head.addChild(this.LeftEar);
            this.Chest.addChild(this.Body);
            this.Head.addChild(this.Snout);
            this.Hips.addChild(this.Tail1);
            this.Chest.addChild(this.RightArm);
            this.RightLeg.addChild(this.RightFoot);
            this.LeftArm.addChild(this.LeftForearm);
            this.RightHand.addChild(this.RightThumb);
            this.Chest.addChild(this.LeftArm);
            this.Forehead.addChild(this.Crest);
            this.Tail5.addChild(this.Tail6);
            this.RightArm.addChild(this.RightForearm);
            this.Chest.addChild(this.Neck);
            this.LeftLeg.addChild(this.LeftFoot);
            this.RightForearm.addChild(this.RightHand);
            this.Tail1.addChild(this.Tail2);
            this.Tail2.addChild(this.Tail3);
            this.Tail4.addChild(this.Tail5);
            this.Snout.addChild(this.Nose);
            this.Head.addChild(this.RightEar);
            this.Neck.addChild(this.Head);
            this.Body.addChild(this.Hips);
            this.saveBase();
        }

        @Override
        public void setupAnim(LangurEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Tail1.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isHeld ? -1.2F : -0.49F);
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F - 0.203F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 0.7f;
                float degree = 0.7f;

                this.LeftThigh.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.5F * limbSwingAmount * 0.5F + 0.02F;
                this.LeftLeg.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.087F;
                this.LeftFoot.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F;
                this.RightThigh.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.5F * limbSwingAmount * 0.5F + 0.02F;
                this.RightLeg.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.087F;
                this.RightFoot.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F;

                this.Chest.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.7F * limbSwingAmount * 0.5F;
                this.Body.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.8F * limbSwingAmount * 0.5F + 0.091F;
                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + 14.0F;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.8F * limbSwingAmount * 0.5F - 0.202F;
                this.Head.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.4F * limbSwingAmount * 0.5F + 0.228F;

                this.Tail1.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F - 0.49F;
                this.LeftArm.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.087F;
                this.LeftHand.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -5.0F * limbSwingAmount * 0.5F + 0.052F;
                this.RightArm.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.087F;
                this.RightHand.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -5.0F * limbSwingAmount * 0.5F + 0.052F;

            } else {
                float speed = 1.0f;
                float degree = 0.6f;
                this.LeftArm.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + 0.087F;
                this.LeftHand.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.052F;
                this.RightArm.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F + 0.087F;
                this.RightHand.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.052F;

                this.LeftThigh.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.02F;
                this.LeftLeg.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.087F;
                this.LeftFoot.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F;
                this.RightThigh.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.02F;
                this.RightLeg.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.087F;
                this.RightFoot.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F;

                this.Chest.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.15F * limbSwingAmount * 0.5F + (this.isSwimming ? -0.2F : 0.0F);
                this.Body.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * -0.17F * limbSwingAmount * 0.5F + 0.091F;
                this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F - 0.202F;
                this.Tail1.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : -0.49F);

            }
        }
    }


    public static class Child extends LangurModel {

        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer LeftArm;
        public ModelRenderer RightArm;
        public ModelRenderer Hips;
        public ModelRenderer LeftThigh;
        public ModelRenderer RightThigh;
        public ModelRenderer Tail1;
        public ModelRenderer LeftLeg;
        public ModelRenderer LeftFoot;
        public ModelRenderer RightLeg;
        public ModelRenderer RightFoot;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer Tail4;
        public ModelRenderer Tail5;
        public ModelRenderer Tail6;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer Forehead;
        public ModelRenderer LeftEar;
        public ModelRenderer RightEar;
        public ModelRenderer LeftCheek;
        public ModelRenderer RightCheek;
        public ModelRenderer LeftSideburn;
        public ModelRenderer RightSideburn;
        public ModelRenderer Nose;
        public ModelRenderer Crest;
        public ModelRenderer LeftForearm;
        public ModelRenderer LeftHand;
        public ModelRenderer LeftThumb;
        public ModelRenderer RightForearm;
        public ModelRenderer RightHand;
        public ModelRenderer RightThumb;


        public Child() {
            this.texWidth = 80;
            this.texHeight = 64;
            this.Forehead = new ModelRenderer(this, 55, 5);
            this.Forehead.setPos(0.0F, -1.8F, -2.1F);
            this.Forehead.addBox(-2.0F, -1.0F, 0.0F, 4.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Forehead, 0.12269665007704787F, 0.0F, 0.0F);
            this.LeftCheek = new ModelRenderer(this, 58, 11);
            this.LeftCheek.setPos(1.6F, -0.5F, -1.0F);
            this.LeftCheek.addBox(0.0F, -0.3F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftCheek, -0.3839724354387525F, 0.0F, 0.3839724354387525F);
            this.LeftSideburn = new ModelRenderer(this, 60, 16);
            this.LeftSideburn.setPos(1.5F, -1.5F, -0.1F);
            this.LeftSideburn.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftSideburn, 0.0F, 0.0F, -0.2617993877991494F);
            this.RightCheek = new ModelRenderer(this, 58, 11);
            this.RightCheek.mirror = true;
            this.RightCheek.setPos(-1.5F, -0.4F, -1.0F);
            this.RightCheek.addBox(-2.0F, -0.3F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightCheek, -0.3839724354387525F, 0.0F, -0.3839724354387525F);
            this.LeftLeg = new ModelRenderer(this, 34, 33);
            this.LeftLeg.setPos(0.0F, 4.6F, -0.5F);
            this.LeftLeg.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftLeg, 0.08726646259971647F, 0.0F, 0.0F);
            this.RightThigh = new ModelRenderer(this, 30, 24);
            this.RightThigh.mirror = true;
            this.RightThigh.setPos(-2.3F, 4.4F, 1.6F);
            this.RightThigh.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightThigh, 0.020943951856169794F, 0.0F, 0.0F);
            this.LeftThumb = new ModelRenderer(this, 19, 13);
            this.LeftThumb.setPos(-0.9F, 0.1F, -0.4F);
            this.LeftThumb.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftThumb, 0.0F, 0.5410520681182421F, 0.0F);
            this.RightLeg = new ModelRenderer(this, 34, 33);
            this.RightLeg.mirror = true;
            this.RightLeg.setPos(0.0F, 4.6F, -0.6F);
            this.RightLeg.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightLeg, 0.08726646259971647F, 0.0F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 43, 19);
            this.Tail4.setPos(0.01F, 0.0F, 3.5F);
            this.Tail4.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail4, 0.0822050084347232F, 0.0F, 0.0F);
            this.LeftHand = new ModelRenderer(this, 30, 44);
            this.LeftHand.setPos(0.0F, 4.6F, -1.0F);
            this.LeftHand.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftHand, 0.05235987755982988F, 0.0F, -0.13962634015954636F);
            this.LeftThigh = new ModelRenderer(this, 30, 24);
            this.LeftThigh.setPos(2.3F, 4.4F, 1.6F);
            this.LeftThigh.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftThigh, 0.020943951856169794F, 0.0F, 0.0F);
            this.RightSideburn = new ModelRenderer(this, 60, 16);
            this.RightSideburn.mirror = true;
            this.RightSideburn.setPos(-1.6F, -1.5F, -0.1F);
            this.RightSideburn.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightSideburn, 0.0F, 0.0F, 0.2617993877991494F);
            this.Mouth = new ModelRenderer(this, 9, 7);
            this.Mouth.setPos(0.0F, 1.3F, -1.3F);
            this.Mouth.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 0.10471975511965977F, 0.0F, 0.0F);
            this.LeftEar = new ModelRenderer(this, 37, 1);
            this.LeftEar.setPos(2.0F, -2.0F, 0.0F);
            this.LeftEar.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftEar, 0.0F, 0.5715953300281429F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 28);
            this.Body.setPos(0.0F, -3.0F, 0.7F);
            this.Body.addBox(-3.5F, -0.3F, 0.0F, 7.0F, 7.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.10471975511965977F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 14);
            this.Chest.setPos(0.0F, 14.0F, -2.0F);
            this.Chest.addBox(-3.0F, -3.0F, -2.5F, 6.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 16, 4);
            this.Snout.setPos(0.0F, 0.0F, -1.6F);
            this.Snout.addBox(-1.0F, 0.0F, -1.3F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 43, 1);
            this.Tail1.setPos(0.0F, 0.2F, 2.7F);
            this.Tail1.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.49096110393861886F, 0.0F, 0.0F);
            this.RightArm = new ModelRenderer(this, 27, 5);
            this.RightArm.mirror = true;
            this.RightArm.setPos(-2.6F, 1.2F, -0.3F);
            this.RightArm.addBox(-1.0F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightArm, 0.08726646259971647F, 0.0F, 0.0F);
            this.RightFoot = new ModelRenderer(this, 39, 40);
            this.RightFoot.mirror = true;
            this.RightFoot.setPos(0.1F, 3.7F, 0.0F);
            this.RightFoot.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.LeftForearm = new ModelRenderer(this, 27, 15);
            this.LeftForearm.setPos(-0.2F, 3.6F, 0.7F);
            this.LeftForearm.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftForearm, -0.13962634015954636F, 0.0F, 0.13962634015954636F);
            this.RightThumb = new ModelRenderer(this, 19, 13);
            this.RightThumb.mirror = true;
            this.RightThumb.setPos(0.9F, 0.1F, -0.4F);
            this.RightThumb.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightThumb, 0.0F, -0.5410520681182421F, 0.0F);
            this.LeftArm = new ModelRenderer(this, 27, 5);
            this.LeftArm.setPos(2.6F, 1.2F, -0.3F);
            this.LeftArm.addBox(-2.0F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftArm, 0.08726646259971647F, 0.0F, 0.0F);
            this.Crest = new ModelRenderer(this, 57, 0);
            this.Crest.setPos(0.0F, -1.4F, 2.5F);
            this.Crest.addBox(-1.0F, -1.5F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest, -0.5235987755982988F, 0.0F, 0.0F);
            this.Tail6 = new ModelRenderer(this, 43, 31);
            this.Tail6.setPos(0.01F, 0.0F, 3.5F);
            this.Tail6.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail6, 0.20839230536442993F, 0.0F, 0.0F);
            this.RightForearm = new ModelRenderer(this, 27, 15);
            this.RightForearm.mirror = true;
            this.RightForearm.setPos(0.2F, 3.6F, 0.7F);
            this.RightForearm.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightForearm, -0.13962634015954636F, 0.0F, -0.13962634015954636F);
            this.Neck = new ModelRenderer(this, 20, 49);
            this.Neck.setPos(0.0F, -1.0F, -2.2F);
            this.Neck.addBox(-2.0F, -2.5F, -3.0F, 4.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.20298179400431135F, 0.0F, 0.0F);
            this.LeftFoot = new ModelRenderer(this, 39, 40);
            this.LeftFoot.setPos(-0.1F, 3.7F, 0.0F);
            this.LeftFoot.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.RightHand = new ModelRenderer(this, 30, 44);
            this.RightHand.mirror = true;
            this.RightHand.setPos(0.0F, 4.6F, -1.0F);
            this.RightHand.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightHand, 0.05235987755982988F, 0.0F, 0.13962634015954636F);
            this.Tail2 = new ModelRenderer(this, 43, 7);
            this.Tail2.setPos(0.01F, 0.0F, 3.5F);
            this.Tail2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.14137167606944342F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 43, 13);
            this.Tail3.setPos(-0.01F, 0.0F, 3.5F);
            this.Tail3.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.023736478076794236F, 0.0F, 0.0F);
            this.Tail5 = new ModelRenderer(this, 43, 25);
            this.Tail5.setPos(-0.01F, 0.0F, 3.5F);
            this.Tail5.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail5, 0.20839230536442993F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 24, 1);
            this.Nose.setPos(0.0F, -1.3F, 0.0F);
            this.Nose.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, -0.593411945678072F, 0.0F, 0.0F);
            this.RightEar = new ModelRenderer(this, 37, 1);
            this.RightEar.mirror = true;
            this.RightEar.setPos(-2.0F, -2.0F, 0.0F);
            this.RightEar.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightEar, 0.0F, -0.5715953300281429F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 52);
            this.Head.setPos(0.0F, 0.0F, -3.0F);
            this.Head.addBox(-2.5F, -2.5F, -2.0F, 5.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.22794000763415243F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 42);
            this.Hips.setPos(0.0F, 0.0F, 6.9F);
            this.Hips.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.19198621771937624F, 0.0F, 0.0F);
            this.Head.addChild(this.Forehead);
            this.Head.addChild(this.LeftCheek);
            this.Head.addChild(this.LeftSideburn);
            this.Head.addChild(this.RightCheek);
            this.LeftThigh.addChild(this.LeftLeg);
            this.Hips.addChild(this.RightThigh);
            this.LeftHand.addChild(this.LeftThumb);
            this.RightThigh.addChild(this.RightLeg);
            this.Tail3.addChild(this.Tail4);
            this.LeftForearm.addChild(this.LeftHand);
            this.Hips.addChild(this.LeftThigh);
            this.Head.addChild(this.RightSideburn);
            this.Head.addChild(this.Mouth);
            this.Head.addChild(this.LeftEar);
            this.Chest.addChild(this.Body);
            this.Head.addChild(this.Snout);
            this.Hips.addChild(this.Tail1);
            this.Chest.addChild(this.RightArm);
            this.RightLeg.addChild(this.RightFoot);
            this.LeftArm.addChild(this.LeftForearm);
            this.RightHand.addChild(this.RightThumb);
            this.Chest.addChild(this.LeftArm);
            this.Forehead.addChild(this.Crest);
            this.Tail5.addChild(this.Tail6);
            this.RightArm.addChild(this.RightForearm);
            this.Chest.addChild(this.Neck);
            this.LeftLeg.addChild(this.LeftFoot);
            this.RightForearm.addChild(this.RightHand);
            this.Tail1.addChild(this.Tail2);
            this.Tail2.addChild(this.Tail3);
            this.Tail4.addChild(this.Tail5);
            this.Snout.addChild(this.Nose);
            this.Head.addChild(this.RightEar);
            this.Neck.addChild(this.Head);
            this.Body.addChild(this.Hips);
            this.saveBase();
        }

        @Override
        public void setupAnim(LangurEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Tail1.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isHeld ? -1.2F : -0.49F);
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F - 0.203F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 0.7f;
                float degree = 0.7f;

                this.LeftThigh.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.5F * limbSwingAmount * 0.5F + 0.02F;
                this.LeftLeg.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.087F;
                this.LeftFoot.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F;
                this.RightThigh.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.5F * limbSwingAmount * 0.5F + 0.02F;
                this.RightLeg.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.087F;
                this.RightFoot.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F;

                this.Chest.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.7F * limbSwingAmount * 0.5F;
                this.Body.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.8F * limbSwingAmount * 0.5F + 0.091F;
                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + 14.0F;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.8F * limbSwingAmount * 0.5F - 0.202F;
                this.Head.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.4F * limbSwingAmount * 0.5F + 0.228F;

                this.Tail1.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F - 0.49F;
                this.LeftArm.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.087F;
                this.LeftHand.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -5.0F * limbSwingAmount * 0.5F + 0.052F;
                this.RightArm.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.087F;
                this.RightHand.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -5.0F * limbSwingAmount * 0.5F + 0.052F;

            } else {
                float speed = 1.0f;
                float degree = 0.6f;
                this.LeftArm.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + 0.087F;
                this.LeftHand.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.052F;
                this.RightArm.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F + 0.087F;
                this.RightHand.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.052F;

                this.LeftThigh.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.02F;
                this.LeftLeg.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.087F;
                this.LeftFoot.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F;
                this.RightThigh.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.02F;
                this.RightLeg.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.087F;
                this.RightFoot.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F;

                this.Chest.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.15F * limbSwingAmount * 0.5F + (this.isSwimming ? -0.2F : 0.0F);
                this.Body.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * -0.17F * limbSwingAmount * 0.5F + 0.091F;
                this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F - 0.202F;
                this.Tail1.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : -0.49F);

            }
        }
    }
}

