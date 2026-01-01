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

        public ModelRenderer Neck;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Body;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer NeckLower;
        public ModelRenderer Head;
        public ModelRenderer Mane;
        public ModelRenderer NeckBeard;
        public ModelRenderer Snout;
        public ModelRenderer HornRight;
        public ModelRenderer HornLeft;
        public ModelRenderer EarRight;
        public ModelRenderer EarLeft;
        public ModelRenderer Jaw;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;
        public ModelRenderer Beard;
        public ModelRenderer TopSnout_1;
        public ModelRenderer Horn2Right;
        public ModelRenderer Horn3Right;
        public ModelRenderer Horn4Right;
        public ModelRenderer Horn2Left;
        public ModelRenderer Horn3Left;
        public ModelRenderer Horn4Left;
        public ModelRenderer HeadMane;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer Hips;
        public ModelRenderer Tail1;
        public ModelRenderer ThighRight;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer Tail4;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;


        public Adult() {
            this.texWidth = 128;
            this.texHeight = 128;
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 3.8F, -8.1F);
            this.Chest.addBox(-4.0F, -6.0F, -3.5F, 8.0F, 12.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.26005405188925235F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 23);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.8F, -0.3F, -1.1F);
            this.EarRight.addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.3672172905985735F, -1.242674374156741F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 53, 27);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-3.0F, 1.8F, -0.4F);
            this.ArmBaseRight.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.365995532158986F, 0.0F, 0.0F);
            this.HornLeft = new ModelRenderer(this, 0, 90);
            this.HornLeft.setPos(1.4F, -2.5F, -1.9F);
            this.HornLeft.addBox(-1.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeft, -0.17819811729441132F, -0.35185837453889574F, 0.1563815016444822F);
            this.Tail1 = new ModelRenderer(this, 21, 67);
            this.Tail1.setPos(0.0F, 0.0F, 8.0F);
            this.Tail1.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.3296997091364596F, 0.015009831816822585F, 0.024314981163992097F);
            this.HandRight = new ModelRenderer(this, 59, 55);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 5.7F, 1.0F);
            this.HandRight.addBox(-0.9F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 8, 122);
            this.Mouth.setPos(0.0F, 1.2F, -4.1F);
            this.Mouth.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 0.18849556254433897F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 59, 47);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.0F, 5.0F, -2.5F);
            this.ArmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.03900000095458209F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 43);
            this.Hips.setPos(0.0F, 0.0F, 12.0F);
            this.Hips.addBox(-3.5F, 0.0F, 0.0F, 7.0F, 10.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.23599999809424999F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 78, 17);
            this.ThighLeft.setPos(1.2F, 2.9F, 4.4F);
            this.ThighLeft.addBox(-0.5F, 0.0F, -3.0F, 4.0F, 8.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.16899999165295476F, 0.0F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 21, 87);
            this.Tail4.setPos(0.0F, 3.7F, 0.0F);
            this.Tail4.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 59, 55);
            this.HandLeft.setPos(-0.4F, 5.7F, 1.0F);
            this.HandLeft.addBox(-1.2F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 23);
            this.EarLeft.setPos(1.8F, -0.3F, -1.1F);
            this.EarLeft.addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.3672172905985735F, 1.242674374156741F, 0.0F);
            this.Jaw = new ModelRenderer(this, 20, 104);
            this.Jaw.setPos(0.0F, 2.1F, 0.0F);
            this.Jaw.addBox(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Jaw, -0.3122393925291412F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 85, 49);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 5.0F, 3.5F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.22999999602684235F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 85, 49);
            this.LowerLegLeft.setPos(0.0F, 5.0F, 3.5F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.22999999602684235F, 0.0F, 0.0F);
            this.Horn2Right = new ModelRenderer(this, 0, 84);
            this.Horn2Right.mirror = true;
            this.Horn2Right.setPos(-2.0F, 0.0F, 0.0F);
            this.Horn2Right.addBox(-4.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Right, 0.0F, 0.6646214111173737F, -0.1563815016444822F);
            this.Horn2Left = new ModelRenderer(this, 0, 84);
            this.Horn2Left.setPos(2.0F, 0.0F, 0.0F);
            this.Horn2Left.addBox(0.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Left, 0.0F, -0.6646214111173737F, 0.1563815016444822F);
            this.Horn3Left = new ModelRenderer(this, 0, 79);
            this.Horn3Left.setPos(4.0F, 0.5F, -0.5F);
            this.Horn3Left.addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Left, 0.0F, 0.0F, 0.5864306020384839F);
            this.NeckLower = new ModelRenderer(this, 32, 0);
            this.NeckLower.setPos(0.0F, -7.2F, -1.1F);
            this.NeckLower.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 10.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.5864306020384839F, 0.0F, 0.0F);
            this.HornRight = new ModelRenderer(this, 0, 90);
            this.HornRight.mirror = true;
            this.HornRight.setPos(-1.4F, -2.5F, -1.9F);
            this.HornRight.addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRight, -0.17819811729441132F, 0.35185837453889574F, -0.15620696472454113F);
            this.Mane = new ModelRenderer(this, 32, 15);
            this.Mane.setPos(0.0F, -2.0F, 1.2F);
            this.Mane.addBox(-1.0F, -6.0F, 0.0F, 2.0F, 9.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mane, -0.0781907508222411F, 0.0F, 0.0F);
            this.HeadMane = new ModelRenderer(this, 15, 99);
            this.HeadMane.setPos(0.0F, -6.0F, 3.0F);
            this.HeadMane.addBox(-0.5F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HeadMane, -0.9773843811168246F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 19);
            this.Body.setPos(0.0F, -5.0F, 0.8F);
            this.Body.addBox(-4.5F, 0.0F, 0.0F, 9.0F, 12.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.24399702143932397F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 103);
            this.Head.setPos(0.0F, -6.3F, 0.8F);
            this.Head.addBox(-2.5F, -2.5F, -4.5F, 5.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -1.2487831330651644F, 0.0F, 0.0F);
            this.NeckBeard = new ModelRenderer(this, 42, 15);
            this.NeckBeard.setPos(0.0F, 2.0F, -2.0F);
            this.NeckBeard.addBox(-1.0F, 0.0F, -5.0F, 2.0F, 9.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBeard, 0.3127630032889644F, 0.0F, 0.0F);
            this.Horn3Right = new ModelRenderer(this, 0, 79);
            this.Horn3Right.mirror = true;
            this.Horn3Right.setPos(-4.0F, 0.5F, -0.5F);
            this.Horn3Right.addBox(-0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Right, 0.0F, 0.0F, -0.5864306020384839F);
            this.UpperLegLeft = new ModelRenderer(this, 82, 36);
            this.UpperLegLeft.setPos(1.5F, 8.0F, -2.0F);
            this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.31899999340387547F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 59, 47);
            this.ArmLeft.setPos(0.5F, 5.0F, -2.5F);
            this.ArmLeft.addBox(-1.5F, 0.0F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.03900000095458209F, 0.0F, 0.0F);
            this.Horn4Left = new ModelRenderer(this, 0, 72);
            this.Horn4Left.setPos(0.0F, -2.0F, 0.0F);
            this.Horn4Left.addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn4Left, 0.0F, 0.0F, -1.055749693826142F);
            this.FootLeft = new ModelRenderer(this, 85, 65);
            this.FootLeft.setPos(0.0F, 7.9F, -2.0F);
            this.FootLeft.addBox(-1.1F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 57, 39);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(0.0F, 7.0F, 1.5F);
            this.UpperArmRight.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.06499999742978094F, 0.0F, 0.0F);
            this.TopSnout_1 = new ModelRenderer(this, 20, 121);
            this.TopSnout_1.setPos(0.0F, 0.0F, 4.0F);
            this.TopSnout_1.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout_1, -0.319744313639039F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 78, 17);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.2F, 2.9F, 4.4F);
            this.ThighRight.addBox(-3.5F, 0.0F, -3.0F, 4.0F, 8.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.16899999165295476F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 85, 65);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 7.9F, -2.0F);
            this.FootRight.addBox(-0.9F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Horn4Right = new ModelRenderer(this, 0, 72);
            this.Horn4Right.mirror = true;
            this.Horn4Right.setPos(0.0F, -2.0F, 0.0F);
            this.Horn4Right.addBox(-0.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn4Right, 0.0F, 0.0F, 0.9382889765773795F);
            this.ArmBaseLeft = new ModelRenderer(this, 53, 27);
            this.ArmBaseLeft.setPos(3.0F, 1.8F, -0.4F);
            this.ArmBaseLeft.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.365995532158986F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 20, 115);
            this.TopSnout.setPos(0.0F, 0.0F, -6.3F);
            this.TopSnout.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.46216317793861517F, 0.0F, 0.0F);
            this.Beard = new ModelRenderer(this, 58, 16);
            this.Beard.setPos(0.0F, 2.0F, -2.0F);
            this.Beard.addBox(-0.5F, -0.8F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Beard, -0.35185837453889574F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 57, 39);
            this.UpperArmLeft.setPos(0.0F, 7.0F, 1.5F);
            this.UpperArmLeft.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.06499999742978094F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 48, 0);
            this.Neck.setPos(0.0F, -3.0F, -3.8F);
            this.Neck.addBox(-2.0F, -8.0F, -2.5F, 4.0F, 10.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 1.7484708499742416F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 82, 36);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(-1.5F, 8.0F, -2.0F);
            this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.31899999340387547F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 0, 114);
            this.Snout.setPos(0.0F, -0.4F, -3.2F);
            this.Snout.addBox(-2.0F, 0.0F, -6.5F, 4.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.6839945098881279F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 19, 74);
            this.Tail2.setPos(0.0F, 5.8F, -0.5F);
            this.Tail2.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.06947778239118053F, 0.0F, -0.03744728233171422F);
            this.Tail3 = new ModelRenderer(this, 19, 81);
            this.Tail3.setPos(0.0F, 5.0F, 0.0F);
            this.Tail3.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Head.addChild(this.EarRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.Head.addChild(this.HornLeft);
            this.Hips.addChild(this.Tail1);
            this.ArmRight.addChild(this.HandRight);
            this.Jaw.addChild(this.Mouth);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Body.addChild(this.Hips);
            this.Hips.addChild(this.ThighLeft);
            this.Tail3.addChild(this.Tail4);
            this.ArmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.EarLeft);
            this.Snout.addChild(this.Jaw);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.HornRight.addChild(this.Horn2Right);
            this.HornLeft.addChild(this.Horn2Left);
            this.Horn2Left.addChild(this.Horn3Left);
            this.Neck.addChild(this.NeckLower);
            this.Head.addChild(this.HornRight);
            this.Neck.addChild(this.Mane);
            this.Mane.addChild(this.HeadMane);
            this.Chest.addChild(this.Body);
            this.Neck.addChild(this.Head);
            this.NeckLower.addChild(this.NeckBeard);
            this.Horn2Right.addChild(this.Horn3Right);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.Horn3Left.addChild(this.Horn4Left);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.TopSnout.addChild(this.TopSnout_1);
            this.Hips.addChild(this.ThighRight);
            this.LowerLegRight.addChild(this.FootRight);
            this.Horn3Right.addChild(this.Horn4Right);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Snout.addChild(this.TopSnout);
            this.Jaw.addChild(this.Beard);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.Chest.addChild(this.Neck);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Head.addChild(this.Snout);
            this.Tail1.addChild(this.Tail2);
            this.Tail2.addChild(this.Tail3);
            this.saveBase();
        }

        @Override
        public void setupAnim(WildebeestEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
           // super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            super.setupAnim(entity, entity.tickCount, 0.3F, ageInTicks, netHeadYaw, headPitch);
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
                float speed = 1.5f;
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

        public ModelRenderer Body;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Neck;
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
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer NeckLower;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer Jaw;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;

        public Child() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.LowerLegRight = new ModelRenderer(this, 55, 0);
            this.LowerLegRight.setPos(0.01F, 5.0F, 2.4F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.4799655442984406F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 0, 30);
            this.ArmBaseLeft.setPos(1.8F, 1.5F, -0.3F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -1.8F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.296705972839036F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 0, 55);
            this.HandRight.setPos(0.1F, 4.8F, 0.5F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 55, 0);
            this.LowerLegLeft.setPos(-0.01F, 5.0F, 2.4F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.4799655442984406F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 34, 30);
            this.Tail2.setPos(0.0F, 4.5F, 0.0F);
            this.Tail2.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.08726646259971647F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 0, 40);
            this.UpperArmRight.setPos(0.0F, 5.8F, 1.7F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.03490658503988659F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 0, 55);
            this.HandLeft.setPos(-0.1F, 4.8F, 0.5F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 0, 40);
            this.UpperArmLeft.setPos(0.0F, 5.8F, 1.7F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.03490658503988659F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 22, 1);
            this.Neck.setPos(0.0F, -1.7F, -2.0F);
            this.Neck.addBox(-1.5F, -2.0F, -3.5F, 3.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.2617993877991494F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 37, 17);
            this.Snout.setPos(0.0F, 0.3F, -2.1F);
            this.Snout.addBox(-1.5F, -1.0F, -3.5F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.7330382858376184F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 54, 11);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.8F, -1.2F, 1.0F);
            this.EarRight.addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.3672172905985735F, -1.242674374156741F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 0, 30);
            this.ArmBaseRight.setPos(-1.8F, 1.5F, -0.3F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -1.8F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.296705972839036F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 16, 30);
            this.ThighLeft.setPos(1.9F, 2.3F, 3.2F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.3665191429188092F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 0, 55);
            this.FootRight.setPos(0.1F, 5.0F, -1.6F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 18);
            this.Chest.setPos(0.0F, 6.4F, -5.0F);
            this.Chest.addBox(-2.5F, -3.5F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.2617993877991494F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 42, 23);
            this.TopSnout.setPos(0.0F, -0.5F, -2.5F);
            this.TopSnout.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.2738421523142173F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 54, 20);
            this.UpperLegLeft.setPos(0.0F, 7.0F, -1.3F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.4363323129985824F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, -3.2F, 0.1F);
            this.Body.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 8.0F, 10.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.24434609527920614F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 38, 0);
            this.NeckLower.setPos(0.0F, 1.1F, -2.5F);
            this.NeckLower.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.20943951023931953F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 20, 18);
            this.Hips.setPos(0.0F, 0.0F, 9.0F);
            this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.296705972839036F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 0, 55);
            this.FootLeft.setPos(-0.1F, 5.0F, -1.6F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 54, 20);
            this.UpperLegRight.setPos(0.0F, 7.0F, -1.3F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.4363323129985824F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 30, 30);
            this.Tail1.setPos(0.0F, 0.5F, 5.5F);
            this.Tail1.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.33161255787892263F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 0, 47);
            this.ArmRight.setPos(0.01F, 3.8F, -2.5F);
            this.ArmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 54, 11);
            this.EarLeft.setPos(1.8F, -1.2F, 1.0F);
            this.EarLeft.addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.3672172905985735F, 1.242674374156741F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 16, 30);
            this.ThighRight.setPos(-1.9F, 2.3F, 3.2F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.3665191429188092F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 0, 47);
            this.ArmLeft.setPos(-0.01F, 3.8F, -2.5F);
            this.ArmLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Jaw = new ModelRenderer(this, 52, 28);
            this.Jaw.setPos(0.0F, 1.1F, -0.6F);
            this.Jaw.addBox(-1.0F, -1.0F, -3.5F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Jaw, 0.46914448828868976F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 44, 29);
            this.Mouth.setPos(0.0F, 0.2F, -3.0F);
            this.Mouth.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 0.08726646259971647F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 38, 8);
            this.Head.setPos(0.0F, 0.4F, -4.0F);
            this.Head.addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.5235987755982988F, 0.0F, 0.0F);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.ArmRight.addChild(this.HandRight);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Tail1.addChild(this.Tail2);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.ArmLeft.addChild(this.HandLeft);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.Chest.addChild(this.Neck);
            this.Head.addChild(this.Snout);
            this.Head.addChild(this.EarRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.Hips.addChild(this.ThighLeft);
            this.LowerLegRight.addChild(this.FootRight);
            this.Snout.addChild(this.TopSnout);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Chest.addChild(this.Body);
            this.Neck.addChild(this.NeckLower);
            this.Body.addChild(this.Hips);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Hips.addChild(this.Tail1);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Head.addChild(this.EarLeft);
            this.Hips.addChild(this.ThighRight);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.Head.addChild(this.Jaw);
            this.Jaw.addChild(this.Mouth);
            this.Neck.addChild(this.Head);
            this.saveBase();

        }

        @Override
        public void setupAnim(WildebeestEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
         }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
           }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
