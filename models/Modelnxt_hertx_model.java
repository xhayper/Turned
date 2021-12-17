public static class Modelnxt_hertx_model extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Jaw;
	private final ModelRenderer bone2;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer Body;
	private final ModelRenderer Tail;
	private final ModelRenderer cube_r10;
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

	public Modelnxt_hertx_model() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -2.0F, 0.0F);
		Head.setTextureOffset(46, 33).addBox(-2.0F, -3.4F, -3.2F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		Head.setTextureOffset(58, 12).addBox(-2.0F, -7.4F, 1.8F, 4.0F, 4.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(24, 18).addBox(-2.0F, -3.4F, 2.8F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(62, 64).addBox(-3.0F, -3.4F, 1.8F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(22, 11).addBox(-3.0F, -1.4F, -3.1F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(20, 14).addBox(-1.5F, -0.4F, -2.85F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(16, 33).addBox(-3.5F, -6.4F, 1.8F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(31, 0).addBox(2.5F, -6.4F, 1.8F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(30, 39).addBox(2.0F, -7.4F, 1.8F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 45).addBox(-3.0F, -7.4F, 1.8F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(31, 0).addBox(-3.0F, -7.4F, -3.2F, 6.0F, 1.0F, 5.0F, 0.0F, false);
		Head.setTextureOffset(10, 50).addBox(2.0F, -6.4F, -4.2F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(34, 48).addBox(-3.0F, -6.4F, -4.2F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(0, 7).addBox(-2.0F, -6.4F, -4.2F, 4.0F, 3.0F, 1.0F, 0.0F, false);

		Jaw = new ModelRenderer(this);
		Jaw.setRotationPoint(0.0F, -3.0F, 2.0F);
		Head.addChild(Jaw);
		Jaw.setTextureOffset(30, 57).addBox(2.0F, -0.3F, -6.2F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		Jaw.setTextureOffset(31, 6).addBox(-2.0F, -0.3F, -6.2F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Jaw.setTextureOffset(16, 33).addBox(-3.0F, 0.7F, -5.2F, 6.0F, 1.0F, 5.0F, 0.0F, false);
		Jaw.setTextureOffset(0, 56).addBox(-3.0F, -0.3F, -6.2F, 1.0F, 1.0F, 6.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 29.0F, -2.0F);
		Jaw.addChild(bone2);
		setRotationAngle(bone2, -0.7854F, 0.0F, 0.0F);
		bone2.setTextureOffset(33, 33).addBox(-3.0F, -18.0413F, -22.5668F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(36, 46).addBox(-3.0F, -18.0413F, -22.981F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 26.0F, 0.0F);
		Head.addChild(bone);
		setRotationAngle(bone, 0.7854F, 0.0F, 0.0F);
		bone.setTextureOffset(38, 59).addBox(-3.0F, -25.8801F, 19.9404F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(58, 46).addBox(-3.0F, -25.8801F, 20.3546F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 2.4F, -0.2F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(33, 35).addBox(-2.9F, -8.7665F, 9.6128F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(9, 59).addBox(-2.9F, -8.7665F, 4.6128F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(12, 30).addBox(1.9F, -8.7665F, 9.6128F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 30).addBox(-3.4F, -7.4142F, 8.2505F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 14).addBox(2.4F, -7.4142F, 8.2505F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(58, 48).addBox(1.9F, -8.7665F, 4.6128F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 63).addBox(-3.4F, -7.4142F, 4.2505F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 0).addBox(2.4F, -7.4142F, 4.2505F, 1.0F, 3.0F, 4.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, -2.0F, 0.0F);
		Body.setTextureOffset(0, 14).addBox(-4.0F, -0.8F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(59, 30).addBox(-3.0F, 0.2F, -3.0F, 6.0F, 5.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(48, 0).addBox(-4.0F, 0.2F, 2.0F, 8.0F, 4.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(6, 0).addBox(3.0F, 0.2F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(0, 0).addBox(-4.0F, 0.2F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(50, 61).addBox(3.0F, -1.8F, -2.5F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		Body.setTextureOffset(21, 61).addBox(-4.0F, -1.8F, -2.5F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		Body.setTextureOffset(24, 39).addBox(-1.0F, 1.2F, -3.25F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(0, 56).addBox(-2.5F, 5.2F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(42, 18).addBox(0.5F, 5.2F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, -2.0F, 0.0F);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 2.0F, 0.0F);
		Tail.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
		cube_r10.setTextureOffset(17, 0).addBox(-1.3F, 15.4952F, 16.7033F, 3.0F, 3.0F, 8.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 2.0F, 0.0F);
		Tail.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(16, 22).addBox(-1.3F, 9.6164F, 13.4918F, 3.0F, 3.0F, 8.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 2.0F, 0.0F);
		Tail.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 0).addBox(-1.3F, 3.4929F, 6.2929F, 3.0F, 3.0F, 11.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(-5.0F, 0.0F, 0.0F);
		LeftArm.setTextureOffset(30, 18).addBox(-3.0F, -2.8F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(20, 55).addBox(-3.0F, 5.2F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(17, 0).addBox(-3.25F, 5.2F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		LeftArm.setTextureOffset(46, 16).addBox(-3.0F, 7.2F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(18, 54).addBox(-3.0F, 11.2F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArm.setTextureOffset(52, 5).addBox(-3.0F, 11.2F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArm.setTextureOffset(6, 42).addBox(-1.0F, 11.2F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		LeftArm.setTextureOffset(18, 52).addBox(-3.0F, 11.2F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(0, 30).addBox(-1.0F, -4.8F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(54, 24).addBox(-1.0F, 3.2F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(24, 46).addBox(-1.0F, 5.2F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(0, 42).addBox(0.0F, 9.2F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		RightArm.setTextureOffset(18, 50).addBox(1.0F, 9.2F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(42, 48).addBox(1.0F, 9.2F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(28, 44).addBox(1.0F, 9.2F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(17, 4).addBox(2.25F, 3.2F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(-2.0F, 10.0F, 0.0F);
		LeftLeg.setTextureOffset(44, 53).addBox(-2.0F, -0.8F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		LeftLeg.setTextureOffset(45, 45).addBox(-2.0F, 11.0F, -3.4102F, 4.0F, 3.0F, 5.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 2.0F, 0.0F);
		LeftLeg.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.3927F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(57, 57).addBox(-2.0F, 3.3F, 3.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
		cube_r4.setTextureOffset(62, 36).addBox(-2.0F, 7.3F, 3.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r4.setTextureOffset(41, 61).addBox(-2.0F, 8.3F, 3.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 2.0F, 0.0F);
		LeftLeg.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.7854F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(12, 39).addBox(-2.0F, -0.5848F, -5.0633F, 4.0F, 7.0F, 4.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 2.0F, 0.0F);
		LeftLeg.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(0, 46).addBox(-2.0F, -1.5045F, -2.4584F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(2.0F, 10.0F, 0.0F);
		RightLeg.setTextureOffset(50, 39).addBox(-2.0F, -0.8F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		RightLeg.setTextureOffset(41, 25).addBox(-2.0F, 11.0F, -3.4102F, 4.0F, 3.0F, 5.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 2.0F, 0.0F);
		RightLeg.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(56, 5).addBox(-2.0F, 3.3F, 3.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
		cube_r7.setTextureOffset(63, 42).addBox(-2.0F, 7.3F, 3.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r7.setTextureOffset(62, 19).addBox(-2.0F, 8.3F, 3.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 2.0F, 0.0F);
		RightLeg.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.7854F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(34, 35).addBox(-2.0F, -0.5848F, -5.0633F, 4.0F, 7.0F, 4.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 2.0F, 0.0F);
		RightLeg.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.3927F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(40, 6).addBox(-2.0F, -1.5045F, -2.4584F, 4.0F, 6.0F, 4.0F, 0.0F, false);
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