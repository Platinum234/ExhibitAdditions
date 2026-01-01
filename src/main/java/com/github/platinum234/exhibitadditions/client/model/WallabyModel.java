package com.github.platinum234.exhibitadditions.client.model;

import com.github.platinum234.exhibitadditions.entity.WallabyEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class WallabyModel extends ZawaBaseModel<WallabyEntity> {
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

    public static class Adult extends WallabyModel {

        public ModelRenderer Body;
        public ModelRenderer Pouch;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail1;
        public ModelRenderer Chest;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Neck;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;


        public Adult() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.Hips = new ModelRenderer(this, 14, 12);
            this.Hips.setPos(0.0F, 16.3F, 0.0F);
            this.Hips.addBox(-3.5F, -3.5F, -3.0F, 7.0F, 7.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.9075712110370513F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 8);
            this.Chest.setPos(0.0F, 4.5F, 0.0F);
            this.Chest.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.22689280275926282F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 38, 0);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.8F, -0.5F, 2.5F);
            this.ThighRight.addBox(-1.5F, -2.5F, -6.0F, 3.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.9677850835466613F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 0, 17);
            this.Snout.setPos(0.0F, 1.0F, -1.4F);
            this.Snout.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.2617993877991494F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 16, 0);
            this.Body.setPos(0.0F, -3.2F, -3.0F);
            this.Body.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.9773843811168246F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 35, 11);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.0F, 1.7F, -5.5F);
            this.LegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.10471975511965977F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 14, 41);
            this.Tail3.setPos(0.0F, 0.8F, 4.0F);
            this.Tail3.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.5082398928281348F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 0, 31);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.9F, 2.0F, 3.4F);
            this.ArmBaseRight.addBox(0.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 2.1816615649929116F, -0.22689280275926282F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 0, 31);
            this.ArmBaseLeft.setPos(1.9F, 2.0F, 3.4F);
            this.ArmBaseLeft.addBox(-2.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 2.1816615649929116F, 0.22689280275926282F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 12, 25);
            this.Tail1.setPos(0.0F, -2.9F, 3.0F);
            this.Tail1.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.12217304763960307F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 0, 36);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.5F, 3.0F, 1.0F);
            this.ArmRight.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.3490658503988659F, -0.3141592653589793F, -0.3490658503988659F);
            this.ThighLeft = new ModelRenderer(this, 38, 0);
            this.ThighLeft.setPos(2.8F, -0.5F, 2.5F);
            this.ThighLeft.addBox(-1.5F, -2.5F, -6.0F, 3.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.9677850835466613F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 0, 36);
            this.ArmLeft.setPos(-0.5F, 3.0F, 1.0F);
            this.ArmLeft.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.3490658503988659F, 0.3141592653589793F, 0.3490658503988659F);
            this.Mouth = new ModelRenderer(this, 0, 22);
            this.Mouth.setPos(0.0F, 0.4F, 1.8F);
            this.Mouth.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.9F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 26);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-0.9F, -1.7F, -1.4F);
            this.EarRight.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.19198621771937624F, 0.4223696922984332F, 0.5864306020384839F);
            this.FootLeft = new ModelRenderer(this, 40, 11);
            this.FootLeft.setPos(0.0F, 3.5F, 3.0F);
            this.FootLeft.addBox(-1.5F, 0.0F, -6.5F, 3.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.15707963267948966F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 0, 41);
            this.HandLeft.setPos(0.0F, 2.7F, -2.2F);
            this.HandLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.45378560551852565F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 28, 25);
            this.Neck.setPos(0.0F, 1.5F, 2.8F);
            this.Neck.addBox(-1.5F, -2.0F, -4.0F, 3.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 1.0471975511965976F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 26);
            this.EarLeft.setPos(0.9F, -1.7F, -1.4F);
            this.EarLeft.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.19198621771937624F, -0.4223696922984332F, -0.5864306020384839F);
            this.Head = new ModelRenderer(this, 0, 0);
            this.Head.setPos(0.0F, 0.2F, -5.1F);
            this.Head.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 4.0F, 4.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.3909537457888271F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 0, 41);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 2.7F, -2.2F);
            this.HandRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.45378560551852565F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 40, 11);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 3.5F, 3.0F);
            this.FootRight.addBox(-1.5F, 0.0F, -6.5F, 3.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.15707963267948966F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 35, 11);
            this.LegLeft.setPos(0.0F, 1.7F, -5.5F);
            this.LegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.10471975511965977F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 13, 33);
            this.Tail2.setPos(0.0F, 0.3F, 2.5F);
            this.Tail2.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 4.9F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.5082398928281348F, 0.0F, 0.0F);
            this.Body.addChild(this.Chest);
            this.Hips.addChild(this.ThighRight);
            this.Head.addChild(this.Snout);
            this.Hips.addChild(this.Body);
            this.ThighRight.addChild(this.LegRight);
            this.Tail2.addChild(this.Tail3);
            this.Chest.addChild(this.ArmBaseRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Hips.addChild(this.Tail1);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Hips.addChild(this.ThighLeft);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Head.addChild(this.Mouth);
            this.Head.addChild(this.EarRight);
            this.LegLeft.addChild(this.FootLeft);
            this.ArmLeft.addChild(this.HandLeft);
            this.Chest.addChild(this.Neck);
            this.Head.addChild(this.EarLeft);
            this.Neck.addChild(this.Head);
            this.ArmRight.addChild(this.HandRight);
            this.LegRight.addChild(this.FootRight);
            this.ThighLeft.addChild(this.LegLeft);
            this.Tail1.addChild(this.Tail2);
            this.saveBase();
        }

        @Override
        public void setupAnim(WallabyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
         }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.1F + (float)Math.PI) * degree * 0.1F * limbSwingAmount * 0.5F + 1.04F;
            this.Head.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F + (float)Math.PI) * degree * -0.1F * limbSwingAmount * 0.5F - 0.39F;
            this.ArmBaseLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F + (float)Math.PI) * degree * 0.1F * limbSwingAmount * 0.5F + 2.18F;
            this.ArmBaseRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F + (float)Math.PI) * degree * 0.1F * limbSwingAmount * 0.5F + 2.18F;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 4.0F;
            float degree = 0.5F;
            this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * 1.0F * limbSwingAmount * 0.5F;
            this.Hips.y = MathHelper.cos(limbSwing * speed * 0.2F + (float)Math.PI) * degree * -0.3F * limbSwingAmount * 0.5F + -0.05F + 17.95F;
            this.Hips.z = MathHelper.cos(limbSwing * speed * 0.2F + (float)Math.PI) * degree * 0.8F * limbSwingAmount * 0.5F;
            this.Chest.xRot = MathHelper.cos(limbSwing * speed * 0.2F + (float)Math.PI) * degree * -0.7F * limbSwingAmount * 0.5F + -0.3F;
            this.Head.xRot = MathHelper.cos(limbSwing * speed * 0.2F + (float)Math.PI) * degree * 0.0F * limbSwingAmount * 0.5F + -0.5F;
            this.ArmBaseLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F + (float)Math.PI) * degree * 6.0F * limbSwingAmount * 0.5F + 1.5F;
            this.ArmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * 3.0F * limbSwingAmount * 0.5F + -0.9F;
            this.HandLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F + (float)Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + 0.2F;
            this.ArmBaseRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F + (float)Math.PI) * degree * 5.0F * limbSwingAmount * 0.5F + 1.5F;
            this.ArmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * 3.0F * limbSwingAmount * 0.5F + -0.9F;
            this.HandRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F + (float)Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + 0.2F;
            this.Body.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * -1.9F * limbSwingAmount * 0.5F + -1F;
            this.Neck.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * 2.5F * limbSwingAmount * 0.5F + 0.65F;
            this.Head.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.0F + (float)Math.PI) * degree * -1.0F * limbSwingAmount * 0.5F + -0.8F;
            this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * -1.85F * limbSwingAmount * 0.5F + 0.15F;
            this.ThighLeft.z = MathHelper.cos(limbSwing * speed * 0.2F + (float)Math.PI) * degree * -1.0F * limbSwingAmount * 0.5F + 2.5F;
            this.ThighLeft.y = MathHelper.cos(limbSwing * speed * 0.0F + (float)Math.PI) * degree * 0.0F * limbSwingAmount * 0.5F + -0.5F;
            this.LegLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + 0.1F;
            this.FootLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F + (float)Math.PI) * degree * 3.0F * limbSwingAmount * 0.5F + -0.2F;
            this.ThighRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * -1.85F * limbSwingAmount * 0.5F + 0.15F;
            this.ThighRight.z = MathHelper.cos(limbSwing * speed * 0.2F + (float)Math.PI) * degree * -1.0F * limbSwingAmount * 0.5F + -0.01F + 2.5F;
            this.ThighRight.y = MathHelper.cos(limbSwing * speed * 0.0F + (float)Math.PI) * degree * 0.0F * limbSwingAmount * 0.5F + 0.15F + -0.5F;
            this.LegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + 0.1F;
            this.FootRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F + (float)Math.PI) * degree * 3.0F * limbSwingAmount * 0.5F + -0.2F;
            this.Tail1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + -0.4F;
            this.Tail2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F + (float)Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F + -0.4F;
            this.Tail3.xRot = MathHelper.cos(limbSwing * speed * 0.2F + (float)Math.PI) * degree * -1.0F * limbSwingAmount * 0.5F + 0.6F;
        }
    }


    public static class Child extends WallabyModel {

        public ModelRenderer Body;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail1;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Neck;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegLeft_1;
        public ModelRenderer FootLeft_1;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;

        public Child() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.HandLeft = new ModelRenderer(this, 13, 16);
            this.HandLeft.setPos(-0.5F, -2.0F, -2.0F);
            this.HandLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, -0.9105382388075086F, 0.4098033003787853F, 0.0911061832922575F);
            this.Hips = new ModelRenderer(this, 30, 0);
            this.Hips.setPos(0.0F, 18.2F, 0.0F);
            this.Hips.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.7155849933176751F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 16, 13);
            this.ArmLeft.setPos(-0.5F, 1.5F, 1.0F);
            this.ArmLeft.addBox(-1.0F, -2.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 1.0471975511965976F, 0.0911061832922575F, 0.0911061832922575F);
            this.Body = new ModelRenderer(this, 17, 0);
            this.Body.setPos(0.0F, -1.6F, -2.0F);
            this.Body.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.7429866572476639F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 12, 11);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.0F, 3.0F, 1.4F);
            this.ArmBaseRight.addBox(0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 1.5934856603340446F, -0.13665927909957545F, 0.0F);
            this.Snout = new ModelRenderer(this, 0, 0);
            this.Snout.setPos(0.0F, -0.3F, -1.2F);
            this.Snout.addBox(-1.0F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, 0.0F, 0.2F, 0.0F);
            this.setRotateAngle(Snout, 0.3490658503988659F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 24, 10);
            this.Tail1.setPos(0.0F, -1.7F, 2.0F);
            this.Tail1.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.46914448828868976F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 0, 23);
            this.FootLeft.setPos(0.0F, 1.8F, 0.3F);
            this.FootLeft.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.12217304763960307F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 33, 14);
            this.Tail2.setPos(0.0F, 0.9F, 1.6F);
            this.Tail2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.5864306020384839F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 17, 17);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-0.4F, -0.3F, 2.0F);
            this.ThighRight.addBox(-2.0F, -2.0F, -4.0F, 2.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.767944870877505F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 10, 5);
            this.Neck.setPos(0.0F, 3.2F, 0.7F);
            this.Neck.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 0.19198621771937624F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 0, 5);
            this.Mouth.setPos(0.0F, 0.9F, -0.7F);
            this.Mouth.addBox(-1.0F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.0781907508222411F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 11, 23);
            this.LegLeft.setPos(1.0F, 1.8F, -3.5F);
            this.LegLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.06981317007977318F, 0.0F, 0.0F);
            this.FootLeft_1 = new ModelRenderer(this, 0, 23);
            this.FootLeft_1.mirror = true;
            this.FootLeft_1.setPos(0.0F, 1.8F, 0.3F);
            this.FootLeft_1.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft_1, -0.12217304763960307F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 17, 17);
            this.ThighLeft.setPos(0.4F, -0.3F, 2.0F);
            this.ThighLeft.addBox(0.0F, -2.0F, -4.0F, 2.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.767944870877505F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 11);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.3F, -1.3F, 0.3F);
            this.EarRight.addBox(-1.0F, -2.2F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, -0.19198621771937624F, 0.3490658503988659F, -0.5061454830783556F);
            this.HandRight = new ModelRenderer(this, 13, 16);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.5F, -2.0F, -2.0F);
            this.HandRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, -0.9105382388075086F, -0.4098033003787853F, -0.0911061832922575F);
            this.EarLeft = new ModelRenderer(this, 0, 11);
            this.EarLeft.setPos(1.3F, -1.3F, 0.3F);
            this.EarLeft.addBox(-1.0F, -2.2F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, -0.19198621771937624F, -0.3490658503988659F, 0.5061454830783556F);
            this.Head = new ModelRenderer(this, 0, 16);
            this.Head.setPos(0.0F, 0.6F, -2.4F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 1.3089969389957472F, 0.0F, 0.0F);
            this.LegLeft_1 = new ModelRenderer(this, 11, 23);
            this.LegLeft_1.mirror = true;
            this.LegLeft_1.setPos(-1.0F, 1.8F, -3.5F);
            this.LegLeft_1.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft_1, 0.06981317007977318F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 12, 11);
            this.ArmBaseLeft.setPos(2.0F, 3.0F, 1.4F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 1.5934856603340446F, 0.13665927909957545F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 29, 21);
            this.Tail3.setPos(0.0F, 0.9F, 3.4F);
            this.Tail3.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.5235987755982988F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 16, 13);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.5F, 1.5F, 1.0F);
            this.ArmRight.addBox(0.0F, -2.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 1.0471975511965976F, -0.0911061832922575F, -0.0911061832922575F);
            this.ArmLeft.addChild(this.HandLeft);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Hips.addChild(this.Body);
            this.Body.addChild(this.ArmBaseRight);
            this.Head.addChild(this.Snout);
            this.Hips.addChild(this.Tail1);
            this.LegLeft.addChild(this.FootLeft);
            this.Tail1.addChild(this.Tail2);
            this.Hips.addChild(this.ThighRight);
            this.Body.addChild(this.Neck);
            this.Head.addChild(this.Mouth);
            this.ThighLeft.addChild(this.LegLeft);
            this.LegLeft_1.addChild(this.FootLeft_1);
            this.Hips.addChild(this.ThighLeft);
            this.Head.addChild(this.EarRight);
            this.ArmRight.addChild(this.HandRight);
            this.Head.addChild(this.EarLeft);
            this.Neck.addChild(this.Head);
            this.ThighRight.addChild(this.LegLeft_1);
            this.Body.addChild(this.ArmBaseLeft);
            this.Tail2.addChild(this.Tail3);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.saveBase();

        }

        @Override
        public void setupAnim(WallabyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
         }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
          }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
        }
    }
}
