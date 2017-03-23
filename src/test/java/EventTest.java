import org.junit.*;
import static org.junit.Assert.*;


public class EventTest {
  @Test
  public void theirEventInstantiatesCorrectly(){
    Event theirEvent = new Event(4);
    assertEquals(true, theirEvent instanceof Event);

  }

  @Test
  public void runEvent_returnANumber_1() {
    Event theirEvent = new Event(1);
    int ourTestNumber=1;

    assertEquals(ourTestNumber, theirEvent.returnANumber(1));
  }

  @Test
  public void runCalculateCost_returnCost_25() {
    Event aNewEvent = new Event(5);
    int testCost=25;

    assertEquals(testCost, aNewEvent.calculateCost(5));
  }

  @Test
  public void runApplyCoupon_returnPriceBasedOnCoupon_20(){
    double ourPriceBasedOnCoupons=20;
    Event theirEvent = new Event(5);
    assertEquals(ourPriceBasedOnCoupons,theirEvent.applyCoupon(25,.80 ));
  }
}
