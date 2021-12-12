package com.changedmc.turned.transfur;

import com.changedmc.turned.transfur.types.DarkLatexFoxTransfur;
import com.changedmc.turned.transfur.types.DarkLatexSnowLeopardTransfur;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;

import java.util.HashMap;

public class TransfurManager {

    public HashMap<Integer, ITransfurType> transfurTypeHashMap = new HashMap<>();

    public TransfurManager() {
        transfurTypeHashMap.put(1, new DarkLatexFoxTransfur());
        transfurTypeHashMap.put(2, new DarkLatexSnowLeopardTransfur());
    }

    public void render(RenderPlayerEvent.Pre event, int type) {
        if (!transfurTypeHashMap.containsKey(type)) return;
        transfurTypeHashMap.get(type).render(event);
        event.setCanceled(true);
    }

    public void renderHand(RenderHandEvent event, int type) {
        if (!transfurTypeHashMap.containsKey(type)) return;
        transfurTypeHashMap.get(type).renderHand(event);
        event.setCanceled(true);
    }

}
