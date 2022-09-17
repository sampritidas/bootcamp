package com.step.assignment4;

import com.step.assignment4.exception.ExceedsMaxSlotsException;

import java.util.ArrayList;

public class ParkingLot {

    private final int id;
    private final int maxSlots;
    private final Notifier notifier;
    private final ArrayList<Vehicle> slots;

    private ParkingLot(int id, int maxSlots, Notifier notifier) {
        this.id = id;
        this.maxSlots = maxSlots;
        this.notifier = notifier;
        this.slots = new ArrayList<>();
    }

    public static ParkingLot create(int id, int maxSlots, Notifier notifier) {
        return new ParkingLot(id, maxSlots, notifier);
    }

    public boolean park(Vehicle car) throws ExceedsMaxSlotsException {
        if (this.isFull()) {
            throw new ExceedsMaxSlotsException(maxSlots);
        }

        slots.add(car);

        this.notifier.notify(this.state());

        return true;
    }

    public boolean isFull() {
        return slots.size() == this.maxSlots;
    }

    public ParkingState state() {
        return new ParkingState(this.id, this.occupiedSlotsPercentage());
    }

    public double occupiedSlotsPercentage() {
        return (this.slots.size() / (double) this.maxSlots) * 100;
    }
}
