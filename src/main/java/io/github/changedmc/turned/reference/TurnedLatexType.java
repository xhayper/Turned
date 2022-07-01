package io.github.changedmc.turned.reference;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;

import java.util.HashMap;

public class TurnedLatexType {

    // A got transfur by B and became C
    // specialTransfurType.get(A).get(B) = C
    public static final HashMap<EntityType<? extends Mob>, HashMap<EntityType<? extends Mob>, EntityType<? extends Mob>>> redirectTransfurTypeHashMap;

    static {
        redirectTransfurTypeHashMap = new HashMap<>();
//        redirectTransfurTypeHashMap.put(TurnedEntityType.SCIENTIST.get(), new HashMap<>());
//        redirectTransfurTypeHashMap.get(TurnedEntityType.SCIENTIST.get()).put(TurnedEntityType.DARK_LATEX_FOX.get(), TurnedEntityType.DARK_LATEX.get()); //TODO: Add Dark Latex Scientist
    }

}
