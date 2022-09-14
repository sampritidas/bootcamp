package com.step.rectangle;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void area_of_rectangle() {
        final Rectangle rectangle = new Rectangle(5, 10);

        assertEquals(rectangle.area() , 50);
    }
}