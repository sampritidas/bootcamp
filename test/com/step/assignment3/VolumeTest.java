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
}