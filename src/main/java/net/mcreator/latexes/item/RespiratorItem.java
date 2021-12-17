
package net.mcreator.latexes.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
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
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import net.mcreator.latexes.procedures.RespiratorHelmetTickEventProcedure;
import net.mcreator.latexes.itemgroup.LatexitemsItemGroup;
import net.mcreator.latexes.LatexModElements;

import java.util.Map;
import java.util.HashMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@LatexModElements.ModElement.Tag
public class RespiratorItem extends LatexModElements.ModElement {
	@ObjectHolder("latex:respirator_helmet")
	public static final Item helmet = null;
	@ObjectHolder("latex:respirator_chestplate")
	public static final Item body = null;
	@ObjectHolder("latex:respirator_leggings")
	public static final Item legs = null;
	@ObjectHolder("latex:respirator_boots")
	public static final Item boots = null;
	public RespiratorItem(LatexModElements instance) {
		super(instance, 49);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 10;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 3, 4, 1}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 10;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:gas_mask_wear"));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.IRON_INGOT), new ItemStack(Items.LEATHER), new ItemStack(Items.CHARCOAL),
						new ItemStack(Items.GOLD_INGOT));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "respirator";
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
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(LatexitemsItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedHead = new Modelrespirator_model().Head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "latex:textures/respirator_texture.png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				super.onArmorTick(itemstack, world, entity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					RespiratorHelmetTickEventProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("respirator_helmet"));
	}
	public static class Modelrespirator_model extends EntityModel<Entity> {
		private final ModelRenderer Head;
		public Modelrespirator_model() {
			textureWidth = 32;
			textureHeight = 32;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.setTextureOffset(0, 0).addBox(-4.0F, -3.0F, -5.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 7).addBox(-3.0F, -6.0F, -5.0F, 6.0F, 3.0F, 0.0F, 0.0F, false);
			Head.setTextureOffset(0, 10).addBox(-2.0F, -3.0F, -6.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 14).addBox(2.0F, -3.0F, -7.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(10, 10).addBox(-4.0F, -3.0F, -7.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(0, 4).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 4).addBox(-4.0F, -3.0F, -5.0F, 8.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(12, 15).addBox(-4.0F, -6.0F, -5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(8, 15).addBox(3.0F, -6.0F, -5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
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
}
