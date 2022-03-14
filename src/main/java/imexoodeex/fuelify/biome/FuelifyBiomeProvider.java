//package imexoodeex.fuelify.biome;
//
//import com.mojang.datafixers.util.Pair;
//import net.minecraft.util.registry.Registry;
//import net.minecraft.util.registry.RegistryKey;
//import net.minecraft.world.biome.Biome;
//import net.minecraft.world.biome.source.util.MultiNoiseUtil;
//import net.minecraft.world.biome.source.util.VanillaBiomeParameters;
//import net.minecraft.world.biome.source.util.VanillaTerrainParameters;
//import net.minecraft.world.biome.source.util.VanillaTerrainParametersCreator;
//
//import terrablender.worldgen.DefaultOverworldRegion;
//
//import java.util.function.Consumer;
//
//public class FuelifyBiomeProvider extends DefaultOverworldRegion {
//    public static final ResourceLocation LOCATION = new ResourceLocation("minecraft:overworld");
//
//    public FuelifyBiomeProvider(int overworldWeight)
//    {
//        super(overworldWeight);
//    }
//
//    @Override
//    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> mapper)
//    {
//        this.addBiome(mapper, Climate.Parameter.point(0.35F), Climate.Parameter.point(0.5F), Climate.Parameter.point(1.5F), Climate.Parameter.point(0.6F),
//                Climate.Parameter.point(0.25F), Climate.Parameter.point(0.125F), 0F, BiomeInitializer.MAGICAL_FOREST);
//        this.addBiomeSimilar(mapper, Biomes.FLOWER_FOREST, BiomeInitializer.MAGICAL_FOREST);
//    }
//}