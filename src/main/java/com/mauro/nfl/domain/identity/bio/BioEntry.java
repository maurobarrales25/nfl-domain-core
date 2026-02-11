package com.mauro.nfl.domain.identity.bio;

import java.util.Objects;

public record BioEntry(BioType type, String description, int year) {

    public BioEntry{
        Objects.requireNonNull(type, "Bio Type cannot be null");
        Objects.requireNonNull(year, "Bio year cannot be null");
    }
}
