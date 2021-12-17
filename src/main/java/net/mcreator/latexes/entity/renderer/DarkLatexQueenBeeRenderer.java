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

import net.mcreator.latexes.entity.DarkLatexQueenBeeEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class DarkLatexQueenBeeRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(DarkLatexQueenBeeEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modeldl_bee_queen_model(), 1f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("latex:textures/dark_latex_queen_bee_texture.png");
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
					.getBuffer(RenderType.getEyes(new ResourceLocation("latex:textures/dark_latex_queen_bee_glow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	public static class Modeldl_bee_queen_model extends EntityModel<Entity> {
		private final ModelRenderer QueenBee;
		private final ModelRenderer Head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer Mask;
		private final ModelRenderer Body;
		private final ModelRenderer Wings;
		private final ModelRenderer LeftWings;
		private final ModelRenderer cube_r3;
		private final ModelRenderer RightWings;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer Tail;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightLeg;
		private final ModelRenderer cube_r9;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r11;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer cube_r12;
		private final ModelRenderer cube_r13;
		private final ModelRenderer cube_r14;
		public Modeldl_bee_queen_model() {
			textureWidth = 128;
			textureHeight = 128;
			QueenBee = new ModelRenderer(this);
			QueenBee.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(QueenBee, 0.0F, 3.1416F, 0.0F);
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, -34.0F, 0.0F);
			QueenBee.addChild(Head);
			Head.setTextureOffset(28, 28).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 6.0F, 8.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(6.0F, -4.4965F, -13.7044F);
			Head.addChild(cube_r1);
			setRotationAngle(cube_r1, -1.5708F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 0).addBox(-3.5F, -20.7F, -6.0F, 1.0F, 5.0F, 2.0F, 0.0F, false);
			cube_r1.setTextureOffset(4, 5).addBox(-9.5F, -20.7F, -6.0F, 1.0F, 5.0F, 2.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(6.0F, 10.0F, 0.0F);
			Head.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(31, 0).addBox(-3.5F, -19.7F, -6.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			cube_r2.setTextureOffset(58, 0).addBox(-9.5F, -19.7F, -6.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			Mask = new ModelRenderer(this);
			Mask.setRotationPoint(0.0F, 10.0F, 0.0F);
			Head.addChild(Mask);
			Mask.setTextureOffset(28, 25).addBox(-3.0F, -12.0F, 4.5F, 6.0F, 1.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(28, 26).addBox(3.0F, -13.0F, 4.5F, 1.0F, 3.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(48, 27).addBox(4.0F, -14.0F, 4.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(28, 24).addBox(-6.0F, -15.0F, 4.5F, 12.0F, 1.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(0, 12).addBox(-3.0F, -16.0F, 4.5F, 6.0F, 1.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(14, 34).addBox(-2.0F, -17.0F, 4.5F, 4.0F, 1.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(2, 49).addBox(-5.0F, -14.0F, 4.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(10, 9).addBox(-4.0F, -13.0F, 4.5F, 1.0F, 3.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(17, 49).addBox(-1.0F, -14.0F, 4.5F, 2.0F, 2.0F, 0.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, -34.0F, 0.0F);
			QueenBee.addChild(Body);
			Body.setTextureOffset(0, 38).addBox(-6.0F, 1.0F, -2.0F, 12.0F, 5.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(0, 22).addBox(-5.0F, -1.0F, -4.0F, 10.0F, 4.0F, 8.0F, 0.0F, false);
			Body.setTextureOffset(31, 0).addBox(-5.0F, 3.0F, -3.25F, 10.0F, 1.0F, 7.0F, 0.0F, false);
			Body.setTextureOffset(56, 43).addBox(-7.0F, 0.0F, -4.0F, 2.0F, 4.0F, 8.0F, 0.0F, false);
			Body.setTextureOffset(19, 75).addBox(-6.0F, 4.0F, -3.25F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			Body.setTextureOffset(52, 24).addBox(5.0F, 0.0F, -4.0F, 2.0F, 4.0F, 8.0F, 0.0F, false);
			Body.setTextureOffset(72, 74).addBox(5.0F, 4.0F, -3.25F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			Body.setTextureOffset(38, 16).addBox(-5.0F, 3.25F, -3.0F, 10.0F, 2.0F, 6.0F, 0.0F, false);
			Body.setTextureOffset(22, 51).addBox(-4.0F, 6.0F, -2.0F, 8.0F, 5.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(32, 42).addBox(-5.0F, 11.0F, -2.0F, 10.0F, 5.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(0, 47).addBox(-3.0F, 9.0F, -2.5F, 6.0F, 6.0F, 5.0F, 0.0F, false);
			Wings = new ModelRenderer(this);
			Wings.setRotationPoint(0.0F, -27.0F, 0.0F);
			QueenBee.addChild(Wings);
			LeftWings = new ModelRenderer(this);
			LeftWings.setRotationPoint(0.0F, 0.0F, 0.0F);
			Wings.addChild(LeftWings);
			LeftWings.setTextureOffset(30, 47).addBox(-6.0F, -4.0F, -4.25F, 1.0F, 2.0F, 0.0F, 0.0F, false);
			LeftWings.setTextureOffset(0, 47).addBox(-7.0F, -6.0F, -4.25F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			LeftWings.setTextureOffset(2, 76).addBox(-8.0F, -7.0F, -4.25F, 1.0F, 6.0F, 0.0F, 0.0F, false);
			LeftWings.setTextureOffset(4, 34).addBox(-11.0F, -8.0F, -4.25F, 4.0F, 1.0F, 0.0F, 0.0F, false);
			LeftWings.setTextureOffset(62, 42).addBox(-9.0F, -7.0F, -4.25F, 1.0F, 7.0F, 0.0F, 0.0F, false);
			LeftWings.setTextureOffset(47, 11).addBox(-7.0F, -7.0F, -4.25F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			LeftWings.setTextureOffset(33, 27).addBox(-15.0F, -7.0F, -4.25F, 4.0F, 1.0F, 0.0F, 0.0F, false);
			LeftWings.setTextureOffset(22, 47).addBox(-11.0F, -7.0F, -4.25F, 2.0F, 8.0F, 0.0F, 0.0F, false);
			LeftWings.setTextureOffset(52, 24).addBox(-14.0F, -6.0F, -4.25F, 2.0F, 8.0F, 0.0F, 0.0F, false);
			LeftWings.setTextureOffset(62, 55).addBox(-12.0F, -6.0F, -4.25F, 1.0F, 7.0F, 0.0F, 0.0F, false);
			LeftWings.setTextureOffset(32, 60).addBox(-15.0F, -6.0F, -4.25F, 1.0F, 9.0F, 0.0F, 0.0F, false);
			LeftWings.setTextureOffset(45, 12).addBox(-17.0F, -6.0F, -4.25F, 2.0F, 1.0F, 0.0F, 0.0F, false);
			LeftWings.setTextureOffset(56, 24).addBox(-17.0F, -5.0F, -4.25F, 2.0F, 8.0F, 0.0F, 0.0F, false);
			LeftWings.setTextureOffset(47, 8).addBox(-18.0F, -5.0F, -4.25F, 1.0F, 2.0F, 0.0F, 0.0F, false);
			LeftWings.setTextureOffset(6, 76).addBox(-19.0F, -3.0F, -4.25F, 1.0F, 6.0F, 0.0F, 0.0F, false);
			LeftWings.setTextureOffset(4, 76).addBox(-18.0F, -3.0F, -4.25F, 1.0F, 6.0F, 0.0F, 0.0F, false);
			LeftWings.setTextureOffset(33, 26).addBox(-18.0F, 3.0001F, -4.25F, 4.0F, 1.0F, 0.0F, 0.0F, false);
			LeftWings.setTextureOffset(44, 25).addBox(-14.0F, 2.0F, -4.25F, 2.0F, 1.0F, 0.0F, 0.0F, false);
			LeftWings.setTextureOffset(22, 34).addBox(-12.0F, 1.0F, -4.25F, 3.0F, 1.0F, 0.0F, 0.0F, false);
			LeftWings.setTextureOffset(47, 10).addBox(-9.0F, 0.0F, -4.25F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			LeftWings.setTextureOffset(20, 47).addBox(-8.0F, -1.0F, -4.25F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			LeftWings.setTextureOffset(41, 27).addBox(-7.0F, -2.0F, -4.25F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-6.159F, 2.6563F, -6.0984F);
			LeftWings.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, -0.7854F, 0.0F);
			cube_r3.setTextureOffset(60, 55).addBox(-0.9688F, -3.6563F, 0.0F, 1.0F, 7.0F, 0.0F, 0.0F, false);
			cube_r3.setTextureOffset(43, 8).addBox(-3.9688F, -0.6563F, 0.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			cube_r3.setTextureOffset(23, 37).addBox(0.0312F, 2.3438F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r3.setTextureOffset(31, 11).addBox(-3.9688F, 3.3438F, 0.0F, 4.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r3.setTextureOffset(4, 37).addBox(3.0312F, 0.3438F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r3.setTextureOffset(40, 25).addBox(2.0312F, 1.3438F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r3.setTextureOffset(2, 7).addBox(-4.9688F, -0.6563F, 0.0F, 1.0F, 5.0F, 0.0F, 0.0F, false);
			cube_r3.setTextureOffset(36, 22).addBox(-3.9688F, -2.6563F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
			cube_r3.setTextureOffset(30, 73).addBox(-2.9688F, -2.6563F, 0.0F, 1.0F, 6.0F, 0.0F, 0.0F, false);
			cube_r3.setTextureOffset(0, 76).addBox(-1.9688F, -2.6563F, 0.0F, 1.0F, 6.0F, 0.0F, 0.0F, false);
			cube_r3.setTextureOffset(60, 36).addBox(0.0312F, -3.6563F, 0.0F, 2.0F, 6.0F, 0.0F, 0.0F, false);
			cube_r3.setTextureOffset(41, 12).addBox(-2.9688F, -3.6563F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r3.setTextureOffset(39, 8).addBox(2.0312F, -3.6563F, 0.0F, 1.0F, 5.0F, 0.0F, 0.0F, false);
			cube_r3.setTextureOffset(31, 12).addBox(-0.9688F, -4.6563F, 0.0F, 4.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r3.setTextureOffset(45, 8).addBox(3.0312F, -3.6563F, 0.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			cube_r3.setTextureOffset(2, 47).addBox(4.0312F, -1.6563F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
			RightWings = new ModelRenderer(this);
			RightWings.setRotationPoint(0.0F, 0.0F, 0.0F);
			Wings.addChild(RightWings);
			RightWings.setTextureOffset(0, 34).addBox(9.0F, -7.0F, -4.25F, 2.0F, 8.0F, 0.0F, 0.0F, false);
			RightWings.setTextureOffset(31, 6).addBox(9.0F, 1.0F, -4.25F, 3.0F, 1.0F, 0.0F, 0.0F, false);
			RightWings.setTextureOffset(15, 37).addBox(12.0F, 2.0F, -4.25F, 2.0F, 1.0F, 0.0F, 0.0F, false);
			RightWings.setTextureOffset(4, 22).addBox(12.0F, -6.0F, -4.25F, 2.0F, 8.0F, 0.0F, 0.0F, false);
			RightWings.setTextureOffset(34, 60).addBox(11.0F, -6.0F, -4.25F, 1.0F, 7.0F, 0.0F, 0.0F, false);
			RightWings.setTextureOffset(10, 0).addBox(14.0F, -6.0F, -4.25F, 1.0F, 9.0F, 0.0F, 0.0F, false);
			RightWings.setTextureOffset(31, 8).addBox(14.0F, 3.0F, -4.25F, 4.0F, 1.0F, 0.0F, 0.0F, false);
			RightWings.setTextureOffset(64, 36).addBox(17.0F, -3.0F, -4.25F, 1.0F, 6.0F, 0.0F, 0.0F, false);
			RightWings.setTextureOffset(58, 69).addBox(18.0F, -3.0F, -4.25F, 1.0F, 6.0F, 0.0F, 0.0F, false);
			RightWings.setTextureOffset(31, 0).addBox(17.0F, -5.0F, -4.25F, 1.0F, 2.0F, 0.0F, 0.0F, false);
			RightWings.setTextureOffset(0, 22).addBox(15.0F, -5.0F, -4.25F, 2.0F, 8.0F, 0.0F, 0.0F, false);
			RightWings.setTextureOffset(19, 37).addBox(15.0F, -6.0F, -4.25F, 2.0F, 1.0F, 0.0F, 0.0F, false);
			RightWings.setTextureOffset(31, 9).addBox(11.0F, -7.0F, -4.25F, 4.0F, 1.0F, 0.0F, 0.0F, false);
			RightWings.setTextureOffset(31, 10).addBox(7.0F, -8.0F, -4.25F, 4.0F, 1.0F, 0.0F, 0.0F, false);
			RightWings.setTextureOffset(60, 42).addBox(8.0F, -7.0F, -4.25F, 1.0F, 7.0F, 0.0F, 0.0F, false);
			RightWings.setTextureOffset(23, 35).addBox(6.0F, -7.0F, -4.25F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			RightWings.setTextureOffset(28, 73).addBox(7.0F, -7.0F, -4.25F, 1.0F, 6.0F, 0.0F, 0.0F, false);
			RightWings.setTextureOffset(34, 42).addBox(6.0F, -6.0F, -4.25F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			RightWings.setTextureOffset(35, 0).addBox(5.0F, -4.0F, -4.25F, 1.0F, 2.0F, 0.0F, 0.0F, false);
			RightWings.setTextureOffset(34, 34).addBox(6.0F, -2.0F, -4.25F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			RightWings.setTextureOffset(14, 35).addBox(7.0F, -1.0F, -4.25F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			RightWings.setTextureOffset(19, 35).addBox(8.0F, 0.0F, -4.25F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(6.3255F, 2.6F, -6.2648F);
			RightWings.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.7854F, 0.0F);
			cube_r4.setTextureOffset(28, 23).addBox(-3.2667F, -4.6F, 0.0F, 4.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r4.setTextureOffset(11, 37).addBox(0.7333F, -3.6F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r4.setTextureOffset(0, 0).addBox(2.7333F, -2.6F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
			cube_r4.setTextureOffset(7, 35).addBox(-2.2667F, 2.4F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r4.setTextureOffset(30, 34).addBox(-3.2667F, 1.4F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r4.setTextureOffset(4, 0).addBox(-5.2667F, -1.6F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
			cube_r4.setTextureOffset(0, 7).addBox(-3.2667F, -3.6F, 0.0F, 1.0F, 5.0F, 0.0F, 0.0F, false);
			cube_r4.setTextureOffset(32, 42).addBox(-4.2667F, -3.6F, 0.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			cube_r4.setTextureOffset(14, 58).addBox(-2.2667F, -3.6F, 0.0F, 2.0F, 6.0F, 0.0F, 0.0F, false);
			cube_r4.setTextureOffset(8, 0).addBox(-0.2667F, -3.6F, 0.0F, 1.0F, 7.0F, 0.0F, 0.0F, false);
			cube_r4.setTextureOffset(64, 16).addBox(0.7333F, -2.6F, 0.0F, 1.0F, 6.0F, 0.0F, 0.0F, false);
			cube_r4.setTextureOffset(28, 22).addBox(-0.2667F, 3.4F, 0.0F, 4.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r4.setTextureOffset(41, 8).addBox(2.7333F, -0.6F, 0.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			cube_r4.setTextureOffset(6, 0).addBox(3.7333F, -0.6F, 0.0F, 1.0F, 5.0F, 0.0F, 0.0F, false);
			cube_r4.setTextureOffset(64, 0).addBox(1.7333F, -2.6F, 0.0F, 1.0F, 6.0F, 0.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-5.0F, 6.0F, 4.0F);
			RightWings.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, 0.7854F, 0.0F);
			cube_r5.setTextureOffset(33, 28).addBox(11.0F, -3.0F, 0.75F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			Tail = new ModelRenderer(this);
			Tail.setRotationPoint(0.0F, -22.0F, -1.0F);
			QueenBee.addChild(Tail);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(-0.5F, -3.0F, 1.0F);
			Tail.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.3927F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(78, 60).addBox(-2.0F, 0.0F, -4.5F, 5.0F, 5.0F, 2.0F, 0.0F, false);
			cube_r6.setTextureOffset(0, 0).addBox(-4.0F, -2.0F, -17.5F, 9.0F, 9.0F, 13.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(-0.5F, -9.247F, -7.3241F);
			Tail.addChild(cube_r7);
			setRotationAngle(cube_r7, 1.5708F, 0.0F, 0.0F);
			cube_r7.setTextureOffset(10, 34).addBox(0.0F, -9.0F, -18.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(-0.5F, -3.0F, 1.0F);
			Tail.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.7854F, 0.0F, 0.0F);
			cube_r8.setTextureOffset(28, 26).addBox(0.0F, -5.0F, -19.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(5.0F, -31.0F, 0.0F);
			QueenBee.addChild(RightArm);
			RightArm.setTextureOffset(0, 58).addBox(1.0F, 2.0F, -2.0F, 3.0F, 14.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(44, 26).addBox(3.0F, 16.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(41, 25).addBox(3.0F, 16.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(7, 36).addBox(3.0F, 16.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(78, 0).addBox(1.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(68, 40).addBox(0.5F, -2.5F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);
			RightArm.setTextureOffset(45, 71).addBox(0.5F, 11.0F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(-5.0F, -31.0F, 0.0F);
			QueenBee.addChild(LeftArm);
			LeftArm.setTextureOffset(46, 51).addBox(-4.0F, 2.0F, -2.0F, 3.0F, 14.0F, 4.0F, 0.0F, false);
			LeftArm.setTextureOffset(24, 35).addBox(-4.0F, 16.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(20, 35).addBox(-4.0F, 16.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(16, 35).addBox(-4.0F, 16.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(63, 73).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			LeftArm.setTextureOffset(67, 31).addBox(-4.5F, -2.5F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);
			LeftArm.setTextureOffset(65, 22).addBox(-4.5F, 11.0F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(2.0F, -19.0F, 0.0F);
			QueenBee.addChild(RightLeg);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(0.0F, 9.6932F, -2.6685F);
			RightLeg.addChild(cube_r9);
			setRotationAngle(cube_r9, -0.829F, 0.0F, 0.0F);
			cube_r9.setTextureOffset(61, 3).addBox(-2.5F, -3.25F, -0.5F, 6.0F, 3.0F, 5.0F, 0.0F, false);
			cube_r9.setTextureOffset(66, 11).addBox(-2.0F, -6.25F, 0.0F, 5.0F, 7.0F, 4.0F, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(0.0F, 7.0F, 0.0F);
			RightLeg.addChild(cube_r10);
			setRotationAngle(cube_r10, 0.3054F, 0.0F, 0.0F);
			cube_r10.setTextureOffset(60, 60).addBox(-2.0F, -6.25F, 0.0F, 5.0F, 9.0F, 4.0F, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(0.0F, 9.0052F, 4.2588F);
			RightLeg.addChild(cube_r11);
			setRotationAngle(cube_r11, -1.1781F, 0.0F, 0.0F);
			cube_r11.setTextureOffset(17, 47).addBox(0.0F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r11.setTextureOffset(26, 47).addBox(1.5F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r11.setTextureOffset(47, 25).addBox(-1.5F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r11.setTextureOffset(10, 73).addBox(-1.5F, 6.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(-2.0F, -19.0F, 0.0F);
			QueenBee.addChild(LeftLeg);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(0.0F, 9.6932F, -2.6685F);
			LeftLeg.addChild(cube_r12);
			setRotationAngle(cube_r12, -0.829F, 0.0F, 0.0F);
			cube_r12.setTextureOffset(44, 8).addBox(-3.5F, -3.25F, -0.5F, 6.0F, 3.0F, 5.0F, 0.0F, false);
			cube_r12.setTextureOffset(32, 65).addBox(-3.0F, -6.25F, 0.0F, 5.0F, 7.0F, 4.0F, 0.0F, false);
			cube_r13 = new ModelRenderer(this);
			cube_r13.setRotationPoint(0.0F, 7.0F, 0.0F);
			LeftLeg.addChild(cube_r13);
			setRotationAngle(cube_r13, 0.3054F, 0.0F, 0.0F);
			cube_r13.setTextureOffset(14, 60).addBox(-3.0F, -6.25F, 0.0F, 5.0F, 9.0F, 4.0F, 0.0F, false);
			cube_r14 = new ModelRenderer(this);
			cube_r14.setRotationPoint(0.0F, 9.0052F, 4.2588F);
			LeftLeg.addChild(cube_r14);
			setRotationAngle(cube_r14, -1.1781F, 0.0F, 0.0F);
			cube_r14.setTextureOffset(27, 34).addBox(-1.0F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r14.setTextureOffset(31, 34).addBox(-2.5F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r14.setTextureOffset(4, 35).addBox(0.5F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r14.setTextureOffset(72, 51).addBox(-2.5F, 6.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			QueenBee.render(matrixStack, buffer, packedLight, packedOverlay);
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
