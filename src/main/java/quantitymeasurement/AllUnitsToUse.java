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
                return length;
            }

        };
        public double convertToInches(double length) {
            return 0.0;
        }
        }
}


