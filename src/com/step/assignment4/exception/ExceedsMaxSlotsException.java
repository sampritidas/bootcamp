package com.step.assignment4.exception;

public class ExceedsMaxSlotsException extends Throwable {
    public ExceedsMaxSlotsException(int maxSlots) {
        super("*Error* Exceeds Max Slots " + maxSlots);
    }
}
