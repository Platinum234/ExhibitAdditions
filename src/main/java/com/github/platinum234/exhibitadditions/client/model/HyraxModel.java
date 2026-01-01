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
        public ModelRenderer Hips_1;
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
            this.texWidth = 48;
            this.texHeight = 32;
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, -2.3F, -2.5F);
            this.Body.addBox(-2.0F, 0.0F, -3.5F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.27314402127920984F, 0.0F, 0.0F);
            this.Belly = new ModelRenderer(this, 20, 27);
            this.Belly.setPos(0.0F, 3.5F, -2.8F);
            this.Belly.addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 4.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Belly, -0.3186971254089062F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 27, 4);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.0F, 1.4F, 0.5F);
            this.ForearmRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.3186971254089062F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 12, 27);
            this.EarRight.setPos(-1.0F, -1.0F, 0.7F);
            this.EarRight.addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.8204792520677623F, -1.2747885016356248F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 26, 0);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-1.3F, 2.1F, -2.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.04555309164612875F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 23);
            this.Head.setPos(0.0F, 1.0F, -1.0F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.6244787850582824F, 0.0F, 0.0F);
            this.CheekRight = new ModelRenderer(this, 18, 13);
            this.CheekRight.setPos(-1.0F, 0.6F, 0.01F);
            this.CheekRight.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekRight, 0.0F, 0.0F, 0.0911061832922575F);
            this.LegRight = new ModelRenderer(this, 16, 6);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.1F, 2.0F, -1.0F);
            this.LegRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.5462880425584197F, 0.0F, 0.0F);
            this.LowerNeck = new ModelRenderer(this, 12, 23);
            this.LowerNeck.setPos(0.0F, 1.5F, 0.0F);
            this.LowerNeck.addBox(-1.0F, 0.1F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerNeck, 0.2275909337942703F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 27, 4);
            this.ForearmLeft.setPos(0.0F, 1.4F, 0.5F);
            this.ForearmLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.3186971254089062F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 22, 6);
            this.FootLeft.setPos(0.49F, 2.5F, 0.7F);
            this.FootLeft.addBox(-1.0F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.5462880425584197F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 16, 0);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.9F, -0.1F, 0.3F);
            this.ThighRight.addBox(-1.0F, -0.3F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.SnoutRight = new ModelRenderer(this, 6, 29);
            this.SnoutRight.mirror = true;
            this.SnoutRight.setPos(-0.21F, 0.0F, -1.0F);
            this.SnoutRight.addBox(-0.8F, -0.5F, -1.5F, 2.02F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(SnoutRight, 0.13665927909957545F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 16, 6);
            this.LegLeft.setPos(0.1F, 2.0F, -1.0F);
            this.LegLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.5462880425584197F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 12, 17);
            this.Neck.setPos(0.0F, 0.7F, -3.3F);
            this.Neck.addBox(-1.0F, -0.8F, -0.9F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.7740534966278743F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 16, 0);
            this.ThighLeft.setPos(1.9F, -0.1F, 0.3F);
            this.ThighLeft.addBox(-1.0F, -0.3F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 31, 4);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.49F, 2.5F, -0.5F);
            this.HandRight.addBox(-1.0F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.0911061832922575F, 0.0F, 0.0F);
            this.CheekLeft = new ModelRenderer(this, 18, 13);
            this.CheekLeft.mirror = true;
            this.CheekLeft.setPos(1.0F, 0.6F, 0.01F);
            this.CheekLeft.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekLeft, 0.0F, 0.0F, -0.0911061832922575F);
            this.HandLeft = new ModelRenderer(this, 31, 4);
            this.HandLeft.setPos(0.49F, 2.5F, -0.5F);
            this.HandLeft.addBox(-1.0F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.0911061832922575F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 12, 29);
            this.Mouth.setPos(0.0F, 0.9F, -0.9F);
            this.Mouth.addBox(-1.0F, -0.5F, -1.4F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.04555309164612875F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 22, 6);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.49F, 2.5F, 0.7F);
            this.FootRight.addBox(-1.0F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.5462880425584197F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 8);
            this.Hips.setPos(0.0F, 19.4F, 1.7F);
            this.Hips.addBox(-2.5F, -2.5F, -2.0F, 5.0F, 4.8F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, 0.008726646259971648F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 0, 29);
            this.Nose.setPos(0.0F, -0.8F, -0.02F);
            this.Nose.addBox(-0.5F, -0.7F, -2.6F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.3186971254089062F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 12, 27);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.0F, -1.0F, 0.7F);
            this.EarLeft.addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.8204792520677623F, 1.2747885016356248F, 0.0F);
            this.Hips_1 = new ModelRenderer(this, 0, 17);
            this.Hips_1.setPos(0.0F, -2.0F, 1.5F);
            this.Hips_1.addBox(-2.0F, -0.5F, 0.0F, 4.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips_1, -0.4098033003787853F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 26, 0);
            this.ArmLeft.setPos(1.3F, 2.1F, -2.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.04555309164612875F, 0.0F, 0.0F);
            this.Hips.addChild(this.Body);
            this.Body.addChild(this.Belly);
            this.ArmRight.addChild(this.ForearmRight);
            this.Head.addChild(this.EarRight);
            this.Body.addChild(this.ArmRight);
            this.Neck.addChild(this.Head);
            this.Head.addChild(this.CheekRight);
            this.ThighRight.addChild(this.LegRight);
            this.Neck.addChild(this.LowerNeck);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.LegLeft.addChild(this.FootLeft);
            this.Hips.addChild(this.ThighRight);
            this.Head.addChild(this.SnoutRight);
            this.ThighLeft.addChild(this.LegLeft);
            this.Body.addChild(this.Neck);
            this.Hips.addChild(this.ThighLeft);
            this.ForearmRight.addChild(this.HandRight);
            this.Head.addChild(this.CheekLeft);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.Mouth);
            this.LegRight.addChild(this.FootRight);
            this.Head.addChild(this.Nose);
            this.Head.addChild(this.EarLeft);
            this.Hips.addChild(this.Hips_1);
            this.Body.addChild(this.ArmLeft);
            this.saveBase();
        }

        @Override
        public void setupAnim(HyraxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
           // super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            super.setupAnim(entity, entity.tickCount, 0.3F, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.62F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0f;
            float degree = 1.0f;
            this.Head.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.05F) * degree * -0.1F * limbSwingAmount + 0.62F;
            this.EarLeft.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.82F;
            this.EarRight.xRot = MathHelper.cos(-1.5F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.82F;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.05F) * degree * 0.1F * limbSwingAmount - 0.77F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 6.0f, degree = 0.8f;
            this.ArmLeft.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.04F;
            this.ForearmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.31F;
            this.HandLeft.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount - 0.09F;
            this.ThighLeft.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount;
            this.LegLeft.xRot = MathHelper.cos(-0.5F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount + 0.54F;
            this.FootLeft.xRot = MathHelper.cos(-2.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.54F;
            this.ThighRight.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.1F) * degree * -1.5F * limbSwingAmount;
            this.LegRight.xRot = MathHelper.cos(-0.5F + limbSwing * speed * 0.1F) * degree * -0.8F * limbSwingAmount + 0.54F;
            this.FootRight.xRot = MathHelper.cos(-2.5F + limbSwing * speed * -0.1F) * degree * -1.0F * limbSwingAmount - 0.54F;
            this.ArmRight.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount - 0.04F;
            this.ForearmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount - 0.31F;
            this.HandRight.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.09F;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount - 0.77F;
            this.Head.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.62F;
            this.EarLeft.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.82F;
            this.EarRight.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.82F;
            this.Hips.y = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.8F * limbSwingAmount + 19.4F;
    }
}


    public static class Child extends HyraxModel {

        public ModelRenderer Chest;
        public ModelRenderer Rear;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer ChestUnder;
        public ModelRenderer Neck;
        public ModelRenderer ArmLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer TopSnout;
        public ModelRenderer ForeArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ForeArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;


        public Child() {
            this.texWidth = 32;
            this.texHeight = 32;
            this.ChestUnder = new ModelRenderer(this, 0, 23);
            this.ChestUnder.setPos(0.0F, 3.0F, -0.25F);
            this.ChestUnder.addBox(-2.0F, 0.8F, -2.0F, 4, 1, 2, 0.0F);
            this.setRotateAngle(ChestUnder, -0.27314402793711257F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 16, 22);
            this.LegRight.setPos(-0.1F, 2.0F, -1.0F);
            this.LegRight.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 2, 0.0F);
            this.setRotateAngle(LegRight, 0.7740535232594852F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 16);
            this.Chest.setPos(0.0F, -2.3F, -1.9F);
            this.Chest.addBox(-2.0F, -0.1F, -2.5F, 4, 4, 3, 0.0F);
            this.setRotateAngle(Chest, 0.136659280431156F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 22, 23);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(-0.1F, 1.5F, 0.4F);
            this.FootLeft.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
            this.setRotateAngle(FootLeft, -0.8196066167365371F, 0.0F, 0.0F);
            this.Rear = new ModelRenderer(this, 18, 9);
            this.Rear.setPos(0.0F, -2.0F, 1.5F);
            this.Rear.addBox(-2.0F, -0.5F, 0.0F, 4, 5, 2, 0.0F);
            this.setRotateAngle(Rear, -0.18203784098300857F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 16, 16);
            this.ThighRight.setPos(-2.0F, 0.2F, 1.2F);
            this.ThighRight.addBox(-1.0F, -0.5F, -1.5F, 2, 3, 3, 0.0F);
            this.Neck = new ModelRenderer(this, 22, 3);
            this.Neck.setPos(0.0F, 0.1F, -2.5F);
            this.Neck.addBox(-1.0F, 0.3F, -1.0F, 2, 3, 3, 0.0F);
            this.setRotateAngle(Neck, -0.4553564018453205F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 13, 0);
            this.Head.setPos(0.0F, 1.5F, -0.3F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
            this.setRotateAngle(Head, 0.36425021489121656F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 5, 3);
            this.Snout.setPos(0.0F, 0.9F, -0.7F);
            this.Snout.addBox(-1.0F, -1.5F, -2.0F, 2, 2, 2, 0.0F);
            this.setRotateAngle(Snout, 0.136659280431156F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 4, 29);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(-0.1F, 0.5F, -0.5F);
            this.HandLeft.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
            this.setRotateAngle(HandLeft, 0.5009094953223726F, 0.0F, 0.0F);
            this.ForeArmLeft = new ModelRenderer(this, 0, 29);
            this.ForeArmLeft.mirror = true;
            this.ForeArmLeft.setPos(0.0F, 2.0F, 0.5F);
            this.ForeArmLeft.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
            this.setRotateAngle(ForeArmLeft, -0.8196066167365371F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 0, 26);
            this.ArmRight.setPos(-1.3F, 2.9F, -2.0F);
            this.ArmRight.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
            this.setRotateAngle(ArmRight, 0.27314402793711257F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 6, 0);
            this.TopSnout.setPos(0.0F, -0.8F, 0.02F);
            this.TopSnout.addBox(-1.0F, -1.0F, -2.0F, 2, 1, 2, 0.0F);
            this.setRotateAngle(TopSnout, 0.136659280431156F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 7);
            this.Hips.setPos(0.0F, 20.5F, 0.0F);
            this.Hips.addBox(-2.5F, -2.5F, -2.0F, 5, 5, 4, 0.0F);
            this.setRotateAngle(Hips, 0.045553093477052F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 2);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.0F, -1.0F, 0.5F);
            this.EarLeft.addBox(-0.5F, -0.8F, -0.5F, 1, 1, 1, 0.0F);
            this.setRotateAngle(EarLeft, -0.22759093446006054F, 0.22759093446006054F, 0.5009094953223726F);
            this.ArmLeft = new ModelRenderer(this, 0, 26);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(1.3F, 2.9F, -2.0F);
            this.ArmLeft.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
            this.setRotateAngle(ArmLeft, 0.27314402793711257F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 16, 16);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(2.0F, 0.2F, 1.2F);
            this.ThighLeft.addBox(-1.0F, -0.5F, -1.5F, 2, 3, 3, 0.0F);
            this.FootRight = new ModelRenderer(this, 22, 23);
            this.FootRight.setPos(0.1F, 1.5F, 0.4F);
            this.FootRight.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
            this.setRotateAngle(FootRight, -0.8196066167365371F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 0);
            this.EarRight.setPos(-1.0F, -1.0F, 0.5F);
            this.EarRight.addBox(-0.5F, -0.8F, -0.5F, 1, 1, 1, 0.0F);
            this.setRotateAngle(EarRight, -0.22759093446006054F, -0.22759093446006054F, -0.5009094953223726F);
            this.HandRight = new ModelRenderer(this, 4, 29);
            this.HandRight.setPos(0.1F, 0.5F, -0.5F);
            this.HandRight.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
            this.setRotateAngle(HandRight, 0.40980330836826856F, 0.0F, 0.0F);
            this.ForeArmRight = new ModelRenderer(this, 0, 29);
            this.ForeArmRight.setPos(0.0F, 2.0F, 0.5F);
            this.ForeArmRight.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
            this.setRotateAngle(ForeArmRight, -0.8196066167365371F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 16, 22);
            this.LegLeft.mirror = true;
            this.LegLeft.setPos(0.1F, 2.0F, -1.0F);
            this.LegLeft.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 2, 0.0F);
            this.setRotateAngle(LegLeft, 0.7740535232594852F, 0.0F, 0.0F);
            this.Chest.addChild(this.ChestUnder);
            this.ThighRight.addChild(this.LegRight);
            this.Hips.addChild(this.Chest);
            this.LegLeft.addChild(this.FootLeft);
            this.Hips.addChild(this.Rear);
            this.Hips.addChild(this.ThighRight);
            this.Chest.addChild(this.Neck);
            this.Neck.addChild(this.Head);
            this.Head.addChild(this.Snout);
            this.ForeArmLeft.addChild(this.HandLeft);
            this.ArmLeft.addChild(this.ForeArmLeft);
            this.Chest.addChild(this.ArmRight);
            this.Snout.addChild(this.TopSnout);
            this.Head.addChild(this.EarLeft);
            this.Chest.addChild(this.ArmLeft);
            this.Hips.addChild(this.ThighLeft);
            this.LegRight.addChild(this.FootRight);
            this.Head.addChild(this.EarRight);
            this.ForeArmRight.addChild(this.HandRight);
            this.ArmRight.addChild(this.ForeArmRight);
            this.ThighLeft.addChild(this.LegLeft);
            this.saveBase();

        }

        @Override
        public void setupAnim(HyraxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.36F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0f;
            float degree = 1.0f;
            this.Head.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.05F) * degree * -0.1F * limbSwingAmount + 0.36F;
            this.EarLeft.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount - 0.23F;
            this.EarRight.xRot = MathHelper.cos(-1.5F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount - 0.23F;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.05F) * degree * 0.1F * limbSwingAmount - 0.46F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 6.0f, degree = 0.8f;
            this.ArmLeft.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount + 0.27F;
            this.ForeArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.82F;
            this.HandLeft.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.5F;
            this.ThighLeft.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount;
            this.LegLeft.xRot = MathHelper.cos(-0.5F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount + 0.77F;
            this.FootLeft.xRot = MathHelper.cos(-2.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.82F;
            this.ThighRight.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.1F) * degree * -1.5F * limbSwingAmount;
            this.LegRight.xRot = MathHelper.cos(-0.5F + limbSwing * speed * 0.1F) * degree * -0.8F * limbSwingAmount + 0.77F;
            this.FootRight.xRot = MathHelper.cos(-2.5F + limbSwing * speed * -0.1F) * degree * -1.0F * limbSwingAmount - 0.82F;
            this.ArmRight.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.27F;
            this.ForeArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount - 0.82F;
            this.HandRight.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount + 0.5F;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount - 0.46F;
            this.Head.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.36F;
            this.EarLeft.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount - 0.23F;
            this.EarRight.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount - 0.23F;
            this.Hips.y = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.8F * limbSwingAmount + 20F;
        }
    }
}
