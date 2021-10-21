package com.changedmc.turned.client.model;



import org.lwjgl.opengl.GL11;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelWhiteKnight extends ModelBase {
	private final ModelRenderer Anthro;
	private final ModelRenderer LegsFront;
	private final ModelRenderer LegFrontRight;
	private final ModelRenderer LegFrontUpperRight;
	private final ModelRenderer KneeFrontRight;
	private final ModelRenderer LegFrontUnderRight;
	private final ModelRenderer FeetFrontRight;
	private final ModelRenderer beansFrontRight;
	private final ModelRenderer LegFrontLeft;
	private final ModelRenderer LegFrontUpperLeft;
	private final ModelRenderer KneeFrontLeft;
	private final ModelRenderer LegFrontUnderLeft;
	private final ModelRenderer FeetFrontLeft;
	private final ModelRenderer beansFrontLeft;
	private final ModelRenderer Body;
	private final ModelRenderer Arms;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightarm;
	private final ModelRenderer Head;
	private final ModelRenderer ears;
	private final ModelRenderer hips2;
	private final ModelRenderer LegsBack;
	private final ModelRenderer LegBackRight;
	private final ModelRenderer LegBackUpperRight;
	private final ModelRenderer KneeBackRight;
	private final ModelRenderer LegBackUnderRight;
	private final ModelRenderer FeetBackRight;
	private final ModelRenderer beansBackRight;
	private final ModelRenderer LegBackLeft;
	private final ModelRenderer LegBackUpperLeft;
	private final ModelRenderer KneeBackLeft;
	private final ModelRenderer LegBackUnderLeft;
	private final ModelRenderer FeetBackLeft;
	private final ModelRenderer beansBackLeft;
	private final ModelRenderer Tail;

	public ModelWhiteKnight() {
		textureWidth = 128;
		textureHeight = 128;

		Anthro = new ModelRenderer(this);
		Anthro.setRotationPoint(0.0F, 18.0F, 0.0F);
		setRotationAngle(Anthro, 0.0F, 1.5708F, 0.0F);

		LegsFront = new ModelRenderer(this);
		LegsFront.setRotationPoint(5.0F, 5.0F, 0.0F);
		Anthro.addChild(LegsFront);

		LegFrontRight = new ModelRenderer(this);
		LegFrontRight.setRotationPoint(0.0F, -11.0F, -2.0F);
		LegsFront.addChild(LegFrontRight);

		LegFrontUpperRight = new ModelRenderer(this);
		LegFrontUpperRight.setRotationPoint(0.0F, 11.0F, 2.0F);
		setRotationAngle(LegFrontUpperRight, 0.0F, 0.0F, -0.2618F);
		LegFrontRight.addChild(LegFrontUpperRight);
		LegFrontUpperRight.cubeList.add(new ModelBox(LegFrontUpperRight, 54, 7, 1.0F, -12.0F, -4.0F, 4, 5, 4, 0.0F, false));

		KneeFrontRight = new ModelRenderer(this);
		KneeFrontRight.setRotationPoint(0.0F, 11.0F, -8.0F);
		setRotationAngle(KneeFrontRight, 0.0F, 0.0F, 2.8798F);
		LegFrontRight.addChild(KneeFrontRight);
		KneeFrontRight.cubeList.add(new ModelBox(KneeFrontRight, 28, 47, -5.0F, 5.0F, 6.0F, 6, 3, 4, 0.0F, false));

		LegFrontUnderRight = new ModelRenderer(this);
		LegFrontUnderRight.setRotationPoint(0.0F, 11.0F, -8.0F);
		setRotationAngle(LegFrontUnderRight, 0.0F, 0.0F, -0.5236F);
		LegFrontRight.addChild(LegFrontUnderRight);
		LegFrontUnderRight.cubeList.add(new ModelBox(LegFrontUnderRight, 64, 47, 0.0F, -7.0F, 6.25F, 2, 6, 3, 0.0F, false));

		FeetFrontRight = new ModelRenderer(this);
		FeetFrontRight.setRotationPoint(0.0F, 11.0F, 2.0F);
		setRotationAngle(FeetFrontRight, 0.0F, 0.0F, -1.309F);
		LegFrontRight.addChild(FeetFrontRight);
		FeetFrontRight.cubeList.add(new ModelBox(FeetFrontRight, 64, 34, 0.0F, -1.0F, -4.0F, 2, 3, 4, 0.0F, false));

		beansFrontRight = new ModelRenderer(this);
		beansFrontRight.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(beansFrontRight, 0.0F, 0.0F, -0.2618F);
		FeetFrontRight.addChild(beansFrontRight);
		beansFrontRight.cubeList.add(new ModelBox(beansFrontRight, 64, 16, -1.0F, 0.0F, -4.0F, 2, 3, 4, 0.0F, false));

		LegFrontLeft = new ModelRenderer(this);
		LegFrontLeft.setRotationPoint(0.0F, -11.0F, 2.0F);
		LegsFront.addChild(LegFrontLeft);

		LegFrontUpperLeft = new ModelRenderer(this);
		LegFrontUpperLeft.setRotationPoint(0.0F, 11.0F, 2.0F);
		setRotationAngle(LegFrontUpperLeft, 0.0F, 0.0F, -0.2618F);
		LegFrontLeft.addChild(LegFrontUpperLeft);
		LegFrontUpperLeft.cubeList.add(new ModelBox(LegFrontUpperLeft, 28, 54, 1.0F, -12.0F, -4.0F, 4, 5, 4, 0.0F, false));

		KneeFrontLeft = new ModelRenderer(this);
		KneeFrontLeft.setRotationPoint(0.0F, 11.0F, -8.0F);
		setRotationAngle(KneeFrontLeft, 0.0F, 0.0F, 2.8798F);
		LegFrontLeft.addChild(KneeFrontLeft);
		KneeFrontLeft.cubeList.add(new ModelBox(KneeFrontLeft, 46, 31, -5.0F, 5.0F, 6.0F, 6, 3, 4, 0.0F, false));

		LegFrontUnderLeft = new ModelRenderer(this);
		LegFrontUnderLeft.setRotationPoint(0.0F, 11.0F, -8.0F);
		setRotationAngle(LegFrontUnderLeft, 0.0F, 0.0F, -0.5236F);
		LegFrontLeft.addChild(LegFrontUnderLeft);
		LegFrontUnderLeft.cubeList.add(new ModelBox(LegFrontUnderLeft, 64, 64, 0.0F, -7.0F, 6.25F, 2, 6, 3, 0.0F, false));

		FeetFrontLeft = new ModelRenderer(this);
		FeetFrontLeft.setRotationPoint(0.0F, 11.0F, 2.0F);
		setRotationAngle(FeetFrontLeft, 0.0F, 0.0F, -1.309F);
		LegFrontLeft.addChild(FeetFrontLeft);
		FeetFrontLeft.cubeList.add(new ModelBox(FeetFrontLeft, 52, 64, 0.0F, -1.0F, -4.0F, 2, 3, 4, 0.0F, false));

		beansFrontLeft = new ModelRenderer(this);
		beansFrontLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(beansFrontLeft, 0.0F, 0.0F, -0.2618F);
		FeetFrontLeft.addChild(beansFrontLeft);
		beansFrontLeft.cubeList.add(new ModelBox(beansFrontLeft, 40, 64, -1.0F, 0.0F, -4.0F, 2, 3, 4, 0.0F, false));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(5.0F, -15.0F, 0.0F);
		Anthro.addChild(Body);
		Body.cubeList.add(new ModelBox(Body, 30, 2, -2.0F, -4.0F, -4.0F, 4, 7, 8, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 56, 21, 2.0F, -3.0F, -3.0F, 1, 4, 6, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 64, 56, 2.0F, 1.0F, -2.0F, 1, 1, 4, 0.0F, false));

		Arms = new ModelRenderer(this);
		Arms.setRotationPoint(5.0F, -15.0F, 0.0F);
		Anthro.addChild(Arms);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(0.0F, -2.0F, 5.0F);
		Arms.addChild(leftarm);
		leftarm.cubeList.add(new ModelBox(leftarm, 14, 44, -2.0F, -2.0F, -1.0F, 4, 13, 3, 0.0F, false));

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(0.0F, -2.0F, -5.0F);
		Arms.addChild(rightarm);
		rightarm.cubeList.add(new ModelBox(rightarm, 0, 44, -2.0F, -2.0F, -2.0F, 4, 13, 3, 0.0F, false));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(5.0F, -20.0F, 0.0F);
		Anthro.addChild(Head);
		Head.cubeList.add(new ModelBox(Head, 28, 35, -3.0F, -5.0F, -3.0F, 6, 6, 6, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 21, 35, 3.0F, -2.0F, -2.0F, 1, 2, 4, 0.0F, false));

		ears = new ModelRenderer(this);
		ears.setRotationPoint(0.0F, 25.0F, 0.0F);
		Head.addChild(ears);
		ears.cubeList.add(new ModelBox(ears, 0, 14, -1.0F, -30.0F, 3.0F, 2, 2, 2, 0.0F, false));
		ears.cubeList.add(new ModelBox(ears, 0, 10, -1.0F, -30.0F, -5.0F, 2, 2, 2, 0.0F, false));

		hips2 = new ModelRenderer(this);
		hips2.setRotationPoint(3.0F, -10.0F, 0.0F);
		Anthro.addChild(hips2);
		hips2.cubeList.add(new ModelBox(hips2, 20, 24, -12.4F, 0.1F, -4.0F, 7, 3, 8, 0.0F, false));
		hips2.cubeList.add(new ModelBox(hips2, 0, 10, -10.4F, 0.1F, -4.0F, 11, 1, 8, 0.0F, false));
		hips2.cubeList.add(new ModelBox(hips2, 0, 0, -11.4F, -2.9F, -3.5F, 12, 3, 7, 0.0F, false));
		hips2.cubeList.add(new ModelBox(hips2, 0, 35, -7.0F, 1.0F, -3.5F, 7, 2, 7, 0.0F, false));
		hips2.cubeList.add(new ModelBox(hips2, 0, 19, -2.0F, -2.0F, -4.0F, 6, 5, 8, 0.0F, false));

		LegsBack = new ModelRenderer(this);
		LegsBack.setRotationPoint(-9.0F, 15.0F, 0.0F);
		hips2.addChild(LegsBack);

		LegBackRight = new ModelRenderer(this);
		LegBackRight.setRotationPoint(0.0F, 0.0F, 0.0F);
		LegsBack.addChild(LegBackRight);

		LegBackUpperRight = new ModelRenderer(this);
		LegBackUpperRight.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(LegBackUpperRight, 0.0F, 0.0F, -0.2618F);
		LegBackRight.addChild(LegBackUpperRight);
		LegBackUpperRight.cubeList.add(new ModelBox(LegBackUpperRight, 52, 38, 1.0F, -12.0F, -4.0F, 4, 5, 4, 0.0F, false));

		KneeBackRight = new ModelRenderer(this);
		KneeBackRight.setRotationPoint(0.0F, 0.0F, -10.0F);
		setRotationAngle(KneeBackRight, 0.0F, 0.0F, 2.8798F);
		LegBackRight.addChild(KneeBackRight);
		KneeBackRight.cubeList.add(new ModelBox(KneeBackRight, 46, 0, -5.0F, 5.0F, 6.0F, 6, 3, 4, 0.0F, false));

		LegBackUnderRight = new ModelRenderer(this);
		LegBackUnderRight.setRotationPoint(0.0F, -4.0F, -3.0F);
		setRotationAngle(LegBackUnderRight, 0.0F, 0.0F, -0.5236F);
		LegBackRight.addChild(LegBackUnderRight);
		LegBackUnderRight.cubeList.add(new ModelBox(LegBackUnderRight, 30, 63, -2.0F, -3.5359F, -0.75F, 2, 6, 3, 0.0F, false));

		FeetBackRight = new ModelRenderer(this);
		FeetBackRight.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(FeetBackRight, 0.0F, 0.0F, -1.309F);
		LegBackRight.addChild(FeetBackRight);
		FeetBackRight.cubeList.add(new ModelBox(FeetBackRight, 18, 63, 0.0F, -1.0F, -4.0F, 2, 3, 4, 0.0F, false));

		beansBackRight = new ModelRenderer(this);
		beansBackRight.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(beansBackRight, 0.0F, 0.0F, -0.2618F);
		FeetBackRight.addChild(beansBackRight);
		beansBackRight.cubeList.add(new ModelBox(beansBackRight, 10, 60, -1.0F, 0.0F, -4.0F, 2, 3, 4, 0.0F, false));

		LegBackLeft = new ModelRenderer(this);
		LegBackLeft.setRotationPoint(0.0F, -11.0F, 2.0F);
		LegsBack.addChild(LegBackLeft);

		LegBackUpperLeft = new ModelRenderer(this);
		LegBackUpperLeft.setRotationPoint(0.0F, 11.0F, 2.0F);
		setRotationAngle(LegBackUpperLeft, 0.0F, 0.0F, -0.2618F);
		LegBackLeft.addChild(LegBackUpperLeft);
		LegBackUpperLeft.cubeList.add(new ModelBox(LegBackUpperLeft, 48, 48, 1.0F, -12.0F, -4.0F, 4, 5, 4, 0.0F, false));

		KneeBackLeft = new ModelRenderer(this);
		KneeBackLeft.setRotationPoint(0.0F, 5.0F, 0.0F);
		setRotationAngle(KneeBackLeft, 0.0F, 0.0F, 2.8798F);
		LegBackLeft.addChild(KneeBackLeft);
		KneeBackLeft.cubeList.add(new ModelBox(KneeBackLeft, 42, 20, -3.4471F, -0.7956F, -2.0F, 6, 3, 4, 0.0F, false));

		LegBackUnderLeft = new ModelRenderer(this);
		LegBackUnderLeft.setRotationPoint(-2.0F, 6.0F, 0.0F);
		setRotationAngle(LegBackUnderLeft, 0.0F, 0.0F, -0.5236F);
		LegBackLeft.addChild(LegBackUnderLeft);
		LegBackUnderLeft.cubeList.add(new ModelBox(LegBackUnderLeft, 0, 60, -0.7679F, -1.6699F, -1.75F, 2, 6, 3, 0.0F, false));

		FeetBackLeft = new ModelRenderer(this);
		FeetBackLeft.setRotationPoint(0.0F, 11.0F, 2.0F);
		setRotationAngle(FeetBackLeft, 0.0F, 0.0F, -1.309F);
		LegBackLeft.addChild(FeetBackLeft);
		FeetBackLeft.cubeList.add(new ModelBox(FeetBackLeft, 56, 57, 0.0F, -1.0F, -4.0F, 2, 3, 4, 0.0F, false));

		beansBackLeft = new ModelRenderer(this);
		beansBackLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(beansBackLeft, 0.0F, 0.0F, -0.2618F);
		FeetBackLeft.addChild(beansBackLeft);
		beansBackLeft.cubeList.add(new ModelBox(beansBackLeft, 44, 57, -1.0F, 0.0F, -4.0F, 2, 3, 4, 0.0F, false));

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(-8.0F, -11.0F, 0.0F);
		setRotationAngle(Tail, 0.0F, 0.0F, -0.0873F);
		Anthro.addChild(Tail);
		Tail.cubeList.add(new ModelBox(Tail, 20, 20, -9.9759F, -0.9856F, -1.0F, 10, 2, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Anthro.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}