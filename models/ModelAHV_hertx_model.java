public static class ModelAHV_hertx_model extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer Body;
	private final ModelRenderer Tail;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r10;
	private final ModelRenderer uppertailjaw;
	private final ModelRenderer lowertailjaw;
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

	public ModelAHV_hertx_model() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -1.0F, 0.0F);
		Head.setTextureOffset(21, 8).addBox(-3.0F, -2.3F, -5.2F, 6.0F, 1.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(56, 43).addBox(-2.0F, -3.4F, -3.2F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		Head.setTextureOffset(16, 66).addBox(-2.0F, -7.4F, 1.8F, 4.0F, 4.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(38, 0).addBox(-2.0F, -3.4F, 2.8F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(30, 59).addBox(-3.0F, -3.4F, 1.8F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(24, 16).addBox(-3.0F, -1.4F, -3.1F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(3, 4).addBox(2.0F, -7.4F, 1.8F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(-3.0F, -7.4F, 1.8F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(19, 0).addBox(-3.0F, -7.4F, -5.2F, 6.0F, 1.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(50, 22).addBox(2.0F, -6.4F, -5.2F, 1.0F, 3.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(55, 5).addBox(2.0F, -3.3F, -5.2F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(41, 29).addBox(-3.0F, -6.4F, -5.2F, 1.0F, 3.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(53, 53).addBox(-3.0F, -3.3F, -5.2F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(32, 38).addBox(-2.0F, -6.4F, -5.2F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(20, 16).addBox(-2.0F, -3.3F, -5.2F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 1.4F, -0.2F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 14).addBox(-3.0F, -7.4142F, 9.2505F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(69, 39).addBox(-3.0F, -7.4142F, 4.2505F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(4, 0).addBox(2.0F, -7.4142F, 9.2505F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(46, 65).addBox(2.0F, -7.4142F, 4.2505F, 1.0F, 3.0F, 5.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, -1.0F, 0.0F);
		Body.setTextureOffset(0, 14).addBox(-4.0F, -0.8F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(0, 58).addBox(-4.0F, -0.8F, -3.0F, 8.0F, 6.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(43, 23).addBox(-3.0F, -0.8F, -3.3F, 6.0F, 5.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(66, 28).addBox(-3.0F, 5.2F, -2.6F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, 11.0F, 1.0F);
		Body.addChild(Tail);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.5F, -9.0F, -4.0F);
		Tail.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(17, 36).addBox(-2.3F, 6.7384F, 3.3388F, 4.0F, 4.0F, 7.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.5F, -9.0F, -4.0F);
		Tail.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.7854F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 0).addBox(-2.8F, 9.9039F, -0.2825F, 5.0F, 5.0F, 9.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.5F, -9.0F, -4.0F);
		Tail.addChild(cube_r10);
		setRotationAngle(cube_r10, 1.5708F, 0.0F, 0.0F);
		cube_r10.setTextureOffset(24, 24).addBox(-3.8F, 9.7028F, -4.3744F, 7.0F, 7.0F, 5.0F, 0.0F, false);
		cube_r10.setTextureOffset(0, 30).addBox(-3.8F, 9.7028F, 0.6256F, 7.0F, 4.0F, 5.0F, 0.0F, false);
		cube_r10.setTextureOffset(57, 39).addBox(-3.8F, 11.7028F, 5.6256F, 7.0F, 2.0F, 1.0F, 0.0F, false);

		uppertailjaw = new ModelRenderer(this);
		uppertailjaw.setRotationPoint(0.0F, 24.0F, 0.0F);
		cube_r10.addChild(uppertailjaw);
		uppertailjaw.setTextureOffset(39, 39).addBox(-3.8F, -10.2972F, 2.6256F, 7.0F, 5.0F, 4.0F, 0.0F, false);

		lowertailjaw = new ModelRenderer(this);
		lowertailjaw.setRotationPoint(0.0F, 24.0F, 0.0F);
		cube_r10.addChild(lowertailjaw);
		setRotationAngle(lowertailjaw, -0.1309F, 0.0F, 0.0F);
		lowertailjaw.setTextureOffset(57, 32).addBox(-3.8F, -10.5518F, -0.741F, 7.0F, 5.0F, 2.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(45, 0).addBox(-3.0F, -3.8F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(59, 22).addBox(-3.0F, 7.2F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(40, 58).addBox(-3.0F, 4.2F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(22, 1).addBox(-3.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArm.setTextureOffset(19, 4).addBox(-1.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArm.setTextureOffset(62, 55).addBox(-3.0F, 9.2F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(19, 2).addBox(-3.0F, 10.2F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArm.setTextureOffset(19, 0).addBox(-3.0F, 10.2F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(0, 39).addBox(-1.0F, -3.8F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(66, 66).addBox(-1.0F, 9.2F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(18, 59).addBox(-1.0F, 4.2F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(62, 49).addBox(-1.0F, 7.2F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(24, 18).addBox(0.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(24, 24).addBox(2.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(22, 5).addBox(2.0F, 10.2F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(22, 3).addBox(2.0F, 10.2F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(30, 65).addBox(-2.0F, -1.8F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		LeftLeg.setTextureOffset(0, 65).addBox(-2.0F, 10.0F, -2.4102F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		LeftLeg.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.3927F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(59, 13).addBox(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		LeftLeg.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.7854F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(28, 48).addBox(-2.0F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		LeftLeg.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(44, 48).addBox(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(64, 6).addBox(-2.0F, -1.8F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		RightLeg.setTextureOffset(64, 0).addBox(-2.0F, 10.0F, -2.4102F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		RightLeg.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(56, 61).addBox(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		RightLeg.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.7854F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(12, 47).addBox(-2.0F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		RightLeg.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.3927F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(43, 12).addBox(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, 0.0F, false);
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