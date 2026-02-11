package com.mauro.nfl.domain.team;

import java.util.Objects;
import java.util.UUID;

public record TeamId (UUID value) {

    public TeamId {
        Objects.requireNonNull(value, "Team value cannot be null");
    }

    public static TeamId newId(){return new TeamId(UUID.randomUUID());}

    public static TeamId from(UUID value){return new TeamId(value);}

}
