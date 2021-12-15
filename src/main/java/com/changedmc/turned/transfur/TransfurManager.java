package com.changedmc.turned.transfur;

import com.changedmc.turned.deferredregister.TurnedEntityType;
import com.changedmc.turned.transfur.types.DarkLatexFoxTransfur;
import com.changedmc.turned.transfur.types.DarkLatexSnowLeopardTransfur;
import com.changedmc.turned.transfur.types.DarkLatexTransfur;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraftforge.client.event.RenderArmEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;

import java.util.HashMap;

public class TransfurManager {

    public final static HashMap<Integer, ITransfurType> transfurTypeHashMap = new HashMap<>();
    public final static HashMap<Integer, EntityType<? extends Mob>> entityTypeHashMap = new HashMap<>();

    public static void init(boolean dontRegisterTransfurType, boolean dontRegisterEntityType) {
        if (!dontRegisterTransfurType) {
            transfurTypeHashMap.put(1, new DarkLatexFoxTransfur());
            transfurTypeHashMap.put(2, new DarkLatexSnowLeopardTransfur());
            transfurTypeHashMap.put(3, new DarkLatexTransfur());
        }
        if (!dontRegisterEntityType) {
            entityTypeHashMap.put(1, TurnedEntityType.DARK_LATEX_FOX.get());
            entityTypeHashMap.put(2, TurnedEntityType.DARK_LATEX_SNOW_LEOPARD.get());
            entityTypeHashMap.put(3, TurnedEntityType.DARK_LATEX.get());
        }
    }

    public static void render(RenderPlayerEvent.Pre event, int type) {
        if (!transfurTypeHashMap.containsKey(type)) return;
        transfurTypeHashMap.get(type).render(event);
        event.setCanceled(true);
    }

    public static void renderArm(RenderArmEvent event, int type) {
        if (!transfurTypeHashMap.containsKey(type)) return;
        transfurTypeHashMap.get(type).renderArm(event);
        event.setCanceled(true);
    }

}
