package imexoodeex.fuelify;

import imexoodeex.fuelify.items.Items;
import imexoodeex.fuelify.util.Fuel;
import net.fabricmc.api.ModInitializer;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Fuelify implements ModInitializer {
    public static final String MOD_ID = "fuelify";
//    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);



    @Override
    public void onInitialize() {
        Fuel.RegisterMod();
    }
}
