package com.step.assignment4;

import java.util.Objects;

public class ParkingState {
    private final double occupiedPercentage;

    public ParkingState(double occupiedPercentage) {
        this.occupiedPercentage = occupiedPercentage;
    }

    @Override
    public String toString() {
        return "ParkingStatus{" +
                "occupiedPercentage=" + occupiedPercentage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParkingState that = (ParkingState) o;
        return Double.compare(that.occupiedPercentage, occupiedPercentage) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(occupiedPercentage);
    }
}
