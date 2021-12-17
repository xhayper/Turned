
package net.mcreator.latexes.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.LatexModElements;

@LatexModElements.ModElement.Tag
public class KelvarvestItem extends LatexModElements.ModElement {
	@ObjectHolder("latex:kelvarvest_helmet")
	public static final Item helmet = null;
	@ObjectHolder("latex:kelvarvest_chestplate")
	public static final Item body = null;
	@ObjectHolder("latex:kelvarvest_leggings")
	public static final Item legs = null;
	@ObjectHolder("latex:kelvarvest_boots")
	public static final Item boots = null;
	public KelvarvestItem(LatexModElements instance) {
		super(instance, 510);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 200;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{0, 0, 7, 0}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 9;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_chain"));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.IRON_INGOT), new ItemStack(Items.IRON_NUGGET), new ItemStack(Items.LEATHER));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "kelvarvest";
			}

			@Override
			public float getToughness() {
				return 1f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.5f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(null)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "latex:textures/models/armor/kevlar_armor__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("kelvarvest_chestplate"));
	}
}
