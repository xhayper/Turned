public static class Modelhertx_model_s1 extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer bone;
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

	public Modelhertx_model_s1() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.4F, -0.2F);
		Head.setTextureOffset(24, 0).addBox(-3.0F, -3.7F, -5.0F, 6.0F, 1.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(56, 47).addBox(-2.0F, -4.8F, -3.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		Head.setTextureOffset(18, 60).addBox(-2.0F, -8.8F, 2.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(42, 11).addBox(-2.0F, -4.8F, 3.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(14, 30).addBox(-3.0F, -4.8F, 2.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(24, 8).addBox(-3.0F, -2.8F, -2.9F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(24, 4).addBox(-1.0F, -2.55F, -3.15F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(36, 22).addBox(2.0F, -8.8F, 2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(35, 30).addBox(-3.0F, -8.8F, 2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(17, 22).addBox(-3.0F, -8.8F, -5.0F, 6.0F, 1.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(0, 53).addBox(2.0F, -7.8F, -5.0F, 1.0F, 3.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(25, 60).addBox(2.0F, -4.7F, -5.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(50, 30).addBox(-3.0F, -7.8F, -5.0F, 1.0F, 3.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(9, 60).addBox(-3.0F, -4.7F, -5.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(59, 28).addBox(-3.25F, -4.5125F, -4.625F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(58, 0).addBox(2.25F, -4.5125F, -4.625F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(20, 0).addBox(-2.0F, -7.8F, -5.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(28, 41).addBox(-2.0F, -4.7F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(54, 54).addBox(-1.0F, -4.5125F, -5.1875F, 2.0F, 2.0F, 6.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -8.3F, -1.5F);
		Head.addChild(bone);
		setRotationAngle(bone, 0.4276F, 0.0F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 1.125F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.4712F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 33).addBox(-3.125F, -7.4142F, 9.2505F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(67, 16).addBox(-3.125F, -7.4142F, 4.2505F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 0).addBox(2.125F, -7.4142F, 9.2505F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 63).addBox(2.125F, -7.4142F, 4.2505F, 1.0F, 3.0F, 5.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(0, 0).addBox(-4.0F, -1.8F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(0, 16).addBox(-3.0F, -0.05F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
		Body.setTextureOffset(48, 60).addBox(-4.25F, 3.2F, -3.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(34, 60).addBox(2.25F, 3.2F, -3.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(0, 28).addBox(-1.0F, 3.2F, -3.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(28, 39).addBox(-2.5F, 3.2F, 2.25F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(14, 33).addBox(-2.5F, 0.95F, 2.25F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(24, 8).addBox(2.8125F, 0.95F, 1.8125F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(18, 16).addBox(-3.8125F, 0.95F, 1.8125F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(18, 16).addBox(-4.5F, 4.2F, -2.5F, 9.0F, 1.0F, 5.0F, 0.0F, false);
		Body.setTextureOffset(53, 62).addBox(-3.5F, -2.05F, -2.5F, 1.0F, 6.0F, 5.0F, 0.0F, false);
		Body.setTextureOffset(41, 60).addBox(2.5F, -2.05F, -2.5F, 1.0F, 6.0F, 5.0F, 0.0F, false);

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, 0.0F, 0.0F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Tail.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3927F, 0.0F, 0.0F);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Tail.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 28).addBox(-1.3F, 4.2F, 7.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);
		cube_r3.setTextureOffset(22, 30).addBox(-1.3F, 5.2F, 15.0F, 3.0F, 2.0F, 7.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(0, 39).addBox(-3.0F, -3.8F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(54, 11).addBox(-3.0F, 4.2F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(45, 3).addBox(-3.25F, -4.05F, -2.5F, 4.0F, 3.0F, 5.0F, 0.0F, false);
		LeftArm.setTextureOffset(16, 39).addBox(-3.0F, 10.2F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArm.setTextureOffset(12, 39).addBox(-3.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArm.setTextureOffset(0, 39).addBox(-1.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArm.setTextureOffset(36, 27).addBox(-3.0F, 10.2F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(41, 17).addBox(-0.75F, -4.05F, -2.5F, 4.0F, 3.0F, 5.0F, 0.0F, false);
		RightArm.setTextureOffset(38, 38).addBox(-1.0F, -3.8F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(44, 50).addBox(-1.0F, 4.2F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(35, 35).addBox(0.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(22, 35).addBox(2.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(25, 34).addBox(2.0F, 10.2F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(4, 33).addBox(2.0F, 10.2F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(66, 8).addBox(-2.0F, -1.8F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		LeftLeg.setTextureOffset(0, 16).addBox(-1.625F, -1.8F, 1.75F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		LeftLeg.setTextureOffset(54, 40).addBox(-2.0F, 10.0F, -2.9102F, 4.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		LeftLeg.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.3927F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(67, 36).addBox(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		LeftLeg.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.7854F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(39, 26).addBox(-2.0F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		LeftLeg.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(28, 50).addBox(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(64, 53).addBox(-2.0F, -1.8F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		RightLeg.setTextureOffset(54, 21).addBox(-2.0F, 10.0F, -2.9102F, 4.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		RightLeg.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(65, 65).addBox(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		RightLeg.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.7854F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(16, 39).addBox(-2.0F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		RightLeg.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.3927F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(12, 50).addBox(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, 0.0F, false);
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