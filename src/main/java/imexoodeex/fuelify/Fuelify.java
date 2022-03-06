package imexoodeex.fuelify;

import imexoodeex.fuelify.register.ItemsRegister;
import imexoodeex.fuelify.util.Fuel;
import imexoodeex.fuelify.util.LootTable;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Fuelify implements ModInitializer {
    public static final String MOD_ID = "fuelify";
    public static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void onInitialize() {
        Fuel.registerFuels();
        LootTable.modifyLootTables();
        ItemsRegister.init();
    }
}
