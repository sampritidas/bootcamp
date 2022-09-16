package com.step.assignment4;

import com.step.assignment4.exception.ExceedsMaxSlotsException;
import org.junit.Test;

import static org.junit.Assert.*;

public class NotifierTest {
    @Test
    public void shouldNotifyParkingLotState() throws ExceedsMaxSlotsException {
        final ParkingLot parkingLotWithFourSpace = ParkingLot.create(4);
        final Notifier notifier = new Notifier(parkingLotWithFourSpace);

        parkingLotWithFourSpace.park(new Vehicle(1));
        final ParkingState expected = new ParkingState(25);

        assertTrue(notifier.alert().equals(expected));
    }
}