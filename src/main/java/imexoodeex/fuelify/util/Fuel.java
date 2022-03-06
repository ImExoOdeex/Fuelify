package imexoodeex.fuelify.util;

import imexoodeex.fuelify.register.ItemsRegister;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.tag.ItemTags;

public class Fuel {
    public static void registerFuels() {
        FuelRegistry registry = FuelRegistry.INSTANCE;
        // mod items
        registry.add(ItemsRegister.magic_powder, 250 * 20);
        registry.add(ItemsRegister.flaming_coal, 160 * 20);
        registry.add(ItemsRegister.sticks_pile, 50 * 20);
        registry.add(ItemsRegister.sawdust, 5 * 20);

        //vanilla items
        registry.add(net.minecraft.item.Items.WHEAT, 20 * 20);
        registry.add(ItemTags.LEAVES, 5 * 20);
        registry.add(ItemTags.FLOWERS, 10 * 20);
        registry.add(ItemTags.SMALL_FLOWERS, 10 * 20);
        registry.add(ItemTags.TALL_FLOWERS, 10 * 20);
        registry.add(ItemTags.BEDS, 20 * 20);
        registry.add(ItemTags.ARROWS, 10 * 20);
        registry.add(net.minecraft.item.Items.GRASS, 10 * 20);
        registry.add(net.minecraft.item.Items.TALL_GRASS, 10 * 20);
        registry.add(net.minecraft.item.Items.SEAGRASS, 10 * 20);
        registry.add(net.minecraft.item.Items.STRING, 10 * 20);
        registry.add(net.minecraft.item.Items.WHEAT_SEEDS, 10 * 20);

    }
}
