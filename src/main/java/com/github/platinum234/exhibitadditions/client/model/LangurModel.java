package com.github.platinum234.exhibitadditions.client.model;

import com.github.platinum234.exhibitadditions.entity.LangurEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class LangurModel extends ZawaBaseModel<LangurEntity> {
    public ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends LangurModel {
        public ModelPart ArmBaseRight;
        public ModelPart Hips;
        public ModelPart ArmBaseLeft;
        public ModelPart Neck;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart ThumbRight;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail1;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart Tail4;
        public ModelPart Tail5;
        public ModelPart Tail6;
        public ModelPart Tail7;
        public ModelPart Tail8;
        public ModelPart Tail9;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart ThumbLeft;
        public ModelPart Head;
        public ModelPart NeckLower;
        public ModelPart EarRight;
        public ModelPart CheekRight1;
        public ModelPart Snout;
        public ModelPart CheekLeft1;
        public ModelPart EarLeft;
        public ModelPart Mane;
        public ModelPart Cheeks;
        public ModelPart CheekRight2;
        public ModelPart CheekRight3;
        public ModelPart CheekRight4;
        public ModelPart TopSnout;
        public ModelPart Mouth;
        public ModelPart CheekLeft2;
        public ModelPart CheekLeft3;
        public ModelPart CheekLeft4;
        public ModelPart Mane_1;
        public ModelPart Mane_2;
        public ModelPart Mane_3;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.Tail4 = this.Tail3.getChild("Tail4");
            this.Tail5 = this.Tail4.getChild("Tail5");
            this.Tail6 = this.Tail5.getChild("Tail6");
            this.Tail7 = this.Tail6.getChild("Tail7");
            this.Tail8 = this.Tail7.getChild("Tail8");
            this.Tail9 = this.Tail8.getChild("Tail9");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.Neck = this.Body.getChild("Neck");
            this.NeckLower = this.Neck.getChild("NeckLower");

            this.Head = this.Neck.getChild("Head");
            this.CheekRight1 = this.Head.getChild("CheekRight1");
            this.CheekRight2 = this.CheekRight1.getChild("CheekRight2");
            this.CheekRight3 = this.CheekRight2.getChild("CheekRight3");
            this.CheekRight4 = this.CheekRight3.getChild("CheekRight4");

            this.CheekLeft1 = this.Head.getChild("CheekLeft1");
            this.CheekLeft2 = this.CheekLeft1.getChild("CheekLeft2");
            this.CheekLeft3 = this.CheekLeft2.getChild("CheekLeft3");
            this.CheekLeft4 = this.CheekLeft3.getChild("CheekLeft4");

            this.Cheeks = this.Head.getChild("Cheeks");

            this.EarRight = this.Head.getChild("EarRight");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.Mane = this.Head.getChild("Mane");
            this.Mane_1 = this.Mane.getChild("Mane_1");
            this.Mane_3 = this.Mane_1.getChild("Mane_3");

            this.Mane_2 = this.Mane.getChild("Mane_2");

            this.Snout = this.Head.getChild("Snout");
            this.TopSnout = this.Snout.getChild("TopSnout");

            this.Mouth = this.Snout.getChild("Mouth");

            this.ArmBaseLeft = this.Body.getChild("ArmBaseLeft");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.ThumbLeft = this.HandLeft.getChild("ThumbLeft");

            this.ArmBaseRight = this.Body.getChild("ArmBaseRight");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.ThumbRight = this.HandRight.getChild("ThumbRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.7F, -2.5F, 6.0F, 6.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 13.4F, -4.6F, 0.18587755867949335F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(3, 14).addBox(-3.5F, -0.5F, 0.0F, 7.0F, 6.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -2.5F, 4.3F, -0.14032447119455382F, 0.0F, 0.0F));
            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(18, 27).addBox(-1.5F, -0.5F, -2.5F, 3.0F, 7.0F, 4.0F), PartPose.offsetAndRotation(2.2F, 1.3F, 6.4F, -0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(22, 38).addBox(0.0F, 0.0F, 0.0F, 2.0F, 7.0F, 3.0F), PartPose.offsetAndRotation(-1.0F, 6.5F, -2.0F, 0.4557054783483638F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(12, 51).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(1.1F, 6.8F, 0.8F, -0.34487706418882114F, -0.017453292519943295F, 0.0F));

            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(16, 58).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 7.0F, -0.9808750529366187F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(16, 58).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.18000007F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.2890265148091971F, 0.0F, 0.0F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(16, 58).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.15999997F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.5235987755982988F, 0.0F, 0.0F));
            PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(16, 58).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.13999999F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.5235987755982988F, 0.0F, 0.0F));
            PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(16, 58).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.12F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.5235987755982988F, 0.0F, 0.0F));
            PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(16, 58).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -3.9F, 0.0F, 0.5235987755982988F, 0.0F, 0.0F));
            PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(16, 58).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.08F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.5235987755982988F, 0.0F, 0.0F));
            PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create().texOffs(16, 58).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.06F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.5235987755982988F, 0.0F, 0.0F));
            PartDefinition Tail9 = Tail8.addOrReplaceChild("Tail9", CubeListBuilder.create().texOffs(0, 1).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.04F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.5235987755982988F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(18, 27).mirror(true).addBox(-1.5F, -0.5F, -2.5F, 3.0F, 7.0F, 4.0F), PartPose.offsetAndRotation(-2.2F, 1.3F, 6.4F, -0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(22, 38).mirror(true).addBox(0.0F, 0.0F, 0.0F, 2.0F, 7.0F, 3.0F), PartPose.offsetAndRotation(-1.0F, 6.5F, -2.0F, 0.4557054783483638F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(12, 51).mirror(true).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.9F, 6.8F, 0.8F, -0.34487706418882114F, 0.017453292519943295F, 0.0F));

            PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(20, 0).addBox(-1.5F, -3.0F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.2F, -1.5F, 0.97947875757709F, 0.0F, 0.0F));
            PartDefinition NeckLower = Neck.addOrReplaceChild("NeckLower", CubeListBuilder.create().texOffs(1, 27).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(-0.5F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -2.8F, 1.4505431519851317F, 0.0F, 0.0F));

            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 48).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -3.6F, -0.4F, -1.0552260497768051F, 0.0F, 0.0F));
            PartDefinition CheekRight1 = Head.addOrReplaceChild("CheekRight1", CubeListBuilder.create().texOffs(0, 15).mirror(true).addBox(0.1F, -1.0F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-2.3F, 0.6F, -0.5F, -0.23457224414434488F, 0.03909537541112055F, 0.11746065899211351F));
            PartDefinition CheekRight2 = CheekRight1.addOrReplaceChild("CheekRight2", CubeListBuilder.create().texOffs(0, 27).mirror(true).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -0.7F, 0.0F, 0.5864306020384839F, -0.3127630032889644F));
            PartDefinition CheekRight3 = CheekRight2.addOrReplaceChild("CheekRight3", CubeListBuilder.create().texOffs(8, 43).mirror(true).addBox(-3.0F, 0.0F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.2F, 0.0F, 0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
            PartDefinition CheekRight4 = CheekRight3.addOrReplaceChild("CheekRight4", CubeListBuilder.create().texOffs(24, 16).mirror(true).addBox(-1.8F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7428121536172364F, 0.0F));

            PartDefinition CheekLeft1 = Head.addOrReplaceChild("CheekLeft1", CubeListBuilder.create().texOffs(0, 15).addBox(-2.1F, -1.0F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(2.3F, 0.6F, -0.5F, -0.23457224414434488F, -0.03909537541112055F, -0.11746065899211351F));
            PartDefinition CheekLeft2 = CheekLeft1.addOrReplaceChild("CheekLeft2", CubeListBuilder.create().texOffs(0, 27).addBox(0.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -0.7F, 0.0F, -0.5864306020384839F, 0.3127630032889644F));
            PartDefinition CheekLeft3 = CheekLeft2.addOrReplaceChild("CheekLeft3", CubeListBuilder.create().texOffs(8, 43).addBox(0.0F, 0.0F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.2F, 0.0F, 0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
            PartDefinition CheekLeft4 = CheekLeft3.addOrReplaceChild("CheekLeft4", CubeListBuilder.create().texOffs(24, 16).addBox(-0.2F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7428121536172364F, 0.0F));

            PartDefinition Cheeks = Head.addOrReplaceChild("Cheeks", CubeListBuilder.create().texOffs(0, 56).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.3F, 0.3F, 0.0F)), PartPose.offset(0.0F, 0.0F, 0.2F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(21, 38).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.4F, -0.2F, 0.0F, 0.0F, 0.5462880425584197F, -0.32637658343874504F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(21, 38).addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.4F, -0.2F, 0.0F, 0.0F, -0.5462880425584197F, 0.32637658343874504F));

            PartDefinition Mane = Head.addOrReplaceChild("Mane", CubeListBuilder.create().texOffs(7, 34).addBox(-1.5F, -1.0F, -4.0F, 3.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -1.9F, 1.8F, 0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition Mane_1 = Mane.addOrReplaceChild("Mane_1", CubeListBuilder.create().texOffs(8, 39).addBox(-1.0F, -1.4F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.0F, -1.7F, -0.5473352640780661F, 0.0F, 0.0F));
            PartDefinition Mane_3 = Mane_1.addOrReplaceChild("Mane_3", CubeListBuilder.create().texOffs(8, 39).addBox(-1.0F, -1.4F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5473352640780661F, 0.0F, 0.0F));

            PartDefinition Mane_2 = Mane.addOrReplaceChild("Mane_2", CubeListBuilder.create().texOffs(12, 27).addBox(-1.0F, -0.2F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.0F, -1.2F, -0.1563815016444822F, 0.0F, 0.0F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 44).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.1F, -1.3F, 0.2405063662642867F, 0.0F, 0.0F));
            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.9F, 0.6576400674777856F, 0.0F, 0.0F));

            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 40).addBox(-1.0F, 0.0F, -1.75F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.6F, -0.1F, -0.19495327877934715F, 0.0F, 0.0F));

            PartDefinition ArmBaseLeft = Body.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(24, 48).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F), PartPose.offset(2.2F, 0.4F, -1.6F));
            PartDefinition ArmLeft = ArmBaseLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(24, 55).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 4.5F, 1.0F, -0.27314402127920984F, 0.0F, 0.13665927909957545F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(15, 46).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.8F, -0.5F, 1907508222411F, 0.0F, -0.11728612207217244F));
            PartDefinition ThumbLeft = HandLeft.addOrReplaceChild("ThumbLeft", CubeListBuilder.create().texOffs(16, 39).addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, -0.5F, 0.0F, 0.08726646259971647F, 0.13665927909957545F, 0.0F));

            PartDefinition ArmBaseRight = Body.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(24, 48).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F), PartPose.offset(-2.2F, 0.4F, -1.6F));
            PartDefinition ArmRight = ArmBaseRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(24, 55).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 4.5F, 1.0F, -0.27314402127920984F, 0.0F, -0.13665927909957545F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(15, 46).mirror(true).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.8F, -0.5F, 0.0781907508222411F, 0.0F, 0.11728612207217244F));
            PartDefinition ThumbRight = HandRight.addOrReplaceChild("ThumbRight", CubeListBuilder.create().texOffs(16, 39).mirror(true).addBox(0.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.1F, -0.5F, 0.0F, 0.08726646259971647F, -0.13665927909957545F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 64);
        }

        @Override
        public void setupAnim(LangurEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Tail1.xRot = Mth.cos(5.0F + limbSwing * speed * 0.1F + (float) Math.PI) * degree * 0.3F * limbSwingAmount * 0.5F - 0.98F;
            this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F + (float) Math.PI) * degree * 0.1F * limbSwingAmount * 0.5F + 0.28F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F + (float) Math.PI) * degree * 0.2F * limbSwingAmount * 0.5F + 0.97F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 0.6f;
            this.ArmBaseLeft.xRot = Mth.cos(limbSwing * speed * 0.3F + (float) Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F;
            this.ArmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * -1.5F * limbSwingAmount * 0.5F - 0.273F;
            this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F - 0.273F;
            this.ArmBaseRight.xRot = Mth.cos(limbSwing * speed * 0.3F + (float) Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F;
            this.ArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * 1.5F * limbSwingAmount * 0.5F - 0.273F;
            this.HandRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F - 0.273F;
            this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F - 0.156F;
            this.LegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * -3.0F * limbSwingAmount * 0.5F + 0.455F;
            this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * 1.5F * limbSwingAmount * 0.5F - 0.344F;
            this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F - 0.156F;
            this.LegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * 3.0F * limbSwingAmount * 0.5F + 0.455F;
            this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * -1.5F * limbSwingAmount * 0.5F - 0.344F;
            this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F + (float) Math.PI) * degree * 0.15F * limbSwingAmount * 0.5F + 0.185F;
            this.Hips.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + (float) Math.PI) * degree * -0.17F * limbSwingAmount * 0.5F - 0.14F;
            this.Tail1.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F + (float) Math.PI) * degree * 0.3F * limbSwingAmount * 0.5F - 0.98F;
            this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + (float) Math.PI) * degree * 0.1F * limbSwingAmount * 0.5F + 0.28F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.0F + (float) Math.PI) * degree * 0.0F * limbSwingAmount * 0.5F + 0.97F;
        }
    }

    public static class Child extends LangurModel {
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Hips;
        public ModelPart Tail1;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LegRight;
        public ModelPart Right;
        public ModelPart Neck;
        public ModelPart ArmLeft;
        public ModelPart ArmRight;
        public ModelPart Head;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Crest;
        public ModelPart Faceplate;
        public ModelPart Snout1;
        public ModelPart Snout2;
        public ModelPart Mouth;
        public ModelPart Nose;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart ForearmRight;
        public ModelPart HandRight;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart Tail4;
        public ModelPart Tail5;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Tail1 = this.Body.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.Tail4 = this.Tail3.getChild("Tail4");
            this.Tail5 = this.Tail4.getChild("Tail5");

            this.Hips = this.Body.getChild("Hips");
            this.Neck = this.Hips.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Snout1 = this.Head.getChild("Snout1");
            this.Nose = this.Snout1.getChild("Nose");

            this.Snout2 = this.Snout1.getChild("Snout2");

            this.Mouth = this.Snout1.getChild("Mouth");

            this.Crest = this.Head.getChild("Crest");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.EarRight = this.Head.getChild("EarRight");

            this.Faceplate = this.Head.getChild("Faceplate");

            this.ArmLeft = this.Hips.getChild("ArmLeft");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");

            this.ArmRight = this.Hips.getChild("ArmRight");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.HandRight = this.ForearmRight.getChild("HandRight");

            this.ThighRight = this.Body.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.Right = this.LegRight.getChild("Right");

            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 18.1F, 0.0F, -0.08726646259971647F, 0.0F, 0.0F));
            PartDefinition Tail1 = Body.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 22).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.8F, 2.0F, -0.7155849933176751F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 22).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 2.0F, 3.0F, 0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 22).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-0.01F, 0.0F, 3.0F, 0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 22).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 0.0F, 3.0F, 0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 22).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-0.0F, 0.0F, 3.0F, 0.3490658503988659F, 0.0F, 0.0F));

            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(16, 0).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.22689280275926282F, 0.0F, 0.0F));
            PartDefinition Neck = Hips.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(23, 8).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -3.8F, -0.7239625657377646F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(22, 15).addBox(-2.0F, -2.0F, -1.5F, 4.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -1.8F, 0.6408849226376065F, 0.0F, 0.0F));
            PartDefinition Snout1 = Head.addOrReplaceChild("Snout1", CubeListBuilder.create().texOffs(18, 24).addBox(-0.2F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.4F, -1.4F, 0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition Nose = Snout1.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(16, 21).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.9F, 0.9382889765773795F, 0.0F, 0.0F));

            PartDefinition Snout2 = Snout1.addOrReplaceChild("Snout2", CubeListBuilder.create().texOffs(18, 24).mirror(true).addBox(-0.8F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition Mouth = Snout1.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(18, 26).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.0F, 0.4F, 0.1F));

            PartDefinition Crest = Head.addOrReplaceChild("Crest", CubeListBuilder.create().texOffs(27, 28).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offset(0.0F, -1.1F, 1.1F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(33, 15).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.5F, -0.5F, 0.2F, 0.03490658503988659F, 0.6108652381980153F, 0.1308996938995747F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(33, 15).mirror(true).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.5F, -0.5F, 0.2F, 0.03490658503988659F, -0.6108652381980153F, -0.1308996938995747F));

            PartDefinition Faceplate = Head.addOrReplaceChild("Faceplate", CubeListBuilder.create().texOffs(22, 22).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 3.0F, 1.0F), PartPose.offset(0.0F, -0.4F, -1.3F));

            PartDefinition ArmLeft = Hips.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(14, 8).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.1F, 1.9F, -2.6F, 0.06981317007977318F, 0.0F, -0.13962634015954636F));
            PartDefinition ForearmLeft = ArmLeft.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(14, 13).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.2F, 2.8F, 1.0F, -0.4363323129985824F, 0.0F, 0.24434609527920614F));
            PartDefinition HandLeft = ForearmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(14, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.8F, -1.7F, 0.20943951023931953F, 0.0F, -0.10471975511965977F));

            PartDefinition ArmRight = Hips.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(14, 8).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.1F, 1.9F, -2.6F, 0.06981317007977318F, 0.0F, 0.13962634015954636F));
            PartDefinition ForearmRight = ArmRight.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(14, 13).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.2F, 2.8F, 1.0F, -0.4363323129985824F, 0.0F, -0.24434609527920614F));
            PartDefinition HandRight = ForearmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(14, 18).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.8F, -1.7F, 0.20943951023931953F, 0.0F, 0.10471975511965977F));

            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(0, 8).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(-1.3F, -0.9F, 1.3F, -0.20943951023931953F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(0, 14).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, -0.1F)), PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, 0.6457718232379019F, 0.0F, 0.0F));
            PartDefinition Right = LegRight.addOrReplaceChild("Right", CubeListBuilder.create().texOffs(0, 19).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.6F, 0.3F, -0.33161255787892263F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(1.3F, -0.9F, 1.3F, -0.20943951023931953F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, -0.1F)), PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, 0.6457718232379019F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.6F, 0.3F, -0.33161255787892263F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 48, 32);
        }

        @Override
        public void setupAnim(LangurEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Tail1.xRot = Mth.cos(5.0F + limbSwing * speed * 0.1F + (float) Math.PI) * degree * 0.3F * limbSwingAmount * 0.5F - 0.715F;
            this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F + (float) Math.PI) * degree * 0.1F * limbSwingAmount * 0.5F + 0.349F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F + (float) Math.PI) * degree * 0.2F * limbSwingAmount * 0.5F - 0.723F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.ArmLeft.xRot = Mth.cos(limbSwing * speed * 0.3F + (float) Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + 0.069F;
            this.ForearmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * -1.5F * limbSwingAmount * 0.5F - 0.436F;
            this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F + 0.209F;
            this.ArmRight.xRot = Mth.cos(limbSwing * speed * 0.3F + (float) Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F + 0.069F;
            this.ForearmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * 1.5F * limbSwingAmount * 0.5F - 0.436F;
            this.HandRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + 0.209F;
            this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F - 0.309F;
            this.LegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * -3.0F * limbSwingAmount * 0.5F + 0.645F;
            this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * 1.5F * limbSwingAmount * 0.5F - 0.331F;
            this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F - 0.309F;
            this.LegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * 3.0F * limbSwingAmount * 0.5F + 0.645F;
            this.Right.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + (float) Math.PI) * degree * -1.5F * limbSwingAmount * 0.5F - 0.331F;
            this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F + (float) Math.PI) * degree * 0.15F * limbSwingAmount * 0.5F + 0.226F;
            this.Hips.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + (float) Math.PI) * degree * -0.17F * limbSwingAmount * 0.5F - 0.087F;
            this.Tail1.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F + (float) Math.PI) * degree * 0.3F * limbSwingAmount * 0.5F - 0.715F;
            this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + (float) Math.PI) * degree * 0.1F * limbSwingAmount * 0.5F + 0.349F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.0F + (float) Math.PI) * degree * 0.0F * limbSwingAmount * 0.5F - 0.723F;
        }
    }
}

