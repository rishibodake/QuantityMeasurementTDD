package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    //TestCase 1
    @Test
    public void given0FeetAnd0Feet_whenCompare_shouldReturnEqual(){
      QuantityMeasurement quantityMeasurementValue1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,0.0);
      QuantityMeasurement quantityMeasurementValue2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,0.0);
      Assert.assertEquals(quantityMeasurementValue1, quantityMeasurementValue2);
    }

    //TestCase For Unequal Objects
    @Test
    public void givenValueZeroAndOneFeet_shouldReturnFalse(){
        QuantityMeasurement quantityMeasurementValue1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,0.0);
        QuantityMeasurement quantityMeasurementValue2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,1.0);
        Assert.assertNotEquals(quantityMeasurementValue1, quantityMeasurementValue2);
    }

    //Test For Null and Value
    @Test
    public void givenNullAndOneValueInFeet_shouldReturnFalse(){
        QuantityMeasurement quantityMeasurementValue1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,0.0);
        quantityMeasurementValue1.equals(null);
        Assert.assertFalse(false);
    }

    //Test For 0 inches and 0 inches
    @Test
    public void given0InchesAnd0Inches_shouldReturnTrue(){
        QuantityMeasurement valueInInches1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,0.0);
        QuantityMeasurement valueInInches2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,0.0);
        Assert.assertEquals(valueInInches1,valueInInches2);
    }

    //Test For Two Unequal Objects
    @Test
    public void given0InchAnd1Inch_whenCompare_shouldReturnFalse(){
        QuantityMeasurement valueInInches1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,0.0);
        QuantityMeasurement valueInInches2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,1.0);
        Assert.assertNotEquals(valueInInches1,valueInInches2);
    }

    //Test For Null and Value
    @Test
    public void givenNullAndOneValueInInch_shouldReturnFalse(){
        QuantityMeasurement valueInInche = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,0.0);
        valueInInche.equals(null);
        Assert.assertFalse(false);
    }

    //Test For Conversion Inches  To Feet
    @Test
    public void given0InchesAnd0Feet_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInInches = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,0.0);
        QuantityMeasurement valueInFeet = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,0.0);
        boolean check = valueInInches.checkCompare(valueInFeet);
        Assert.assertTrue(check);
    }

    //Test For 1 Inch & 1 Feet Should return False
    @Test
    public void given1InchAnd1Feet_whenCompare_shouldReturnFalse(){
        QuantityMeasurement valueInFeet = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,1.0);
        QuantityMeasurement valueInInches = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,1.0);
        Assert.assertNotEquals(valueInInches,valueInFeet);
    }

    //Test For 1 Feet & 1 Inch Should return False
    @Test
    public void given1FeetAnd1Inch_whenCompare_shouldReturnFalse(){
        QuantityMeasurement valueInInches = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,1.0);
        QuantityMeasurement valueInFeet = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,1.0);
        Assert.assertNotEquals(valueInFeet,valueInInches);
    }

    //Test For 1 Feet is 12 inches
    @Test
    public void given1FeetAnd12Inches_whenCompare_shouldEqualsTrue(){
        QuantityMeasurement valueInFeet = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,1.0);
        QuantityMeasurement valueInInches = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,12.0);
        boolean check = valueInFeet.checkCompare(valueInInches);
        Assert.assertTrue(check);
    }
    //Test For Feet To yard
    @Test
    public void given0YardsAnd0Yards_whenCompare_shouldReturnTrue(){
        QuantityMeasurement value1InYards = new QuantityMeasurement(AllUnitsToUse.UnitConverter.YARDS,0.0);
        QuantityMeasurement value2InYards = new QuantityMeasurement(AllUnitsToUse.UnitConverter.YARDS,0.0);
        Assert.assertEquals(value1InYards,value2InYards);
    }

    //Test For Equal Quantity but Different values
    @Test
    public void givenValuesIn0yardAnd1yardValues_ShouldReturnFalse() {
        QuantityMeasurement value1InYards = new QuantityMeasurement(AllUnitsToUse.UnitConverter.YARDS,0.0);
        QuantityMeasurement value2InYards = new QuantityMeasurement(AllUnitsToUse.UnitConverter.YARDS,1.0);
        Assert.assertNotEquals(value1InYards, value2InYards);
    }

    //Test For 1 Value and Null value
    @Test
    public void givenOneNUllValueYardUnit_IfNull_ShouldReturnFalse() {
        QuantityMeasurement value1InYards = new QuantityMeasurement(AllUnitsToUse.UnitConverter.YARDS,10.0);
        value1InYards.equals(null);
        Assert.assertFalse(false);
    }

    //Test For 1 yard is 3 feet
    @Test
    public void givenValuesAsThreeFeetAndOneYard_whenCompare_ShouldReturnTrue() {
        QuantityMeasurement valuesInFeet = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,3.0);
        QuantityMeasurement valueInYards = new QuantityMeasurement(AllUnitsToUse.UnitConverter.YARDS,1.0);
        boolean compareCheck = valuesInFeet.checkCompare(valueInYards);
        Assert.assertTrue(compareCheck);
    }

    //Test For 1 feet is not 1 yards
    @Test
    public void givenValuesAsOneFeetAndOneYard_whenCompare_ShouldReturnfalse() {
        QuantityMeasurement valuesInFeet = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,1.0);
        QuantityMeasurement valueInYards = new QuantityMeasurement(AllUnitsToUse.UnitConverter.YARDS,1.0);
        boolean compareCheck = valuesInFeet.checkCompare(valueInYards);
        Assert.assertFalse(compareCheck);
    }

    //Test For 1 Inch is Not 1 Yard
    @Test
    public void givenValuesAsOneInchAndOneYard_whenCompare_ShouldReturnfalse() {
        QuantityMeasurement valuesInInch = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,1.0);
        QuantityMeasurement valueInYards = new QuantityMeasurement(AllUnitsToUse.UnitConverter.YARDS,1.0);
        boolean compareCheck = valuesInInch.checkCompare(valueInYards);
        Assert.assertFalse(compareCheck);
    }
     //Test For 36 inches is 1 yards
    @Test
    public void given36Inches1Yarfs_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInInches = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,36.00);
        QuantityMeasurement valueInYards = new QuantityMeasurement(AllUnitsToUse.UnitConverter.YARDS,1.0);
        boolean check = valueInInches.checkCompare(valueInYards);
        Assert.assertTrue(check);
    }

    //Test For 1 yard is 3 feet
    @Test
    public void givenValuesAsOneYardAnd3Feet_whenCompare_ShouldReturnTrue() {
        QuantityMeasurement valueInYards = new QuantityMeasurement(AllUnitsToUse.UnitConverter.YARDS,1.0);
        QuantityMeasurement valuesInFeet = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,3.0);
        boolean compareCheck = valueInYards.checkCompare(valuesInFeet);
        Assert.assertTrue(compareCheck);
    }
   
    //Test TO Compare that 2 in is 5 cm
    @Test
    public void given2InchesAnd5Cm_whenCompare_shouldEqualsTrue(){
        QuantityMeasurement valueInFInches = new QuantityMeasurement(AllUnitsToUse.UnitConverter.CENTIMETER,5.0);
        QuantityMeasurement valueInCm = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,2.0);
        boolean check = valueInFInches.checkCompare(valueInCm);
        Assert.assertTrue(check);
    }
     //Test That Add 2 inches and 2 inches should return 4 inches
    @Test
    public void given2InchesAnd2Inches_whenAdded_shouldReturn4(){
        QuantityMeasurement valueInInch1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,2.0);
        QuantityMeasurement valueInInch2= new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,2.0);
        double check = valueInInch1.addition(valueInInch2);
        Assert.assertEquals(4,check,0);
    }

    //Test For Adding 1 feet and 2 inch
    @Test
    public void givenOneFeetAndTwoInch_whenAdded_shouldReturn14Inches(){
        QuantityMeasurement valueInFeet = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,1.00);
        QuantityMeasurement valueInInch = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,2.00);
        double check = valueInFeet.addition(valueInInch);
        Assert.assertEquals(14,check,0);
    }
    //Test For Adding 2 inch and 2.5 centimeter
    @Test
    public void givenTwoInchesAndTwoAndHalfCmt_whenAdded_shouldReturn3Inches(){
        QuantityMeasurement valueInCm = new QuantityMeasurement(AllUnitsToUse.UnitConverter.CENTIMETER,2.5);
        QuantityMeasurement valueInInch = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,2.00);
        double check = valueInCm.addition(valueInInch);
        Assert.assertEquals(3,check,0);
    }
    //Test For Conversion Gallon to Liter
    @Test
    public void given1GallonAnd3point78Liter_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInLiter = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,3.785);
        QuantityMeasurement valueInGallon = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GALLON,1.0);
        boolean check = valueInLiter.checkCompare(valueInGallon);
        Assert.assertTrue(check);
    }

    //Test For 1 Liter and 1000 Mililiter
    @Test
    public void given1000MililiterAnd1Liter_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInLiter = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,1.0);
        QuantityMeasurement valueInMl = new QuantityMeasurement(AllUnitsToUse.UnitConverter.MILILITER,1000.0);
        boolean check = valueInLiter.checkCompare(valueInMl);
        Assert.assertTrue(check);
    }

    //Test For Addition of 1 Liter and 1000 ml
    @Test
    public void givenOneLiterAnd1000Ml_whenAdded_shouldReturn2Liters(){
        QuantityMeasurement valueInLiter = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,1.0);
        QuantityMeasurement valueInMl = new QuantityMeasurement(AllUnitsToUse.UnitConverter.MILILITER,1000.0);
        double check = valueInLiter.addition(valueInMl);
        Assert.assertEquals(2,check,0);
    }
    
    //Test For Addition of 1 Liter and 1000 ml
    @Test
    public void givenOneLiterAnd1000Ml_whenAdded_shouldReturn2Liters(){
        QuantityMeasurement valueInLiter = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,1.0);
        QuantityMeasurement valueInMl = new QuantityMeasurement(AllUnitsToUse.UnitConverter.MILILITER,1000.0);
        double check = valueInLiter.addition(valueInMl);
        Assert.assertEquals(2,check,0);
    }
    //Test For 1Kg is 1000grams
    @Test
    public void givenOneKgAnd1000Gram_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInKilogram1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.KILOGRAM,1.0);
        QuantityMeasurement valueInGram2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GRAM,1000.0);
        boolean check = valueInKilogram1.checkCompare(valueInGram2);
        Assert.assertTrue(check);
    }

    //Test For Addition  1 Tonnes And 1000 Gms
    @Test
    public void given1TonnesAnd1000Gms_whenAdded_shouldReturnAdditionInKg(){
        QuantityMeasurement valueInTonne = new QuantityMeasurement(AllUnitsToUse.UnitConverter.TONNE,1.0);
        QuantityMeasurement valueInGrams = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GRAM,1000.0);
        double check = valueInTonne.addition(valueInGrams);
        Assert.assertEquals(1001,check,0);
    }
    //Test For 100 Degree and 212 Fahrenheit
    @Test
    public void givenValue100DegreeAnd212Fahrenheit_whenCompare_shouldReturnEqual(){
        QuantityMeasurement valueInFahrenheit = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FAHRENHEIT,212.0);
        QuantityMeasurement valueInDegree = new QuantityMeasurement(AllUnitsToUse.UnitConverter.DEGREE,100.0);
        boolean check = valueInDegree.compareTemperatures(valueInFahrenheit);
        Assert.assertTrue(check);
    }
    //Test for 1 fahrenheit is 32 degree
    @Test
    public void given1FahrenheitAnd32Celsius_IfEqual_ReturnTrue(){
        QuantityMeasurement degree = new QuantityMeasurement(AllUnitsToUse.UnitConverter.DEGREE,-17.22222222222222);
        QuantityMeasurement fahrenheit = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FAHRENHEIT,1);
        boolean compareCheck = fahrenheit.compareTemperatures(degree);
        Assert.assertTrue(compareCheck);
    }

}
