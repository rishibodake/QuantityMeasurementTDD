package quantitymeasurement;


import java.util.Objects;

public class QuantityMeasurement {
    public final double value;
    private final  AllUnitsToUse.UnitConverter unit;

    public QuantityMeasurement(AllUnitsToUse.UnitConverter unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement quantityMeasurement = (QuantityMeasurement) o;
        return Double.compare(quantityMeasurement.value, value) == 0 && unit == quantityMeasurement.unit;
    }

    public boolean checkCompare(QuantityMeasurement that) {
        double firstValue = this.unit.conversion(this.value);
        double secondValue = that.unit.conversion(that.value);
        return Objects.equals(firstValue, secondValue);
    }

    public double addition(QuantityMeasurement that) {
        double firstValue = this.unit.conversion(this.value);
        double secondValue = that.unit.conversion(that.value);
        return firstValue+secondValue;
    }

    public Boolean compareTemperatures(QuantityMeasurement that) {
        Double temperature;
        if (this.unit.equals(AllUnitsToUse.UnitConverter.DEGREE)) {
            temperature = (this.value * 9 / 5) + 32;
        }else {
            temperature = (this.value - 32) * 5 / 9;
        }
        return Double.compare(temperature,that.value) == 0;
    }
}
