package imexoodeex.fuelify.items;

import imexoodeex.fuelify.Fuelify;
import imexoodeex.fuelify.register.ItemsRegister;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup FUELIFY = FabricItemGroupBuilder.build(
            new Identifier(Fuelify.MOD_ID, "fuelify"),
            () -> new ItemStack(ItemsRegister.magic_powder));
}
