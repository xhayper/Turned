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

import net.mcreator.latexes.entity.TSCdroneEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TSCdroneRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TSCdroneEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modeltsc_drone_model(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("latex:textures/tsc_drone_texture.png");
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
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("latex:textures/tsc_drone_glow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	public static class Modeltsc_drone_model extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer bone;
		private final ModelRenderer Body;
		private final ModelRenderer bone2;
		private final ModelRenderer LeftArm;
		private final ModelRenderer bone6;
		private final ModelRenderer RightArm;
		private final ModelRenderer bone5;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer bone4;
		private final ModelRenderer RightLeg;
		private final ModelRenderer bone7;
		public Modeltsc_drone_model() {
			textureWidth = 80;
			textureHeight = 80;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			Head.setTextureOffset(22, 23).addBox(-3.0F, -8.5F, -4.5F, 6.0F, 8.0F, 8.0F, 0.0F, false);
			Head.setTextureOffset(31, 16).addBox(2.75F, -2.5F, -4.75F, 2.0F, 3.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(12, 31).addBox(-4.75F, -2.5F, -4.75F, 2.0F, 3.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(17, 23).addBox(-2.0F, -1.5F, -4.75F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 0.0F, 3.0F);
			Head.addChild(bone);
			setRotationAngle(bone, 0.3927F, 0.0F, 0.0F);
			bone.setTextureOffset(12, 39).addBox(2.5F, -9.0F, -2.0F, 2.0F, 4.0F, 8.0F, 0.0F, false);
			bone.setTextureOffset(0, 31).addBox(-4.5F, -9.0F, -2.0F, 2.0F, 4.0F, 8.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.setTextureOffset(32, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 1.0F, 7.0F);
			Body.addChild(bone2);
			setRotationAngle(bone2, -0.3927F, 0.0F, 0.0F);
			bone2.setTextureOffset(0, 16).addBox(-1.0F, 10.0F, -2.0F, 2.0F, 2.0F, 13.0F, 0.0F, false);
			bone2.setTextureOffset(48, 43).addBox(-1.5F, 9.4619F, -1.8087F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			bone2.setTextureOffset(54, 16).addBox(-1.5F, 9.4619F, 1.1913F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(52, 0).addBox(-1.5F, 9.4619F, 3.1913F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(42, 25).addBox(-1.5F, 9.4619F, 7.1913F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(8, 43).addBox(-1.5F, 9.4619F, 5.1913F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(0, 43).addBox(-1.5F, 9.4619F, 9.1913F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			LeftArm.setTextureOffset(50, 25).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			LeftArm.setTextureOffset(48, 48).addBox(-3.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			LeftArm.setTextureOffset(16, 51).addBox(-2.0F, 2.0F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 16).addBox(-3.0F, -3.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			bone6 = new ModelRenderer(this);
			bone6.setRotationPoint(-2.5F, 0.0F, 0.0F);
			LeftArm.addChild(bone6);
			setRotationAngle(bone6, 0.0F, 0.0F, -0.3491F);
			bone6.setTextureOffset(0, 31).addBox(-2.0F, 1.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			RightArm.setTextureOffset(46, 35).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(42, 16).addBox(-1.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(17, 16).addBox(-1.0F, 2.0F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 21).addBox(1.0F, -3.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			bone5 = new ModelRenderer(this);
			bone5.setRotationPoint(2.5F, 0.0F, 0.0F);
			RightArm.addChild(bone5);
			setRotationAngle(bone5, 0.0F, 0.0F, 0.3491F);
			bone5.setTextureOffset(24, 39).addBox(0.0F, 1.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
			LeftLeg.setTextureOffset(0, 47).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(4.0F, 0.0F, 3.5F);
			LeftLeg.addChild(bone4);
			setRotationAngle(bone4, -0.3927F, 0.0F, 0.0F);
			bone4.setTextureOffset(24, 0).addBox(-1.0F, 4.0F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
			RightLeg.setTextureOffset(32, 39).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			bone7 = new ModelRenderer(this);
			bone7.setRotationPoint(-4.0F, 0.0F, 3.5F);
			RightLeg.addChild(bone7);
			setRotationAngle(bone7, -0.3927F, 0.0F, 0.0F);
			bone7.setTextureOffset(0, 0).addBox(-1.0F, 4.0F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
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
