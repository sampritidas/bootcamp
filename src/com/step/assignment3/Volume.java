package com.step.assignment3;

import java.util.Objects;

public class Volume {
    private final double value;
    private final VolumeUnit unit;

    public Volume(double value, VolumeUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public Volume convertToLitre() {
        double newValue = unit.litre * value;
        return new Volume(newValue, VolumeUnit.LITER);
    }

    public boolean compare(Volume newVolume) {
        Volume convertedVolumeInLitre = newVolume.convertToLitre();
        return convertToLitre().equals(convertedVolumeInLitre);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(volume.value, value) == 0 && unit == volume.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }

    public Volume add(Volume newVolume) {
        Volume newVolumeInLitre = newVolume.convertToLitre();
        Volume thisInLitre = this.convertToLitre();

        return new Volume(thisInLitre.value + newVolumeInLitre.value, VolumeUnit.LITER);
    }

    public boolean isWithinDelta(Volume anotherChance, double delta) {
        double actualDelta = this.value - anotherChance.value;
        return Math.abs(actualDelta) <= delta;
    }
}
