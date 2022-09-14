package com.step.assignment1;

public class Rectangle {
    private final double width;
    private final double height;

    private Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public static Rectangle createRectangle(double width, double height) {
        return new Rectangle(width, height);
    }

    public static Rectangle createSquare(double side) {
        return new Rectangle(side, side);
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

}
