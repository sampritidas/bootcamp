package com.step.assignment5.exceptions;

public class IncompatibleAdditionException extends Throwable {
    public IncompatibleAdditionException() {
        super("Cannot add red balls more than twice of green ball");
    }
}
