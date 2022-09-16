package com.step.assignment4;

import com.step.assignment4.exception.ExceedsMaxSlotsException;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingLotTest {

    @Test
    public void shouldParkACarInsideTheParkingLot() throws ExceedsMaxSlotsException {
        final ParkingLot parkingLot = new ParkingLot(1);

        assertTrue(parkingLot.park(Vehicle.CAR));
    }

    @Test
    public void shouldTellIfParkingLotIsNotFull() {
        final ParkingLot parkingLot = new ParkingLot(1);

        assertFalse(parkingLot.isFull());
    }

    @Test
    public void shouldTellIfParkingLotIsFull() throws ExceedsMaxSlotsException {
        final ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.park(Vehicle.CAR);

        assertTrue(parkingLot.isFull());
    }

    @Test
    public void shouldThrowExceedsMaxSlotsExceptionWhenParkingLotIsFull() throws ExceedsMaxSlotsException {
        final ParkingLot parkingLot = new ParkingLot(1);

        parkingLot.park(Vehicle.CAR);

        assertThrows(ExceedsMaxSlotsException.class, () -> parkingLot.park(Vehicle.CAR));
    }
}