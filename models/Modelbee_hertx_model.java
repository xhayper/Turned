public static class Modelbee_hertx_model extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone3;
	private final ModelRenderer Body;
	private final ModelRenderer Wings;
	private final ModelRenderer bone2;
	private final ModelRenderer bone;
	private final ModelRenderer Tail;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg;

	public Modelbee_hertx_model() {
		textureWidth = 80;
		textureHeight = 80;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -5.0F, 0.0F);
		Head.setTextureOffset(0, 31).addBox(-3.0F, -1.4F, -5.0F, 6.0F, 1.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(58, 11).addBox(-3.0F, -6.4F, 2.0F, 6.0F, 6.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(32, 25).addBox(-3.0F, -6.4F, 3.0F, 6.0F, 4.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(44, 60).addBox(-3.0F, -2.4F, -4.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(50, 12).addBox(-3.0F, -5.4F, -4.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(58, 18).addBox(2.0F, -2.4F, -4.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(54, 54).addBox(2.0F, -5.4F, -4.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(60, 38).addBox(-3.0F, -2.4F, -5.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(48, 41).addBox(-3.0F, -5.4F, -5.0F, 6.0F, 3.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(32, 18).addBox(-3.0F, -6.4F, -4.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(45, 35).addBox(-2.5F, -0.4F, -1.9F, 5.0F, 1.0F, 5.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 1.35F, 2.75F);
		Head.addChild(bone4);
		setRotationAngle(bone4, 0.3927F, 0.0F, 0.0F);
		bone4.setTextureOffset(26, 15).addBox(2.0F, -10.8124F, 2.5135F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone4.setTextureOffset(20, 0).addBox(-3.0F, -10.8124F, 2.5135F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, -2.067F, 0.6109F);
		bone4.addChild(bone5);
		setRotationAngle(bone5, -0.2618F, 0.0F, 0.0F);
		bone5.setTextureOffset(36, 57).addBox(2.0F, -10.3263F, -5.4786F, 1.0F, 2.0F, 6.0F, 0.0F, false);
		bone5.setTextureOffset(6, 7).addBox(2.0F, -9.3263F, -6.4786F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone5.setTextureOffset(56, 41).addBox(-3.0F, -10.3263F, -5.4786F, 1.0F, 2.0F, 6.0F, 0.0F, false);
		bone5.setTextureOffset(25, 21).addBox(-3.0F, -9.3263F, -6.4786F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, -0.4F, 1.0F);
		Head.addChild(bone3);
		setRotationAngle(bone3, -0.7854F, 0.0F, 0.0F);
		bone3.setTextureOffset(50, 21).addBox(-3.0F, -0.7071F, -7.7782F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(46, 32).addBox(-3.0F, -3.5355F, -0.2929F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(56, 49).addBox(-3.0F, -0.2929F, -7.7782F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(48, 45).addBox(-3.0F, -3.1213F, -0.2929F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, -5.0F, 0.0F);
		Body.setTextureOffset(26, 31).addBox(-4.0F, 1.0F, -2.0F, 8.0F, 5.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(20, 0).addBox(-5.0F, 0.0F, -3.0F, 10.0F, 4.0F, 6.0F, 0.0F, false);
		Body.setTextureOffset(46, 25).addBox(-3.0F, 6.0F, -2.0F, 6.0F, 3.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(32, 10).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 4.0F, 4.0F, 0.0F, false);

		Wings = new ModelRenderer(this);
		Wings.setRotationPoint(0.0F, 4.0F, 1.0F);
		Body.addChild(Wings);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Wings.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.2618F, 0.0F);
		bone2.setTextureOffset(6, 15).addBox(-4.3F, -2.5F, 1.4F, 1.0F, 6.0F, 0.0F, 0.0F, false);
		bone2.setTextureOffset(19, 31).addBox(-3.3F, -0.5F, 1.4F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone2.setTextureOffset(24, 0).addBox(-5.3F, -1.5F, 1.4F, 1.0F, 6.0F, 0.0F, 0.0F, false);
		bone2.setTextureOffset(6, 0).addBox(-7.3F, -1.5F, 1.4F, 2.0F, 7.0F, 0.0F, 0.0F, false);
		bone2.setTextureOffset(0, 0).addBox(-10.3F, -0.5F, 1.4F, 3.0F, 7.0F, 0.0F, 0.0F, false);
		bone2.setTextureOffset(0, 30).addBox(-11.3F, -0.5F, 1.4F, 1.0F, 6.0F, 0.0F, 0.0F, false);
		bone2.setTextureOffset(0, 7).addBox(-10.3F, -1.5F, 1.4F, 3.0F, 1.0F, 0.0F, 0.0F, false);
		bone2.setTextureOffset(0, 8).addBox(-7.3F, -2.5F, 1.4F, 3.0F, 1.0F, 0.0F, 0.0F, false);
		bone2.setTextureOffset(6, 9).addBox(-4.3F, -3.5F, 1.4F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		Wings.addChild(bone);
		setRotationAngle(bone, 0.0F, -0.2618F, 0.0F);
		bone.setTextureOffset(30, 10).addBox(10.3F, -0.5F, 1.4F, 1.0F, 6.0F, 0.0F, 0.0F, false);
		bone.setTextureOffset(0, 9).addBox(7.3F, 5.5F, 1.4F, 3.0F, 1.0F, 0.0F, 0.0F, false);
		bone.setTextureOffset(22, 15).addBox(5.3F, -1.5F, 1.4F, 2.0F, 7.0F, 0.0F, 0.0F, false);
		bone.setTextureOffset(4, 30).addBox(4.3F, -1.5F, 1.4F, 1.0F, 6.0F, 0.0F, 0.0F, false);
		bone.setTextureOffset(2, 30).addBox(3.3F, -2.5F, 1.4F, 1.0F, 6.0F, 0.0F, 0.0F, false);
		bone.setTextureOffset(21, 31).addBox(2.3F, -0.5F, 1.4F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone.setTextureOffset(8, 9).addBox(3.3F, -3.5F, 1.4F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		bone.setTextureOffset(0, 22).addBox(4.3F, -2.5F, 1.4F, 3.0F, 1.0F, 0.0F, 0.0F, false);
		bone.setTextureOffset(0, 15).addBox(7.3F, -1.5F, 1.4F, 3.0F, 7.0F, 0.0F, 0.0F, false);

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, 5.0F, 0.0F);
		Body.addChild(Tail);
		setRotationAngle(Tail, -0.3927F, 0.0F, 0.0F);
		Tail.setTextureOffset(60, 32).addBox(-1.5F, 4.3045F, 3.2193F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		Tail.setTextureOffset(0, 15).addBox(-3.5F, 2.3045F, 6.2193F, 7.0F, 7.0F, 8.0F, 0.0F, false);
		Tail.setTextureOffset(0, 0).addBox(-2.5F, 3.3045F, 5.2193F, 5.0F, 5.0F, 10.0F, 0.0F, false);
		Tail.setTextureOffset(17, 17).addBox(-0.5F, 5.3045F, 5.2193F, 1.0F, 1.0F, 13.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(-5.0F, -3.0F, 0.0F);
		LeftArm.setTextureOffset(44, 48).addBox(-3.0F, 6.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(28, 52).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 7.0F, 4.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(5.0F, -3.0F, 0.0F);
		RightArm.setTextureOffset(32, 40).addBox(-1.0F, 6.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(52, 0).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 7.0F, 4.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(-2.0F, 7.0F, 0.0F);
		LeftLeg.setTextureOffset(16, 40).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		LeftLeg.setTextureOffset(14, 52).addBox(-1.0F, 9.0F, -2.0F, 3.0F, 8.0F, 4.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(2.0F, 7.0F, 0.0F);
		RightLeg.setTextureOffset(0, 39).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		RightLeg.setTextureOffset(0, 51).addBox(-2.0F, 9.0F, -2.0F, 3.0F, 8.0F, 4.0F, 0.0F, false);
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