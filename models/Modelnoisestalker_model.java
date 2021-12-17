public static class Modelnoisestalker_model extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer Body;
	private final ModelRenderer Tail;
	private final ModelRenderer cube_r4;
	private final ModelRenderer LeftArm;
	private final ModelRenderer cube_r5;
	private final ModelRenderer RightArm;
	private final ModelRenderer cube_r6;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer RightLeg;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;

	public Modelnoisestalker_model() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(6, 7).addBox(2.0F, -6.0F, -4.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Head.setTextureOffset(2, 1).addBox(0.0F, -6.0F, -4.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Head.setTextureOffset(2, 7).addBox(-1.0F, -6.0F, -4.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Head.setTextureOffset(0, 7).addBox(-3.0F, -6.0F, -4.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Head.setTextureOffset(2, 2).addBox(-4.0F, -6.0F, -4.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 1).addBox(-4.0F, -6.0F, -2.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 2).addBox(4.0F, -6.0F, -4.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(4.0F, -6.0F, -2.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 15).addBox(-4.0F, -12.0F, -4.0F, 8.0F, 6.0F, 8.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(6.6F, -4.0F, 2.2F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, 3.0F, 2.0F, 3.0F, 4.0F, 0.0F, false);
		cube_r1.setTextureOffset(14, 65).addBox(-11.3F, -8.0F, 3.0F, 2.0F, 3.0F, 4.0F, 0.0F, false);
		cube_r1.setTextureOffset(52, 59).addBox(-4.0F, -8.0F, -2.0F, 2.0F, 4.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(61, 63).addBox(-11.3F, -8.0F, -2.0F, 2.0F, 4.0F, 5.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -3.4F, 0.7F);
		Head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(52, 11).addBox(-3.0F, -2.0F, -4.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -4.0F, 0.3F);
		Head.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(32, 9).addBox(-4.0F, -2.0F, 0.0F, 8.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r3.setTextureOffset(2, 0).addBox(-2.0F, -2.0F, -4.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		cube_r3.setTextureOffset(4, 7).addBox(1.0F, -2.0F, -4.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		cube_r3.setTextureOffset(0, 0).addBox(-4.0F, -2.0F, -4.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		cube_r3.setTextureOffset(2, 2).addBox(3.0F, -2.0F, -4.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		cube_r3.setTextureOffset(20, 0).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(28, 28).addBox(-5.0F, -4.0F, -2.0F, 10.0F, 6.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(32, 38).addBox(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(24, 15).addBox(-5.0F, 6.0F, -2.0F, 10.0F, 3.0F, 4.0F, 0.0F, false);

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, 0.0F, 0.0F);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 10.2169F, 6.6575F);
		Tail.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.3054F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(0, 0).addBox(-2.0F, -1.5F, -6.0F, 4.0F, 3.0F, 12.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(16, 34).addBox(-4.0F, -4.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.1F, -1.6F, 0.3F);
		LeftArm.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.2618F);
		cube_r5.setTextureOffset(47, 17).addBox(-4.0F, -5.0F, -2.8F, 5.0F, 4.0F, 5.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(0, 29).addBox(0.0F, -4.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.1F, -1.6F, 0.3F);
		RightArm.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.2618F);
		cube_r6.setTextureOffset(50, 50).addBox(-1.0F, -5.0F, -2.8F, 5.0F, 4.0F, 5.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(0, 58).addBox(-3.0F, -3.0F, -2.0F, 5.0F, 4.0F, 4.0F, 0.0F, false);
		LeftLeg.setTextureOffset(52, 44).addBox(-3.0F, 10.0F, -3.0F, 5.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 5.5375F, 1.7617F);
		LeftLeg.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.4538F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(52, 0).addBox(-3.0F, -2.0F, -1.0F, 5.0F, 8.0F, 3.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 4.0767F, -0.0034F);
		LeftLeg.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.9861F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(32, 46).addBox(-3.0F, -3.0F, -2.0F, 5.0F, 7.0F, 4.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 2.0824F, -0.6131F);
		LeftLeg.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.3927F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(56, 35).addBox(-3.0F, -2.0F, -2.0F, 5.0F, 5.0F, 4.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(34, 57).addBox(-2.0F, -3.0F, -2.0F, 5.0F, 4.0F, 4.0F, 0.0F, false);
		RightLeg.setTextureOffset(32, 22).addBox(-2.0F, 10.0F, -3.0F, 5.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 5.5375F, 1.7617F);
		RightLeg.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.4538F, 0.0F, 0.0F);
		cube_r10.setTextureOffset(18, 54).addBox(-2.0F, -2.0F, -1.0F, 5.0F, 8.0F, 3.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 4.0767F, -0.0034F);
		RightLeg.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.9861F, 0.0F, 0.0F);
		cube_r11.setTextureOffset(0, 47).addBox(-2.0F, -3.0F, -2.0F, 5.0F, 7.0F, 4.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 2.0824F, -0.6131F);
		RightLeg.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.3927F, 0.0F, 0.0F);
		cube_r12.setTextureOffset(56, 26).addBox(-2.0F, -2.0F, -2.0F, 5.0F, 5.0F, 4.0F, 0.0F, false);
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