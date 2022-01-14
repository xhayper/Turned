package io.github.changedmc.turned.util;

import io.github.changedmc.turned.Main;
import net.minecraft.world.level.GameRules;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class GamerulesUtility {

    private static <T> T safeInvokeMethod(Method method, Object... args) {
        try {
            return (T) method.invoke(null, args);
        } catch (Exception exception) {
            Main.LOGGER.error("Failed to invoke method: " + method.getName(), exception);
            return null;
        }
    }

    private static <T> T safeInvokeConstructor(Constructor<T> constructor, Object... args) {
        try {
            return constructor.newInstance(args);
        } catch (Exception exception) {
            Main.LOGGER.error("Failed to invoke constructor: " + constructor.getName(), exception);
            return null;
        }
    }

    public static class BooleanValue {
        public static GameRules.Type<GameRules.BooleanValue> create(boolean defaultValue) {
            Method createGameruleMethod = ObfuscationReflectionHelper.findMethod(GameRules.BooleanValue.class, "m_46250_", boolean.class);
            return safeInvokeMethod(createGameruleMethod, defaultValue);
        }
    }

    public static class IntegerValue {
        public static GameRules.Type<GameRules.IntegerValue> create(int defaultValue) {
            Method createGameruleMethod = ObfuscationReflectionHelper.findMethod(GameRules.IntegerValue.class, "m_46312_", int.class);
            return safeInvokeMethod(createGameruleMethod, defaultValue);
        }
    }

}
