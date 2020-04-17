package quantitymeasurement;


import java.util.Objects;

public class Length {
    public final double value;
    private final  AllUnitsToUse.UnitConverter unit;

    public Length(AllUnitsToUse.UnitConverter unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 ;
    }

    public boolean checkCompare(Length that) {
        double firstValue = this.unit.FEET.convertToInches(this.value);
        double secondValue = that.unit.INCHES.convertToInches(that.value);
        return Objects.equals(firstValue, secondValue);
    }
}
