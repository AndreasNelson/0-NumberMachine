package umm2101;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestNumberMachine {
  
  @DisplayName("Test sum")
  @Test
  public void testSum() {
    /********* Test Sum *********/
    NumberMachine mac1 = new NumberMachine();
    assertEquals(8, mac1.getSum());
  }

  @DisplayName("Test product")
  @Test
  public void testProduct() {
    /********* Test Product *********/
    NumberMachine mac1 = new NumberMachine();
    assertEquals(15, mac1.getProduct());
  }

}
