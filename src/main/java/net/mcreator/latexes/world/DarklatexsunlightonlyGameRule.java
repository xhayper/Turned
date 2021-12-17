package net.mcreator.latexes.world;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.world.GameRules;

import net.mcreator.latexes.LatexModElements;

import java.lang.reflect.Method;

@LatexModElements.ModElement.Tag
public class DarklatexsunlightonlyGameRule extends LatexModElements.ModElement {
	public static final GameRules.RuleKey<GameRules.BooleanValue> gamerule = GameRules.register("darklatexsunlightonly", GameRules.Category.UPDATES,
			create(false));
	public DarklatexsunlightonlyGameRule(LatexModElements instance) {
		super(instance, 522);
	}

	public static GameRules.RuleType<GameRules.BooleanValue> create(boolean defaultValue) {
		try {
			Method createGameruleMethod = ObfuscationReflectionHelper.findMethod(GameRules.BooleanValue.class, "func_223568_b", boolean.class);
			createGameruleMethod.setAccessible(true);
			return (GameRules.RuleType<GameRules.BooleanValue>) createGameruleMethod.invoke(null, defaultValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
