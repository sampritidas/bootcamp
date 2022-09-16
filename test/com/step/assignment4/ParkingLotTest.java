package com.step.assignment4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingLotTest {

    @Test
    public void shouldParkACarInsideTheParkingLot() {
        final ParkingLot parkingLot = new ParkingLot(1);

        assertTrue(parkingLot.park(Vehicle.CAR));
    }

    @Test
    public void shouldTellIfParkingLotIsFullOrNot() {
        final ParkingLot parkingLot = new ParkingLot(1);

        assertFalse(parkingLot.isFull());
    }

}