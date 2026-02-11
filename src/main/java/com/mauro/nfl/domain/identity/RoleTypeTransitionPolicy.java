package com.mauro.nfl.domain.identity;

import java.util.Set;

public final class RoleTypeTransitionPolicy {

    public static boolean canAddRole(Set<RoleType> currentRoles, RoleType newRole) {

        // TODO: Implement role transition rules

        if (currentRoles.contains(RoleType.OWNER)) {
            return false;
        }

        if (currentRoles.contains(RoleType.PROSPECT)) {
            return newRole == RoleType.PLAYER;
        }

        return true;
    }
}


