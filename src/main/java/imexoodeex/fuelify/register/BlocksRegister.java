package imexoodeex.fuelify.register;

import static imexoodeex.fuelify.Fuelify.*;
import imexoodeex.fuelify.items.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.sql.Time;
import java.util.List;

public class BlocksRegister {

    //with tooltip
    private static Item registerBlockItem(String name, Block block, ItemGroup group, String tooltipKey, String tooltipKeyShift, String tooltipKeyCtrl) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)) {
                    @Override
                    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                        if (Screen.hasShiftDown()) {
                            tooltip.add(new TranslatableText(tooltipKey));
                        } else if (Screen.hasControlDown()) {
                            tooltip.add(new TranslatableText(tooltipKeyCtrl));
                        } else {
                            tooltip.add(new TranslatableText(tooltipKeyShift));
                        }
                    }
                });
    }
    public static Block registerBlock(String name, Block block, ItemGroup group, String tooltipKey, String tooltipKeyShift, String tooltipKeyCtrl) {
        registerBlockItem(name, block, group, tooltipKey, tooltipKeyShift, tooltipKeyCtrl);
        return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
    }

    //non tooltip
    public static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
}
