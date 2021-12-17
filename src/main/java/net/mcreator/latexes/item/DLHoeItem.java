
package net.mcreator.latexes.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.ActionResultType;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.block.BlockState;

import net.mcreator.latexes.procedures.DLSwordLivingEntityIsHitWithToolProcedure;
import net.mcreator.latexes.procedures.DLHoeRightClickedOnBlockProcedure;
import net.mcreator.latexes.itemgroup.LatexitemsItemGroup;
import net.mcreator.latexes.block.DarklatexblockBlock;
import net.mcreator.latexes.LatexModElements;

import java.util.Map;
import java.util.HashMap;

@LatexModElements.ModElement.Tag
public class DLHoeItem extends LatexModElements.ModElement {
	@ObjectHolder("latex:dl_hoe")
	public static final Item block = null;
	public DLHoeItem(LatexModElements instance) {
		super(instance, 62);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 225;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return 1.5f;
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
		}, 0, -3.5f, new Item.Properties().group(LatexitemsItemGroup.tab)) {
			@Override
			public ActionResultType onItemUse(ItemUseContext context) {
				ActionResultType retval = super.onItemUse(context);
				World world = context.getWorld();
				BlockPos pos = context.getPos();
				PlayerEntity entity = context.getPlayer();
				Direction direction = context.getFace();
				BlockState blockstate = world.getBlockState(pos);
				int x = pos.getX();
				int y = pos.getY();
				int z = pos.getZ();
				ItemStack itemstack = context.getItem();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					DLHoeRightClickedOnBlockProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}

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
		}.setRegistryName("dl_hoe"));
	}
}
