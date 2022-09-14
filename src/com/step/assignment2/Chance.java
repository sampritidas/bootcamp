package com.step.assignment2;

import java.util.Objects;

public class Chance {
    private double chance;

    public Chance(double chance) {
        this.chance = chance;
    }

    public Chance not() {
        return new Chance(1 - chance);
    }

    public Chance multiply(Chance multiplier) {
        return new Chance(chance * multiplier.chance);
    }

    public Chance atLeastOne(Chance anotherChance) {
        Chance notOfAnotherChance = anotherChance.not();
        Chance atMost = notOfAnotherChance.multiply(notOfAnotherChance);

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
}
