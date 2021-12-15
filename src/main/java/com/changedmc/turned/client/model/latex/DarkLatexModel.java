package com.changedmc.turned.client.model.latex;

import com.changedmc.turned.client.model.CustomHumanoidModel;
import com.changedmc.turned.reference.Reference;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;

public class DarkLatexModel<T extends LivingEntity> extends CustomHumanoidModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Reference.MOD_ID, "darklatexmodel"), "main");

	public DarkLatexModel(ModelPart root) {
		super(RenderType::entityCutoutNoCull, root.getChild("Head"), root.getChild("Body"), root.getChild("LeftArm"), root.getChild("RightArm"), root.getChild("LeftLeg"), root.getChild("RightLeg"));
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(19, 10).addBox(4.0F, -4.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 7).addBox(-5.0F, -4.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, -1.75F, -1.625F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(-0.5F, -0.75F, -1.625F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -9.0F, 0.5F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -0.75F, -1.625F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(5, 4).addBox(-1.5F, -1.75F, -1.625F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -9.0F, 0.5F, 0.0F, -1.5708F, -0.3927F));

		PartDefinition Mask = Head.addOrReplaceChild("Mask", CubeListBuilder.create().texOffs(23, 12).addBox(-1.0F, -8.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(19, 9).addBox(-4.0F, -3.0F, -5.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 11).addBox(-3.0F, -2.0F, -5.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 1).addBox(-2.5F, -1.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(1.5F, -1.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 12).addBox(-3.0F, -6.0F, -5.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(19, 6).addBox(-2.0F, -7.0F, -5.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(10, 4).addBox(-0.5F, -4.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 10).addBox(2.375F, -4.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(8, 3).addBox(-4.375F, -4.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(3, 7).addBox(-3.375F, -5.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 2).addBox(2.375F, -5.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(19, 7).addBox(-1.5F, -5.0F, -5.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.75F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(28, 28).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 0).addBox(-1.25F, -0.6125F, 0.7823F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(5, 0).addBox(-1.25F, -0.6125F, 13.7823F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(19, 0).addBox(-1.25F, 2.3875F, 4.7823F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(38, 17).addBox(-1.25F, -1.6125F, -0.2177F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0F, 1.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 32).addBox(-3.0F, 3.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(52, 11).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(28, 12).addBox(-1.0F, 3.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(52, 0).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(24, 20).addBox(2.0F, 10.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 18).addBox(2.0F, 10.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 16).addBox(2.0F, 10.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 22).addBox(-13.0F, 10.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 22).addBox(-13.0F, 10.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(23, 10).addBox(-13.0F, 10.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(52, 36).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(52, 30).addBox(-2.0F, 11.213F, -2.1649F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 11.0F, 0.0F));

		PartDefinition bone = LeftLeg.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(44, 43).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bone3 = LeftLeg.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(40, 5).addBox(-6.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 4.0F, -1.0F, 0.6545F, 0.0F, 0.0F));

		PartDefinition bone4 = LeftLeg.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(14, 49).addBox(-2.0F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(28, 52).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(48, 24).addBox(-2.0F, 11.213F, -2.1649F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 11.0F, 0.0F));

		PartDefinition bone5 = RightLeg.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(28, 43).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bone6 = RightLeg.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(12, 39).addBox(2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 4.0F, -1.0F, 0.6545F, 0.0F, 0.0F));

		PartDefinition bone7 = RightLeg.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(0, 46).addBox(-2.0F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, -0.48F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}
}