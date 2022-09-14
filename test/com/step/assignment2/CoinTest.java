package com.step.assignment2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinTest {

    @Test
    public void ChanceToGettingTail() {
        final Coin coin = new Coin(2);
        assertEquals(0.5, coin.chanceToGettingTail(), 0);
    }

    @Test
    public void chanceNotToGettingTail() {
        final Coin coin = new Coin(2);
        assertEquals(0.5, coin.chanceNotToGettingTail(), 0);
    }
}