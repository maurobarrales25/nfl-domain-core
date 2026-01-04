package com.mauro.nfl.domain.geography;

import java.util.Objects;

public record Country( String code, String name) {

    public Country {
        Objects.requireNonNull(code, "Country code cannot be null");
        Objects.requireNonNull(name, "Country name cannot be null");

        if (code.length() != 2) {
            throw new IllegalArgumentException("Country code must be ISO-2");
        }
    }
}
