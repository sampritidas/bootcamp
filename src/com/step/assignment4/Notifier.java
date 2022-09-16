package com.step.assignment4;

public class Notifier {
    
    public ParkingState alert(ParkingLot parkingLot) {
        return new ParkingState(parkingLot.occupiedSlotsPercentage());
    }
}
