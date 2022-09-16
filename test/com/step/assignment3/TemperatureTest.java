package com.step.assignment3;

import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureTest {

    @Test
    public void compareTempInCelciusWithFahrenheit() {
        final Temperature temperatureInC = new Temperature(100, TemperatureUnit.C);
        final Temperature temperatureInF = new Temperature(212, TemperatureUnit.F);

        assertEquals(Rank.EQUAL, temperatureInF.compare(temperatureInC));
    }

    @Test
    public void compareTwoTemparatureInCelcius() {
        final Temperature temperatureInC = new Temperature(100, TemperatureUnit.C);
        final Temperature temperatureInF = new Temperature(100, TemperatureUnit.C);

        assertEquals(Rank.EQUAL, temperatureInF.compare(temperatureInC));
    }
}