package com.step.assignment3;

import org.junit.Test;

import static org.junit.Assert.*;

public class VolumeTest {

    @Test
    public void compareLitreToGallon() {
        final Volume volumeInGallon = new Volume(1, VolumeUnit.GALLON);
        final Volume volumeInLitre = new Volume(3.78, VolumeUnit.LITER);

        assertTrue(volumeInGallon.compare(volumeInLitre));
    }

    @Test
    public void addTwoVolume() {
        final Volume volume1 = new Volume(1, VolumeUnit.LITER);
        final Volume volume2 = new Volume(2, VolumeUnit.LITER);

        final Volume addedVolume = volume1.add(volume2);
        assertTrue(addedVolume.equals(new Volume(3, VolumeUnit.LITER)));
    }

    @Test
    public void addTwoDifferentUnitOfVolume() {
        final Volume volume1 = new Volume(1, VolumeUnit.GALLON);
        final Volume volume2 = new Volume(1, VolumeUnit.LITER);

        final Volume addedVolume = volume1.add(volume2);
        final Volume expected = new Volume(4.78, VolumeUnit.LITER);
        assertTrue(addedVolume.isWithinDelta(expected, 0.01));
    }
}