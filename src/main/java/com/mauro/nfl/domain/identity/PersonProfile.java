package com.mauro.nfl.domain.identity;

import com.mauro.nfl.domain.college.institution.University;
import com.mauro.nfl.domain.geography.City;
import com.mauro.nfl.domain.geography.Country;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public record PersonProfile(
        LocalDate dateOfBirth,
        City birthCity,
        Country nationality,
        University university
) {
    public PersonProfile{
        Objects.requireNonNull(dateOfBirth, "Date of birth cannot be null");
        Objects.requireNonNull(birthCity, "birth City cannot be null");
        Objects.requireNonNull(nationality, "nationality cannot be null");

        if(dateOfBirth.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Date of birth cannot be in the future");
        }

        int age = Period.between(dateOfBirth, LocalDate.now()).getYears();

        if (age < 17) {
            throw new IllegalArgumentException("Person must be at least 17 years old");
        }

        if (age > 90) {
            throw new IllegalArgumentException("Person age cannot exceed 90 years");
        }
    }
}
