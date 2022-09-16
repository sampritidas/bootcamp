package com.step.assignment4;

import com.step.assignment4.exception.ExceedsMaxSlotsException;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingLotTest {

    @Test
    public void shouldParkACarInsideTheParkingLot() throws ExceedsMaxSlotsException {
        final ParkingLot parkingLot = ParkingLot.create(1);
        final Vehicle car = new Vehicle(1);

        assertTrue(parkingLot.park(car));
    }

    @Test
    public void shouldTellIfParkingLotIsNotFull() {
        final ParkingLot parkingLot = ParkingLot.create(1);

        assertFalse(parkingLot.isFull());
    }

    @Test
    public void shouldTellIfParkingLotIsFull() throws ExceedsMaxSlotsException {
        final ParkingLot parkingLot = ParkingLot.create(1);
        parkingLot.park(new Vehicle(1));

        assertTrue(parkingLot.isFull());
    }

    @Test
    public void shouldThrowExceedsMaxSlotsExceptionWhenParkingLotIsFull() throws ExceedsMaxSlotsException {
        final ParkingLot parkingLot = ParkingLot.create(1);

        parkingLot.park(new Vehicle(1));

        assertThrows(ExceedsMaxSlotsException.class, () -> parkingLot.park(new Vehicle(2)));
    }
}