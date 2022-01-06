package com.github.turned.Turned.entity.latex;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class DarkLatexFox extends AgeableLatex {
    public DarkLatexFox(EntityType<? extends Latex> type, Level levelIn) {
        super(type, levelIn);
    }

    public int getTransfurType() {
        return 1;
    }
}
