package generations.gg.generations.ultraspace.generationsultraspace;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class UltraSpaceDimension
{
    public static ResourceKey<Level> ULTRASPACE_WORLD = ResourceKey.create(Registries.DIMENSION, new ResourceLocation(GenerationsUltraSpace.MOD_ID, "ultraspace"));
    public static final ResourceKey<DimensionType> ULTRASPACE_DIMENSION_TYPE_KEY = ResourceKey.create(Registries.DIMENSION_TYPE, new ResourceLocation(GenerationsUltraSpace.MOD_ID, "ultraspace"));

    public static DimensionType ULTRASPACE_DIMENSION_TYPE;

    public static ServerLevel ULTRASPACE_DIMENSION;

    public static boolean isUltraSpaceDimension(Level world) {
        return world != null && world.dimension().equals(ULTRASPACE_WORLD);
    }

    public static void registerDimension(MinecraftServer server) {
        UltraSpaceDimension.ULTRASPACE_DIMENSION_TYPE = server.registryAccess().registryOrThrow(Registries.DIMENSION_TYPE).get(ULTRASPACE_DIMENSION_TYPE_KEY);
        UltraSpaceDimension.ULTRASPACE_DIMENSION = server.getLevel(ULTRASPACE_WORLD);
    }
}