public static class Modelrespirator_model extends EntityModel<Entity> {
	private final ModelRenderer Head;

	public Modelrespirator_model() {
		textureWidth = 32;
		textureHeight = 32;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -3.0F, -5.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 7).addBox(-3.0F, -6.0F, -5.0F, 6.0F, 3.0F, 0.0F, 0.0F, false);
		Head.setTextureOffset(0, 10).addBox(-2.0F, -3.0F, -6.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 14).addBox(2.0F, -3.0F, -7.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(10, 10).addBox(-4.0F, -3.0F, -7.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(0, 4).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 4).addBox(-4.0F, -3.0F, -5.0F, 8.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(12, 15).addBox(-4.0F, -6.0F, -5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(8, 15).addBox(3.0F, -6.0F, -5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
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