package generations.gg.generations.ultraspace.generationsultraspace.forge;

import generations.gg.generations.ultraspace.generationsultraspace.GenerationsUltraSpace;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(GenerationsUltraSpace.MOD_ID)
public class GenerationsUltraSpaceForge {
    public GenerationsUltraSpaceForge() {
        GenerationsUltraSpace.init();
    }
}
