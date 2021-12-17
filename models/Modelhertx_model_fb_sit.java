// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelhertx_model_fb_sit extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer Body;
	private final ModelRenderer Tail;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r2_r1;
	private final ModelRenderer cube_r3;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer LeftLeg_r1;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r4_r1;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r5_r1;
	private final ModelRenderer cube_r6;
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightLeg_r1;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r7_r1;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;

	public Modelhertx_model_fb_sit() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 4.125F, 1.5F);
		Head.setTextureOffset(15, 13).addBox(-3.0F, -1.675F, -5.075F, 6.0F, 1.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(52, 41).addBox(-2.0F, -2.775F, -3.075F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		Head.setTextureOffset(58, 47).addBox(-2.0F, -6.775F, 1.925F, 4.0F, 4.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(0, 7).addBox(-2.0F, -2.775F, 2.925F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(58, 3).addBox(-3.0F, -2.775F, 1.925F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(38, 0).addBox(-2.5F, -0.775F, -2.475F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		Head.setTextureOffset(0, 17).addBox(2.0F, -6.775F, 1.925F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(5, 16).addBox(-3.0F, -6.775F, 1.925F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 27).addBox(-3.0F, -6.775F, -3.075F, 6.0F, 1.0F, 5.0F, 0.0F, false);
		Head.setTextureOffset(41, 57).addBox(2.0F, -5.775F, -4.075F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(49, 50).addBox(2.0F, -2.675F, -5.075F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(0, 56).addBox(-3.0F, -5.775F, -4.075F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(53, 0).addBox(-3.0F, -4.775F, -5.075F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 46).addBox(-3.0F, -2.675F, -5.075F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(58, 54).addBox(-2.0F, -5.775F, -5.075F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(0, 25).addBox(-2.0F, -6.775F, -4.075F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(10, 25).addBox(-2.0F, -2.675F, -5.075F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -3.725F, -0.075F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(15, 15).addBox(-3.0F, -1.8601F, 6.7623F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 0).addBox(-3.0F, -1.8601F, 8.7623F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(60, 27).addBox(-3.0F, -1.8601F, 2.7623F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 13).addBox(2.0F, -1.8601F, 6.7623F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 2).addBox(2.0F, -1.8601F, 8.7623F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 0).addBox(2.0F, -1.8601F, 2.7623F, 1.0F, 3.0F, 4.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 4.125F, 1.5F);
		setRotationAngle(Body, -0.1309F, 0.0F, 0.0F);
		Body.setTextureOffset(26, 8).addBox(-4.0F, 10.9265F, -1.6411F, 8.0F, 1.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(16, 0).addBox(-3.5F, 6.9265F, -1.6411F, 7.0F, 4.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(20, 21).addBox(-4.0F, -0.0735F, -1.6411F, 8.0F, 7.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(55, 58).addBox(-3.5F, -0.261F, -2.3911F, 7.0F, 5.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(15, 13).addBox(-1.0F, 5.739F, -1.9536F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(16, 8).addBox(-3.0F, 4.739F, -2.1411F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, 15.0F, 1.0F);
		setRotationAngle(Tail, 0.6545F, 0.0F, 0.0F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -13.3689F, 23.8592F);
		Tail.addChild(cube_r2);
		setRotationAngle(cube_r2, -1.1781F, 0.0F, 0.0F);

		cube_r2_r1 = new ModelRenderer(this);
		cube_r2_r1.setRotationPoint(0.0F, 40.8187F, -20.2444F);
		cube_r2.addChild(cube_r2_r1);
		setRotationAngle(cube_r2_r1, 0.5236F, 0.0F, 0.0F);
		cube_r2_r1.setTextureOffset(0, 13).addBox(-1.3F, -0.1297F, 36.5872F, 3.0F, 3.0F, 9.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -13.3689F, 2.8592F);
		Tail.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 0).addBox(-1.3F, 10.1852F, 7.174F, 3.0F, 3.0F, 10.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(-5.0F, 6.25F, 2.0F);
		setRotationAngle(LeftArm, 0.0F, 0.0F, 0.0873F);
		LeftArm.setTextureOffset(42, 45).addBox(-1.8228F, -2.0604F, -2.25F, 3.0F, 8.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(41, 13).addBox(-2.8228F, 5.9396F, -2.25F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(16, 0).addBox(-2.8228F, 12.9396F, 0.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArm.setTextureOffset(6, 2).addBox(-2.8228F, 12.9396F, -2.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArm.setTextureOffset(6, 0).addBox(-0.8228F, 12.9396F, -2.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArm.setTextureOffset(4, 13).addBox(-2.8228F, 12.9396F, -0.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(5.0F, 6.25F, 2.0F);
		setRotationAngle(RightArm, 0.0F, 0.0F, -0.0873F);
		RightArm.setTextureOffset(28, 45).addBox(-1.2397F, -2.0604F, -2.25F, 3.0F, 8.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(34, 34).addBox(-1.2397F, 5.9396F, -2.25F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(16, 2).addBox(-0.2397F, 12.9396F, -2.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(0, 27).addBox(1.7603F, 12.9396F, -2.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(26, 10).addBox(1.7603F, 12.9396F, -2.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArm.setTextureOffset(0, 29).addBox(1.7603F, 12.9396F, -2.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(-2.0F, 17.0F, 0.0F);
		setRotationAngle(LeftLeg, -0.2164F, 0.0283F, 0.1278F);
		LeftLeg.setTextureOffset(57, 13).addBox(-2.0319F, -1.042F, -2.0541F, 4.0F, 3.0F, 4.0F, 0.0F, false);

		LeftLeg_r1 = new ModelRenderer(this);
		LeftLeg_r1.setRotationPoint(1.1705F, -6.3463F, 10.542F);
		LeftLeg.addChild(LeftLeg_r1);
		setRotationAngle(LeftLeg_r1, 2.618F, 0.0F, 0.0F);
		LeftLeg_r1.setTextureOffset(50, 34).addBox(-3.2648F, -7.2043F, -7.6956F, 4.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.9545F, -4.7756F, -1.5151F);
		LeftLeg.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.3927F, 0.0F, 0.0F);

		cube_r4_r1 = new ModelRenderer(this);
		cube_r4_r1.setRotationPoint(2.0625F, -1.9018F, 13.6106F);
		cube_r4.addChild(cube_r4_r1);
		setRotationAngle(cube_r4_r1, 2.2253F, 0.0F, 0.0F);
		cube_r4_r1.setTextureOffset(27, 57).addBox(-3.2023F, -7.6768F, -3.4127F, 4.0F, 6.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.9545F, -4.7756F, -1.5151F);
		LeftLeg.addChild(cube_r5);
		setRotationAngle(cube_r5, 1.5708F, 0.0F, 0.0F);

		cube_r5_r1 = new ModelRenderer(this);
		cube_r5_r1.setRotationPoint(2.0F, 10.6954F, 7.2207F);
		cube_r5.addChild(cube_r5_r1);
		setRotationAngle(cube_r5_r1, 0.3927F, 0.0F, 0.0F);
		cube_r5_r1.setTextureOffset(0, 33).addBox(-3.1398F, -16.3407F, -14.2647F, 4.0F, 7.0F, 4.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.9545F, -4.7756F, -1.5151F);
		LeftLeg.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(44, 24).addBox(-1.1398F, 4.8772F, 1.6501F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(2.0F, 17.0F, 0.0F);
		setRotationAngle(RightLeg, -0.2164F, -0.0283F, -0.1278F);
		RightLeg.setTextureOffset(56, 20).addBox(-1.9681F, -1.042F, -2.0541F, 4.0F, 3.0F, 4.0F, 0.0F, false);

		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setRotationPoint(-1.1705F, -5.9801F, 10.6232F);
		RightLeg.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, 2.618F, 0.0F, 0.0F);
		RightLeg_r1.setTextureOffset(50, 6).addBox(-0.7352F, -6.9278F, -7.4422F, 4.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.9545F, -4.7756F, -1.5151F);
		RightLeg.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.3927F, 0.0F, 0.0F);

		cube_r7_r1 = new ModelRenderer(this);
		cube_r7_r1.setRotationPoint(-2.0625F, -2.7532F, 15.2784F);
		cube_r7.addChild(cube_r7_r1);
		setRotationAngle(cube_r7_r1, 2.2253F, 0.0F, 0.0F);
		cube_r7_r1.setTextureOffset(13, 53).addBox(-0.7977F, -9.5183F, -3.0729F, 4.0F, 6.0F, 3.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.9545F, -4.7756F, -1.5151F);
		RightLeg.addChild(cube_r8);
		setRotationAngle(cube_r8, 1.9635F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(18, 32).addBox(-2.8602F, -3.6961F, -11.6865F, 4.0F, 7.0F, 4.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.9545F, -4.7756F, -1.5151F);
		RightLeg.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.3927F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(12, 43).addBox(-2.8602F, 4.8772F, 1.6501F, 4.0F, 6.0F, 4.0F, 0.0F, false);
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
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.Tail.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
	}
}