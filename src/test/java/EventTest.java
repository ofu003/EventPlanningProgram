import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void testEvent_InstantiatesCorrectly_true(){
    Event testEvent = new Event(1,2,"yes","yes","yes","yes",3,"matinee");
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void theirEvent_getsGuests_1(){
    Event testEvent = new Event(1,2,"yes","yes","yes","yes",3,"matinee");
    assertEquals(1, testEvent.getNumberOfGuests());
  }

  @Test
  public void testEvent_getsHorsDO_2(){
    Event testEvent = new Event(1,2,"yes","no","yes","yes",3,"matinee");
    assertEquals(2, testEvent.getHDFood());
  }

  @Test
  public void testEvent_getsMagician_yes(){
    Event testEvent = new Event(1,2,"yes","no","yes","yes",3,"matinee");
    assertEquals("yes", testEvent.getMagician());
  }

  @Test
  public void testEvent_getsBartender_no(){
    Event testEvent = new Event(1,2,"yes","no","yes","yes",3,"matinee");
    assertEquals("no", testEvent.getBartender());
  }

  @Test
  public void testEvent_getsBand_yes(){
    Event testEvent = new Event(1,2,"yes","no","yes","yes",3,"matinee");
    assertEquals("yes", testEvent.getBand());
  }

  @Test
  public void testEvent_getsValet_yes(){
    Event testEvent = new Event(1,2,"yes","no","yes","yes",3,"matinee");
    assertEquals("yes", testEvent.getValet());
  }

  @Test
  public void testEvent_getsFoodPerPerson_3(){
    Event testEvent = new Event(1,2,"yes","no","yes","yes",3,"matinee");
    assertEquals(3, testEvent.getLevelOfFood());
  }

  @Test
  public void testEvent_getsCoupon_matinee(){
    Event testEvent = new Event(1,2,"yes","no","yes","yes",3,"matinee");
    assertEquals("matinee", testEvent.getCouponType());
  }

  @Test
  public void testEvent_getsCost_346(){
    Event testEvent = new Event(10,2,"no","yes","no","yes",7,"matinee");
    assertEquals(280, testEvent.calculateCost());
  }


}
