public static class Modelhertx_model extends EntityModel<Entity> {
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

	public Modelhertx_model() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.4F, -0.2F);
		Head.setTextureOffset(24, 24).addBox(-3.0F, -3.7F, -5.0F, 6.0F, 1.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(18, 54).addBox(-2.0F, -4.8F, -3.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		Head.setTextureOffset(0, 60).addBox(-2.0F, -8.8F, 2.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(20, 16).addBox(-2.0F, -4.8F, 3.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(19, 8).addBox(-3.0F, -4.8F, 2.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(24, 16).addBox(-3.0F, -2.8F, -2.9F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(7, 0).addBox(2.0F, -8.8F, 2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(-3.0F, -8.8F, 2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(19, 0).addBox(-3.0F, -8.8F, -5.0F, 6.0F, 1.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(50, 8).addBox(2.0F, -7.8F, -5.0F, 1.0F, 3.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(32, 8).addBox(2.0F, -4.7F, -5.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(48, 29).addBox(-3.0F, -7.8F, -5.0F, 1.0F, 3.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(57, 57).addBox(-3.0F, -4.7F, -5.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(0, 8).addBox(-2.0F, -7.8F, -5.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(13, 32).addBox(-2.0F, -4.7F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(19, 0).addBox(-3.0F, -7.4142F, 9.2505F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 0).addBox(-3.0F, -7.4142F, 4.2505F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 16).addBox(2.0F, -7.4142F, 9.2505F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(14, 60).addBox(2.0F, -7.4142F, 4.2505F, 1.0F, 3.0F, 5.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(0, 16).addBox(-4.0F, -1.8F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(52, 39).addBox(-4.0F, -1.8F, -3.0F, 8.0F, 6.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(19, 11).addBox(-3.0F, 4.2F, -3.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, 0.0F, 0.0F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Tail.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 32).addBox(-1.3F, 11.3026F, 15.6391F, 3.0F, 3.0F, 7.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Tail.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 0).addBox(-1.3F, 4.2F, 7.0F, 3.0F, 3.0F, 13.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(36, 36).addBox(-3.0F, -3.8F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(16, 44).addBox(-3.0F, 4.2F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(24, 26).addBox(-3.0F, 10.2F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArm.setTextureOffset(24, 19).addBox(-3.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArm.setTextureOffset(22, 4).addBox(-1.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArm.setTextureOffset(24, 24).addBox(-3.0F, 10.2F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(20, 32).addBox(-1.0F, -3.8F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(44, 19).addBox(-1.0F, 4.2F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(22, 2).addBox(0.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(19, 3).addBox(2.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(9, 11).addBox(2.0F, 10.2F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(19, 5).addBox(2.0F, 10.2F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(59, 7).addBox(-2.0F, -1.8F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		LeftLeg.setTextureOffset(0, 53).addBox(-2.0F, 10.0F, -2.9102F, 4.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		LeftLeg.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.3927F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(57, 26).addBox(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		LeftLeg.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.7854F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(41, 4).addBox(-2.0F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		LeftLeg.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(32, 48).addBox(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(47, 58).addBox(-2.0F, -1.8F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		RightLeg.setTextureOffset(53, 0).addBox(-2.0F, 10.0F, -2.9102F, 4.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		RightLeg.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(33, 58).addBox(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		RightLeg.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.7854F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(0, 42).addBox(-2.0F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		RightLeg.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.3927F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(48, 48).addBox(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, 0.0F, false);
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