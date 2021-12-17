public static class Modeldl_dragon_model extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer Mask;
	private final ModelRenderer Body;
	private final ModelRenderer Bones;
	private final ModelRenderer Tail;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer Wings;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer RightLeg;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;

	public Modeldl_dragon_model() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -21.0F, 0.0F);
		Head.setTextureOffset(0, 16).addBox(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		Head.setTextureOffset(30, 20).addBox(-4.0F, -4.0F, -7.0F, 8.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 13.0F, 0.0F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.4363F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(54, 45).addBox(-4.7F, -26.0F, 7.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(58, 45).addBox(3.8F, -26.0F, 7.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 37).addBox(-4.7F, -27.0F, 8.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(4, 37).addBox(3.8F, -27.0F, 8.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 13.0F, 0.0F);
		Head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.48F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 16).addBox(-5.5F, -19.0F, 15.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		cube_r2.setTextureOffset(53, 20).addBox(4.5F, -19.0F, 15.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		cube_r2.setTextureOffset(96, 29).addBox(-5.5F, -19.0F, 7.0F, 1.0F, 5.0F, 8.0F, 0.0F, false);
		cube_r2.setTextureOffset(64, 102).addBox(4.5F, -19.0F, 7.0F, 1.0F, 5.0F, 8.0F, 0.0F, false);

		Mask = new ModelRenderer(this);
		Mask.setRotationPoint(0.0F, 13.0F, 0.0F);
		Head.addChild(Mask);
		Mask.setTextureOffset(20, 36).addBox(-4.0F, -21.25F, -5.25F, 8.0F, 1.0F, 0.0F, 0.0F, false);
		Mask.setTextureOffset(22, 52).addBox(-3.0F, -22.25F, -5.25F, 6.0F, 1.0F, 0.0F, 0.0F, false);
		Mask.setTextureOffset(38, 0).addBox(-4.0F, -17.35F, -7.25F, 8.0F, 0.0F, 2.0F, 0.0F, false);
		Mask.setTextureOffset(40, 2).addBox(-4.0F, -17.25F, -7.25F, 8.0F, 3.0F, 0.0F, 0.0F, false);
		Mask.setTextureOffset(6, 14).addBox(4.1F, -17.25F, -7.25F, 0.0F, 3.0F, 2.0F, 0.0F, false);
		Mask.setTextureOffset(0, 14).addBox(-4.1F, -17.25F, -7.25F, 0.0F, 3.0F, 2.0F, 0.0F, false);
		Mask.setTextureOffset(6, 19).addBox(2.0F, -14.25F, -7.25F, 2.0F, 1.0F, 0.0F, 0.0F, false);
		Mask.setTextureOffset(0, 19).addBox(-4.0F, -14.25F, -7.25F, 2.0F, 1.0F, 0.0F, 0.0F, false);
		Mask.setTextureOffset(76, 43).addBox(-1.0F, -19.25F, -5.25F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		Mask.setTextureOffset(0, 36).addBox(-5.0F, -20.25F, -5.25F, 10.0F, 1.0F, 0.0F, 0.0F, false);
		Mask.setTextureOffset(6, 4).addBox(-5.0F, -19.25F, -5.25F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		Mask.setTextureOffset(2, 25).addBox(-6.0F, -18.25F, -5.25F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Mask.setTextureOffset(0, 25).addBox(5.0F, -18.25F, -5.25F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Mask.setTextureOffset(6, 25).addBox(-2.0F, -19.25F, -5.25F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Mask.setTextureOffset(4, 25).addBox(1.0F, -19.25F, -5.25F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Mask.setTextureOffset(6, 0).addBox(4.0F, -19.25F, -5.25F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, -21.0F, 0.0F);
		Body.setTextureOffset(0, 0).addBox(-8.0F, 0.0F, -4.0F, 16.0F, 8.0F, 8.0F, 0.0F, false);
		Body.setTextureOffset(40, 8).addBox(-7.0F, 8.0F, -4.0F, 14.0F, 4.0F, 8.0F, 0.0F, false);
		Body.setTextureOffset(0, 37).addBox(-6.0F, 12.0F, -4.0F, 12.0F, 4.0F, 8.0F, 0.0F, false);
		Body.setTextureOffset(32, 32).addBox(-7.0F, 16.0F, -4.0F, 14.0F, 5.0F, 8.0F, 0.0F, false);

		Bones = new ModelRenderer(this);
		Bones.setRotationPoint(0.0F, 13.0F, 0.0F);
		Body.addChild(Bones);
		Bones.setTextureOffset(22, 49).addBox(-7.9F, -12.1F, -4.5F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		Bones.setTextureOffset(40, 26).addBox(-7.9F, -9.1F, -4.5F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		Bones.setTextureOffset(54, 5).addBox(-7.9F, -6.1F, -4.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		Bones.setTextureOffset(56, 3).addBox(-6.9F, -5.1F, -4.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		Bones.setTextureOffset(56, 0).addBox(-6.9F, -3.1F, -4.5F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		Bones.setTextureOffset(59, 20).addBox(1.9F, -3.1F, -4.5F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		Bones.setTextureOffset(54, 30).addBox(1.9F, -5.1F, -4.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		Bones.setTextureOffset(53, 28).addBox(1.9F, -6.1F, -4.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		Bones.setTextureOffset(40, 5).addBox(1.9F, -9.1F, -4.5F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		Bones.setTextureOffset(40, 29).addBox(1.9F, -12.1F, -4.5F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		Bones.setTextureOffset(19, 73).addBox(-2.0F, -13.0F, 3.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Bones.setTextureOffset(84, 102).addBox(-1.0F, -13.0F, 3.5F, 2.0F, 20.0F, 1.0F, 0.0F, false);
		Bones.setTextureOffset(76, 40).addBox(1.0F, -13.0F, 3.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Bones.setTextureOffset(69, 23).addBox(1.0F, -10.0F, 3.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Bones.setTextureOffset(72, 54).addBox(-2.0F, -10.0F, 3.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Bones.setTextureOffset(36, 49).addBox(1.0F, -7.0F, 3.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Bones.setTextureOffset(66, 54).addBox(1.0F, -4.0F, 3.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Bones.setTextureOffset(44, 68).addBox(-3.0F, -4.0F, 3.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Bones.setTextureOffset(26, 69).addBox(-2.0F, -7.0F, 3.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Bones.setTextureOffset(22, 53).addBox(-3.0F, -1.0F, 3.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Bones.setTextureOffset(0, 53).addBox(1.0F, -1.0F, 3.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Bones.setTextureOffset(44, 65).addBox(-3.0F, 2.0F, 3.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Bones.setTextureOffset(63, 23).addBox(1.0F, 2.0F, 3.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Bones.setTextureOffset(88, 15).addBox(2.0F, -13.0F, 4.0F, 2.0F, 8.0F, 1.0F, 0.0F, false);
		Bones.setTextureOffset(0, 0).addBox(-4.0F, -12.0F, 4.0F, 2.0F, 7.0F, 1.0F, 0.0F, false);

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, 29.0F, 37.0F);
		setRotationAngle(Tail, 0.9163F, 0.0F, 0.0F);
		Tail.setTextureOffset(84, 102).addBox(-1.0F, -45.0F, 3.5F, 2.0F, 15.0F, 1.0F, 0.0F, false);
		Tail.setTextureOffset(112, 109).addBox(-2.0F, -45.0F, -0.5F, 4.0F, 15.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -34.8107F, -1.9515F);
		Tail.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.3927F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(112, 107).addBox(-2.0F, 5.0F, -0.5F, 4.0F, 17.0F, 4.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -37.8994F, -3.5604F);
		Tail.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.3927F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(84, 102).addBox(-1.0F, 10.0F, 3.5F, 2.0F, 15.0F, 1.0F, 0.0F, false);

		Wings = new ModelRenderer(this);
		Wings.setRotationPoint(0.0F, -8.0F, 0.0F);
		Wings.setTextureOffset(0, 69).addBox(-8.0F, -13.0F, 5.5F, 2.0F, 15.0F, 0.0F, 0.0F, false);
		Wings.setTextureOffset(30, 53).addBox(-4.0F, -12.0F, 5.5F, 1.0F, 9.0F, 0.0F, 0.0F, false);
		Wings.setTextureOffset(62, 45).addBox(-6.0F, -13.0F, 5.5F, 2.0F, 12.0F, 0.0F, 0.0F, false);
		Wings.setTextureOffset(14, 72).addBox(-4.0F, -13.0F, 5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(0, 23).addBox(-8.0F, -14.0F, 5.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(30, 18).addBox(-11.0F, -15.0F, 6.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(67, 6).addBox(-13.0F, -16.0F, 6.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(26, 96).addBox(-15.0F, -19.0F, 6.5F, 2.0F, 27.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(62, 26).addBox(-17.0F, -17.0F, 7.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(76, 62).addBox(-18.0F, -18.0F, 7.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(54, 51).addBox(-20.0F, -19.0F, 8.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(0, 49).addBox(-22.0F, -21.0F, 8.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(52, 93).addBox(-23.0F, -18.0F, 8.5F, 1.0F, 30.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(8, 69).addBox(-22.0F, 12.0F, 8.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(68, 3).addBox(-20.0F, 14.0F, 8.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(68, 0).addBox(-18.0F, 16.0F, 8.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(60, 93).addBox(-22.0F, -18.0F, 8.5F, 2.0F, 30.0F, 0.0F, 0.0F, false);
		Wings.setTextureOffset(42, 96).addBox(-20.0F, -18.0F, 8.5F, 2.0F, 29.0F, 0.0F, 0.0F, false);
		Wings.setTextureOffset(50, 96).addBox(-18.0F, -17.0F, 7.5F, 1.0F, 26.0F, 0.0F, 0.0F, false);
		Wings.setTextureOffset(0, 104).addBox(-17.0F, -16.0F, 7.5F, 2.0F, 23.0F, 0.0F, 0.0F, false);
		Wings.setTextureOffset(76, 60).addBox(-13.0F, 8.0F, 6.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(8, 104).addBox(-13.0F, -15.0F, 6.5F, 2.0F, 21.0F, 0.0F, 0.0F, false);
		Wings.setTextureOffset(102, 42).addBox(-11.0F, -14.0F, 6.5F, 3.0F, 18.0F, 0.0F, 0.0F, false);
		Wings.setTextureOffset(72, 45).addBox(3.0F, -12.0F, 5.5F, 1.0F, 9.0F, 0.0F, 0.0F, false);
		Wings.setTextureOffset(73, 2).addBox(2.0F, -13.0F, 5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(30, 16).addBox(4.0F, -14.0F, 5.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(51, 65).addBox(4.0F, -13.0F, 5.5F, 2.0F, 12.0F, 0.0F, 0.0F, false);
		Wings.setTextureOffset(4, 69).addBox(6.0F, -13.0F, 5.5F, 2.0F, 15.0F, 0.0F, 0.0F, false);
		Wings.setTextureOffset(16, 104).addBox(8.0F, -14.0F, 6.5F, 3.0F, 18.0F, 0.0F, 0.0F, false);
		Wings.setTextureOffset(12, 104).addBox(11.0F, -15.0F, 6.5F, 2.0F, 21.0F, 0.0F, 0.0F, false);
		Wings.setTextureOffset(32, 37).addBox(8.0F, -15.0F, 6.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(13, 74).addBox(11.0F, -16.0F, 6.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(36, 96).addBox(13.0F, -19.0F, 6.5F, 2.0F, 27.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(69, 77).addBox(11.0F, 8.0F, 6.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(4, 104).addBox(15.0F, -16.0F, 7.5F, 2.0F, 23.0F, 0.0F, 0.0F, false);
		Wings.setTextureOffset(46, 96).addBox(18.0F, -18.0F, 8.5F, 2.0F, 29.0F, 0.0F, 0.0F, false);
		Wings.setTextureOffset(82, 102).addBox(17.0F, -17.0F, 7.5F, 1.0F, 26.0F, 0.0F, 0.0F, false);
		Wings.setTextureOffset(32, 96).addBox(20.0F, -18.0F, 8.5F, 2.0F, 30.0F, 0.0F, 0.0F, false);
		Wings.setTextureOffset(56, 93).addBox(22.0F, -18.0F, 8.5F, 1.0F, 30.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(8, 72).addBox(20.0F, 12.0F, 8.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(20, 69).addBox(18.0F, 14.0F, 8.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(14, 69).addBox(16.0F, 16.0F, 8.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(50, 20).addBox(20.0F, -21.0F, 8.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(74, 4).addBox(18.0F, -19.0F, 8.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(74, 0).addBox(15.0F, -17.0F, 7.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Wings.setTextureOffset(65, 77).addBox(17.0F, -18.0F, 7.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(-8.0F, -17.0F, 0.0F);
		LeftArm.setTextureOffset(0, 90).addBox(-7.0F, -4.0F, -3.0F, 7.0F, 8.0F, 6.0F, 0.0F, false);
		LeftArm.setTextureOffset(45, 78).addBox(-7.0F, 12.0F, -3.0F, 7.0F, 9.0F, 6.0F, 0.0F, false);
		LeftArm.setTextureOffset(94, 15).addBox(-6.0F, 4.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(8.0F, -17.0F, 0.0F);
		RightArm.setTextureOffset(76, 0).addBox(0.0F, 12.0F, -3.0F, 7.0F, 9.0F, 6.0F, 0.0F, false);
		RightArm.setTextureOffset(65, 88).addBox(0.0F, -4.0F, -3.0F, 7.0F, 8.0F, 6.0F, 0.0F, false);
		RightArm.setTextureOffset(91, 91).addBox(0.0F, 4.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(-4.0F, 0.0F, 0.0F);
		LeftLeg.setTextureOffset(22, 85).addBox(-3.0F, 0.0F, -4.0F, 7.0F, 3.0F, 8.0F, 0.0F, false);
		LeftLeg.setTextureOffset(75, 75).addBox(-3.0F, 18.0083F, -5.2582F, 7.0F, 5.0F, 8.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(2.0F, 8.8603F, -2.757F);
		LeftLeg.addChild(cube_r5);
		setRotationAngle(cube_r5, 1.1781F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(23, 65).addBox(-5.0F, -4.0F, -4.0F, 7.0F, 12.0F, 7.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(2.0F, 11.3149F, 3.2558F);
		LeftLeg.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(76, 40).addBox(-5.0F, -3.0F, -2.0F, 7.0F, 14.0F, 6.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(2.0F, 5.1648F, -1.2263F);
		LeftLeg.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(32, 45).addBox(-5.0F, -4.0F, -4.0F, 7.0F, 12.0F, 8.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(4.0F, 0.0F, 0.0F);
		RightLeg.setTextureOffset(83, 60).addBox(-4.0F, 0.0F, -4.0F, 7.0F, 3.0F, 8.0F, 0.0F, false);
		RightLeg.setTextureOffset(0, 76).addBox(-4.0F, 18.0083F, -5.2582F, 7.0F, 5.0F, 8.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.0F, 8.8603F, -2.757F);
		RightLeg.addChild(cube_r8);
		setRotationAngle(cube_r8, 1.1781F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(55, 58).addBox(-2.0F, -4.0F, -4.0F, 7.0F, 12.0F, 7.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.0F, 11.3149F, 3.2558F);
		RightLeg.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.3927F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(68, 20).addBox(-2.0F, -3.0F, -2.0F, 7.0F, 14.0F, 6.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-2.0F, 5.1648F, -1.2263F);
		RightLeg.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.3927F, 0.0F, 0.0F);
		cube_r10.setTextureOffset(0, 49).addBox(-2.0F, -4.0F, -4.0F, 7.0F, 12.0F, 8.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		Tail.render(matrixStack, buffer, packedLight, packedOverlay);
		Wings.render(matrixStack, buffer, packedLight, packedOverlay);
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