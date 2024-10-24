package me.revilo.revilib.utils;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;

public class KeyUtils {

    public static KeyMapping registerKeyMapping(String name, InputConstants.Type type, int defaultKey, String category) {
        return new KeyMapping(name, type, defaultKey, category);
    }

    public static void init() {}

}
