package com.step.assignment5;

import java.util.ArrayList;

public class Bag {

    private final int maxCapacity;
    private final ArrayList<Ball> balls;

    public Bag(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.balls = new ArrayList<Ball>();
    }

    public void add(Ball ball) throws MaximumColourExceedsException {
        if (maxCapacity == balls.size()) {
            return;
        }

        if (!(ballCount("green") < 3)) {
            throw new MaximumColourExceedsException("green", ballCount("green"));
        }
        balls.add(ball);
    }

    private int ballCount(String color) {
        return (int) this.balls.stream()
                .filter(ball -> ball.getColor() == color)
                .count();
    }

}
