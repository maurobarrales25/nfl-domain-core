package com.mauro.nfl.domain.player;

import java.util.Objects;
import java.util.UUID;


public final class PlayerId {

    private final UUID value;

    private PlayerId(UUID value) {
        this.value = Objects.requireNonNull(value, "PlayerId value cannot be null");
    }

    public static PlayerId newId(){
        return new PlayerId(UUID.randomUUID());
    }

    public UUID getValue(){
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlayerId)) return false;
        PlayerId playerId = (PlayerId) o;
        return value.equals(playerId.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public static PlayerId from(UUID value) {
        return new PlayerId(value);
    }

}
