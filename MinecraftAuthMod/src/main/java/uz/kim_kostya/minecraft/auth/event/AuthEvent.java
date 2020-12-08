package uz.kim_kostya.minecraft.auth.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class AuthEvent extends Event {
    private final EntityPlayer player;
    private final String authToken;

    public AuthEvent(EntityPlayer player, String authToken) {
        this.player = player;
        this.authToken = authToken;
    }

    public String getAuthToken() {
        return authToken;
    }

    public EntityPlayer getPlayer() {
        return player;
    }
}
