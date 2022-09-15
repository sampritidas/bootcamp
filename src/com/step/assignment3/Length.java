package com.step.assignment3;

import java.util.Objects;

public class Length {
    private final double number;
    private final String unit;

    public Length(double number, String unit) {
        this.number = number;
        this.unit = unit;
    }

    public Length convertFeetToInch(Length newLength) {
        return new Length(newLength.number * 12, "inch");
    }

    public Length covertInchToCm(Length newLength) {
        return new Length(newLength.number * 2.5, "cm");
    }

    public Length convertCmToMm(Length newLength) {
        return new Length(newLength.number * 10, "mm");
    }

//    public boolean compare(Length newLength) {
//
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.number, number) == 0 && Objects.equals(unit, length.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, unit);
    }
}
