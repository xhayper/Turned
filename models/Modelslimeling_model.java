public static class Modelslimeling_model extends EntityModel<Entity> {
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
	private final ModelRenderer RightLeg;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;

	public Modelslimeling_model() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-3.5F, -7.4F, -3.5F, 7.0F, 7.0F, 7.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -0.4F, 0.0F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.3927F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 44).addBox(-4.5F, -10.0F, -0.5F, 1.0F, 7.0F, 4.0F, 0.0F, false);
		cube_r1.setTextureOffset(46, 24).addBox(3.5F, -10.0F, -0.5F, 1.0F, 7.0F, 4.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(24, 10).addBox(-4.0F, -0.4F, -2.0F, 8.0F, 5.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(21, 0).addBox(-4.0F, 8.6F, -2.0F, 8.0F, 3.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(0, 26).addBox(-3.0F, 4.6F, -2.0F, 6.0F, 4.0F, 4.0F, 0.0F, false);

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, -0.4F, 0.0F);
		Body.addChild(Tail);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Tail.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 14).addBox(-2.0F, 11.05F, 11.8F, 4.0F, 2.0F, 10.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Tail.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(20, 20).addBox(-2.0F, 5.0F, 8.0F, 4.0F, 3.0F, 8.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(42, 43).addBox(-2.0F, -2.4F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(32, 32).addBox(-3.0F, 3.6F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(0, 20).addBox(-3.0F, 10.6F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArm.setTextureOffset(0, 3).addBox(0.0F, 10.6F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		LeftArm.setTextureOffset(18, 14).addBox(-3.0F, 10.6F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArm.setTextureOffset(18, 18).addBox(-3.0F, 10.6F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArm.setTextureOffset(18, 16).addBox(-3.0F, 10.6F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(28, 43).addBox(-1.0F, -2.4F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(16, 31).addBox(-1.0F, 3.6F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(0, 0).addBox(-1.0F, 10.6F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		RightArm.setTextureOffset(0, 18).addBox(1.0F, 10.6F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(0, 16).addBox(1.0F, 10.6F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(0, 14).addBox(1.0F, 10.6F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(12, 42).addBox(-2.0F, -0.4F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		LeftLeg.setTextureOffset(19, 52).addBox(-1.0F, 8.9896F, -2.7744F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 7.0398F, 2.347F);
		LeftLeg.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.7854F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(48, 12).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 4.6F, 0.0F);
		LeftLeg.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.3927F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(36, 19).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(0, 34).addBox(-2.0F, -0.4F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		RightLeg.setTextureOffset(7, 52).addBox(-2.0F, 8.9896F, -2.7744F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 7.0398F, 2.347F);
		RightLeg.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.7854F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(48, 35).addBox(-2.0F, 0.0F, -1.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 4.6F, 0.0F);
		RightLeg.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.3927F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(44, 3).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
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