package com.step.assignment2;

public class Coin {
    private final int sides;

    public Coin(int sides) {
        this.sides = sides;
    }

    public double chanceToGettingTail() {
        return (double) 1 / sides;
    }
    
    public double chanceNotToGettingTail() {
        return 1 - chanceToGettingTail();
    }
}
