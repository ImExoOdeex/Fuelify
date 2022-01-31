package imexoodeex.fuelify.items;

import imexoodeex.fuelify.Fuelify;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Items {
    public static final Item MAGIC_POWDER = registerItem("magic_powder",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item FLAMING_COAL = registerItem("flaming_coal",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item STICKS_PILE = registerItem("sticks_pile",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Fuelify.MOD_ID, name), item);
    }
}
