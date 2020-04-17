package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    //TestCase 1
    @Test
    public void given0FeetAnd0Feet_whenCompare_shouldReturnEqual(){
      Feet feetValue1 = new Feet(0.0);
      Feet feetValue2 = new Feet(0.0);
      Assert.assertEquals(feetValue1,feetValue2);
    }


}
