package com.step.assignment3;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {

    @Test
    public void compareOfFeetAndInches() {
        final Length feet = new Length(10, "feet");
        final Length inches = new Length(10, "inches");

        assertFalse(feet.equals(inches));
    }
    
}