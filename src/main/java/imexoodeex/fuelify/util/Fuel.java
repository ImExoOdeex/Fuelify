package imexoodeex.fuelify.util;

import imexoodeex.fuelify.items.Items;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.tag.ItemTags;

public class Fuel {
    public static void RegisterMod() {
        registerFuels();
    }


    private  static  void registerFuels() {
        FuelRegistry registry = FuelRegistry.INSTANCE;
        registry.add(Items.MAGIC_POWDER, 250 * 20);
        registry.add(Items.FLAMING_COAL, 160 * 20);
        registry.add(Items.STICKS_PILE, 50 * 20);
        registry.add(net.minecraft.item.Items.WHEAT, 15 * 20);
        registry.add(ItemTags.LEAVES, 10 * 20);
        registry.add(ItemTags.FLOWERS, 10 * 20);
        registry.add(ItemTags.SMALL_FLOWERS, 10 * 20);
        registry.add(ItemTags.TALL_FLOWERS, 10 * 20);
    }
}
