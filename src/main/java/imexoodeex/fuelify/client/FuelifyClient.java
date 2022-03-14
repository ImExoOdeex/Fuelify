package imexoodeex.fuelify.client;

import imexoodeex.fuelify.blocks.FuelifyBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import static imexoodeex.fuelify.blocks.FuelifyBlocks.MAGIC_FLOWER;

@Environment(EnvType.CLIENT)
public class FuelifyClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        //magic flower cutout
        BlockRenderLayerMap.INSTANCE.putBlock(MAGIC_FLOWER, RenderLayer.getCutout());
    }
}
