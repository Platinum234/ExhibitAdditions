package com.github.platinum234.exhibitadditions.client.model;

import com.github.platinum234.exhibitadditions.entity.LangurEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class LangurModel extends ZawaBaseModel<LangurEntity> {
    public ModelRenderer Body;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends LangurModel {

        public ModelRenderer ArmBaseRight;
        public ModelRenderer Hips;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Neck;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer ThumbRight;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail1;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer Tail4;
        public ModelRenderer Tail5;
        public ModelRenderer Tail6;
        public ModelRenderer Tail7;
        public ModelRenderer Tail8;
        public ModelRenderer Tail9;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ThumbLeft;
        public ModelRenderer Head;
        public ModelRenderer NeckLower;
        public ModelRenderer EarRight;
        public ModelRenderer CheekRight1;
        public ModelRenderer Snout;
        public ModelRenderer CheekLeft1;
        public ModelRenderer EarLeft;
        public ModelRenderer Mane;
        public ModelRenderer part37;
        public ModelRenderer CheekRight2;
        public ModelRenderer CheekRight3;
        public ModelRenderer CheekRight4;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;
        public ModelRenderer CheekLeft2;
        public ModelRenderer CheekLeft3;
        public ModelRenderer CheekLeft4;
        public ModelRenderer Mane_1;
        public ModelRenderer Mane_2;
        public ModelRenderer Mane_3;


        public Adult() {
            this.texWidth = 32;
            this.texHeight = 64;
            this.ThighLeft = new ModelRenderer(this, 18, 27);
            this.ThighLeft.setPos(2.2F, 1.3F, 6.4F);
            this.ThighLeft.addBox(-1.5F, -0.5F, -2.5F, 3.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, -0.1563815016444822F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 20, 0);
            this.Neck.setPos(0.0F, -0.2F, -1.5F);
            this.Neck.addBox(-1.5F, -3.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 0.97947875757709F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 24, 55);
            this.ArmLeft.setPos(-0.1F, 4.5F, 1.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.27314402127920984F, 0.0F, 0.13665927909957545F);
            this.Head = new ModelRenderer(this, 0, 48);
            this.Head.setPos(0.0F, -3.6F, -0.4F);
            this.Head.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -1.0552260497768051F, 0.0F, 0.0F);
            this.CheekRight3 = new ModelRenderer(this, 8, 43);
            this.CheekRight3.mirror = true;
            this.CheekRight3.setPos(0.0F, 0.0F, 0.0F);
            this.CheekRight3.addBox(-3.0F, 0.0F, -0.5F, 3.0F, 4.0F, 1.0F, 0.2F, 0.0F, 0.0F);
            this.CheekRight1 = new ModelRenderer(this, 0, 15);
            this.CheekRight1.mirror = true;
            this.CheekRight1.setPos(-2.3F, 0.6F, -0.5F);
            this.CheekRight1.addBox(0.1F, -1.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.2F, 0.0F, 0.0F);
            this.setRotateAngle(CheekRight1, -0.23457224414434488F, 0.03909537541112055F, 0.11746065899211351F);
            this.ArmRight = new ModelRenderer(this, 24, 55);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.1F, 4.5F, 1.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.27314402127920984F, 0.0F, -0.13665927909957545F);
            this.Tail2 = new ModelRenderer(this, 16, 58);
            this.Tail2.setPos(0.0F, -4.0F, 0.0F);
            this.Tail2.addBox(-1.0F, -4.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.18000007F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.2890265148091971F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 0, 40);
            this.Mouth.setPos(0.0F, 1.6F, -0.1F);
            this.Mouth.addBox(-1.0F, 0.0F, -1.75F, 2.0F, 1.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.19495327877934715F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 16, 58);
            this.Tail3.setPos(0.0F, -4.0F, 0.0F);
            this.Tail3.addBox(-1.0F, -4.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.15999997F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.5235987755982988F, 0.0F, 0.0F);
            this.part37 = new ModelRenderer(this, 0, 56);
            this.part37.setPos(0.0F, 0.0F, 0.2F);
            this.part37.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.3F, 0.3F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 18, 27);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.2F, 1.3F, 6.4F);
            this.ThighRight.addBox(-1.5F, -0.5F, -2.5F, 3.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, -0.1563815016444822F, 0.0F, 0.0F);
            this.CheekLeft2 = new ModelRenderer(this, 0, 27);
            this.CheekLeft2.setPos(0.0F, -1.0F, -0.7F);
            this.CheekLeft2.addBox(0.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.2F, 0.0F, 0.0F);
            this.setRotateAngle(CheekLeft2, 0.0F, -0.5864306020384839F, 0.3127630032889644F);
            this.Tail9 = new ModelRenderer(this, 0, 1);
            this.Tail9.setPos(0.0F, -4.0F, 0.0F);
            this.Tail9.addBox(-1.0F, -4.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.04F, 0.0F, 0.0F);
            this.setRotateAngle(Tail9, 0.5235987755982988F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 24, 48);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.2F, 0.4F, -1.6F);
            this.ArmBaseRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Mane_1 = new ModelRenderer(this, 8, 39);
            this.Mane_1.setPos(0.0F, -1.0F, -1.7F);
            this.Mane_1.addBox(-1.0F, -1.4F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mane_1, -0.5473352640780661F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 21, 38);
            this.EarLeft.setPos(1.4F, -0.2F, 0.0F);
            this.EarLeft.addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0F, -0.5462880425584197F, 0.32637658343874504F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 13.4F, -4.6F);
            this.Body.addBox(-3.0F, -2.7F, -2.5F, 6.0F, 6.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.18587755867949335F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 0, 44);
            this.Snout.setPos(0.0F, -0.1F, -1.3F);
            this.Snout.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.2405063662642867F, 0.0F, 0.0F);
            this.CheekLeft3 = new ModelRenderer(this, 8, 43);
            this.CheekLeft3.setPos(0.0F, 0.0F, 0.0F);
            this.CheekLeft3.addBox(0.0F, 0.0F, -0.5F, 3.0F, 4.0F, 1.0F, 0.2F, 0.0F, 0.0F);
            this.ThumbLeft = new ModelRenderer(this, 16, 39);
            this.ThumbLeft.setPos(-0.1F, -0.5F, 0.0F);
            this.ThumbLeft.addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThumbLeft, 0.08726646259971647F, 0.13665927909957545F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 15, 46);
            this.HandLeft.setPos(0.0F, 5.8F, -0.5F);
            this.HandLeft.addBox(-1.0F, -1.0F, -2.5F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.0781907508222411F, 0.0F, -0.11728612207217244F);
            this.CheekRight4 = new ModelRenderer(this, 24, 16);
            this.CheekRight4.mirror = true;
            this.CheekRight4.setPos(0.0F, 0.0F, 0.0F);
            this.CheekRight4.addBox(-1.8F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.2F, 0.0F, 0.0F);
            this.setRotateAngle(CheekRight4, 0.0F, -0.7428121536172364F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 16, 58);
            this.Tail4.setPos(0.0F, -4.0F, 0.0F);
            this.Tail4.addBox(-1.0F, -4.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.13999999F, 0.0F, 0.0F);
            this.setRotateAngle(Tail4, 0.5235987755982988F, 0.0F, 0.0F);
            this.Tail5 = new ModelRenderer(this, 16, 58);
            this.Tail5.setPos(0.0F, -4.0F, 0.0F);
            this.Tail5.addBox(-1.0F, -4.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.12F, 0.0F, 0.0F);
            this.setRotateAngle(Tail5, 0.5235987755982988F, 0.0F, 0.0F);
            this.Mane_3 = new ModelRenderer(this, 8, 39);
            this.Mane_3.setPos(0.0F, 0.0F, 0.0F);
            this.Mane_3.addBox(-1.0F, -1.4F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mane_3, -0.5473352640780661F, 0.0F, 0.0F);
            this.Tail6 = new ModelRenderer(this, 16, 58);
            this.Tail6.setPos(0.0F, -3.9F, 0.0F);
            this.Tail6.addBox(-1.0F, -4.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Tail6, 0.5235987755982988F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 3, 14);
            this.Hips.setPos(0.0F, -2.5F, 4.3F);
            this.Hips.addBox(-3.5F, -0.5F, 0.0F, 7.0F, 6.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.14032447119455382F, 0.0F, 0.0F);
            this.ThumbRight = new ModelRenderer(this, 16, 39);
            this.ThumbRight.mirror = true;
            this.ThumbRight.setPos(0.1F, -0.5F, 0.0F);
            this.ThumbRight.addBox(0.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThumbRight, 0.08726646259971647F, -0.13665927909957545F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 22, 38);
            this.LegLeft.setPos(-1.0F, 6.5F, -2.0F);
            this.LegLeft.addBox(0.0F, 0.0F, 0.0F, 2.0F, 7.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.4557054783483638F, 0.0F, 0.0F);
            this.CheekRight2 = new ModelRenderer(this, 0, 27);
            this.CheekRight2.mirror = true;
            this.CheekRight2.setPos(0.0F, -1.0F, -0.7F);
            this.CheekRight2.addBox(-2.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.2F, 0.0F, 0.0F);
            this.setRotateAngle(CheekRight2, 0.0F, 0.5864306020384839F, -0.3127630032889644F);
            this.CheekLeft4 = new ModelRenderer(this, 24, 16);
            this.CheekLeft4.setPos(0.0F, 0.0F, 0.0F);
            this.CheekLeft4.addBox(-0.2F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.2F, 0.0F, 0.0F);
            this.setRotateAngle(CheekLeft4, 0.0F, 0.7428121536172364F, 0.0F);
            this.LegRight = new ModelRenderer(this, 22, 38);
            this.LegRight.mirror = true;
            this.LegRight.setPos(-1.0F, 6.5F, -2.0F);
            this.LegRight.addBox(0.0F, 0.0F, 0.0F, 2.0F, 7.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.4557054783483638F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 21, 38);
            this.EarRight.setPos(-1.4F, -0.2F, 0.0F);
            this.EarRight.addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0F, 0.5462880425584197F, -0.32637658343874504F);
            this.Mane_2 = new ModelRenderer(this, 12, 27);
            this.Mane_2.setPos(0.0F, -1.0F, -1.2F);
            this.Mane_2.addBox(-1.0F, -0.2F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mane_2, -0.1563815016444822F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 1, 27);
            this.NeckLower.setPos(0.0F, 1.8F, -2.8F);
            this.NeckLower.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 5.0F, -0.5F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, 1.4505431519851317F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 0, 36);
            this.TopSnout.setPos(0.0F, 0.0F, -1.9F);
            this.TopSnout.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.6576400674777856F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 12, 51);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.9F, 6.8F, 0.8F);
            this.FootRight.addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.34487706418882114F, 0.017453292519943295F, 0.0F);
            this.Mane = new ModelRenderer(this, 7, 34);
            this.Mane.setPos(0.0F, -1.9F, 1.8F);
            this.Mane.addBox(-1.5F, -1.0F, -4.0F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mane, 0.1563815016444822F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 24, 48);
            this.ArmBaseLeft.setPos(2.2F, 0.4F, -1.6F);
            this.ArmBaseLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 15, 46);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 5.8F, -0.5F);
            this.HandRight.addBox(-1.0F, -1.0F, -2.5F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.0781907508222411F, 0.0F, 0.11728612207217244F);
            this.Tail1 = new ModelRenderer(this, 16, 58);
            this.Tail1.setPos(0.0F, 2.0F, 7.0F);
            this.Tail1.addBox(-1.0F, -4.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.2F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.9808750529366187F, 0.0F, 0.0F);
            this.Tail8 = new ModelRenderer(this, 16, 58);
            this.Tail8.setPos(0.0F, -4.0F, 0.0F);
            this.Tail8.addBox(-1.0F, -4.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.06F, 0.0F, 0.0F);
            this.setRotateAngle(Tail8, 0.5235987755982988F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 12, 51);
            this.FootLeft.setPos(1.1F, 6.8F, 0.8F);
            this.FootLeft.addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.34487706418882114F, -0.017453292519943295F, 0.0F);
            this.CheekLeft1 = new ModelRenderer(this, 0, 15);
            this.CheekLeft1.setPos(2.3F, 0.6F, -0.5F);
            this.CheekLeft1.addBox(-2.1F, -1.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.2F, 0.0F, 0.0F);
            this.setRotateAngle(CheekLeft1, -0.23457224414434488F, -0.03909537541112055F, -0.11746065899211351F);
            this.Tail7 = new ModelRenderer(this, 16, 58);
            this.Tail7.setPos(0.0F, -4.0F, 0.0F);
            this.Tail7.addBox(-1.0F, -4.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.08F, 0.0F, 0.0F);
            this.setRotateAngle(Tail7, 0.5235987755982988F, 0.0F, 0.0F);
            this.Hips.addChild(this.ThighLeft);
            this.Body.addChild(this.Neck);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Neck.addChild(this.Head);
            this.CheekRight2.addChild(this.CheekRight3);
            this.Head.addChild(this.CheekRight1);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Tail1.addChild(this.Tail2);
            this.Snout.addChild(this.Mouth);
            this.Tail2.addChild(this.Tail3);
            this.Head.addChild(this.part37);
            this.Hips.addChild(this.ThighRight);
            this.CheekLeft1.addChild(this.CheekLeft2);
            this.Tail8.addChild(this.Tail9);
            this.Body.addChild(this.ArmBaseRight);
            this.Mane.addChild(this.Mane_1);
            this.Head.addChild(this.EarLeft);
            this.Head.addChild(this.Snout);
            this.CheekLeft2.addChild(this.CheekLeft3);
            this.HandLeft.addChild(this.ThumbLeft);
            this.ArmLeft.addChild(this.HandLeft);
            this.CheekRight3.addChild(this.CheekRight4);
            this.Tail3.addChild(this.Tail4);
            this.Tail4.addChild(this.Tail5);
            this.Mane_1.addChild(this.Mane_3);
            this.Tail5.addChild(this.Tail6);
            this.Body.addChild(this.Hips);
            this.HandRight.addChild(this.ThumbRight);
            this.ThighLeft.addChild(this.LegLeft);
            this.CheekRight1.addChild(this.CheekRight2);
            this.CheekLeft3.addChild(this.CheekLeft4);
            this.ThighRight.addChild(this.LegRight);
            this.Head.addChild(this.EarRight);
            this.Mane.addChild(this.Mane_2);
            this.Neck.addChild(this.NeckLower);
            this.Snout.addChild(this.TopSnout);
            this.LegRight.addChild(this.FootRight);
            this.Head.addChild(this.Mane);
            this.Body.addChild(this.ArmBaseLeft);
            this.ArmRight.addChild(this.HandRight);
            this.Hips.addChild(this.Tail1);
            this.Tail7.addChild(this.Tail8);
            this.LegLeft.addChild(this.FootLeft);
            this.Head.addChild(this.CheekLeft1);
            this.Tail6.addChild(this.Tail7);
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

                this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.5F * limbSwingAmount * 0.5F + 0.02F;
                this.LegLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.087F;
                this.FootLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.5F * limbSwingAmount * 0.5F + 0.02F;
                this.LegRight.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.087F;
                this.FootRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F;

                this.Body.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.7F * limbSwingAmount * 0.5F;
                this.Hips.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.8F * limbSwingAmount * 0.5F + 0.091F;
                this.Body.y = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + 14.0F;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.8F * limbSwingAmount * 0.5F - 0.202F;
                this.Head.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.4F * limbSwingAmount * 0.5F + 0.228F;

                this.Tail1.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F - 0.49F;
                this.ArmLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.087F;
                this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -5.0F * limbSwingAmount * 0.5F + 0.052F;
                this.ArmRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.087F;
                this.HandRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -5.0F * limbSwingAmount * 0.5F + 0.052F;

            } else {
                float speed = 1.0f;
                float degree = 0.6f;
                this.ArmLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + 0.087F;
                this.HandLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.052F;
                this.ArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F + 0.087F;
                this.HandRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.052F;

                this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.02F;
                this.LegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.087F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.02F;
                this.LegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.087F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F;

                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.15F * limbSwingAmount * 0.5F + (this.isSwimming ? -0.2F : 0.0F);
                this.Hips.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * -0.17F * limbSwingAmount * 0.5F + 0.091F;
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
           // this.Chest = new ModelRenderer(this, 0, 14);
           // this.Chest.setPos(0.0F, 14.0F, -2.0F);
           // this.Chest.addBox(-3.0F, -3.0F, -2.5F, 6.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
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
          //  this.Chest.addChild(this.Body);
            this.Head.addChild(this.Snout);
            this.Hips.addChild(this.Tail1);
          //  this.Chest.addChild(this.RightArm);
            this.RightLeg.addChild(this.RightFoot);
            this.LeftArm.addChild(this.LeftForearm);
            this.RightHand.addChild(this.RightThumb);
          // this.Chest.addChild(this.LeftArm);
            this.Forehead.addChild(this.Crest);
            this.Tail5.addChild(this.Tail6);
            this.RightArm.addChild(this.RightForearm);
           // this.Chest.addChild(this.Neck);
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

               // this.Chest.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.7F * limbSwingAmount * 0.5F;
                this.Body.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.8F * limbSwingAmount * 0.5F + 0.091F;
               // this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + 14.0F;
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

                //this.Chest.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.15F * limbSwingAmount * 0.5F + (this.isSwimming ? -0.2F : 0.0F);
                this.Body.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * -0.17F * limbSwingAmount * 0.5F + 0.091F;
                this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F - 0.202F;
                this.Tail1.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : -0.49F);

            }
        }
    }
}

