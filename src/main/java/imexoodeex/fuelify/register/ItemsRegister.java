package imexoodeex.fuelify.register;

import imexoodeex.fuelify.items.ItemsNames;
import net.minecraft.item.Item;

import static imexoodeex.fuelify.items.Items.createGroup;
import static imexoodeex.fuelify.items.Items.registerItems;

public class ItemsRegister {

    public static Item sawdust = new Item(createGroup());
    public static Item sticks_pile = new Item(createGroup());
    public static Item magic_powder = new Item(createGroup());
    public static Item flaming_coal = new Item(createGroup());
    public static Item wood_pellets = new Item(createGroup());

    public static void init() {
        registerItems(ItemsNames.SAWDUST, sawdust);
        registerItems(ItemsNames.MAGIC_POWDER, magic_powder);
        registerItems(ItemsNames.FLAMING_COAL, flaming_coal);
        registerItems(ItemsNames.STICKS_PILE, sticks_pile);
        registerItems(ItemsNames.WOOD_PELLETS, wood_pellets);
    }
}
