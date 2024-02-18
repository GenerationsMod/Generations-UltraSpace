package generations.gg.generations.ultraspace.generationsultraspace.forge.events;

import generations.gg.generations.ultraspace.generationsultraspace.UltraSpaceDimension;
import net.minecraftforge.event.server.ServerAboutToStartEvent;

public class LifeCycleEvents {

    public static void aboutToStartEvent(final ServerAboutToStartEvent event) {
        UltraSpaceDimension.registerDimension(event.getServer());
    }
}
