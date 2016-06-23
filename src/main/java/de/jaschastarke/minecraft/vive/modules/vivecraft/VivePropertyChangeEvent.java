package de.jaschastarke.minecraft.vive.modules.vivecraft;

import de.jaschastarke.minecraft.vive.modules.PlayerProperties;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

public class VivePropertyChangeEvent extends PlayerEvent {
    private static final HandlerList handlers = new HandlerList();
    private final PlayerProperties properties;

    public VivePropertyChangeEvent(Player who, PlayerProperties properties) {
        super(who);
        this.properties = properties;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public PlayerProperties getPlayerProperties() {
        return properties;
    }
}
