package imexoodeex.fuelify.items;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static imexoodeex.fuelify.Fuelify.MOD_ID;

public class Items extends Item {

    public Items(Settings settings) {
        super(settings);
    }

    public static Item.Settings createGroup() {
        return new Item.Settings().group(ModItemGroup.FUELIFY);
    }

    public static Item registerItems(String itemName, Item item) {
        Registry.register(Registry.ITEM, createIdentifier(itemName), item);
        return item;
    }

    public static Identifier createIdentifier(String name) {
        return new Identifier(MOD_ID, name);
    }


}
