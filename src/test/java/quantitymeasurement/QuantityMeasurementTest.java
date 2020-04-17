package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_whenCompare_shouldReturnTrue(){
      Feet feetValue1 = new Feet(0.0);
      Feet feetValue2 = new Feet(0.0);
      Assert.assertEquals(feetValue1,feetValue2);
    }
}
