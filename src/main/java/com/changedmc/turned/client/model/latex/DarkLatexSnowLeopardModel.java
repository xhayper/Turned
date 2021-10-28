package com.changedmc.turned.client.model.latex;

import com.changedmc.turned.entity.latex.DarkLatexSnowLeopardEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

import javax.annotation.Nonnull;

public class DarkLatexSnowLeopardModel<T extends DarkLatexSnowLeopardEntity> extends EntityModel<T> {
    private final ModelRenderer Head;
    private final ModelRenderer Body;
    private final ModelRenderer Tail;
    private final ModelRenderer bone8;
    private final ModelRenderer LeftArm;
    private final ModelRenderer RightArm;
    private final ModelRenderer LeftLeg;
    private final ModelRenderer bone;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;
    private final ModelRenderer Rightleg;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;

    public DarkLatexSnowLeopardModel() {
        texWidth = 128;
        texHeight = 128;

        Head = new ModelRenderer(this);
        Head.setPos(0.0F, 0.0F, 0.0F);
        Head.texOffs(16, 56).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);
        Head.texOffs(0, 17).addBox(-4.0F, -5.0F, -4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
        Head.texOffs(0, 31).addBox(-3.0F, -5.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        Head.texOffs(22, 0).addBox(-2.0F, -5.0F, -4.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        Head.texOffs(10, 12).addBox(0.0F, -5.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Head.texOffs(0, 17).addBox(-4.0F, -8.0F, -3.0F, 8.0F, 7.0F, 7.0F, 0.0F, false);
        Head.texOffs(23, 18).addBox(-4.0F, -1.0F, 3.0F, 8.0F, 2.0F, 1.0F, 0.0F, false);
        Head.texOffs(0, 10).addBox(-4.0F, 1.0F, 3.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        Head.texOffs(0, 12).addBox(-4.0F, 2.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        Head.texOffs(6, 12).addBox(-4.0F, 3.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Head.texOffs(56, 28).addBox(2.0F, -10.0F, -1.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
        Head.texOffs(56, 22).addBox(-5.0F, -10.0F, -1.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);

        Body = new ModelRenderer(this);
        Body.setPos(0.0F, 0.0F, 0.0F);
        Body.texOffs(0, 31).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 11.0F, 4.0F, 0.0F, false);
        Body.texOffs(22, 0).addBox(-5.0F, -1.0F, -3.0F, 10.0F, 5.0F, 6.0F, 0.0F, false);
        Body.texOffs(30, 11).addBox(-3.5F, 4.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

        Tail = new ModelRenderer(this);
        Tail.setPos(0.0F, 9.0F, 1.0F);
        Body.addChild(Tail);
        setRotationAngle(Tail, -0.5672F, 0.0F, 0.0F);
        Tail.texOffs(0, 0).addBox(-2.0F, -0.5902F, 0.4559F, 4.0F, 3.0F, 14.0F, 0.0F, false);

        bone8 = new ModelRenderer(this);
        bone8.setPos(0.0F, -9.4336F, 17.9186F);
        Tail.addChild(bone8);
        setRotationAngle(bone8, 0.3927F, 0.0F, 0.0F);
        bone8.texOffs(20, 21).addBox(-2.0F, 6.6167F, -7.7314F, 4.0F, 3.0F, 10.0F, 0.0F, false);

        LeftArm = new ModelRenderer(this);
        LeftArm.setPos(-5.0F, 2.0F, 0.0F);
        LeftArm.texOffs(0, 54).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
        LeftArm.texOffs(24, 34).addBox(-4.0F, 3.0F, -2.0F, 5.0F, 8.0F, 4.0F, 0.0F, false);

        RightArm = new ModelRenderer(this);
        RightArm.setPos(5.0F, 2.0F, 0.0F);
        RightArm.texOffs(50, 7).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
        RightArm.texOffs(38, 18).addBox(-1.0F, 3.0F, -2.0F, 5.0F, 8.0F, 4.0F, 0.0F, false);

        LeftLeg = new ModelRenderer(this);
        LeftLeg.setPos(-2.0F, 11.0F, 0.0F);
        LeftLeg.texOffs(52, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
        LeftLeg.texOffs(0, 46).addBox(-2.0F, 10.213F, -3.1649F, 4.0F, 3.0F, 5.0F, 0.0F, false);

        bone = new ModelRenderer(this);
        bone.setPos(0.0F, 1.0F, 0.0F);
        LeftLeg.addChild(bone);
        setRotationAngle(bone, -0.3927F, 0.0F, 0.0F);
        bone.texOffs(50, 50).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

        bone3 = new ModelRenderer(this);
        bone3.setPos(4.0F, 4.0F, -1.0F);
        LeftLeg.addChild(bone3);
        setRotationAngle(bone3, 0.6545F, 0.0F, 0.0F);
        bone3.texOffs(18, 46).addBox(-6.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

        bone4 = new ModelRenderer(this);
        bone4.setPos(0.0F, 4.0F, -1.0F);
        LeftLeg.addChild(bone4);
        setRotationAngle(bone4, -0.48F, 0.0F, 0.0F);
        bone4.texOffs(55, 40).addBox(-2.0F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, 0.0F, false);

        Rightleg = new ModelRenderer(this);
        Rightleg.setPos(2.0F, 11.0F, 0.0F);
        Rightleg.texOffs(48, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
        Rightleg.texOffs(37, 41).addBox(-2.0F, 10.213F, -3.1649F, 4.0F, 3.0F, 5.0F, 0.0F, false);

        bone5 = new ModelRenderer(this);
        bone5.setPos(0.0F, 1.0F, 0.0F);
        Rightleg.addChild(bone5);
        setRotationAngle(bone5, -0.3927F, 0.0F, 0.0F);
        bone5.texOffs(34, 49).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

        bone6 = new ModelRenderer(this);
        bone6.setPos(-4.0F, 4.0F, -1.0F);
        Rightleg.addChild(bone6);
        setRotationAngle(bone6, 0.6545F, 0.0F, 0.0F);
        bone6.texOffs(44, 30).addBox(2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

        bone7 = new ModelRenderer(this);
        bone7.setPos(0.0F, 4.0F, -1.0F);
        Rightleg.addChild(bone7);
        setRotationAngle(bone7, -0.48F, 0.0F, 0.0F);
        bone7.texOffs(0, 0).addBox(-2.0F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(@Nonnull DarkLatexSnowLeopardEntity darkLatexSnowLeopardEntity, float f, float f1, float f2, float f3, float f4) {
        this.RightArm.xRot = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
        this.LeftLeg.xRot = MathHelper.cos(f) * -1.0F * f1;
        this.Head.yRot = f3 / (180F / (float) Math.PI);
        this.Head.xRot = f4 / (180F / (float) Math.PI);
        this.LeftArm.xRot = MathHelper.cos(f * 0.6662F) * f1;
        this.Rightleg.xRot = MathHelper.cos(f) * 1.0F * f1;
    }

    @Override
    public void renderToBuffer(@Nonnull MatrixStack matrixStack, @Nonnull IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        Head.render(matrixStack, buffer, packedLight, packedOverlay);
        Body.render(matrixStack, buffer, packedLight, packedOverlay);
        LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
        RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
        LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        Rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
