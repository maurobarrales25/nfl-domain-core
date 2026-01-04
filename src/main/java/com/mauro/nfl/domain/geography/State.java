package com.mauro.nfl.domain.geography;

import java.util.Objects;

public record State(String code, String name, Country country) {

    public State {
        Objects.requireNonNull(code, "State code cannot be null");
        Objects.requireNonNull(name, "State name cannot be null");
        Objects.requireNonNull(country, "Country cannot be null");

        if (code.length() != 2) {
            throw new IllegalArgumentException("State code must be 2 characters (e.g. TX, CA)");
        }
    }
}

