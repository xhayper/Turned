public static class Modeldl_slug_model extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer leftarm;
	private final ModelRenderer Rightarm;

	public Modeldl_slug_model() {
		textureWidth = 32;
		textureHeight = 32;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 21.0F, -4.25F);
		Head.setTextureOffset(0, 12).addBox(-2.0F, -3.0F, -2.75F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(19, 4).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 1.0F, 0.0F, 0.0F, false);
		Head.setTextureOffset(2, 5).addBox(2.0F, -2.0F, -3.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Head.setTextureOffset(19, 5).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 1.0F, 0.0F, 0.0F, false);
		Head.setTextureOffset(4, 3).addBox(1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Head.setTextureOffset(4, 4).addBox(-2.0F, 0.0F, -3.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Head.setTextureOffset(0, 4).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 1.0F, 0.0F, 0.0F, false);
		Head.setTextureOffset(0, 5).addBox(-3.0F, -2.0F, -3.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Head.setTextureOffset(0, 3).addBox(-1.0F, -4.0F, -3.0F, 2.0F, 1.0F, 0.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 21.0F, -4.25F);
		Body.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, -0.75F, 6.0F, 5.0F, 7.0F, 0.0F, false);
		Body.setTextureOffset(16, 16).addBox(-2.0F, -1.0F, 6.25F, 4.0F, 4.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(0, 20).addBox(-1.0F, 0.0F, 8.25F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(0, 0).addBox(-1.0F, 1.0F, 10.25F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(2.0F, 23.0F, -3.0F);
		leftarm.setTextureOffset(19, 0).addBox(1.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		Rightarm = new ModelRenderer(this);
		Rightarm.setRotationPoint(-2.0F, 23.0F, -3.0F);
		Rightarm.setTextureOffset(12, 12).addBox(-4.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		Rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Rightarm.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.leftarm.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
	}
}