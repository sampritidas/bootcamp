package com.step.assignment3;

import java.util.Objects;

public class Temperature {
    private final double value;
    private final TemperatureUnit unit;

    public Temperature(double value, TemperatureUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public Temperature convertToF() {
        double newValue = this.unit == TemperatureUnit.F ? this.value : unit.cToF(value);
        return new Temperature(newValue, TemperatureUnit.F);
    }

    public Rank compare(Temperature newTemperature) {
        Temperature newTempInF = newTemperature.convertToF();
        Temperature thisTempInF = this.convertToF();

        if (thisTempInF.value == newTempInF.value) {
            return Rank.EQUAL;
        }
        return thisTempInF.value > newTemperature.value ? Rank.LESSER : Rank.GREATER;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return Double.compare(that.value, value) == 0 && unit == that.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
