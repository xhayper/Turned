
package net.mcreator.latexes.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.BlockState;

import net.mcreator.latexes.procedures.TabletoffRightClickedInAirProcedure;
import net.mcreator.latexes.LatexModElements;

import java.util.Map;
import java.util.HashMap;

@LatexModElements.ModElement.Tag
public class TabletoffItem extends LatexModElements.ModElement {
	@ObjectHolder("latex:tabletoff")
	public static final Item block = null;
	public TabletoffItem(LatexModElements instance) {
		super(instance, 362);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(null).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("tabletoff");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
			ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
			ItemStack itemstack = ar.getResult();
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				TabletoffRightClickedInAirProcedure.executeProcedure($_dependencies);
			}
			return ar;
		}
	}
}
