package com.mauro.nfl.domain.team;

import com.mauro.nfl.domain.league.structure.NFLConference;
import com.mauro.nfl.domain.league.structure.NFLDivision;

import java.util.Objects;

public class Team {

    private final TeamId teamId;
    private final TeamName teamName;
    private final NFLConference nflConference;
    private final NFLDivision nflDivision;

    public Team(TeamId teamId, TeamName teamName, NFLConference nflConference, NFLDivision nflDivision) {
        this.teamId = Objects.requireNonNull(teamId, "TeamId cannot be null");
        this.teamName = Objects.requireNonNull(teamName, "Team Name cannot be null");
        this.nflConference = Objects.requireNonNull(nflConference, "Team Conference cannot be null");
        this.nflDivision = Objects.requireNonNull(nflDivision, "Team Conference cannot be null");
    }
}
