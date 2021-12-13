package com.changedmc.turned.fluid;

import com.changedmc.turned.config.TurnedServerConfig;
import com.changedmc.turned.deferredregister.TurnedBlock;
import com.changedmc.turned.deferredregister.TurnedFluid;
import com.changedmc.turned.deferredregister.TurnedItem;
import com.changedmc.turned.gamerule.TurnedGamerules;
import com.changedmc.turned.util.Reference;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.*;
import net.minecraftforge.fluids.FluidAttributes;

import javax.annotation.Nonnull;
import java.util.List;

// TODO: Make it swimable but not behave like water.
public abstract class DarkLatexFluid extends FlowingFluid {

    private static final List<Direction> spreadDirectionList = List.of(Direction.EAST, Direction.WEST, Direction.NORTH, Direction.SOUTH, Direction.DOWN);

    @Nonnull
    public Fluid getFlowing() {
        return TurnedFluid.FLOWING_DARK_LATEX.get();
    }

    @Nonnull
    public Fluid getSource() {
        return TurnedFluid.DARK_LATEX.get();
    }

    @Nonnull
    public Item getBucket() {
        return TurnedItem.DARK_LATEX_BUCKET.get();
    }

    protected boolean canBeReplacedWith(@Nonnull FluidState fluidState, @Nonnull BlockGetter blockGetter, @Nonnull BlockPos blockPos, @Nonnull Fluid fluid, @Nonnull Direction direction) {
        return !fluid.isSame(Fluids.WATER);
    }

    public int getTickDelay(@Nonnull LevelReader levelReader) {
        return TurnedServerConfig.darkLatexSpreadDelay.get();
    }

    protected float getExplosionResistance() {
        return 100.0F;
    }

    @Nonnull
    protected BlockState createLegacyBlock(@Nonnull FluidState fluidState) {
        return TurnedBlock.DARK_LATEX_FLUID.get().defaultBlockState().setValue(LiquidBlock.LEVEL, getLegacyLevel(fluidState));
    }

    protected boolean canConvertToSource() {
        return false;
    }

    protected void spreadTo(@Nonnull LevelAccessor levelAccessor, @Nonnull BlockPos blockPos, @Nonnull BlockState blockState, @Nonnull Direction direction, @Nonnull FluidState p_76009_) {
        super.spreadTo(levelAccessor, blockPos, blockState, direction, p_76009_);
    }

    public void tick(@Nonnull Level level, @Nonnull BlockPos blockPos, @Nonnull FluidState p_75997_) {
        if (level.getGameRules().getBoolean(TurnedGamerules.RULE_DO_DARK_LATEX_SPREAD)) {
            for (Direction spreadDirection : spreadDirectionList) {
                BlockPos newBlockPos = blockPos.relative(spreadDirection);
                FluidState fluidstate = level.getFluidState(newBlockPos);
                if (Fluids.WATER.isSame(fluidstate.getType()))
                    level.setBlock(newBlockPos, this.createLegacyBlock(fluidstate), 11);
            }
        }
        super.tick(level, blockPos, p_75997_);
    }

    public boolean isSame(@Nonnull Fluid fluid) {
        return fluid == TurnedFluid.DARK_LATEX.get() || fluid == TurnedFluid.FLOWING_DARK_LATEX.get();
    }

    protected void beforeDestroyingBlock(@Nonnull LevelAccessor levelAccessor, @Nonnull BlockPos blockPos, @Nonnull BlockState blockState) {
    }

    protected int getSlopeFindDistance(@Nonnull LevelReader levelReader) {
        return 4;
    }

    protected int getDropOff(@Nonnull LevelReader levelReader) {
        return 1;
    }

    @Nonnull
    protected net.minecraftforge.fluids.FluidAttributes createAttributes() {
        return FluidAttributes.builder(
                        new ResourceLocation(Reference.MOD_ID, "blocks/dark_latex_fluid"),
                        new ResourceLocation(Reference.MOD_ID, "blocks/flowing_dark_latex_fluid"))
//                .density(3000).viscosity(6000)
                .build(TurnedFluid.DARK_LATEX.get());
    }

    public static class Flowing extends DarkLatexFluid {
        protected void createFluidStateDefinition(@Nonnull StateDefinition.Builder<Fluid, FluidState> stateBuilder) {
            super.createFluidStateDefinition(stateBuilder);
            stateBuilder.add(LEVEL);
        }

        public int getAmount(@Nonnull FluidState fluidState) {
            return fluidState.getValue(LEVEL);
        }

        public boolean isSource(@Nonnull FluidState fluidState) {
            return false;
        }
    }

    public static class Source extends DarkLatexFluid {
        public int getAmount(@Nonnull FluidState fluidState) {
            return 8;
        }

        public boolean isSource(@Nonnull FluidState fluidState) {
            return true;
        }
    }
}
