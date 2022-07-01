package io.github.changedmc.turned.event;

import io.github.changedmc.turned.capability.transfur.ITransfurCapability;
import io.github.changedmc.turned.capability.transfur.TransfurCapability;
import io.github.changedmc.turned.client.gui.component.LatexIndicator;
import io.github.changedmc.turned.transfur.TransfurManager;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RenderArmEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class EventRenderer {

    private static final LatexIndicator latexIndicator = new LatexIndicator();

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void onRenderGameOverlay(RenderGameOverlayEvent.Pre event) {
        if (Minecraft.getInstance().player == null) return;
        latexIndicator.render(event.getMatrixStack(), event.getWindow());
    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void onRenderPlayer(RenderPlayerEvent.Pre event) {
        Player player = event.getPlayer();
        ITransfurCapability transfurCapability = player.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
        if (transfurCapability == null || !transfurCapability.isTransfured()) return;
        TransfurManager.render(event, transfurCapability.getTransfurType());
    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void onRenderArm(RenderArmEvent event) {
        Player player = event.getPlayer();
        ITransfurCapability transfurCapability = player.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
        if (transfurCapability == null || !transfurCapability.isTransfured()) return;
        TransfurManager.renderArm(event, transfurCapability.getTransfurType());
    }
}
