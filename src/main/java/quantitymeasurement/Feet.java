package quantitymeasurement;

import java.util.Objects;

public class Feet {
    private final double valueOfFeet;

    public Feet(double valueOfFeet) {
        this.valueOfFeet = valueOfFeet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return Double.compare(feet.valueOfFeet, valueOfFeet) == 0;
    }
}
