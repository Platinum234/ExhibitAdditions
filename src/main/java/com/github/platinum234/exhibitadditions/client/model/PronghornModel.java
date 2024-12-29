package com.github.platinum234.exhibitadditions.client.model;

import com.github.platinum234.exhibitadditions.entity.PronghornEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class PronghornModel extends ZawaBaseModel<PronghornEntity> {
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

    public static class Adult extends PronghornModel {

        public ModelRenderer Body;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseLeft_1;
        public ModelRenderer Neck;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail;
        public ModelRenderer ThighLeft_1;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegLeft_1;
        public ModelRenderer LowerLegLeft_1;
        public ModelRenderer FootLeft_1;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer UpperArmLeft_1;
        public ModelRenderer ArmLeft_1;
        public ModelRenderer HandLeft_1;
        public ModelRenderer Head;
        public ModelRenderer Nose;
        public ModelRenderer Mouth;
        public ModelRenderer EarLeft;
        public ModelRenderer HornLeft1;
        public ModelRenderer EarRight;
        public ModelRenderer HornRight1;
        public ModelRenderer Snout;
        public ModelRenderer HornLeft2;
        public ModelRenderer HornLeft3;
        public ModelRenderer HornLeft5;
        public ModelRenderer HornLeft4;
        public ModelRenderer HornLeft6;
        public ModelRenderer HornRight2;
        public ModelRenderer HornRight3;
        public ModelRenderer HornRight5;
        public ModelRenderer HornRight4;
        public ModelRenderer HornRight6;


        public Adult() {
            this.texWidth = 64;
            this.texHeight = 96;
            this.Snout = new ModelRenderer(this, 26, 44);
            this.Snout.setPos(0.0F, -0.7F, 0.0F);
            this.Snout.addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.27314402127920984F, 0.0F, 0.0F);
            this.HornRight6 = new ModelRenderer(this, 22, 35);
            this.HornRight6.setPos(0.0F, 0.01F, -1.5F);
            this.HornRight6.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRight6, 0.0F, -0.45535640450848164F, 0.0F);
            this.Nose = new ModelRenderer(this, 0, 43);
            this.Nose.setPos(0.0F, 0.5F, -1.8F);
            this.Nose.addBox(-1.5F, -1.0F, -3.5F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.27314402127920984F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 50, 52);
            this.Tail.setPos(0.0F, 0.0F, 4.5F);
            this.Tail.addBox(-1.0F, -0.6F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, -0.8651597048872669F, 0.0F, 0.0F);
            this.LowerLegLeft_1 = new ModelRenderer(this, 32, 53);
            this.LowerLegLeft_1.setPos(0.05F, 3.5F, 1.5F);
            this.LowerLegLeft_1.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft_1, -0.956091342937205F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 37, 35);
            this.UpperArmLeft.mirror = true;
            this.UpperArmLeft.setPos(0.0F, 5.8F, 1.0F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.08726646259971647F, 0.0F, 0.0F);
            this.HornLeft5 = new ModelRenderer(this, 16, 36);
            this.HornLeft5.mirror = true;
            this.HornLeft5.setPos(0.01F, -0.5F, -0.5F);
            this.HornLeft5.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeft5, -0.591841146688116F, 0.45535640450848164F, 0.0F);
            this.HornRight3 = new ModelRenderer(this, 16, 36);
            this.HornRight3.setPos(-0.01F, -0.5F, -0.5F);
            this.HornRight3.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRight3, 0.591841146688116F, 0.0F, 0.0F);
            this.HornLeft4 = new ModelRenderer(this, 15, 32);
            this.HornLeft4.mirror = true;
            this.HornLeft4.setPos(0.0F, 0.0F, 1.6F);
            this.HornLeft4.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeft4, -0.45535640450848164F, -0.45535640450848164F, 0.0F);
            this.Mouth = new ModelRenderer(this, 15, 45);
            this.Mouth.setPos(0.0F, 2.0F, -1.5F);
            this.Mouth.addBox(-1.0F, -0.5F, -3.3F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 0.04555309164612875F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 46, 35);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(-0.01F, 2.8F, -2.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 32, 53);
            this.LowerLegLeft.mirror = true;
            this.LowerLegLeft.setPos(-0.05F, 3.5F, 1.5F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.956091342937205F, 0.0F, 0.0F);
            this.HornLeft1 = new ModelRenderer(this, 8, 29);
            this.HornLeft1.mirror = true;
            this.HornLeft1.setPos(1.5F, -2.0F, -0.8F);
            this.HornLeft1.addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeft1, 0.4098033003787853F, 0.0F, 0.500909508638178F);
            this.Body = new ModelRenderer(this, 27, 1);
            this.Body.setPos(0.0F, -3.5F, 2.5F);
            this.Body.addBox(-3.0F, -0.5F, -1.0F, 6.0F, 8.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.18203784630933073F, 0.0F, 0.0F);
            this.HornLeft2 = new ModelRenderer(this, 16, 39);
            this.HornLeft2.mirror = true;
            this.HornLeft2.setPos(0.1F, -2.8F, 0.01F);
            this.HornLeft2.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeft2, 0.0F, 0.0F, -0.3642502295386026F);
            this.HornRight2 = new ModelRenderer(this, 16, 39);
            this.HornRight2.setPos(-0.1F, -2.8F, 0.01F);
            this.HornRight2.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRight2, 0.0F, 0.0F, 0.3642502295386026F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 11.0F, -6.1F);
            this.Chest.addBox(-2.5F, -4.0F, -3.0F, 5.0F, 8.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.13962634015954636F, 0.0F, 0.0F);
            this.HornLeft6 = new ModelRenderer(this, 22, 35);
            this.HornLeft6.mirror = true;
            this.HornLeft6.setPos(0.0F, 0.01F, -1.5F);
            this.HornLeft6.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeft6, 0.0F, 0.45535640450848164F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 29);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.5F, -0.5F, 1.0F);
            this.EarLeft.addBox(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.13665927909957545F, -0.6373942508178124F, 0.6373942508178124F);
            this.FootLeft = new ModelRenderer(this, 41, 58);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(-0.1F, 6.0F, -1.4F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.18203784630933073F, 0.0F, 0.0F);
            this.ThighLeft_1 = new ModelRenderer(this, 0, 49);
            this.ThighLeft_1.setPos(-2.1F, 1.5F, 2.3F);
            this.ThighLeft_1.addBox(-1.5F, -1.5F, -2.0F, 3.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.ArmBaseLeft_1 = new ModelRenderer(this, 22, 34);
            this.ArmBaseLeft_1.setPos(-2.0F, -0.2F, -0.6F);
            this.ArmBaseLeft_1.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft_1, 0.2275909337942703F, 0.0F, 0.0F);
            this.HornRight4 = new ModelRenderer(this, 15, 32);
            this.HornRight4.setPos(0.0F, 0.0F, 1.6F);
            this.HornRight4.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRight4, -0.45535640450848164F, 0.45535640450848164F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 19, 54);
            this.UpperLegLeft.mirror = true;
            this.UpperLegLeft.setPos(0.0F, 6.0F, -0.5F);
            this.UpperLegLeft.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.8196066007575706F, 0.0F, 0.0F);
            this.UpperLegLeft_1 = new ModelRenderer(this, 19, 54);
            this.UpperLegLeft_1.setPos(0.0F, 5.9F, -0.5F);
            this.UpperLegLeft_1.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft_1, 0.8196066007575706F, 0.0F, 0.0F);
            this.HandLeft_1 = new ModelRenderer(this, 55, 37);
            this.HandLeft_1.setPos(0.1F, 2.9F, 0.8F);
            this.HandLeft_1.addBox(-1.0F, -0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.HornRight1 = new ModelRenderer(this, 8, 29);
            this.HornRight1.setPos(-1.5F, -2.0F, -0.8F);
            this.HornRight1.addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRight1, 0.4098033003787853F, 0.0F, -0.500909508638178F);
            this.Neck = new ModelRenderer(this, 31, 17);
            this.Neck.setPos(0.0F, -2.8F, -2.9F);
            this.Neck.addBox(-1.5F, -1.0F, -4.4F, 3.0F, 4.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.8196066007575706F, 0.0F, 0.0F);
            this.FootLeft_1 = new ModelRenderer(this, 41, 58);
            this.FootLeft_1.setPos(0.1F, 6.0F, -1.4F);
            this.FootLeft_1.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft_1, 0.18203784630933073F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 16);
            this.Hips.setPos(0.0F, 0.0F, 5.5F);
            this.Hips.addBox(-2.5F, -0.5F, 0.0F, 5.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.0911061832922575F, 0.0F, 0.0F);
            this.HornRight5 = new ModelRenderer(this, 16, 36);
            this.HornRight5.setPos(0.01F, -0.5F, -0.5F);
            this.HornRight5.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRight5, -0.591841146688116F, -0.45535640450848164F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 22, 34);
            this.ArmBaseLeft.mirror = true;
            this.ArmBaseLeft.setPos(2.0F, -0.2F, -0.6F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.2275909337942703F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 49);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(2.0F, 1.5F, 2.3F);
            this.ThighLeft.addBox(-1.5F, -1.5F, -2.0F, 3.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 55, 37);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(-0.1F, 2.9F, 0.8F);
            this.HandLeft.addBox(-1.0F, -0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 34);
            this.Head.setPos(0.0F, 2.0F, -3.5F);
            this.Head.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 1.0016444470669013F, 0.0F, 0.0F);
            this.ArmLeft_1 = new ModelRenderer(this, 46, 35);
            this.ArmLeft_1.setPos(0.01F, 2.8F, -2.0F);
            this.ArmLeft_1.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 29);
            this.EarRight.setPos(-1.5F, 0.0F, 1.0F);
            this.EarRight.addBox(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.13665927909957545F, 0.6373942508178124F, -0.6373942508178124F);
            this.UpperArmLeft_1 = new ModelRenderer(this, 37, 35);
            this.UpperArmLeft_1.setPos(0.0F, 5.8F, 1.0F);
            this.UpperArmLeft_1.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft_1, -0.08726646259971647F, 0.0F, 0.0F);
            this.HornLeft3 = new ModelRenderer(this, 16, 36);
            this.HornLeft3.mirror = true;
            this.HornLeft3.setPos(0.01F, -0.5F, -0.5F);
            this.HornLeft3.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeft3, 0.591841146688116F, 0.0F, 0.0F);
            this.Nose.addChild(this.Snout);
            this.HornRight5.addChild(this.HornRight6);
            this.Head.addChild(this.Nose);
            this.Hips.addChild(this.Tail);
            this.UpperLegLeft_1.addChild(this.LowerLegLeft_1);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.HornLeft2.addChild(this.HornLeft5);
            this.HornRight2.addChild(this.HornRight3);
            this.HornLeft3.addChild(this.HornLeft4);
            this.Head.addChild(this.Mouth);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Head.addChild(this.HornLeft1);
            this.Chest.addChild(this.Body);
            this.HornLeft1.addChild(this.HornLeft2);
            this.HornRight1.addChild(this.HornRight2);
            this.HornLeft5.addChild(this.HornLeft6);
            this.Head.addChild(this.EarLeft);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Hips.addChild(this.ThighLeft_1);
            this.Chest.addChild(this.ArmBaseLeft_1);
            this.HornRight3.addChild(this.HornRight4);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.ThighLeft_1.addChild(this.UpperLegLeft_1);
            this.ArmLeft_1.addChild(this.HandLeft_1);
            this.Head.addChild(this.HornRight1);
            this.Chest.addChild(this.Neck);
            this.LowerLegLeft_1.addChild(this.FootLeft_1);
            this.Body.addChild(this.Hips);
            this.HornRight2.addChild(this.HornRight5);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Hips.addChild(this.ThighLeft);
            this.ArmLeft.addChild(this.HandLeft);
            this.Neck.addChild(this.Head);
            this.UpperArmLeft_1.addChild(this.ArmLeft_1);
            this.Head.addChild(this.EarRight);
            this.ArmBaseLeft_1.addChild(this.UpperArmLeft_1);
            this.HornLeft2.addChild(this.HornLeft3);
            this.saveBase();
        }

        @Override
        public void setupAnim(PronghornEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.00F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.819F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 1.00F;
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
                this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.819F;
                this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 1.00F;

                this.Chest.y = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 11.0F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.139F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.182F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.091F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.228F;
                this.UpperArmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.087F;
                this.ArmLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F;
                this.HandLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.ArmBaseLeft_1.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.228F;
                this.UpperArmLeft_1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.087F;
                this.ArmLeft_1.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F;
                this.HandLeft_1.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.819F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.956F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.182F;
                this.ThighLeft_1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F;
                this.UpperLegLeft_1.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.819F;
                this.LowerLegLeft_1.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.956F;
                this.FootLeft_1.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.182F;
            }
        }
    }


    public static class Child extends PronghornModel {

        public ModelRenderer Body;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseLeft_1;
        public ModelRenderer Neck;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail;
        public ModelRenderer ThighLeft_1;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegLeft_1;
        public ModelRenderer LowerLegLeft_1;
        public ModelRenderer FootLeft_1;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer UpperArmLeft_1;
        public ModelRenderer ArmLeft_1;
        public ModelRenderer HandLeft_1;
        public ModelRenderer Head;
        public ModelRenderer Nose;
        public ModelRenderer Mouth;
        public ModelRenderer EarLeft;
        public ModelRenderer HornLeft1;
        public ModelRenderer EarRight;
        public ModelRenderer HornRight1;
        public ModelRenderer Snout;
        public ModelRenderer HornLeft2;
        public ModelRenderer HornLeft3;
        public ModelRenderer HornLeft5;
        public ModelRenderer HornLeft4;
        public ModelRenderer HornLeft6;
        public ModelRenderer HornRight2;
        public ModelRenderer HornRight3;
        public ModelRenderer HornRight5;
        public ModelRenderer HornRight4;
        public ModelRenderer HornRight6;


        public Child() {
            this.texWidth = 64;
            this.texHeight = 96;
            this.Snout = new ModelRenderer(this, 26, 44);
            this.Snout.setPos(0.0F, -0.7F, 0.0F);
            this.Snout.addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.27314402127920984F, 0.0F, 0.0F);
            this.HornRight6 = new ModelRenderer(this, 22, 35);
            this.HornRight6.setPos(0.0F, 0.01F, -1.5F);
            this.HornRight6.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRight6, 0.0F, -0.45535640450848164F, 0.0F);
            this.Nose = new ModelRenderer(this, 0, 43);
            this.Nose.setPos(0.0F, 0.5F, -1.8F);
            this.Nose.addBox(-1.5F, -1.0F, -3.5F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.27314402127920984F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 50, 52);
            this.Tail.setPos(0.0F, 0.0F, 4.5F);
            this.Tail.addBox(-1.0F, -0.6F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, -0.8651597048872669F, 0.0F, 0.0F);
            this.LowerLegLeft_1 = new ModelRenderer(this, 32, 53);
            this.LowerLegLeft_1.setPos(0.05F, 3.5F, 1.5F);
            this.LowerLegLeft_1.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft_1, -0.956091342937205F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 37, 35);
            this.UpperArmLeft.mirror = true;
            this.UpperArmLeft.setPos(0.0F, 5.8F, 1.0F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.08726646259971647F, 0.0F, 0.0F);
            this.HornLeft5 = new ModelRenderer(this, 16, 36);
            this.HornLeft5.mirror = true;
            this.HornLeft5.setPos(0.01F, -0.5F, -0.5F);
            this.HornLeft5.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeft5, -0.591841146688116F, 0.45535640450848164F, 0.0F);
            this.HornRight3 = new ModelRenderer(this, 16, 36);
            this.HornRight3.setPos(-0.01F, -0.5F, -0.5F);
            this.HornRight3.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRight3, 0.591841146688116F, 0.0F, 0.0F);
            this.HornLeft4 = new ModelRenderer(this, 15, 32);
            this.HornLeft4.mirror = true;
            this.HornLeft4.setPos(0.0F, 0.0F, 1.6F);
            this.HornLeft4.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeft4, -0.45535640450848164F, -0.45535640450848164F, 0.0F);
            this.Mouth = new ModelRenderer(this, 15, 45);
            this.Mouth.setPos(0.0F, 2.0F, -1.5F);
            this.Mouth.addBox(-1.0F, -0.5F, -3.3F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 0.04555309164612875F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 46, 35);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(-0.01F, 2.8F, -2.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 32, 53);
            this.LowerLegLeft.mirror = true;
            this.LowerLegLeft.setPos(-0.05F, 3.5F, 1.5F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.956091342937205F, 0.0F, 0.0F);
            this.HornLeft1 = new ModelRenderer(this, 8, 29);
            this.HornLeft1.mirror = true;
            this.HornLeft1.setPos(1.5F, -2.0F, -0.8F);
            this.HornLeft1.addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeft1, 0.4098033003787853F, 0.0F, 0.500909508638178F);
            this.Body = new ModelRenderer(this, 27, 1);
            this.Body.setPos(0.0F, -3.5F, 2.5F);
            this.Body.addBox(-3.0F, -0.5F, -1.0F, 6.0F, 8.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.18203784630933073F, 0.0F, 0.0F);
            this.HornLeft2 = new ModelRenderer(this, 16, 39);
            this.HornLeft2.mirror = true;
            this.HornLeft2.setPos(0.1F, -2.8F, 0.01F);
            this.HornLeft2.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeft2, 0.0F, 0.0F, -0.3642502295386026F);
            this.HornRight2 = new ModelRenderer(this, 16, 39);
            this.HornRight2.setPos(-0.1F, -2.8F, 0.01F);
            this.HornRight2.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRight2, 0.0F, 0.0F, 0.3642502295386026F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 11.0F, -6.1F);
            this.Chest.addBox(-2.5F, -4.0F, -3.0F, 5.0F, 8.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.13962634015954636F, 0.0F, 0.0F);
            this.HornLeft6 = new ModelRenderer(this, 22, 35);
            this.HornLeft6.mirror = true;
            this.HornLeft6.setPos(0.0F, 0.01F, -1.5F);
            this.HornLeft6.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeft6, 0.0F, 0.45535640450848164F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 29);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.5F, -0.5F, 1.0F);
            this.EarLeft.addBox(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.13665927909957545F, -0.6373942508178124F, 0.6373942508178124F);
            this.FootLeft = new ModelRenderer(this, 41, 58);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(-0.1F, 6.0F, -1.4F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.18203784630933073F, 0.0F, 0.0F);
            this.ThighLeft_1 = new ModelRenderer(this, 0, 49);
            this.ThighLeft_1.setPos(-2.1F, 1.5F, 2.3F);
            this.ThighLeft_1.addBox(-1.5F, -1.5F, -2.0F, 3.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.ArmBaseLeft_1 = new ModelRenderer(this, 22, 34);
            this.ArmBaseLeft_1.setPos(-2.0F, -0.2F, -0.6F);
            this.ArmBaseLeft_1.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft_1, 0.2275909337942703F, 0.0F, 0.0F);
            this.HornRight4 = new ModelRenderer(this, 15, 32);
            this.HornRight4.setPos(0.0F, 0.0F, 1.6F);
            this.HornRight4.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRight4, -0.45535640450848164F, 0.45535640450848164F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 19, 54);
            this.UpperLegLeft.mirror = true;
            this.UpperLegLeft.setPos(0.0F, 6.0F, -0.5F);
            this.UpperLegLeft.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.8196066007575706F, 0.0F, 0.0F);
            this.UpperLegLeft_1 = new ModelRenderer(this, 19, 54);
            this.UpperLegLeft_1.setPos(0.0F, 5.9F, -0.5F);
            this.UpperLegLeft_1.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft_1, 0.8196066007575706F, 0.0F, 0.0F);
            this.HandLeft_1 = new ModelRenderer(this, 55, 37);
            this.HandLeft_1.setPos(0.1F, 2.9F, 0.8F);
            this.HandLeft_1.addBox(-1.0F, -0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.HornRight1 = new ModelRenderer(this, 8, 29);
            this.HornRight1.setPos(-1.5F, -2.0F, -0.8F);
            this.HornRight1.addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRight1, 0.4098033003787853F, 0.0F, -0.500909508638178F);
            this.Neck = new ModelRenderer(this, 31, 17);
            this.Neck.setPos(0.0F, -2.8F, -2.9F);
            this.Neck.addBox(-1.5F, -1.0F, -4.4F, 3.0F, 4.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.8196066007575706F, 0.0F, 0.0F);
            this.FootLeft_1 = new ModelRenderer(this, 41, 58);
            this.FootLeft_1.setPos(0.1F, 6.0F, -1.4F);
            this.FootLeft_1.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft_1, 0.18203784630933073F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 16);
            this.Hips.setPos(0.0F, 0.0F, 5.5F);
            this.Hips.addBox(-2.5F, -0.5F, 0.0F, 5.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.0911061832922575F, 0.0F, 0.0F);
            this.HornRight5 = new ModelRenderer(this, 16, 36);
            this.HornRight5.setPos(0.01F, -0.5F, -0.5F);
            this.HornRight5.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRight5, -0.591841146688116F, -0.45535640450848164F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 22, 34);
            this.ArmBaseLeft.mirror = true;
            this.ArmBaseLeft.setPos(2.0F, -0.2F, -0.6F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.2275909337942703F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 49);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(2.0F, 1.5F, 2.3F);
            this.ThighLeft.addBox(-1.5F, -1.5F, -2.0F, 3.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 55, 37);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(-0.1F, 2.9F, 0.8F);
            this.HandLeft.addBox(-1.0F, -0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 34);
            this.Head.setPos(0.0F, 2.0F, -3.5F);
            this.Head.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 1.0016444470669013F, 0.0F, 0.0F);
            this.ArmLeft_1 = new ModelRenderer(this, 46, 35);
            this.ArmLeft_1.setPos(0.01F, 2.8F, -2.0F);
            this.ArmLeft_1.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 29);
            this.EarRight.setPos(-1.5F, 0.0F, 1.0F);
            this.EarRight.addBox(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.13665927909957545F, 0.6373942508178124F, -0.6373942508178124F);
            this.UpperArmLeft_1 = new ModelRenderer(this, 37, 35);
            this.UpperArmLeft_1.setPos(0.0F, 5.8F, 1.0F);
            this.UpperArmLeft_1.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft_1, -0.08726646259971647F, 0.0F, 0.0F);
            this.HornLeft3 = new ModelRenderer(this, 16, 36);
            this.HornLeft3.mirror = true;
            this.HornLeft3.setPos(0.01F, -0.5F, -0.5F);
            this.HornLeft3.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeft3, 0.591841146688116F, 0.0F, 0.0F);
            this.Nose.addChild(this.Snout);
            this.HornRight5.addChild(this.HornRight6);
            this.Head.addChild(this.Nose);
            this.Hips.addChild(this.Tail);
            this.UpperLegLeft_1.addChild(this.LowerLegLeft_1);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.HornLeft2.addChild(this.HornLeft5);
            this.HornRight2.addChild(this.HornRight3);
            this.HornLeft3.addChild(this.HornLeft4);
            this.Head.addChild(this.Mouth);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Head.addChild(this.HornLeft1);
            this.Chest.addChild(this.Body);
            this.HornLeft1.addChild(this.HornLeft2);
            this.HornRight1.addChild(this.HornRight2);
            this.HornLeft5.addChild(this.HornLeft6);
            this.Head.addChild(this.EarLeft);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Hips.addChild(this.ThighLeft_1);
            this.Chest.addChild(this.ArmBaseLeft_1);
            this.HornRight3.addChild(this.HornRight4);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.ThighLeft_1.addChild(this.UpperLegLeft_1);
            this.ArmLeft_1.addChild(this.HandLeft_1);
            this.Head.addChild(this.HornRight1);
            this.Chest.addChild(this.Neck);
            this.LowerLegLeft_1.addChild(this.FootLeft_1);
            this.Body.addChild(this.Hips);
            this.HornRight2.addChild(this.HornRight5);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Hips.addChild(this.ThighLeft);
            this.ArmLeft.addChild(this.HandLeft);
            this.Neck.addChild(this.Head);
            this.UpperArmLeft_1.addChild(this.ArmLeft_1);
            this.Head.addChild(this.EarRight);
            this.ArmBaseLeft_1.addChild(this.UpperArmLeft_1);
            this.HornLeft2.addChild(this.HornLeft3);
            this.saveBase();

        }

        @Override
        public void setupAnim(PronghornEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.00F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.819F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 1.00F;
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
                this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.819F;
                this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 1.00F;

                this.Chest.y = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 11.0F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.139F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.182F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.091F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.228F;
                this.UpperArmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.087F;
                this.ArmLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F;
                this.HandLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.ArmBaseLeft_1.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.228F;
                this.UpperArmLeft_1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.087F;
                this.ArmLeft_1.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F;
                this.HandLeft_1.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.819F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.956F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.182F;
                this.ThighLeft_1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F;
                this.UpperLegLeft_1.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.819F;
                this.LowerLegLeft_1.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.956F;
                this.FootLeft_1.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.182F;
            }
        }
    }
}

