// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modeldark_latex_quiver extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3R;
	private final ModelRenderer bone4L;

	public Modeldark_latex_quiver() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-4.0F, 0.25F, 0.0F);
		Body.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, -0.3927F);
		bone.setTextureOffset(10, 10).addBox(0.1913F, -0.4619F, 5.25F, 4.0F, 12.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(20, 6).addBox(0.1913F, -0.4619F, 3.25F, 1.0F, 12.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 19).addBox(1.1913F, 0.5381F, 3.25F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(20, 20).addBox(3.1913F, -0.4619F, 3.25F, 1.0F, 12.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 6).addBox(0.1913F, -0.4619F, 2.25F, 4.0F, 12.0F, 1.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(6.2716F, 0.8981F, -0.25F);
		bone.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, 1.1781F);
		bone2.setTextureOffset(0, 3).addBox(-4.0F, 4.0F, -2.0F, 12.0F, 2.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(0, 0).addBox(-4.0F, 4.0F, 2.0F, 12.0F, 2.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(8, 23).addBox(-4.0F, 4.0F, -1.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone2.setTextureOffset(24, 3).addBox(7.0F, 4.0F, -1.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone3R = new ModelRenderer(this);
		bone3R.setRotationPoint(-6.0F, 3.0F, 0.0F);
		Body.addChild(bone3R);
		bone3R.setTextureOffset(60, 0).addBox(12.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone4L = new ModelRenderer(this);
		bone4L.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(bone4L);
		bone4L.setTextureOffset(60, 0).addBox(-7.0F, 2.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}