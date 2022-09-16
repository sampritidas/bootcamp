package com.step.assignment3;

import com.step.assignment3.exceptions.InvalidMeasurementException;

import java.util.Objects;

public class Length {
    private final double value;
    private final LengthUnit unit;

    private Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Length create(double value, LengthUnit unit) throws InvalidMeasurementException {
        if (value < 0) {
            throw new InvalidMeasurementException(value);
        }
        return new Length(value, unit);
    }

    public Length convertToInch() throws InvalidMeasurementException {
        double value = unit.inches * this.value;
        return create(value, LengthUnit.INCH);
    }

    public Rank compare(Length newLength) throws InvalidMeasurementException {
        Length convertedNewLength = newLength.convertToInch();
        Length thisLengthInInch = this.convertToInch();

        if (thisLengthInInch.value == convertedNewLength.value) {
            return Rank.EQUAL;
        }
        return thisLengthInInch.value > convertedNewLength.value ? Rank.LESSER : Rank.GREATER;
    }

    public Length add(Length newLength) throws InvalidMeasurementException {
        Length newLengthInInch = newLength.convertToInch();
        Length thisInInch = this.convertToInch();
        return create(thisInInch.value + newLengthInInch.value, LengthUnit.INCH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && Objects.equals(unit, length.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
