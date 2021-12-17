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

import net.mcreator.latexes.entity.DLbeeEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class DLbeeRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(DLbeeEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modeldl_bee_model(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("latex:textures/dark_latex_bee_texture.png");
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
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("latex:textures/dark_latex_bee_glow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	public static class Modeldl_bee_model extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer Mask;
		private final ModelRenderer Body;
		private final ModelRenderer Wings;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer Tail;
		private final ModelRenderer cube_r9;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer cube_r10;
		private final ModelRenderer RightLeg;
		private final ModelRenderer cube_r11;
		public Modeldl_bee_model() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 6.0F, 8.0F, 0.0F, false);
			Head.setTextureOffset(18, 24).addBox(-4.0F, -2.0F, -1.0F, 8.0F, 2.0F, 5.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-0.2F, -11.2403F, 2.7827F);
			Head.addChild(cube_r1);
			setRotationAngle(cube_r1, 1.6144F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 14).addBox(3.0F, -12.0F, -2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-6.8F, -11.2403F, 2.7827F);
			Head.addChild(cube_r2);
			setRotationAngle(cube_r2, 1.6144F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(18, 37).addBox(3.0F, -12.0F, -2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-6.8F, 0.0F, 1.7F);
			Head.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.5236F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(18, 24).addBox(3.0F, -12.0F, -2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-0.2F, 1.0F, 0.2F);
			Head.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.5236F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(22, 37).addBox(3.0F, -12.0F, -0.3F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-0.1895F, 0.341F, 0.0F);
			Head.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, 0.0F, 0.0873F);
			cube_r5.setTextureOffset(48, 0).addBox(-4.0F, -2.0F, -4.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.1895F, 0.341F, 0.0F);
			Head.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0F, 0.0F, -0.0873F);
			cube_r6.setTextureOffset(48, 9).addBox(0.0F, -2.0F, -4.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);
			Mask = new ModelRenderer(this);
			Mask.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.addChild(Mask);
			Mask.setTextureOffset(36, 31).addBox(-4.0F, -5.0F, -4.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(26, 19).addBox(-3.0F, -3.0F, -4.5F, 6.0F, 1.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(36, 20).addBox(-1.0F, -5.0F, -4.5F, 2.0F, 2.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(26, 14).addBox(3.0F, -5.0F, -4.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(32, 8).addBox(-5.0F, -6.0F, -4.5F, 10.0F, 1.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(0, 7).addBox(-2.0F, -7.0F, -4.5F, 4.0F, 1.0F, 0.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.setTextureOffset(28, 10).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 5.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(0, 14).addBox(-5.0F, -1.0F, -3.0F, 10.0F, 4.0F, 6.0F, 0.0F, false);
			Body.setTextureOffset(39, 19).addBox(-3.0F, 5.0F, -2.0F, 6.0F, 3.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(24, 0).addBox(-4.0F, 8.0F, -2.0F, 8.0F, 4.0F, 4.0F, 0.0F, false);
			Wings = new ModelRenderer(this);
			Wings.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.addChild(Wings);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
			Wings.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.0F, 0.3927F, 0.0F);
			cube_r7.setTextureOffset(0, 31).addBox(-10.3F, 2.5F, 1.4F, 3.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r7.setTextureOffset(18, 31).addBox(-7.3F, 1.5F, 1.4F, 3.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r7.setTextureOffset(6, 6).addBox(-4.3F, 0.5F, 1.4F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r7.setTextureOffset(0, 37).addBox(-3.3F, 3.5F, 1.4F, 1.0F, 3.0F, 0.0F, 0.0F, false);
			cube_r7.setTextureOffset(6, 0).addBox(-4.3F, 1.5F, 1.4F, 1.0F, 6.0F, 0.0F, 0.0F, false);
			cube_r7.setTextureOffset(4, 14).addBox(-5.3F, 2.5F, 1.4F, 1.0F, 6.0F, 0.0F, 0.0F, false);
			cube_r7.setTextureOffset(14, 37).addBox(-7.3F, 2.5F, 1.4F, 2.0F, 7.0F, 0.0F, 0.0F, false);
			cube_r7.setTextureOffset(0, 0).addBox(-10.3F, 3.5F, 1.4F, 3.0F, 7.0F, 0.0F, 0.0F, false);
			cube_r7.setTextureOffset(6, 24).addBox(-11.3F, 3.5F, 1.4F, 1.0F, 6.0F, 0.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
			Wings.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.0F, -0.3927F, 0.0F);
			cube_r8.setTextureOffset(0, 24).addBox(7.3F, 2.5F, 1.4F, 3.0F, 7.0F, 0.0F, 0.0F, false);
			cube_r8.setTextureOffset(32, 23).addBox(4.3F, 1.5F, 1.4F, 3.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r8.setTextureOffset(0, 19).addBox(3.3F, 0.5F, 1.4F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r8.setTextureOffset(2, 37).addBox(2.3F, 3.5F, 1.4F, 1.0F, 3.0F, 0.0F, 0.0F, false);
			cube_r8.setTextureOffset(42, 50).addBox(3.3F, 1.5F, 1.4F, 1.0F, 6.0F, 0.0F, 0.0F, false);
			cube_r8.setTextureOffset(44, 50).addBox(4.3F, 2.5F, 1.4F, 1.0F, 6.0F, 0.0F, 0.0F, false);
			cube_r8.setTextureOffset(40, 37).addBox(5.3F, 2.5F, 1.4F, 2.0F, 7.0F, 0.0F, 0.0F, false);
			cube_r8.setTextureOffset(32, 9).addBox(7.3F, 9.5F, 1.4F, 3.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r8.setTextureOffset(46, 50).addBox(10.3F, 3.5F, 1.4F, 1.0F, 6.0F, 0.0F, 0.0F, false);
			Tail = new ModelRenderer(this);
			Tail.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.addChild(Tail);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
			Tail.addChild(cube_r9);
			setRotationAngle(cube_r9, -0.3927F, 0.0F, 0.0F);
			cube_r9.setTextureOffset(0, 24).addBox(-2.5F, 7.0F, 4.75F, 5.0F, 5.0F, 8.0F, 0.0F, false);
			cube_r9.setTextureOffset(32, 20).addBox(-0.5F, 9.0F, 12.75F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			LeftArm.setTextureOffset(0, 37).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			RightArm.setTextureOffset(26, 31).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
			LeftLeg.setTextureOffset(40, 27).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			LeftLeg.setTextureOffset(28, 47).addBox(-1.0F, 6.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
			LeftLeg.addChild(cube_r10);
			setRotationAngle(cube_r10, -0.3927F, 0.0F, 0.0F);
			cube_r10.setTextureOffset(24, 0).addBox(0.0F, 4.0F, 3.6F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
			RightLeg.setTextureOffset(40, 40).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			RightLeg.setTextureOffset(14, 43).addBox(-2.0F, 6.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
			RightLeg.addChild(cube_r11);
			setRotationAngle(cube_r11, -0.3927F, 0.0F, 0.0F);
			cube_r11.setTextureOffset(26, 31).addBox(-1.0F, 4.0F, 3.6F, 1.0F, 2.0F, 1.0F, 0.0F, false);
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
