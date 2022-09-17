package com.step.assignment4;

import java.util.Objects;

public class ParkingState {
    private int id;
    private final double occupiedPercentage;

    public ParkingState(int id, double occupiedPercentage) {
        this.id = id;
        this.occupiedPercentage = occupiedPercentage;
    }

    public double getOccupiedPercentage() {
        return occupiedPercentage;
    }

    @Override
    public String toString() {
        return "ParkingState{" +
                "id=" + id +
                ", occupiedPercentage=" + occupiedPercentage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParkingState that = (ParkingState) o;
        return id == that.id && Double.compare(that.occupiedPercentage, occupiedPercentage) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, occupiedPercentage);
    }
}
