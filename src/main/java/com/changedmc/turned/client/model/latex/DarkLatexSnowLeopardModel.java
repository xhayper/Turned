package com.changedmc.turned.client.model.latex;

import com.changedmc.turned.entity.latex.DarkLatexSnowLeopard;
import com.changedmc.turned.util.Reference;
import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.AgeableListModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nonnull;

public class DarkLatexSnowLeopardModel<T extends Entity> extends AgeableListModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Reference.MOD_ID, "dark_latex_snow_leopard"), "main");

    private final ModelPart Head;
    private final ModelPart Body;
    private final ModelPart LeftArm;
    private final ModelPart RightArm;
    private final ModelPart LeftLeg;
    private final ModelPart RightLeg;

    public DarkLatexSnowLeopardModel(ModelPart root) {
        super(false, 12.0F, 0.0F, 2.0F, 2.0F, 24.0F);
        this.Head = root.getChild("Head");
        this.Body = root.getChild("Body");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
        this.LeftLeg = root.getChild("LeftLeg");
        this.RightLeg = root.getChild("RightLeg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(16, 56).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 17).addBox(-4.0F, -5.0F, -4.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 31).addBox(-3.0F, -5.0F, -4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(22, 0).addBox(-2.0F, -5.0F, -4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(10, 12).addBox(0.0F, -5.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 17).addBox(-4.0F, -8.0F, -3.0F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(23, 18).addBox(-4.0F, -1.0F, 3.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 10).addBox(-4.0F, 1.0F, 3.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 12).addBox(-4.0F, 2.0F, 3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(6, 12).addBox(-4.0F, 3.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(56, 28).addBox(2.0F, -10.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(56, 22).addBox(-5.0F, -10.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 31).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(22, 0).addBox(-5.0F, -1.0F, -3.0F, 10.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(30, 11).addBox(-3.5F, 4.0F, -3.0F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -0.5902F, 0.4559F, 4.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0F, 1.0F, -0.5672F, 0.0F, 0.0F));

        PartDefinition bone8 = Tail.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(20, 21).addBox(-2.0F, 6.6167F, -7.7314F, 4.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.4336F, 17.9186F, 0.3927F, 0.0F, 0.0F));

        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 54).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(24, 34).addBox(-4.0F, 3.0F, -2.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(50, 7).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(38, 18).addBox(-1.0F, 3.0F, -2.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));

        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(52, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 46).addBox(-2.0F, 10.213F, -3.1649F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 11.0F, 0.0F));

        PartDefinition bone = LeftLeg.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(50, 50).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

        PartDefinition bone3 = LeftLeg.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(18, 46).addBox(-6.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 4.0F, -1.0F, 0.6545F, 0.0F, 0.0F));

        PartDefinition bone4 = LeftLeg.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(55, 40).addBox(-2.0F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, -0.48F, 0.0F, 0.0F));

        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(48, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(37, 41).addBox(-2.0F, 10.213F, -3.1649F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 11.0F, 0.0F));

        PartDefinition bone5 = RightLeg.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(34, 49).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

        PartDefinition bone6 = RightLeg.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(44, 30).addBox(2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 4.0F, -1.0F, 0.6545F, 0.0F, 0.0F));

        PartDefinition bone7 = RightLeg.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, -0.48F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Nonnull
    @Override
    protected Iterable<ModelPart> headParts() {
        return ImmutableList.of(this.Head);
    }

    @Nonnull
    @Override
    protected Iterable<ModelPart> bodyParts() {
        return ImmutableList.of(this.Body, this.LeftArm, this.RightArm, this.LeftLeg, this.RightLeg);
    }

    @Override
    public void setupAnim(@Nonnull T darkLatexSnowLeopard, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.Head.yRot = netHeadYaw * ((float) Math.PI / 180F);
        this.Body.yRot = 0.0F;
        this.RightArm.z = 0.0F;
        this.RightArm.x = -5.0F;
        this.LeftArm.z = 0.0F;
        this.LeftArm.x = 5.0F;
        float f = 1.0F;

        this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * 2.0F * limbSwingAmount * 0.5F / f;
        this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F / f;
        this.RightArm.zRot = 0.0F;
        this.LeftArm.zRot = 0.0F;
        this.RightLeg.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount / f;
        this.LeftLeg.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount / f;
        this.RightLeg.yRot = 0.0F;
        this.LeftLeg.yRot = 0.0F;
        this.RightLeg.zRot = 0.0F;
        this.LeftLeg.zRot = 0.0F;

        if (this.riding) {
            this.RightArm.xRot += (-(float) Math.PI / 5F);
            this.LeftArm.xRot += (-(float) Math.PI / 5F);
            this.RightLeg.xRot = -1.4137167F;
            this.RightLeg.yRot = ((float) Math.PI / 10F);
            this.RightLeg.zRot = 0.07853982F;
            this.LeftLeg.xRot = -1.4137167F;
            this.LeftLeg.yRot = (-(float) Math.PI / 10F);
            this.LeftLeg.zRot = -0.07853982F;
        }
    }
}
