package com.step.assignment4;

import com.step.assignment4.exception.ExceedsMaxSlotsException;

import java.util.ArrayList;

public class ParkingLot {

    private final int maxSlots;
    private final ArrayList<Vehicle> slots;

    private ParkingLot(int maxSlots) {
        this.maxSlots = maxSlots;
        this.slots = new ArrayList<>();
    }

    public static ParkingLot create(int maxSlots) {
        return new ParkingLot(maxSlots);
    }

    public boolean park(Vehicle car) throws ExceedsMaxSlotsException {
        if (this.isFull()) {
            throw new ExceedsMaxSlotsException(maxSlots);
        }

        slots.add(car);
        return true;
    }

    public boolean isFull() {
        return slots.size() == this.maxSlots;
    }

    public double occupiedSlotsPercentage() {
        return (this.slots.size() / (double) this.maxSlots) * 100;
    }
}
