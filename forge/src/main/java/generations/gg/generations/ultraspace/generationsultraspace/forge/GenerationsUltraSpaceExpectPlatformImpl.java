package generations.gg.generations.ultraspace.generationsultraspace.forge;

import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class GenerationsUltraSpaceExpectPlatformImpl {
    /**
     * This is our actual method to {@link ExampleExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
