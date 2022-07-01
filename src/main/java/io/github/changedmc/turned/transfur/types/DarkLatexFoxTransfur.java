package io.github.changedmc.turned.transfur.types;

import io.github.changedmc.turned.client.model.latex.DarkLatexFoxModel;
import io.github.changedmc.turned.client.render.entity.HumanoidPlayerRenderer;
import io.github.changedmc.turned.reference.TurnedReference;
import io.github.changedmc.turned.transfur.ITransfurType;
import io.github.changedmc.turned.util.Utility;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.client.event.RenderArmEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;

import javax.annotation.Nonnull;

public class DarkLatexFoxTransfur implements ITransfurType {

    public HumanoidPlayerRenderer<Player, DarkLatexFoxModel<Player>> createRenderer() {
        EntityRendererProvider.Context entityRendererContext = Utility.getEntityRendererContext();
        return new HumanoidPlayerRenderer<>(Utility.getEntityRendererContext(), new DarkLatexFoxModel<>(entityRendererContext.bakeLayer(DarkLatexFoxModel.LAYER_LOCATION))) {
            @Nonnull
            @Override
            public ResourceLocation getTextureLocation(@Nonnull Player player) {
                return new ResourceLocation(TurnedReference.MOD_ID, "textures/entity/dark_latex_fox.png");
            }
        };
    }

    @Override
    public void render(RenderPlayerEvent.Pre event) {
        HumanoidPlayerRenderer<Player, DarkLatexFoxModel<Player>> humanoidPlayerRenderer = createRenderer();
        humanoidPlayerRenderer.render(event.getPlayer(), event.getEntity().getViewYRot(event.getPartialTick()), event.getPartialTick(), event.getPoseStack(), event.getMultiBufferSource(), event.getPackedLight());
    }

    @Override
    public void renderArm(RenderArmEvent event) {
        HumanoidPlayerRenderer<Player, DarkLatexFoxModel<Player>> humanoidPlayerRenderer = createRenderer();
        humanoidPlayerRenderer.renderHand(event.getPoseStack(), event.getMultiBufferSource(), event.getPackedLight(), event.getPlayer(), event.getArm());
    }
}
