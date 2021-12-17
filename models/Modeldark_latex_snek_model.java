
public static class Modeldark_latex_snek_model extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer headbone;
	private final ModelRenderer headbone2;
	private final ModelRenderer headbone3;
	private final ModelRenderer Jawbone;
	private final ModelRenderer Body;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;
	private final ModelRenderer Tail;
	private final ModelRenderer bone2;
	private final ModelRenderer bone;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;

	public Modeldark_latex_snek_model() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(36, 19).addBox(-4.0F, -1.2F, -2.0F, 8.0F, 1.0F, 4.0F, 0.0F, false);

		headbone = new ModelRenderer(this);
		headbone.setRotationPoint(0.0F, -7.0F, 0.0F);
		Head.addChild(headbone);
		setRotationAngle(headbone, -0.3927F, 0.0F, 0.0F);
		headbone.setTextureOffset(48, 0).addBox(-3.0F, 2.1239F, 0.3718F, 6.0F, 4.0F, 4.0F, 0.0F, false);

		headbone2 = new ModelRenderer(this);
		headbone2.setRotationPoint(0.0F, -7.0F, 0.0F);
		Head.addChild(headbone2);
		setRotationAngle(headbone2, 0.7854F, 0.0F, 0.0F);
		headbone2.setTextureOffset(48, 48).addBox(-3.0F, 0.8518F, -4.2891F, 6.0F, 4.0F, 4.0F, 0.0F, false);

		headbone3 = new ModelRenderer(this);
		headbone3.setRotationPoint(0.0F, -10.5F, -4.5F);
		Head.addChild(headbone3);
		headbone3.setTextureOffset(16, 16).addBox(-3.0F, 2.1364F, -2.7737F, 6.0F, 4.0F, 8.0F, 0.0F, false);
		headbone3.setTextureOffset(2, 2).addBox(-2.0F, 6.1364F, -2.7737F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		headbone3.setTextureOffset(0, 2).addBox(1.0F, 6.1364F, -2.7737F, 1.0F, 2.0F, 0.0F, 0.0F, false);

		Jawbone = new ModelRenderer(this);
		Jawbone.setRotationPoint(3.0F, -2.4136F, 6.2263F);
		headbone3.addChild(Jawbone);
		setRotationAngle(Jawbone, 0.1745F, 0.0F, 0.0F);
		Jawbone.setTextureOffset(0, 46).addBox(-6.0F, 7.6815F, -10.3542F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		Jawbone.setTextureOffset(10, 17).addBox(-3.5F, 7.5423F, -9.4158F, 1.0F, 0.0F, 6.0F, 0.0F, false);
		Jawbone.setTextureOffset(0, 1).addBox(-4.25F, 7.5423F, -10.4158F, 1.0F, 0.0F, 1.0F, 0.0F, false);
		Jawbone.setTextureOffset(0, 0).addBox(-2.75F, 7.5423F, -10.4158F, 1.0F, 0.0F, 1.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(0, 0).addBox(-4.0F, -0.2F, -2.0F, 8.0F, 13.0F, 4.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(16, 28).addBox(-3.0F, -2.2F, -2.0F, 4.0F, 14.0F, 4.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(0, 17).addBox(-1.0F, -2.2F, -2.0F, 4.0F, 14.0F, 4.0F, 0.0F, false);

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(-2.0F, 12.0F, 0.0F);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(4.0F, 0.0F, 0.0F);
		Tail.addChild(bone2);
		bone2.setTextureOffset(24, 48).addBox(-6.0F, 0.8F, -2.0F, 8.0F, 2.0F, 4.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(2.0F, 6.0F, 0.0F);
		Tail.addChild(bone);
		setRotationAngle(bone, -0.7854F, 0.0F, 0.0F);
		bone.setTextureOffset(40, 24).addBox(-4.0F, -3.677F, -4.8486F, 8.0F, 4.0F, 4.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(4.0F, 0.0F, 0.0F);
		Tail.addChild(bone3);
		bone3.setTextureOffset(32, 40).addBox(-6.0F, 2.8F, -3.6569F, 8.0F, 4.0F, 4.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(2.0F, 6.0F, 0.0F);
		Tail.addChild(bone4);
		setRotationAngle(bone4, 0.3927F, 0.0F, 0.0F);
		bone4.setTextureOffset(36, 11).addBox(-4.0F, -0.6603F, -3.6846F, 8.0F, 4.0F, 4.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(2.0F, 6.0F, 0.0F);
		Tail.addChild(bone5);
		setRotationAngle(bone5, 1.1781F, 0.0F, 0.0F);
		bone5.setTextureOffset(32, 32).addBox(-4.0F, -0.2439F, -4.967F, 8.0F, 4.0F, 4.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(2.0F, 6.0F, 0.0F);
		Tail.addChild(bone6);
		setRotationAngle(bone6, 1.5708F, 0.0F, 0.0F);
		bone6.setTextureOffset(24, 0).addBox(-4.0F, 1.5694F, -6.0263F, 8.0F, 7.0F, 4.0F, 0.0F, false);
		bone6.setTextureOffset(0, 53).addBox(-3.0F, 8.5694F, -6.0263F, 6.0F, 7.0F, 3.0F, 0.0F, false);
		bone6.setTextureOffset(0, 35).addBox(-2.0F, 15.5694F, -6.0263F, 4.0F, 7.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		Tail.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.Tail.rotateAngleZ = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}