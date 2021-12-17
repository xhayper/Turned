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

import net.mcreator.latexes.entity.HertxFSitEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class HertxFSitRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(HertxFSitEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelhertx_sit_model_f(), 0.7f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("latex:textures/hertx_variant_f_texture.png");
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
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("latex:textures/hertx_variant_f_glow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelhertx_sit_model_f extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer Body;
		private final ModelRenderer bone;
		private final ModelRenderer Tail;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer LeftLeg_r1;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer RightLeg;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;
		public Modelhertx_sit_model_f() {
			textureWidth = 128;
			textureHeight = 128;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 1.4F, 3.8F);
			Head.setTextureOffset(24, 16).addBox(-3.0F, 5.3F, -4.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(19, 7).addBox(-2.0F, 4.2F, -3.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
			Head.setTextureOffset(61, 47).addBox(-2.0F, 0.2F, 2.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(20, 16).addBox(-2.0F, 4.2F, 3.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(37, 0).addBox(-3.0F, 4.2F, 2.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(24, 24).addBox(-3.0F, 6.2F, -2.9F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(7, 0).addBox(2.0F, 0.2F, 2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-3.0F, 0.2F, 2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(19, 0).addBox(-3.0F, 0.2F, -4.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(24, 57).addBox(2.0F, 1.2F, -4.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(0, 60).addBox(2.0F, 4.3F, -4.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(55, 55).addBox(-3.0F, 1.2F, -4.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(59, 40).addBox(-3.0F, 4.3F, -4.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(0, 8).addBox(-2.0F, 1.2F, -4.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(12, 32).addBox(-2.0F, 4.3F, -4.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(24, 24).addBox(-3.0625F, 1.2791F, 7.9211F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 16).addBox(-3.25F, 2.5749F, 6.4445F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(54, 23).addBox(-3.0625F, 1.2791F, 1.9211F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 0).addBox(-3.25F, 2.5749F, 1.4445F, 1.0F, 3.0F, 5.0F, 0.0F, false);
			cube_r1.setTextureOffset(19, 7).addBox(2.0625F, 1.2791F, 7.9211F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(19, 2).addBox(2.25F, 2.6072F, 6.5652F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(35, 51).addBox(2.0625F, 1.2791F, 1.9211F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			cube_r1.setTextureOffset(62, 18).addBox(2.25F, 2.6072F, 1.5652F, 1.0F, 3.0F, 5.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 1.0F, 4.0F);
			setRotationAngle(Body, -0.3927F, 0.0F, 0.0F);
			Body.setTextureOffset(0, 16).addBox(-4.0F, 6.5149F, 1.4442F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(32, 14).addBox(-3.0F, 12.3274F, 0.9442F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(19, 0).addBox(-1.0F, 7.3274F, 0.9442F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 1.7F, -2.0F);
			Body.addChild(bone);
			setRotationAngle(bone, -0.637F, 0.0F, 0.0F);
			bone.setTextureOffset(30, 31).addBox(-4.0F, 2.7268F, 6.267F, 8.0F, 4.0F, 3.0F, 0.0F, false);
			Tail = new ModelRenderer(this);
			Tail.setRotationPoint(0.0F, 15.0F, 2.0F);
			setRotationAngle(Tail, 1.0036F, 0.0F, 0.0F);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, -13.0F, 0.0F);
			Tail.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(17, 31).addBox(-1.3F, 18.675F, 10.4769F, 3.0F, 3.0F, 7.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, -13.0F, 0.0F);
			Tail.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(0, 0).addBox(-1.3F, 12.9867F, 5.0521F, 3.0F, 3.0F, 13.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(-5.0F, 3.0F, 4.0F);
			LeftArm.setTextureOffset(10, 55).addBox(-2.0F, 5.2F, -2.0F, 3.0F, 7.0F, 4.0F, 0.0F, false);
			LeftArm.setTextureOffset(33, 38).addBox(-3.0F, 12.2F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(5.0F, 3.0F, 4.0F);
			RightArm.setTextureOffset(0, 48).addBox(-1.0F, 5.2F, -2.0F, 3.0F, 7.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 32).addBox(-1.0F, 12.2F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(-2.0F, 11.75F, 0.0F);
			setRotationAngle(LeftLeg, -1.9199F, 0.0F, 0.0F);
			LeftLeg.setTextureOffset(38, 60).addBox(-2.0F, -3.9299F, 6.7745F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			LeftLeg_r1 = new ModelRenderer(this);
			LeftLeg_r1.setRotationPoint(2.0F, 13.6994F, 4.7766F);
			LeftLeg.addChild(LeftLeg_r1);
			setRotationAngle(LeftLeg_r1, 0.9163F, 0.0F, 0.0F);
			LeftLeg_r1.setTextureOffset(23, 50).addBox(-4.0F, 3.784F, 4.9976F, 4.0F, 2.0F, 5.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 8.0547F, 5.1561F);
			LeftLeg.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.5236F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(55, 9).addBox(-2.0F, 0.2165F, 5.2991F, 4.0F, 6.0F, 3.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
			LeftLeg.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.7854F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(12, 41).addBox(-2.0F, 4.6985F, 1.9106F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
			LeftLeg.addChild(cube_r6);
			setRotationAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(45, 46).addBox(-2.0F, -5.9256F, 5.0916F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(2.0F, 11.75F, 0.0F);
			setRotationAngle(RightLeg, -1.8937F, 0.0F, 1.3963F);
			RightLeg.setTextureOffset(49, 40).addBox(6.8633F, -1.4726F, -0.2006F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			RightLeg.setTextureOffset(47, 33).addBox(6.8633F, 10.3274F, -1.1108F, 4.0F, 2.0F, 5.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(0.0F, -0.125F, 0.0F);
			RightLeg.addChild(cube_r7);
			setRotationAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
			cube_r7.setTextureOffset(55, 0).addBox(6.8633F, 4.0294F, 4.8355F, 4.0F, 6.0F, 3.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(0.0F, -0.125F, 0.0F);
			RightLeg.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.7854F, 0.0F, 0.0F);
			cube_r8.setTextureOffset(39, 3).addBox(6.8633F, 1.5923F, -4.8476F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(0.0F, -0.125F, 0.0F);
			RightLeg.addChild(cube_r9);
			setRotationAngle(cube_r9, -0.3927F, 0.0F, 0.0F);
			cube_r9.setTextureOffset(44, 19).addBox(6.8633F, -0.8706F, -0.3645F, 4.0F, 6.0F, 4.0F, 0.0F, false);
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
