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

import net.mcreator.latexes.entity.HertxSitEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class HertxSitRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(HertxSitEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelhertx_model_sit(), 0.7f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("latex:textures/hertx_texture.png");
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
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("latex:textures/hertx_glow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelhertx_model_sit extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer Body;
		private final ModelRenderer Tail;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer RightLeg;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;
		public Modelhertx_model_sit() {
			textureWidth = 128;
			textureHeight = 128;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.4F, -0.2F);
			Head.setTextureOffset(24, 24).addBox(-3.0F, 5.3F, -5.0F, 6.0F, 1.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(18, 54).addBox(-2.0F, 4.2F, -3.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
			Head.setTextureOffset(0, 60).addBox(-2.0F, 0.2F, 2.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(20, 16).addBox(-2.0F, 4.2F, 3.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(19, 8).addBox(-3.0F, 4.2F, 2.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(24, 16).addBox(-3.0F, 6.2F, -2.9F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(7, 0).addBox(2.0F, 0.2F, 2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-3.0F, 0.2F, 2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(19, 0).addBox(-3.0F, 0.2F, -5.0F, 6.0F, 1.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(50, 8).addBox(2.0F, 1.2F, -5.0F, 1.0F, 3.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(32, 8).addBox(2.0F, 4.3F, -5.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(48, 29).addBox(-3.0F, 1.2F, -5.0F, 1.0F, 3.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(57, 57).addBox(-3.0F, 4.3F, -5.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(0, 8).addBox(-2.0F, 1.2F, -5.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(13, 32).addBox(-2.0F, 4.3F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(19, 0).addBox(-3.0F, 1.2791F, 6.9211F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 0).addBox(-3.0F, 1.2791F, 1.9211F, 1.0F, 3.0F, 5.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 16).addBox(2.0F, 1.2791F, 6.9211F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(14, 60).addBox(2.0F, 1.2791F, 1.9211F, 1.0F, 3.0F, 5.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.setTextureOffset(0, 16).addBox(-4.0F, 7.2F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(52, 39).addBox(-4.0F, 7.2F, -3.0F, 8.0F, 6.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(19, 11).addBox(-3.0F, 13.2F, -3.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			Tail = new ModelRenderer(this);
			Tail.setRotationPoint(0.0F, 11.0F, 0.0F);
			setRotationAngle(Tail, 0.6109F, 0.0F, 0.0F);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, -10.0F, 0.0F);
			Tail.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(0, 32).addBox(-1.3F, 20.0893F, 13.6912F, 3.0F, 3.0F, 7.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, -10.0F, 0.0F);
			Tail.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(0, 0).addBox(-1.3F, 13.0633F, 8.5628F, 3.0F, 3.0F, 13.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(-5.0F, 9.0F, 0.0F);
			setRotationAngle(LeftArm, 0.2618F, 0.0F, 0.2618F);
			LeftArm.setTextureOffset(36, 36).addBox(-2.1472F, -1.4133F, -2.0884F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			LeftArm.setTextureOffset(16, 44).addBox(-2.1472F, 6.5867F, -2.0884F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			LeftArm.setTextureOffset(24, 26).addBox(-2.1472F, 12.5867F, 0.9116F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(24, 19).addBox(-2.1472F, 12.5867F, -2.0884F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(22, 4).addBox(-0.1472F, 12.5867F, -2.0884F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(24, 24).addBox(-2.1472F, 12.5867F, -0.5884F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(5.0F, 9.0F, 0.0F);
			setRotationAngle(RightArm, 0.2618F, 0.0F, -0.2618F);
			RightArm.setTextureOffset(20, 32).addBox(-1.6769F, -1.2771F, -2.125F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(44, 19).addBox(-1.6769F, 6.7229F, -2.125F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(22, 2).addBox(-0.6769F, 12.7229F, -2.125F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(19, 3).addBox(1.3231F, 12.7229F, 0.875F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(9, 11).addBox(1.3231F, 12.7229F, -0.625F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(19, 5).addBox(1.3231F, 12.7229F, -2.125F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(-2.0F, 20.0F, 0.0F);
			setRotationAngle(LeftLeg, -1.7802F, 0.2094F, 0.0524F);
			LeftLeg.setTextureOffset(59, 7).addBox(-1.9299F, -2.4753F, -0.66F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 53).addBox(-1.9299F, 9.3247F, -1.5702F, 4.0F, 2.0F, 5.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-0.3906F, 1.2891F, -7.4309F);
			LeftLeg.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.3927F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(57, 26).addBox(-1.5393F, -0.8714F, 10.3515F, 4.0F, 6.0F, 3.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-0.3906F, 1.2891F, -7.4309F);
			LeftLeg.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.7854F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(41, 4).addBox(-1.5393F, 4.8129F, 1.791F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(-0.3906F, 1.2891F, -7.4309F);
			LeftLeg.addChild(cube_r6);
			setRotationAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(32, 48).addBox(-1.5393F, -5.7714F, 5.1515F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(2.0F, 20.0F, 0.0F);
			setRotationAngle(RightLeg, -1.7802F, -0.2094F, 0.0524F);
			RightLeg.setTextureOffset(47, 58).addBox(-1.9492F, -1.9973F, -1.021F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			RightLeg.setTextureOffset(53, 0).addBox(-1.9492F, 9.8027F, -1.9312F, 4.0F, 2.0F, 5.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(-0.4099F, 1.5755F, -7.8326F);
			RightLeg.addChild(cube_r7);
			setRotationAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
			cube_r7.setTextureOffset(33, 58).addBox(-1.5393F, -0.71F, 10.4624F, 4.0F, 6.0F, 3.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(-0.4099F, 1.5755F, -7.8326F);
			RightLeg.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.7854F, 0.0F, 0.0F);
			cube_r8.setTextureOffset(0, 42).addBox(-1.5393F, 4.9772F, 1.6843F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(-0.4099F, 1.5755F, -7.8326F);
			RightLeg.addChild(cube_r9);
			setRotationAngle(cube_r9, -0.3927F, 0.0F, 0.0F);
			cube_r9.setTextureOffset(48, 48).addBox(-1.5393F, -5.61F, 5.2624F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			Body.render(matrixStack, buffer, packedLight, packedOverlay);
			Tail.render(matrixStack, buffer, packedLight, packedOverlay);
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
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
