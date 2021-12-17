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

import net.mcreator.latexes.entity.AshburyHertxEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class AshburyHertxRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(AshburyHertxEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelhertx_ashbury_model(), 0.6f) {
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
	public static class Modelhertx_ashbury_model extends EntityModel<Entity> {
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
		public Modelhertx_ashbury_model() {
			textureWidth = 80;
			textureHeight = 80;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, -3.25F, -0.2F);
			Head.setTextureOffset(24, 16).addBox(-3.0F, -1.8268F, -5.0166F, 6.0F, 1.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(14, 57).addBox(-2.0F, -2.8268F, -3.0166F, 4.0F, 1.0F, 5.0F, 0.0F, false);
			Head.setTextureOffset(63, 9).addBox(-2.0F, -6.8268F, 1.9834F, 4.0F, 4.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(54, 9).addBox(-2.0F, -2.8268F, 2.9834F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(19, 8).addBox(-3.0F, -2.8268F, 1.9834F, 6.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(61, 33).addBox(-2.0F, -0.8268F, -1.9166F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			Head.setTextureOffset(20, 32).addBox(2.0F, -6.8268F, 1.9834F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(24, 24).addBox(-3.0F, -6.8268F, 1.9834F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(19, 0).addBox(-3.0F, -6.8268F, -5.0166F, 6.0F, 1.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(52, 31).addBox(2.0F, -5.8268F, -5.0166F, 1.0F, 3.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(55, 50).addBox(2.0F, -2.8268F, -5.0166F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(45, 9).addBox(-3.0F, -5.8268F, -5.0166F, 1.0F, 3.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(54, 12).addBox(-3.0F, -2.8268F, -5.0166F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(20, 16).addBox(-2.0F, -5.8268F, -5.0166F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 11).addBox(-2.0F, -2.8268F, -5.0166F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 3.65F, 2.25F);
			Head.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.6545F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 16).addBox(-3.125F, -8.7546F, 10.2581F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(21, 63).addBox(-3.125F, -8.7546F, 5.2581F, 1.0F, 3.0F, 5.0F, 0.0F, false);
			cube_r1.setTextureOffset(7, 0).addBox(2.125F, -8.7546F, 10.2581F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(9, 10).addBox(2.125F, -8.7546F, 11.2581F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(19, 5).addBox(-3.125F, -8.7546F, 11.2581F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(9, 63).addBox(2.125F, -8.7546F, 5.2581F, 1.0F, 3.0F, 5.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, -3.25F, 0.0F);
			Body.setTextureOffset(0, 32).addBox(-3.5F, 0.122F, -2.9153F, 7.0F, 5.0F, 3.0F, 0.0F, false);
			Body.setTextureOffset(0, 16).addBox(-4.0F, -0.2268F, -2.0166F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(62, 20).addBox(-3.97F, 8.6532F, -3.0166F, 3.0F, 3.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(41, 57).addBox(-1.625F, -0.3518F, -3.2666F, 3.0F, 2.0F, 5.0F, 0.0F, false);
			booba = new ModelRenderer(this);
			booba.setRotationPoint(0.0F, 3.65F, -0.2F);
			Body.addChild(booba);
			Body_r1 = new ModelRenderer(this);
			Body_r1.setRotationPoint(0.0F, -1.3768F, -1.4416F);
			booba.addChild(Body_r1);
			setRotationAngle(Body_r1, -0.3927F, 0.0F, 0.0F);
			Body_r1.setTextureOffset(32, 8).addBox(-3.5F, -1.5F, -2.0F, 7.0F, 5.0F, 3.0F, 0.0F, false);
			Tail = new ModelRenderer(this);
			Tail.setRotationPoint(0.0F, -3.25F, 0.0F);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 3.25F, 0.0F);
			Tail.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(24, 24).addBox(-1.3F, 9.7598F, 14.9821F, 3.0F, 3.0F, 7.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.2F, 11.0418F, 23.0617F);
			cube_r2.addChild(bone);
			setRotationAngle(bone, -0.7854F, 0.0F, 0.0F);
			bone.setTextureOffset(0, 0).addBox(-1.0F, -6.1263F, -3.5555F, 2.0F, 8.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(44, 31).addBox(-1.0F, -7.1263F, -3.5555F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.2F, 14.2637F, 23.4492F);
			cube_r2.addChild(bone2);
			setRotationAngle(bone2, -1.9635F, 0.0F, 0.0F);
			bone2.setTextureOffset(41, 64).addBox(-1.0F, -1.3026F, -3.1739F, 2.0F, 5.0F, 3.0F, 0.0F, false);
			bone2.setTextureOffset(37, 28).addBox(-1.0F, -2.3026F, -2.1739F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 3.25F, 0.0F);
			Tail.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(0, 0).addBox(-1.3F, 3.0261F, 5.8026F, 3.0F, 3.0F, 13.0F, 0.0F, false);
			cube_r3.setTextureOffset(16, 63).addBox(1.7F, 4.0261F, 10.8026F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r3.setTextureOffset(28, 46).addBox(3.7F, 4.0261F, 12.8026F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r3.setTextureOffset(12, 40).addBox(2.7F, 4.0261F, 11.8026F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r3.setTextureOffset(32, 34).addBox(-4.2F, 4.0261F, 12.8026F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r3.setTextureOffset(48, 31).addBox(-2.2F, 4.0261F, 10.8026F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r3.setTextureOffset(37, 24).addBox(-3.2F, 4.0261F, 11.8026F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r3.setTextureOffset(64, 0).addBox(-0.3F, 2.0261F, 7.8026F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			cube_r3.setTextureOffset(0, 67).addBox(-0.3F, 1.0261F, 8.8026F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r3.setTextureOffset(51, 64).addBox(-0.3F, 0.0261F, 9.8026F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r3.setTextureOffset(64, 50).addBox(-0.3F, -0.9739F, 10.8026F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(-5.0F, -1.0F, 0.0F);
			LeftArm.setTextureOffset(0, 51).addBox(-2.0F, -2.4768F, -2.0166F, 3.0F, 9.0F, 4.0F, 0.0F, false);
			LeftArm.setTextureOffset(46, 46).addBox(-3.0F, 6.5232F, -2.0166F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(5.75F, -1.05F, 0.0F);
			RightArm.setTextureOffset(32, 46).addBox(-1.75F, -2.4268F, -2.0166F, 3.0F, 9.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(46, 20).addBox(-1.75F, 6.5732F, -2.0166F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(-2.125F, 10.0F, 0.0F);
			LeftLeg.setTextureOffset(61, 27).addBox(-1.875F, -1.4768F, -2.0166F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			LeftLeg.setTextureOffset(51, 2).addBox(-1.895F, 12.0F, -2.6002F, 4.0F, 2.0F, 5.0F, 0.0F, false);
			LeftLeg.setTextureOffset(19, 11).addBox(-0.395F, 13.0F, -3.6002F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(23, 11).addBox(1.105F, 13.0F, -3.6002F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg.setTextureOffset(24, 20).addBox(-1.895F, 13.0F, -3.6002F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 2.0F, 0.0F);
			LeftLeg.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.3927F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(57, 58).addBox(-1.875F, 4.1814F, 3.2864F, 4.0F, 6.0F, 3.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 2.0F, 0.0F);
			LeftLeg.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.7854F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(36, 34).addBox(-1.95F, -0.7808F, -5.5808F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, 2.0F, 0.0F);
			LeftLeg.addChild(cube_r6);
			setRotationAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(16, 46).addBox(-2.0F, -2.1428F, -2.857F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			cube_r6.setTextureOffset(19, 0).addBox(-3.0F, -0.4229F, -2.0254F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(2.0F, 10.0F, 0.0F);
			RightLeg.setTextureOffset(28, 60).addBox(-2.0F, -1.4768F, -2.0166F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			RightLeg.setTextureOffset(38, 0).addBox(-1.97F, 12.0F, -2.6002F, 4.0F, 2.0F, 5.0F, 0.0F, false);
			RightLeg.setTextureOffset(27, 28).addBox(1.03F, 13.0F, -3.6002F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(27, 21).addBox(-1.97F, 13.0F, -3.6002F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightLeg.setTextureOffset(27, 11).addBox(-0.47F, 13.0F, -3.6002F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(0.0F, 2.0F, 0.0F);
			RightLeg.addChild(cube_r7);
			setRotationAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
			cube_r7.setTextureOffset(58, 41).addBox(-2.0F, 4.1814F, 3.2864F, 4.0F, 6.0F, 3.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(0.0F, 2.0F, 0.0F);
			RightLeg.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.7854F, 0.0F, 0.0F);
			cube_r8.setTextureOffset(20, 34).addBox(-1.925F, -0.7808F, -5.5808F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(0.0F, 2.0F, 0.0F);
			RightLeg.addChild(cube_r9);
			setRotationAngle(cube_r9, -0.3927F, 0.0F, 0.0F);
			cube_r9.setTextureOffset(0, 40).addBox(-1.875F, -2.1428F, -2.857F, 4.0F, 7.0F, 4.0F, 0.0F, false);
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
			this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
