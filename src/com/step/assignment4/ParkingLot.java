package com.step.assignment4;

import com.step.assignment4.exception.ExceedsMaxSlotsException;

import java.util.ArrayList;

public class ParkingLot {

    private final int maxSlots;
    private Notifier notifier;
    private final ArrayList<Vehicle> slots;

    private ParkingLot(int maxSlots, Notifier notifier) {
        this.maxSlots = maxSlots;
        this.notifier = notifier;
        this.slots = new ArrayList<>();
    }

    public static ParkingLot create(int maxSlots, Notifier notifier) {
        return new ParkingLot(maxSlots, notifier);
    }

    public boolean park(Vehicle car) throws ExceedsMaxSlotsException {
        if (this.isFull()) {
            throw new ExceedsMaxSlotsException(maxSlots);
        }

        slots.add(car);

        if (this.isFull()) {
            this.inform(Subscribers.ASSISTANT);
            this.inform(Subscribers.ATTENDANT);
        }

        if (this.occupiedSlotsPercentage() >= 80) {
            this.inform(Subscribers.MANAGER);
            this.inform(Subscribers.CIVIC_BODY);
        }

        if (this.occupiedSlotsPercentage() <= 20) {
            this.inform(Subscribers.ASSISTANT);
        }

        return true;
    }

    private void inform(Subscribers subscribers) {
        subscribers.inform(this.notifier.alert(this));
    }

    public boolean isFull() {
        return slots.size() == this.maxSlots;
    }

    public double occupiedSlotsPercentage() {
        return (this.slots.size() / (double) this.maxSlots) * 100;
    }
}
