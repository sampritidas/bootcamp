package com.step.assignment3.exceptions;

public class InvalidMeasurementException extends Throwable {
    public InvalidMeasurementException(double value) {
        super(new String("invalid value : " + value));
    }
}
