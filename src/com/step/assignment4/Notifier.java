package com.step.assignment4;

public class Notifier {

    private final ParkingLot parkingLot;

    public Notifier(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingState alert() {
        return new ParkingState(this.parkingLot.occupiedSlotsPercentage());
    }
}
