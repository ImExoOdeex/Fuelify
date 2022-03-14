package imexoodeex.fuelify.blocks;

import imexoodeex.fuelify.items.ModItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.entity.effect.StatusEffects;
import static imexoodeex.fuelify.register.BlocksRegister.*;

public class FuelifyBlocks {
    public static final Block MAGIC_FLOWER = registerBlock("magic_flower",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 12,
                    FabricBlockSettings.copy(Blocks.DANDELION).strength(4.0f).nonOpaque().luminance((state) -> state.get(MagicFlowerSettings.CLICKED) ? 15: 0)), ModItemGroup.FUELIFY,
            "flower", "tooltipKeyShift", "tooltipKeyCtrl");
    }
