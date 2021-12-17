public static class Modeldl_moth_model extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer bone4;
	private final ModelRenderer bone8;
	private final ModelRenderer Body;
	private final ModelRenderer BREAAAAAAAAAAAAAASTS;
	private final ModelRenderer Tail;
	private final ModelRenderer Wings;
	private final ModelRenderer LeftWing;
	private final ModelRenderer bone;
	private final ModelRenderer bone3;
	private final ModelRenderer bone2;
	private final ModelRenderer Rightwing;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg;

	public Modeldl_moth_model() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -2.0F, 0.0F);
		Head.setTextureOffset(22, 0).addBox(-4.5F, -2.25F, -2.7F, 9.0F, 4.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(27, 10).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 1.0F, -1.25F);
		Head.addChild(bone4);
		bone4.setTextureOffset(38, 42).addBox(-2.0F, -7.0F, -2.0F, 4.0F, 1.0F, 0.0F, 0.0F, false);
		bone4.setTextureOffset(36, 29).addBox(-3.0F, -6.0F, -2.0F, 6.0F, 1.0F, 0.0F, 0.0F, false);
		bone4.setTextureOffset(24, 29).addBox(-3.0F, -3.0F, -2.0F, 6.0F, 1.0F, 0.0F, 0.0F, false);
		bone4.setTextureOffset(0, 0).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		bone4.setTextureOffset(2, 2).addBox(-4.0F, -5.0F, -2.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		bone4.setTextureOffset(0, 2).addBox(3.0F, -5.0F, -2.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.5F, 1.25F, 2.0F);
		Head.addChild(bone8);
		setRotationAngle(bone8, 0.3927F, 0.0F, 0.0F);
		bone8.setTextureOffset(56, 47).addBox(-4.0F, -6.0F, 1.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		bone8.setTextureOffset(59, 59).addBox(2.0F, -6.0F, 1.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		bone8.setTextureOffset(0, 5).addBox(2.0F, -7.0F, 1.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		bone8.setTextureOffset(0, 0).addBox(-4.0F, -7.0F, 1.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, -2.0F, 0.0F);
		Body.setTextureOffset(30, 30).addBox(-4.0F, 1.0F, -2.0F, 8.0F, 6.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(30, 22).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(46, 0).addBox(-3.5F, 7.0F, -1.5F, 7.0F, 3.0F, 3.0F, 0.0F, false);
		Body.setTextureOffset(0, 26).addBox(-4.5F, 2.0F, -3.0F, 9.0F, 3.0F, 6.0F, 0.0F, false);
		Body.setTextureOffset(0, 16).addBox(-5.0F, -1.0F, -3.5F, 10.0F, 3.0F, 7.0F, 0.0F, false);

		BREAAAAAAAAAAAAAASTS = new ModelRenderer(this);
		BREAAAAAAAAAAAAAASTS.setRotationPoint(0.0F, 3.5F, 0.5F);
		Body.addChild(BREAAAAAAAAAAAAAASTS);
		setRotationAngle(BREAAAAAAAAAAAAAASTS, 1.1781F, 0.0F, 0.0F);
		BREAAAAAAAAAAAAAASTS.setTextureOffset(48, 6).addBox(-3.5F, -3.7073F, -3.7495F, 7.0F, 4.0F, 4.0F, 0.0F, false);

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, 9.0F, 0.0F);
		Body.addChild(Tail);
		setRotationAngle(Tail, -0.3927F, 0.0F, 0.0F);
		Tail.setTextureOffset(0, 0).addBox(-3.0F, -1.8394F, 1.2472F, 6.0F, 6.0F, 10.0F, 0.0F, false);
		Tail.setTextureOffset(65, 47).addBox(-2.5F, -1.3394F, 11.2472F, 5.0F, 5.0F, 2.0F, 0.0F, false);

		Wings = new ModelRenderer(this);
		Wings.setRotationPoint(0.0F, 3.0F, 1.5F);
		Body.addChild(Wings);

		LeftWing = new ModelRenderer(this);
		LeftWing.setRotationPoint(9.0F, -2.0F, 4.0F);
		Wings.addChild(LeftWing);
		setRotationAngle(LeftWing, 0.0F, -0.3927F, 0.0F);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		LeftWing.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, -1.9635F);
		bone.setTextureOffset(14, 35).addBox(-1.0F, -6.0F, -1.0F, 5.0F, 17.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(10, 54).addBox(-4.0F, -6.0F, -1.0F, 3.0F, 16.0F, 2.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		LeftWing.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, -1.5708F);
		bone3.setTextureOffset(63, 14).addBox(-5.0F, -7.0F, -0.5F, 6.0F, 3.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(38, 40).addBox(-3.0F, -8.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(66, 3).addBox(-9.0F, -6.0F, -0.5F, 4.0F, 2.0F, 1.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(2.0F, 2.0F, 0.0F);
		LeftWing.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -1.1781F);
		bone2.setTextureOffset(32, 57).addBox(-8.0F, -5.0F, -1.0F, 4.0F, 10.0F, 2.0F, 0.0F, false);
		bone2.setTextureOffset(52, 66).addBox(-10.0F, -5.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);

		Rightwing = new ModelRenderer(this);
		Rightwing.setRotationPoint(-9.0F, -2.0F, 4.0F);
		Wings.addChild(Rightwing);
		setRotationAngle(Rightwing, 0.0F, 0.3927F, 0.0F);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
		Rightwing.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, 1.9635F);
		bone5.setTextureOffset(0, 35).addBox(-4.0F, -6.0F, -1.0F, 5.0F, 17.0F, 2.0F, 0.0F, false);
		bone5.setTextureOffset(0, 54).addBox(1.0F, -6.0F, -1.0F, 3.0F, 16.0F, 2.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
		Rightwing.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, 1.5708F);
		bone6.setTextureOffset(62, 55).addBox(-1.0F, -7.0F, -0.5F, 6.0F, 3.0F, 1.0F, 0.0F, false);
		bone6.setTextureOffset(24, 30).addBox(0.0F, -8.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		bone6.setTextureOffset(63, 0).addBox(5.0F, -6.0F, -0.5F, 4.0F, 2.0F, 1.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-2.0F, 2.0F, 0.0F);
		Rightwing.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.0F, 1.1781F);
		bone7.setTextureOffset(20, 57).addBox(4.0F, -5.0F, -1.0F, 4.0F, 10.0F, 2.0F, 0.0F, false);
		bone7.setTextureOffset(44, 59).addBox(8.0F, -5.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(-5.0F, 1.0F, 0.0F);
		LeftArm.setTextureOffset(42, 42).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(5.0F, 1.0F, 0.0F);
		RightArm.setTextureOffset(28, 40).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(-2.0F, 11.0F, 0.0F);
		LeftLeg.setTextureOffset(54, 25).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		LeftLeg.setTextureOffset(56, 36).addBox(-1.0F, 6.0F, -2.0F, 3.0F, 7.0F, 4.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(2.0F, 11.0F, 0.0F);
		RightLeg.setTextureOffset(51, 14).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		RightLeg.setTextureOffset(52, 55).addBox(-2.0F, 6.0F, -2.0F, 3.0F, 7.0F, 4.0F, 0.0F, false);
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