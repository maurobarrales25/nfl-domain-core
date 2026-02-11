package com.mauro.nfl.domain.identity;

import java.util.Objects;
import java.util.UUID;

public record PersonId(UUID value) {

    public PersonId {
        Objects.requireNonNull(value, "PersonId value cannot be null");
    }

    public static PersonId newPersonId() {return new PersonId(UUID.randomUUID());}

    public static PersonId from(UUID value) {return new PersonId(value);}
}
