import org.junit.*;
import static org.junit.Assert.*;

public class EPPTest {


  @Test
  public void runEvent_returnANumber_int() {
    Event theirEvent = new Event();
    int ourTestNumber=1;

    assertEquals(ourTestNumber, theirEvent.returnANumber(1));
  }

  // @Test
  // public void runCalculateCost_returnCost_0() {
  //   int testCost=0;
  //   Event testCostEvent= new Event();
  //   assertEquals(testCost,testCostEvent.calculateCost(3));

  }
