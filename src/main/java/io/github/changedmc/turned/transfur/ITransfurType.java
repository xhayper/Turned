package io.github.changedmc.turned.transfur;

import net.minecraftforge.client.event.RenderArmEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;

public interface ITransfurType {
    void render(RenderPlayerEvent.Pre event);

    void renderArm(RenderArmEvent event);
}
