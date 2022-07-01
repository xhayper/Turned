package io.github.changedmc.turned.client.model.armor;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import io.github.changedmc.turned.reference.TurnedReference;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class DarkLatexDisguiseRobe<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(TurnedReference.MOD_ID, "dark_latex_disguise"), "main");
    private final ModelPart Head;
    private final ModelPart Body;
    private final ModelPart RightArm;
    private final ModelPart LeftArm;
    private final ModelPart RightLeg;
    private final ModelPart LeftLeg;

    public DarkLatexDisguiseRobe(ModelPart root) {
        this.Head = root.getChild("Head");
        this.Body = root.getChild("Body");
        this.RightArm = root.getChild("RightArm");
        this.LeftArm = root.getChild("LeftArm");
        this.RightLeg = root.getChild("RightLeg");
        this.LeftLeg = root.getChild("LeftLeg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Hood = Head.addOrReplaceChild("Hood", CubeListBuilder.create().texOffs(53, 53).addBox(-3.5F, -29.0F, 3.5F, 7.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(26, 4).addBox(-4.25F, -32.0F, -4.5F, 1.0F, 8.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(17, 22).addBox(3.25F, -32.0F, -4.5F, 1.0F, 8.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-4.0F, -33.0F, -4.5F, 8.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition Head_r1 = Hood.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(55, 0).addBox(-5.0F, -3.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(50, 59).addBox(2.0F, -3.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -32.0F, 1.0F, -0.3927F, 0.0F, 0.0F));

        PartDefinition balacava = Head.addOrReplaceChild("balacava", CubeListBuilder.create().texOffs(50, 26).addBox(-4.0F, -27.0F, -4.125F, 8.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 31).addBox(-4.0F, -32.0F, -4.125F, 8.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(37, 53).addBox(-4.0F, -32.0F, 4.125F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(2, 4).addBox(3.0F, -29.0F, -4.125F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 4).addBox(-4.0F, -29.0F, -4.125F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition Head_r2 = balacava.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(50, 18).addBox(-4.0F, -4.0F, 4.125F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -28.0F, 0.0F, 0.0F, -1.5708F, 1.5708F));

        PartDefinition Head_r3 = balacava.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(46, 10).addBox(-4.0F, -4.0F, 4.125F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -28.0F, 0.0F, 0.0F, 1.5708F, 1.5708F));

        PartDefinition Head_r4 = balacava.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(50, 33).addBox(-4.0F, -32.0F, 4.125F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition Head_r5 = balacava.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(8, 53).addBox(-4.0F, -32.0F, 4.125F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(0, 13).addBox(-4.0F, -24.0F, -2.5F, 8.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition Body_r1 = Body2.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(39, 24).addBox(-1.0F, -13.0F, -2.875F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(32, 34).addBox(-3.25F, -2.0F, -2.5F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

        PartDefinition RightArm2 = RightArm.addOrReplaceChild("RightArm2", CubeListBuilder.create().texOffs(21, 4).addBox(-8.0F, -11.875F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(16, 61).addBox(-8.0F, -24.0F, 2.125F, 4.0F, 12.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(24, 61).addBox(-8.0F, -24.0F, -2.125F, 4.0F, 12.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 45).addBox(-8.125F, -24.0F, -2.0F, 0.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));

        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 34).addBox(-0.75F, -2.0F, -2.5F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));

        PartDefinition Leftarm2 = LeftArm.addOrReplaceChild("Leftarm2", CubeListBuilder.create().texOffs(8, 61).addBox(4.0F, -24.0F, -2.125F, 4.0F, 12.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 61).addBox(4.0F, -24.0F, 2.125F, 4.0F, 12.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(29, 45).addBox(8.125F, -24.0F, -2.0F, 0.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(21, 0).addBox(4.0F, -11.875F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 22.0F, 0.0F));

        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(28, 21).addBox(-2.125F, 1.0F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(13, 44).addBox(-2.125F, 6.0F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9F, 12.0F, 0.0F));

        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(37, 0).addBox(-1.875F, 1.0F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(45, 44).addBox(-0.875F, 6.0F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9F, 12.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Head.render(poseStack, buffer, packedLight, packedOverlay);
        Body.render(poseStack, buffer, packedLight, packedOverlay);
        RightArm.render(poseStack, buffer, packedLight, packedOverlay);
        LeftArm.render(poseStack, buffer, packedLight, packedOverlay);
        RightLeg.render(poseStack, buffer, packedLight, packedOverlay);
        LeftLeg.render(poseStack, buffer, packedLight, packedOverlay);
    }
}
