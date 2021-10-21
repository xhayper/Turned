package com.changedmc.turned.client.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelDarkLatexM extends ModelBiped {
    private final ModelRenderer Anthro;
    private final ModelRenderer Legs;
    private final ModelRenderer LegRight;
    private final ModelRenderer LegUpperRight;
    private final ModelRenderer KneeRight;
    private final ModelRenderer LegUnderRight;
    private final ModelRenderer FeetRight;
    private final ModelRenderer beansRight;
    private final ModelRenderer LegLeft;
    private final ModelRenderer LegUpperLeft;
    private final ModelRenderer KneeLeft;
    private final ModelRenderer LegUnderLeft;
    private final ModelRenderer FeetLeft;
    private final ModelRenderer beansLeft;
    private final ModelRenderer Body;
    private final ModelRenderer Arms;
    private final ModelRenderer ArmLeft;
    private final ModelRenderer ArmRight;
    private final ModelRenderer Head;
    private final ModelRenderer tailTop;

    public ModelDarkLatexM() {
        textureWidth = 64;
        textureHeight = 64;

        Anthro = new ModelRenderer(this);
        Anthro.setRotationPoint(0.0F, 23.0F, 0.0F);
        setRotationAngle(Anthro, 0.0F, 1.5708F, 0.0F);

        Legs = new ModelRenderer(this);
        Legs.setRotationPoint(0.0F, 0.0F, 0.0F);
        Anthro.addChild(Legs);

        LegRight = new ModelRenderer(this);
        LegRight.setRotationPoint(0.0F, -9.0F, -2.0F);
        Legs.addChild(LegRight);

        LegUpperRight = new ModelRenderer(this);
        LegUpperRight.setRotationPoint(0.0F, 9.0F, 2.0F);
        setRotationAngle(LegUpperRight, 0.0F, 0.0F, -0.2618F);
        LegRight.addChild(LegUpperRight);
        LegUpperRight.cubeList.add(new ModelBox(LegUpperRight, 40, 42, 1.0F, -12.0F, -4.0F, 4, 5, 4, 0.0F, false));

        KneeRight = new ModelRenderer(this);
        KneeRight.setRotationPoint(0.0F, 9.0F, -8.0F);
        setRotationAngle(KneeRight, 0.0F, 0.0F, 2.8798F);
        LegRight.addChild(KneeRight);
        KneeRight.cubeList.add(new ModelBox(KneeRight, 36, 12, -5.0F, 5.0F, 6.0F, 6, 3, 4, 0.0F, false));

        LegUnderRight = new ModelRenderer(this);
        LegUnderRight.setRotationPoint(0.0F, 9.0F, -8.0F);
        setRotationAngle(LegUnderRight, 0.0F, 0.0F, -0.5236F);
        LegRight.addChild(LegUnderRight);
        LegUnderRight.cubeList.add(new ModelBox(LegUnderRight, 25, 46, 0.0F, -7.0F, 6.25F, 2, 6, 3, 0.0F, false));

        FeetRight = new ModelRenderer(this);
        FeetRight.setRotationPoint(0.0F, 9.0F, 2.0F);
        setRotationAngle(FeetRight, 0.0F, 0.0F, -1.309F);
        LegRight.addChild(FeetRight);
        FeetRight.cubeList.add(new ModelBox(FeetRight, 44, 26, 0.0F, -1.0F, -4.0F, 2, 3, 4, 0.0F, false));

        beansRight = new ModelRenderer(this);
        beansRight.setRotationPoint(0.0F, 0.0F, 0.0F);
        setRotationAngle(beansRight, 0.0F, 0.0F, -0.2618F);
        FeetRight.addChild(beansRight);
        beansRight.cubeList.add(new ModelBox(beansRight, 44, 0, -1.0F, 0.0F, -4.0F, 2, 3, 4, 0.0F, false));

        LegLeft = new ModelRenderer(this);
        LegLeft.setRotationPoint(0.0F, -9.0F, 2.0F);
        Legs.addChild(LegLeft);

        LegUpperLeft = new ModelRenderer(this);
        LegUpperLeft.setRotationPoint(0.0F, 9.0F, 2.0F);
        setRotationAngle(LegUpperLeft, 0.0F, 0.0F, -0.2618F);
        LegLeft.addChild(LegUpperLeft);
        LegUpperLeft.cubeList.add(new ModelBox(LegUpperLeft, 28, 37, 1.0F, -12.0F, -4.0F, 4, 5, 4, 0.0F, false));

        KneeLeft = new ModelRenderer(this);
        KneeLeft.setRotationPoint(0.0F, 9.0F, -8.0F);
        setRotationAngle(KneeLeft, 0.0F, 0.0F, 2.8798F);
        LegLeft.addChild(KneeLeft);
        KneeLeft.cubeList.add(new ModelBox(KneeLeft, 28, 30, -5.0F, 5.0F, 6.0F, 6, 3, 4, 0.0F, false));

        LegUnderLeft = new ModelRenderer(this);
        LegUnderLeft.setRotationPoint(0.0F, 9.0F, -8.0F);
        setRotationAngle(LegUnderLeft, 0.0F, 0.0F, -0.5236F);
        LegLeft.addChild(LegUnderLeft);
        LegUnderLeft.cubeList.add(new ModelBox(LegUnderLeft, 0, 44, 0.0F, -7.0F, 6.25F, 2, 6, 3, 0.0F, false));

        FeetLeft = new ModelRenderer(this);
        FeetLeft.setRotationPoint(0.0F, 9.0F, 2.0F);
        setRotationAngle(FeetLeft, 0.0F, 0.0F, -1.309F);
        LegLeft.addChild(FeetLeft);
        FeetLeft.cubeList.add(new ModelBox(FeetLeft, 42, 19, 0.0F, -1.0F, -4.0F, 2, 3, 4, 0.0F, false));

        beansLeft = new ModelRenderer(this);
        beansLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
        setRotationAngle(beansLeft, 0.0F, 0.0F, -0.2618F);
        FeetLeft.addChild(beansLeft);
        beansLeft.cubeList.add(new ModelBox(beansLeft, 0, 37, -1.0F, 0.0F, -4.0F, 2, 3, 4, 0.0F, false));

        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.0F, -18.0F, 0.0F);
        Anthro.addChild(Body);
        Body.cubeList.add(new ModelBox(Body, 0, 0, -2.0F, -6.0F, -4.0F, 4, 12, 8, 0.0F, false));

        Arms = new ModelRenderer(this);
        Arms.setRotationPoint(0.0F, 0.0F, 0.0F);
        Anthro.addChild(Arms);

        ArmLeft = new ModelRenderer(this);
        ArmLeft.setRotationPoint(0.0F, -22.0F, 6.0F);
        Arms.addChild(ArmLeft);
        ArmLeft.cubeList.add(new ModelBox(ArmLeft, 14, 30, -2.0F, -2.0F, -2.0F, 4, 14, 3, 0.0F, false));

        ArmRight = new ModelRenderer(this);
        ArmRight.setRotationPoint(0.0F, -22.0F, -5.0F);
        Arms.addChild(ArmRight);
        ArmRight.cubeList.add(new ModelBox(ArmRight, 0, 20, -2.0F, -2.0F, -2.0F, 4, 14, 3, 0.0F, false));

        Head = new ModelRenderer(this);
        Head.setRotationPoint(0.0F, -24.0F, 0.0F);
        Anthro.addChild(Head);
        Head.cubeList.add(new ModelBox(Head, 18, 18, -3.0F, -6.0F, -3.0F, 6, 6, 6, 0.0F, false));
        Head.cubeList.add(new ModelBox(Head, 24, 12, 3.0F, -3.0F, -1.5F, 2, 2, 3, 0.0F, false));
        Head.cubeList.add(new ModelBox(Head, 0, 3, -1.0F, -8.0F, 2.0F, 2, 2, 1, 0.0F, false));
        Head.cubeList.add(new ModelBox(Head, 0, 0, -1.0F, -8.0F, -3.0F, 2, 2, 1, 0.0F, false));

        tailTop = new ModelRenderer(this);
        tailTop.setRotationPoint(-1.0F, -13.0F, 0.0F);
        setRotationAngle(tailTop, 0.0F, 0.0F, -0.2618F);
        Anthro.addChild(tailTop);
        tailTop.cubeList.add(new ModelBox(tailTop, 16, 0, -10.3987F, -1.6841F, -2.0F, 10, 4, 4, 0.0F, false));
        tailTop.cubeList.add(new ModelBox(tailTop, 24, 8, -11.3987F, -0.6841F, -1.0F, 11, 2, 2, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        Anthro.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        float f = MathHelper.sin(this.swingProgress);
        this.LegLeft.rotateAngleZ = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.LegRight.rotateAngleZ = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
        this.ArmRight.rotateAngleZ = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.ArmLeft.rotateAngleZ = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;

        this.Head.rotateAngleY = netHeadYaw * 0.017453292F;
        this.Head.rotateAngleZ = headPitch * 0.017453292F;

        float f1 = MathHelper.sin((1.0F - (1.0F - this.swingProgress) * (1.0F - this.swingProgress)) * (float) Math.PI);

        this.ArmRight.rotateAngleZ += f * -1.2F - f1 * -0.4F + f * 0.2F;
        //this.ArmLeft.rotateAngleZ += f * 1.2F - f1 * 0.4F;
    }
}