package com.step.assignment5;

public class MaximumColourExceedsException extends Throwable {
    public MaximumColourExceedsException(String color, int count) {
        super(String.format("Count exceeds of %s ", color));
    }
}
