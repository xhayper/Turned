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

import net.mcreator.latexes.entity.AllydroppodEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class AllydroppodRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(AllydroppodEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelScientific_Drop_Pod(), 1.2000000000000002f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("latex:textures/scientific_drop_pod.png");
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
					.getBuffer(RenderType.getEyes(new ResourceLocation("latex:textures/scientific_drop_pod_glow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	public static class ModelScientific_Drop_Pod extends EntityModel<Entity> {
		private final ModelRenderer group;
		private final ModelRenderer Parachadute;
		private final ModelRenderer bone4;
		private final ModelRenderer bone3;
		private final ModelRenderer bone;
		private final ModelRenderer bone2;
		public ModelScientific_Drop_Pod() {
			textureWidth = 160;
			textureHeight = 160;
			group = new ModelRenderer(this);
			group.setRotationPoint(-8.0F, 16.0F, 8.0F);
			group.setTextureOffset(0, 0).addBox(-1.0F, -22.0F, -17.0F, 18.0F, 30.0F, 18.0F, 0.0F, false);
			group.setTextureOffset(76, 93).addBox(0.0F, -22.0F, -0.25F, 16.0F, 29.0F, 2.0F, 0.0F, false);
			group.setTextureOffset(0, 74).addBox(-1.5F, -29.0F, -17.5F, 19.0F, 7.0F, 19.0F, 0.0F, false);
			group.setTextureOffset(72, 0).addBox(-1.5F, 7.0F, -17.5F, 19.0F, 7.0F, 19.0F, 0.0F, false);
			Parachadute = new ModelRenderer(this);
			Parachadute.setRotationPoint(8.0F, -4.5F, -8.0F);
			group.addChild(Parachadute);
			Parachadute.setTextureOffset(69, 29).addBox(-12.5F, -45.0F, -9.5F, 25.0F, 5.0F, 19.0F, 0.0F, false);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(-0.5F, -34.0F, 0.5F);
			Parachadute.addChild(bone4);
			setRotationAngle(bone4, 0.0F, 0.0F, 0.2618F);
			bone4.setTextureOffset(69, 69).addBox(9.71F, -13.9898F, -10.0F, 25.0F, 5.0F, 19.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(0.5F, -34.0F, 0.5F);
			Parachadute.addChild(bone3);
			setRotationAngle(bone3, 0.0F, 0.0F, -0.2618F);
			bone3.setTextureOffset(0, 48).addBox(-34.71F, -13.9898F, -10.0F, 25.0F, 5.0F, 19.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(2.5F, -19.0F, -6.5F);
			Parachadute.addChild(bone);
			setRotationAngle(bone, 0.0F, 0.0F, -0.6545F);
			bone.setTextureOffset(12, 100).addBox(-10.0F, -31.0F, 4.0F, 1.0F, 25.0F, 5.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(-2.5F, -19.0F, -6.5F);
			Parachadute.addChild(bone2);
			setRotationAngle(bone2, 0.0F, 0.0F, 0.6545F);
			bone2.setTextureOffset(0, 100).addBox(9.0F, -31.0F, 4.0F, 1.0F, 25.0F, 5.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			group.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}
}
