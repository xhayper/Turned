package net.mcreator.latexes.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.latexes.entity.DlsharkEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class DlsharkRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(DlsharkEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modeldl_shark_model(), 0.6f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("latex:textures/dl_shark_texture.png");
					}
				};
			});
		}
	}

	public static class Modeldl_shark_model extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer mask;
		private final ModelRenderer Body;
		private final ModelRenderer cube_r4;
		private final ModelRenderer Tail;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;
		private final ModelRenderer LeftArm;
		private final ModelRenderer cube_r10;
		private final ModelRenderer RightArm;
		private final ModelRenderer cube_r11;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer cube_r12;
		private final ModelRenderer cube_r13;
		private final ModelRenderer cube_r14;
		private final ModelRenderer RightLeg;
		private final ModelRenderer cube_r15;
		private final ModelRenderer cube_r16;
		private final ModelRenderer cube_r17;
		public Modeldl_shark_model() {
			textureWidth = 128;
			textureHeight = 128;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.setTextureOffset(0, 16).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.5F, 0.0F, 0.0F);
			Head.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.3927F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(30, 50).addBox(-4.8F, -5.4F, 2.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			cube_r1.setTextureOffset(50, 50).addBox(2.8F, -5.4F, 2.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			cube_r1.setTextureOffset(38, 56).addBox(-1.0F, -7.4F, 3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.3927F, 0.0F);
			cube_r2.setTextureOffset(40, 34).addBox(3.1F, -2.1F, -1.9F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, -0.3927F, 0.0F);
			cube_r3.setTextureOffset(52, 38).addBox(-5.1F, -2.1F, -1.9F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			mask = new ModelRenderer(this);
			mask.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.addChild(mask);
			mask.setTextureOffset(0, 3).addBox(-5.0F, -4.0F, -4.1F, 2.0F, 1.0F, 0.0F, 0.0F, false);
			mask.setTextureOffset(21, 11).addBox(-3.0F, -3.0F, -4.1F, 6.0F, 2.0F, 0.0F, 0.0F, false);
			mask.setTextureOffset(10, 1).addBox(-2.0F, -1.0F, -4.1F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			mask.setTextureOffset(10, 2).addBox(1.0F, -1.0F, -4.1F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			mask.setTextureOffset(9, 0).addBox(3.0F, -4.0F, -4.1F, 2.0F, 1.0F, 0.0F, 0.0F, false);
			mask.setTextureOffset(0, 9).addBox(2.0F, -5.0F, -4.1F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			mask.setTextureOffset(21, 7).addBox(-2.0F, -6.0F, -4.1F, 4.0F, 2.0F, 0.0F, 0.0F, false);
			mask.setTextureOffset(24, 22).addBox(-1.0F, -8.0F, -4.1F, 2.0F, 2.0F, 0.0F, 0.0F, false);
			mask.setTextureOffset(6, 3).addBox(-1.0F, -4.0F, -4.1F, 2.0F, 1.0F, 0.0F, 0.0F, false);
			mask.setTextureOffset(0, 8).addBox(-3.0F, -5.0F, -4.1F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.setTextureOffset(0, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-0.5F, 0.0F, 0.0F);
			Body.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.5236F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(16, 48).addBox(0.0F, -0.75F, 1.75F, 1.0F, 4.0F, 6.0F, 0.0F, false);
			Tail = new ModelRenderer(this);
			Tail.setRotationPoint(0.0F, 0.0F, 0.0F);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.5F, 6.5063F, 7.4678F);
			Tail.addChild(cube_r5);
			setRotationAngle(cube_r5, -0.1745F, 0.5672F, 0.0F);
			cube_r5.setTextureOffset(21, 0).addBox(-6.4F, 8.25F, 7.75F, 5.0F, 1.0F, 10.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(-0.5F, 6.5063F, 7.4678F);
			Tail.addChild(cube_r6);
			setRotationAngle(cube_r6, -0.1745F, -0.5672F, 0.0F);
			cube_r6.setTextureOffset(22, 22).addBox(1.4F, 8.25F, 7.75F, 5.0F, 1.0F, 10.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(-0.5F, 6.5063F, 7.4678F);
			Tail.addChild(cube_r7);
			setRotationAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
			cube_r7.setTextureOffset(26, 11).addBox(-2.5F, 7.25F, 3.75F, 6.0F, 3.0F, 8.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(-0.5F, 0.0F, 0.0F);
			Tail.addChild(cube_r8);
			setRotationAngle(cube_r8, -0.7854F, 0.0F, 0.0F);
			cube_r8.setTextureOffset(0, 0).addBox(0.0F, 1.25F, 10.75F, 1.0F, 4.0F, 4.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(-0.5F, 0.0F, 0.0F);
			Tail.addChild(cube_r9);
			setRotationAngle(cube_r9, -0.5236F, 0.0F, 0.0F);
			cube_r9.setTextureOffset(0, 0).addBox(-1.5F, 7.25F, 3.75F, 4.0F, 3.0F, 13.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			LeftArm.setTextureOffset(40, 40).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 0).addBox(-3.0F, 10.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(6, 0).addBox(-3.0F, 10.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
			LeftArm.addChild(cube_r10);
			setRotationAngle(cube_r10, 0.0F, 0.0F, -0.5672F);
			cube_r10.setTextureOffset(0, 16).addBox(-5.5F, -2.7F, -1.0F, 3.0F, 6.0F, 1.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			RightArm.setTextureOffset(24, 33).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(28, 16).addBox(2.0F, 10.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(24, 16).addBox(2.0F, 10.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
			RightArm.addChild(cube_r11);
			setRotationAngle(cube_r11, 0.0F, 0.0F, 0.5672F);
			cube_r11.setTextureOffset(21, 0).addBox(2.5F, -2.7F, -1.0F, 3.0F, 6.0F, 1.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
			LeftLeg.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(0.0F, 9.8745F, 0.96F);
			LeftLeg.addChild(cube_r12);
			setRotationAngle(cube_r12, -1.5708F, 0.0F, 0.0F);
			cube_r12.setTextureOffset(24, 49).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			cube_r13 = new ModelRenderer(this);
			cube_r13.setRotationPoint(0.0F, 7.4835F, 1.8083F);
			LeftLeg.addChild(cube_r13);
			setRotationAngle(cube_r13, -0.6545F, 0.0F, 0.0F);
			cube_r13.setTextureOffset(54, 18).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
			cube_r14 = new ModelRenderer(this);
			cube_r14.setRotationPoint(0.0F, 6.0765F, -0.226F);
			LeftLeg.addChild(cube_r14);
			setRotationAngle(cube_r14, 0.48F, 0.0F, 0.0F);
			cube_r14.setTextureOffset(42, 22).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
			RightLeg.setTextureOffset(47, 7).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			cube_r15 = new ModelRenderer(this);
			cube_r15.setRotationPoint(0.0F, 9.8745F, 0.96F);
			RightLeg.addChild(cube_r15);
			setRotationAngle(cube_r15, -1.5708F, 0.0F, 0.0F);
			cube_r15.setTextureOffset(0, 8).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			cube_r16 = new ModelRenderer(this);
			cube_r16.setRotationPoint(0.0F, 7.4835F, 1.8083F);
			RightLeg.addChild(cube_r16);
			setRotationAngle(cube_r16, -0.6545F, 0.0F, 0.0F);
			cube_r16.setTextureOffset(41, 0).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
			cube_r17 = new ModelRenderer(this);
			cube_r17.setRotationPoint(0.0F, 6.0765F, -0.226F);
			RightLeg.addChild(cube_r17);
			setRotationAngle(cube_r17, 0.48F, 0.0F, 0.0F);
			cube_r17.setTextureOffset(48, 30).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
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
