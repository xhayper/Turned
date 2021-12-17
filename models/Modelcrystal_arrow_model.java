public static class Modelcrystal_arrow_model extends ModelBase {
	private final ModelRenderer stick;
	private final ModelRenderer bone;
	private final ModelRenderer arrowhead;
	private final ModelRenderer bone2;

	public Modelcrystal_arrow_model() {
		textureWidth = 16;
		textureHeight = 16;

		stick = new ModelRenderer(this);
		stick.setRotationPoint(0.0F, 24.0F, 0.0F);
		stick.cubeList.add(new ModelBox(stick, 0, 0, -1.0F, -2.0F, 0.0F, 2, 0, 1, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		stick.addChild(bone);
		setRotationAngle(bone, -90.0F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -0.5F, -2.5F, 2, 0, 1, 0.0F, false));

		arrowhead = new ModelRenderer(this);
		arrowhead.setRotationPoint(0.0F, 24.0F, 0.0F);
		arrowhead.cubeList.add(new ModelBox(arrowhead, 0, 6, -2.0F, -2.0F, 0.0F, 1, 0, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -3.0F, -2.0F);
		arrowhead.addChild(bone2);
		setRotationAngle(bone2, -90.0F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 6, -2.0F, -2.5F, 0.5F, 1, 0, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		stick.render(f5);
		bone.render(f5);
		arrowhead.render(f5);
		bone2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}