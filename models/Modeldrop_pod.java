public static class Modeldrop_pod extends EntityModel<Entity> {
	private final ModelRenderer Drop_pod;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone2;
	private final ModelRenderer bone5;

	public Modeldrop_pod() {
		textureWidth = 256;
		textureHeight = 256;

		Drop_pod = new ModelRenderer(this);
		Drop_pod.setRotationPoint(0.0F, 24.0F, 0.0F);
		Drop_pod.setTextureOffset(44, 44).addBox(-10.0F, -7.0F, -10.0F, 20.0F, 5.0F, 20.0F, 0.0F, false);
		Drop_pod.setTextureOffset(32, 46).addBox(-3.0F, -48.0F, -3.0F, 6.0F, 11.0F, 6.0F, 0.0F, false);
		Drop_pod.setTextureOffset(72, 0).addBox(-1.0F, -65.0F, -1.0F, 2.0F, 17.0F, 2.0F, 0.0F, false);
		Drop_pod.setTextureOffset(0, 0).addBox(-8.0F, -37.0F, -8.0F, 16.0F, 30.0F, 16.0F, 0.0F, false);
		Drop_pod.setTextureOffset(114, 57).addBox(6.0F, -38.0F, -6.0F, 3.0F, 31.0F, 12.0F, 0.0F, false);
		Drop_pod.setTextureOffset(126, 126).addBox(-6.0F, -38.0F, -9.0F, 12.0F, 31.0F, 3.0F, 0.0F, false);
		Drop_pod.setTextureOffset(96, 96).addBox(-9.0F, -38.0F, -6.0F, 3.0F, 31.0F, 12.0F, 0.0F, false);
		Drop_pod.setTextureOffset(29, 139).addBox(-6.0F, -38.0F, 6.0F, 12.0F, 31.0F, 3.0F, 0.0F, false);
		Drop_pod.setTextureOffset(64, 0).addBox(-10.0F, -2.0F, -10.0F, 20.0F, 2.0F, 20.0F, 0.0F, false);
		Drop_pod.setTextureOffset(64, 22).addBox(-6.0F, 0.0F, -6.0F, 12.0F, 2.0F, 12.0F, 0.0F, false);
		Drop_pod.setTextureOffset(48, 0).addBox(-3.0F, 2.0F, -3.0F, 6.0F, 2.0F, 6.0F, 0.0F, false);
		Drop_pod.setTextureOffset(0, 0).addBox(-1.0F, 4.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		Drop_pod.setTextureOffset(104, 45).addBox(-10.0F, -2.0F, 10.0F, 20.0F, 3.0F, 2.0F, 0.0F, false);
		Drop_pod.setTextureOffset(104, 22).addBox(-12.0F, -2.0F, -10.0F, 2.0F, 3.0F, 20.0F, 0.0F, false);
		Drop_pod.setTextureOffset(64, 36).addBox(-10.0F, -2.0F, -12.0F, 20.0F, 3.0F, 2.0F, 0.0F, false);
		Drop_pod.setTextureOffset(32, 116).addBox(10.0F, -2.0F, -10.0F, 2.0F, 3.0F, 20.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, 1.0F);
		Drop_pod.addChild(bone3);
		setRotationAngle(bone3, -0.0873F, 0.0F, 0.0F);
		bone3.setTextureOffset(64, 69).addBox(-7.0F, -45.4809F, -13.89F, 14.0F, 45.0F, 2.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(1.0F, 0.0F, 0.0F);
		Drop_pod.addChild(bone4);
		setRotationAngle(bone4, -0.0873F, 1.5708F, 0.0F);
		bone4.setTextureOffset(32, 69).addBox(-7.0F, -45.4809F, -13.89F, 14.0F, 45.0F, 2.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 1.0F);
		Drop_pod.addChild(bone2);
		setRotationAngle(bone2, 0.0873F, 0.0F, 0.0F);
		bone2.setTextureOffset(0, 93).addBox(-7.0F, -45.4809F, 9.89F, 14.0F, 45.0F, 2.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 0.0F, 1.0F);
		Drop_pod.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 1.5708F, -0.0873F);
		bone5.setTextureOffset(0, 46).addBox(-6.0F, -45.3937F, 10.8862F, 14.0F, 45.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Drop_pod.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Drop_pod.rotateAngleY = f2 / 20.f;
	}
}