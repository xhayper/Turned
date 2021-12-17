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

import net.mcreator.latexes.entity.NXTSitEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class NXTSitRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(NXTSitEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelnxt_hertx_sit_model(), 0.7f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("latex:textures/nxt_hertx_texture.png");
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
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("latex:textures/nxt_hertx_glow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelnxt_hertx_sit_model extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer Jaw;
		private final ModelRenderer bone2;
		private final ModelRenderer bone;
		private final ModelRenderer cube_r1;
		private final ModelRenderer Body;
		private final ModelRenderer Tail;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer LeftLeg_r1;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r4_r1;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r5_r1;
		private final ModelRenderer cube_r6;
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg_r2;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r5_r2;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r6_r1;
		private final ModelRenderer cube_r9;
		public Modelnxt_hertx_sit_model() {
			textureWidth = 128;
			textureHeight = 128;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 9.0F, -1.0F);
			Head.setTextureOffset(46, 33).addBox(-2.0F, -2.65F, -3.2F, 4.0F, 1.0F, 5.0F, 0.0F, false);
			Head.setTextureOffset(58, 12).addBox(-2.0F, -6.65F, 1.8F, 4.0F, 4.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(24, 18).addBox(-2.0F, -2.65F, 2.8F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(62, 64).addBox(-3.0F, -2.65F, 1.8F, 6.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(22, 11).addBox(-3.0F, -0.65F, -3.1F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(20, 14).addBox(-1.5F, 0.35F, -2.85F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(16, 33).addBox(-3.5F, -5.65F, 1.8F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(31, 0).addBox(2.5F, -5.65F, 1.8F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(30, 39).addBox(2.0F, -6.65F, 1.8F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 45).addBox(-3.0F, -6.65F, 1.8F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(31, 0).addBox(-3.0F, -6.65F, -3.2F, 6.0F, 1.0F, 5.0F, 0.0F, false);
			Head.setTextureOffset(10, 50).addBox(2.0F, -5.65F, -4.2F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(34, 48).addBox(-3.0F, -5.65F, -4.2F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(0, 7).addBox(-2.0F, -5.65F, -4.2F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			Jaw = new ModelRenderer(this);
			Jaw.setRotationPoint(0.0F, -14.0F, 2.0F);
			Head.addChild(Jaw);
			Jaw.setTextureOffset(30, 57).addBox(2.0F, 11.45F, -6.2F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			Jaw.setTextureOffset(31, 6).addBox(-2.0F, 11.45F, -6.2F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			Jaw.setTextureOffset(16, 33).addBox(-3.0F, 12.45F, -5.2F, 6.0F, 1.0F, 5.0F, 0.0F, false);
			Jaw.setTextureOffset(0, 56).addBox(-3.0F, 11.45F, -6.2F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 29.0F, -2.0F);
			Jaw.addChild(bone2);
			setRotationAngle(bone2, -0.7854F, 0.0F, 0.0F);
			bone2.setTextureOffset(33, 33).addBox(-3.0F, -9.7328F, -14.2583F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(36, 46).addBox(-3.0F, -9.7328F, -14.6725F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 15.0F, 0.0F);
			Head.addChild(bone);
			setRotationAngle(bone, 0.7854F, 0.0F, 0.0F);
			bone.setTextureOffset(38, 59).addBox(-3.0F, -17.5716F, 11.6319F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(58, 46).addBox(-3.0F, -17.5716F, 12.0461F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, -8.6F, -0.2F);
			Head.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(33, 35).addBox(-2.9F, 2.5831F, 6.5717F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(9, 59).addBox(-2.9F, 2.5831F, 1.5717F, 1.0F, 3.0F, 5.0F, 0.0F, false);
			cube_r1.setTextureOffset(12, 30).addBox(1.9F, 2.5831F, 6.5717F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 30).addBox(-3.4F, 3.9354F, 5.2094F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 14).addBox(2.4F, 3.9354F, 5.2094F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(58, 48).addBox(1.9F, 2.5831F, 1.5717F, 1.0F, 3.0F, 5.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 63).addBox(-3.4F, 3.9354F, 1.2094F, 1.0F, 3.0F, 4.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 0).addBox(2.4F, 3.9354F, 1.2094F, 1.0F, 3.0F, 4.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 9.0F, -1.0F);
			setRotationAngle(Body, 0.1745F, 0.0F, 0.0F);
			Body.setTextureOffset(0, 14).addBox(-4.0F, -0.0614F, -2.1302F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(59, 30).addBox(-3.0F, 0.9386F, -3.1302F, 6.0F, 5.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(48, 0).addBox(-4.0F, 0.9386F, 1.8698F, 8.0F, 4.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(6, 0).addBox(3.0F, 0.9386F, -3.1302F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(0, 0).addBox(-4.0F, 0.9386F, -3.1302F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(50, 61).addBox(3.0F, -1.0614F, -2.6302F, 1.0F, 2.0F, 5.0F, 0.0F, false);
			Body.setTextureOffset(21, 61).addBox(-4.0F, -1.0614F, -2.6302F, 1.0F, 2.0F, 5.0F, 0.0F, false);
			Body.setTextureOffset(24, 39).addBox(-1.0F, 1.9386F, -3.3802F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(0, 56).addBox(-2.5F, 5.9386F, -3.1302F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(42, 18).addBox(0.5F, 5.9386F, -3.1302F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Tail = new ModelRenderer(this);
			Tail.setRotationPoint(0.0F, 19.625F, 0.0F);
			setRotationAngle(Tail, 0.5236F, 0.0F, 0.0F);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(0.0F, -17.5263F, 5.5F);
			Tail.addChild(cube_r10);
			setRotationAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
			cube_r10.setTextureOffset(17, 0).addBox(-1.3F, 26.1445F, 11.7379F, 3.0F, 3.0F, 8.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, -17.5263F, 5.5F);
			Tail.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(16, 22).addBox(-1.3F, 21.2659F, 11.9581F, 3.0F, 3.0F, 8.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, -17.5263F, 5.5F);
			Tail.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(0, 0).addBox(-1.3F, 14.8425F, 9.334F, 3.0F, 3.0F, 11.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(-5.0F, 12.0F, -1.0F);
			setRotationAngle(LeftArm, -0.7854F, 0.0F, 0.0F);
			LeftArm.setTextureOffset(30, 18).addBox(-3.0F, -2.2697F, -2.8839F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			LeftArm.setTextureOffset(20, 55).addBox(-3.0F, 5.7303F, -2.8839F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			LeftArm.setTextureOffset(17, 0).addBox(-3.25F, 5.7303F, -2.8839F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			LeftArm.setTextureOffset(46, 16).addBox(-3.0F, 7.7303F, -2.8839F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			LeftArm.setTextureOffset(18, 54).addBox(-3.0F, 11.7303F, 0.1161F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(52, 5).addBox(-3.0F, 11.7303F, -1.3839F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(6, 42).addBox(0.0F, 11.7303F, -2.8839F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			LeftArm.setTextureOffset(18, 52).addBox(-3.0F, 11.7303F, -2.8839F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(5.0F, 12.0F, -1.0F);
			setRotationAngle(RightArm, -0.7854F, 0.0F, 0.0F);
			RightArm.setTextureOffset(0, 30).addBox(-1.0F, -2.2697F, -2.4697F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(54, 24).addBox(-1.0F, 5.7303F, -2.4697F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(24, 46).addBox(-1.0F, 7.7303F, -2.4697F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 42).addBox(-1.0F, 11.7303F, -2.4697F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			RightArm.setTextureOffset(18, 50).addBox(1.0F, 11.7303F, -2.4697F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(42, 48).addBox(1.0F, 11.7303F, -0.9697F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(28, 44).addBox(1.0F, 11.7303F, 0.5303F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(17, 4).addBox(2.25F, 5.7303F, -1.4697F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(-2.0F, 22.0F, 1.0F);
			setRotationAngle(LeftLeg, -1.8326F, 0.0F, -1.5708F);
			LeftLeg.setTextureOffset(44, 53).addBox(-1.75F, -0.8F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			LeftLeg_r1 = new ModelRenderer(this);
			LeftLeg_r1.setRotationPoint(14.0F, 13.7095F, 3.6236F);
			LeftLeg.addChild(LeftLeg_r1);
			setRotationAngle(LeftLeg_r1, 1.5708F, 0.0F, 0.0F);
			LeftLeg_r1.setTextureOffset(45, 45).addBox(-15.75F, -3.0F, -3.4102F, 4.0F, 3.0F, 5.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(12.0F, 2.0F, 0.0F);
			LeftLeg.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.3927F, 0.0F, 0.0F);
			cube_r4_r1 = new ModelRenderer(this);
			cube_r4_r1.setRotationPoint(2.0F, 13.9626F, 8.9204F);
			cube_r4.addChild(cube_r4_r1);
			setRotationAngle(cube_r4_r1, 1.5708F, 0.0F, 0.0F);
			cube_r4_r1.setTextureOffset(41, 61).addBox(-15.75F, -3.7F, 3.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);
			cube_r4_r1.setTextureOffset(62, 36).addBox(-15.75F, -4.7F, 3.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r4_r1.setTextureOffset(57, 57).addBox(-15.75F, -8.7F, 3.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(12.0F, 2.0F, 0.0F);
			LeftLeg.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.7854F, 0.0F, 0.0F);
			cube_r5_r1 = new ModelRenderer(this);
			cube_r5_r1.setRotationPoint(2.0F, -0.0927F, 1.6082F);
			cube_r5.addChild(cube_r5_r1);
			setRotationAngle(cube_r5_r1, -0.7854F, 0.0F, 0.0F);
			cube_r5_r1.setTextureOffset(12, 39).addBox(-15.75F, 4.4152F, -5.0633F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(12.0F, 2.0F, 0.0F);
			LeftLeg.addChild(cube_r6);
			setRotationAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(0, 46).addBox(-13.75F, -1.5045F, -2.4584F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(2.0F, 22.0F, 1.0F);
			setRotationAngle(RightLeg, -1.8326F, 0.0F, 1.5708F);
			RightLeg.setTextureOffset(44, 53).addBox(-2.25F, -0.8F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, true);
			LeftLeg_r2 = new ModelRenderer(this);
			LeftLeg_r2.setRotationPoint(-14.0F, 13.7095F, 3.6236F);
			RightLeg.addChild(LeftLeg_r2);
			setRotationAngle(LeftLeg_r2, 1.5708F, 0.0F, 0.0F);
			LeftLeg_r2.setTextureOffset(45, 45).addBox(11.75F, -3.0F, -3.4102F, 4.0F, 3.0F, 5.0F, 0.0F, true);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(-12.0F, 2.0F, 0.0F);
			RightLeg.addChild(cube_r7);
			setRotationAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
			cube_r5_r2 = new ModelRenderer(this);
			cube_r5_r2.setRotationPoint(-2.0F, 13.9626F, 8.9204F);
			cube_r7.addChild(cube_r5_r2);
			setRotationAngle(cube_r5_r2, 1.5708F, 0.0F, 0.0F);
			cube_r5_r2.setTextureOffset(41, 61).addBox(11.75F, -3.7F, 3.0F, 4.0F, 2.0F, 3.0F, 0.0F, true);
			cube_r5_r2.setTextureOffset(62, 36).addBox(11.75F, -4.7F, 3.0F, 4.0F, 1.0F, 3.0F, 0.0F, true);
			cube_r5_r2.setTextureOffset(57, 57).addBox(11.75F, -8.7F, 3.0F, 4.0F, 4.0F, 3.0F, 0.0F, true);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(-12.0F, 2.0F, 0.0F);
			RightLeg.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.7854F, 0.0F, 0.0F);
			cube_r6_r1 = new ModelRenderer(this);
			cube_r6_r1.setRotationPoint(-2.0F, -0.0927F, 1.6082F);
			cube_r8.addChild(cube_r6_r1);
			setRotationAngle(cube_r6_r1, -0.7854F, 0.0F, 0.0F);
			cube_r6_r1.setTextureOffset(12, 39).addBox(11.75F, 4.4152F, -5.0633F, 4.0F, 7.0F, 4.0F, 0.0F, true);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(-12.0F, 2.0F, 0.0F);
			RightLeg.addChild(cube_r9);
			setRotationAngle(cube_r9, -0.3927F, 0.0F, 0.0F);
			cube_r9.setTextureOffset(0, 46).addBox(9.75F, -1.5045F, -2.4584F, 4.0F, 6.0F, 4.0F, 0.0F, true);
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
