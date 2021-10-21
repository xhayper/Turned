package com.changedmc.turned.client.renderer.entity;

import com.changedmc.turned.client.model.ModelDarkLatexM;
import com.changedmc.turned.util.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderDarkLatexM<T extends EntityLivingBase> extends RenderLivingBase<T> {
    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/darklatexm.png");

    public RenderDarkLatexM(RenderManager manager) {
        super(manager, (ModelBase) new ModelDarkLatexM(), 0.5F);
    }

    public ResourceLocation getEntityTexture(T entity) {
        return TEXTURES;
    }
}
		  
