package com.step.square;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void areaOfSquare() {
        final Square square = new Square(5);

        assertEquals(25, square.area(), 0.1);
    }

    @Test
    public void perimeterOfSquare() {
        final Square square = new Square(5);

        assertEquals(20, square.perimeter(), 0.1);
    }
}