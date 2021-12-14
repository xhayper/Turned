package com.changedmc.turned.transfur;

import com.changedmc.turned.deferredregister.TurnedEntityType;
import com.changedmc.turned.transfur.types.DarkLatexFoxTransfur;
import com.changedmc.turned.transfur.types.DarkLatexSnowLeopardTransfur;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraftforge.client.event.RenderArmEvent;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;

public class TransfurManager {

    public final static HashMap<Integer, ITransfurType> transfurTypeHashMap = new HashMap<>();
    public final static HashMap<Integer, EntityType<? extends Mob>> entityTypeHashMap = new HashMap<>();

    public static void init() {
        register(1, TurnedEntityType.DARK_LATEX_FOX.get(), new DarkLatexFoxTransfur());
        register(2, TurnedEntityType.DARK_LATEX_SNOW_LEOPARD.get(), new DarkLatexSnowLeopardTransfur());
    }

    public static void register(int type, EntityType<? extends Mob> entityType, ITransfurType transfurType) {
        transfurTypeHashMap.put(type, transfurType);
        entityTypeHashMap.put(type, entityType);
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
