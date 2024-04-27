package com.github.platinum234.exhibitadditions.client.model;

import com.github.platinum234.exhibitadditions.entity.SwampMonkeyEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class SwampMonkeyModel extends ZawaBaseModel<SwampMonkeyEntity> {
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

    public static class Adult extends SwampMonkeyModel {

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
        public ModelRenderer Nose;
        public ModelRenderer SideburnLeft;
        public ModelRenderer Monobrow;
        public ModelRenderer SideburnRight;
        public ModelRenderer Mouth;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer TopMouth;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ThumbLeft;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;
        public ModelRenderer ThumbRight;


        public Adult() {
            this.texWidth = 128;
            this.texHeight = 64;
            this.ThighLeft = new ModelRenderer(this, 30, 24);
            this.ThighLeft.setPos(2.2F, 1.8F, 1.1F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 24, 33);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 4.6F, -1.0F);
            this.HandRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.05235987755982988F, 0.0F, 0.13962634015954636F);
            this.ThighRight = new ModelRenderer(this, 30, 24);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.2F, 1.8F, 1.1F);
            this.ThighRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 24, 33);
            this.HandLeft.setPos(0.0F, 4.6F, -1.0F);
            this.HandLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.05235987755982988F, 0.0F, -0.13962634015954636F);
            this.Monobrow = new ModelRenderer(this, 23, 18);
            this.Monobrow.setPos(0.0F, -2.0F, -2.3F);
            this.Monobrow.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Monobrow, 0.12688543628709262F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 15, 33);
            this.ForearmLeft.setPos(-0.2F, 3.4F, 0.6F);
            this.ForearmLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.13962634015954636F, 0.0F, 0.13962634015954636F);
            this.Nose = new ModelRenderer(this, 19, 0);
            this.Nose.setPos(0.0F, -1.0F, -2.0F);
            this.Nose.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, -0.5235987755982988F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 37, 1);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-2.0F, -1.8F, 0.2F);
            this.EarRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0F, -0.5715953300281429F, 0.0F);
            this.Mouth = new ModelRenderer(this, 19, 10);
            this.Mouth.setPos(0.0F, 1.7F, -1.9F);
            this.Mouth.addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, 0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 0.13962634015954636F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 22);
            this.Hips.setPos(0.0F, 0.0F, 5.5F);
            this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.1424188642995762F, 0.0F, 0.0F);
            this.SideburnRight = new ModelRenderer(this, 25, 1);
            this.SideburnRight.mirror = true;
            this.SideburnRight.setPos(-1.3F, -1.7F, -1.7F);
            this.SideburnRight.addBox(-2.0F, 0.0F, 0.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(SideburnRight, 0.0F, 0.0F, -0.22689280275926282F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 15.8F, -2.5F);
            this.Chest.addBox(-2.5F, -2.5F, -2.0F, 5.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.05951572899103476F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 17, 24);
            this.ArmLeft.setPos(2.1F, -0.6F, 0.0F);
            this.ArmLeft.addBox(-2.0F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.13962634015954636F, 0.0F, 0.0F);
            this.Tail6 = new ModelRenderer(this, 43, 31);
            this.Tail6.setPos(0.01F, 0.0F, 2.7F);
            this.Tail6.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail6, 0.13020156286456727F, 0.0F, 0.0F);
            this.ThumbLeft = new ModelRenderer(this, 0, 0);
            this.ThumbLeft.setPos(-0.5F, 0.05F, 0.1F);
            this.ThumbLeft.texOffs(27, 40).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThumbLeft, 0.0F, 0.33161255787892263F, 0.0F);
            this.TopMouth = new ModelRenderer(this, 16, 6);
            this.TopMouth.setPos(0.0F, 1.7F, 0.0F);
            this.TopMouth.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopMouth, 0.5235987755982988F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 15, 33);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.2F, 3.4F, 0.6F);
            this.ForearmRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.13962634015954636F, 0.0F, -0.13962634015954636F);
            this.ArmRight = new ModelRenderer(this, 17, 24);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-2.1F, -0.6F, 0.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.13962634015954636F, 0.0F, 0.0F);
            this.SideburnLeft = new ModelRenderer(this, 25, 1);
            this.SideburnLeft.setPos(1.3F, -1.7F, -1.7F);
            this.SideburnLeft.addBox(0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(SideburnLeft, 0.0F, 0.0F, 0.22689280275926282F);
            this.Neck = new ModelRenderer(this, 0, 31);
            this.Neck.setPos(0.0F, -0.3F, -1.0F);
            this.Neck.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 3.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.2792526803190927F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 43, 13);
            this.Tail3.setPos(-0.01F, 0.0F, 2.7F);
            this.Tail3.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, -0.09354965023716202F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 35, 33);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.0F, 4.6F, -0.5F);
            this.LegRight.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.08726646259971647F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 10);
            this.Body.setPos(0.0F, -2.5F, 0.5F);
            this.Body.addBox(-3.0F, 0.0F, -0.2F, 6.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.09145524880976123F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 24, 38);
            this.FootLeft.setPos(-0.1F, 3.5F, -0.1F);
            this.FootLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.ThumbRight = new ModelRenderer(this, 0, 0);
            this.ThumbRight.setPos(0.5F, 0.05F, 0.1F);
            this.ThumbRight.texOffs(27, 40).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThumbRight, 0.0F, -0.33161255787892263F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 43, 7);
            this.Tail2.setPos(0.01F, 0.0F, 2.7F);
            this.Tail2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.14137167606944342F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 24, 38);
            this.FootRight.setPos(0.1F, 3.5F, -0.1F);
            this.FootRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 35, 33);
            this.LegLeft.setPos(0.0F, 4.6F, -0.5F);
            this.LegLeft.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.08726646259971647F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 37, 1);
            this.EarLeft.setPos(2.0F, -1.8F, 0.2F);
            this.EarLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0F, 0.5715953300281429F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 43, 19);
            this.Tail4.setPos(0.01F, 0.0F, 2.7F);
            this.Tail4.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail4, 0.0822050084347232F, 0.0F, 0.0F);
            this.Tail5 = new ModelRenderer(this, 43, 25);
            this.Tail5.setPos(-0.01F, 0.0F, 2.7F);
            this.Tail5.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail5, 0.13020156286456727F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 25, 9);
            this.Head.setPos(0.0F, 0.0F, -2.8F);
            this.Head.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.3717551173589867F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 43, 1);
            this.Tail1.setPos(0.0F, 0.0F, 2.7F);
            this.Tail1.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.1813397152743233F, 0.0F, 0.0F);
            this.Hips.addChild(this.ThighLeft);
            this.ForearmRight.addChild(this.HandRight);
            this.Hips.addChild(this.ThighRight);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.Monobrow);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Head.addChild(this.Nose);
            this.Head.addChild(this.EarRight);
            this.Head.addChild(this.Mouth);
            this.Body.addChild(this.Hips);
            this.Head.addChild(this.SideburnRight);
            this.Chest.addChild(this.ArmLeft);
            this.Tail5.addChild(this.Tail6);
            this.HandLeft.addChild(this.ThumbLeft);
            this.Nose.addChild(this.TopMouth);
            this.ArmRight.addChild(this.ForearmRight);
            this.Chest.addChild(this.ArmRight);
            this.Head.addChild(this.SideburnLeft);
            this.Chest.addChild(this.Neck);
            this.Tail2.addChild(this.Tail3);
            this.ThighRight.addChild(this.LegRight);
            this.Chest.addChild(this.Body);
            this.LegLeft.addChild(this.FootLeft);
            this.HandRight.addChild(this.ThumbRight);
            this.Tail1.addChild(this.Tail2);
            this.LegRight.addChild(this.FootRight);
            this.ThighLeft.addChild(this.LegLeft);
            this.Head.addChild(this.EarLeft);
            this.Tail3.addChild(this.Tail4);
            this.Tail4.addChild(this.Tail5);
            this.Neck.addChild(this.Head);
            this.Hips.addChild(this.Tail1);
            this.saveBase();
        }

        @Override
        public void setupAnim(SwampMonkeyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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


    public static class Child extends SwampMonkeyModel {

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
        public ModelRenderer Nose;
        public ModelRenderer SideburnLeft;
        public ModelRenderer Monobrow;
        public ModelRenderer SideburnRight;
        public ModelRenderer Mouth;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer TopMouth;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ThumbLeft;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;
        public ModelRenderer ThumbRight;

        public Child() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.ThighLeft = new ModelRenderer(this, 30, 24);
            this.ThighLeft.setPos(2.2F, 1.8F, 1.1F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 24, 33);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 4.6F, -1.0F);
            this.HandRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.05235987755982988F, 0.0F, 0.13962634015954636F);
            this.ThighRight = new ModelRenderer(this, 30, 24);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.2F, 1.8F, 1.1F);
            this.ThighRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 24, 33);
            this.HandLeft.setPos(0.0F, 4.6F, -1.0F);
            this.HandLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.05235987755982988F, 0.0F, -0.13962634015954636F);
            this.Monobrow = new ModelRenderer(this, 23, 18);
            this.Monobrow.setPos(0.0F, -2.0F, -2.3F);
            this.Monobrow.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Monobrow, 0.12688543628709262F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 15, 33);
            this.ForearmLeft.setPos(-0.2F, 3.4F, 0.6F);
            this.ForearmLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.13962634015954636F, 0.0F, 0.13962634015954636F);
            this.Nose = new ModelRenderer(this, 19, 0);
            this.Nose.setPos(0.0F, -1.0F, -2.0F);
            this.Nose.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, -0.5235987755982988F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 37, 1);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-2.0F, -1.8F, 0.2F);
            this.EarRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0F, -0.5715953300281429F, 0.0F);
            this.Mouth = new ModelRenderer(this, 19, 10);
            this.Mouth.setPos(0.0F, 1.7F, -1.9F);
            this.Mouth.addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, 0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 0.13962634015954636F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 22);
            this.Hips.setPos(0.0F, 0.0F, 5.5F);
            this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.1424188642995762F, 0.0F, 0.0F);
            this.SideburnRight = new ModelRenderer(this, 25, 1);
            this.SideburnRight.mirror = true;
            this.SideburnRight.setPos(-1.3F, -1.7F, -1.7F);
            this.SideburnRight.addBox(-2.0F, 0.0F, 0.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(SideburnRight, 0.0F, 0.0F, -0.22689280275926282F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 15.8F, -2.5F);
            this.Chest.addBox(-2.5F, -2.5F, -2.0F, 5.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.05951572899103476F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 17, 24);
            this.ArmLeft.setPos(2.1F, -0.6F, 0.0F);
            this.ArmLeft.addBox(-2.0F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.13962634015954636F, 0.0F, 0.0F);
            this.Tail6 = new ModelRenderer(this, 43, 31);
            this.Tail6.setPos(0.01F, 0.0F, 2.7F);
            this.Tail6.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail6, 0.13020156286456727F, 0.0F, 0.0F);
            this.ThumbLeft = new ModelRenderer(this, 0, 0);
            this.ThumbLeft.setPos(-0.5F, 0.05F, 0.1F);
            this.ThumbLeft.texOffs(27, 40).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThumbLeft, 0.0F, 0.33161255787892263F, 0.0F);
            this.TopMouth = new ModelRenderer(this, 16, 6);
            this.TopMouth.setPos(0.0F, 1.7F, 0.0F);
            this.TopMouth.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopMouth, 0.5235987755982988F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 15, 33);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.2F, 3.4F, 0.6F);
            this.ForearmRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.13962634015954636F, 0.0F, -0.13962634015954636F);
            this.ArmRight = new ModelRenderer(this, 17, 24);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-2.1F, -0.6F, 0.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.13962634015954636F, 0.0F, 0.0F);
            this.SideburnLeft = new ModelRenderer(this, 25, 1);
            this.SideburnLeft.setPos(1.3F, -1.7F, -1.7F);
            this.SideburnLeft.addBox(0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(SideburnLeft, 0.0F, 0.0F, 0.22689280275926282F);
            this.Neck = new ModelRenderer(this, 0, 31);
            this.Neck.setPos(0.0F, -0.3F, -1.0F);
            this.Neck.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 3.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.2792526803190927F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 43, 13);
            this.Tail3.setPos(-0.01F, 0.0F, 2.7F);
            this.Tail3.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, -0.09354965023716202F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 35, 33);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.0F, 4.6F, -0.5F);
            this.LegRight.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.08726646259971647F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 10);
            this.Body.setPos(0.0F, -2.5F, 0.5F);
            this.Body.addBox(-3.0F, 0.0F, -0.2F, 6.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.09145524880976123F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 24, 38);
            this.FootLeft.setPos(-0.1F, 3.5F, -0.1F);
            this.FootLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.ThumbRight = new ModelRenderer(this, 0, 0);
            this.ThumbRight.setPos(0.5F, 0.05F, 0.1F);
            this.ThumbRight.texOffs(27, 40).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThumbRight, 0.0F, -0.33161255787892263F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 43, 7);
            this.Tail2.setPos(0.01F, 0.0F, 2.7F);
            this.Tail2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.14137167606944342F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 24, 38);
            this.FootRight.setPos(0.1F, 3.5F, -0.1F);
            this.FootRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 35, 33);
            this.LegLeft.setPos(0.0F, 4.6F, -0.5F);
            this.LegLeft.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.08726646259971647F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 37, 1);
            this.EarLeft.setPos(2.0F, -1.8F, 0.2F);
            this.EarLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0F, 0.5715953300281429F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 43, 19);
            this.Tail4.setPos(0.01F, 0.0F, 2.7F);
            this.Tail4.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail4, 0.0822050084347232F, 0.0F, 0.0F);
            this.Tail5 = new ModelRenderer(this, 43, 25);
            this.Tail5.setPos(-0.01F, 0.0F, 2.7F);
            this.Tail5.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail5, 0.13020156286456727F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 25, 9);
            this.Head.setPos(0.0F, 0.0F, -2.8F);
            this.Head.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.3717551173589867F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 43, 1);
            this.Tail1.setPos(0.0F, 0.0F, 2.7F);
            this.Tail1.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.1813397152743233F, 0.0F, 0.0F);
            this.Hips.addChild(this.ThighLeft);
            this.ForearmRight.addChild(this.HandRight);
            this.Hips.addChild(this.ThighRight);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.Monobrow);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Head.addChild(this.Nose);
            this.Head.addChild(this.EarRight);
            this.Head.addChild(this.Mouth);
            this.Body.addChild(this.Hips);
            this.Head.addChild(this.SideburnRight);
            this.Chest.addChild(this.ArmLeft);
            this.Tail5.addChild(this.Tail6);
            this.HandLeft.addChild(this.ThumbLeft);
            this.Nose.addChild(this.TopMouth);
            this.ArmRight.addChild(this.ForearmRight);
            this.Chest.addChild(this.ArmRight);
            this.Head.addChild(this.SideburnLeft);
            this.Chest.addChild(this.Neck);
            this.Tail2.addChild(this.Tail3);
            this.ThighRight.addChild(this.LegRight);
            this.Chest.addChild(this.Body);
            this.LegLeft.addChild(this.FootLeft);
            this.HandRight.addChild(this.ThumbRight);
            this.Tail1.addChild(this.Tail2);
            this.LegRight.addChild(this.FootRight);
            this.ThighLeft.addChild(this.LegLeft);
            this.Head.addChild(this.EarLeft);
            this.Tail3.addChild(this.Tail4);
            this.Tail4.addChild(this.Tail5);
            this.Neck.addChild(this.Head);
            this.Hips.addChild(this.Tail1);
            this.saveBase();

        }

        @Override
        public void setupAnim(SwampMonkeyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
