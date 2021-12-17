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

import net.mcreator.latexes.entity.BeeHertxSitEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BeeHertxSitRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BeeHertxSitEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelbee_hertx_sit_model(), 0.7f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("latex:textures/hertx_bee_texture.png");
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
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("latex:textures/bee_hertx_glow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelbee_hertx_sit_model extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer bone4;
		private final ModelRenderer bone5;
		private final ModelRenderer bone3;
		private final ModelRenderer Body;
		private final ModelRenderer Wings;
		private final ModelRenderer bone2;
		private final ModelRenderer bone;
		private final ModelRenderer Tail;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer RightLeg;
		public Modelbee_hertx_sit_model() {
			textureWidth = 80;
			textureHeight = 80;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 9.0F, 0.0F);
			Head.setTextureOffset(0, 31).addBox(-3.0F, -1.4F, -5.0F, 6.0F, 1.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(58, 11).addBox(-3.0F, -6.4F, 2.0F, 6.0F, 6.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(32, 25).addBox(-3.0F, -6.4F, 3.0F, 6.0F, 4.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(44, 60).addBox(-3.0F, -2.4F, -4.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(50, 12).addBox(-3.0F, -5.4F, -4.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(58, 18).addBox(2.0F, -2.4F, -4.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(54, 54).addBox(2.0F, -5.4F, -4.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(60, 38).addBox(-3.0F, -2.4F, -5.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(48, 41).addBox(-3.0F, -5.4F, -5.0F, 6.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(32, 18).addBox(-3.0F, -6.4F, -4.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(45, 35).addBox(-2.5F, -0.4F, -1.9F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(0.0F, -12.65F, 2.75F);
			Head.addChild(bone4);
			setRotationAngle(bone4, 0.3927F, 0.0F, 0.0F);
			bone4.setTextureOffset(26, 15).addBox(2.0F, 2.1219F, -2.8441F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			bone4.setTextureOffset(20, 0).addBox(-3.0F, 2.1219F, -2.8441F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			bone5 = new ModelRenderer(this);
			bone5.setRotationPoint(0.0F, -2.067F, 0.6109F);
			bone4.addChild(bone5);
			setRotationAngle(bone5, -0.2618F, 0.0F, 0.0F);
			bone5.setTextureOffset(36, 57).addBox(2.0F, 3.5539F, -7.306F, 1.0F, 2.0F, 6.0F, 0.0F, false);
			bone5.setTextureOffset(6, 7).addBox(2.0F, 4.5539F, -8.306F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone5.setTextureOffset(56, 41).addBox(-3.0F, 3.5539F, -7.306F, 1.0F, 2.0F, 6.0F, 0.0F, false);
			bone5.setTextureOffset(25, 21).addBox(-3.0F, 4.5539F, -8.306F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(0.0F, -14.4F, 1.0F);
			Head.addChild(bone3);
			setRotationAngle(bone3, -0.7854F, 0.0F, 0.0F);
			bone3.setTextureOffset(50, 21).addBox(-3.0F, 9.1924F, 2.1213F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(46, 32).addBox(-3.0F, 6.364F, 9.6066F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(56, 49).addBox(-3.0F, 9.6066F, 2.1213F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(48, 45).addBox(-3.0F, 6.7782F, 9.6066F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 9.0F, 0.0F);
			Body.setTextureOffset(26, 31).addBox(-4.0F, 1.0F, -2.0F, 8.0F, 5.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(20, 0).addBox(-5.0F, 0.0F, -3.0F, 10.0F, 4.0F, 6.0F, 0.0F, false);
			Body.setTextureOffset(46, 25).addBox(-3.0F, 6.0F, -2.0F, 6.0F, 3.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(32, 10).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 4.0F, 4.0F, 0.0F, false);
			Wings = new ModelRenderer(this);
			Wings.setRotationPoint(0.0F, -10.0F, 1.0F);
			Body.addChild(Wings);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
			Wings.addChild(bone2);
			setRotationAngle(bone2, 0.0F, 0.2618F, 0.0F);
			bone2.setTextureOffset(6, 15).addBox(-4.3F, 11.5F, 1.4F, 1.0F, 6.0F, 0.0F, 0.0F, false);
			bone2.setTextureOffset(19, 31).addBox(-3.3F, 13.5F, 1.4F, 1.0F, 3.0F, 0.0F, 0.0F, false);
			bone2.setTextureOffset(24, 0).addBox(-5.3F, 12.5F, 1.4F, 1.0F, 6.0F, 0.0F, 0.0F, false);
			bone2.setTextureOffset(6, 0).addBox(-7.3F, 12.5F, 1.4F, 2.0F, 7.0F, 0.0F, 0.0F, false);
			bone2.setTextureOffset(0, 0).addBox(-10.3F, 13.5F, 1.4F, 3.0F, 7.0F, 0.0F, 0.0F, false);
			bone2.setTextureOffset(0, 30).addBox(-11.3F, 13.5F, 1.4F, 1.0F, 6.0F, 0.0F, 0.0F, false);
			bone2.setTextureOffset(0, 7).addBox(-10.3F, 12.5F, 1.4F, 3.0F, 1.0F, 0.0F, 0.0F, false);
			bone2.setTextureOffset(0, 8).addBox(-7.3F, 11.5F, 1.4F, 3.0F, 1.0F, 0.0F, 0.0F, false);
			bone2.setTextureOffset(6, 9).addBox(-4.3F, 10.5F, 1.4F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 0.0F, 0.0F);
			Wings.addChild(bone);
			setRotationAngle(bone, 0.0F, -0.2618F, 0.0F);
			bone.setTextureOffset(30, 10).addBox(10.3F, 13.5F, 1.4F, 1.0F, 6.0F, 0.0F, 0.0F, false);
			bone.setTextureOffset(0, 9).addBox(7.3F, 19.5F, 1.4F, 3.0F, 1.0F, 0.0F, 0.0F, false);
			bone.setTextureOffset(22, 15).addBox(5.3F, 12.5F, 1.4F, 2.0F, 7.0F, 0.0F, 0.0F, false);
			bone.setTextureOffset(4, 30).addBox(4.3F, 12.5F, 1.4F, 1.0F, 6.0F, 0.0F, 0.0F, false);
			bone.setTextureOffset(2, 30).addBox(3.3F, 11.5F, 1.4F, 1.0F, 6.0F, 0.0F, 0.0F, false);
			bone.setTextureOffset(21, 31).addBox(2.3F, 13.5F, 1.4F, 1.0F, 3.0F, 0.0F, 0.0F, false);
			bone.setTextureOffset(8, 9).addBox(3.3F, 10.5F, 1.4F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			bone.setTextureOffset(0, 22).addBox(4.3F, 11.5F, 1.4F, 3.0F, 1.0F, 0.0F, 0.0F, false);
			bone.setTextureOffset(0, 15).addBox(7.3F, 12.5F, 1.4F, 3.0F, 7.0F, 0.0F, 0.0F, false);
			Tail = new ModelRenderer(this);
			Tail.setRotationPoint(0.0F, -3.0F, 0.0F);
			Body.addChild(Tail);
			setRotationAngle(Tail, 0.3054F, 0.0F, 0.0F);
			Tail.setTextureOffset(60, 32).addBox(-1.5F, 12.1133F, -3.2867F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			Tail.setTextureOffset(0, 15).addBox(-3.5F, 10.1133F, -0.2867F, 7.0F, 7.0F, 8.0F, 0.0F, false);
			Tail.setTextureOffset(0, 0).addBox(-2.5F, 11.1133F, -1.2867F, 5.0F, 5.0F, 10.0F, 0.0F, false);
			Tail.setTextureOffset(17, 17).addBox(-0.5F, 13.1133F, -1.2867F, 1.0F, 1.0F, 13.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(-5.0F, 11.0F, 0.0F);
			setRotationAngle(LeftArm, -0.6545F, 0.0F, 0.2182F);
			LeftArm.setTextureOffset(44, 48).addBox(-3.0F, 6.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			LeftArm.setTextureOffset(28, 52).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 7.0F, 4.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(5.0F, 11.0F, 0.0F);
			setRotationAngle(RightArm, -0.6545F, 0.0F, -0.2182F);
			RightArm.setTextureOffset(32, 40).addBox(-1.0F, 6.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(52, 0).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 7.0F, 4.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(-2.0F, 21.0F, 0.0F);
			setRotationAngle(LeftLeg, -1.5708F, 0.2618F, 0.0873F);
			LeftLeg.setTextureOffset(16, 40).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			LeftLeg.setTextureOffset(14, 52).addBox(-1.0F, 9.0F, -2.0F, 3.0F, 8.0F, 4.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(2.0F, 21.0F, 0.0F);
			setRotationAngle(RightLeg, -1.5708F, -0.2618F, -0.0873F);
			RightLeg.setTextureOffset(0, 39).addBox(-2.0F, 2.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 51).addBox(-2.0F, 10.0F, -2.0F, 3.0F, 8.0F, 4.0F, 0.0F, false);
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
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
