package com.github.platinum234.exhibitadditions.client.model;

import com.github.platinum234.exhibitadditions.entity.DuikerEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class DuikerModel extends ZawaBaseModel<DuikerEntity> {
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

    public static class Adult extends DuikerModel {

        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Hips;
        public ModelRenderer Tail1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail2;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Neckbase;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer CrestBottom;
        public ModelRenderer HornLeft;
        public ModelRenderer HornRight;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Nose;
        public ModelRenderer CrestTop;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Adult() {
            this.texWidth = 32;
            this.texHeight = 48;
            this.LowerLegLeft = new ModelRenderer(this, 8, 43);
            this.LowerLegLeft.setPos(0.0F, 2.6F, 1.8F);
            this.LowerLegLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.5759586531581287F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 12, 22);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.21F, 1.7F, 1.1F);
            this.ArmRight.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.017453292519943295F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 8, 43);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 2.6F, 1.8F);
            this.LowerLegRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.5759586531581287F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 17);
            this.Chest.setPos(0.0F, 15.5F, -4.1F);
            this.Chest.addBox(-1.5F, -2.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.15707963267948966F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 32);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.3F, 0.9F, 1.4F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.296705972839036F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 0, 39);
            this.UpperLegLeft.setPos(-0.01F, 4.0F, -1.0F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6108652381980153F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 18, 22);
            this.ForearmLeft.setPos(-0.01F, 2.8F, -1.7F);
            this.ForearmLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Neckbase = new ModelRenderer(this, 18, 29);
            this.Neckbase.setPos(0.0F, 1.0F, 0.0F);
            this.Neckbase.addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neckbase, -0.17453292519943295F, 0.0F, 0.0F);
            this.CrestTop = new ModelRenderer(this, 15, 31);
            this.CrestTop.setPos(0.0F, -1.0F, 1.8F);
            this.CrestTop.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CrestTop, 0.7330382858376184F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 4, 44);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.01F, 3.3F, -0.9F);
            this.FootRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 14, 4);
            this.Snout.setPos(0.0F, -0.4F, -1.5F);
            this.Snout.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.12217304763960307F, 0.0F, 0.0F);
            this.HornLeft = new ModelRenderer(this, 18, 37);
            this.HornLeft.setPos(0.9F, -1.1F, 0.4F);
            this.HornLeft.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeft, 0.5885250450777767F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 12, 22);
            this.ArmLeft.setPos(-0.21F, 1.7F, 1.1F);
            this.ArmLeft.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 4, 44);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.01F, 2.5F, 0.1F);
            this.HandRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 19, 8);
            this.Mouth.setPos(0.0F, 0.3F, -1.2F);
            this.Mouth.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 0.2045525929942673F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 20, 19);
            this.Tail2.setPos(0.0F, 1.8F, -0.4F);
            this.Tail2.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.3141592653589793F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 18, 22);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.01F, 2.8F, -1.7F);
            this.ForearmRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 8, 35);
            this.Neck.setPos(0.0F, -2.0F, -1.0F);
            this.Neck.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.6108652381980153F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 0, 39);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.01F, 4.0F, -1.0F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6108652381980153F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 10, 30);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-0.9F, -0.9F, 1.2F);
            this.EarRight.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.2617993877991494F, -0.3490658503988659F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 0);
            this.Head.setPos(0.0F, 1.5F, -3.0F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.7853981633974483F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 4, 44);
            this.HandLeft.setPos(-0.01F, 2.5F, 0.1F);
            this.HandLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 12, 0);
            this.Nose.setPos(0.0F, -0.4F, 0.1F);
            this.Nose.addBox(-0.5F, -0.5F, -1.7F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.3008947590490808F, 0.0F, 0.0F);
            this.CrestBottom = new ModelRenderer(this, 20, 12);
            this.CrestBottom.setPos(0.0F, -0.8F, -0.9F);
            this.CrestBottom.addBox(-1.0F, -1.0F, -0.5F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CrestBottom, 0.15707963267948966F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 20, 16);
            this.Tail1.setPos(0.0F, 0.0F, 3.0F);
            this.Tail1.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.6108652381980153F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 10, 30);
            this.EarLeft.setPos(0.9F, -0.9F, 1.2F);
            this.EarLeft.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.2617993877991494F, 0.3490658503988659F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 12, 17);
            this.ArmBaseLeft.setPos(1.3F, 0.5F, 0.2F);
            this.ArmBaseLeft.addBox(-1.2F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.15707963267948966F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 6);
            this.Body.setPos(0.0F, -2.0F, 0.4F);
            this.Body.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.20943951023931953F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 12, 17);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.3F, 0.5F, 0.2F);
            this.ArmBaseRight.addBox(-0.8F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.15707963267948966F, 0.0F, 0.0F);
            this.HornRight = new ModelRenderer(this, 18, 37);
            this.HornRight.mirror = true;
            this.HornRight.setPos(-0.9F, -1.1F, 0.4F);
            this.HornRight.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRight, 0.5885250450777767F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 4, 44);
            this.FootLeft.setPos(0.01F, 3.3F, -0.9F);
            this.FootLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 25);
            this.Hips.setPos(0.0F, 0.0F, 5.8F);
            this.Hips.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.3665191429188092F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 32);
            this.ThighLeft.setPos(1.3F, 0.9F, 1.4F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.296705972839036F, 0.0F, 0.0F);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Hips.addChild(this.ThighRight);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Neck.addChild(this.Neckbase);
            this.CrestBottom.addChild(this.CrestTop);
            this.LowerLegRight.addChild(this.FootRight);
            this.Head.addChild(this.Snout);
            this.Head.addChild(this.HornLeft);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.ForearmRight.addChild(this.HandRight);
            this.Head.addChild(this.Mouth);
            this.Tail1.addChild(this.Tail2);
            this.ArmRight.addChild(this.ForearmRight);
            this.Chest.addChild(this.Neck);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Head.addChild(this.EarRight);
            this.Neck.addChild(this.Head);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Snout.addChild(this.Nose);
            this.Head.addChild(this.CrestBottom);
            this.Hips.addChild(this.Tail1);
            this.Head.addChild(this.EarLeft);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Chest.addChild(this.Body);
            this.Chest.addChild(this.ArmBaseRight);
            this.Head.addChild(this.HornRight);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Body.addChild(this.Hips);
            this.Hips.addChild(this.ThighLeft);
            this.saveBase();
        }

        @Override
        public void setupAnim(DuikerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.785F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.61F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.785F;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.1f;
            float degree = 0.6f;
            this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.61F;
            this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.785F;
            this.Chest.y = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 15.5F;
            this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.157F;
            this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.209F;
            this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.366F;

            this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.157F;
            this.ArmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F;
            this.ForearmLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F;
            this.HandLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
            this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.157F;
            this.ArmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F;
            this.ForearmRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F;
            this.HandRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;

            this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.296F;
            this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.61F;
            this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F -  0.575F;
            this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
            this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.296F;
            this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.61F;
            this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.575F;
            this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;

        }
    }


    public static class Child extends DuikerModel {

        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Hips;
        public ModelRenderer Tail1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail2;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Neckbase;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer CrestBottom;
        public ModelRenderer HornLeft;
        public ModelRenderer HornRight;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Nose;
        public ModelRenderer CrestTop;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Child() {
            this.texWidth = 32;
            this.texHeight = 48;
            this.LowerLegLeft = new ModelRenderer(this, 8, 43);
            this.LowerLegLeft.setPos(0.0F, 2.6F, 1.8F);
            this.LowerLegLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.5759586531581287F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 12, 22);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.21F, 1.7F, 1.1F);
            this.ArmRight.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.017453292519943295F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 8, 43);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 2.6F, 1.8F);
            this.LowerLegRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.5759586531581287F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 17);
            this.Chest.setPos(0.0F, 15.5F, -4.1F);
            this.Chest.addBox(-1.5F, -2.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.15707963267948966F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 32);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.3F, 0.9F, 1.4F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.296705972839036F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 0, 39);
            this.UpperLegLeft.setPos(-0.01F, 4.0F, -1.0F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6108652381980153F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 18, 22);
            this.ForearmLeft.setPos(-0.01F, 2.8F, -1.7F);
            this.ForearmLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Neckbase = new ModelRenderer(this, 18, 29);
            this.Neckbase.setPos(0.0F, 1.0F, 0.0F);
            this.Neckbase.addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neckbase, -0.17453292519943295F, 0.0F, 0.0F);
            this.CrestTop = new ModelRenderer(this, 15, 31);
            this.CrestTop.setPos(0.0F, -1.0F, 1.8F);
            this.CrestTop.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CrestTop, 0.7330382858376184F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 4, 44);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.01F, 3.3F, -0.9F);
            this.FootRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 14, 4);
            this.Snout.setPos(0.0F, -0.4F, -1.5F);
            this.Snout.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.12217304763960307F, 0.0F, 0.0F);
            this.HornLeft = new ModelRenderer(this, 18, 37);
            this.HornLeft.setPos(0.9F, -1.1F, 0.4F);
            this.HornLeft.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeft, 0.5885250450777767F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 12, 22);
            this.ArmLeft.setPos(-0.21F, 1.7F, 1.1F);
            this.ArmLeft.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 4, 44);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.01F, 2.5F, 0.1F);
            this.HandRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 19, 8);
            this.Mouth.setPos(0.0F, 0.3F, -1.2F);
            this.Mouth.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 0.2045525929942673F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 20, 19);
            this.Tail2.setPos(0.0F, 1.8F, -0.4F);
            this.Tail2.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.3141592653589793F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 18, 22);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.01F, 2.8F, -1.7F);
            this.ForearmRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 8, 35);
            this.Neck.setPos(0.0F, -2.0F, -1.0F);
            this.Neck.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.6108652381980153F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 0, 39);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.01F, 4.0F, -1.0F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6108652381980153F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 10, 30);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-0.9F, -0.9F, 1.2F);
            this.EarRight.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.2617993877991494F, -0.3490658503988659F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 0);
            this.Head.setPos(0.0F, 1.5F, -3.0F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.7853981633974483F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 4, 44);
            this.HandLeft.setPos(-0.01F, 2.5F, 0.1F);
            this.HandLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 12, 0);
            this.Nose.setPos(0.0F, -0.4F, 0.1F);
            this.Nose.addBox(-0.5F, -0.5F, -1.7F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.3008947590490808F, 0.0F, 0.0F);
            this.CrestBottom = new ModelRenderer(this, 20, 12);
            this.CrestBottom.setPos(0.0F, -0.8F, -0.9F);
            this.CrestBottom.addBox(-1.0F, -1.0F, -0.5F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CrestBottom, 0.15707963267948966F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 20, 16);
            this.Tail1.setPos(0.0F, 0.0F, 3.0F);
            this.Tail1.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.6108652381980153F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 10, 30);
            this.EarLeft.setPos(0.9F, -0.9F, 1.2F);
            this.EarLeft.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.2617993877991494F, 0.3490658503988659F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 12, 17);
            this.ArmBaseLeft.setPos(1.3F, 0.5F, 0.2F);
            this.ArmBaseLeft.addBox(-1.2F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.15707963267948966F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 6);
            this.Body.setPos(0.0F, -2.0F, 0.4F);
            this.Body.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.20943951023931953F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 12, 17);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.3F, 0.5F, 0.2F);
            this.ArmBaseRight.addBox(-0.8F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.15707963267948966F, 0.0F, 0.0F);
            this.HornRight = new ModelRenderer(this, 18, 37);
            this.HornRight.mirror = true;
            this.HornRight.setPos(-0.9F, -1.1F, 0.4F);
            this.HornRight.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRight, 0.5885250450777767F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 4, 44);
            this.FootLeft.setPos(0.01F, 3.3F, -0.9F);
            this.FootLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 25);
            this.Hips.setPos(0.0F, 0.0F, 5.8F);
            this.Hips.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.3665191429188092F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 32);
            this.ThighLeft.setPos(1.3F, 0.9F, 1.4F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.296705972839036F, 0.0F, 0.0F);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Hips.addChild(this.ThighRight);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Neck.addChild(this.Neckbase);
            this.CrestBottom.addChild(this.CrestTop);
            this.LowerLegRight.addChild(this.FootRight);
            this.Head.addChild(this.Snout);
            this.Head.addChild(this.HornLeft);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.ForearmRight.addChild(this.HandRight);
            this.Head.addChild(this.Mouth);
            this.Tail1.addChild(this.Tail2);
            this.ArmRight.addChild(this.ForearmRight);
            this.Chest.addChild(this.Neck);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Head.addChild(this.EarRight);
            this.Neck.addChild(this.Head);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Snout.addChild(this.Nose);
            this.Head.addChild(this.CrestBottom);
            this.Hips.addChild(this.Tail1);
            this.Head.addChild(this.EarLeft);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Chest.addChild(this.Body);
            this.Chest.addChild(this.ArmBaseRight);
            this.Head.addChild(this.HornRight);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Body.addChild(this.Hips);
            this.Hips.addChild(this.ThighLeft);
            this.saveBase();

        }

        @Override
        public void setupAnim(DuikerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.785F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.61F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.785F;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.1f;
            float degree = 0.6f;
            this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.61F;
            this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.785F;
            this.Chest.y = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 15.5F;
            this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.157F;
            this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.209F;
            this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.366F;

            this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.157F;
            this.ArmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F;
            this.ForearmLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F;
            this.HandLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
            this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.157F;
            this.ArmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F;
            this.ForearmRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F;
            this.HandRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;

            this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.296F;
            this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.61F;
            this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F -  0.575F;
            this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
            this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.296F;
            this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.61F;
            this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.575F;
            this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
        }
    }
}
