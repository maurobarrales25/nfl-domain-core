package com.mauro.nfl.domain.league.structure;

import java.util.EnumMap;
import java.util.Set;

public final class NFLStructureRules {

    private static final int TEAMS_PER_DIVISION = 4;

    private static final EnumMap<NFLConference, Set<NFLDivision>> CONFERENCE_DIVISIONS;

    static {
        CONFERENCE_DIVISIONS = new EnumMap<>(NFLConference.class);

        Set<NFLDivision> allDivisions = Set.of(
                NFLDivision.EAST,
                NFLDivision.NORTH,
                NFLDivision.SOUTH,
                NFLDivision.WEST
        );

        CONFERENCE_DIVISIONS.put(NFLConference.AFC, allDivisions);
        CONFERENCE_DIVISIONS.put(NFLConference.NFC, allDivisions);
    }

    private NFLStructureRules() {}

    public static Set<NFLDivision> divisionsForConference(NFLConference conference) {
        if (conference == null) {
            throw new IllegalArgumentException("Conference cannot be null");
        }

        return CONFERENCE_DIVISIONS.get(conference);
    }

    public static int getTeamsPerDivision() {
        return TEAMS_PER_DIVISION;
    }
}