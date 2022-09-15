package com.step.assignment3;

public enum VolumeUnit {
    LITER(1), GALLON(3.78);

    public final double litre;

    VolumeUnit(double litre) {
        this.litre = litre;
    }
}
