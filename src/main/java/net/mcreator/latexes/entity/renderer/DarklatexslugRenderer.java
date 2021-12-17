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

import net.mcreator.latexes.entity.DarklatexslugEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class DarklatexslugRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(DarklatexslugEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modeldl_slug_model(), 0.6f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("latex:textures/dl_slug_texture.png");
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
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("latex:textures/dl_slug_glow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	public static class Modeldl_slug_model extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer Body;
		private final ModelRenderer leftarm;
		private final ModelRenderer Rightarm;
		public Modeldl_slug_model() {
			textureWidth = 32;
			textureHeight = 32;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 21.0F, -4.25F);
			Head.setTextureOffset(0, 12).addBox(-2.0F, -3.0F, -2.75F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			Head.setTextureOffset(19, 4).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 1.0F, 0.0F, 0.0F, false);
			Head.setTextureOffset(2, 5).addBox(2.0F, -2.0F, -3.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			Head.setTextureOffset(19, 5).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 1.0F, 0.0F, 0.0F, false);
			Head.setTextureOffset(4, 3).addBox(1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			Head.setTextureOffset(4, 4).addBox(-2.0F, 0.0F, -3.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			Head.setTextureOffset(0, 4).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 1.0F, 0.0F, 0.0F, false);
			Head.setTextureOffset(0, 5).addBox(-3.0F, -2.0F, -3.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			Head.setTextureOffset(0, 3).addBox(-1.0F, -4.0F, -3.0F, 2.0F, 1.0F, 0.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 21.0F, -4.25F);
			Body.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, -0.75F, 6.0F, 5.0F, 7.0F, 0.0F, false);
			Body.setTextureOffset(16, 16).addBox(-2.0F, -1.0F, 6.25F, 4.0F, 4.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(0, 20).addBox(-1.0F, 0.0F, 8.25F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(0, 0).addBox(-1.0F, 1.0F, 10.25F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(2.0F, 23.0F, -3.0F);
			leftarm.setTextureOffset(19, 0).addBox(1.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Rightarm = new ModelRenderer(this);
			Rightarm.setRotationPoint(-2.0F, 23.0F, -3.0F);
			Rightarm.setTextureOffset(12, 12).addBox(-4.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			Body.render(matrixStack, buffer, packedLight, packedOverlay);
			leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
			Rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.Rightarm.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.leftarm.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
