package com.step.assignment3;

public enum Rank {
    EQUAL(0), GREATER(1), LESSER(-1);

    public int value;

    Rank(int value) {
        this.value = value;
    }
}
