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

import net.mcreator.latexes.entity.La4tankmorphrEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class La4tankmorphrRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(La4tankmorphrEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modella_4_tankmorph_model_r(), 1.0999999999999999f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("latex:textures/la-4_tankmorph_evil.png");
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
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("latex:textures/la4_glow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	public static class Modella_4_tankmorph_model_r extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer bone;
		private final ModelRenderer bone3;
		private final ModelRenderer Body;
		private final ModelRenderer bone2;
		private final ModelRenderer Cannon;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer RightLeg;
		public Modella_4_tankmorph_model_r() {
			textureWidth = 128;
			textureHeight = 128;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, -33.0F, 0.0F);
			Head.setTextureOffset(52, 81).addBox(-4.0F, -10.0F, -3.5F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			Head.setTextureOffset(46, 34).addBox(-0.1F, -6.5F, -3.75F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(68, 46).addBox(-4.5F, -4.0F, -4.0F, 9.0F, 2.0F, 9.0F, 0.0F, false);
			Head.setTextureOffset(20, 63).addBox(-5.0F, -2.5F, -4.5F, 10.0F, 3.0F, 10.0F, 0.0F, false);
			Head.setTextureOffset(26, 99).addBox(0.5F, -1.5F, 3.0F, 5.0F, 11.0F, 3.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 22.6F, 0.5F);
			Head.addChild(bone);
			setRotationAngle(bone, 0.0F, 0.0F, -0.1745F);
			bone.setTextureOffset(96, 101).addBox(8.1676F, -31.6354F, -2.5F, 3.0F, 5.0F, 5.0F, 0.0F, false);
			bone.setTextureOffset(22, 42).addBox(10.0212F, -31.0701F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(0, 105).addBox(11.1676F, -31.6354F, -2.5F, 3.0F, 4.0F, 5.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(0.0F, 22.6F, 0.5F);
			Head.addChild(bone3);
			setRotationAngle(bone3, 0.0F, 0.0F, 0.1745F);
			bone3.setTextureOffset(80, 101).addBox(-11.1676F, -31.6354F, -2.5F, 3.0F, 5.0F, 5.0F, 0.0F, false);
			bone3.setTextureOffset(104, 12).addBox(-14.1676F, -31.6354F, -2.5F, 3.0F, 4.0F, 5.0F, 0.0F, false);
			bone3.setTextureOffset(106, 0).addBox(-14.0525F, -30.0704F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, -33.0F, 0.0F);
			Body.setTextureOffset(0, 15).addBox(-9.5F, 0.0F, -2.5F, 19.0F, 7.0F, 6.0F, 0.0F, false);
			Body.setTextureOffset(44, 22).addBox(-7.5F, 7.0F, -2.5F, 15.0F, 6.0F, 6.0F, 0.0F, false);
			Body.setTextureOffset(60, 34).addBox(-7.0F, 13.0F, -2.5F, 14.0F, 6.0F, 6.0F, 0.0F, false);
			Body.setTextureOffset(0, 28).addBox(-8.0F, 19.0F, -3.0F, 16.0F, 7.0F, 7.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 25.0F, -0.5F);
			Body.addChild(bone2);
			setRotationAngle(bone2, 0.7418F, 0.0F, 0.0F);
			bone2.setTextureOffset(0, 0).addBox(-8.5F, -18.8747F, 7.5115F, 17.0F, 7.0F, 8.0F, 0.0F, false);
			Cannon = new ModelRenderer(this);
			Cannon.setRotationPoint(-1.0F, -30.0F, -5.25F);
			setRotationAngle(Cannon, 1.5708F, 0.0F, 0.0F);
			Cannon.setTextureOffset(94, 57).addBox(-9.0F, 2.5F, 2.25F, 6.0F, 6.0F, 6.0F, 0.0F, false);
			Cannon.setTextureOffset(42, 0).addBox(-8.0F, -1.5F, 3.75F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			Cannon.setTextureOffset(50, 97).addBox(-7.5F, -21.5F, 4.75F, 3.0F, 20.0F, 2.0F, 0.0F, false);
			Cannon.setTextureOffset(106, 69).addBox(-8.5F, 8.5F, 4.25F, 5.0F, 4.0F, 3.0F, 0.0F, false);
			Cannon.setTextureOffset(34, 42).addBox(-8.5F, 8.5F, 3.25F, 5.0F, 2.0F, 1.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(-9.0F, -31.0F, -2.0F);
			setRotationAngle(LeftArm, -1.5708F, 0.0F, 0.0F);
			LeftArm.setTextureOffset(95, 48).addBox(-5.45F, -5.75F, -2.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);
			LeftArm.setTextureOffset(84, 84).addBox(-5.45F, -3.75F, -2.0F, 6.0F, 12.0F, 5.0F, 0.0F, false);
			LeftArm.setTextureOffset(88, 75).addBox(-4.95F, 7.25F, -2.5F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 70).addBox(-5.95F, 8.25F, -2.5F, 7.0F, 17.0F, 6.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(9.0F, -29.0F, 1.0F);
			RightArm.setTextureOffset(84, 0).addBox(0.45F, -3.75F, -3.0F, 6.0F, 12.0F, 5.0F, 0.0F, false);
			RightArm.setTextureOffset(101, 82).addBox(2.45F, -5.75F, -3.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);
			RightArm.setTextureOffset(94, 29).addBox(-0.05F, 7.25F, -3.5F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			RightArm.setTextureOffset(26, 76).addBox(-0.05F, 8.25F, -3.5F, 7.0F, 17.0F, 6.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(-4.0F, -8.0F, 0.0F);
			LeftLeg.setTextureOffset(86, 17).addBox(-5.0F, -4.0F, -3.5F, 5.0F, 4.0F, 8.0F, 0.0F, false);
			LeftLeg.setTextureOffset(95, 38).addBox(0.0F, -2.0F, -3.5F, 2.0F, 2.0F, 8.0F, 0.0F, false);
			LeftLeg.setTextureOffset(50, 0).addBox(-5.0F, 0.0F, -3.5F, 9.0F, 13.0F, 8.0F, 0.0F, false);
			LeftLeg.setTextureOffset(38, 38).addBox(-3.0F, 13.0F, -3.5F, 7.0F, 17.0F, 8.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(4.0F, -8.0F, 0.0F);
			RightLeg.setTextureOffset(0, 93).addBox(0.0F, -4.0F, -3.5F, 5.0F, 4.0F, 8.0F, 0.0F, false);
			RightLeg.setTextureOffset(60, 97).addBox(-2.0F, -2.0F, -3.5F, 2.0F, 2.0F, 8.0F, 0.0F, false);
			RightLeg.setTextureOffset(60, 60).addBox(-4.0F, 0.0F, -3.5F, 9.0F, 13.0F, 8.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 42).addBox(-4.0F, 13.0F, -3.5F, 7.0F, 17.0F, 8.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			Body.render(matrixStack, buffer, packedLight, packedOverlay);
			Cannon.render(matrixStack, buffer, packedLight, packedOverlay);
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
			this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
