package com.changedmc.turned.client.model;

import com.changedmc.turned.entity.latex.DarkLatexMaleEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class DarkLatexMaleModel<T extends DarkLatexMaleEntity> extends EntityModel<T> {
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

    public DarkLatexMaleModel() {
        texWidth = 64;
        texHeight = 64;

        Anthro = new ModelRenderer(this);
        Anthro.setPos(0.0F, 23.0F, 0.0F);
        setRotationAngle(Anthro, 0.0F, 1.5708F, 0.0F);


        Legs = new ModelRenderer(this);
        Legs.setPos(0.0F, 0.0F, 0.0F);
        Anthro.addChild(Legs);


        LegRight = new ModelRenderer(this);
        LegRight.setPos(0.0F, -9.0F, -2.0F);
        Legs.addChild(LegRight);


        LegUpperRight = new ModelRenderer(this);
        LegUpperRight.setPos(0.0F, 9.0F, 2.0F);
        LegRight.addChild(LegUpperRight);
        setRotationAngle(LegUpperRight, 0.0F, 0.0F, -0.2618F);
        LegUpperRight.texOffs(40, 42).addBox(1.0F, -12.0F, -4.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

        KneeRight = new ModelRenderer(this);
        KneeRight.setPos(0.0F, 9.0F, -8.0F);
        LegRight.addChild(KneeRight);
        setRotationAngle(KneeRight, 0.0F, 0.0F, 2.8798F);
        KneeRight.texOffs(36, 12).addBox(-5.0F, 5.0F, 6.0F, 6.0F, 3.0F, 4.0F, 0.0F, false);

        LegUnderRight = new ModelRenderer(this);
        LegUnderRight.setPos(0.0F, 9.0F, -8.0F);
        LegRight.addChild(LegUnderRight);
        setRotationAngle(LegUnderRight, 0.0F, 0.0F, -0.5236F);
        LegUnderRight.texOffs(25, 46).addBox(0.0F, -7.0F, 6.25F, 2.0F, 6.0F, 3.0F, 0.0F, false);

        FeetRight = new ModelRenderer(this);
        FeetRight.setPos(0.0F, 9.0F, 2.0F);
        LegRight.addChild(FeetRight);
        setRotationAngle(FeetRight, 0.0F, 0.0F, -1.309F);
        FeetRight.texOffs(44, 26).addBox(0.0F, -1.0F, -4.0F, 2.0F, 3.0F, 4.0F, 0.0F, false);

        beansRight = new ModelRenderer(this);
        beansRight.setPos(0.0F, 0.0F, 0.0F);
        FeetRight.addChild(beansRight);
        setRotationAngle(beansRight, 0.0F, 0.0F, -0.2618F);
        beansRight.texOffs(44, 0).addBox(-1.0F, 0.0F, -4.0F, 2.0F, 3.0F, 4.0F, 0.0F, false);

        LegLeft = new ModelRenderer(this);
        LegLeft.setPos(0.0F, -9.0F, 2.0F);
        Legs.addChild(LegLeft);


        LegUpperLeft = new ModelRenderer(this);
        LegUpperLeft.setPos(0.0F, 9.0F, 2.0F);
        LegLeft.addChild(LegUpperLeft);
        setRotationAngle(LegUpperLeft, 0.0F, 0.0F, -0.2618F);
        LegUpperLeft.texOffs(28, 37).addBox(1.0F, -12.0F, -4.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

        KneeLeft = new ModelRenderer(this);
        KneeLeft.setPos(0.0F, 9.0F, -8.0F);
        LegLeft.addChild(KneeLeft);
        setRotationAngle(KneeLeft, 0.0F, 0.0F, 2.8798F);
        KneeLeft.texOffs(28, 30).addBox(-5.0F, 5.0F, 6.0F, 6.0F, 3.0F, 4.0F, 0.0F, false);

        LegUnderLeft = new ModelRenderer(this);
        LegUnderLeft.setPos(0.0F, 9.0F, -8.0F);
        LegLeft.addChild(LegUnderLeft);
        setRotationAngle(LegUnderLeft, 0.0F, 0.0F, -0.5236F);
        LegUnderLeft.texOffs(0, 44).addBox(0.0F, -7.0F, 6.25F, 2.0F, 6.0F, 3.0F, 0.0F, false);

        FeetLeft = new ModelRenderer(this);
        FeetLeft.setPos(0.0F, 9.0F, 2.0F);
        LegLeft.addChild(FeetLeft);
        setRotationAngle(FeetLeft, 0.0F, 0.0F, -1.309F);
        FeetLeft.texOffs(42, 19).addBox(0.0F, -1.0F, -4.0F, 2.0F, 3.0F, 4.0F, 0.0F, false);

        beansLeft = new ModelRenderer(this);
        beansLeft.setPos(0.0F, 0.0F, 0.0F);
        FeetLeft.addChild(beansLeft);
        setRotationAngle(beansLeft, 0.0F, 0.0F, -0.2618F);
        beansLeft.texOffs(0, 37).addBox(-1.0F, 0.0F, -4.0F, 2.0F, 3.0F, 4.0F, 0.0F, false);

        Body = new ModelRenderer(this);
        Body.setPos(0.0F, -18.0F, 0.0F);
        Anthro.addChild(Body);
        Body.texOffs(0, 0).addBox(-2.0F, -6.0F, -4.0F, 4.0F, 12.0F, 8.0F, 0.0F, false);

        Arms = new ModelRenderer(this);
        Arms.setPos(0.0F, 0.0F, 0.0F);
        Anthro.addChild(Arms);


        ArmLeft = new ModelRenderer(this);
        ArmLeft.setPos(0.0F, -22.0F, 6.0F);
        Arms.addChild(ArmLeft);
        ArmLeft.texOffs(14, 30).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 14.0F, 3.0F, 0.0F, false);

        ArmRight = new ModelRenderer(this);
        ArmRight.setPos(0.0F, -22.0F, -5.0F);
        Arms.addChild(ArmRight);
        ArmRight.texOffs(0, 20).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 14.0F, 3.0F, 0.0F, false);

        Head = new ModelRenderer(this);
        Head.setPos(0.0F, -24.0F, 0.0F);
        Anthro.addChild(Head);
        Head.texOffs(18, 18).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
        Head.texOffs(24, 12).addBox(3.0F, -3.0F, -1.5F, 2.0F, 2.0F, 3.0F, 0.0F, false);
        Head.texOffs(0, 3).addBox(-1.0F, -8.0F, 2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        Head.texOffs(0, 0).addBox(-1.0F, -8.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        tailTop = new ModelRenderer(this);
        tailTop.setPos(-1.0F, -13.0F, 0.0F);
        Anthro.addChild(tailTop);
        setRotationAngle(tailTop, 0.0F, 0.0F, -0.2618F);
        tailTop.texOffs(16, 0).addBox(-10.3987F, -1.6841F, -2.0F, 10.0F, 4.0F, 4.0F, 0.0F, false);
        tailTop.texOffs(24, 8).addBox(-11.3987F, -0.6841F, -1.0F, 11.0F, 2.0F, 2.0F, 0.0F, false);
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        Anthro.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    @Override
    public void setupAnim(T p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) { }
}
