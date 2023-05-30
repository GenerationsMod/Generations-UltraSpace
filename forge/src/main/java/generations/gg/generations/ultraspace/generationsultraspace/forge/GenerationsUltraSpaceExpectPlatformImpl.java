package generations.gg.generations.ultraspace.generationsultraspace.forge;

import generations.gg.generations.ultraspace.generationsultraspace.GenerationsUltraSpaceExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class GenerationsUltraSpaceExpectPlatformImpl {
    /**
     * This is our actual method to {@link GenerationsUltraSpaceExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
