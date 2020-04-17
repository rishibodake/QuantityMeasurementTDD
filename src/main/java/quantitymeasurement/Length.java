package quantitymeasurement;



public class Length {
    private final double valueOfFeet;
    private final AllUnitsToUse.UnitConverter unit;

    public Length(quantitymeasurement.AllUnitsToUse.UnitConverter  unit, double valueOfFeet) {
        this.unit = unit;
        this.valueOfFeet = valueOfFeet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.valueOfFeet, valueOfFeet) == 0;
    }
}
