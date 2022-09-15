package com.step.assignment3.exceptions;

import com.step.assignment3.LengthUnit;

public class IncompatibleUnitExceptions extends Throwable {
    public IncompatibleUnitExceptions(LengthUnit unit) {
        super(new String("Incompatible type " + unit));
    }
}
