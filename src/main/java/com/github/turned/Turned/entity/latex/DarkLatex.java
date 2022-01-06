package com.github.turned.Turned.entity.latex;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class DarkLatex extends AgeableLatex {
    public DarkLatex(EntityType<? extends Latex> type, Level levelIn) {
        super(type, levelIn);
    }

    public int getTransfurType() {
        return 3;
    }
}
