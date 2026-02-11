package com.mauro.nfl.domain.identity.bio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Biography {

    private List<BioEntry> bioEntries;

    public Biography(List<BioEntry> bioEntries) {
        this.bioEntries = List.copyOf(bioEntries);
    }

    public List<BioEntry> getBioEntries() {
        return bioEntries;
    }

    public BioEntry getBioEntry(BioType type) {
        return bioEntries.stream()
                .filter(entry -> entry.type() == type)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No bio entry found for type: " + type));
    }

    public Biography addBioEntry(BioEntry bioEntry) {
        List<BioEntry> updated = new ArrayList<>(this.bioEntries);
        updated.add(Objects.requireNonNull(bioEntry));
        return new Biography(updated);
    }
}
