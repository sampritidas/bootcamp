package com.step.assignment3;

import com.step.assignment3.exceptions.InvalidMeasurementException;
import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {

    @Test
    public void compareOfFeetToSameFeet() throws InvalidMeasurementException {
        final Length feet1 = Length.create(10, LengthUnit.FEET);
        final Length feet2 = Length.create(10, LengthUnit.FEET);

        assertEquals(feet1.compare(feet2), Rank.EQUAL);
    }

    @Test
    public void compareFeetToInches() throws InvalidMeasurementException {
        final Length lengthInFeet = Length.create(1, LengthUnit.FEET);
        final Length lengthInInch = Length.create(12, LengthUnit.INCH);

        assertEquals(lengthInFeet.compare(lengthInInch), Rank.EQUAL);
    }

    @Test
    public void compareInchToCm() throws InvalidMeasurementException {
        final Length lengthInInch = Length.create(2, LengthUnit.INCH);
        final Length lengthInCm = Length.create(5, LengthUnit.CM);

        assertEquals(lengthInInch.compare(lengthInCm), Rank.EQUAL);
    }

    @Test
    public void addTwoLengthInInches() throws InvalidMeasurementException {
        final Length length1 = Length.create(2, LengthUnit.INCH);
        final Length length2 = Length.create(2, LengthUnit.INCH);

        Length newLength = length1.add(length2);
        assertTrue(newLength.equals(Length.create(4, LengthUnit.INCH)));
    }

    @Test
    public void throwExceptionInAddWhenUnitsAreDifferent() throws InvalidMeasurementException {
        final Length length1 = Length.create(2, LengthUnit.INCH);
        final Length length2 = Length.create(2.5, LengthUnit.CM);

        Length newAddedLength = length1.add(length2);
        assertTrue(newAddedLength.equals(Length.create(3, LengthUnit.INCH)));
    }
}