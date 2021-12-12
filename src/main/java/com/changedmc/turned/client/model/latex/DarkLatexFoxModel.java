package com.changedmc.turned.client.model.latex;

import com.changedmc.turned.entity.latex.DarkLatexFox;
import com.changedmc.turned.util.Reference;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.AgeableListModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;

import javax.annotation.Nonnull;

public class DarkLatexFoxModel<T extends Entity> extends AgeableListModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Reference.MOD_ID, "dark_latex_fox"), "main");

    private final ModelPart Head;
    private final ModelPart Body;
    private final ModelPart Tail;
    private final ModelPart LeftArm;
    private final ModelPart RightArm;
    private final ModelPart LeftLeg;
    private final ModelPart RightLeg;

    public DarkLatexFoxModel(ModelPart root) {
        super(false, 12.0F, 0.0F, 2.0F, 2.0F, 24.0F);
        this.Head = root.getChild("Head");
        this.Body = root.getChild("Body");
        this.Tail = root.getChild("Tail");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
        this.LeftLeg = root.getChild("LeftLeg");
        this.RightLeg = root.getChild("RightLeg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(47, 39).addBox(-2.0F, -2.9F, -6.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 16).addBox(-4.0F, -7.0F, -3.5F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(20, 0).addBox(-4.0F, -10.0F, -0.5F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 3).addBox(1.0F, -10.0F, -0.5F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Mask = Head.addOrReplaceChild("Mask", CubeListBuilder.create().texOffs(0, 11).addBox(-2.0F, -7.2F, -4.2F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 8).addBox(-3.0F, -6.2F, -4.2F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 19).addBox(-1.0F, -5.2F, -4.2F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(20, 5).addBox(-2.0F, -3.2F, -7.2F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 4).addBox(-2.0F, -1.2F, -7.2F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(8, 3).addBox(1.0F, -1.2F, -7.2F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(4, 19).addBox(2.0F, -3.2F, -4.2F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(3.0F, -5.2F, -4.2F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 6).addBox(2.1F, -3.2F, -7.2F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(6, 6).addBox(-2.1F, -3.2F, -7.2F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(20, 7).addBox(-3.0F, -3.2F, -4.2F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(10, 3).addBox(-4.0F, -5.2F, -4.2F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-2.0F, -3.2F, -7.2F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.5F));

        PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(26, 26).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -14.0F, 2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-2.0F, -15.0F, 3.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 23.0F, -5.2F, -0.3927F, 0.0F, 0.0F));

        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(32, 0).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 30).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));

        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));

        PartDefinition cube_r1 = LeftLeg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(46, 23).addBox(-2.0F, 4.3732F, -4.2794F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.6268F, 1.6794F, 0.0F, 0.0F, 0.0F));

        PartDefinition cube_r2 = LeftLeg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(46, 0).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.6268F, 2.2794F, -0.3927F, 0.0F, 0.0F));

        PartDefinition cube_r3 = LeftLeg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(14, 38).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5637F, -2.5296F, 0.7854F, 0.0F, 0.0F));

        PartDefinition cube_r4 = LeftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(46, 46).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.2F, -0.3927F, 0.0F, 0.0F));

        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));

        PartDefinition cube_r5 = RightLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(30, 19).addBox(-2.0F, 4.3732F, -4.2794F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.6268F, 1.6794F, 0.0F, 0.0F, 0.0F));

        PartDefinition cube_r6 = RightLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 47).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.6268F, 2.2794F, -0.3927F, 0.0F, 0.0F));

        PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(30, 42).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5637F, -2.5296F, 0.7854F, 0.0F, 0.0F));

        PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(42, 13).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.2F, -0.3927F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Nonnull
    @Override
    protected Iterable<ModelPart> headParts() {
        return ImmutableList.of(this.Head);
    }

    @Nonnull
    @Override
    protected Iterable<ModelPart> bodyParts() {
        return ImmutableList.of(this.Body, this.Tail, this.LeftArm, this.RightArm, this.LeftLeg, this.RightLeg);
    }

    @Override
    public void setupAnim(@Nonnull T darkLatexFox, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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