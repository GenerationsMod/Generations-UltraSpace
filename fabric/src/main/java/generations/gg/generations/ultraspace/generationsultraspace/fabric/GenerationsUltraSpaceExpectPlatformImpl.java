package generations.gg.generations.ultraspace.generationsultraspace.fabric;

import generations.gg.generations.ultraspace.generationsultraspace.GenerationsUltraSpaceExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class GenerationsUltraSpaceExpectPlatformImpl {
    /**
     * This is our actual method to {@link GenerationsUltraSpaceExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
