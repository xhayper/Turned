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

import net.mcreator.latexes.item.CrystalbowItem;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class CrystalbowRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(CrystalbowItem.arrow, renderManager -> new CustomRender(renderManager));
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static class CustomRender extends EntityRenderer<CrystalbowItem.ArrowCustomEntity> {
		private static final ResourceLocation texture = new ResourceLocation("latex:textures/crystal_arrow_blk.png");
		public CustomRender(EntityRendererManager renderManager) {
			super(renderManager);
		}

		@Override
		public void render(CrystalbowItem.ArrowCustomEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
				IRenderTypeBuffer bufferIn, int packedLightIn) {
			IVertexBuilder vb = bufferIn.getBuffer(RenderType.getEntityCutout(this.getEntityTexture(entityIn)));
			matrixStackIn.push();
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90));
			matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90 + MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
			EntityModel model = new Modelcrystal_arrow_model();
			model.render(matrixStackIn, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
			matrixStackIn.pop();
			super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		}

		@Override
		public ResourceLocation getEntityTexture(CrystalbowItem.ArrowCustomEntity entity) {
			return texture;
		}
	}

	public static class Modelcrystal_arrow_model extends EntityModel<Entity> {
		private final ModelRenderer stick;
		private final ModelRenderer bone;
		private final ModelRenderer arrowhead;
		private final ModelRenderer bone2;
		public Modelcrystal_arrow_model() {
			textureWidth = 16;
			textureHeight = 16;
			stick = new ModelRenderer(this);
			stick.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(stick, 0, 0, -1.0F, -2.0F, 0.0F, 2, 0, 1, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 0.0F, 0.0F);
			stick.addChild(bone);
			setRotationAngle(bone, -90.0F, 0.0F, 0.0F);
			addBoxHelper(bone, 0, 0, -1.0F, -0.5F, -2.5F, 2, 0, 1, 0.0F, false);
			arrowhead = new ModelRenderer(this);
			arrowhead.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(arrowhead, 0, 6, -2.0F, -2.0F, 0.0F, 1, 0, 1, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, -3.0F, -2.0F);
			arrowhead.addChild(bone2);
			setRotationAngle(bone2, -90.0F, 0.0F, 0.0F);
			addBoxHelper(bone2, 0, 6, -2.0F, -2.5F, 0.5F, 1, 0, 1, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			stick.render(ms, vb, i1, i2, f1, f2, f3, f4);
			bone.render(ms, vb, i1, i2, f1, f2, f3, f4);
			arrowhead.render(ms, vb, i1, i2, f1, f2, f3, f4);
			bone2.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}
	@OnlyIn(Dist.CLIENT)
	public static void addBoxHelper(ModelRenderer renderer, int texU, int texV, float x, float y, float z, int dx, int dy, int dz, float delta) {
		addBoxHelper(renderer, texU, texV, x, y, z, dx, dy, dz, delta, renderer.mirror);
	}

	@OnlyIn(Dist.CLIENT)
	public static void addBoxHelper(ModelRenderer renderer, int texU, int texV, float x, float y, float z, int dx, int dy, int dz, float delta,
			boolean mirror) {
		renderer.mirror = mirror;
		renderer.addBox("", x, y, z, dx, dy, dz, delta, texU, texV);
	}
}
