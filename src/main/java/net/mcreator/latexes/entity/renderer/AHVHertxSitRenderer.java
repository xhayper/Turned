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

import net.mcreator.latexes.entity.AHVHertxSitEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class AHVHertxSitRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(AHVHertxSitEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelAHV_hertx_sit_model(), 0.7f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("latex:textures/ahv_texture.png");
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
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("latex:textures/ahv_glow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelAHV_hertx_sit_model extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer Body;
		private final ModelRenderer Tail;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r10_r1;
		private final ModelRenderer uppertailjaw;
		private final ModelRenderer uppertailjaw_r1;
		private final ModelRenderer lowertailjaw;
		private final ModelRenderer lowertailjaw_r1;
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
		public ModelAHV_hertx_sit_model() {
			textureWidth = 128;
			textureHeight = 128;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 8.0F, 0.0F);
			Head.setTextureOffset(21, 8).addBox(-3.0F, -2.3F, -5.2F, 6.0F, 1.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(56, 43).addBox(-2.0F, -3.4F, -3.2F, 4.0F, 1.0F, 5.0F, 0.0F, false);
			Head.setTextureOffset(16, 66).addBox(-2.0F, -7.4F, 1.8F, 4.0F, 4.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(38, 0).addBox(-2.0F, -3.4F, 2.8F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(30, 59).addBox(-3.0F, -3.4F, 1.8F, 6.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(24, 16).addBox(-3.0F, -1.4F, -3.1F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(3, 4).addBox(2.0F, -7.4F, 1.8F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-3.0F, -7.4F, 1.8F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(19, 0).addBox(-3.0F, -7.4F, -5.2F, 6.0F, 1.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(50, 22).addBox(2.0F, -6.4F, -5.2F, 1.0F, 3.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(55, 5).addBox(2.0F, -3.3F, -5.2F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(41, 29).addBox(-3.0F, -6.4F, -5.2F, 1.0F, 3.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(53, 53).addBox(-3.0F, -3.3F, -5.2F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(32, 38).addBox(-2.0F, -6.4F, -5.2F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(20, 16).addBox(-2.0F, -3.3F, -5.2F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, -7.6F, -0.2F);
			Head.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 14).addBox(-3.0F, 1.2791F, 6.9211F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(69, 39).addBox(-3.0F, 1.2791F, 1.9211F, 1.0F, 3.0F, 5.0F, 0.0F, false);
			cube_r1.setTextureOffset(4, 0).addBox(2.0F, 1.2791F, 6.9211F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(46, 65).addBox(2.0F, 1.2791F, 1.9211F, 1.0F, 3.0F, 5.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 8.0F, 0.0F);
			Body.setTextureOffset(0, 14).addBox(-4.0F, -0.8F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(0, 58).addBox(-4.0F, -0.8F, -3.0F, 8.0F, 6.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(43, 23).addBox(-3.0F, -0.8F, -3.3F, 6.0F, 5.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(66, 28).addBox(-3.0F, 5.2F, -2.6F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			Tail = new ModelRenderer(this);
			Tail.setRotationPoint(0.0F, 19.0F, 1.0F);
			setRotationAngle(Tail, 0.0F, -0.5672F, 0.0F);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.5F, -18.0F, -4.0F);
			Tail.addChild(cube_r2);
			cube_r2.setTextureOffset(17, 36).addBox(-2.3F, 15.7384F, 3.3388F, 4.0F, 4.0F, 7.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.5F, -18.0F, -4.0F);
			Tail.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.7854F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(0, 0).addBox(-2.8F, 16.2678F, -6.6465F, 5.0F, 5.0F, 9.0F, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(5.5F, -18.0F, -2.0F);
			Tail.addChild(cube_r10);
			setRotationAngle(cube_r10, 1.5708F, -0.3927F, 0.0F);
			cube_r10.setTextureOffset(24, 24).addBox(-3.8F, 9.7028F, -13.3744F, 7.0F, 7.0F, 5.0F, 0.0F, false);
			cube_r10_r1 = new ModelRenderer(this);
			cube_r10_r1.setRotationPoint(-1.6967F, 14.025F, 3.7962F);
			cube_r10.addChild(cube_r10_r1);
			setRotationAngle(cube_r10_r1, 0.0F, 0.0F, 1.9635F);
			cube_r10_r1.setTextureOffset(57, 39).addBox(-4.3222F, -2.8968F, -7.1705F, 7.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r10_r1.setTextureOffset(0, 30).addBox(-4.3222F, -4.8968F, -12.1705F, 7.0F, 4.0F, 5.0F, 0.0F, false);
			uppertailjaw = new ModelRenderer(this);
			uppertailjaw.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r10.addChild(uppertailjaw);
			uppertailjaw_r1 = new ModelRenderer(this);
			uppertailjaw_r1.setRotationPoint(-1.6967F, -9.975F, 3.7962F);
			uppertailjaw.addChild(uppertailjaw_r1);
			setRotationAngle(uppertailjaw_r1, 0.0F, 0.0F, 1.9635F);
			uppertailjaw_r1.setTextureOffset(39, 39).addBox(-4.3222F, -0.8968F, -10.1705F, 7.0F, 5.0F, 4.0F, 0.0F, false);
			lowertailjaw = new ModelRenderer(this);
			lowertailjaw.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r10.addChild(lowertailjaw);
			setRotationAngle(lowertailjaw, -0.1309F, 0.0F, 0.0F);
			lowertailjaw_r1 = new ModelRenderer(this);
			lowertailjaw_r1.setRotationPoint(-1.6967F, -10.3852F, 2.4617F);
			lowertailjaw.addChild(lowertailjaw_r1);
			setRotationAngle(lowertailjaw_r1, -0.1812F, -0.1209F, 1.9665F);
			lowertailjaw_r1.setTextureOffset(57, 32).addBox(-4.3222F, 0.4384F, -12.2007F, 7.0F, 5.0F, 2.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(-5.0F, 9.0F, 0.0F);
			setRotationAngle(LeftArm, -0.3914F, 0.0334F, 0.0807F);
			LeftArm.setTextureOffset(45, 0).addBox(-2.8393F, -1.9591F, -1.2349F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			LeftArm.setTextureOffset(59, 22).addBox(-2.8393F, 9.0409F, -1.2349F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			LeftArm.setTextureOffset(40, 58).addBox(-2.8393F, 6.0409F, -1.2349F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			LeftArm.setTextureOffset(22, 1).addBox(-2.8393F, 12.0409F, -1.2349F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(19, 4).addBox(-0.8393F, 12.0409F, -1.2349F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(62, 55).addBox(-2.8393F, 11.0409F, -1.2349F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			LeftArm.setTextureOffset(19, 2).addBox(-2.8393F, 12.0409F, 0.2651F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(19, 0).addBox(-2.8393F, 12.0409F, 1.7651F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(5.0F, 9.0F, 0.0F);
			setRotationAngle(RightArm, -0.3914F, -0.0334F, -0.0807F);
			RightArm.setTextureOffset(0, 39).addBox(-1.1607F, -1.9591F, -1.2349F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(66, 66).addBox(-1.1607F, 11.0409F, -1.2349F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(18, 59).addBox(-1.1607F, 6.0409F, -1.2349F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(62, 49).addBox(-1.1607F, 9.0409F, -1.2349F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(24, 18).addBox(-0.1607F, 12.0409F, -1.2349F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(24, 24).addBox(1.8393F, 12.0409F, -1.2349F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(22, 5).addBox(1.8393F, 12.0409F, 0.2651F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(22, 3).addBox(1.8393F, 12.0409F, 1.7651F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(-2.0F, 20.0F, 0.0F);
			setRotationAngle(LeftLeg, -1.8762F, 0.0873F, -0.2618F);
			LeftLeg.setTextureOffset(30, 65).addBox(-2.2578F, -2.0692F, -1.0721F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 65).addBox(-2.2578F, 9.7308F, -1.4823F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(2.0627F, 2.1513F, -7.4241F);
			LeftLeg.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.3927F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(59, 13).addBox(-4.3205F, -1.1325F, 9.79F, 4.0F, 6.0F, 3.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(2.0627F, 2.1513F, -7.4241F);
			LeftLeg.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.7854F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(28, 48).addBox(-4.3205F, 4.1942F, 1.8173F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(2.0627F, 2.1513F, -7.4241F);
			LeftLeg.addChild(cube_r6);
			setRotationAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(44, 48).addBox(-4.3205F, -6.0325F, 4.59F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(2.0F, 20.0F, 0.0F);
			setRotationAngle(RightLeg, -1.8762F, -0.0873F, 0.2618F);
			RightLeg.setTextureOffset(64, 6).addBox(-1.7422F, -2.0692F, -1.0721F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			RightLeg.setTextureOffset(64, 0).addBox(-1.7422F, 9.7308F, -1.4823F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(-2.0627F, 2.1513F, -7.4241F);
			RightLeg.addChild(cube_r7);
			setRotationAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
			cube_r7.setTextureOffset(56, 61).addBox(0.3205F, -1.1325F, 9.79F, 4.0F, 6.0F, 3.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(-2.0627F, 2.1513F, -7.4241F);
			RightLeg.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.7854F, 0.0F, 0.0F);
			cube_r8.setTextureOffset(12, 47).addBox(0.3205F, 4.1942F, 1.8173F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(-2.0627F, 2.1513F, -7.4241F);
			RightLeg.addChild(cube_r9);
			setRotationAngle(cube_r9, -0.3927F, 0.0F, 0.0F);
			cube_r9.setTextureOffset(43, 12).addBox(0.3205F, -6.0325F, 4.59F, 4.0F, 6.0F, 4.0F, 0.0F, false);
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
