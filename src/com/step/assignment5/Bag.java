package com.step.assignment5;

import java.util.ArrayList;
import java.util.HashSet;

public class Bag {

    private final int maxCapacity;
    private final ArrayList<Ball> balls;

    public Bag() {
        this.maxCapacity = 12;
        this.balls = new ArrayList<Ball>();
    }

    public void add(Ball ball) {
        if (maxCapacity == balls.size()) {
            return;
        }
        balls.add(ball);
    }

}
