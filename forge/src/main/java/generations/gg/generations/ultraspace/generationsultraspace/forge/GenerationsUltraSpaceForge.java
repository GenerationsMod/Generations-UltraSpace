package generations.gg.generations.ultraspace.generationsultraspace.forge;

import generations.gg.generations.ultraspace.generationsultraspace.GenerationsUltraSpace;
import generations.gg.generations.ultraspace.generationsultraspace.forge.events.LifeCycleEvents;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(GenerationsUltraSpace.MOD_ID)
public class GenerationsUltraSpaceForge {
    public GenerationsUltraSpaceForge() {
        GenerationsUltraSpace.init();
        MinecraftForge.EVENT_BUS.addListener(LifeCycleEvents::aboutToStartEvent);
    }
}
