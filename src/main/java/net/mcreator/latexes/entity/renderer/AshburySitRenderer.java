package net.mcreator.latexes.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

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

import net.mcreator.latexes.entity.AshburySitEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class AshburySitRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(AshburySitEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelhertx_ashbury_sit_model(), 0.7f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("latex:textures/hertx_ashbury_model.png");
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
			IVertexBuilder ivertexbuilder = bufferIn
					.getBuffer(RenderType.getEyes(new ResourceLocation("latex:textures/hertx_ashbury_model_glow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelhertx_ashbury_sit_model extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer Body;
		private final ModelRenderer booba;
		private final ModelRenderer Body_r1;
		private final ModelRenderer Tail;
		private final ModelRenderer cube_r2;
		private final ModelRenderer bone;
		private final ModelRenderer bone2;
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
		public Modelhertx_ashbury_sit_model() {
			textureWidth = 80;
			textureHeight = 80;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 9.75F, 5.8F);
			Head.setTextureOffset(24, 16).addBox(-3.0F, -1.5768F, -5.0166F, 6.0F, 1.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(14, 57).addBox(-2.0F, -2.5768F, -3.0166F, 4.0F, 1.0F, 5.0F, 0.0F, false);
			Head.setTextureOffset(63, 9).addBox(-2.0F, -6.5768F, 1.9834F, 4.0F, 4.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(54, 9).addBox(-2.0F, -2.5768F, 2.9834F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(19, 8).addBox(-3.0F, -2.5768F, 1.9834F, 6.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(61, 33).addBox(-2.0F, -0.5768F, -1.9166F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			Head.setTextureOffset(20, 32).addBox(2.0F, -6.5768F, 1.9834F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(24, 24).addBox(-3.0F, -6.5768F, 1.9834F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(19, 0).addBox(-3.0F, -6.5768F, -5.0166F, 6.0F, 1.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(52, 31).addBox(2.0F, -5.5768F, -5.0166F, 1.0F, 3.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(55, 50).addBox(2.0F, -2.5768F, -5.0166F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(45, 9).addBox(-3.0F, -5.5768F, -5.0166F, 1.0F, 3.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(54, 12).addBox(-3.0F, -2.5768F, -5.0166F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(20, 16).addBox(-2.0F, -5.5768F, -5.0166F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 11).addBox(-2.0F, -2.5768F, -5.0166F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, -9.35F, -3.75F);
			Head.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.6545F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 16).addBox(-3.125F, 5.4099F, 6.9521F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(21, 63).addBox(-3.125F, 5.4099F, 1.9521F, 1.0F, 3.0F, 5.0F, 0.0F, false);
			cube_r1.setTextureOffset(7, 0).addBox(2.125F, 5.4099F, 6.9521F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(9, 10).addBox(2.125F, 5.4099F, 7.9521F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(19, 5).addBox(-3.125F, 5.4099F, 7.9521F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(9, 63).addBox(2.125F, 5.4099F, 1.9521F, 1.0F, 3.0F, 5.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, -3.25F, 0.0F);
			setRotationAngle(Body, -0.3927F, 0.0F, 0.0F);
			Body.setTextureOffset(0, 32).addBox(-3.5F, 10.0673F, 7.6985F, 7.0F, 5.0F, 3.0F, 0.0F, false);
			Body.setTextureOffset(0, 16).addBox(-4.0F, 9.7185F, 8.5972F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(62, 20).addBox(-3.97F, 18.5985F, 7.5972F, 3.0F, 3.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(41, 57).addBox(-1.625F, 9.5935F, 7.3472F, 3.0F, 2.0F, 5.0F, 0.0F, false);
			booba = new ModelRenderer(this);
			booba.setRotationPoint(0.0F, 3.65F, -0.2F);
			Body.addChild(booba);
			Body_r1 = new ModelRenderer(this);
			Body_r1.setRotationPoint(0.0F, -1.3768F, -1.4416F);
			booba.addChild(Body_r1);
			setRotationAngle(Body_r1, -0.3927F, 0.0F, 0.0F);
			Body_r1.setTextureOffset(32, 8).addBox(-3.5F, 3.6265F, 11.6118F, 7.0F, 5.0F, 3.0F, 0.0F, false);
			Tail = new ModelRenderer(this);
			Tail.setRotationPoint(0.0F, 20.75F, 3.0F);
			setRotationAngle(Tail, 0.7854F, 0.0F, 0.0F);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, -17.8865F, -2.2909F);
			Tail.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(24, 24).addBox(-1.3F, 19.0976F, 20.0755F, 3.0F, 3.0F, 7.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.2F, 11.0418F, 23.0617F);
			cube_r2.addChild(bone);
			setRotationAngle(bone, -0.7854F, 0.0F, 0.0F);
			bone.setTextureOffset(0, 0).addBox(-1.0F, -3.125F, 6.6489F, 2.0F, 8.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(44, 31).addBox(-1.0F, -4.125F, 6.6489F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.2F, 14.2637F, 23.4492F);
			cube_r2.addChild(bone2);
			setRotationAngle(bone2, -1.9635F, 0.0F, 0.0F);
			bone2.setTextureOffset(41, 64).addBox(-1.0F, -9.5817F, 3.5039F, 2.0F, 5.0F, 3.0F, 0.0F, false);
			bone2.setTextureOffset(37, 28).addBox(-1.0F, -10.5817F, 4.5039F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, -17.8865F, -2.2909F);
			Tail.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(0, 0).addBox(-1.3F, 9.704F, 14.0817F, 3.0F, 3.0F, 13.0F, 0.0F, false);
			cube_r3.setTextureOffset(16, 63).addBox(1.7F, 10.704F, 19.0817F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r3.setTextureOffset(28, 46).addBox(3.7F, 10.704F, 21.0817F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r3.setTextureOffset(12, 40).addBox(2.7F, 10.704F, 20.0817F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r3.setTextureOffset(32, 34).addBox(-4.2F, 10.704F, 21.0817F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r3.setTextureOffset(48, 31).addBox(-2.2F, 10.704F, 19.0817F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r3.setTextureOffset(37, 24).addBox(-3.2F, 10.704F, 20.0817F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r3.setTextureOffset(64, 0).addBox(-0.3F, 8.704F, 16.0817F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			cube_r3.setTextureOffset(0, 67).addBox(-0.3F, 7.704F, 17.0817F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r3.setTextureOffset(51, 64).addBox(-0.3F, 6.704F, 18.0817F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r3.setTextureOffset(64, 50).addBox(-0.3F, 5.704F, 19.0817F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(-5.0F, -1.0F, 0.0F);
			setRotationAngle(LeftArm, 0.5236F, 0.0F, 0.0F);
			LeftArm.setTextureOffset(0, 51).addBox(-2.0F, 10.9693F, -3.9049F, 3.0F, 9.0F, 4.0F, 0.0F, false);
			LeftArm.setTextureOffset(46, 46).addBox(-3.0F, 19.9693F, -3.9049F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(5.75F, 0.95F, 0.0F);
			setRotationAngle(RightArm, 0.5236F, 0.0F, 0.0F);
			RightArm.setTextureOffset(32, 46).addBox(-1.75F, 9.1059F, -3.5243F, 3.0F, 9.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(46, 20).addBox(-1.75F, 18.1059F, -3.5243F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(-2.125F, 10.0F, 0.0F);
			setRotationAngle(LeftLeg, -1.7453F, 0.2618F, -0.2618F);
			LeftLeg.setTextureOffset(61, 27).addBox(-4.8871F, -3.866F, 7.9834F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			LeftLeg.setTextureOffset(51, 2).addBox(-4.9071F, 9.6108F, 7.3998F, 4.0F, 2.0F, 5.0F, 0.0F, false);
			LeftLeg.setTextureOffset(19, 11).addBox(-3.4071F, 10.6108F, 6.3998F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(23, 11).addBox(-1.9071F, 10.6108F, 6.3998F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(24, 20).addBox(-4.9071F, 10.6108F, 6.3998F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 2.0F, 0.0F);
			LeftLeg.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.3927F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(57, 58).addBox(-4.8871F, -1.8528F, 11.6109F, 4.0F, 6.0F, 3.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 2.0F, 0.0F);
			LeftLeg.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.7854F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(36, 34).addBox(-4.9621F, 4.6009F, 3.1797F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, 2.0F, 0.0F);
			LeftLeg.addChild(cube_r6);
			setRotationAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(16, 46).addBox(-5.0121F, -8.177F, 5.4675F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			cube_r6.setTextureOffset(19, 0).addBox(-6.0121F, -6.4571F, 6.2991F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(2.0F, 10.0F, 0.0F);
			setRotationAngle(RightLeg, -1.7453F, -0.2618F, 0.2618F);
			RightLeg.setTextureOffset(28, 60).addBox(1.0121F, -3.866F, 7.9834F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			RightLeg.setTextureOffset(38, 0).addBox(1.0421F, 9.6108F, 7.3998F, 4.0F, 2.0F, 5.0F, 0.0F, false);
			RightLeg.setTextureOffset(27, 28).addBox(4.0421F, 10.6108F, 6.3998F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(27, 21).addBox(1.0421F, 10.6108F, 6.3998F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(27, 11).addBox(2.5421F, 10.6108F, 6.3998F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(0.0F, 2.0F, 0.0F);
			RightLeg.addChild(cube_r7);
			setRotationAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
			cube_r7.setTextureOffset(58, 41).addBox(1.0121F, -1.8528F, 11.6109F, 4.0F, 6.0F, 3.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(0.0F, 2.0F, 0.0F);
			RightLeg.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.7854F, 0.0F, 0.0F);
			cube_r8.setTextureOffset(20, 34).addBox(1.0871F, 4.6009F, 3.1797F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(0.0F, 2.0F, 0.0F);
			RightLeg.addChild(cube_r9);
			setRotationAngle(cube_r9, -0.3927F, 0.0F, 0.0F);
			cube_r9.setTextureOffset(0, 40).addBox(1.1371F, -8.177F, 5.4675F, 4.0F, 7.0F, 4.0F, 0.0F, false);
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
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}
}
