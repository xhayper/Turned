package io.github.changedmc.turned.item;

import io.github.changedmc.turned.reference.TurnedArmor;
import io.github.changedmc.turned.reference.TurnedCreativeModeTab;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;


public class DarkLatexMask extends ArmorItem {

    public DarkLatexMask() {
        super(TurnedArmor.LATEX_ARMOR, EquipmentSlot.HEAD, new Item.Properties().tab(TurnedCreativeModeTab.MISCELLANEOUS).rarity(Rarity.COMMON).durability(100).defaultDurability(100));
    }
	/*
	@OnlyIn(Dist.CLIENT)
	public void initializeClient(Consumer<IItemRenderProperties> consumer) {
		consumer.accept(new IItemRenderProperties() {
			public <A extends HumanoidModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlot armorSlot, A _default) 
			{
				return;
			}
			
		}
		);
	}
	*/
    //I'll do this later, maybe
}
