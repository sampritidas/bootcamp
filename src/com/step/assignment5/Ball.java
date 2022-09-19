package com.step.assignment5;

import java.util.Objects;

public class Ball {
    private final BallColor colour;

    public Ball(BallColor color) {
        this.colour = color;
    }

    public BallColor getColour() {
        return this.colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return getColour() == ball.getColour();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColour());
    }
}
