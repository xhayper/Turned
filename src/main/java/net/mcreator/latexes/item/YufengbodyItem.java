
package net.mcreator.latexes.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
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

import net.mcreator.latexes.procedures.YufengbodyBodyTickEventProcedure;
import net.mcreator.latexes.LatexModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@LatexModElements.ModElement.Tag
public class YufengbodyItem extends LatexModElements.ModElement {
	@ObjectHolder("latex:yufengbody_helmet")
	public static final Item helmet = null;
	@ObjectHolder("latex:yufengbody_chestplate")
	public static final Item body = null;
	@ObjectHolder("latex:yufengbody_leggings")
	public static final Item legs = null;
	@ObjectHolder("latex:yufengbody_boots")
	public static final Item boots = null;
	public YufengbodyItem(LatexModElements instance) {
		super(instance, 217);
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
				return new int[]{0, 0, 2, 0}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 0;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur"));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(DarklatexgooItem.block));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "yufengbody";
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
				armorModel.bipedBody = new Modelyufengbody_model().Body;
				armorModel.bipedLeftArm = new Modelyufengbody_model().LeftArm;
				armorModel.bipedRightArm = new Modelyufengbody_model().RightArm;
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
				return "latex:textures/yufengbodytexture.png";
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
					YufengbodyBodyTickEventProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("yufengbody_chestplate"));
	}
	public static class Modelyufengbody_model extends EntityModel<Entity> {
		private final ModelRenderer Body;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightArm;
		public Modelyufengbody_model() {
			textureWidth = 64;
			textureHeight = 64;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.setTextureOffset(6, 6).addBox(1.0F, 2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(14, 0).addBox(-1.25F, 17.6466F, 12.6581F, 2.0F, 2.0F, 5.0F, 0.0F, false);
			Body.setTextureOffset(4, 6).addBox(-2.0F, 2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(2, 11).addBox(2.0F, 1.0F, 2.25F, 1.0F, 5.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(0, 11).addBox(-3.0F, 1.0F, 2.25F, 1.0F, 5.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(6, 0).addBox(3.0F, 1.0F, 2.5F, 1.0F, 6.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(4, 0).addBox(-4.0F, 1.0F, 2.5F, 1.0F, 6.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(2, 0).addBox(4.0F, 1.0F, 2.5F, 1.0F, 7.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(0, 0).addBox(-5.0F, 1.0F, 2.5F, 1.0F, 7.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(22, 22).addBox(5.0F, 0.0F, 2.75F, 1.0F, 9.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(20, 22).addBox(-6.0F, 0.0F, 2.75F, 1.0F, 9.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(14, 22).addBox(6.0F, 0.0F, 2.75F, 1.0F, 11.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(12, 22).addBox(-7.0F, 0.0F, 2.75F, 1.0F, 11.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(18, 22).addBox(7.0F, -1.0F, 2.75F, 1.0F, 10.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(16, 22).addBox(-8.0F, -1.0F, 2.75F, 1.0F, 10.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(2, 22).addBox(10.0F, -2.0F, 2.75F, 1.0F, 15.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(0, 22).addBox(-11.0F, -2.0F, 2.75F, 1.0F, 15.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(6, 11).addBox(9.0F, 13.0F, 2.75F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(2, 7).addBox(-10.0F, 13.0F, 2.75F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(4, 11).addBox(5.0F, 11.0F, 2.75F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(0, 7).addBox(-6.0F, 11.0F, 2.75F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(8, 22).addBox(9.0F, -3.0F, 2.75F, 1.0F, 14.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(6, 22).addBox(-10.0F, -3.0F, 2.75F, 1.0F, 14.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(10, 22).addBox(8.0F, -4.0F, 2.75F, 1.0F, 14.0F, 0.0F, 0.0F, false);
			Body.setTextureOffset(4, 22).addBox(-9.0F, -4.0F, 2.75F, 1.0F, 14.0F, 0.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 0).addBox(-1.5F, 11.0F, 11.5F, 3.0F, 3.0F, 8.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.7854F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(0, 11).addBox(-1.5F, 5.5F, 8.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(0.0F, 24.0F, 0.0F);
			LeftArm.setTextureOffset(60, 0).addBox(-8.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(0.0F, 24.0F, 0.0F);
			RightArm.setTextureOffset(60, 0).addBox(7.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
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
		}
	}
}
