package com.mauro.nfl.domain.college.institution;

import com.mauro.nfl.domain.college.conference.Conference;
import com.mauro.nfl.domain.geography.City;
import com.mauro.nfl.domain.geography.State;

import java.util.Objects;

public record University(String name, Conference conference, State state, City city) {

    public University {
        Objects.requireNonNull(name, "name");
        Objects.requireNonNull(conference, "conference");
        Objects.requireNonNull(state, "state");
        Objects.requireNonNull(city, "city");

        if (name.isBlank()) {
            throw new IllegalArgumentException("University name cannot be blank");
        }
    }
}
