package com.step.assignment5;

import com.step.assignment5.exceptions.DissonantException;
import com.step.assignment5.exceptions.IncompatibleAdditionException;
import com.step.assignment5.exceptions.MaximumBagCapacityExceedException;
import com.step.assignment5.exceptions.MaximumColourExceedsException;

import java.util.ArrayList;

public class Bag {

    private final int maxCapacity;
    private Validator validator;
    private final ArrayList<Ball> balls;

    public Bag(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.balls = new ArrayList<Ball>();
        this.validator = new Validator(balls, maxCapacity);
    }

    public void add(Ball ball) throws MaximumColourExceedsException, MaximumBagCapacityExceedException, IncompatibleAdditionException, DissonantException {
        if (maxCapacity == balls.size()) {
            throw new MaximumBagCapacityExceedException();
        }

        this.validator.validate(ball);
        balls.add(ball);
    }
}
