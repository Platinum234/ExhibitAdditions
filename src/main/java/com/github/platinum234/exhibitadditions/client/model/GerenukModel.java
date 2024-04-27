package com.github.platinum234.exhibitadditions.client.model;

import com.github.platinum234.exhibitadditions.entity.GerenukEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class GerenukModel extends ZawaBaseModel<GerenukEntity> {
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

    public static class Adult extends GerenukModel {

        public ModelRenderer Body;
        public ModelRenderer Neck1;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail1;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer Neck2;
        public ModelRenderer Head;
        public ModelRenderer EarLeft;
        public ModelRenderer EarLeft_1;
        public ModelRenderer Mouth;
        public ModelRenderer Snout;
        public ModelRenderer Horn1L;
        public ModelRenderer Horn1R;
        public ModelRenderer Nose;
        public ModelRenderer Horn2L;
        public ModelRenderer Horn3L;
        public ModelRenderer Horn2R;
        public ModelRenderer Horn3R;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;


        public Adult() {
            this.texWidth = 128;
            this.texHeight = 64;
            this.Tail3 = new ModelRenderer(this, 0, 5);
            this.Tail3.setPos(0.0F, 3.6F, -0.1F);
            this.Tail3.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.017453292519943295F, 0.0F, 0.0F);
            this.Horn2L = new ModelRenderer(this, 23, 11);
            this.Horn2L.setPos(0.1F, -3.2F, 0.3F);
            this.Horn2L.addBox(-0.5F, -3.5F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2L, -0.5759586531581287F, 0.0F, -0.445058959258554F);
            this.FootLeft = new ModelRenderer(this, 45, 3);
            this.FootLeft.setPos(-0.01F, 6.2F, -1.8F);
            this.FootLeft.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.03490658503988659F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 33, 0);
            this.UpperLegLeft.setPos(0.0F, 5.4F, -1.3F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.4363323129985824F, 0.0F, 0.0F);
            this.Neck2 = new ModelRenderer(this, 29, 39);
            this.Neck2.setPos(0.0F, -3.5F, -0.6F);
            this.Neck2.addBox(-1.5F, -5.7F, -1.4F, 3.0F, 7.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, -0.41887902047863906F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 43, 23);
            this.ArmBaseLeft.setPos(3.0F, -0.3F, 0.4F);
            this.ArmBaseLeft.addBox(-2.0F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, -0.06981317007977318F, 0.0F, 0.0F);
            this.Horn1R = new ModelRenderer(this, 16, 11);
            this.Horn1R.mirror = true;
            this.Horn1R.setPos(-1.3F, -1.6F, -0.6F);
            this.Horn1R.addBox(-0.5F, -3.5F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1R, -0.6981317007977318F, 0.0F, -0.296705972839036F);
            this.EarLeft = new ModelRenderer(this, 37, 23);
            this.EarLeft.setPos(1.6F, -0.6F, 1.2F);
            this.EarLeft.addBox(-0.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.2617993877991494F, -0.8880235420568425F, -0.47891835606830785F);
            this.ForearmRight = new ModelRenderer(this, 43, 42);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.01F, 6.0F, -2.3F);
            this.ForearmRight.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.03490658503988659F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 22, 30);
            this.Head.setPos(0.0F, -6.7F, -0.4F);
            this.Head.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.20943951023931953F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 20, 18);
            this.Nose.setPos(0.0F, 0.3F, -2.5F);
            this.Nose.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.296705972839036F, 0.0F, 0.0F);
            this.Horn2R = new ModelRenderer(this, 23, 11);
            this.Horn2R.mirror = true;
            this.Horn2R.setPos(-0.1F, -3.2F, 0.3F);
            this.Horn2R.addBox(-0.5F, -3.5F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2R, -0.5759586531581287F, 0.0F, 0.445058959258554F);
            this.Snout = new ModelRenderer(this, 25, 23);
            this.Snout.setPos(0.0F, -0.8F, -2.0F);
            this.Snout.addBox(-1.5F, 0.0F, -2.5F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.0781907508222411F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 17, 0);
            this.ThighLeft.setPos(2.1F, 1.6F, 1.8F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.25481807744907486F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 37, 51);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.1F, 5.2F, 0.5F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarLeft_1 = new ModelRenderer(this, 37, 23);
            this.EarLeft_1.mirror = true;
            this.EarLeft_1.setPos(-1.6F, -0.6F, 1.2F);
            this.EarLeft_1.addBox(-2.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft_1, 0.2617993877991494F, 0.8880235420568425F, 0.47891835606830785F);
            this.Tail2 = new ModelRenderer(this, 8, 0);
            this.Tail2.setPos(0.0F, 1.4F, 0.0F);
            this.Tail2.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.06981317007977318F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 43, 42);
            this.ForearmLeft.setPos(-0.01F, 6.0F, -2.3F);
            this.ForearmLeft.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.03490658503988659F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 20, 50);
            this.Neck1.setPos(0.0F, -0.7F, -1.0F);
            this.Neck1.addBox(-2.0F, -4.0F, -2.5F, 4.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.3839724354387525F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 39, 10);
            this.LowerLegLeft.setPos(-0.01F, 5.8F, 2.5F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.4363323129985824F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 45, 3);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.01F, 6.2F, -1.8F);
            this.FootRight.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.03490658503988659F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 37, 51);
            this.HandLeft.setPos(-0.1F, 5.2F, 0.5F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 20);
            this.Chest.setPos(0.0F, 8.0F, -6.0F);
            this.Chest.addBox(-3.5F, -3.5F, -2.5F, 7.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.11728612207217244F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 43, 23);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-3.0F, -0.3F, 0.4F);
            this.ArmBaseRight.addBox(-1.0F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, -0.06981317007977318F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 41, 32);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.4F, 3.0F, 2.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.19547687289441354F, 0.0F, 0.0F);
            this.Horn3L = new ModelRenderer(this, 30, 12);
            this.Horn3L.setPos(0.1F, -3.3F, -0.7F);
            this.Horn3L.addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3L, 0.5061454830783556F, 0.0F, 0.43022365395869955F);
            this.Tail1 = new ModelRenderer(this, 0, 0);
            this.Tail1.setPos(0.0F, 0.3F, 3.5F);
            this.Tail1.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.3127630032889644F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 41, 32);
            this.ArmLeft.setPos(-0.4F, 3.0F, 2.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.19547687289441354F, 0.0F, 0.0F);
            this.Horn3R = new ModelRenderer(this, 30, 12);
            this.Horn3R.mirror = true;
            this.Horn3R.setPos(-0.1F, -3.3F, -0.7F);
            this.Horn3R.addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3R, 0.5061454830783556F, 0.0F, -0.43022365395869955F);
            this.Body = new ModelRenderer(this, 0, 34);
            this.Body.setPos(0.0F, -3.5F, 2.5F);
            this.Body.addBox(-3.0F, 0.0F, -1.5F, 6.0F, 7.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.1563815016444822F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 50);
            this.Hips.setPos(0.0F, 0.2F, 6.5F);
            this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.2617993877991494F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 17, 0);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.1F, 1.6F, 1.8F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.25481807744907486F, 0.0F, 0.0F);
            this.Horn1L = new ModelRenderer(this, 16, 11);
            this.Horn1L.setPos(1.3F, -1.6F, -0.6F);
            this.Horn1L.addBox(-0.5F, -3.5F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1L, -0.6981317007977318F, 0.0F, 0.296705972839036F);
            this.Mouth = new ModelRenderer(this, 31, 18);
            this.Mouth.setPos(0.0F, 0.8F, -1.9F);
            this.Mouth.addBox(-1.0F, 0.0F, -2.4F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 0.03490658503988659F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 39, 10);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.01F, 5.8F, 2.5F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.4363323129985824F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 33, 0);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 5.4F, -1.3F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.4363323129985824F, 0.0F, 0.0F);
            this.Tail2.addChild(this.Tail3);
            this.Horn1L.addChild(this.Horn2L);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Neck1.addChild(this.Neck2);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Head.addChild(this.Horn1R);
            this.Head.addChild(this.EarLeft);
            this.ArmRight.addChild(this.ForearmRight);
            this.Neck2.addChild(this.Head);
            this.Snout.addChild(this.Nose);
            this.Horn1R.addChild(this.Horn2R);
            this.Head.addChild(this.Snout);
            this.Hips.addChild(this.ThighLeft);
            this.ForearmRight.addChild(this.HandRight);
            this.Head.addChild(this.EarLeft_1);
            this.Tail1.addChild(this.Tail2);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Chest.addChild(this.Neck1);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.LowerLegRight.addChild(this.FootRight);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Chest.addChild(this.ArmBaseRight);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Horn2L.addChild(this.Horn3L);
            this.Hips.addChild(this.Tail1);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Horn2R.addChild(this.Horn3R);
            this.Chest.addChild(this.Body);
            this.Body.addChild(this.Hips);
            this.Hips.addChild(this.ThighRight);
            this.Head.addChild(this.Horn1L);
            this.Head.addChild(this.Mouth);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.ThighRight.addChild(this.UpperLegRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(GerenukEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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


    public static class Child extends GerenukModel {

        public ModelRenderer Body;
        public ModelRenderer Neck1;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail1;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer Neck2;
        public ModelRenderer Head;
        public ModelRenderer EarLeft;
        public ModelRenderer EarLeft_1;
        public ModelRenderer Mouth;
        public ModelRenderer Snout;
        public ModelRenderer Horn1L;
        public ModelRenderer Horn1R;
        public ModelRenderer Nose;
        public ModelRenderer Horn2L;
        public ModelRenderer Horn3L;
        public ModelRenderer Horn2R;
        public ModelRenderer Horn3R;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Child() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.Tail3 = new ModelRenderer(this, 0, 5);
            this.Tail3.setPos(0.0F, 3.6F, -0.1F);
            this.Tail3.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.017453292519943295F, 0.0F, 0.0F);
            this.Horn2L = new ModelRenderer(this, 23, 11);
            this.Horn2L.setPos(0.1F, -3.2F, 0.3F);
            this.Horn2L.addBox(-0.5F, -3.5F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2L, -0.5759586531581287F, 0.0F, -0.445058959258554F);
            this.FootLeft = new ModelRenderer(this, 45, 3);
            this.FootLeft.setPos(-0.01F, 6.2F, -1.8F);
            this.FootLeft.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.03490658503988659F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 33, 0);
            this.UpperLegLeft.setPos(0.0F, 5.4F, -1.3F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.4363323129985824F, 0.0F, 0.0F);
            this.Neck2 = new ModelRenderer(this, 29, 39);
            this.Neck2.setPos(0.0F, -3.5F, -0.6F);
            this.Neck2.addBox(-1.5F, -5.7F, -1.4F, 3.0F, 7.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, -0.41887902047863906F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 43, 23);
            this.ArmBaseLeft.setPos(3.0F, -0.3F, 0.4F);
            this.ArmBaseLeft.addBox(-2.0F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, -0.06981317007977318F, 0.0F, 0.0F);
            this.Horn1R = new ModelRenderer(this, 16, 11);
            this.Horn1R.mirror = true;
            this.Horn1R.setPos(-1.3F, -1.6F, -0.6F);
            this.Horn1R.addBox(-0.5F, -3.5F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1R, -0.6981317007977318F, 0.0F, -0.296705972839036F);
            this.EarLeft = new ModelRenderer(this, 37, 23);
            this.EarLeft.setPos(1.6F, -0.6F, 1.2F);
            this.EarLeft.addBox(-0.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.2617993877991494F, -0.8880235420568425F, -0.47891835606830785F);
            this.ForearmRight = new ModelRenderer(this, 43, 42);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.01F, 6.0F, -2.3F);
            this.ForearmRight.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.03490658503988659F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 22, 30);
            this.Head.setPos(0.0F, -6.7F, -0.4F);
            this.Head.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.20943951023931953F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 20, 18);
            this.Nose.setPos(0.0F, 0.3F, -2.5F);
            this.Nose.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.296705972839036F, 0.0F, 0.0F);
            this.Horn2R = new ModelRenderer(this, 23, 11);
            this.Horn2R.mirror = true;
            this.Horn2R.setPos(-0.1F, -3.2F, 0.3F);
            this.Horn2R.addBox(-0.5F, -3.5F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2R, -0.5759586531581287F, 0.0F, 0.445058959258554F);
            this.Snout = new ModelRenderer(this, 25, 23);
            this.Snout.setPos(0.0F, -0.8F, -2.0F);
            this.Snout.addBox(-1.5F, 0.0F, -2.5F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.0781907508222411F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 17, 0);
            this.ThighLeft.setPos(2.1F, 1.6F, 1.8F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.25481807744907486F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 37, 51);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.1F, 5.2F, 0.5F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarLeft_1 = new ModelRenderer(this, 37, 23);
            this.EarLeft_1.mirror = true;
            this.EarLeft_1.setPos(-1.6F, -0.6F, 1.2F);
            this.EarLeft_1.addBox(-2.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft_1, 0.2617993877991494F, 0.8880235420568425F, 0.47891835606830785F);
            this.Tail2 = new ModelRenderer(this, 8, 0);
            this.Tail2.setPos(0.0F, 1.4F, 0.0F);
            this.Tail2.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.06981317007977318F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 43, 42);
            this.ForearmLeft.setPos(-0.01F, 6.0F, -2.3F);
            this.ForearmLeft.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.03490658503988659F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 20, 50);
            this.Neck1.setPos(0.0F, -0.7F, -1.0F);
            this.Neck1.addBox(-2.0F, -4.0F, -2.5F, 4.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.3839724354387525F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 39, 10);
            this.LowerLegLeft.setPos(-0.01F, 5.8F, 2.5F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.4363323129985824F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 45, 3);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.01F, 6.2F, -1.8F);
            this.FootRight.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.03490658503988659F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 37, 51);
            this.HandLeft.setPos(-0.1F, 5.2F, 0.5F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 20);
            this.Chest.setPos(0.0F, 8.0F, -6.0F);
            this.Chest.addBox(-3.5F, -3.5F, -2.5F, 7.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.11728612207217244F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 43, 23);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-3.0F, -0.3F, 0.4F);
            this.ArmBaseRight.addBox(-1.0F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, -0.06981317007977318F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 41, 32);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.4F, 3.0F, 2.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.19547687289441354F, 0.0F, 0.0F);
            this.Horn3L = new ModelRenderer(this, 30, 12);
            this.Horn3L.setPos(0.1F, -3.3F, -0.7F);
            this.Horn3L.addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3L, 0.5061454830783556F, 0.0F, 0.43022365395869955F);
            this.Tail1 = new ModelRenderer(this, 0, 0);
            this.Tail1.setPos(0.0F, 0.3F, 3.5F);
            this.Tail1.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.3127630032889644F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 41, 32);
            this.ArmLeft.setPos(-0.4F, 3.0F, 2.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.19547687289441354F, 0.0F, 0.0F);
            this.Horn3R = new ModelRenderer(this, 30, 12);
            this.Horn3R.mirror = true;
            this.Horn3R.setPos(-0.1F, -3.3F, -0.7F);
            this.Horn3R.addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3R, 0.5061454830783556F, 0.0F, -0.43022365395869955F);
            this.Body = new ModelRenderer(this, 0, 34);
            this.Body.setPos(0.0F, -3.5F, 2.5F);
            this.Body.addBox(-3.0F, 0.0F, -1.5F, 6.0F, 7.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.1563815016444822F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 50);
            this.Hips.setPos(0.0F, 0.2F, 6.5F);
            this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.2617993877991494F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 17, 0);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.1F, 1.6F, 1.8F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.25481807744907486F, 0.0F, 0.0F);
            this.Horn1L = new ModelRenderer(this, 16, 11);
            this.Horn1L.setPos(1.3F, -1.6F, -0.6F);
            this.Horn1L.addBox(-0.5F, -3.5F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1L, -0.6981317007977318F, 0.0F, 0.296705972839036F);
            this.Mouth = new ModelRenderer(this, 31, 18);
            this.Mouth.setPos(0.0F, 0.8F, -1.9F);
            this.Mouth.addBox(-1.0F, 0.0F, -2.4F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 0.03490658503988659F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 39, 10);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.01F, 5.8F, 2.5F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.4363323129985824F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 33, 0);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 5.4F, -1.3F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.4363323129985824F, 0.0F, 0.0F);
            this.Tail2.addChild(this.Tail3);
            this.Horn1L.addChild(this.Horn2L);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Neck1.addChild(this.Neck2);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Head.addChild(this.Horn1R);
            this.Head.addChild(this.EarLeft);
            this.ArmRight.addChild(this.ForearmRight);
            this.Neck2.addChild(this.Head);
            this.Snout.addChild(this.Nose);
            this.Horn1R.addChild(this.Horn2R);
            this.Head.addChild(this.Snout);
            this.Hips.addChild(this.ThighLeft);
            this.ForearmRight.addChild(this.HandRight);
            this.Head.addChild(this.EarLeft_1);
            this.Tail1.addChild(this.Tail2);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Chest.addChild(this.Neck1);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.LowerLegRight.addChild(this.FootRight);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Chest.addChild(this.ArmBaseRight);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Horn2L.addChild(this.Horn3L);
            this.Hips.addChild(this.Tail1);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Horn2R.addChild(this.Horn3R);
            this.Chest.addChild(this.Body);
            this.Body.addChild(this.Hips);
            this.Hips.addChild(this.ThighRight);
            this.Head.addChild(this.Horn1L);
            this.Head.addChild(this.Mouth);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.ThighRight.addChild(this.UpperLegRight);
            this.saveBase();

        }

        @Override
        public void setupAnim(GerenukEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
