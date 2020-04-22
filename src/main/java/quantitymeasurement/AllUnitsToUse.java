package quantitymeasurement;

public class AllUnitsToUse {
    public enum UnitConverter {
        FEET {
            public double conversion(double length) {
                return length * 12;
            }
        },
        INCHES {
            public double conversion(double length) {
                return length;
            }
        },
        YARDS {
            public double conversion(double length) {
                return length * 3 * 12;
            }
        },
        CENTIMETER {
            public double conversion(double length) {
                return length / 2.5;
            }
        },
        GALLON {
            public double conversion(double volume) {
                return volume * 3.785;
            }
        },
        LITER {
            public double conversion(double volume) {
                return volume;
            }
        },
        MILILITER{
            public double conversion(double volume) {
                return volume/1000;
            }
        },
        KILOGRAM{
            public double conversion(double weight) {
                return weight;
            }
        },
        GRAM{
            public double conversion(double weight) {
                return weight/1000;
            }
        },TONNE{
            public double conversion(double weight) {
                return weight * 1000;
            }
        },
        DEGREE{
          public double conversion(double temperature)
          {
              return temperature;
          }
        },
        FAHRENHEIT;

        public double conversion(double quantity) {
            return 0.0;
        }
    }
}


