package com.github.platinum234.exhibitadditions.client.model;

import com.github.platinum234.exhibitadditions.entity.PottoEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class PottoModel extends ZawaBaseModel<PottoEntity> {
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

    public static class Adult extends PottoModel {

        public ModelRenderer Body;
        public ModelRenderer ArmLeft;
        public ModelRenderer Neck;
        public ModelRenderer ArmLeft_1;
        public ModelRenderer Hips;
        public ModelRenderer Tail;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer Head;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Snout;
        public ModelRenderer Nose;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;


        public Adult() {
            this.texWidth = 64;
            this.texHeight = 32;

            this.ThighLeft = new ModelRenderer(this, 0, 20);
            this.ThighLeft.setPos(1.6F, 1.2F, 1.2F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, -0.2001892698642815F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 7);
            this.Body.setPos(0.0F, -1.5F, 0.1F);
            this.Body.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.04555309164612875F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 33, 7);
            this.HandLeft.setPos(-0.1F, 2.1F, -0.9F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 7, 24);
            this.LegLeft.setPos(-0.1F, 2.7F, -0.9F);
            this.LegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.47036624672827726F, 0.0F, 0.0F);
            this.ArmLeft_1 = new ModelRenderer(this, 14, 0);
            this.ArmLeft_1.mirror = true;
            this.ArmLeft_1.setPos(-1.0F, 0.5F, -0.3F);
            this.ArmLeft_1.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft_1, 0.0F, 0.0F, 0.3642502295386026F);
            this.Head = new ModelRenderer(this, 0, 0);
            this.Head.setPos(0.0F, 0.0F, -1.2F);
            this.Head.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.07452555872726274F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 20);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.6F, 1.2F, 1.2F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, -0.2001892698642815F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 8, 16);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(-0.2F, 1.5F, 0.4F);
            this.ForearmRight.addBox(-1.0F, -0.2F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, 0.0F, 0.0F, -0.3186971254089062F);
            this.Neck = new ModelRenderer(this, 34, 1);
            this.Neck.setPos(0.0F, -1.5F, -1.3F);
            this.Neck.addBox(-1.5F, 0.0F, -1.0F, 3.0F, 3.0F, 1.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 0.05235987755982988F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 18, 17);
            this.Tail.setPos(0.0F, 0.3F, 1.8F);
            this.Tail.addBox(-1.0F, -0.1F, 0.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, -1.242674374156741F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 0, 28);
            this.FootLeft.setPos(-0.8F, 2.5F, 0.8F);
            this.FootLeft.addBox(0.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.26616271092913524F, 0.0F, -0.004014257352407769F);
            this.Snout = new ModelRenderer(this, 1, 16);
            this.Snout.setPos(0.0F, 1.7F, -1.2F);
            this.Snout.addBox(-1.0F, 0.0F, -0.9F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.1464331302344367F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 19, 9);
            this.Hips.setPos(0.0F, 0.0F, 3.7F);
            this.Hips.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.1408480653096202F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 7, 24);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.1F, 2.7F, -0.9F);
            this.LegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.47036624672827726F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 8, 16);
            this.ForearmLeft.setPos(0.2F, 1.5F, 0.4F);
            this.ForearmLeft.addBox(-1.0F, -0.2F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, 0.0F, 0.0F, 0.3186971254089062F);
            this.ArmLeft = new ModelRenderer(this, 14, 0);
            this.ArmLeft.setPos(1.0F, 0.5F, -0.3F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.0F, 0.0F, -0.3642502295386026F);
            this.FootRight = new ModelRenderer(this, 0, 28);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 2.5F, 0.8F);
            this.FootRight.addBox(-0.9F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.26616271092913524F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 23, 0);
            this.EarLeft.setPos(1.0F, 0.3F, -0.3F);
            this.EarLeft.addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0F, 0.2617993877991494F, 0.0F);
            this.EarRight = new ModelRenderer(this, 23, 0);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.0F, 0.3F, -0.3F);
            this.EarRight.addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0F, -0.3490658503988659F, 0.0F);
            this.Chest = new ModelRenderer(this, 22, 3);
            this.Chest.setPos(0.0F, 19.2F, -1.5F);
            this.Chest.addBox(-2.0F, -1.5F, -1.5F, 4.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.03700097814490897F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 15, 6);
            this.Nose.setPos(0.0F, 1.2F, -0.9F);
            this.Nose.addBox(-0.5F, -0.6F, -0.7F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, -0.7086036496780869F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 33, 7);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.1F, 2.1F, -0.9F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Hips.addChild(this.ThighLeft);
            this.Chest.addChild(this.Body);
            this.ForearmLeft.addChild(this.HandLeft);
            this.ThighLeft.addChild(this.LegLeft);
            this.Chest.addChild(this.ArmLeft_1);
            this.Neck.addChild(this.Head);
            this.Hips.addChild(this.ThighRight);
            this.ArmLeft_1.addChild(this.ForearmRight);
            this.Chest.addChild(this.Neck);
            this.Hips.addChild(this.Tail);
            this.LegLeft.addChild(this.FootLeft);
            this.Head.addChild(this.Snout);
            this.Body.addChild(this.Hips);
            this.ThighRight.addChild(this.LegRight);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Chest.addChild(this.ArmLeft);
            this.LegRight.addChild(this.FootRight);
            this.Head.addChild(this.EarLeft);
            this.Head.addChild(this.EarRight);
            this.Head.addChild(this.Nose);
            this.ForearmRight.addChild(this.HandRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(PottoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);

        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

        }
    }


    public static class Child extends PottoModel {

        public ModelRenderer Body;
        public ModelRenderer ArmLeft;
        public ModelRenderer Neck;
        public ModelRenderer ArmLeft_1;
        public ModelRenderer Hips;
        public ModelRenderer Tail;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer Head;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Snout;
        public ModelRenderer Nose;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Child() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.ThighLeft = new ModelRenderer(this, 0, 20);
            this.ThighLeft.setPos(1.6F, 1.2F, 1.2F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, -0.2001892698642815F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 7);
            this.Body.setPos(0.0F, -1.5F, 0.1F);
            this.Body.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.04555309164612875F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 33, 7);
            this.HandLeft.setPos(-0.1F, 2.1F, -0.9F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 7, 24);
            this.LegLeft.setPos(-0.1F, 2.7F, -0.9F);
            this.LegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.47036624672827726F, 0.0F, 0.0F);
            this.ArmLeft_1 = new ModelRenderer(this, 14, 0);
            this.ArmLeft_1.mirror = true;
            this.ArmLeft_1.setPos(-1.0F, 0.5F, -0.3F);
            this.ArmLeft_1.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft_1, 0.0F, 0.0F, 0.3642502295386026F);
            this.Head = new ModelRenderer(this, 0, 0);
            this.Head.setPos(0.0F, 0.0F, -1.2F);
            this.Head.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.07452555872726274F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 20);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.6F, 1.2F, 1.2F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, -0.2001892698642815F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 8, 16);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(-0.2F, 1.5F, 0.4F);
            this.ForearmRight.addBox(-1.0F, -0.2F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, 0.0F, 0.0F, -0.3186971254089062F);
            this.Neck = new ModelRenderer(this, 34, 1);
            this.Neck.setPos(0.0F, -1.5F, -1.3F);
            this.Neck.addBox(-1.5F, 0.0F, -1.0F, 3.0F, 3.0F, 1.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 0.05235987755982988F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 18, 17);
            this.Tail.setPos(0.0F, 0.3F, 1.8F);
            this.Tail.addBox(-1.0F, -0.1F, 0.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, -1.242674374156741F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 0, 28);
            this.FootLeft.setPos(-0.8F, 2.5F, 0.8F);
            this.FootLeft.addBox(0.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.26616271092913524F, 0.0F, -0.004014257352407769F);
            this.Snout = new ModelRenderer(this, 1, 16);
            this.Snout.setPos(0.0F, 1.7F, -1.2F);
            this.Snout.addBox(-1.0F, 0.0F, -0.9F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.1464331302344367F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 19, 9);
            this.Hips.setPos(0.0F, 0.0F, 3.7F);
            this.Hips.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.1408480653096202F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 7, 24);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.1F, 2.7F, -0.9F);
            this.LegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.47036624672827726F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 8, 16);
            this.ForearmLeft.setPos(0.2F, 1.5F, 0.4F);
            this.ForearmLeft.addBox(-1.0F, -0.2F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, 0.0F, 0.0F, 0.3186971254089062F);
            this.ArmLeft = new ModelRenderer(this, 14, 0);
            this.ArmLeft.setPos(1.0F, 0.5F, -0.3F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.0F, 0.0F, -0.3642502295386026F);
            this.FootRight = new ModelRenderer(this, 0, 28);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 2.5F, 0.8F);
            this.FootRight.addBox(-0.9F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.26616271092913524F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 23, 0);
            this.EarLeft.setPos(1.0F, 0.3F, -0.3F);
            this.EarLeft.addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0F, 0.2617993877991494F, 0.0F);
            this.EarRight = new ModelRenderer(this, 23, 0);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.0F, 0.3F, -0.3F);
            this.EarRight.addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0F, -0.3490658503988659F, 0.0F);
            this.Chest = new ModelRenderer(this, 22, 3);
            this.Chest.setPos(0.0F, 19.2F, -1.5F);
            this.Chest.addBox(-2.0F, -1.5F, -1.5F, 4.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.03700097814490897F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 15, 6);
            this.Nose.setPos(0.0F, 1.2F, -0.9F);
            this.Nose.addBox(-0.5F, -0.6F, -0.7F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, -0.7086036496780869F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 33, 7);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.1F, 2.1F, -0.9F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Hips.addChild(this.ThighLeft);
            this.Chest.addChild(this.Body);
            this.ForearmLeft.addChild(this.HandLeft);
            this.ThighLeft.addChild(this.LegLeft);
            this.Chest.addChild(this.ArmLeft_1);
            this.Neck.addChild(this.Head);
            this.Hips.addChild(this.ThighRight);
            this.ArmLeft_1.addChild(this.ForearmRight);
            this.Chest.addChild(this.Neck);
            this.Hips.addChild(this.Tail);
            this.LegLeft.addChild(this.FootLeft);
            this.Head.addChild(this.Snout);
            this.Body.addChild(this.Hips);
            this.ThighRight.addChild(this.LegRight);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Chest.addChild(this.ArmLeft);
            this.LegRight.addChild(this.FootRight);
            this.Head.addChild(this.EarLeft);
            this.Head.addChild(this.EarRight);
            this.Head.addChild(this.Nose);
            this.ForearmRight.addChild(this.HandRight);
            this.saveBase();

        }

        @Override
        public void setupAnim(PottoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);

        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        }
    }
}
