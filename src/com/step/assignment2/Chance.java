package com.step.assignment2;

import com.step.assignment2.exceptions.InvalidChanceException;

import java.util.Objects;

public class Chance {
    public static final int IMPOSSIBILITY = 0;
    public static final int CERTAINTY = 1;
    private double chance;


    private Chance(double chance) {
        this.chance = chance;
    }

    public static Chance createChance(double chance) throws InvalidChanceException {
        if (chance < IMPOSSIBILITY || chance > CERTAINTY) {
            throw new InvalidChanceException(chance);
        }
        return new Chance(chance);
    }

    public Chance not() throws InvalidChanceException {
        return createChance(1 - chance);
    }

    public Chance and(Chance anotherChance) throws InvalidChanceException {
        return createChance(chance * anotherChance.chance);
    }

    public Chance or(Chance anotherChance) throws InvalidChanceException {
        Chance notOfAnotherChance = anotherChance.not();
        Chance atMost = this.not().and(notOfAnotherChance);

        return atMost.not();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chance chance1 = (Chance) o;
        return Double.compare(chance1.chance, chance) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(chance);
    }

    public boolean isWithinDelta(Chance anotherChance, double delta) {
        double actualDelta = this.chance - anotherChance.chance;
        return Math.abs(actualDelta) <= delta;
    }
}
