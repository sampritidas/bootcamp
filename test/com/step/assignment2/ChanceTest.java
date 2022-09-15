package com.step.assignment2;

import com.step.assignment2.exceptions.InvalidChanceException;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChanceTest {

    @Test
    public void shouldReturnAChance() throws InvalidChanceException {
        final Chance chance = Chance.createChance(0.5);
        assertTrue(chance.equals(Chance.createChance(0.5)));
    }

    @Test
    public void shouldReturnComplementOfChance() throws InvalidChanceException {
        final Chance chance = Chance.createChance(0.6);
        final Chance notChance = chance.not();
        assertTrue(notChance.equals(Chance.createChance(0.4)));
    }

    @Test
    public void shouldReturnAndOfTwoChances() throws InvalidChanceException {
        final Chance chance = Chance.createChance(0.6);
        final Chance newChance = chance.and(Chance.createChance(0.4));

        assertTrue(newChance.equals(Chance.createChance(0.24)));
    }

    @Test
    public void shouldReturnOrOfTwoChances() throws InvalidChanceException {
        final Chance chance = Chance.createChance(0.166);

        Chance actual = chance.or(Chance.createChance(0.166));
        Chance expected = Chance.createChance(0.304);

        assertTrue(actual.isWithinDelta(expected, 0.001));
    }

    @Test
    public void shouldThrowInvalidChanceExceptionWhenChanceIsInvalid() throws InvalidChanceException {
        assertThrows(InvalidChanceException.class, () -> Chance.createChance(2));
    }
}