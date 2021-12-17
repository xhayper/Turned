public static class Models_yufeng_h_model extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer cube_r1;

	public Models_yufeng_h_model() {
		textureWidth = 16;
		textureHeight = 16;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(4, 4).addBox(-4.0F, -11.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(3.0F, -11.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.3927F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(6, 0).addBox(2.0F, -13.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 7).addBox(2.0F, -11.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(8, 3).addBox(-3.0F, -13.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(8, 8).addBox(-3.0F, -11.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}