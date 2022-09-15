package com.step.assignment3;

import com.step.assignment3.exceptions.IncompatibleUnitExceptions;
import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {

    @Test
    public void compareOfFeetToSameFeet() {
        final Length feet1 = new Length(10, LengthUnit.FEET);
        final Length feet2 = new Length(10, LengthUnit.FEET);

        assertTrue(feet1.compare(feet2));
    }

    @Test
    public void compareFeetToInches() {
        final Length lengthInFeet = new Length(1, LengthUnit.FEET);
        final Length lengthInInch = new Length(12, LengthUnit.INCH);

        assertTrue(lengthInFeet.compare(lengthInInch));
    }

    @Test
    public void compareInchToCm() {
        final Length lengthInInch = new Length(2, LengthUnit.INCH);
        final Length lengthInCm = new Length(5, LengthUnit.CM);

        assertTrue(lengthInInch.compare(lengthInCm));
    }

    @Test
    public void addTwoLengthInInches() throws IncompatibleUnitExceptions {
        final Length length1 = new Length(2, LengthUnit.INCH);
        final Length length2 = new Length(2, LengthUnit.INCH);

        Length newLength = length1.add(length2);
        assertTrue(newLength.equals(new Length(4, LengthUnit.INCH)));
    }

    @Test
    public void throwExceptionInAddWhenUnitsAreDifferent() throws IncompatibleUnitExceptions {
        final Length length1 = new Length(2, LengthUnit.INCH);
        final Length length2 = new Length(2.5, LengthUnit.CM);

        Length newAddedLength = length1.add(length2);
        assertTrue(newAddedLength.equals(new Length(3, LengthUnit.INCH)));
    }
}