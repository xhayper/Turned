
package net.mcreator.latexes.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import net.mcreator.latexes.procedures.SyufengbodyBodyTickEventProcedure;
import net.mcreator.latexes.LatexModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@LatexModElements.ModElement.Tag
public class SyufengbodyItem extends LatexModElements.ModElement {
	@ObjectHolder("latex:syufengbody_helmet")
	public static final Item helmet = null;
	@ObjectHolder("latex:syufengbody_chestplate")
	public static final Item body = null;
	@ObjectHolder("latex:syufengbody_leggings")
	public static final Item legs = null;
	@ObjectHolder("latex:syufengbody_boots")
	public static final Item boots = null;
	public SyufengbodyItem(LatexModElements instance) {
		super(instance, 232);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 0;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{0, 0, 5, 1}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 20;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur"));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(DarklatexgooItem.block), new ItemStack(Items.BONE),
						new ItemStack(DarklatexcrystalItem.block));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "syufengbody";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(null)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedBody = new Models_yufeng_b_model().Body;
				armorModel.bipedLeftArm = new Models_yufeng_b_model().LeftArm;
				armorModel.bipedRightArm = new Models_yufeng_b_model().RightArm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("How did you got this?! HANDS OFF."));
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "latex:textures/skeleton_yufeng_body.png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					SyufengbodyBodyTickEventProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("syufengbody_chestplate"));
	}
	public static class Models_yufeng_h_model extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer cube_r1;
		public Models_yufeng_h_model() {
			textureWidth = 16;
			textureHeight = 16;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.setTextureOffset(4, 4).addBox(-4.0F, -11.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(3.0F, -11.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.3927F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(6, 0).addBox(2.0F, -13.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 7).addBox(2.0F, -11.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			cube_r1.setTextureOffset(8, 3).addBox(-3.0F, -13.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(8, 8).addBox(-3.0F, -11.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}

	// Made with Blockbench 3.7.5
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Models_yufeng_b_model extends EntityModel<Entity> {
		private final ModelRenderer Body;
		private final ModelRenderer cube_r1;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightArm;
		public Models_yufeng_b_model() {
			textureWidth = 64;
			textureHeight = 64;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.setTextureOffset(34, 32).addBox(-4.0F, 2.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(24, 24).addBox(-4.0F, 2.0F, 2.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(34, 6).addBox(-4.0F, 4.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(12, 17).addBox(-4.0F, 4.0F, 2.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(33, 0).addBox(-4.0F, 6.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(0, 17).addBox(-4.0F, 6.0F, 2.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(0, 13).addBox(-4.0F, 8.0F, 2.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(36, 27).addBox(-4.0F, 8.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(34, 10).addBox(1.0F, 2.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(12, 13).addBox(1.0F, 2.0F, 2.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(34, 8).addBox(1.0F, 4.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(0, 15).addBox(1.0F, 4.0F, 2.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(28, 28).addBox(-1.0F, 0.0F, 2.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(13, 13).addBox(-1.25F, 13.4F, 8.3F, 2.0F, 3.0F, 7.0F, 0.0F, false);
			Body.setTextureOffset(14, 0).addBox(-0.75F, 12.9F, 8.3F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			Body.setTextureOffset(4, 30).addBox(6.0F, -1.0F, 4.0F, 1.0F, 11.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(0, 30).addBox(-7.0F, -1.0F, 4.0F, 1.0F, 11.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(22, 32).addBox(9.0F, -3.0F, 4.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(14, 32).addBox(10.0F, 5.0F, 4.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(31, 14).addBox(-11.0F, 5.0F, 4.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(18, 32).addBox(-10.0F, -3.0F, 4.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(34, 23).addBox(5.0F, 0.0F, 4.0F, 1.0F, 9.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(34, 34).addBox(-6.0F, 0.0F, 4.0F, 1.0F, 9.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(26, 32).addBox(7.0F, -1.0F, 4.0F, 1.0F, 10.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(10, 30).addBox(-8.0F, -1.0F, 4.0F, 1.0F, 10.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(8, 30).addBox(8.0F, -1.0F, 4.0F, 1.0F, 12.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(6, 0).addBox(9.0F, 5.0F, 4.0F, 1.0F, 7.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(4, 0).addBox(-10.0F, 5.0F, 4.0F, 1.0F, 7.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(12, 29).addBox(-9.0F, -1.0F, 4.0F, 1.0F, 12.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(36, 25).addBox(7.0F, -2.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(22, 8).addBox(-9.0F, -2.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(10, 22).addBox(5.0F, -1.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(16, 5).addBox(-6.0F, -1.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(36, 23).addBox(3.0F, 0.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(28, 26).addBox(-5.0F, 0.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(36, 36).addBox(1.0F, 1.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(35, 21).addBox(-3.0F, 1.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(2, 0).addBox(4.0F, 1.0F, 4.0F, 1.0F, 8.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(0, 0).addBox(-5.0F, 1.0F, 4.0F, 1.0F, 8.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(35, 14).addBox(3.0F, 1.0F, 4.0F, 1.0F, 7.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(14, 0).addBox(-4.0F, 1.0F, 4.0F, 1.0F, 7.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(24, 14).addBox(1.0F, 2.0F, 4.0F, 2.0F, 5.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(16, 0).addBox(-3.0F, 2.0F, 4.0F, 2.0F, 5.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(33, 2).addBox(1.0F, 6.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(12, 15).addBox(1.0F, 6.0F, 2.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(0, 11).addBox(1.0F, 8.0F, 2.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(36, 29).addBox(2.0F, 8.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 11).addBox(-1.0F, 8.5F, 6.0F, 2.0F, 1.0F, 8.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 0).addBox(-1.5F, 9.0F, 6.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			LeftArm.setTextureOffset(23, 0).addBox(-0.5F, -2.1F, -2.1F, 3.0F, 2.0F, 4.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 20).addBox(0.0F, 4.0F, -2.1F, 3.0F, 5.0F, 4.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 20).addBox(2.0F, 9.0F, -2.1F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(14, 23).addBox(2.0F, 9.0F, -0.6F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			LeftArm.setTextureOffset(23, 0).addBox(2.0F, 9.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			RightArm.setTextureOffset(36, 38).addBox(-3.1F, 9.0F, -2.1F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(37, 16).addBox(-3.1F, 9.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(37, 13).addBox(-3.1F, 9.0F, -0.6F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			RightArm.setTextureOffset(14, 23).addBox(-3.1F, 4.0F, -2.1F, 3.0F, 5.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(24, 8).addBox(-3.1F, -2.1F, -2.1F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Body.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
