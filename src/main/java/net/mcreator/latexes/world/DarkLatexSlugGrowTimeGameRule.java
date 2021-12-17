package net.mcreator.latexes.world;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.world.GameRules;

import net.mcreator.latexes.LatexModElements;

import java.lang.reflect.Method;

@LatexModElements.ModElement.Tag
public class DarkLatexSlugGrowTimeGameRule extends LatexModElements.ModElement {
	public static final GameRules.RuleKey<GameRules.IntegerValue> gamerule = GameRules.register("darkLatexSlugGrowTime", GameRules.Category.MOBS,
			create(325));
	public DarkLatexSlugGrowTimeGameRule(LatexModElements instance) {
		super(instance, 438);
	}

	public static GameRules.RuleType<GameRules.IntegerValue> create(int defaultValue) {
		try {
			Method createGameruleMethod = ObfuscationReflectionHelper.findMethod(GameRules.IntegerValue.class, "func_223559_b", int.class);
			createGameruleMethod.setAccessible(true);
			return (GameRules.RuleType<GameRules.IntegerValue>) createGameruleMethod.invoke(null, defaultValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}