package com.mauro.nfl.domain.college.conference;

import com.mauro.nfl.domain.college.leagueLevel.LeagueLevel;

import java.util.Objects;

public record CollegeConference(
        String name,
        ConferenceTier tier,
        LeagueLevel leagueLevel
) {

    public CollegeConference {
        Objects.requireNonNull(name, "Conference name cannot be null");
        Objects.requireNonNull(tier, "Conference tier cannot be null");
        Objects.requireNonNull(leagueLevel, "League level cannot be null");

        if (name.isBlank()) {
            throw new IllegalArgumentException("Conference name cannot be blank");
        }

        if (leagueLevel == LeagueLevel.FCS && tier != ConferenceTier.FCS) {
            throw new IllegalArgumentException(
                    "FCS league level must have FCS tier"
            );
        }

        if (leagueLevel == LeagueLevel.FBS && tier == ConferenceTier.FCS) {
            throw new IllegalArgumentException(
                    "FBS league level cannot have FCS tier"
            );
        }
    }
}
