public static class Modelmystic_cat extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer bone2;
	private final ModelRenderer Body;
	private final ModelRenderer Tail;
	private final ModelRenderer bone8;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer bone;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer Rightleg;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;

	public Modelmystic_cat() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(50, 30).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 16).addBox(-4.0F, -5.0F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(6, 10).addBox(-3.0F, -5.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(9, 12).addBox(0.0F, -5.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(10, 10).addBox(3.0F, -5.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 10).addBox(1.0F, -5.0F, -4.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 16).addBox(-4.0F, -8.0F, -3.0F, 8.0F, 8.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(54, 10).addBox(2.0F, -11.0F, -1.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(16, 52).addBox(-5.0F, -11.0F, -1.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-0.5F, -3.75F, -6.0F);
		Head.addChild(bone2);
		setRotationAngle(bone2, -0.829F, 0.0F, 0.0F);
		bone2.setTextureOffset(23, 16).addBox(0.0F, -5.1126F, -6.2895F, 1.0F, 1.0F, 6.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(26, 27).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 11.0F, 4.0F, 0.0F, false);

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, 9.0F, 1.0F);
		Body.addChild(Tail);
		setRotationAngle(Tail, -0.5672F, 0.0F, 0.0F);
		Tail.setTextureOffset(0, 0).addBox(-1.0F, -0.5902F, 0.4559F, 2.0F, 2.0F, 14.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, -9.4336F, 17.9186F);
		Tail.addChild(bone8);
		setRotationAngle(bone8, 0.3927F, 0.0F, 0.0F);
		bone8.setTextureOffset(18, 0).addBox(-1.0F, 6.6167F, -7.7314F, 2.0F, 2.0F, 10.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(38, 8).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(0, 31).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(-2.0F, 11.0F, 0.0F);
		LeftLeg.setTextureOffset(46, 38).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		LeftLeg.setTextureOffset(32, 42).addBox(-2.0F, 10.213F, -3.1649F, 4.0F, 3.0F, 5.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 1.0F, 0.0F);
		LeftLeg.addChild(bone);
		setRotationAngle(bone, -0.3927F, 0.0F, 0.0F);
		bone.setTextureOffset(28, 50).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(4.0F, 4.0F, -1.0F);
		LeftLeg.addChild(bone3);
		setRotationAngle(bone3, 0.6545F, 0.0F, 0.0F);
		bone3.setTextureOffset(46, 46).addBox(-6.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 4.0F, -1.0F);
		LeftLeg.addChild(bone4);
		setRotationAngle(bone4, -0.48F, 0.0F, 0.0F);
		bone4.setTextureOffset(50, 0).addBox(-2.0F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, 0.0F, false);

		Rightleg = new ModelRenderer(this);
		Rightleg.setRotationPoint(2.0F, 11.0F, 0.0F);
		Rightleg.setTextureOffset(46, 24).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		Rightleg.setTextureOffset(32, 0).addBox(-2.0F, 10.213F, -3.1649F, 4.0F, 3.0F, 5.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 1.0F, 0.0F);
		Rightleg.addChild(bone5);
		setRotationAngle(bone5, -0.3927F, 0.0F, 0.0F);
		bone5.setTextureOffset(0, 47).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-4.0F, 4.0F, -1.0F);
		Rightleg.addChild(bone6);
		setRotationAngle(bone6, 0.6545F, 0.0F, 0.0F);
		bone6.setTextureOffset(16, 42).addBox(2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 4.0F, -1.0F);
		Rightleg.addChild(bone7);
		setRotationAngle(bone7, -0.48F, 0.0F, 0.0F);
		bone7.setTextureOffset(0, 0).addBox(-2.0F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		Rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.Rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}