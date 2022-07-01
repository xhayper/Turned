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

public class DarkLatexDisguiseMask<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(TurnedReference.MOD_ID, "dark_latex_disguise"), "main");
    private final ModelPart Head;

    public DarkLatexDisguiseMask(ModelPart root) {
        this.Head = root.getChild("Head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition mask = Head.addOrReplaceChild("mask", CubeListBuilder.create().texOffs(4, 5).addBox(-2.0F, -25.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(4, 4).addBox(1.0F, -25.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 1).addBox(-2.0F, -26.0F, -5.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 3).addBox(-1.0F, -28.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 2).addBox(-1.0F, -31.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(4, 3).addBox(-4.0F, -28.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(4, 2).addBox(3.0F, -28.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(18, 39).addBox(-3.0F, -27.0F, -5.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-2.0F, -30.0F, -5.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(37, 33).addBox(-3.0F, -29.0F, -5.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.75F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Head.render(poseStack, buffer, packedLight, packedOverlay);
    }
}
