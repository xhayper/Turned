package net.mcreator.latexes.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.latexes.entity.DarkLatexCentaurEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class DarkLatexCentaurRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(DarkLatexCentaurEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelDL_Centaur(), 1.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("latex:textures/dark_latex_centaur_texture.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelDL_Centaur extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer Head_r1;
		private final ModelRenderer Mask;
		private final ModelRenderer Mask_r1;
		private final ModelRenderer Ears;
		private final ModelRenderer Ears_r1;
		private final ModelRenderer Body;
		private final ModelRenderer Body_r1;
		private final ModelRenderer Tail;
		private final ModelRenderer Tail_r1;
		private final ModelRenderer LeftArm;
		private final ModelRenderer LeftArm_r1;
		private final ModelRenderer RightArm;
		private final ModelRenderer RightArm_r1;
		private final ModelRenderer RightLeg1;
		private final ModelRenderer RightLeg1_r1;
		private final ModelRenderer bone;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r1_r1;
		private final ModelRenderer bone2;
		private final ModelRenderer bone2_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r2_r1;
		private final ModelRenderer RightLeg2;
		private final ModelRenderer RightLeg2_r1;
		private final ModelRenderer bone3;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r3_r1;
		private final ModelRenderer bone4;
		private final ModelRenderer bone4_r1;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r4_r1;
		private final ModelRenderer LeftLeg1;
		private final ModelRenderer LeftLeg1_r1;
		private final ModelRenderer bone5;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r5_r1;
		private final ModelRenderer bone6;
		private final ModelRenderer bone6_r1;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r6_r1;
		private final ModelRenderer LeftLeg2;
		private final ModelRenderer LeftLeg2_r1;
		private final ModelRenderer bone9;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r7_r1;
		private final ModelRenderer bone10;
		private final ModelRenderer bone10_r1;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r8_r1;
		public ModelDL_Centaur() {
			textureWidth = 112;
			textureHeight = 112;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, -5.0F, -7.0F);
			Head_r1 = new ModelRenderer(this);
			Head_r1.setRotationPoint(0.0154F, 8.489F, 3.2218F);
			Head.addChild(Head_r1);
			setRotationAngle(Head_r1, -3.1416F, 0.0F, 3.1416F);
			Head_r1.setTextureOffset(36, 39).addBox(-3.0154F, -15.489F, -1.4718F, 6.0F, 4.0F, 1.0F, 0.0F, false);
			Head_r1.setTextureOffset(0, 82).addBox(-2.0154F, -11.489F, -1.4718F, 4.0F, 9.0F, 1.0F, 0.0F, false);
			Head_r1.setTextureOffset(38, 0).addBox(-4.0154F, -16.489F, -0.4718F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			Mask = new ModelRenderer(this);
			Mask.setRotationPoint(0.0F, 0.0F, 13.75F);
			Head.addChild(Mask);
			Mask_r1 = new ModelRenderer(this);
			Mask_r1.setRotationPoint(0.0154F, 8.489F, -10.5282F);
			Mask.addChild(Mask_r1);
			setRotationAngle(Mask_r1, -3.1416F, 0.0F, 3.1416F);
			Mask_r1.setTextureOffset(38, 16).addBox(-2.5154F, -11.364F, 7.7782F, 5.0F, 2.0F, 0.0F, 0.0F, false);
			Mask_r1.setTextureOffset(0, 18).addBox(-3.5154F, -14.364F, 7.7782F, 7.0F, 1.0F, 0.0F, 0.0F, false);
			Mask_r1.setTextureOffset(0, 19).addBox(-2.5154F, -15.364F, 7.7782F, 5.0F, 1.0F, 0.0F, 0.0F, false);
			Mask_r1.setTextureOffset(0, 0).addBox(-1.0154F, -16.364F, 7.7782F, 2.0F, 1.0F, 0.0F, 0.0F, false);
			Mask_r1.setTextureOffset(12, 3).addBox(-1.5154F, -13.364F, 7.7782F, 3.0F, 1.0F, 0.0F, 0.0F, false);
			Mask_r1.setTextureOffset(12, 0).addBox(-0.5154F, -12.364F, 7.7782F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			Mask_r1.setTextureOffset(2, 1).addBox(2.4846F, -13.364F, 7.7782F, 1.0F, 3.0F, 0.0F, 0.0F, false);
			Mask_r1.setTextureOffset(0, 1).addBox(-3.5154F, -13.364F, 7.7782F, 1.0F, 3.0F, 0.0F, 0.0F, false);
			Mask_r1.setTextureOffset(16, 4).addBox(1.4846F, -9.364F, 7.7782F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			Mask_r1.setTextureOffset(16, 1).addBox(-2.5154F, -9.364F, 7.7782F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			Mask_r1.setTextureOffset(16, 0).addBox(3.2346F, -12.364F, 7.6532F, 1.0F, 1.0F, 0.0F, 0.0F, true);
			Mask_r1.setTextureOffset(16, 0).addBox(-4.2654F, -12.364F, 7.6532F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			Ears = new ModelRenderer(this);
			Ears.setRotationPoint(0.25F, -6.0F, 6.75F);
			Head.addChild(Ears);
			setRotationAngle(Ears, -1.9635F, 0.0F, 0.0F);
			Ears_r1 = new ModelRenderer(this);
			Ears_r1.setRotationPoint(-0.2346F, -8.7523F, 12.0574F);
			Ears.addChild(Ears_r1);
			setRotationAngle(Ears_r1, -0.7854F, 0.0F, 3.1416F);
			Ears_r1.setTextureOffset(46, 55).addBox(3.7346F, -5.7148F, -18.7363F, 1.0F, 4.0F, 4.0F, 0.0F, false);
			Ears_r1.setTextureOffset(38, 0).addBox(3.7346F, -1.7148F, -18.7363F, 1.0F, 4.0F, 3.0F, 0.0F, false);
			Ears_r1.setTextureOffset(12, 0).addBox(3.7346F, 2.2852F, -18.7363F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Ears_r1.setTextureOffset(14, 16).addBox(-4.7654F, 2.2852F, -18.7363F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Ears_r1.setTextureOffset(62, 0).addBox(-4.7654F, -1.7148F, -18.7363F, 1.0F, 4.0F, 3.0F, 0.0F, false);
			Ears_r1.setTextureOffset(72, 85).addBox(-4.7654F, -5.7148F, -18.7363F, 1.0F, 4.0F, 4.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, -5.0F, -7.0F);
			Body_r1 = new ModelRenderer(this);
			Body_r1.setRotationPoint(0.0154F, 8.489F, 3.2218F);
			Body.addChild(Body_r1);
			setRotationAngle(Body_r1, -3.1416F, 0.0F, 3.1416F);
			Body_r1.setTextureOffset(36, 26).addBox(-3.0154F, 0.511F, -13.2218F, 6.0F, 1.0F, 18.0F, 0.0F, false);
			Body_r1.setTextureOffset(0, 26).addBox(-4.0154F, 1.511F, -14.2218F, 8.0F, 1.0F, 20.0F, 0.0F, false);
			Body_r1.setTextureOffset(0, 0).addBox(-4.5154F, 2.511F, -14.2218F, 9.0F, 6.0F, 20.0F, 0.0F, false);
			Body_r1.setTextureOffset(58, 16).addBox(-3.5154F, -3.489F, 1.5282F, 7.0F, 6.0F, 4.0F, 0.0F, false);
			Body_r1.setTextureOffset(0, 47).addBox(-5.0154F, -8.489F, 1.0282F, 10.0F, 5.0F, 5.0F, 0.0F, false);
			Tail = new ModelRenderer(this);
			Tail.setRotationPoint(0.0F, 6.0F, 9.625F);
			setRotationAngle(Tail, 0.3927F, 0.0F, 0.0F);
			Tail_r1 = new ModelRenderer(this);
			Tail_r1.setRotationPoint(0.0154F, -4.7702F, -4.9548F);
			Tail.addChild(Tail_r1);
			setRotationAngle(Tail_r1, -2.3562F, 0.0F, 3.1416F);
			Tail_r1.setTextureOffset(38, 45).addBox(-2.0154F, -1.3296F, -25.276F, 4.0F, 3.0F, 18.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, -2.5F, -7.25F);
			setRotationAngle(LeftArm, 0.0F, 0.0F, 0.1745F);
			LeftArm_r1 = new ModelRenderer(this);
			LeftArm_r1.setRotationPoint(-3.8709F, 6.7636F, 10.4718F);
			LeftArm.addChild(LeftArm_r1);
			setRotationAngle(LeftArm_r1, 3.1416F, 0.0F, 2.7926F);
			LeftArm_r1.setTextureOffset(66, 37).addBox(-9.1108F, 6.8967F, 8.5282F, 3.0F, 2.0F, 4.0F, 0.0F, false);
			LeftArm_r1.setTextureOffset(45, 47).addBox(-9.1108F, -8.1033F, 8.5282F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			LeftArm_r1.setTextureOffset(0, 26).addBox(-9.1108F, -7.1033F, 8.5282F, 4.0F, 14.0F, 4.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, -2.5F, -7.25F);
			setRotationAngle(RightArm, 0.0F, 0.0F, -0.1745F);
			RightArm_r1 = new ModelRenderer(this);
			RightArm_r1.setRotationPoint(3.8994F, 6.7688F, 10.4718F);
			RightArm.addChild(RightArm_r1);
			setRotationAngle(RightArm_r1, -3.1416F, 0.0F, -2.7926F);
			RightArm_r1.setTextureOffset(64, 57).addBox(6.0805F, 6.8914F, 8.5282F, 3.0F, 2.0F, 4.0F, 0.0F, false);
			RightArm_r1.setTextureOffset(25, 47).addBox(8.0805F, -8.1086F, 8.5282F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			RightArm_r1.setTextureOffset(0, 0).addBox(5.0805F, -7.1086F, 8.5282F, 4.0F, 14.0F, 4.0F, 0.0F, false);
			RightLeg1 = new ModelRenderer(this);
			RightLeg1.setRotationPoint(-2.5F, 9.0F, -7.0F);
			RightLeg1_r1 = new ModelRenderer(this);
			RightLeg1_r1.setRotationPoint(2.5154F, -5.511F, 3.2218F);
			RightLeg1.addChild(RightLeg1_r1);
			setRotationAngle(RightLeg1_r1, -3.1416F, 0.0F, 3.1416F);
			RightLeg1_r1.setTextureOffset(77, 61).addBox(0.2346F, 17.4727F, 2.7854F, 5.0F, 3.0F, 5.0F, 0.0F, false);
			RightLeg1_r1.setTextureOffset(82, 85).addBox(0.6096F, 3.386F, 0.0282F, 5.0F, 5.0F, 1.0F, 0.0F, false);
			RightLeg1_r1.setTextureOffset(40, 66).addBox(0.2346F, 3.386F, 1.0282F, 5.0F, 6.0F, 5.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(5.5F, 0.875F, 13.75F);
			RightLeg1.addChild(bone);
			setRotationAngle(bone, -0.7854F, 0.0F, 0.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 1.9888F, -2.8143F);
			bone.addChild(cube_r1);
			setRotationAngle(cube_r1, 1.4835F, 0.0F, 0.0F);
			cube_r1_r1 = new ModelRenderer(this);
			cube_r1_r1.setRotationPoint(-2.9846F, -4.5297F, 3.6285F);
			cube_r1.addChild(cube_r1_r1);
			setRotationAngle(cube_r1_r1, -1.7454F, 0.0F, -3.1416F);
			cube_r1_r1.setTextureOffset(70, 0).addBox(0.2346F, 11.5843F, 0.7598F, 5.0F, 7.0F, 4.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, -2.2929F, 1.5355F);
			bone.addChild(bone2);
			setRotationAngle(bone2, 1.1781F, 0.0F, 0.0F);
			bone2_r1 = new ModelRenderer(this);
			bone2_r1.setRotationPoint(-2.9846F, -7.7912F, -3.5217F);
			bone2.addChild(bone2_r1);
			setRotationAngle(bone2_r1, -2.3562F, 0.0F, -3.1416F);
			bone2_r1.setTextureOffset(84, 44).addBox(0.7346F, 15.659F, 1.2059F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 3.5598F, 1.3004F);
			bone2.addChild(cube_r2);
			setRotationAngle(cube_r2, -1.1781F, 0.0F, 0.0F);
			cube_r2_r1 = new ModelRenderer(this);
			cube_r2_r1.setRotationPoint(-2.9846F, 0.1113F, -12.3323F);
			cube_r2.addChild(cube_r2_r1);
			setRotationAngle(cube_r2_r1, 1.5708F, 0.0F, 3.1416F);
			cube_r2_r1.setTextureOffset(81, 19).addBox(0.7346F, -3.1217F, 14.9285F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			RightLeg2 = new ModelRenderer(this);
			RightLeg2.setRotationPoint(-3.5F, 9.0F, 8.0F);
			RightLeg2_r1 = new ModelRenderer(this);
			RightLeg2_r1.setRotationPoint(3.5154F, -5.511F, -11.7782F);
			RightLeg2.addChild(RightLeg2_r1);
			setRotationAngle(RightLeg2_r1, -3.1416F, 0.0F, 3.1416F);
			RightLeg2_r1.setTextureOffset(48, 77).addBox(0.6096F, 17.4609F, -11.538F, 5.0F, 3.0F, 5.0F, 0.0F, false);
			RightLeg2_r1.setTextureOffset(60, 85).addBox(0.6096F, 2.386F, -14.7368F, 5.0F, 6.0F, 1.0F, 0.0F, false);
			RightLeg2_r1.setTextureOffset(20, 61).addBox(0.6096F, 2.386F, -13.7368F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(6.5F, 0.875F, -15.25F);
			RightLeg2.addChild(bone3);
			setRotationAngle(bone3, -0.7854F, 0.0F, 0.0F);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 1.9888F, -2.8143F);
			bone3.addChild(cube_r3);
			setRotationAngle(cube_r3, 1.4835F, 0.0F, 0.0F);
			cube_r3_r1 = new ModelRenderer(this);
			cube_r3_r1.setRotationPoint(-2.9846F, 4.469F, 14.3534F);
			cube_r3.addChild(cube_r3_r1);
			setRotationAngle(cube_r3_r1, -1.7454F, 0.0F, -3.1416F);
			cube_r3_r1.setTextureOffset(64, 45).addBox(0.6096F, 1.3279F, -9.9083F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(0.0F, -2.2929F, 1.5355F);
			bone3.addChild(bone4);
			setRotationAngle(bone4, 1.1781F, 0.0F, 0.0F);
			bone4_r1 = new ModelRenderer(this);
			bone4_r1.setRotationPoint(-2.9846F, -2.4336F, 9.4126F);
			bone4.addChild(bone4_r1);
			setRotationAngle(bone4_r1, -2.3562F, 0.0F, -3.1416F);
			bone4_r1.setTextureOffset(12, 81).addBox(1.1096F, 9.1667F, -12.0227F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.5F, 2.3352F, 2.6368F);
			bone4.addChild(cube_r4);
			setRotationAngle(cube_r4, -1.1781F, 0.0F, 0.0F);
			cube_r4_r1 = new ModelRenderer(this);
			cube_r4_r1.setRotationPoint(-3.4846F, -8.0849F, -1.8129F);
			cube_r4.addChild(cube_r4_r1);
			setRotationAngle(cube_r4_r1, 1.5708F, 0.0F, 3.1416F);
			cube_r4_r1.setTextureOffset(0, 69).addBox(1.1096F, 5.6155F, 3.8681F, 4.0F, 9.0F, 4.0F, 0.0F, false);
			LeftLeg1 = new ModelRenderer(this);
			LeftLeg1.setRotationPoint(2.5F, 9.0F, -7.0F);
			LeftLeg1_r1 = new ModelRenderer(this);
			LeftLeg1_r1.setRotationPoint(-2.4846F, -5.511F, 3.2218F);
			LeftLeg1.addChild(LeftLeg1_r1);
			setRotationAngle(LeftLeg1_r1, -3.1416F, 0.0F, 3.1416F);
			LeftLeg1_r1.setTextureOffset(76, 11).addBox(-5.3904F, 17.4727F, 2.7854F, 5.0F, 3.0F, 5.0F, 0.0F, false);
			LeftLeg1_r1.setTextureOffset(84, 55).addBox(-5.6404F, 3.386F, 0.0282F, 5.0F, 5.0F, 1.0F, 0.0F, false);
			LeftLeg1_r1.setTextureOffset(66, 26).addBox(-5.3904F, 3.386F, 1.0282F, 5.0F, 6.0F, 5.0F, 0.0F, false);
			bone5 = new ModelRenderer(this);
			bone5.setRotationPoint(-5.5F, 0.875F, 13.75F);
			LeftLeg1.addChild(bone5);
			setRotationAngle(bone5, -0.7854F, 0.0F, 0.0F);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 1.9888F, -2.8143F);
			bone5.addChild(cube_r5);
			setRotationAngle(cube_r5, 1.4835F, 0.0F, 0.0F);
			cube_r5_r1 = new ModelRenderer(this);
			cube_r5_r1.setRotationPoint(3.0154F, -4.5297F, 3.6285F);
			cube_r5.addChild(cube_r5_r1);
			setRotationAngle(cube_r5_r1, -1.7454F, 0.0F, -3.1416F);
			cube_r5_r1.setTextureOffset(60, 66).addBox(-5.3904F, 11.5843F, 0.7598F, 5.0F, 7.0F, 4.0F, 0.0F, false);
			bone6 = new ModelRenderer(this);
			bone6.setRotationPoint(0.0F, -2.2929F, 1.5355F);
			bone5.addChild(bone6);
			setRotationAngle(bone6, 1.1781F, 0.0F, 0.0F);
			bone6_r1 = new ModelRenderer(this);
			bone6_r1.setRotationPoint(3.0154F, -7.7912F, -3.5217F);
			bone6.addChild(bone6_r1);
			setRotationAngle(bone6_r1, -2.3562F, 0.0F, -3.1416F);
			bone6_r1.setTextureOffset(82, 33).addBox(-4.8904F, 15.659F, 1.2059F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, 3.5598F, 1.3004F);
			bone6.addChild(cube_r6);
			setRotationAngle(cube_r6, -1.1781F, 0.0F, 0.0F);
			cube_r6_r1 = new ModelRenderer(this);
			cube_r6_r1.setRotationPoint(3.0154F, 0.1113F, -12.3323F);
			cube_r6.addChild(cube_r6_r1);
			setRotationAngle(cube_r6_r1, 1.5708F, 0.0F, 3.1416F);
			cube_r6_r1.setTextureOffset(32, 77).addBox(-4.8904F, -3.1217F, 14.9285F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			LeftLeg2 = new ModelRenderer(this);
			LeftLeg2.setRotationPoint(3.5F, 9.0F, 8.0F);
			LeftLeg2_r1 = new ModelRenderer(this);
			LeftLeg2_r1.setRotationPoint(-3.4846F, -5.511F, -11.7782F);
			LeftLeg2.addChild(LeftLeg2_r1);
			setRotationAngle(LeftLeg2_r1, -3.1416F, 0.0F, 3.1416F);
			LeftLeg2_r1.setTextureOffset(16, 73).addBox(-5.3904F, 17.4609F, -11.538F, 5.0F, 3.0F, 5.0F, 0.0F, false);
			LeftLeg2_r1.setTextureOffset(48, 85).addBox(-5.3904F, 2.386F, -14.7368F, 5.0F, 6.0F, 1.0F, 0.0F, false);
			LeftLeg2_r1.setTextureOffset(30, 47).addBox(-5.3904F, 2.386F, -13.7368F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			bone9 = new ModelRenderer(this);
			bone9.setRotationPoint(-6.5F, 0.875F, -15.25F);
			LeftLeg2.addChild(bone9);
			setRotationAngle(bone9, -0.7854F, 0.0F, 0.0F);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(0.0F, 1.9888F, -2.8143F);
			bone9.addChild(cube_r7);
			setRotationAngle(cube_r7, 1.4835F, 0.0F, 0.0F);
			cube_r7_r1 = new ModelRenderer(this);
			cube_r7_r1.setRotationPoint(3.0154F, 4.469F, 14.3534F);
			cube_r7.addChild(cube_r7_r1);
			setRotationAngle(cube_r7_r1, -1.7454F, 0.0F, -3.1416F);
			cube_r7_r1.setTextureOffset(0, 57).addBox(-5.3904F, 1.3279F, -9.9083F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			bone10 = new ModelRenderer(this);
			bone10.setRotationPoint(0.0F, -2.2929F, 1.5355F);
			bone9.addChild(bone10);
			setRotationAngle(bone10, 1.1781F, 0.0F, 0.0F);
			bone10_r1 = new ModelRenderer(this);
			bone10_r1.setRotationPoint(3.0154F, -2.4336F, 9.4126F);
			bone10.addChild(bone10_r1);
			setRotationAngle(bone10_r1, -2.3562F, 0.0F, -3.1416F);
			bone10_r1.setTextureOffset(74, 73).addBox(-4.8904F, 9.1667F, -12.0227F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(0.5F, 2.3352F, 2.6368F);
			bone10.addChild(cube_r8);
			setRotationAngle(cube_r8, -1.1781F, 0.0F, 0.0F);
			cube_r8_r1 = new ModelRenderer(this);
			cube_r8_r1.setRotationPoint(2.5154F, -8.0849F, -1.8129F);
			cube_r8.addChild(cube_r8_r1);
			setRotationAngle(cube_r8_r1, 1.5708F, 0.0F, 3.1416F);
			cube_r8_r1.setTextureOffset(36, 26).addBox(-4.8904F, 5.6155F, 3.8681F, 4.0F, 9.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			Body.render(matrixStack, buffer, packedLight, packedOverlay);
			Tail.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			RightLeg1.render(matrixStack, buffer, packedLight, packedOverlay);
			RightLeg2.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftLeg1.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftLeg2.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.RightLeg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.RightLeg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.LeftLeg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.LeftLeg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}
}
