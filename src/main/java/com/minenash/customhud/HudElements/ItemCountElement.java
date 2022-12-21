package com.minenash.customhud.HudElements;

import net.minecraft.client.MinecraftClient;
import net.minecraft.item.Item;

public class ItemCountElement implements HudElement {

    private final Item item;

    public ItemCountElement(Item item) {
        this.item = item;
    }

    @Override
    public String getString() {
        return getNumber().toString();
    }

    @Override
    public Number getNumber() {
        MinecraftClient client = MinecraftClient.getInstance();
        return client.player.getInventory().count(item);
    }

    @Override
    public boolean getBoolean() {
        return getNumber().intValue() > 0;
    }
}
