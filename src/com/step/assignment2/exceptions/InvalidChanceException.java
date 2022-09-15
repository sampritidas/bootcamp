package com.step.assignment2.exceptions;

public class InvalidChanceException extends Throwable {
    public InvalidChanceException(double chance) {
        super(new String("Invalid chance : " + chance));
    }
}
