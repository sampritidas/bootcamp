package com.step.rectangle;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void areaOfRectangle() {
        final Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(rectangle.area(), 50);
    }

    @Test
    public void perimeterOfRectangle() {
        final Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(rectangle.perimeter(), 30);
    }
}