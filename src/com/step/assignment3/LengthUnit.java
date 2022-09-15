package com.step.assignment3;

public enum LengthUnit {
    INCH(1), FEET(12), MM(0.04), CM(0.4);

    public final double inches;

    LengthUnit(double inches) {
        this.inches = inches;
    }
}
