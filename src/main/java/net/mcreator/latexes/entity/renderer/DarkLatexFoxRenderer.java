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

import net.mcreator.latexes.entity.DarkLatexFoxEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class DarkLatexFoxRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(DarkLatexFoxEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modeldl_fox_model(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("latex:textures/darklatexfoxtexture.png");
					}
				};
			});
		}
	}

	public static class Modeldl_fox_model extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer Mask;
		private final ModelRenderer Body;
		private final ModelRenderer Tail;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer RightLeg;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		public Modeldl_fox_model() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.setTextureOffset(47, 39).addBox(-2.0F, -2.9F, -6.5F, 4.0F, 3.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(0, 16).addBox(-4.0F, -7.0F, -3.5F, 8.0F, 7.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(20, 0).addBox(-4.0F, -10.0F, -0.5F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(0, 3).addBox(1.0F, -10.0F, -0.5F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			Mask = new ModelRenderer(this);
			Mask.setRotationPoint(0.0F, 0.0F, 0.5F);
			Head.addChild(Mask);
			Mask.setTextureOffset(0, 11).addBox(-2.0F, -7.2F, -4.2F, 4.0F, 1.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(0, 8).addBox(-3.0F, -6.2F, -4.2F, 6.0F, 1.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(0, 19).addBox(-1.0F, -5.2F, -4.2F, 2.0F, 2.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(20, 5).addBox(-2.0F, -3.2F, -7.2F, 4.0F, 2.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(0, 4).addBox(-2.0F, -1.2F, -7.2F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(8, 3).addBox(1.0F, -1.2F, -7.2F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(4, 19).addBox(2.0F, -3.2F, -4.2F, 1.0F, 3.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(0, 0).addBox(3.0F, -5.2F, -4.2F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(0, 6).addBox(2.1F, -3.2F, -7.2F, 0.0F, 2.0F, 3.0F, 0.0F, false);
			Mask.setTextureOffset(6, 6).addBox(-2.1F, -3.2F, -7.2F, 0.0F, 2.0F, 3.0F, 0.0F, false);
			Mask.setTextureOffset(20, 7).addBox(-3.0F, -3.2F, -4.2F, 1.0F, 3.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(10, 3).addBox(-4.0F, -5.2F, -4.2F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			Mask.setTextureOffset(0, 0).addBox(-2.0F, -3.3F, -7.2F, 4.0F, 0.0F, 3.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.setTextureOffset(26, 26).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			Tail = new ModelRenderer(this);
			Tail.setRotationPoint(0.0F, 23.0F, -5.2F);
			setRotationAngle(Tail, -0.3927F, 0.0F, 0.0F);
			Tail.setTextureOffset(0, 16).addBox(-1.0F, -14.0F, 2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			Tail.setTextureOffset(0, 0).addBox(-2.0F, -15.0F, 3.0F, 4.0F, 4.0F, 12.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			LeftArm.setTextureOffset(32, 0).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			RightArm.setTextureOffset(0, 30).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 4.6268F, 1.6794F);
			LeftLeg.addChild(cube_r1);
			cube_r1.setTextureOffset(46, 23).addBox(-2.0F, 4.3732F, -4.2794F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 4.6268F, 2.2794F);
			LeftLeg.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(46, 0).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 7.0F, 3.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 2.5637F, -2.5296F);
			LeftLeg.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.7854F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(14, 38).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, -0.8F, 0.2F);
			LeftLeg.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.3927F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(46, 46).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 4.6268F, 1.6794F);
			RightLeg.addChild(cube_r5);
			cube_r5.setTextureOffset(30, 19).addBox(-2.0F, 4.3732F, -4.2794F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, 4.6268F, 2.2794F);
			RightLeg.addChild(cube_r6);
			setRotationAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(0, 47).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 7.0F, 3.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(0.0F, 2.5637F, -2.5296F);
			RightLeg.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.7854F, 0.0F, 0.0F);
			cube_r7.setTextureOffset(30, 42).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(0.0F, -0.8F, 0.2F);
			RightLeg.addChild(cube_r8);
			setRotationAngle(cube_r8, -0.3927F, 0.0F, 0.0F);
			cube_r8.setTextureOffset(42, 13).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
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
