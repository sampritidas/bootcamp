package com.step.assignment3;

import java.util.Objects;

public class Length {
    private final double number;
    private final LengthUnit unit;

    public Length(double number, LengthUnit unit) {
        this.number = number;
        this.unit = unit;
    }

    public Length convertToInch() {
        double value = unit.inches * number;
        return new Length(value, LengthUnit.INCH);
    }

    public boolean compare(Length newLength) {
        Length convertedNewLength = newLength.convertToInch();
        return convertToInch().equals(convertedNewLength);
    }

    public Length add(Length newLength) {
        Length newLengthInInch = newLength.convertToInch();
        Length thisInInch = this.convertToInch();
        return new Length(thisInInch.number + newLengthInInch.number, LengthUnit.INCH);
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
