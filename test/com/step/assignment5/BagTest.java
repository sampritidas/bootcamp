package com.step.assignment5;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BagTest {

    @Test
    public void add() throws MaximumColourExceedsException {
        final Bag bagWith5balls = new Bag(5);
        bagWith5balls.add(new Ball("green"));
        bagWith5balls.add(new Ball("green"));
        bagWith5balls.add(new Ball("green"));

        assertThrows(MaximumColourExceedsException.class, () -> bagWith5balls.add(new Ball("green")));
    }
}