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

    //Test For Conversion Feet To Inches
    @Test
    public void given0FeetAnd0Inches_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInFeet = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,0.0);
        QuantityMeasurement valueInInches = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,0.0);
        boolean check = valueInFeet.checkCompare(valueInInches);
        Assert.assertTrue(check);
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

    //Test For 12 Inches is 1 Feet
    @Test
    public void given12InchesAnd1Feet_whenCompare_shouldEqualsTrue(){
        QuantityMeasurement valueInInches = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,12.0);
        QuantityMeasurement valueInFeet = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,1.0);
        boolean check = valueInInches.checkCompare(valueInFeet);
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

    //Test For 1 yards is 36 inches
    @Test
    public void given1Yard36Inches_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInYards = new QuantityMeasurement(AllUnitsToUse.UnitConverter.YARDS,1.0);
        QuantityMeasurement valueInInches = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,36.00);
        boolean check = valueInYards.checkCompare(valueInInches);
        Assert.assertTrue(check);
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
    //test For 0Cm and OCm
    @Test
    public void givenValuesAsZeroCmAndZeroCm_shouldReturnTrue(){
        QuantityMeasurement valueInCm1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.CENTIMETER,0);
        QuantityMeasurement valueInCm2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.CENTIMETER,0);
        Assert.assertEquals(valueInCm1,valueInCm2);
    }

    //Test for 0cm and 1 Cm
    @Test
    public void givenValuesAsZeroAndOneCm_whenCompare_shouldReturnFalse()
    {
        QuantityMeasurement cmValue1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.CENTIMETER,0.0);
        QuantityMeasurement cmValue2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.CENTIMETER,1.0);
        Assert.assertNotEquals(cmValue1, cmValue2);
    }

    //Test For Null and Value
    @Test
    public void givenNullAndOneValueInCm_shouldReturnFalse(){
        QuantityMeasurement valueInCm = new QuantityMeasurement(AllUnitsToUse.UnitConverter.CENTIMETER,0.0);
        valueInCm.equals(null);
        Assert.assertFalse(false);
    }

    //Test for 0Cm and 0Inches
    @Test
    public void given0InchesAnd0Cm_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInInches = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,0.0);
        QuantityMeasurement valueInCm = new QuantityMeasurement(AllUnitsToUse.UnitConverter.CENTIMETER,0.0);
        boolean check = valueInInches.checkCompare(valueInCm);
        Assert.assertTrue(check);
    }

    //Test For 1cm and 1 Inches
    @Test
    public void given1CmAnd1Inches_whenCompare_shouldReturnFalse(){
        QuantityMeasurement valueInInches = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,1.0);
        QuantityMeasurement valueInCm = new QuantityMeasurement(AllUnitsToUse.UnitConverter.CENTIMETER,1.0);
        Assert.assertNotEquals(valueInCm,valueInInches);
    }

    //Test TO Compare that 2 in is 5 cm
    @Test
    public void given2InchesAnd5Cm_whenCompare_shouldEqualsTrue(){
        QuantityMeasurement valueInFInches = new QuantityMeasurement(AllUnitsToUse.UnitConverter.CENTIMETER,5.0);
        QuantityMeasurement valueInCm = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,2.0);
        boolean check = valueInFInches.checkCompare(valueInCm);
        Assert.assertTrue(check);
    }

    //Test That Add 0Inches And 0Inches   Basic Additon
    @Test
    public void given0InchesAnd0Inches_whenAdded_shouldReturnTrue(){
        QuantityMeasurement valueInFInch1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,0);
        QuantityMeasurement valueInInch2= new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,0);
        double check = valueInFInch1.addition(valueInInch2);
        Assert.assertEquals(0,check,0);
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

    //Test For Adding 1 feet and 1 feet
    @Test
    public void givenOneFeetAndOneFeet_whenAdded_shouldReturn24Inches(){
        QuantityMeasurement valueInFeet1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,1.00);
        QuantityMeasurement valueInFeet2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,1.00);
        double check = valueInFeet1.addition(valueInFeet2);
        Assert.assertEquals(24,check,0);
    }

    //Test For Adding 2 inch and 2.5 centimeter
    @Test
    public void givenTwoInchesAndTwoAndHalfCmt_whenAdded_shouldReturn3Inches(){
        QuantityMeasurement valueInCm = new QuantityMeasurement(AllUnitsToUse.UnitConverter.CENTIMETER,2.5);
        QuantityMeasurement valueInInch = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,2.00);
        double check = valueInCm.addition(valueInInch);
        Assert.assertEquals(3,check,0);
    }


    //Test For Comparing 0 gallon is 0 gallon
    @Test
    public void given0GallonAnd0Gallon_whenCompare_shouldReturnEqual(){
        QuantityMeasurement valueInGallon1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GALLON,0.0);
        QuantityMeasurement valueInGallon2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GALLON,0.0);
        Assert.assertEquals(valueInGallon1, valueInGallon2);
    }

    //Test For Compare 0 Gallon And 1 Gallon
    @Test
    public void given0GallonAnd1Gallon_whenCompare_shouldReturnFalse(){
        QuantityMeasurement valueInGallon1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GALLON,0.0);
        QuantityMeasurement valueInGallon2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GALLON,1.0);
        Assert.assertNotEquals(valueInGallon1, valueInGallon2);
    }

    //Test For Null and Value
    @Test
    public void givenNullAndOneValueInGallon_shouldReturnFalse(){
        QuantityMeasurement valueInGallon = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GALLON,0.0);
        valueInGallon.equals(null);
        Assert.assertFalse(false);
    }

    //Test For Comparing 0 liters is 0 liters
    @Test
    public void given0LiterAnd0Liter_whenCompare_shouldReturnEqual(){
        QuantityMeasurement valueInLiter1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,0.0);
        QuantityMeasurement valueInLiter2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,0.0);
        Assert.assertEquals(valueInLiter1, valueInLiter2);
    }

    //Test For Compare 0 Liter And 1 Liter
    @Test
    public void given0LiterAnd1Liter_whenCompare_shouldReturnFalse(){
        QuantityMeasurement valueInLiter1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,0.0);
        QuantityMeasurement valueInLiter2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,1.0);
        Assert.assertNotEquals(valueInLiter1, valueInLiter2);
    }

    //Test For Null and Value
    @Test
    public void givenNullAndOneValueInLiter_shouldReturnFalse(){
        QuantityMeasurement valueInLiter = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,0.0);
        valueInLiter.equals(null);
        Assert.assertFalse(false);
    }

    //Test For Conversion Gallon to Liter
    @Test
    public void given0GallonAnd0Liter_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInLiter = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,0.0);
        QuantityMeasurement valueInGallon = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GALLON,0.0);
        boolean check = valueInLiter.checkCompare(valueInGallon);
        Assert.assertTrue(check);
    }

    //Test For Conversion Gallon to Liter
    @Test
    public void given1GallonAnd1Liter_whenCompare_shouldReturnFalse(){
        QuantityMeasurement valueInLiter = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,1.0);
        QuantityMeasurement valueInGallon = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GALLON,1.0);
        boolean check = valueInLiter.checkCompare(valueInGallon);
        Assert.assertFalse(check);
    }

    //Test For Conversion Gallon to Liter
    @Test
    public void given1GallonAnd3point78Liter_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInLiter = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,3.785);
        QuantityMeasurement valueInGallon = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GALLON,1.0);
        boolean check = valueInLiter.checkCompare(valueInGallon);
        Assert.assertTrue(check);
    }

    //Test For Compare 0 MiliLiter And 0 MiliLiter
    @Test
    public void given0MilliLiterAnd0MilliLiter_whenCompare_shouldReturnTue(){
        QuantityMeasurement valueInMl1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.MILILITER,0.0);
        QuantityMeasurement valueInMl2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.MILILITER,0.0);
        Assert.assertEquals(valueInMl1, valueInMl2);
    }

    //Test For Compare 0 MiliLiter And 1 MiliLiter
    @Test
    public void given0MilliLiterAnd1MilliLiter_whenCompare_shouldReturnFalse(){
        QuantityMeasurement valueInMl1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.MILILITER,0.0);
        QuantityMeasurement valueInMl2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.MILILITER,1.0);
        Assert.assertNotEquals(valueInMl1, valueInMl2);
    }

    //Test For Null and Value
    @Test
    public void givenNullAndOneValueInMiliLiter_shouldReturnFalse(){
        QuantityMeasurement valueInLiter = new QuantityMeasurement(AllUnitsToUse.UnitConverter.MILILITER,0.0);
        valueInLiter.equals(null);
        Assert.assertFalse(false);
    }

    //Test For 0 Liter and 0 Mililiter
    @Test
    public void given0MililiterAnd0Liter_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInLiter = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,0.0);
        QuantityMeasurement valueInMl = new QuantityMeasurement(AllUnitsToUse.UnitConverter.MILILITER,0.0);
        boolean check = valueInLiter.checkCompare(valueInMl);
        Assert.assertTrue(check);
    }

    //Test For 1 Liter and 1 Mililiter
    @Test
    public void given1MililiterAnd1Liter_whenCompare_shouldReturnFalse(){
        QuantityMeasurement valueInLiter = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,1.0);
        QuantityMeasurement valueInMl = new QuantityMeasurement(AllUnitsToUse.UnitConverter.MILILITER,1.0);
        boolean check = valueInLiter.checkCompare(valueInMl);
        Assert.assertFalse(check);
    }

    //Test For 1 Liter and 1000 Mililiter
    @Test
    public void given1000MililiterAnd1Liter_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInLiter = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,1.0);
        QuantityMeasurement valueInMl = new QuantityMeasurement(AllUnitsToUse.UnitConverter.MILILITER,1000.0);
        boolean check = valueInLiter.checkCompare(valueInMl);
        Assert.assertTrue(check);
    }

    //Test for additon of 0 gallon and 0 liter
    @Test
    public void givenZeroGallonAndZeroLiter_whenAdded_shouldRetuenZero(){
        QuantityMeasurement valueInLiter = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,0.0);
        QuantityMeasurement valueInGallon = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GALLON,0.0);
        double check = valueInGallon.addition(valueInLiter);
        Assert.assertEquals(0,check,0);
    }

    //Test for addition of 1 gallon and 1 gallon
    @Test
    public void givenOneGallonAndOneGallon_whenAdded_shouldReturn3point79Liters(){
        QuantityMeasurement valueInGallon1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GALLON,1.0);
        QuantityMeasurement valueInGallon2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GALLON,1.0);
        double check = valueInGallon1.addition(valueInGallon2);
        Assert.assertEquals(7.57,check,0);
    }

    //Test For Addition of 1 Liter and 1000 ml
    @Test
    public void givenOneLiterAnd1000Ml_whenAdded_shouldReturn2Liters(){
        QuantityMeasurement valueInLiter = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,1.0);
        QuantityMeasurement valueInMl = new QuantityMeasurement(AllUnitsToUse.UnitConverter.MILILITER,1000.0);
        double check = valueInLiter.addition(valueInMl);
        Assert.assertEquals(2,check,0);
    }
    //Test For 0 kg is equal to 0 kg
    @Test
    public void givenZeroKgAndZeroKg_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInKG1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.KILOGRAM,0);
        QuantityMeasurement valueInKG2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.KILOGRAM,0);
        Assert.assertEquals(valueInKG1,valueInKG2);
    }

    //Test For 0 kg is equal to 0 kg
    @Test
    public void givenOneKgAndZeroKg_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInKG1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.KILOGRAM,1.0);
        QuantityMeasurement valueInKG2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.KILOGRAM,0.0);
        Assert.assertNotEquals(valueInKG1,valueInKG2);
    }

    //Test For Null and Value
    @Test
    public void givenNullAndOneValueInKg_shouldReturnFalse(){
        QuantityMeasurement quantityMeasurementValue1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.KILOGRAM,0.0);
        quantityMeasurementValue1.equals(null);
        Assert.assertFalse(false);
    }

    //Test For 0 gram is equal to 0 gram
    @Test
    public void givenZeroGramsAndZeroGrams_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInGram1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GRAM,0);
        QuantityMeasurement valueInGram2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GRAM,0);
        Assert.assertEquals(valueInGram1,valueInGram2);
    }

    //Test For 0 gram is equal to 1 gram
    @Test
    public void givenZeroGramsAndOneGrams_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInGram1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GRAM,0);
        QuantityMeasurement valueInGram2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GRAM,1);
        Assert.assertNotEquals(valueInGram1,valueInGram2);
    }
    //Test For Null and Value
    @Test
    public void givenNullAndOneValueInGram_shouldReturnFalse(){
        QuantityMeasurement quantityMeasurementValue1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GRAM,0.0);
        quantityMeasurementValue1.equals(null);
        Assert.assertFalse(false);
    }

    //Test For 0Kg and 0Gram
    @Test
    public void givenZeroKgAndZeroGram_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInKilogram1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.KILOGRAM,0);
        QuantityMeasurement valueInGram2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GRAM,0);
        Assert.assertEquals(valueInKilogram1,valueInGram2);
    }

    //Test For 1Kg and 1Gram
    @Test
    public void givenOneKgAndOneGram_whenCompare_shouldReturnFalse(){
        QuantityMeasurement valueInKilogram1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.KILOGRAM,1.0);
        QuantityMeasurement valueInGram2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GRAM,1.0);
        Assert.assertNotEquals(valueInKilogram1,valueInGram2);
    }

    //Test For 1Kg is 1000grams
    @Test
    public void givenOneKgAnd1000Gram_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInKilogram1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.KILOGRAM,1.0);
        QuantityMeasurement valueInGram2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GRAM,1000.0);
        boolean check = valueInKilogram1.checkCompare(valueInGram2);
        Assert.assertTrue(check);
    }

    //Test For 0 Tonnes and 0Tones
    @Test
    public void givenZeroToneAndZeroTone_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInTonne = new QuantityMeasurement(AllUnitsToUse.UnitConverter.TONNE,0);
        QuantityMeasurement valueInTonne2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.TONNE,0);
        Assert.assertEquals(valueInTonne,valueInTonne2);
    }

    //Test For 1 Tonnes and 0 Tones
    @Test
    public void givenZeroToneAndOneTone_whenCompare_shouldReturnFalse(){
        QuantityMeasurement valueInTonne = new QuantityMeasurement(AllUnitsToUse.UnitConverter.TONNE,1);
        QuantityMeasurement valueInTonne2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.TONNE,0);
        Assert.assertNotEquals(valueInTonne,valueInTonne2);
    }

    //Test For Null and Value
    @Test
    public void givenNullAndOneValueInTonnes_shouldReturnFalse(){
        QuantityMeasurement quantityMeasurementValue1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.TONNE,0.0);
        quantityMeasurementValue1.equals(null);
        Assert.assertFalse(false);
    }

    //Test For Addition  1 Tonnes And 1000 Gms
    @Test
    public void given1TonnesAnd1000Gms_whenAdded_shouldReturnAdditionInKg(){
        QuantityMeasurement valueInTonne = new QuantityMeasurement(AllUnitsToUse.UnitConverter.TONNE,1.0);
        QuantityMeasurement valueInGrams = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GRAM,1000.0);
        double check = valueInTonne.addition(valueInGrams);
        Assert.assertEquals(1001,check,0);
    }

    //Test For Comparing 0 Degree with 0 Degree
    @Test
    public void given0DegreeAnd0Degree_whenCompare_shouldReturnEqual(){
        QuantityMeasurement valueInDegree1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.DEGREE,0.0);
        QuantityMeasurement valueInDegree2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.DEGREE,0.0);
        Assert.assertEquals(valueInDegree1, valueInDegree2);
    }

    //Test For Comparing 0 Degree with 1 Degree
    @Test
    public void given0DegreeAnd1Degree_whenCompare_shouldReturnFalse(){
        QuantityMeasurement valueInDegree1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.DEGREE,0.0);
        QuantityMeasurement valueInDegree2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.DEGREE,1.0);
        Assert.assertNotEquals(valueInDegree1, valueInDegree2);
    }

    //Test For Null and Value
    @Test
    public void givenNullAndOneValueInDegree_shouldReturnFalse(){
        QuantityMeasurement quantityMeasurementValue1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.DEGREE,0.0);
        quantityMeasurementValue1.equals(null);
        Assert.assertFalse(false);
    }

    //Test For Comparing 0 FAHRENHEIT with 0 FAHRENHEIT
    @Test
    public void given0FahrenheitAnd0Fahrenheit_whenCompare_shouldReturnEqual(){
        QuantityMeasurement valueInFahrenheit1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FAHRENHEIT,0.0);
        QuantityMeasurement valueInFahrenheit2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FAHRENHEIT,0.0);
        Assert.assertEquals(valueInFahrenheit1, valueInFahrenheit2);
    }

}
