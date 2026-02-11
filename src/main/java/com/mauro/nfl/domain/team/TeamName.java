package com.mauro.nfl.domain.team;

import java.util.Objects;

public record TeamName(String location, String name, String shortName) {

    public TeamName {
        Objects.requireNonNull(location, "location cannot be null");
        Objects.requireNonNull(name, "name cannot be null");

        if (location.isBlank()) throw new IllegalArgumentException("location cannot be blank");
        if (name.isBlank()) throw new IllegalArgumentException("name cannot be blank");
    }

    @Override
    public String toString() {
        return location + " " + name;
    }
}
