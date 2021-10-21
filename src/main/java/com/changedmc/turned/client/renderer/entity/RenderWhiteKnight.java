package com.changedmc.turned.client.renderer.entity;

import com.changedmc.turned.client.model.ModelWhiteKnight;
import com.changedmc.turned.entity.EntityWhiteKnight;
import com.changedmc.turned.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWhiteKnight extends RenderLiving<EntityWhiteKnight> 
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID +  ":textures/entity/whiteknight.png");
	public RenderWhiteKnight(RenderManager manager) {
		super(manager, new ModelWhiteKnight(), 0.5F);
		
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityWhiteKnight entity) {
		return TEXTURES;
	}
	@Override
	protected void applyRotations(EntityWhiteKnight entityLiving, float p_77043_2_, float rotationYaw,
			float partialTicks) {
		
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}