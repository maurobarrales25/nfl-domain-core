package com.mauro.nfl.domain.player;

import com.mauro.nfl.domain.identity.Person;
import com.mauro.nfl.domain.position.Position;
import com.mauro.nfl.domain.position.PositionRoleRules;
import com.mauro.nfl.domain.position.Role;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Player {

    private final Person person;
    private final Position position;
    private Set<Role> roles;
    private PhysicalProfile physicalProfile;

    public Player(Person person, Position position, Set<Role> roles, PhysicalProfile physicalProfile) {
        this.person = Objects.requireNonNull(person, "PlayerId cannot be null");
        this.position = Objects.requireNonNull(position, "Position cannot be null");
        this.physicalProfile = Objects.requireNonNull(physicalProfile, "PhysicalProfile cannot be null");

        Objects.requireNonNull(roles, "Roles cannot be null");
        for (Role role : roles) {
            if (!PositionRoleRules.isAllowed(position, role)) {
                throw new IllegalArgumentException(
                        "Role " + role + " not allowed for position " + position
                );
            }
        }
        this.roles = new HashSet<>(roles);
    }

    public Person getPerson() {return person;}

    public Position getPosition() {return position;}

    public PhysicalProfile getPhysicalProfile() {return physicalProfile;}

    public Set<Role> getRoles() {return Set.copyOf(roles);}


    public void addRoles(Role... newRoles) {
        Objects.requireNonNull(newRoles, "New roles cannot be null");

        for (Role role : newRoles) {
            if (!PositionRoleRules.isAllowed(this.position, role)) {
                throw new IllegalArgumentException(
                        "Role " + role + " is not valid for position " + this.position
                );
            }
            this.roles.add(role);
        }
    }

    public void setWeight(int weight) {
        this.physicalProfile.updateWeight(weight);
    }

}