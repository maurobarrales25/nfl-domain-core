package com.mauro.nfl.domain.geography;

import java.util.Objects;

public record City(String name, State state) {

    public City {
        Objects.requireNonNull(name, "City name cannot be null");
        Objects.requireNonNull(state, "State cannot be null");
    }
}

