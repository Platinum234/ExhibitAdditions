package com.github.platinum234.exhibitadditions.client.model;

import com.github.platinum234.exhibitadditions.entity.PeccaryEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class PeccaryModel extends ZawaBaseModel<PeccaryEntity> {
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

    public static class Adult extends PeccaryModel {

        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Throat;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer EarLeft;
        public ModelRenderer Cheeks;
        public ModelRenderer HeadConnection;
        public ModelRenderer EarRight;
        public ModelRenderer TuftRight;
        public ModelRenderer TuftLeft;
        public ModelRenderer TuskLeft;
        public ModelRenderer TuskRight;
        public ModelRenderer Mouth;
        public ModelRenderer TuftTop1;
        public ModelRenderer TuftTop2;
        public ModelRenderer UpperArmRight;
        public ModelRenderer LowerArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer LowerArmLeft;
        public ModelRenderer HandLeft;


        public Adult() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 14.2F, -5.0F);
            this.Chest.addBox(-3.0F, -4.0F, -2.0F, 6.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.04555309164612875F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 17, 50);
            this.LowerLegRight.setPos(0.0F, 1.7F, 2.7F);
            this.LowerLegRight.addBox(-0.99F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.3490658503988659F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 29, 60);
            this.FootLeft.setPos(-0.1F, 3.2F, -1.2F);
            this.FootLeft.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.13665927909957545F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 57, 15);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.5F, -3.1F, 0.5F);
            this.EarLeft.addBox(-1.0F, -2.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, -0.591841146688116F, -0.6829473549475088F, 1.2292353975059285F);
            this.Tail = new ModelRenderer(this, 0, 37);
            this.Tail.setPos(0.0F, 0.0F, 4.8F);
            this.Tail.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, -0.956091342937205F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 51, 57);
            this.UpperArmLeft.mirror = true;
            this.UpperArmLeft.setPos(0.0F, 3.9F, 1.0F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.0911061832922575F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 29, 60);
            this.FootRight.setPos(0.1F, 3.2F, -1.2F);
            this.FootRight.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.13665927909957545F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 17, 50);
            this.LowerLegLeft.mirror = true;
            this.LowerLegLeft.setPos(0.0F, 1.7F, 2.7F);
            this.LowerLegLeft.addBox(-1.01F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.3490658503988659F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 18, 57);
            this.UpperLegLeft.mirror = true;
            this.UpperLegLeft.setPos(-0.1F, 7.0F, -1.5F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.4363323129985824F, 0.0F, 0.0F);
            this.TuftTop2 = new ModelRenderer(this, 11, 37);
            this.TuftTop2.setPos(0.01F, -0.1F, 1.7F);
            this.TuftTop2.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TuftTop2, -0.591841146688116F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 49);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(2.5F, 1.8F, 2.5F);
            this.ThighLeft.addBox(-1.5F, -1.0F, -2.5F, 3.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.HeadConnection = new ModelRenderer(this, 43, 43);
            this.HeadConnection.setPos(0.0F, -2.6F, 0.0F);
            this.HeadConnection.addBox(-1.5F, -1.3F, -1.7F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HeadConnection, 0.2275909337942703F, 0.0F, 0.0F);
            this.Cheeks = new ModelRenderer(this, 13, 44);
            this.Cheeks.setPos(0.0F, -1.0F, -0.1F);
            this.Cheeks.addBox(-2.5F, 0.1F, -2.5F, 5.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 43, 49);
            this.HandRight.setPos(0.1F, 2.3F, -1.3F);
            this.HandRight.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Throat = new ModelRenderer(this, 27, 49);
            this.Throat.setPos(0.0F, 5.6F, -2.0F);
            this.Throat.addBox(-1.5F, -1.0F, -2.8F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Throat, -0.27314402127920984F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 14);
            this.Hips.setPos(0.0F, -0.4F, 6.5F);
            this.Hips.addBox(-3.0F, -0.7F, 0.3F, 6.0F, 9.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.2275909337942703F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 23, 11);
            this.Body.setPos(0.0F, -3.0F, 2.9F);
            this.Body.addBox(-3.5F, -1.4F, -1.0F, 7.0F, 9.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.04555309164612875F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 38, 54);
            this.ArmBaseLeft.mirror = true;
            this.ArmBaseLeft.setPos(2.2F, 1.1F, -0.2F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.0911061832922575F, 0.0F, 0.0F);
            this.TuftLeft = new ModelRenderer(this, 50, 0);
            this.TuftLeft.mirror = true;
            this.TuftLeft.setPos(0.5F, -3.6F, 0.1F);
            this.TuftLeft.addBox(-0.5F, -1.2F, -2.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TuftLeft, 0.0F, 0.0F, 0.27314402127920984F);
            this.LowerArmLeft = new ModelRenderer(this, 52, 50);
            this.LowerArmLeft.mirror = true;
            this.LowerArmLeft.setPos(0.0F, 2.3F, 0.0F);
            this.LowerArmLeft.addBox(-1.01F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmLeft, -0.04363323129985824F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 28, 28);
            this.Mouth.setPos(0.0F, 2.5F, -1.3F);
            this.Mouth.addBox(-1.0F, -1.2F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.13665927909957545F, 0.0F, 0.0F);
            this.TuftRight = new ModelRenderer(this, 50, 0);
            this.TuftRight.setPos(-0.5F, -3.6F, 0.1F);
            this.TuftRight.addBox(-1.5F, -1.2F, -2.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TuftRight, 0.0F, 0.0F, -0.27314402127920984F);
            this.LowerArmRight = new ModelRenderer(this, 52, 50);
            this.LowerArmRight.setPos(0.0F, 2.3F, 0.0F);
            this.LowerArmRight.addBox(-0.99F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmRight, -0.04363323129985824F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 51, 57);
            this.UpperArmRight.setPos(0.0F, 3.9F, 1.0F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.0911061832922575F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 38, 54);
            this.ArmBaseRight.setPos(-2.2F, 1.1F, -0.2F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.0911061832922575F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 18, 57);
            this.UpperLegRight.setPos(-0.1F, 7.0F, -1.5F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.4363323129985824F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 32, 0);
            this.Neck.setPos(0.0F, -3.2F, -1.0F);
            this.Neck.addBox(-2.5F, -0.7F, -3.0F, 5.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 0.18203784630933073F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 25, 35);
            this.Snout.setPos(0.0F, -1.2F, -0.5F);
            this.Snout.addBox(-1.5F, -1.5F, -4.9F, 3.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.3642502295386026F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 42, 33);
            this.Head.setPos(0.0F, 3.8F, -4.0F);
            this.Head.addBox(-2.0F, -3.5F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.04555309164612875F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 57, 15);
            this.EarRight.setPos(-1.5F, -3.1F, 0.5F);
            this.EarRight.addBox(-1.0F, -2.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, -0.591841146688116F, 0.6829473549475088F, -1.2292353975059285F);
            this.HandLeft = new ModelRenderer(this, 43, 49);
            this.HandLeft.setPos(-0.1F, 2.3F, -1.3F);
            this.HandLeft.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 49);
            this.ThighRight.setPos(-2.5F, 1.8F, 2.5F);
            this.ThighRight.addBox(-1.5F, -1.0F, -2.5F, 3.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.TuftTop1 = new ModelRenderer(this, 0, 31);
            this.TuftTop1.setPos(-0.01F, -1.2F, -0.2F);
            this.TuftTop1.addBox(-1.0F, -1.5F, -1.5F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TuftTop1, 0.04555309164612875F, 0.0F, 0.0F);
            this.TuskLeft = new ModelRenderer(this, 0, 1);
            this.TuskLeft.mirror = true;
            this.TuskLeft.setPos(1.0F, 1.3F, -3.0F);
            this.TuskLeft.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TuskLeft, 0.0F, 0.0F, 0.3186971254089062F);
            this.TuskRight = new ModelRenderer(this, 0, 1);
            this.TuskRight.setPos(-1.0F, 1.3F, -3.0F);
            this.TuskRight.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TuskRight, 0.0F, 0.0F, -0.3186971254089062F);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Head.addChild(this.EarLeft);
            this.Hips.addChild(this.Tail);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.LowerLegRight.addChild(this.FootRight);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.TuftTop1.addChild(this.TuftTop2);
            this.Hips.addChild(this.ThighLeft);
            this.Head.addChild(this.HeadConnection);
            this.Head.addChild(this.Cheeks);
            this.LowerArmRight.addChild(this.HandRight);
            this.Neck.addChild(this.Throat);
            this.Body.addChild(this.Hips);
            this.Chest.addChild(this.Body);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Head.addChild(this.TuftLeft);
            this.UpperArmLeft.addChild(this.LowerArmLeft);
            this.Cheeks.addChild(this.Mouth);
            this.Head.addChild(this.TuftRight);
            this.UpperArmRight.addChild(this.LowerArmRight);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Chest.addChild(this.Neck);
            this.Head.addChild(this.Snout);
            this.Neck.addChild(this.Head);
            this.Head.addChild(this.EarRight);
            this.LowerArmLeft.addChild(this.HandLeft);
            this.Hips.addChild(this.ThighRight);
            this.HeadConnection.addChild(this.TuftTop1);
            this.Snout.addChild(this.TuskLeft);
            this.Snout.addChild(this.TuskRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(PeccaryEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.045F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.182F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.045F;
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
                float speed = 1.2f;
                float degree = 0.6f;
                this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.182F;
                this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.045F;

                this.Chest.y = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 14.2F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 0.045F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.045F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.228F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.091F;
                this.UpperArmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F -0.091F;
                this.LowerArmLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F -0.044F;
                this.HandLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.091F;
                this.UpperArmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F -0.091F;
                this.LowerArmRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F -0.044F;
                this.HandRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.436F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.349F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.136F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.436F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.349F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.136F;
            }
        }
    }


    public static class Child extends PeccaryModel {
            public ModelRenderer Body;
            public ModelRenderer Neck;
            public ModelRenderer ArmBaseLeft;
            public ModelRenderer ArmBaseRight;
            public ModelRenderer Hips;
            public ModelRenderer ThighLeft;
            public ModelRenderer ThighRight;
            public ModelRenderer Tail;
            public ModelRenderer UpperLegLeft;
            public ModelRenderer LowerLegLeft;
            public ModelRenderer FootLeft;
            public ModelRenderer UpperLegRight;
            public ModelRenderer LowerLegRight;
            public ModelRenderer FootRight;
            public ModelRenderer Head;
            public ModelRenderer Snout;
            public ModelRenderer Mouth;
            public ModelRenderer EarLeft;
            public ModelRenderer EarRight;
            public ModelRenderer CheekTuftRight;
            public ModelRenderer CheetTuftLeft;
            public ModelRenderer ArmLeft;
            public ModelRenderer ForearmLeft;
            public ModelRenderer HandLeft;
            public ModelRenderer ArmRight;
            public ModelRenderer ForearmRight;
            public ModelRenderer HandRight;

            public Child() {
                texWidth = 32;
                texHeight = 32;
                this.Neck = new ModelRenderer(this, 16, 0);
                this.Neck.setPos(0.0F, -0.6F, -1.0F);
                this.Neck.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Neck, -0.16580627893946132F, 0.0F, 0.0F);
                this.EarLeft = new ModelRenderer(this, 20, 12);
                this.EarLeft.setPos(1.1F, -1.2F, 0.7F);
                this.EarLeft.addBox(-1.0F, -1.2F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(EarLeft, -0.5410520681182421F, -0.3490658503988659F, 0.7504915783575618F);
                this.ForearmLeft = new ModelRenderer(this, 8, 28);
                this.ForearmLeft.setPos(-0.01F, 0.9F, -1.0F);
                this.ForearmLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(ForearmLeft, 0.017453292519943295F, 0.0F, 0.0F);
                this.Chest = new ModelRenderer(this, 0, 8);
                this.Chest.setPos(0.0F, 18.3F, -3.0F);
                this.Chest.addBox(-1.5F, -1.5F, -1.0F, 3.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Chest, -0.12217304763960307F, 0.0F, 0.0F);
                this.FootRight = new ModelRenderer(this, 4, 29);
                this.FootRight.mirror = true;
                this.FootRight.setPos(0.01F, 1.3F, -0.7F);
                this.FootRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.ThighRight = new ModelRenderer(this, 0, 20);
                this.ThighRight.mirror = true;
                this.ThighRight.setPos(-1.2F, 1.5F, 1.1F);
                this.ThighRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(ThighRight, 0.2617993877991494F, 0.0F, 0.0F);
                this.Hips = new ModelRenderer(this, 0, 14);
                this.Hips.setPos(0.0F, -0.3F, 4.0F);
                this.Hips.addBox(-1.5F, 0.3F, 0.0F, 3.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Hips, -0.3490658503988659F, 0.0F, 0.0F);
                this.EarRight = new ModelRenderer(this, 20, 12);
                this.EarRight.mirror = true;
                this.EarRight.setPos(-1.2F, -1.2F, 0.7F);
                this.EarRight.addBox(-1.0F, -1.2F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(EarRight, -0.5410520681182421F, 0.3490658503988659F, -0.7504915783575618F);
                this.ArmLeft = new ModelRenderer(this, 8, 25);
                this.ArmLeft.setPos(-0.01F, 2.0F, 0.3F);
                this.ArmLeft.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(ArmLeft, -0.12217304763960307F, 0.0F, 0.0F);
                this.LowerLegRight = new ModelRenderer(this, 0, 28);
                this.LowerLegRight.mirror = true;
                this.LowerLegRight.setPos(0.01F, 1.8F, 1.0F);
                this.LowerLegRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(LowerLegRight, -0.6981317007977318F, 0.0F, 0.0F);
                this.Body = new ModelRenderer(this, 0, 0);
                this.Body.setPos(0.0F, -1.5F, 0.1F);
                this.Body.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Body, 0.20943951023931953F, 0.0F, 0.0F);
                this.ArmBaseLeft = new ModelRenderer(this, 8, 21);
                this.ArmBaseLeft.setPos(1.4F, 0.4F, 0.0F);
                this.ArmBaseLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(ArmBaseLeft, 0.22689280275926282F, 0.0F, 0.0F);
                this.ArmRight = new ModelRenderer(this, 8, 25);
                this.ArmRight.mirror = true;
                this.ArmRight.setPos(0.01F, 2.0F, 0.3F);
                this.ArmRight.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(ArmRight, -0.12217304763960307F, 0.0F, 0.0F);
                this.ArmBaseRight = new ModelRenderer(this, 8, 21);
                this.ArmBaseRight.mirror = true;
                this.ArmBaseRight.setPos(-1.4F, 0.4F, 0.0F);
                this.ArmBaseRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(ArmBaseRight, 0.22689280275926282F, 0.0F, 0.0F);
                this.CheetTuftLeft = new ModelRenderer(this, -1, 0);
                this.CheetTuftLeft.setPos(1.4F, 0.4F, 1.3F);
                this.CheetTuftLeft.addBox(-1.5F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(CheetTuftLeft, 0.07853981633974483F, -0.938114472946952F, -0.47123889803846897F);
                this.ThighLeft = new ModelRenderer(this, 0, 20);
                this.ThighLeft.setPos(1.2F, 1.5F, 1.1F);
                this.ThighLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(ThighLeft, 0.2617993877991494F, 0.0F, 0.0F);
                this.HandRight = new ModelRenderer(this, 4, 29);
                this.HandRight.mirror = true;
                this.HandRight.setPos(0.01F, 1.5F, 0.3F);
                this.HandRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.ForearmRight = new ModelRenderer(this, 8, 28);
                this.ForearmRight.mirror = true;
                this.ForearmRight.setPos(0.01F, 0.9F, -1.0F);
                this.ForearmRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(ForearmRight, 0.017453292519943295F, 0.0F, 0.0F);
                this.CheekTuftRight = new ModelRenderer(this, -1, 0);
                this.CheekTuftRight.setPos(-1.0F, 0.7F, 0.6F);
                this.CheekTuftRight.addBox(-1.5F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(CheekTuftRight, 0.07853981633974483F, 0.938114472946952F, 0.47123889803846897F);
                this.HandLeft = new ModelRenderer(this, 4, 29);
                this.HandLeft.setPos(-0.01F, 1.5F, 0.3F);
                this.HandLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.Mouth = new ModelRenderer(this, 10, 16);
                this.Mouth.setPos(0.0F, 0.4F, -0.9F);
                this.Mouth.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.Tail = new ModelRenderer(this, 14, 19);
                this.Tail.setPos(0.0F, 0.7F, 1.5F);
                this.Tail.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Tail, 0.4300491170387584F, 0.0F, 0.0F);
                this.UpperLegRight = new ModelRenderer(this, 0, 25);
                this.UpperLegRight.mirror = true;
                this.UpperLegRight.setPos(-0.3F, 3.0F, -0.3F);
                this.UpperLegRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(UpperLegRight, 0.6981317007977318F, 0.0F, 0.0F);
                this.Snout = new ModelRenderer(this, 10, 12);
                this.Snout.setPos(0.0F, -1.2F, -1.5F);
                this.Snout.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Snout, 0.4363323129985824F, 0.0F, 0.0F);
                this.LowerLegLeft = new ModelRenderer(this, 0, 28);
                this.LowerLegLeft.setPos(-0.01F, 1.8F, 0.9F);
                this.LowerLegLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(LowerLegLeft, -0.6981317007977318F, 0.0F, 0.0F);
                this.Head = new ModelRenderer(this, 14, 6);
                this.Head.setPos(0.0F, 0.7F, -2.0F);
                this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Head, 0.40142572795869574F, 0.0F, 0.0F);
                this.FootLeft = new ModelRenderer(this, 4, 29);
                this.FootLeft.setPos(-0.01F, 1.3F, -0.7F);
                this.FootLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.UpperLegLeft = new ModelRenderer(this, 0, 25);
                this.UpperLegLeft.setPos(0.3F, 3.0F, -0.3F);
                this.UpperLegLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(UpperLegLeft, 0.6981317007977318F, 0.0F, 0.0F);
                this.Chest.addChild(this.Neck);
                this.Head.addChild(this.EarLeft);
                this.ArmLeft.addChild(this.ForearmLeft);
                this.LowerLegRight.addChild(this.FootRight);
                this.Hips.addChild(this.ThighRight);
                this.Body.addChild(this.Hips);
                this.Head.addChild(this.EarRight);
                this.ArmBaseLeft.addChild(this.ArmLeft);
                this.UpperLegRight.addChild(this.LowerLegRight);
                this.Chest.addChild(this.Body);
                this.Chest.addChild(this.ArmBaseLeft);
                this.ArmBaseRight.addChild(this.ArmRight);
                this.Chest.addChild(this.ArmBaseRight);
                this.Mouth.addChild(this.CheetTuftLeft);
                this.Hips.addChild(this.ThighLeft);
                this.ForearmRight.addChild(this.HandRight);
                this.ArmRight.addChild(this.ForearmRight);
                this.Mouth.addChild(this.CheekTuftRight);
                this.ForearmLeft.addChild(this.HandLeft);
                this.Head.addChild(this.Mouth);
                this.Hips.addChild(this.Tail);
                this.ThighRight.addChild(this.UpperLegRight);
                this.Head.addChild(this.Snout);
                this.UpperLegLeft.addChild(this.LowerLegLeft);
                this.Neck.addChild(this.Head);
                this.LowerLegLeft.addChild(this.FootLeft);
                this.ThighLeft.addChild(this.UpperLegLeft);
                this.saveBase();
            }

            @Override
            public void setupAnim(PeccaryEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
                this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
                this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
                this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.4F;
                this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
            }

            @Override
            public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                float speed = 1.0f;
                float degree = 1.0f;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.166F;
                this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.4F;

                this.Tail.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.43F;
                this.Tail.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            }

            @Override
            public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                if (isSwimming) {
                    limbSwing = (float) entity.tickCount;
                    limbSwingAmount = 0.3F;
                } else {
                    float speed = 0.8f;
                    float degree = 0.8f;
                    this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.166F;
                    this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.4F;
                    this.Tail.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.43F;
                    this.Tail.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;

                    this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 18.3F;
                    this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.122F;
                    this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.209F;
                    this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.349F;

                    this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.227F;
                    this.ForearmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F + 0.017F;
                    this.ArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F -0.122F;
                    this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                    this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.227F;
                    this.ForearmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F + 0.017F;
                    this.ArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F -0.122F;
                    this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                    this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.262F;
                    this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.698F;
                    this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.698F;
                    this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                    this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.262F;
                    this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.698F;
                    this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.698F;
                    this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
                }
            }
        }
    }

