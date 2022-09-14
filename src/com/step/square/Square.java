package com.step.square;

import com.step.rectangle.Rectangle;

public class Square {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    public double area() {
        final Rectangle rectangle = new Rectangle(side, side);
        return rectangle.area();
    }

    public double perimeter() {
        final Rectangle rectangle = new Rectangle(side, side);
        return rectangle.perimeter();
    }
}
