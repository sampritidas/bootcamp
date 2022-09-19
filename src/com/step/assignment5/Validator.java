package com.step.assignment5;

import com.step.assignment5.exceptions.DissonantException;
import com.step.assignment5.exceptions.IncompatibleAdditionException;
import com.step.assignment5.exceptions.MaximumColourExceedsException;

import java.util.ArrayList;

public class Validator {
    private final ArrayList<Ball> balls;

    public Validator(ArrayList<Ball> balls) {
        this.balls = balls;
    }

    private int ballCount(BallColor colour) {
        return (int) this.balls.stream()
                .filter(ball -> ball.getColour() == colour)
                .count();
    }

    public void validate(Ball ball) throws MaximumColourExceedsException, IncompatibleAdditionException, DissonantException {
        if (ball.getColour() == BallColor.GREEN) {
            validateGreen();
        }

        if (ball.getColour() == BallColor.RED) {
            validateRed();
        }

        if (ball.getColour() == BallColor.YELLOW) {
            validateYellow();
        }

        if (ball.getColour() == BallColor.BLUE) {
            isAlreadyPresent(BallColor.BLACK);
        }

        if (ball.getColour() == BallColor.BLACK) {
            isAlreadyPresent(BallColor.BLUE);
        }
    }

    private void validateGreen() throws MaximumColourExceedsException {
        if (!(ballCount(BallColor.GREEN) < 3)) {
            throw new MaximumColourExceedsException(BallColor.GREEN, ballCount(BallColor.GREEN));
        }
    }

    private void validateRed() throws IncompatibleAdditionException {
        if (!(ballCount(BallColor.GREEN) * 2 > ballCount(BallColor.RED))) {
            throw new IncompatibleAdditionException();
        }
    }

    private void validateYellow() throws IncompatibleAdditionException {
        if (isWithin40Percent(BallColor.YELLOW)) {
            throw new IncompatibleAdditionException();
        }
    }

    private boolean isWithin40Percent(BallColor colour) {
        return (this.balls.size() + 1) * 0.4 < ballCount(colour) + 1;
    }

    private void isAlreadyPresent(BallColor colour) throws DissonantException {
        if (this.balls.contains(new Ball(colour))) {
            throw new DissonantException(colour);
        }
    }
}
