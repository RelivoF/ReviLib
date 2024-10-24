package me.revilo.revilib;

import dev.architectury.platform.Platform;
import me.revilo.revilib.utils.CommandUtils;
import me.revilo.revilib.utils.KeyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.List;

public final class Revilib {
    public static final String MOD_ID = "revilib";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        CommandUtils.init();
        KeyUtils.init();

        if (Platform.isModLoaded(MOD_ID)) {
            LOGGER.info("Thank you for using all of my mods. :) -Revilo");
        }


    }
}
