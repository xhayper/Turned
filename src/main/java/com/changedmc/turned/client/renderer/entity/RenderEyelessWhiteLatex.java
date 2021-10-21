package com.changedmc.turned.client.renderer.entity;

import com.changedmc.turned.client.model.ModelEyelessWhiteLatex;
import com.changedmc.turned.entity.EntityEyelessWhiteLatex;
import com.changedmc.turned.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEyelessWhiteLatex extends RenderLiving<EntityEyelessWhiteLatex> 
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID +  ":textures/entity/eyelesswhitelatex.png");
	public RenderEyelessWhiteLatex(RenderManager manager) {
		super(manager, new ModelEyelessWhiteLatex(), 0.5F);
		
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityEyelessWhiteLatex entity) {
		return TEXTURES;
	}
	@Override
	protected void applyRotations(EntityEyelessWhiteLatex entityLiving, float p_77043_2_, float rotationYaw,
			float partialTicks) {
		
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
