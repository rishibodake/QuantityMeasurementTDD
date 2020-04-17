package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;
import quantitymeasurement.AllUnitsToUse;

public class QuantityMeasurementTest {

    //TestCase 1
    @Test
    public void given0FeetAnd0Feet_whenCompare_shouldReturnEqual(){
      Length lengthValue1 = new Length(AllUnitsToUse.UnitConverter.FEET,0.0);
      Length lengthValue2 = new Length(AllUnitsToUse.UnitConverter.FEET,0.0);
      Assert.assertEquals(lengthValue1, lengthValue2);
    }

    //TestCase For Unequal Objects
    @Test
    public void givenValueZeroAndOneFeet_shouldReturnFalse(){
        Length lengthValue1 = new Length(AllUnitsToUse.UnitConverter.FEET,0.0);
        Length lengthValue2 = new Length(AllUnitsToUse.UnitConverter.FEET,1.0);
        Assert.assertNotEquals(lengthValue1, lengthValue2);
    }

    //Test For Null and Value
    @Test
    public void givenNullAndOneValueInFeet_shouldReturnFalse(){
        Length lengthValue1 = new Length(AllUnitsToUse.UnitConverter.FEET,0.0);
        lengthValue1.equals(null);
        Assert.assertFalse(false);
    }

    //Test For 0 inches and 0 inches
    @Test
    public void given0InchesAnd0Inches_shouldReturnTrue(){
        Length valueInInches1 = new Length(AllUnitsToUse.UnitConverter.INCHES,0.0);
        Length valueInInches2 = new Length(AllUnitsToUse.UnitConverter.INCHES,0.0);
        Assert.assertEquals(valueInInches1,valueInInches2);
    }

    //Test For Two Unequal Objects
    @Test
    public void given0InchAnd1Inch_whenCompare_shouldReturnFalse(){
        Length valueInInches1 = new Length(AllUnitsToUse.UnitConverter.INCHES,0.0);
        Length valueInInches2 = new Length(AllUnitsToUse.UnitConverter.INCHES,1.0);
        Assert.assertNotEquals(valueInInches1,valueInInches2);
    }

    //Test For Null and Value
    @Test
    public void givenNullAndOneValueInInch_shouldReturnFalse(){
        Length valueInInche = new Length(AllUnitsToUse.UnitConverter.INCHES,0.0);
        valueInInche.equals(null);
        Assert.assertFalse(false);
    }

    //Test For Conversion Feet To Inches
    @Test
    public void given0FeetAnd0Inches_whenCompare_shouldReturnTrue(){
        Length valueInFeet = new Length(AllUnitsToUse.UnitConverter.FEET,0.0);
        Length valueInInches = new Length(AllUnitsToUse.UnitConverter.INCHES,0.0);
        boolean check = valueInFeet.checkCompare(valueInInches);
        Assert.assertTrue(check);
    }

    //Test For 1 Inch & 1 Feet Should return False
    @Test
    public void given1InchAnd1Feet_whenCompare_shouldReturnFalse(){
        Length valueInFeet = new Length(AllUnitsToUse.UnitConverter.FEET,1.0);
        Length valueInInches = new Length(AllUnitsToUse.UnitConverter.INCHES,1.0);
        Assert.assertNotEquals(valueInInches,valueInFeet);
    }
}
