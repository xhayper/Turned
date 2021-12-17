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

import net.mcreator.latexes.entity.DarkLatexSpiderQueenEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class DarkLatexSpiderQueenRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(DarkLatexSpiderQueenEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelqueen_spider_latex_model(), 1.2f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("latex:textures/spider_latex_queen_texture.png");
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
					.getBuffer(RenderType.getEyes(new ResourceLocation("latex:textures/spider_latex_queen_glow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	public static class Modelqueen_spider_latex_model extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer bone9;
		private final ModelRenderer bone10;
		private final ModelRenderer Body;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;
		private final ModelRenderer LowerBody;
		private final ModelRenderer Rightleg;
		private final ModelRenderer bone;
		private final ModelRenderer bone3;
		private final ModelRenderer bone2;
		private final ModelRenderer bone4;
		private final ModelRenderer bone5;
		private final ModelRenderer bone6;
		private final ModelRenderer bone15;
		private final ModelRenderer bone16;
		private final ModelRenderer bone17;
		private final ModelRenderer bone7;
		private final ModelRenderer bone8;
		private final ModelRenderer bone11;
		private final ModelRenderer bone12;
		private final ModelRenderer bone13;
		private final ModelRenderer bone14;
		private final ModelRenderer Leftleg;
		private final ModelRenderer bone18;
		private final ModelRenderer bone19;
		private final ModelRenderer bone20;
		private final ModelRenderer bone21;
		private final ModelRenderer bone22;
		private final ModelRenderer bone23;
		private final ModelRenderer bone24;
		private final ModelRenderer bone25;
		private final ModelRenderer bone26;
		private final ModelRenderer bone27;
		private final ModelRenderer bone28;
		private final ModelRenderer bone29;
		private final ModelRenderer bone30;
		private final ModelRenderer bone31;
		private final ModelRenderer bone32;
		public Modelqueen_spider_latex_model() {
			textureWidth = 256;
			textureHeight = 256;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, -9.5F, -11.5F);
			Head.setTextureOffset(47, 74).addBox(-4.5F, -9.0F, -4.75F, 9.0F, 9.0F, 9.0F, 0.0F, false);
			bone9 = new ModelRenderer(this);
			bone9.setRotationPoint(0.5F, 1.0F, -0.75F);
			Head.addChild(bone9);
			setRotationAngle(bone9, 0.0F, 0.0F, -0.1745F);
			bone9.setTextureOffset(14, 6).addBox(-4.0941F, -4.5396F, -5.25F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			bone10 = new ModelRenderer(this);
			bone10.setRotationPoint(5.5F, 1.0F, -0.75F);
			Head.addChild(bone10);
			setRotationAngle(bone10, 0.0F, 0.0F, 0.1745F);
			bone10.setTextureOffset(14, 0).addBox(-3.8706F, -3.4501F, -5.25F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, -9.5F, -11.5F);
			Body.setTextureOffset(79, 29).addBox(-5.5F, 0.5F, -3.5F, 11.0F, 8.0F, 7.0F, 0.0F, false);
			Body.setTextureOffset(98, 0).addBox(-5.5F, 2.5F, -5.5F, 11.0F, 5.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(62, 17).addBox(-5.5F, 1.5F, -4.5F, 11.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(0, 16).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			Body.setTextureOffset(0, 99).addBox(-4.0F, 8.5F, -2.25F, 8.0F, 8.0F, 5.0F, 0.0F, false);
			Body.setTextureOffset(0, 0).addBox(-3.0F, 1.5F, 2.75F, 6.0F, 15.0F, 1.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(5.5F, -7.0F, -11.25F);
			RightArm.setTextureOffset(12, 112).addBox(0.0F, -2.0F, -1.75F, 4.0F, 9.0F, 3.0F, 0.0F, false);
			RightArm.setTextureOffset(26, 99).addBox(-1.0F, 7.0F, -2.75F, 6.0F, 2.0F, 5.0F, 0.0F, false);
			RightArm.setTextureOffset(43, 101).addBox(0.0F, 9.0F, -2.75F, 4.0F, 5.0F, 5.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(-5.5F, -7.0F, -11.25F);
			LeftArm.setTextureOffset(0, 36).addBox(-4.0F, -2.0F, -1.75F, 4.0F, 9.0F, 3.0F, 0.0F, false);
			LeftArm.setTextureOffset(98, 50).addBox(-5.0F, 7.0F, -2.75F, 6.0F, 2.0F, 5.0F, 0.0F, false);
			LeftArm.setTextureOffset(61, 101).addBox(-4.0F, 9.0F, -2.75F, 4.0F, 5.0F, 5.0F, 0.0F, false);
			LowerBody = new ModelRenderer(this);
			LowerBody.setRotationPoint(0.0F, -9.5F, -11.5F);
			LowerBody.setTextureOffset(0, 36).addBox(-7.5F, 18.5F, -3.75F, 15.0F, 9.0F, 16.0F, 0.0F, false);
			LowerBody.setTextureOffset(62, 0).addBox(-6.5F, 19.5F, -5.75F, 13.0F, 7.0F, 10.0F, 0.0F, false);
			LowerBody.setTextureOffset(0, 0).addBox(-10.0F, 14.75F, 17.25F, 20.0F, 14.0F, 22.0F, 0.0F, false);
			LowerBody.setTextureOffset(51, 51).addBox(-9.0F, 15.75F, 31.25F, 18.0F, 12.0F, 11.0F, 0.0F, false);
			LowerBody.setTextureOffset(88, 95).addBox(-6.0F, 19.0F, 12.25F, 12.0F, 8.0F, 5.0F, 0.0F, false);
			LowerBody.setTextureOffset(0, 61).addBox(-7.0F, 16.5F, -3.25F, 14.0F, 6.0F, 14.0F, 0.0F, false);
			LowerBody.setTextureOffset(46, 36).addBox(-5.0F, 15.5F, -2.75F, 10.0F, 1.0F, 13.0F, 0.0F, false);
			Rightleg = new ModelRenderer(this);
			Rightleg.setRotationPoint(4.0F, 10.75F, -5.25F);
			setRotationAngle(Rightleg, 0.0F, 0.0F, 0.7854F);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(2.1469F, -3.7366F, 9.25F);
			Rightleg.addChild(bone);
			setRotationAngle(bone, -0.0524F, -0.2094F, 0.3927F);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(1.3886F, 7.2722F, -2.25F);
			bone.addChild(bone3);
			bone3.setTextureOffset(0, 112).addBox(-2.3886F, -15.2722F, 0.25F, 3.0F, 11.0F, 3.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(1.3886F, 7.2722F, -2.25F);
			bone.addChild(bone2);
			bone2.setTextureOffset(44, 95).addBox(0.6114F, -15.2722F, 0.25F, 19.0F, 3.0F, 3.0F, 0.0F, false);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(2.1469F, -3.7366F, 5.0F);
			Rightleg.addChild(bone4);
			setRotationAngle(bone4, -0.0524F, -0.1047F, 0.3927F);
			bone5 = new ModelRenderer(this);
			bone5.setRotationPoint(1.3886F, 7.2722F, -2.25F);
			bone4.addChild(bone5);
			bone5.setTextureOffset(62, 111).addBox(-2.3886F, -15.2722F, 0.25F, 3.0F, 11.0F, 3.0F, 0.0F, false);
			bone6 = new ModelRenderer(this);
			bone6.setRotationPoint(1.3886F, 7.2722F, -2.25F);
			bone4.addChild(bone6);
			bone6.setTextureOffset(0, 93).addBox(0.6114F, -15.2722F, 0.25F, 19.0F, 3.0F, 3.0F, 0.0F, false);
			bone15 = new ModelRenderer(this);
			bone15.setRotationPoint(2.1469F, -3.7366F, 1.0F);
			Rightleg.addChild(bone15);
			setRotationAngle(bone15, -0.0524F, 0.0F, 0.3927F);
			bone16 = new ModelRenderer(this);
			bone16.setRotationPoint(1.3886F, 7.2722F, -2.25F);
			bone15.addChild(bone16);
			bone16.setTextureOffset(109, 57).addBox(-2.3886F, -15.2722F, 0.25F, 3.0F, 11.0F, 3.0F, 0.0F, false);
			bone17 = new ModelRenderer(this);
			bone17.setRotationPoint(1.3886F, 7.2722F, -2.25F);
			bone15.addChild(bone17);
			bone17.setTextureOffset(0, 87).addBox(0.6114F, -15.2722F, 0.25F, 19.0F, 3.0F, 3.0F, 0.0F, false);
			bone7 = new ModelRenderer(this);
			bone7.setRotationPoint(2.1469F, -3.7366F, 0.75F);
			Rightleg.addChild(bone7);
			setRotationAngle(bone7, -0.0524F, 0.1047F, 0.3927F);
			bone8 = new ModelRenderer(this);
			bone8.setRotationPoint(1.3886F, 7.2722F, -2.25F);
			bone7.addChild(bone8);
			bone8.setTextureOffset(50, 111).addBox(-1.9705F, -15.064F, -3.7226F, 3.0F, 11.0F, 3.0F, 0.0F, false);
			bone11 = new ModelRenderer(this);
			bone11.setRotationPoint(1.3886F, 7.2722F, -2.25F);
			bone7.addChild(bone11);
			bone11.setTextureOffset(92, 44).addBox(1.0295F, -15.064F, -3.7226F, 19.0F, 3.0F, 3.0F, 0.0F, false);
			bone12 = new ModelRenderer(this);
			bone12.setRotationPoint(2.1469F, -3.7366F, -3.25F);
			Rightleg.addChild(bone12);
			setRotationAngle(bone12, -0.0524F, 0.2094F, 0.3927F);
			bone13 = new ModelRenderer(this);
			bone13.setRotationPoint(1.3886F, 7.2722F, -2.25F);
			bone12.addChild(bone13);
			bone13.setTextureOffset(38, 111).addBox(-1.557F, -15.0674F, -3.6572F, 3.0F, 11.0F, 3.0F, 0.0F, false);
			bone14 = new ModelRenderer(this);
			bone14.setRotationPoint(1.3886F, 7.2722F, -2.25F);
			bone12.addChild(bone14);
			bone14.setTextureOffset(80, 89).addBox(1.443F, -15.0674F, -3.6572F, 19.0F, 3.0F, 3.0F, 0.0F, false);
			Leftleg = new ModelRenderer(this);
			Leftleg.setRotationPoint(-4.0F, 10.75F, -5.25F);
			setRotationAngle(Leftleg, 0.0F, 0.0F, -0.7854F);
			bone18 = new ModelRenderer(this);
			bone18.setRotationPoint(-2.1469F, -3.7366F, 9.25F);
			Leftleg.addChild(bone18);
			setRotationAngle(bone18, -0.0524F, 0.2094F, -0.3927F);
			bone19 = new ModelRenderer(this);
			bone19.setRotationPoint(-1.3886F, 7.2722F, -2.25F);
			bone18.addChild(bone19);
			bone19.setTextureOffset(103, 108).addBox(-0.6114F, -15.2722F, 0.25F, 3.0F, 11.0F, 3.0F, 0.0F, false);
			bone20 = new ModelRenderer(this);
			bone20.setRotationPoint(-1.3886F, 7.2722F, -2.25F);
			bone18.addChild(bone20);
			bone20.setTextureOffset(84, 23).addBox(-19.6114F, -15.2722F, 0.25F, 19.0F, 3.0F, 3.0F, 0.0F, false);
			bone21 = new ModelRenderer(this);
			bone21.setRotationPoint(-2.1469F, -3.7366F, 5.0F);
			Leftleg.addChild(bone21);
			setRotationAngle(bone21, -0.0524F, 0.1047F, -0.3927F);
			bone22 = new ModelRenderer(this);
			bone22.setRotationPoint(-1.3886F, 7.2722F, -2.25F);
			bone21.addChild(bone22);
			bone22.setTextureOffset(91, 108).addBox(-0.6114F, -15.2722F, 0.25F, 3.0F, 11.0F, 3.0F, 0.0F, false);
			bone23 = new ModelRenderer(this);
			bone23.setRotationPoint(-1.3886F, 7.2722F, -2.25F);
			bone21.addChild(bone23);
			bone23.setTextureOffset(84, 17).addBox(-19.6114F, -15.2722F, 0.25F, 19.0F, 3.0F, 3.0F, 0.0F, false);
			bone24 = new ModelRenderer(this);
			bone24.setRotationPoint(-2.1469F, -3.7366F, 1.0F);
			Leftleg.addChild(bone24);
			setRotationAngle(bone24, -0.0524F, 0.0F, -0.3927F);
			bone25 = new ModelRenderer(this);
			bone25.setRotationPoint(-1.3886F, 7.2722F, -2.25F);
			bone24.addChild(bone25);
			bone25.setTextureOffset(26, 106).addBox(-0.6114F, -15.2722F, 0.25F, 3.0F, 11.0F, 3.0F, 0.0F, false);
			bone26 = new ModelRenderer(this);
			bone26.setRotationPoint(-1.3886F, 7.2722F, -2.25F);
			bone24.addChild(bone26);
			bone26.setTextureOffset(83, 83).addBox(-19.6114F, -15.2722F, 0.25F, 19.0F, 3.0F, 3.0F, 0.0F, false);
			bone27 = new ModelRenderer(this);
			bone27.setRotationPoint(-2.1469F, -3.7366F, 0.75F);
			Leftleg.addChild(bone27);
			setRotationAngle(bone27, -0.0524F, -0.1047F, -0.3927F);
			bone28 = new ModelRenderer(this);
			bone28.setRotationPoint(-1.3886F, 7.2722F, -2.25F);
			bone27.addChild(bone28);
			bone28.setTextureOffset(79, 105).addBox(-1.0295F, -15.064F, -3.7226F, 3.0F, 11.0F, 3.0F, 0.0F, false);
			bone29 = new ModelRenderer(this);
			bone29.setRotationPoint(-1.3886F, 7.2722F, -2.25F);
			bone27.addChild(bone29);
			bone29.setTextureOffset(0, 81).addBox(-20.0295F, -15.064F, -3.7226F, 19.0F, 3.0F, 3.0F, 0.0F, false);
			bone30 = new ModelRenderer(this);
			bone30.setRotationPoint(-2.1469F, -3.7366F, -3.25F);
			Leftleg.addChild(bone30);
			setRotationAngle(bone30, -0.0524F, -0.2094F, -0.3927F);
			bone31 = new ModelRenderer(this);
			bone31.setRotationPoint(-1.3886F, 7.2722F, -2.25F);
			bone30.addChild(bone31);
			bone31.setTextureOffset(0, 61).addBox(-1.443F, -15.0674F, -3.6572F, 3.0F, 11.0F, 3.0F, 0.0F, false);
			bone32 = new ModelRenderer(this);
			bone32.setRotationPoint(-1.3886F, 7.2722F, -2.25F);
			bone30.addChild(bone32);
			bone32.setTextureOffset(74, 74).addBox(-20.443F, -15.0674F, -3.6572F, 19.0F, 3.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			Body.render(matrixStack, buffer, packedLight, packedOverlay);
			RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			LowerBody.render(matrixStack, buffer, packedLight, packedOverlay);
			Rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
			Leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.Leftleg.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Rightleg.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.LeftArm.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}
}
