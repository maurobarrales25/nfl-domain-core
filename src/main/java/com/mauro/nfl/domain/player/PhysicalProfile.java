package com.mauro.nfl.domain.player;

public record PhysicalProfile(
        int heightFeet,
        int heightInches,
        int weightLbs
) {
    public PhysicalProfile {
        if (heightFeet < 4 || heightFeet > 8) {
            throw new IllegalArgumentException("Invalid heightFeet");
        }
        if (heightInches < 0 || heightInches > 12) {
            throw new IllegalArgumentException("Invalid heightInches");
        }
        if (weightLbs < 100 || weightLbs > 450) {
            throw new IllegalArgumentException("Invalid weightLbs");
        }
    }

    public PhysicalProfile withWeight(int newWeight) {
        return new PhysicalProfile(this.heightFeet, this.heightInches, newWeight);
    }

    @Override
    public String toString() {
        return heightFeet + "'" + heightInches + "\" / " + weightLbs + " lbs";
    }
}
