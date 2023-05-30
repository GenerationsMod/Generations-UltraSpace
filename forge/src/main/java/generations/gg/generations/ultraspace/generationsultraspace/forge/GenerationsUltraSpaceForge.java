package generations.gg.generations.ultraspace.generationsultraspace.forge;

import dev.architectury.platform.forge.EventBuses;
import generations.gg.generations.ultraspace.generationsultraspace.GenerationsUltraSpace;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(GenerationsUltraSpace.MOD_ID)
public class GenerationsUltraSpaceForge {
    public GenerationsUltraSpaceForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(GenerationsUltraSpace.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        GenerationsUltraSpace.init();
    }
}
