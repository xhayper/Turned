package net.mcreator.latexes.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class DarkLatexSkeletonRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(DarkLatexSkeletonEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelskeleton_dl_model(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("latex:textures/skeleton_dl_texture.png");
					}
				};
			});
		}
	}

	@OnlyIn(Dist.CLIENT)
	private static class GlowingLayer<T extends Entity, M extends EntityModel<T>> extends LayerRenderer<T, M> {
		public GlowingLayer(IEntityRenderer<T, M> er) {
			super(er);
		}

		public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing,
				float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("latex:textures/skeleton_dl_glow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	public static class Modelskeleton_dl_model extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer Mask;
		private final ModelRenderer Body;
		private final ModelRenderer bone;
		private final ModelRenderer cube_r2;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer RightLeg;
		public Modelskeleton_dl_model() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.5236F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(16, 34).addBox(3.8F, -6.0F, 1.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			cube_r1.setTextureOffset(36, 16).addBox(-4.8F, -6.0F, 1.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			Mask = new ModelRenderer(this);
			Mask.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.addChild(Mask);
			Mask.setTextureOffset(0, 3).addBox(-2.0F, -3.0F, -4.3F, 4.0F, 2.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(2, 19).addBox(-2.0F, -1.0F, -4.3F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(0, 19).addBox(1.0F, -1.0F, -4.3F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(0, 18).addBox(2.0F, -3.0F, -4.3F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(4, 7).addBox(3.0F, -4.0F, -4.3F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(2, 16).addBox(2.0F, -6.0F, -4.3F, 1.0F, 2.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(0, 0).addBox(-2.0F, -7.0F, -4.3F, 4.0F, 3.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(0, 16).addBox(-3.0F, -6.0F, -4.3F, 1.0F, 2.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(6, 7).addBox(-4.0F, -4.0F, -4.3F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(2, 18).addBox(-3.0F, -3.0F, -4.3F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(0, 7).addBox(-1.0F, -4.0F, -4.3F, 2.0F, 1.0F, 0.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.setTextureOffset(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.addChild(bone);
			bone.setTextureOffset(24, 4).addBox(0.9F, 1.0F, -2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(24, 6).addBox(-3.9F, 1.0F, -2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(28, 16).addBox(-3.9F, 3.0F, -2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(24, 2).addBox(0.9F, 3.0F, -2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(24, 0).addBox(0.9F, 5.0F, -2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 5).addBox(-3.9F, 5.0F, -2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 48).addBox(-0.5F, 0.0F, 1.5F, 1.0F, 11.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(28, 18).addBox(0.5F, 7.0F, 1.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(28, 22).addBox(0.5F, 5.0F, 1.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(12, 34).addBox(0.5F, 3.0F, 1.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(44, 0).addBox(0.5F, 1.0F, 1.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(18, 43).addBox(-3.5F, 1.0F, 1.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(36, 25).addBox(-3.5F, 3.0F, 1.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(12, 32).addBox(-3.5F, 5.0F, 1.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(28, 20).addBox(-3.5F, 7.0F, 1.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(cube_r2);
			setRotationAngle(cube_r2, 1.0036F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(24, 16).addBox(-0.5F, 7.0F, -8.5F, 1.0F, 11.0F, 1.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			LeftArm.setTextureOffset(36, 36).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			LeftArm.setTextureOffset(40, 25).addBox(-3.4F, 3.8F, -2.5F, 1.0F, 6.0F, 5.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			RightArm.setTextureOffset(32, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(11, 43).addBox(2.4F, 3.8F, -2.5F, 1.0F, 6.0F, 5.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
			LeftLeg.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			LeftLeg.setTextureOffset(23, 43).addBox(-2.3F, 0.4F, -2.5F, 1.0F, 5.0F, 5.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
			RightLeg.setTextureOffset(24, 24).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			RightLeg.setTextureOffset(44, 11).addBox(1.3F, 0.4F, -2.5F, 1.0F, 5.0F, 5.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			Body.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
