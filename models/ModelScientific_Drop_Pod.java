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
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		group.render(matrixStack, buffer, packedLight, packedOverlay);
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