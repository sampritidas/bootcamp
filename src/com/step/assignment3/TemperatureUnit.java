package com.step.assignment3;

public enum TemperatureUnit {
    C, F;

    public double cToF(double c) {
        return c * 1.8 + 32;
    }

}
