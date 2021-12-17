public static class Modelspider_latex_model extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer Body;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;
	private final ModelRenderer LowerBody;
	private final ModelRenderer Rightleg;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer Leftleg;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;

	public Modelspider_latex_model() {
		textureWidth = 96;
		textureHeight = 96;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, -4.5F);
		Head.setTextureOffset(26, 31).addBox(-4.0F, -8.0F, -3.75F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.5F, 0.0F, 0.25F);
		Head.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.0F, -0.1745F);
		bone9.setTextureOffset(46, 64).addBox(-4.0F, -3.0F, -5.25F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(5.5F, 0.0F, 0.25F);
		Head.addChild(bone10);
		setRotationAngle(bone10, 0.0F, 0.0F, 0.1745F);
		bone10.setTextureOffset(0, 24).addBox(-3.9248F, -1.9978F, -5.25F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, -4.5F);
		Body.setTextureOffset(54, 54).addBox(-4.5F, 0.0F, -1.75F, 9.0F, 7.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(0, 39).addBox(-4.0F, 7.0F, -1.25F, 8.0F, 5.0F, 3.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(-5.5F, 2.0F, -4.5F);
		LeftArm.setTextureOffset(32, 64).addBox(-2.0F, -2.0F, -1.75F, 3.0F, 7.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(16, 63).addBox(-3.0F, 5.0F, -1.75F, 4.0F, 7.0F, 4.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(5.5F, 2.0F, -4.5F);
		RightArm.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, -1.75F, 3.0F, 7.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(0, 63).addBox(-1.0F, 5.0F, -1.75F, 4.0F, 7.0F, 4.0F, 0.0F, false);

		LowerBody = new ModelRenderer(this);
		LowerBody.setRotationPoint(0.0F, 0.0F, -4.5F);
		LowerBody.setTextureOffset(0, 24).addBox(-4.5F, 14.0F, -2.75F, 9.0F, 7.0F, 8.0F, 0.0F, false);
		LowerBody.setTextureOffset(58, 24).addBox(-3.5F, 15.0F, -3.75F, 7.0F, 5.0F, 1.0F, 0.0F, false);
		LowerBody.setTextureOffset(0, 0).addBox(-6.0F, 12.25F, 10.25F, 12.0F, 10.0F, 14.0F, 0.0F, false);
		LowerBody.setTextureOffset(58, 36).addBox(-5.0F, 13.25F, 24.25F, 10.0F, 8.0F, 1.0F, 0.0F, false);
		LowerBody.setTextureOffset(28, 53).addBox(-4.0F, 14.5F, 5.25F, 8.0F, 6.0F, 5.0F, 0.0F, false);
		LowerBody.setTextureOffset(0, 53).addBox(-4.0F, 12.0F, -2.25F, 8.0F, 4.0F, 6.0F, 0.0F, false);

		Rightleg = new ModelRenderer(this);
		Rightleg.setRotationPoint(2.0F, 18.75F, -1.25F);
		setRotationAngle(Rightleg, 0.0F, 0.0F, 0.3927F);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.3886F, -7.2722F, 2.25F);
		Rightleg.addChild(bone);
		setRotationAngle(bone, 0.0F, -0.3927F, 0.0F);
		bone.setTextureOffset(52, 12).addBox(2.4476F, 6.0F, -0.7907F, 13.0F, 3.0F, 3.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.8109F, -7.6384F, 0.25F);
		Rightleg.addChild(bone2);
		setRotationAngle(bone2, 0.0F, -0.1745F, 0.0F);
		bone2.setTextureOffset(52, 18).addBox(2.9791F, 6.0F, -1.2044F, 13.0F, 3.0F, 3.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-1.8886F, -6.2721F, 1.75F);
		Rightleg.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.1745F, 0.0F);
		bone3.setTextureOffset(32, 47).addBox(3.5559F, 4.5941F, -3.8746F, 13.0F, 3.0F, 3.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.8886F, -6.2722F, -0.25F);
		Rightleg.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.3927F, 0.0F);
		bone4.setTextureOffset(50, 30).addBox(4.0929F, 4.6898F, -3.8044F, 13.0F, 3.0F, 3.0F, 0.0F, false);

		Leftleg = new ModelRenderer(this);
		Leftleg.setRotationPoint(-2.0F, 18.75F, -1.25F);
		setRotationAngle(Leftleg, 0.0F, 0.0F, -0.3927F);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(1.3886F, -7.2722F, 2.25F);
		Leftleg.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.3927F, 0.0F);
		bone5.setTextureOffset(0, 47).addBox(-15.4476F, 6.0F, -0.7907F, 13.0F, 3.0F, 3.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(1.8109F, -7.6384F, 0.25F);
		Leftleg.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.1745F, 0.0F);
		bone6.setTextureOffset(38, 6).addBox(-15.9791F, 6.0F, -1.2044F, 13.0F, 3.0F, 3.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(1.8886F, -6.2721F, 1.75F);
		Leftleg.addChild(bone7);
		setRotationAngle(bone7, 0.0F, -0.1745F, 0.0F);
		bone7.setTextureOffset(38, 0).addBox(-16.5559F, 4.5941F, -3.8746F, 13.0F, 3.0F, 3.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(1.8886F, -6.2722F, -0.25F);
		Leftleg.addChild(bone8);
		setRotationAngle(bone8, 0.0F, -0.3927F, 0.0F);
		bone8.setTextureOffset(26, 24).addBox(-17.0929F, 4.6898F, -3.8044F, 13.0F, 3.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		LowerBody.render(matrixStack, buffer, packedLight, packedOverlay);
		Rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		Leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.Leftleg.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.Rightleg.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}