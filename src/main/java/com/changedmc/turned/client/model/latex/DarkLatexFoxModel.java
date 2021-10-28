package com.changedmc.turned.client.model.latex;

import com.changedmc.turned.entity.latex.DarkLatexFoxEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

import javax.annotation.Nonnull;

public class DarkLatexFoxModel<T extends DarkLatexFoxEntity> extends EntityModel<T> {
    private final ModelRenderer Head;
    private final ModelRenderer Mask;
    private final ModelRenderer Body;
    private final ModelRenderer Tail;
    private final ModelRenderer LeftArm;
    private final ModelRenderer RightArm;
    private final ModelRenderer LeftLeg;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer RightLeg;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;

    public DarkLatexFoxModel() {
        texWidth = 64;
        texHeight = 64;

        Head = new ModelRenderer(this);
        Head.setPos(0.0F, 0.0F, 0.0F);
        Head.texOffs(47, 39).addBox(-2.0F, -2.9F, -6.5F, 4.0F, 3.0F, 3.0F, 0.0F, false);
        Head.texOffs(0, 16).addBox(-4.0F, -7.0F, -3.5F, 8.0F, 7.0F, 7.0F, 0.0F, false);
        Head.texOffs(20, 0).addBox(-4.0F, -10.0F, -0.5F, 3.0F, 3.0F, 2.0F, 0.0F, false);
        Head.texOffs(0, 3).addBox(1.0F, -10.0F, -0.5F, 3.0F, 3.0F, 2.0F, 0.0F, false);

        Mask = new ModelRenderer(this);
        Mask.setPos(0.0F, 0.0F, 0.5F);
        Head.addChild(Mask);
        Mask.texOffs(0, 11).addBox(-2.0F, -7.2F, -4.2F, 4.0F, 1.0F, 0.0F, 0.0F, false);
        Mask.texOffs(0, 8).addBox(-3.0F, -6.2F, -4.2F, 6.0F, 1.0F, 0.0F, 0.0F, false);
        Mask.texOffs(0, 19).addBox(-1.0F, -5.2F, -4.2F, 2.0F, 2.0F, 0.0F, 0.0F, false);
        Mask.texOffs(20, 5).addBox(-2.0F, -3.2F, -7.2F, 4.0F, 2.0F, 0.0F, 0.0F, false);
        Mask.texOffs(0, 4).addBox(-2.0F, -1.2F, -7.2F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        Mask.texOffs(8, 3).addBox(1.0F, -1.2F, -7.2F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        Mask.texOffs(4, 19).addBox(2.0F, -3.2F, -4.2F, 1.0F, 3.0F, 0.0F, 0.0F, false);
        Mask.texOffs(0, 0).addBox(3.0F, -5.2F, -4.2F, 1.0F, 4.0F, 0.0F, 0.0F, false);
        Mask.texOffs(0, 6).addBox(2.1F, -3.2F, -7.2F, 0.0F, 2.0F, 3.0F, 0.0F, false);
        Mask.texOffs(6, 6).addBox(-2.1F, -3.2F, -7.2F, 0.0F, 2.0F, 3.0F, 0.0F, false);
        Mask.texOffs(20, 7).addBox(-3.0F, -3.2F, -4.2F, 1.0F, 3.0F, 0.0F, 0.0F, false);
        Mask.texOffs(10, 3).addBox(-4.0F, -5.2F, -4.2F, 1.0F, 4.0F, 0.0F, 0.0F, false);
        Mask.texOffs(0, 0).addBox(-2.0F, -3.2F, -7.2F, 4.0F, 0.0F, 3.0F, 0.0F, false);

        Body = new ModelRenderer(this);
        Body.setPos(0.0F, 0.0F, 0.0F);
        Body.texOffs(26, 26).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

        Tail = new ModelRenderer(this);
        Tail.setPos(0.0F, 23.0F, -5.2F);
        setRotationAngle(Tail, -0.3927F, 0.0F, 0.0F);
        Tail.texOffs(0, 16).addBox(-1.0F, -14.0F, 2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        Tail.texOffs(0, 0).addBox(-2.0F, -15.0F, 3.0F, 4.0F, 4.0F, 12.0F, 0.0F, false);

        LeftArm = new ModelRenderer(this);
        LeftArm.setPos(-5.0F, 2.0F, 0.0F);
        LeftArm.texOffs(32, 0).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, 0.0F, false);

        RightArm = new ModelRenderer(this);
        RightArm.setPos(5.0F, 2.0F, 0.0F);
        RightArm.texOffs(0, 30).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, 0.0F, false);

        LeftLeg = new ModelRenderer(this);
        LeftLeg.setPos(-2.0F, 12.0F, 0.0F);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 4.6268F, 1.6794F);
        LeftLeg.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, 0.0F);
        cube_r1.texOffs(46, 23).addBox(-2.0F, 4.3732F, -4.2794F, 4.0F, 3.0F, 4.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 4.6268F, 2.2794F);
        LeftLeg.addChild(cube_r2);
        setRotationAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
        cube_r2.texOffs(46, 0).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 7.0F, 3.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(0.0F, 2.5637F, -2.5296F);
        LeftLeg.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.7854F, 0.0F, 0.0F);
        cube_r3.texOffs(14, 38).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(0.0F, -0.8F, 0.2F);
        LeftLeg.addChild(cube_r4);
        setRotationAngle(cube_r4, -0.3927F, 0.0F, 0.0F);
        cube_r4.texOffs(46, 46).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

        RightLeg = new ModelRenderer(this);
        RightLeg.setPos(2.0F, 12.0F, 0.0F);


        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(0.0F, 4.6268F, 1.6794F);
        RightLeg.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.0F, 0.0F);
        cube_r5.texOffs(30, 19).addBox(-2.0F, 4.3732F, -4.2794F, 4.0F, 3.0F, 4.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(0.0F, 4.6268F, 2.2794F);
        RightLeg.addChild(cube_r6);
        setRotationAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
        cube_r6.texOffs(0, 47).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 7.0F, 3.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(0.0F, 2.5637F, -2.5296F);
        RightLeg.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.7854F, 0.0F, 0.0F);
        cube_r7.texOffs(30, 42).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setPos(0.0F, -0.8F, 0.2F);
        RightLeg.addChild(cube_r8);
        setRotationAngle(cube_r8, -0.3927F, 0.0F, 0.0F);
        cube_r8.texOffs(42, 13).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
    }

    @Override
    public void renderToBuffer(@Nonnull MatrixStack matrixStack, @Nonnull IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        Head.render(matrixStack, buffer, packedLight, packedOverlay);
        Body.render(matrixStack, buffer, packedLight, packedOverlay);
        Tail.render(matrixStack, buffer, packedLight, packedOverlay);
        LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
        RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
        LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    @Override
    public void setupAnim(@Nonnull T p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {

    }
}
