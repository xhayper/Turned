package com.changedmc.turned.transfur;

import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;

public interface ITransfurType {
    void render(RenderPlayerEvent.Pre event);

    void renderHand(RenderHandEvent event);
}
