package com.step.assignment5;

import com.step.assignment5.exceptions.DissonantException;
import com.step.assignment5.exceptions.IncompatibleAdditionException;
import com.step.assignment5.exceptions.MaximumBagCapacityExceedException;
import com.step.assignment5.exceptions.MaximumColourExceedsException;
import org.junit.Test;

import static org.junit.Assert.*;

public class BagTest {

    @Test
    public void ShouldThrowAnErrorWhileAddingForthGreenBall() throws MaximumColourExceedsException, MaximumBagCapacityExceedException, IncompatibleAdditionException, DissonantException {
        final Bag bagWith5balls = new Bag(5);
        bagWith5balls.add(new Ball(BallColor.GREEN));
        bagWith5balls.add(new Ball(BallColor.GREEN));
        bagWith5balls.add(new Ball(BallColor.GREEN));

        assertThrows(MaximumColourExceedsException.class, () -> bagWith5balls.add(new Ball(BallColor.GREEN)));
    }

    @Test
    public void ShouldThrowAnErrorIfMaximumCapacityExceeds() throws MaximumColourExceedsException, MaximumBagCapacityExceedException, IncompatibleAdditionException, DissonantException {
        final Bag bagWith2balls = new Bag(2);
        bagWith2balls.add(new Ball(BallColor.GREEN));
        bagWith2balls.add(new Ball(BallColor.GREEN));

        assertThrows(MaximumBagCapacityExceedException.class, () -> bagWith2balls.add(new Ball(BallColor.GREEN)));
    }

    @Test
    public void ShouldThrowAnErrorWhileAddingFirstRedBall() throws MaximumColourExceedsException, MaximumBagCapacityExceedException {
        final Bag bagWith2balls = new Bag(2);

        assertThrows(IncompatibleAdditionException.class, () -> bagWith2balls.add(new Ball(BallColor.RED)));
    }

    @Test
    public void ShouldThrowAnErrorIfRedBallIsMoreThanTwiceOfGreen() throws MaximumColourExceedsException, MaximumBagCapacityExceedException, IncompatibleAdditionException, DissonantException {
        final Bag bagWith5balls = new Bag(5);
        bagWith5balls.add(new Ball(BallColor.GREEN));
        bagWith5balls.add(new Ball(BallColor.RED));
        bagWith5balls.add(new Ball(BallColor.RED));

        assertThrows(IncompatibleAdditionException.class, () -> bagWith5balls.add(new Ball(BallColor.RED)));
    }

    @Test
    public void ShouldThrowAnErrorIfYellowBallAddedOver40PercentOfBalls() throws MaximumColourExceedsException, MaximumBagCapacityExceedException, IncompatibleAdditionException, DissonantException {
        final Bag bagWith5balls = new Bag(5);
        bagWith5balls.add(new Ball(BallColor.GREEN));
        bagWith5balls.add(new Ball(BallColor.GREEN));
        bagWith5balls.add(new Ball(BallColor.YELLOW));

        assertThrows(IncompatibleAdditionException.class, () -> bagWith5balls.add(new Ball(BallColor.YELLOW)));
    }

    @Test
    public void ShouldThrowAnErrorIfBlackBallIsAlreadyPresent() throws MaximumColourExceedsException, MaximumBagCapacityExceedException, IncompatibleAdditionException, DissonantException {
        final Bag bagWith5balls = new Bag(5);
        bagWith5balls.add(new Ball(BallColor.BLACK));

        assertThrows(DissonantException.class, () -> bagWith5balls.add(new Ball(BallColor.BLUE)));
    }

    @Test
    public void ShouldThrowAnErrorIfBlueBallIsAlreadyPresent() throws MaximumColourExceedsException, MaximumBagCapacityExceedException, IncompatibleAdditionException, DissonantException {
        final Bag bagWith5balls = new Bag(5);
        bagWith5balls.add(new Ball(BallColor.BLUE));

        assertThrows(DissonantException.class, () -> bagWith5balls.add(new Ball(BallColor.BLACK)));
    }
}