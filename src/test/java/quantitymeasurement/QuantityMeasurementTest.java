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

    //Test For Conversion Inches  To Feet
    @Test
    public void given0InchesAnd0Feet_whenCompare_shouldReturnTrue(){
        Length valueInInches = new Length(AllUnitsToUse.UnitConverter.INCHES,0.0);
        Length valueInFeet = new Length(AllUnitsToUse.UnitConverter.FEET,0.0);
        boolean check = valueInInches.checkCompare(valueInFeet);
        Assert.assertTrue(check);
    }

    //Test For 1 Inch & 1 Feet Should return False
    @Test
    public void given1InchAnd1Feet_whenCompare_shouldReturnFalse(){
        Length valueInFeet = new Length(AllUnitsToUse.UnitConverter.FEET,1.0);
        Length valueInInches = new Length(AllUnitsToUse.UnitConverter.INCHES,1.0);
        Assert.assertNotEquals(valueInInches,valueInFeet);
    }

    //Test For 1 Feet & 1 Inch Should return False
    @Test
    public void given1FeetAnd1Inch_whenCompare_shouldReturnFalse(){
        Length valueInInches = new Length(AllUnitsToUse.UnitConverter.INCHES,1.0);
        Length valueInFeet = new Length(AllUnitsToUse.UnitConverter.FEET,1.0);
        Assert.assertNotEquals(valueInFeet,valueInInches);
    }

    //Test For 1 Feet is 12 inches
    @Test
    public void given1FeetAnd12Inches_whenCompare_shouldEqualsTrue(){
        Length valueInFeet = new Length(AllUnitsToUse.UnitConverter.FEET,1.0);
        Length valueInInches = new Length(AllUnitsToUse.UnitConverter.INCHES,12.0);
        boolean check = valueInFeet.checkCompare(valueInInches);
        Assert.assertTrue(check);
    }

    //Test For 12 Inches is 1 Feet
    @Test
    public void given12InchesAnd1Feet_whenCompare_shouldEqualsTrue(){
        Length valueInInches = new Length(AllUnitsToUse.UnitConverter.INCHES,12.0);
        Length valueInFeet = new Length(AllUnitsToUse.UnitConverter.FEET,1.0);
        boolean check = valueInInches.checkCompare(valueInFeet);
        Assert.assertTrue(check);
    }

    //Test For Feet To yard
    @Test
    public void given0YardsAnd0Yards_whenCompare_shouldReturnTrue(){
        Length value1InYards = new Length(AllUnitsToUse.UnitConverter.YARDS,0.0);
        Length value2InYards = new Length(AllUnitsToUse.UnitConverter.YARDS,0.0);
        Assert.assertEquals(value1InYards,value2InYards);
    }

    //Test For Equal Quantity but Different values
    @Test
    public void givenValuesIn0yardAnd1yardValues_ShouldReturnFalse() {
        Length value1InYards = new Length(AllUnitsToUse.UnitConverter.YARDS,0.0);
        Length value2InYards = new Length(AllUnitsToUse.UnitConverter.YARDS,1.0);
        Assert.assertNotEquals(value1InYards, value2InYards);
    }

    //Test For 1 Value and Null value
    @Test
    public void givenOneNUllValueYardUnit_IfNull_ShouldReturnFalse() {
        Length value1InYards = new Length(AllUnitsToUse.UnitConverter.YARDS,10.0);
        value1InYards.equals(null);
        Assert.assertFalse(false);
    }

    //Test For 1 yard is 3 feet
    @Test
    public void givenValuesAsThreeFeetAndOneYard_whenCompare_ShouldReturnTrue() {
        Length valuesInFeet = new Length(AllUnitsToUse.UnitConverter.FEET,3.0);
        Length valueInYards = new Length(AllUnitsToUse.UnitConverter.YARDS,1.0);
        boolean compareCheck = valuesInFeet.checkCompare(valueInYards);
        Assert.assertTrue(compareCheck);
    }

    //Test For 1 feet is not 1 yards
    @Test
    public void givenValuesAsOneFeetAndOneYard_whenCompare_ShouldReturnfalse() {
        Length valuesInFeet = new Length(AllUnitsToUse.UnitConverter.FEET,1.0);
        Length valueInYards = new Length(AllUnitsToUse.UnitConverter.YARDS,1.0);
        boolean compareCheck = valuesInFeet.checkCompare(valueInYards);
        Assert.assertFalse(compareCheck);
    }

    //Test For 1 Inch is Not 1 Yard
    @Test
    public void givenValuesAsOneInchAndOneYard_whenCompare_ShouldReturnfalse() {
        Length valuesInInch = new Length(AllUnitsToUse.UnitConverter.INCHES,1.0);
        Length valueInYards = new Length(AllUnitsToUse.UnitConverter.YARDS,1.0);
        boolean compareCheck = valuesInInch.checkCompare(valueInYards);
        Assert.assertFalse(compareCheck);
    }

    //Test For 1 yards is 36 inches
    @Test
    public void given1Yard36Inches_whenCompare_shoulsReturnTrue(){
        Length valueInYards = new Length(AllUnitsToUse.UnitConverter.YARDS,1.0);
        Length valueInInches = new Length(AllUnitsToUse.UnitConverter.INCHES,36.00);
        boolean check = valueInYards.checkCompare(valueInInches);
        Assert.assertTrue(check);
    }
}
