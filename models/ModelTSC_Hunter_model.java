public static class ModelTSC_Hunter_model extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Muzzle;
	private final ModelRenderer Hair;
	private final ModelRenderer Ears;
	private final ModelRenderer Body;
	private final ModelRenderer breast;
	private final ModelRenderer tail;
	private final ModelRenderer bone;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer RightLeg;
	private final ModelRenderer bone2;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;

	public ModelTSC_Hunter_model() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -13.0F, 0.0F);
		Head.setTextureOffset(0, 16).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		Muzzle = new ModelRenderer(this);
		Muzzle.setRotationPoint(1.4F, -1.0F, 1.0F);
		Head.addChild(Muzzle);
		setRotationAngle(Muzzle, 0.3054F, 0.0F, 0.0F);
		Muzzle.setTextureOffset(76, 32).addBox(-3.9F, -3.2384F, -6.9248F, 5.0F, 3.0F, 3.0F, 0.0F, false);

		Hair = new ModelRenderer(this);
		Hair.setRotationPoint(2.0F, -1.0F, 0.25F);
		Head.addChild(Hair);
		Hair.setTextureOffset(87, 63).addBox(-7.0F, -4.0F, -5.25F, 4.0F, 5.0F, 1.0F, 0.0F, false);
		Hair.setTextureOffset(61, 39).addBox(-7.0F, 1.0F, -5.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Hair.setTextureOffset(42, 10).addBox(-7.0F, 1.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Hair.setTextureOffset(0, 0).addBox(-7.0F, -4.0F, -4.25F, 1.0F, 5.0F, 4.0F, 0.0F, false);
		Hair.setTextureOffset(24, 22).addBox(-7.0F, -5.0F, -5.25F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		Hair.setTextureOffset(17, 46).addBox(-6.0F, -7.0F, -5.25F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		Hair.setTextureOffset(49, 2).addBox(-3.0F, -4.0F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Hair.setTextureOffset(32, 83).addBox(-7.0F, -7.0F, -4.25F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		Hair.setTextureOffset(47, 3).addBox(-6.0F, -8.0F, -4.25F, 6.0F, 1.0F, 7.0F, 0.0F, false);
		Hair.setTextureOffset(19, 61).addBox(-1.0F, -7.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Hair.setTextureOffset(0, 49).addBox(-2.0F, -5.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Ears = new ModelRenderer(this);
		Ears.setRotationPoint(0.9F, 3.0F, 2.0F);
		Head.addChild(Ears);
		setRotationAngle(Ears, 0.2618F, 0.0F, 0.0F);
		Ears.setTextureOffset(82, 72).addBox(2.6F, -7.8978F, 0.7765F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		Ears.setTextureOffset(14, 82).addBox(-5.4F, -7.8978F, 0.7765F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		Ears.setTextureOffset(10, 73).addBox(2.6F, -8.8978F, 0.7765F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		Ears.setTextureOffset(0, 72).addBox(-5.4F, -8.8978F, 0.7765F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		Ears.setTextureOffset(66, 0).addBox(2.6F, -9.8978F, 0.7765F, 1.0F, 1.0F, 9.0F, 0.0F, false);
		Ears.setTextureOffset(59, 23).addBox(-5.4F, -9.8978F, 0.7765F, 1.0F, 1.0F, 9.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, -13.0F, 0.0F);
		Body.setTextureOffset(30, 12).addBox(-5.5F, 1.0F, -2.0F, 11.0F, 6.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(61, 56).addBox(-0.5F, 2.0F, 2.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(24, 16).addBox(-0.5F, 3.0F, 3.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(24, 0).addBox(-0.5F, 4.0F, 4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(0, 46).addBox(-0.5F, 6.0F, 5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(0, 61).addBox(-0.5F, 8.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(0, 32).addBox(-2.5F, 0.0F, -2.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(48, 33).addBox(-5.0F, 12.0F, -2.0F, 10.0F, 2.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(0, 37).addBox(-5.5F, 14.0F, -2.0F, 11.0F, 5.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(70, 21).addBox(-8.25F, 0.75F, -2.5F, 4.0F, 6.0F, 5.0F, 0.0F, false);
		Body.setTextureOffset(48, 69).addBox(4.25F, 0.75F, -2.5F, 4.0F, 6.0F, 5.0F, 0.0F, false);
		Body.setTextureOffset(22, 50).addBox(-4.5F, 7.0F, -1.5F, 9.0F, 7.0F, 3.0F, 0.0F, false);

		breast = new ModelRenderer(this);
		breast.setRotationPoint(0.0F, 3.0F, -3.0F);
		Body.addChild(breast);
		setRotationAngle(breast, 0.3927F, 0.0F, 0.0F);
		breast.setTextureOffset(24, 0).addBox(-5.0F, -0.7716F, -2.8519F, 10.0F, 5.0F, 5.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 3.0F, 6.0F);
		Body.addChild(tail);
		setRotationAngle(tail, -0.5236F, 0.0F, 0.0F);
		tail.setTextureOffset(0, 0).addBox(-3.5F, 9.3478F, -0.3686F, 7.0F, 6.0F, 10.0F, 0.0F, false);
		tail.setTextureOffset(24, 24).addBox(-3.0F, 9.9147F, 9.3814F, 6.0F, 5.0F, 8.0F, 0.0F, false);
		tail.setTextureOffset(79, 8).addBox(3.5F, 11.3478F, 2.6314F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		tail.setTextureOffset(68, 85).addBox(4.5F, 11.3478F, 3.6314F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		tail.setTextureOffset(83, 16).addBox(-5.5F, 11.3478F, 3.6314F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		tail.setTextureOffset(14, 32).addBox(5.5F, 11.3478F, 5.6314F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		tail.setTextureOffset(0, 20).addBox(-6.5F, 11.3478F, 5.6314F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		tail.setTextureOffset(44, 25).addBox(6.5F, 11.3478F, 6.6314F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		tail.setTextureOffset(44, 22).addBox(-7.5F, 11.3478F, 6.6314F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		tail.setTextureOffset(56, 58).addBox(7.5F, 11.3478F, 8.6314F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		tail.setTextureOffset(56, 56).addBox(-8.5F, 11.3478F, 8.6314F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		tail.setTextureOffset(78, 64).addBox(-4.5F, 11.3478F, 2.6314F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		tail.setTextureOffset(87, 33).addBox(-0.5F, 8.3478F, 4.6314F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		tail.setTextureOffset(26, 37).addBox(-0.5F, 7.3478F, 5.6314F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		tail.setTextureOffset(0, 59).addBox(-0.5F, 5.3478F, 8.6314F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		tail.setTextureOffset(15, 61).addBox(-0.5F, 6.3478F, 6.6314F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-0.5F, 9.884F, 2.933F);
		tail.addChild(bone);
		setRotationAngle(bone, 0.2618F, 0.0F, 0.0F);
		bone.setTextureOffset(52, 39).addBox(-1.0F, 4.1205F, 16.1991F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(77, 0).addBox(-2.0F, 4.1205F, 12.1991F, 5.0F, 4.0F, 4.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone6);
		setRotationAngle(bone6, -1.9635F, 0.0F, 0.0F);
		bone6.setTextureOffset(60, 81).addBox(0.0F, -26.6952F, -2.3316F, 1.0F, 7.0F, 3.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone7);
		setRotationAngle(bone7, -0.7854F, 0.0F, 0.0F);
		bone7.setTextureOffset(20, 60).addBox(0.0F, -23.3693F, 14.3681F, 1.0F, 15.0F, 5.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(-6.0F, -9.0F, 0.0F);
		setRotationAngle(LeftArm, 0.0F, 0.0F, 0.1309F);
		LeftArm.setTextureOffset(66, 71).addBox(-3.071F, -2.2617F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(15, 59).addBox(-3.571F, 14.7383F, 1.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArm.setTextureOffset(56, 1).addBox(-3.571F, 14.7383F, 0.15F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArm.setTextureOffset(49, 0).addBox(-3.571F, 14.7383F, -1.15F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArm.setTextureOffset(43, 50).addBox(-3.571F, 14.7383F, -2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArm.setTextureOffset(0, 59).addBox(-3.571F, 6.7383F, -2.5F, 5.0F, 8.0F, 5.0F, 0.0F, false);
		LeftArm.setTextureOffset(56, 11).addBox(0.429F, 14.7383F, -2.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		LeftArm.setTextureOffset(82, 55).addBox(-3.571F, 3.7383F, -2.5F, 2.0F, 3.0F, 5.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(6.0F, -9.0F, 0.0F);
		setRotationAngle(RightArm, 0.0F, 0.0F, -0.1309F);
		RightArm.setTextureOffset(32, 69).addBox(-0.929F, -2.2617F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(17, 49).addBox(0.571F, 14.7383F, 1.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(47, 39).addBox(0.571F, 14.7383F, 0.15F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(36, 22).addBox(0.571F, 14.7383F, -1.15F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(34, 10).addBox(0.571F, 14.7383F, -2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(41, 56).addBox(-1.429F, 6.7383F, -2.5F, 5.0F, 8.0F, 5.0F, 0.0F, false);
		RightArm.setTextureOffset(0, 16).addBox(-1.429F, 14.7383F, -2.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		RightArm.setTextureOffset(23, 80).addBox(1.571F, 3.7383F, -2.5F, 2.0F, 3.0F, 5.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(-3.0F, 6.0F, 0.0F);
		LeftLeg.setTextureOffset(81, 43).addBox(-3.0F, -3.5F, -2.5F, 2.0F, 3.0F, 5.0F, 0.0F, false);
		LeftLeg.setTextureOffset(65, 51).addBox(-3.0F, -1.5F, -2.5F, 6.0F, 4.0F, 5.0F, 0.0F, false);
		LeftLeg.setTextureOffset(31, 37).addBox(-3.0F, 16.0F, -5.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		LeftLeg.setTextureOffset(0, 37).addBox(2.0F, 16.0F, -5.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		LeftLeg.setTextureOffset(19, 32).addBox(-0.5F, 16.0F, -5.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		LeftLeg.setTextureOffset(81, 39).addBox(-3.0F, 15.0F, -4.5F, 6.0F, 3.0F, 1.0F, 0.0F, false);
		LeftLeg.setTextureOffset(46, 46).addBox(-3.0F, 14.0F, -3.5F, 6.0F, 4.0F, 6.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(1.0F, 2.5F, 0.5F);
		LeftLeg.addChild(bone3);
		setRotationAngle(bone3, -0.3927F, 0.0F, 0.0F);
		bone3.setTextureOffset(0, 46).addBox(-4.0F, -0.7654F, -3.1522F, 6.0F, 8.0F, 5.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, -1.4142F, 1.4142F);
		bone3.addChild(bone4);
		setRotationAngle(bone4, 1.5708F, 0.0F, 0.0F);
		bone4.setTextureOffset(61, 61).addBox(-4.0F, 0.4335F, -8.6488F, 6.0F, 5.0F, 5.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 3.262F, -0.6488F);
		bone4.addChild(bone5);
		setRotationAngle(bone5, -1.5708F, 0.0F, 0.0F);
		bone5.setTextureOffset(78, 80).addBox(-3.0F, 8.0F, -1.8284F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(3.0F, 6.0F, 0.0F);
		RightLeg.setTextureOffset(0, 81).addBox(1.0F, -3.5F, -2.5F, 2.0F, 3.0F, 5.0F, 0.0F, false);
		RightLeg.setTextureOffset(64, 39).addBox(-3.0F, -1.5F, -2.5F, 6.0F, 4.0F, 5.0F, 0.0F, false);
		RightLeg.setTextureOffset(0, 32).addBox(2.0F, 16.0F, -5.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(6, 0).addBox(-3.0F, 16.0F, -5.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(0, 0).addBox(-0.5F, 16.0F, -5.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(27, 60).addBox(-3.0F, 15.0F, -4.5F, 6.0F, 3.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(44, 22).addBox(-3.0F, 14.0F, -3.5F, 6.0F, 4.0F, 6.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.0F, 2.5F, 0.5F);
		RightLeg.addChild(bone2);
		setRotationAngle(bone2, -0.3927F, 0.0F, 0.0F);
		bone2.setTextureOffset(30, 37).addBox(-2.0F, -0.7654F, -3.1522F, 6.0F, 8.0F, 5.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, -1.4142F, 1.4142F);
		bone2.addChild(bone8);
		setRotationAngle(bone8, 1.5708F, 0.0F, 0.0F);
		bone8.setTextureOffset(60, 11).addBox(-2.0F, 0.4335F, -8.6488F, 6.0F, 5.0F, 5.0F, 0.0F, false);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 3.262F, -0.6488F);
		bone8.addChild(bone9);
		setRotationAngle(bone9, -1.5708F, 0.0F, 0.0F);
		bone9.setTextureOffset(44, 80).addBox(-1.0F, 8.0F, -1.8284F, 4.0F, 6.0F, 4.0F, 0.0F, false);
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