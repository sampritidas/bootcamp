package com.step.rectangle;


import com.step.square.Square;

public class Main {
    public static void main(String[] args) {
        final Rectangle rectangle = new Rectangle(20, 10);

        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());

    }
}