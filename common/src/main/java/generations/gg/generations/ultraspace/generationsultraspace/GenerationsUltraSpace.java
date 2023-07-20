package generations.gg.generations.ultraspace.generationsultraspace;

import generations.gg.generations.core.generationscore.config.ConfigLoader;
import generations.gg.generations.ultraspace.generationsultraspace.config.Config;

public class GenerationsUltraSpace {

    /** The mod ID for the Generations-UltraSpace mod. */
    public static final String MOD_ID = "generations_ultraspace";

    /** The config for the Generations-UltraSpace mod. */
    public static Config CONFIG;


    public static void init() {
        CONFIG = ConfigLoader.loaderConfig(Config.class, "ultraspace", "config");
        UltraSpaceDimension.registerDimension();
    }
}
