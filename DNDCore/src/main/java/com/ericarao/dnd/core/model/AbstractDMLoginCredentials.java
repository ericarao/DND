package com.ericarao.dnd.core.model;

import org.immutables.value.Value;

@DndStyle
@Value.Immutable
public abstract class AbstractDMLoginCredentials implements NetworkPacket{
    public abstract String roomName();
    public abstract int numPlayers();
    public abstract String roomPassword();
    public abstract String dmIP();

    @Override
    @Value.Derived
    public PacketType getType() {
        return PacketType.DMLoginCred;
    }
}
