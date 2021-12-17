
package net.mcreator.latexes.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.LivingEntity;

import net.mcreator.latexes.procedures.DLSwordLivingEntityIsHitWithToolProcedure;
import net.mcreator.latexes.itemgroup.LatexitemsItemGroup;
import net.mcreator.latexes.block.DarklatexblockBlock;
import net.mcreator.latexes.LatexModElements;

import java.util.Map;
import java.util.HashMap;

@LatexModElements.ModElement.Tag
public class DLShovelItem extends LatexModElements.ModElement {
	@ObjectHolder("latex:dl_shovel")
	public static final Item block = null;
	public DLShovelItem(LatexModElements instance) {
		super(instance, 63);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 225;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return 3.25f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 25;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(DarklatexgooItem.block), new ItemStack(DarklatexblockBlock.block),
						new ItemStack(DarklatexcrystalItem.block));
			}
		}, 1, -3f, new Item.Properties().group(LatexitemsItemGroup.tab)) {
			@Override
			public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
				boolean retval = super.hitEntity(itemstack, entity, sourceentity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				World world = entity.world;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					DLSwordLivingEntityIsHitWithToolProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setRegistryName("dl_shovel"));
	}
}
