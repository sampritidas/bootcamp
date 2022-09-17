package com.step.assignment4;

import org.junit.Test;

import java.util.ArrayList;

public class ParkingLotsTest {
    @Test
    public void shouldParkACarParkingLots() {
        final ParkingLot parkingLot1 = ParkingLot.create(2, 1, new Notifier());
        final ParkingLot parkingLot2 = ParkingLot.create(3, 1, new Notifier());
        final ArrayList<ParkingLot> parkingLotList = new ArrayList<>();
        parkingLotList.add(parkingLot1);
        parkingLotList.add(parkingLot2);

        final ParkingLots parkingLots = new ParkingLots(parkingLotList, new Notifier());
        final Vehicle car = new Vehicle(1);

        parkingLots.park(car);
    }
}