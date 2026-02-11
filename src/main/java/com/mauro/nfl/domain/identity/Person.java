package com.mauro.nfl.domain.identity;

import com.mauro.nfl.domain.identity.bio.BioEntry;
import com.mauro.nfl.domain.identity.bio.Biography;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Person {

    private PersonId personId;
    private PersonName personName;
    private PersonProfile personProfile;
    private Set<RoleType> roles = new HashSet<>();;
    private Biography biography;

    public Person(PersonId personId, PersonName personName, PersonProfile personProfile,
                  Set<RoleType> initialRoles, Biography biography) {

        this.personId = Objects.requireNonNull(personId,  "Person Id cannot be null");
        this.personName = Objects.requireNonNull(personName,  "Person Name cannot be null");
        this.personProfile = Objects.requireNonNull(personProfile,  "Person Profile cannot be null");
        this.biography = Objects.requireNonNull(biography,  "Biography cannot be null");
        this.roles.addAll(Objects.requireNonNull(initialRoles));
    }

    public PersonId id() { return personId; }

    public PersonName name() { return personName; }

    public PersonProfile profile() { return personProfile; }

    public Biography biography() { return biography; }

    public Set<RoleType> roles() { return roles; }

    public void updateProfile(PersonProfile newProfile) {
        this.personProfile = Objects.requireNonNull(newProfile);
    }

    public void addRole(RoleType newRole) {
        if (!RoleTypeTransitionPolicy.canAddRole(this.roles, newRole)) {
            throw new IllegalStateException("Invalid role transition: " + newRole);
        }
        this.roles.add(newRole);
    }

    public void addBioEntry(BioEntry entry) {
        this.biography = this.biography.addBioEntry(entry);
    }

}
