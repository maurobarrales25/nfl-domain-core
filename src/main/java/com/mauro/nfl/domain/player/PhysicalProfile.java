package com.mauro.nfl.domain.player;

import java.util.Objects;

public final class PhysicalProfile {

    private final int heightFeet;
    private final int heightInches;
    private int weight;

    public PhysicalProfile(int heightFeet, int heightInches, int weightLbs) {
        if (heightFeet < 4 || heightFeet > 8){
            throw new IllegalArgumentException("Invalid heightFeet");
        }
        if (heightInches < 0 || heightInches > 12){
            throw new IllegalArgumentException("Invalid heightInches");
        }
        if (weightLbs < 100 || weightLbs > 450){
            throw new IllegalArgumentException("Invalid weightLbs");
        }

        this.heightFeet = heightFeet;
        this.heightInches = heightInches;
        this.weight = weightLbs;
    }

    public int getHeightFeet() { return heightFeet; }

    public int getHeightInches() { return heightInches; }

    public int getWeight() { return weight; }

    public void setWeight(int weight) { this.weight = weight; }

    @Override
    public String toString() {
        return heightFeet + "'" + heightInches + "\" / " + weight + " lbs";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhysicalProfile)) return false;
        PhysicalProfile that = (PhysicalProfile) o;
        return heightFeet == that.heightFeet &&
                heightInches == that.heightInches &&
                weight == that.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(heightFeet, heightInches, weight);
    }
}
