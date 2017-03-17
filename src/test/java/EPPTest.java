import org.junit.*;
import static org.junit.Assert.*;

public class EPPTest {

  @Test
  public void runEvent_returnAWord_String() {
    Event theirEvent = new Event(3, 2, "yes", "bartender", "band", "parking", "code1", "code2", 2);
    assertEquals("yes", theirEvent.mMagician);
    // contents of test will eventually go here.
    System.out.println(theirEvent.mMagician);
  }
}
