package com.step.assignment5.exceptions;

import com.step.assignment5.BallColor;

public class DissonantException extends Throwable {
    public DissonantException(BallColor colour) {
        super(colour + "is already exist");
    }
}
