package net.mcreator.latexes.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.mcreator.latexes.item.LatexDartRifleItem;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class LatexDartRifleRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(LatexDartRifleItem.arrow, renderManager -> new CustomRender(renderManager));
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static class CustomRender extends EntityRenderer<LatexDartRifleItem.ArrowCustomEntity> {
		private static final ResourceLocation texture = new ResourceLocation("latex:textures/latexdart.png");
		public CustomRender(EntityRendererManager renderManager) {
			super(renderManager);
		}

		@Override
		public void render(LatexDartRifleItem.ArrowCustomEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
				IRenderTypeBuffer bufferIn, int packedLightIn) {
			IVertexBuilder vb = bufferIn.getBuffer(RenderType.getEntityCutout(this.getEntityTexture(entityIn)));
			matrixStackIn.push();
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90));
			matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90 + MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
			EntityModel model = new Modellatex_dart();
			model.render(matrixStackIn, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
			matrixStackIn.pop();
			super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		}

		@Override
		public ResourceLocation getEntityTexture(LatexDartRifleItem.ArrowCustomEntity entity) {
			return texture;
		}
	}

	public static class Modellatex_dart extends EntityModel<Entity> {
		private final ModelRenderer bone;
		public Modellatex_dart() {
			textureWidth = 16;
			textureHeight = 16;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone.setTextureOffset(3, 2).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(0.0F, -1.5F, 0.25F, 0.0F, 2.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(3, 3).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(-1.0F, -0.5F, 0.25F, 2.0F, 0.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}
}
