package com.mauro.nfl.domain.player;

import java.util.Objects;
import java.util.UUID;


public record PlayerId(UUID value) {

    public PlayerId {
         Objects.requireNonNull(value, "PlayerId value cannot be null");
    }

    public static PlayerId newId(){
        return new PlayerId(UUID.randomUUID());
    }

    public static PlayerId from(UUID value) {
        return new PlayerId(value);
    }
}
