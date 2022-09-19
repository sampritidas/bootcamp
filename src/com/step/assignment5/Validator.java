package com.step.assignment5;

import com.step.assignment5.exceptions.IncompatibleAdditionException;
import com.step.assignment5.exceptions.MaximumColourExceedsException;

import java.util.ArrayList;

public class Validator {
    private final ArrayList<Ball> balls;
    private final int maxCapacity;

    public Validator(ArrayList<Ball> balls, int maxCapacity) {
        this.balls = balls;
        this.maxCapacity = maxCapacity;
    }

    private int ballCount(BallColor colour) {
        return (int) this.balls.stream()
                .filter(ball -> ball.getColour() == colour)
                .count();
    }

    public void validate(Ball ball) throws MaximumColourExceedsException, IncompatibleAdditionException {
        if (ball.getColour() == BallColor.GREEN) {
            validateGreen();
        }

        if (ball.getColour() == BallColor.RED) {
            validateRed();
        }

        if (ball.getColour() == BallColor.YELLOW) {
            validateYellow();
        }
    }

    private void validateYellow() throws IncompatibleAdditionException {
        if (balls.size() * 0.4 > ballCount(BallColor.YELLOW)) {
            throw new IncompatibleAdditionException();
        }
    }

    private void validateRed() throws IncompatibleAdditionException {
        if (!(ballCount(BallColor.GREEN) * 2 > ballCount(BallColor.RED))) {
            throw new IncompatibleAdditionException();
        }
    }

    private void validateGreen() throws MaximumColourExceedsException {
        if (!(ballCount(BallColor.GREEN) < 3)) {
            throw new MaximumColourExceedsException(BallColor.GREEN, ballCount(BallColor.GREEN));
        }
    }
}
