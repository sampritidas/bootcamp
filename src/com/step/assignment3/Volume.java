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
        double value = measurementInLitre(this.unit) * this.value;
        return new Volume(value, VolumeUnit.LITER);
    }

    private double measurementInLitre(VolumeUnit unit) {
        switch (unit) {
            case GALLON:
                return 3.78;
            default:
                return 1;
        }
    }

    public boolean compare(Volume newVolume) {
        Volume convertedVolumeInLitre = newVolume.convertToLitre();
        return this.convertToLitre().equals(convertedVolumeInLitre);
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
}
