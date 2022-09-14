package com.step.assignment1;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void areaOfRectangle() {
        final Rectangle rectangle = Rectangle.createRectangle(5L, 10L);
        assertEquals(50, rectangle.area(), 0.1);
    }

    @Test
    public void perimeterOfRectangle() {
        final Rectangle rectangle = Rectangle.createRectangle(5L, 10L);
        assertEquals(30L, rectangle.perimeter(), 0.1);
    }

    @Test
    public void areaOfSquare() {
        final Rectangle square = Rectangle.createSquare(4);
        assertEquals(16, square.area(), 0.1);
    }

    @Test
    public void perimeterOfSquare() {
        final Rectangle square = Rectangle.createSquare(6);
        assertEquals(24, square.perimeter(), 0.1);
    }
}