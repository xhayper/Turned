public static class Modelyufengbody_model extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;

	public Modelyufengbody_model() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(6, 6).addBox(1.0F, 2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		Body.setTextureOffset(14, 0).addBox(-1.25F, 17.6466F, 12.6581F, 2.0F, 2.0F, 5.0F, 0.0F, false);
		Body.setTextureOffset(4, 6).addBox(-2.0F, 2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		Body.setTextureOffset(2, 11).addBox(2.0F, 1.0F, 2.25F, 1.0F, 5.0F, 0.0F, 0.0F, false);
		Body.setTextureOffset(0, 11).addBox(-3.0F, 1.0F, 2.25F, 1.0F, 5.0F, 0.0F, 0.0F, false);
		Body.setTextureOffset(6, 0).addBox(3.0F, 1.0F, 2.5F, 1.0F, 6.0F, 0.0F, 0.0F, false);
		Body.setTextureOffset(4, 0).addBox(-4.0F, 1.0F, 2.5F, 1.0F, 6.0F, 0.0F, 0.0F, false);
		Body.setTextureOffset(2, 0).addBox(4.0F, 1.0F, 2.5F, 1.0F, 7.0F, 0.0F, 0.0F, false);
		Body.setTextureOffset(0, 0).addBox(-5.0F, 1.0F, 2.5F, 1.0F, 7.0F, 0.0F, 0.0F, false);
		Body.setTextureOffset(22, 22).addBox(5.0F, 0.0F, 2.75F, 1.0F, 9.0F, 0.0F, 0.0F, false);
		Body.setTextureOffset(20, 22).addBox(-6.0F, 0.0F, 2.75F, 1.0F, 9.0F, 0.0F, 0.0F, false);
		Body.setTextureOffset(14, 22).addBox(6.0F, 0.0F, 2.75F, 1.0F, 11.0F, 0.0F, 0.0F, false);
		Body.setTextureOffset(12, 22).addBox(-7.0F, 0.0F, 2.75F, 1.0F, 11.0F, 0.0F, 0.0F, false);
		Body.setTextureOffset(18, 22).addBox(7.0F, -1.0F, 2.75F, 1.0F, 10.0F, 0.0F, 0.0F, false);
		Body.setTextureOffset(16, 22).addBox(-8.0F, -1.0F, 2.75F, 1.0F, 10.0F, 0.0F, 0.0F, false);
		Body.setTextureOffset(2, 22).addBox(10.0F, -2.0F, 2.75F, 1.0F, 15.0F, 0.0F, 0.0F, false);
		Body.setTextureOffset(0, 22).addBox(-11.0F, -2.0F, 2.75F, 1.0F, 15.0F, 0.0F, 0.0F, false);
		Body.setTextureOffset(6, 11).addBox(9.0F, 13.0F, 2.75F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Body.setTextureOffset(2, 7).addBox(-10.0F, 13.0F, 2.75F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Body.setTextureOffset(4, 11).addBox(5.0F, 11.0F, 2.75F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Body.setTextureOffset(0, 7).addBox(-6.0F, 11.0F, 2.75F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Body.setTextureOffset(8, 22).addBox(9.0F, -3.0F, 2.75F, 1.0F, 14.0F, 0.0F, 0.0F, false);
		Body.setTextureOffset(6, 22).addBox(-10.0F, -3.0F, 2.75F, 1.0F, 14.0F, 0.0F, 0.0F, false);
		Body.setTextureOffset(10, 22).addBox(8.0F, -4.0F, 2.75F, 1.0F, 14.0F, 0.0F, 0.0F, false);
		Body.setTextureOffset(4, 22).addBox(-9.0F, -4.0F, 2.75F, 1.0F, 14.0F, 0.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-1.5F, 11.0F, 11.5F, 3.0F, 3.0F, 8.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.7854F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 11).addBox(-1.5F, 5.5F, 8.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(0.0F, 24.0F, 0.0F);
		LeftArm.setTextureOffset(60, 0).addBox(-8.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(0.0F, 24.0F, 0.0F);
		RightArm.setTextureOffset(60, 0).addBox(7.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
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