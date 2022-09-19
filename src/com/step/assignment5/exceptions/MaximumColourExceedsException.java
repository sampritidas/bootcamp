package com.step.assignment5.exceptions;

import com.step.assignment5.BallColor;

public class MaximumColourExceedsException extends Throwable {
    public MaximumColourExceedsException(BallColor color, int count) {
        super(String.format("Count exceeds of %s ", color));
    }
}
