public static class Modelhertx_model_fb extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer Body;
	private final ModelRenderer Tail;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer RightLeg;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;

	public Modelhertx_model_fb() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -2.6F, -0.2F);
		Head.setTextureOffset(15, 13).addBox(-3.0F, -1.7F, -5.0F, 6.0F, 1.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(52, 41).addBox(-2.0F, -2.8F, -3.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		Head.setTextureOffset(58, 47).addBox(-2.0F, -6.8F, 2.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(0, 7).addBox(-2.0F, -2.8F, 3.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(58, 3).addBox(-3.0F, -2.8F, 2.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(38, 0).addBox(-2.5F, -0.8F, -2.4F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		Head.setTextureOffset(0, 17).addBox(2.0F, -6.8F, 2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(5, 16).addBox(-3.0F, -6.8F, 2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 27).addBox(-3.0F, -6.8F, -3.0F, 6.0F, 1.0F, 5.0F, 0.0F, false);
		Head.setTextureOffset(41, 57).addBox(2.0F, -5.8F, -4.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(49, 50).addBox(2.0F, -2.7F, -5.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(0, 56).addBox(-3.0F, -5.8F, -4.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(53, 0).addBox(-3.0F, -4.8F, -5.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 46).addBox(-3.0F, -2.7F, -5.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(58, 54).addBox(-2.0F, -5.8F, -5.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(0, 25).addBox(-2.0F, -6.8F, -4.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(10, 25).addBox(-2.0F, -2.7F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 3.0F, 0.0F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(15, 15).addBox(-3.0F, -8.3801F, 8.5093F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 0).addBox(-3.0F, -8.3801F, 10.5093F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(60, 27).addBox(-3.0F, -8.3801F, 4.5093F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 13).addBox(2.0F, -8.3801F, 8.5093F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 2).addBox(2.0F, -8.3801F, 10.5093F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 0).addBox(2.0F, -8.3801F, 4.5093F, 1.0F, 3.0F, 4.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(26, 8).addBox(-4.0F, 8.2F, -2.0F, 8.0F, 1.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(16, 0).addBox(-3.5F, 4.2F, -2.0F, 7.0F, 4.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(20, 21).addBox(-4.0F, -2.8F, -2.0F, 8.0F, 7.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(55, 58).addBox(-3.5F, -2.9875F, -2.75F, 7.0F, 5.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(15, 13).addBox(-1.0F, 3.0125F, -2.3125F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(16, 8).addBox(-3.0F, 2.0125F, -2.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, 0.0F, 0.0F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Tail.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 13).addBox(-1.3F, 9.2337F, 12.5679F, 3.0F, 3.0F, 9.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Tail.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 0).addBox(-1.3F, 3.4929F, 6.2929F, 3.0F, 3.0F, 10.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(-5.0625F, -1.0F, 0.0F);
		setRotationAngle(LeftArm, 0.0F, 0.0F, 0.0873F);
		LeftArm.setTextureOffset(42, 45).addBox(-1.7385F, -1.8114F, -2.0F, 3.0F, 8.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(41, 13).addBox(-2.7385F, 6.1886F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(16, 0).addBox(-2.7385F, 13.1886F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArm.setTextureOffset(6, 2).addBox(-2.7385F, 13.1886F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArm.setTextureOffset(6, 0).addBox(-0.7385F, 13.1886F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArm.setTextureOffset(4, 13).addBox(-2.7385F, 13.1886F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(5.0F, -1.0F, 0.0F);
		setRotationAngle(RightArm, 0.0F, 0.0F, -0.0873F);
		RightArm.setTextureOffset(28, 45).addBox(-1.2615F, -1.8114F, -2.0F, 3.0F, 8.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(34, 34).addBox(-1.2615F, 6.1886F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(16, 2).addBox(-0.2615F, 13.1886F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(0, 27).addBox(1.7385F, 13.1886F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(26, 10).addBox(1.7385F, 13.1886F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(0, 29).addBox(1.7385F, 13.1886F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(-2.0F, 10.0F, 0.0F);
		LeftLeg.setTextureOffset(57, 13).addBox(-2.0F, -0.8F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		LeftLeg.setTextureOffset(50, 34).addBox(-2.125F, 12.0F, -2.9102F, 4.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.0625F, 2.0F, 0.0F);
		LeftLeg.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.3927F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(27, 57).addBox(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.0625F, 2.0F, 0.0F);
		LeftLeg.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.7854F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(0, 33).addBox(-1.9375F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.0625F, 2.0F, 0.0F);
		LeftLeg.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(44, 24).addBox(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(2.0F, 10.0F, 0.0F);
		RightLeg.setTextureOffset(56, 20).addBox(-2.0F, -0.8F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		RightLeg.setTextureOffset(50, 6).addBox(-1.875F, 12.0F, -2.9102F, 4.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0625F, 2.0F, 0.0F);
		RightLeg.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(13, 53).addBox(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0625F, 2.0F, 0.0F);
		RightLeg.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.7854F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(18, 32).addBox(-2.0625F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0625F, 2.0F, 0.0F);
		RightLeg.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.3927F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(12, 43).addBox(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		Tail.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}