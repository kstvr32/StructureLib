package com.gtnewhorizon.structurelib.util;

import java.nio.ByteOrder;
import java.util.Set;

import net.minecraft.nbt.NBTTagCompound;

/**
 * not related to a certain mod!
 */
public class MiscUtils {

    private MiscUtils() {}

    @SuppressWarnings("unchecked")
    public static Set<String> getTagKeys(NBTTagCompound tag) {
        return tag.func_150296_c();
    }

    public static int rgbaToInt(int red, int green, int blue, int alpha){
        return alpha << 24 | red << 16 | green << 8 | blue;
    }
}
