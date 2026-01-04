package com.mauro.nfl.domain.position;

import java.util.Map;
import java.util.Set;

import static java.util.Map.entry;

public final class PositionRoleRules {

    private final static Map<Position, Set<Role>> ALLOWED = Map.ofEntries(
            entry(Position.QB, Set.of(Role.POCKET_PASSER, Role.MOBILE, Role.GUNSLINGER)),
            entry(Position.RB, Set.of(Role.ELUSIVE_BACK, Role.SHORT_YARDAGE,Role.THIRD_DOWN, Role.ONE_CUT, Role.POWER_BACK, Role.RECEIVING_BACK)),
            entry(Position.TE, Set.of(Role.BLOCKER, Role.RECEIVER)),
            entry(Position.FB, Set.of(Role.BLOCKER, Role.SHORT_YARDAGE, Role.RECEIVER)),
            entry(Position.OT, Set.of(Role.PASS_BLOCK, Role.RUN_BLOCK)),
            entry(Position.OG, Set.of(Role.PASS_BLOCK, Role.RUN_BLOCK)),
            entry(Position.C, Set.of(Role.PASS_BLOCK, Role.RUN_BLOCK)),
            entry(Position.WR, Set.of(Role.X_RECEIVER, Role.Y_RECEIVER, Role.Z_RECEIVER, Role.SLOT)),

            entry(Position.K, Set.of(Role.PLACEKICKER, Role.KICKOFF)),
            entry(Position.P, Set.of(Role.PUNTER, Role.KICKOFF)),
            entry(Position.ST, Set.of(Role.KICK_RETURNER, Role.PUNT_RETURNER)),
            entry(Position.KR, Set.of(Role.KICK_RETURNER, Role.PUNT_RETURNER)),
            entry(Position.LS, Set.of(Role.LONG_SNAPPER)),

            entry(Position.DE, Set.of(Role.BLITZER,Role.RUSHER, Role.RUN_STOPPER, Role.TACKLER)),
            entry(Position.DT, Set.of(Role.RUN_STOPPER, Role.RUSHER, Role.TACKLER)),
            entry(Position.NT, Set.of(Role.RUN_STOPPER, Role.RUSHER, Role.TACKLER)),
            entry(Position.EDGE, Set.of(Role.BLITZER,Role.RUSHER, Role.RUN_STOPPER, Role.TACKLER)),
            entry(Position.MLB, Set.of(Role.BLITZER,Role.RUSHER, Role.RUN_STOPPER, Role.TACKLER, Role.GENERAL, Role.COVERAGE)),
            entry(Position.OLB, Set.of(Role.BLITZER,Role.RUSHER, Role.RUN_STOPPER, Role.TACKLER, Role.COVERAGE)),
            entry(Position.CB, Set.of(Role.OUTSIDE, Role.SLOT_CB)),
            entry(Position.SS, Set.of(Role.TACKLER, Role.COVERAGE, Role.BLITZER, Role.RUN_STOPPER, Role.GENERAL)),
            entry(Position.FS, Set.of(Role.TACKLER, Role.COVERAGE, Role.BLITZER, Role.RUN_STOPPER, Role.GENERAL))
    );

    private PositionRoleRules() {}

    public static boolean isAllowed(Position position, Role role) {
        return ALLOWED.getOrDefault(position, Set.of()).contains(role);
    }
}
