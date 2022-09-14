package com.step.rectangle;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void areaOfRectangle() {
        final Rectangle rectangle = new Rectangle(5L, 10L);
        assertEquals(rectangle.area(), 50L, 0.1);
    }

    @Test
    public void perimeterOfRectangle() {
        final Rectangle rectangle = new Rectangle(5L, 10L);
        assertEquals(rectangle.perimeter(), 30L, 0.1);
    }

}