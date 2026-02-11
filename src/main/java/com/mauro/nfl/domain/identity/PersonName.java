package com.mauro.nfl.domain.identity;

import java.util.Objects;

public record PersonName (String name, String surName){

    public PersonName{
        Objects.requireNonNull(name, "Person name cannot be null");
        Objects.requireNonNull(surName, "Person Surname cannot be null");
    }

    public String shortName(){
        return this.name.charAt(0) + ". " + this.surName();
    }

    public String fullName(){
        return this.name + " " + this.surName();
    }


}
