package com.step.assignment2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChanceTest {

    @Test
    public void chance() {
        final Chance chance = new Chance(0.5);

        assertTrue(chance.equals(new Chance(0.5)));
    }

    @Test
    public void notChance() {
        final Chance chance = new Chance(0.6);
        final Chance notChance = chance.not();

        assertTrue(notChance.equals(new Chance(0.4)));
    }

    @Test
    public void multiply() {
        final Chance chance = new Chance(0.6);
        final Chance newChance = chance.multiply(new Chance(0.4));

        assertTrue(newChance.equals(new Chance(0.24)));
    }

    @Test
    public void atLeastOne() {
        final Chance chance = new Chance(0.166666666);
        final Chance atLeastOne = chance.atLeastOne(new Chance(0.166666666));

        assertTrue(atLeastOne.equals(new Chance(0.3055555544444445)));
    }
}