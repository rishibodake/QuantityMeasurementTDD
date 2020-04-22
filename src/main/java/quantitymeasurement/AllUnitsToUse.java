package quantitymeasurement;

public class AllUnitsToUse {
    public enum UnitConverter {
        FEET {
            public double convertToInches(double length) {
                return length * 12;
            }
        },
        INCHES {
            public double convertToInches(double length) {
                return length;
            }
        },
        YARDS {
            public double convertToInches(double length) {
                return length * 3 * 12;
            }
        },
        CENTIMETER {
            public double convertToInches(double length) {
                return length / 2.5;
            }
        },
        GALLON {
            public double convertToInches(double volume) {
                return volume * 3.785;
            }
        },
        LITER {
            public double convertToInches(double volume) {
                return volume;
            }
        };

        public double convertToInches(double length) {
            return 0.0;
        }
    }
}


