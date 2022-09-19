package com.step.assignment5.exceptions;

public class MaximumBagCapacityExceedException extends Throwable {
    public MaximumBagCapacityExceedException() {
        super("Maximum bag capacity exceeds");
    }
}
