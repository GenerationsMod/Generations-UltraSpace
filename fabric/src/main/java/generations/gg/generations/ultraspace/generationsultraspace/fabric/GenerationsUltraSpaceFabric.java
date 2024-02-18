package generations.gg.generations.ultraspace.generationsultraspace.fabric;

import generations.gg.generations.ultraspace.generationsultraspace.GenerationsUltraSpace;
import generations.gg.generations.ultraspace.generationsultraspace.UltraSpaceDimension;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;

public class GenerationsUltraSpaceFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        GenerationsUltraSpace.init();
        ServerLifecycleEvents.SERVER_STARTING.register(UltraSpaceDimension::registerDimension);
    }
}
