package com.github.platinum234.exhibitadditions.client.model;

import com.github.platinum234.exhibitadditions.entity.WildebeestEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class WildebeestModel extends ZawaBaseModel<WildebeestEntity> {
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

    public static class Adult extends WildebeestModel {

        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
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
        public ModelRenderer Tail4;
        public ModelRenderer Head;
        public ModelRenderer NeckLower;
        public ModelRenderer Neck_1;
        public ModelRenderer Snout;
        public ModelRenderer HornLeft;
        public ModelRenderer EarRight;
        public ModelRenderer EarLeft;
        public ModelRenderer HornRight;
        public ModelRenderer TopSnout;
        public ModelRenderer Jaw;
        public ModelRenderer TopSnout_1;
        public ModelRenderer Mouth;
        public ModelRenderer Horn2Left;
        public ModelRenderer Horn3Left;
        public ModelRenderer Horn3Left_1;
        public ModelRenderer Horn2Right;
        public ModelRenderer Horn3Right;
        public ModelRenderer Horn3Right_1;
        public ModelRenderer NeckLower_1;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;


        public Adult() {
            this.texWidth = 128;
            this.texHeight = 128;
            this.HandLeft = new ModelRenderer(this, 59, 55);
            this.HandLeft.setPos(-0.4F, 5.7F, 1.0F);
            this.HandLeft.addBox(-1.2F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.NeckLower_1 = new ModelRenderer(this, 39, 15);
            this.NeckLower_1.setPos(0.0F, 3.0F, -1.0F);
            this.NeckLower_1.addBox(-0.5F, -5.0F, -4.0F, 1.0F, 9.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower_1, 0.3909537457888271F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 82, 36);
            this.UpperLegLeft.setPos(1.5F, 8.0F, -2.0F);
            this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.31991885055898F, 0.0F, 0.0F);
            this.Neck_1 = new ModelRenderer(this, 66, 0);
            this.Neck_1.setPos(0.0F, 0.0F, 2.0F);
            this.Neck_1.addBox(-0.5F, -8.0F, -0.8F, 1.0F, 11.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck_1, -0.05567600413730452F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 0, 114);
            this.Snout.setPos(0.0F, -0.4F, -3.2F);
            this.Snout.addBox(-2.0F, 0.0F, -6.5F, 4.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.6839945098881279F, 0.0F, 0.0F);
            this.Horn3Right = new ModelRenderer(this, 0, 75);
            this.Horn3Right.mirror = true;
            this.Horn3Right.setPos(0.0F, -2.5F, -0.5F);
            this.Horn3Right.addBox(-0.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Right, 0.0F, 0.0F, 0.7819074915776542F);
            this.UpperArmRight = new ModelRenderer(this, 57, 39);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(0.0F, 7.0F, 1.5F);
            this.UpperArmRight.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.06475171591477989F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 21, 67);
            this.Tail1.setPos(0.0F, 0.0F, 8.0F);
            this.Tail1.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.32096603878911284F, 0.015009831816822585F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 32, 0);
            this.NeckLower.setPos(0.0F, -7.2F, -0.8F);
            this.NeckLower.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 9.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.6646214111173737F, 0.0F, 0.0F);
            this.TopSnout_1 = new ModelRenderer(this, 20, 121);
            this.TopSnout_1.setPos(0.0F, 0.0F, 4.0F);
            this.TopSnout_1.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout_1, -0.319744313639039F, 0.0F, 0.0F);
            this.HornRight = new ModelRenderer(this, 0, 90);
            this.HornRight.mirror = true;
            this.HornRight.setPos(-1.4F, -2.1F, -2.1F);
            this.HornRight.addBox(-3.0F, -1.25F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRight, -0.17819811729441132F, 0.35185837453889574F, -0.23457224414434488F);
            this.Jaw = new ModelRenderer(this, 20, 104);
            this.Jaw.setPos(0.0F, 2.1F, 0.0F);
            this.Jaw.addBox(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Jaw, -0.3122393925291412F, 0.0F, 0.0F);
            this.HornLeft = new ModelRenderer(this, 0, 90);
            this.HornLeft.setPos(1.4F, -2.1F, -2.1F);
            this.HornLeft.addBox(-1.0F, -1.25F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeft, -0.17819811729441132F, -0.35185837453889574F, 0.23457224414434488F);
            this.Tail3 = new ModelRenderer(this, 19, 81);
            this.Tail3.setPos(0.0F, 5.0F, 0.0F);
            this.Tail3.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Horn3Right_1 = new ModelRenderer(this, 0, 72);
            this.Horn3Right_1.mirror = true;
            this.Horn3Right_1.setPos(0.0F, -3.0F, 0.0F);
            this.Horn3Right_1.addBox(-0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Right_1, 0.0F, 0.0F, 0.7819074915776542F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 4.2F, -8.1F);
            this.Chest.addBox(-4.0F, -6.0F, -3.5F, 8.0F, 11.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.261101256764142F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 57, 39);
            this.UpperArmLeft.setPos(0.0F, 7.0F, 1.5F);
            this.UpperArmLeft.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.06475171591477989F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 19, 74);
            this.Tail2.setPos(0.0F, 5.8F, -0.5F);
            this.Tail2.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.09581857193974705F, 0.0F, -0.0031415927784254694F);
            this.UpperLegRight = new ModelRenderer(this, 82, 36);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(-1.5F, 8.0F, -2.0F);
            this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.31991885055898F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 59, 55);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 5.7F, 1.0F);
            this.HandRight.addBox(-0.9F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 85, 65);
            this.FootLeft.setPos(0.0F, 7.9F, -2.0F);
            this.FootLeft.addBox(-1.1F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 23);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.8F, -0.3F, 0.1F);
            this.EarRight.addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.3672172905985735F, -1.242674374156741F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 85, 49);
            this.LowerLegLeft.setPos(0.0F, 5.0F, 3.5F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.2300344007391748F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 78, 17);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.2F, 2.9F, 4.4F);
            this.ThighRight.addBox(-3.5F, 0.0F, -3.0F, 4.0F, 8.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.16912239719455752F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 85, 65);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 7.9F, -2.0F);
            this.FootRight.addBox(-0.9F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 103);
            this.Head.setPos(0.0F, -6.3F, 0.8F);
            this.Head.addBox(-2.5F, -2.5F, -4.5F, 5.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -1.3267992387765453F, 0.0F, 0.0F);
            this.Horn2Left = new ModelRenderer(this, 0, 84);
            this.Horn2Left.setPos(3.0F, 0.2F, 0.0F);
            this.Horn2Left.addBox(-1.0F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Left, -0.33091441019915835F, 0.0F, 0.5082398928281348F);
            this.Neck = new ModelRenderer(this, 48, 0);
            this.Neck.setPos(0.0F, -3.1F, -2.7F);
            this.Neck.addBox(-2.0F, -8.0F, -2.5F, 4.0F, 10.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 1.8003071500637617F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 78, 17);
            this.ThighLeft.setPos(1.2F, 2.9F, 4.4F);
            this.ThighLeft.addBox(-0.5F, 0.0F, -3.0F, 4.0F, 8.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.16912239719455752F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 59, 47);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.0F, 5.0F, -2.5F);
            this.ArmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.039968039204879874F, 0.0F, 0.0F);
            this.Horn3Left = new ModelRenderer(this, 0, 75);
            this.Horn3Left.setPos(0.0F, -2.5F, -0.5F);
            this.Horn3Left.addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Left, 0.0F, 0.0F, -0.7820820617871088F);
            this.ArmBaseRight = new ModelRenderer(this, 53, 27);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-3.0F, 1.4F, -0.4F);
            this.ArmBaseRight.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.365995532158986F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 20, 115);
            this.TopSnout.setPos(0.0F, 0.0F, -6.3F);
            this.TopSnout.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.46216317793861517F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 23);
            this.EarLeft.setPos(1.8F, -0.3F, 0.1F);
            this.EarLeft.addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.3672172905985735F, 1.242674374156741F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 85, 49);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 5.0F, 3.5F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.2300344007391748F, 0.0F, 0.0F);
            this.Horn2Right = new ModelRenderer(this, 0, 84);
            this.Horn2Right.mirror = true;
            this.Horn2Right.setPos(-3.0F, 0.2F, 0.0F);
            this.Horn2Right.addBox(-0.0F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Right, -0.33091441019915835F, 0.0F, -0.5082398928281348F);
            this.Hips = new ModelRenderer(this, 0, 43);
            this.Hips.setPos(0.0F, 0.0F, 12.0F);
            this.Hips.addBox(-3.5F, 0.0F, 0.0F, 7.0F, 10.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.23596852285911663F, 0.0F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 21, 87);
            this.Tail4.setPos(0.0F, 3.7F, 0.0F);
            this.Tail4.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Horn3Left_1 = new ModelRenderer(this, 0, 72);
            this.Horn3Left_1.setPos(0.0F, -3.0F, 0.0F);
            this.Horn3Left_1.addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Left_1, 0.0F, 0.0F, -0.7820820617871088F);
            this.Body = new ModelRenderer(this, 0, 18);
            this.Body.setPos(0.0F, -5.3F, 0.8F);
            this.Body.addBox(-4.5F, 0.0F, 0.0F, 9.0F, 12.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.24434609527920614F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 59, 47);
            this.ArmLeft.setPos(0.5F, 5.0F, -2.5F);
            this.ArmLeft.addBox(-1.5F, 0.0F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.039968039204879874F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 8, 122);
            this.Mouth.setPos(0.0F, 1.2F, -4.1F);
            this.Mouth.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 0.18849556254433897F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 53, 27);
            this.ArmBaseLeft.setPos(3.0F, 1.4F, -0.4F);
            this.ArmBaseLeft.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.365995532158986F, 0.0F, 0.0F);
            this.ArmLeft.addChild(this.HandLeft);
            this.NeckLower.addChild(this.NeckLower_1);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Neck.addChild(this.Neck_1);
            this.Head.addChild(this.Snout);
            this.Horn2Right.addChild(this.Horn3Right);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.Hips.addChild(this.Tail1);
            this.Neck.addChild(this.NeckLower);
            this.TopSnout.addChild(this.TopSnout_1);
            this.Head.addChild(this.HornRight);
            this.Snout.addChild(this.Jaw);
            this.Head.addChild(this.HornLeft);
            this.Tail2.addChild(this.Tail3);
            this.Horn3Right.addChild(this.Horn3Right_1);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.Tail1.addChild(this.Tail2);
            this.ThighRight.addChild(this.UpperLegRight);
            this.ArmRight.addChild(this.HandRight);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Head.addChild(this.EarRight);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Hips.addChild(this.ThighRight);
            this.LowerLegRight.addChild(this.FootRight);
            this.Neck.addChild(this.Head);
            this.HornLeft.addChild(this.Horn2Left);
            this.Chest.addChild(this.Neck);
            this.Hips.addChild(this.ThighLeft);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Horn2Left.addChild(this.Horn3Left);
            this.Chest.addChild(this.ArmBaseRight);
            this.Snout.addChild(this.TopSnout);
            this.Head.addChild(this.EarLeft);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.HornRight.addChild(this.Horn2Right);
            this.Body.addChild(this.Hips);
            this.Tail3.addChild(this.Tail4);
            this.Horn3Left.addChild(this.Horn3Left_1);
            this.Chest.addChild(this.Body);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.Jaw.addChild(this.Mouth);
            this.Chest.addChild(this.ArmBaseLeft);
            this.saveBase();
        }

        @Override
        public void setupAnim(WildebeestEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 1.327F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.8F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F - 1.327F;

            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.3F;
            this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.095F;
            this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
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
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F + 1.8F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 1.327F;
                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1F) * 0.5F + 0.3F;
                this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree) * 0.5F - 0.095F;
                this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F + 4.2F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.26F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.244F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.236F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F + 0.366F;
                this.UpperArmLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.065F;
                this.ArmLeft.xRot = MathHelper.cos(2F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F - 0.039F;
                this.HandLeft.xRot = MathHelper.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F + 0.366F;
                this.UpperArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.065F;
                this.ArmRight.xRot = MathHelper.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F - 0.039F;
                this.HandRight.xRot = MathHelper.cos(4F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.169F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.319F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.23F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.169F;
                this.UpperLegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.319F;
                this.LowerLegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.23F;
                this.FootRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;

            } else {
                float speed = 1.7f;
                float degree = 0.6f;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.8F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 1.327F;
                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.3F;
                this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.095F;
                this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 4.2F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.26F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.244F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.236F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.366F;
                this.UpperArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.065F;
                this.ArmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F - 0.039F;
                this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.366F;
                this.UpperArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.065F;
                this.ArmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F - 0.039F;
                this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.169F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.319F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.23F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.169F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.319F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.23F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }


    public static class Child extends WildebeestModel {

        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
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
        public ModelRenderer Tail4;
        public ModelRenderer Head;
        public ModelRenderer NeckLower;
        public ModelRenderer Neck_1;
        public ModelRenderer Snout;
        public ModelRenderer HornLeft;
        public ModelRenderer EarRight;
        public ModelRenderer EarLeft;
        public ModelRenderer HornRight;
        public ModelRenderer TopSnout;
        public ModelRenderer Jaw;
        public ModelRenderer TopSnout_1;
        public ModelRenderer Mouth;
        public ModelRenderer Horn2Left;
        public ModelRenderer Horn3Left;
        public ModelRenderer Horn3Left_1;
        public ModelRenderer Horn2Right;
        public ModelRenderer Horn3Right;
        public ModelRenderer Horn3Right_1;
        public ModelRenderer NeckLower_1;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;


        public Child() {
            this.texWidth = 128;
            this.texHeight = 128;
            this.HandLeft = new ModelRenderer(this, 59, 55);
            this.HandLeft.setPos(-0.4F, 5.7F, 1.0F);
            this.HandLeft.addBox(-1.2F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.NeckLower_1 = new ModelRenderer(this, 39, 15);
            this.NeckLower_1.setPos(0.0F, 3.0F, -1.0F);
            this.NeckLower_1.addBox(-0.5F, -5.0F, -4.0F, 1.0F, 9.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower_1, 0.3909537457888271F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 82, 36);
            this.UpperLegLeft.setPos(1.5F, 8.0F, -2.0F);
            this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.31991885055898F, 0.0F, 0.0F);
            this.Neck_1 = new ModelRenderer(this, 66, 0);
            this.Neck_1.setPos(0.0F, 0.0F, 2.0F);
            this.Neck_1.addBox(-0.5F, -8.0F, -0.8F, 1.0F, 11.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck_1, -0.05567600413730452F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 0, 114);
            this.Snout.setPos(0.0F, -0.4F, -3.2F);
            this.Snout.addBox(-2.0F, 0.0F, -6.5F, 4.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.6839945098881279F, 0.0F, 0.0F);
            this.Horn3Right = new ModelRenderer(this, 0, 75);
            this.Horn3Right.mirror = true;
            this.Horn3Right.setPos(0.0F, -2.5F, -0.5F);
            this.Horn3Right.addBox(-0.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Right, 0.0F, 0.0F, 0.7819074915776542F);
            this.UpperArmRight = new ModelRenderer(this, 57, 39);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(0.0F, 7.0F, 1.5F);
            this.UpperArmRight.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.06475171591477989F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 21, 67);
            this.Tail1.setPos(0.0F, 0.0F, 8.0F);
            this.Tail1.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.32096603878911284F, 0.015009831816822585F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 32, 0);
            this.NeckLower.setPos(0.0F, -7.2F, -0.8F);
            this.NeckLower.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 9.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.6646214111173737F, 0.0F, 0.0F);
            this.TopSnout_1 = new ModelRenderer(this, 20, 121);
            this.TopSnout_1.setPos(0.0F, 0.0F, 4.0F);
            this.TopSnout_1.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout_1, -0.319744313639039F, 0.0F, 0.0F);
            this.HornRight = new ModelRenderer(this, 0, 90);
            this.HornRight.mirror = true;
            this.HornRight.setPos(-1.4F, -2.1F, -2.1F);
            this.HornRight.addBox(-3.0F, -1.25F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRight, -0.17819811729441132F, 0.35185837453889574F, -0.23457224414434488F);
            this.Jaw = new ModelRenderer(this, 20, 104);
            this.Jaw.setPos(0.0F, 2.1F, 0.0F);
            this.Jaw.addBox(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Jaw, -0.3122393925291412F, 0.0F, 0.0F);
            this.HornLeft = new ModelRenderer(this, 0, 90);
            this.HornLeft.setPos(1.4F, -2.1F, -2.1F);
            this.HornLeft.addBox(-1.0F, -1.25F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeft, -0.17819811729441132F, -0.35185837453889574F, 0.23457224414434488F);
            this.Tail3 = new ModelRenderer(this, 19, 81);
            this.Tail3.setPos(0.0F, 5.0F, 0.0F);
            this.Tail3.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Horn3Right_1 = new ModelRenderer(this, 0, 72);
            this.Horn3Right_1.mirror = true;
            this.Horn3Right_1.setPos(0.0F, -3.0F, 0.0F);
            this.Horn3Right_1.addBox(-0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Right_1, 0.0F, 0.0F, 0.7819074915776542F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 4.2F, -8.1F);
            this.Chest.addBox(-4.0F, -6.0F, -3.5F, 8.0F, 11.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.261101256764142F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 57, 39);
            this.UpperArmLeft.setPos(0.0F, 7.0F, 1.5F);
            this.UpperArmLeft.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.06475171591477989F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 19, 74);
            this.Tail2.setPos(0.0F, 5.8F, -0.5F);
            this.Tail2.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.09581857193974705F, 0.0F, -0.0031415927784254694F);
            this.UpperLegRight = new ModelRenderer(this, 82, 36);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(-1.5F, 8.0F, -2.0F);
            this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.31991885055898F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 59, 55);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 5.7F, 1.0F);
            this.HandRight.addBox(-0.9F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 85, 65);
            this.FootLeft.setPos(0.0F, 7.9F, -2.0F);
            this.FootLeft.addBox(-1.1F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 23);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.8F, -0.3F, 0.1F);
            this.EarRight.addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.3672172905985735F, -1.242674374156741F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 85, 49);
            this.LowerLegLeft.setPos(0.0F, 5.0F, 3.5F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.2300344007391748F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 78, 17);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.2F, 2.9F, 4.4F);
            this.ThighRight.addBox(-3.5F, 0.0F, -3.0F, 4.0F, 8.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.16912239719455752F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 85, 65);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 7.9F, -2.0F);
            this.FootRight.addBox(-0.9F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 103);
            this.Head.setPos(0.0F, -6.3F, 0.8F);
            this.Head.addBox(-2.5F, -2.5F, -4.5F, 5.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -1.3267992387765453F, 0.0F, 0.0F);
            this.Horn2Left = new ModelRenderer(this, 0, 84);
            this.Horn2Left.setPos(3.0F, 0.2F, 0.0F);
            this.Horn2Left.addBox(-1.0F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Left, -0.33091441019915835F, 0.0F, 0.5082398928281348F);
            this.Neck = new ModelRenderer(this, 48, 0);
            this.Neck.setPos(0.0F, -3.1F, -2.7F);
            this.Neck.addBox(-2.0F, -8.0F, -2.5F, 4.0F, 10.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 1.8003071500637617F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 78, 17);
            this.ThighLeft.setPos(1.2F, 2.9F, 4.4F);
            this.ThighLeft.addBox(-0.5F, 0.0F, -3.0F, 4.0F, 8.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.16912239719455752F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 59, 47);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.0F, 5.0F, -2.5F);
            this.ArmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.039968039204879874F, 0.0F, 0.0F);
            this.Horn3Left = new ModelRenderer(this, 0, 75);
            this.Horn3Left.setPos(0.0F, -2.5F, -0.5F);
            this.Horn3Left.addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Left, 0.0F, 0.0F, -0.7820820617871088F);
            this.ArmBaseRight = new ModelRenderer(this, 53, 27);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-3.0F, 1.4F, -0.4F);
            this.ArmBaseRight.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.365995532158986F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 20, 115);
            this.TopSnout.setPos(0.0F, 0.0F, -6.3F);
            this.TopSnout.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.46216317793861517F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 23);
            this.EarLeft.setPos(1.8F, -0.3F, 0.1F);
            this.EarLeft.addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.3672172905985735F, 1.242674374156741F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 85, 49);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 5.0F, 3.5F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.2300344007391748F, 0.0F, 0.0F);
            this.Horn2Right = new ModelRenderer(this, 0, 84);
            this.Horn2Right.mirror = true;
            this.Horn2Right.setPos(-3.0F, 0.2F, 0.0F);
            this.Horn2Right.addBox(-0.0F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Right, -0.33091441019915835F, 0.0F, -0.5082398928281348F);
            this.Hips = new ModelRenderer(this, 0, 43);
            this.Hips.setPos(0.0F, 0.0F, 12.0F);
            this.Hips.addBox(-3.5F, 0.0F, 0.0F, 7.0F, 10.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.23596852285911663F, 0.0F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 21, 87);
            this.Tail4.setPos(0.0F, 3.7F, 0.0F);
            this.Tail4.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Horn3Left_1 = new ModelRenderer(this, 0, 72);
            this.Horn3Left_1.setPos(0.0F, -3.0F, 0.0F);
            this.Horn3Left_1.addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Left_1, 0.0F, 0.0F, -0.7820820617871088F);
            this.Body = new ModelRenderer(this, 0, 18);
            this.Body.setPos(0.0F, -5.3F, 0.8F);
            this.Body.addBox(-4.5F, 0.0F, 0.0F, 9.0F, 12.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.24434609527920614F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 59, 47);
            this.ArmLeft.setPos(0.5F, 5.0F, -2.5F);
            this.ArmLeft.addBox(-1.5F, 0.0F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.039968039204879874F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 8, 122);
            this.Mouth.setPos(0.0F, 1.2F, -4.1F);
            this.Mouth.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 0.18849556254433897F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 53, 27);
            this.ArmBaseLeft.setPos(3.0F, 1.4F, -0.4F);
            this.ArmBaseLeft.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.365995532158986F, 0.0F, 0.0F);
            this.ArmLeft.addChild(this.HandLeft);
            this.NeckLower.addChild(this.NeckLower_1);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Neck.addChild(this.Neck_1);
            this.Head.addChild(this.Snout);
            this.Horn2Right.addChild(this.Horn3Right);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.Hips.addChild(this.Tail1);
            this.Neck.addChild(this.NeckLower);
            this.TopSnout.addChild(this.TopSnout_1);
            this.Head.addChild(this.HornRight);
            this.Snout.addChild(this.Jaw);
            this.Head.addChild(this.HornLeft);
            this.Tail2.addChild(this.Tail3);
            this.Horn3Right.addChild(this.Horn3Right_1);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.Tail1.addChild(this.Tail2);
            this.ThighRight.addChild(this.UpperLegRight);
            this.ArmRight.addChild(this.HandRight);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Head.addChild(this.EarRight);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Hips.addChild(this.ThighRight);
            this.LowerLegRight.addChild(this.FootRight);
            this.Neck.addChild(this.Head);
            this.HornLeft.addChild(this.Horn2Left);
            this.Chest.addChild(this.Neck);
            this.Hips.addChild(this.ThighLeft);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Horn2Left.addChild(this.Horn3Left);
            this.Chest.addChild(this.ArmBaseRight);
            this.Snout.addChild(this.TopSnout);
            this.Head.addChild(this.EarLeft);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.HornRight.addChild(this.Horn2Right);
            this.Body.addChild(this.Hips);
            this.Tail3.addChild(this.Tail4);
            this.Horn3Left.addChild(this.Horn3Left_1);
            this.Chest.addChild(this.Body);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.Jaw.addChild(this.Mouth);
            this.Chest.addChild(this.ArmBaseLeft);
            this.saveBase();

        }

        @Override
        public void setupAnim(WildebeestEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 1.327F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.8F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F - 1.327F;

            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.3F;
            this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.095F;
            this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
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
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F + 1.8F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 1.327F;
                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1F) * 0.5F + 0.3F;
                this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree) * 0.5F - 0.095F;
                this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F + 4.2F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.26F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.244F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.236F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F + 0.366F;
                this.UpperArmLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.065F;
                this.ArmLeft.xRot = MathHelper.cos(2F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F - 0.039F;
                this.HandLeft.xRot = MathHelper.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F + 0.366F;
                this.UpperArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.065F;
                this.ArmRight.xRot = MathHelper.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F - 0.039F;
                this.HandRight.xRot = MathHelper.cos(4F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.169F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.319F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.23F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.169F;
                this.UpperLegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.319F;
                this.LowerLegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.23F;
                this.FootRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;

            } else {
                float speed = 1.2f;
                float degree = 0.6f;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.8F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 1.327F;
                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.3F;
                this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.095F;
                this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 4.2F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.26F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.244F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.236F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.366F;
                this.UpperArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.065F;
                this.ArmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F - 0.039F;
                this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.366F;
                this.UpperArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.065F;
                this.ArmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F - 0.039F;
                this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.169F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.319F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.23F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.169F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.319F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.23F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }
}
