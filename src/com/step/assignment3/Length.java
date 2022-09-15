package com.step.assignment3;

import java.util.Objects;

public class Length {
    private final double number;
    private final LengthUnit unit;

    public Length(double number, LengthUnit unit) {
        this.number = number;
        this.unit = unit;
    }

    public Length convertToMm() {
        double value = measurementInMM(this.unit) * this.number;
        return new Length(value, LengthUnit.MM);
    }

    private static int measurementInMM(LengthUnit unit) {
        switch (unit) {
            case FEET:
                return 300;
            case INCH:
                return 25;
            case CM:
                return 10;
            default:
                return 1;
        }
    }

    public boolean compare(Length newLength) {
        Length convertedNewLength = newLength.convertToMm();
        return this.convertToMm().equals(convertedNewLength);
    }


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
