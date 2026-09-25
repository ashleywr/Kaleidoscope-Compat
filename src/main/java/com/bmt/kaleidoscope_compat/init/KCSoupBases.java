package com.bmt.kaleidoscope_compat.init;

import net.minecraft.resources.ResourceLocation;

@SuppressWarnings("all")
public class KCSoupBases {
    public static final ResourceLocation MILK_BUCKET = ResourceLocation.fromNamespaceAndPath("minecraft", "milk");

    public static void registerAll() {
        // Kaleidoscope Cookery 1.5.0 registers its own minecraft:milk base.
        // Registering the legacy compat implementation duplicates that ID.
    }
}
