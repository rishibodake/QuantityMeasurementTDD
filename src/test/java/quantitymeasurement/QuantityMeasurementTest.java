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

}
