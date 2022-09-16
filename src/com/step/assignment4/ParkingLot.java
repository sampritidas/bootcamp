package com.step.assignment4;

import java.util.ArrayList;

public class ParkingLot {

    private final int maxSlots;
    private final ArrayList<Vehicle> slots;

    public ParkingLot(int maxSlots) {
        this.maxSlots = maxSlots;
        this.slots = new ArrayList<>();
    }

    public boolean park(Vehicle car) {
        if (this.slots.size() == this.maxSlots) {
            return false;
        }
        ;
        slots.add(car);
        return true;
    }
}
