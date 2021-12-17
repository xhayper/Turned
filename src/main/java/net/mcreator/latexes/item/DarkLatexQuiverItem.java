
package net.mcreator.latexes.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import net.mcreator.latexes.itemgroup.LatexitemsItemGroup;
import net.mcreator.latexes.LatexModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@LatexModElements.ModElement.Tag
public class DarkLatexQuiverItem extends LatexModElements.ModElement {
	@ObjectHolder("latex:dark_latex_quiver_helmet")
	public static final Item helmet = null;
	@ObjectHolder("latex:dark_latex_quiver_chestplate")
	public static final Item body = null;
	@ObjectHolder("latex:dark_latex_quiver_leggings")
	public static final Item legs = null;
	@ObjectHolder("latex:dark_latex_quiver_boots")
	public static final Item boots = null;
	public DarkLatexQuiverItem(LatexModElements instance) {
		super(instance, 39);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 75;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{0, 0, 2, 0}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 25;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(DarklatexgooItem.block), new ItemStack(DarklatexcrystalItem.block));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "dark_latex_quiver";
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
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(LatexitemsItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedBody = new Modeldark_latex_quiver().Body;
				armorModel.bipedLeftArm = new Modeldark_latex_quiver().bone4L;
				armorModel.bipedRightArm = new Modeldark_latex_quiver().bone3R;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "latex:textures/dark_latex_quiver.png";
			}
		}.setRegistryName("dark_latex_quiver_chestplate"));
	}
	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modeldark_latex_quiver extends EntityModel<Entity> {
		private final ModelRenderer Body;
		private final ModelRenderer bone;
		private final ModelRenderer bone2;
		private final ModelRenderer bone3R;
		private final ModelRenderer bone4L;
		public Modeldark_latex_quiver() {
			textureWidth = 64;
			textureHeight = 64;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(-4.0F, 0.25F, 0.0F);
			Body.addChild(bone);
			setRotationAngle(bone, 0.0F, 0.0F, -0.3927F);
			bone.setTextureOffset(10, 10).addBox(0.1913F, -0.4619F, 5.25F, 4.0F, 12.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(20, 6).addBox(0.1913F, -0.4619F, 3.25F, 1.0F, 12.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(0, 19).addBox(1.1913F, 0.5381F, 3.25F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(20, 20).addBox(3.1913F, -0.4619F, 3.25F, 1.0F, 12.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(0, 6).addBox(0.1913F, -0.4619F, 2.25F, 4.0F, 12.0F, 1.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(6.2716F, 0.8981F, -0.25F);
			bone.addChild(bone2);
			setRotationAngle(bone2, 0.0F, 0.0F, 1.1781F);
			bone2.setTextureOffset(0, 3).addBox(-4.0F, 4.0F, -2.0F, 12.0F, 2.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(0, 0).addBox(-4.0F, 4.0F, 2.0F, 12.0F, 2.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(8, 23).addBox(-4.0F, 4.0F, -1.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
			bone2.setTextureOffset(24, 3).addBox(7.0F, 4.0F, -1.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
			bone3R = new ModelRenderer(this);
			bone3R.setRotationPoint(-6.0F, 3.0F, 0.0F);
			Body.addChild(bone3R);
			bone3R.setTextureOffset(60, 0).addBox(12.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone4L = new ModelRenderer(this);
			bone4L.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.addChild(bone4L);
			bone4L.setTextureOffset(60, 0).addBox(-7.0F, 2.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Body.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}
}
