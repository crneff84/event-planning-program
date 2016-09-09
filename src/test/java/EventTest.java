import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newEvent_instantiatesCorrectly() {
    Event testEvent = new Event(1, 1, 2 , 3);
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void newEvent_calculateCost_1200() {
    Event testEvent = new Event(10, 1, 1, 1);
    assertEquals(Integer.valueOf(1200), testEvent.calculateCost());
  }

  @Test
  public void newEvent_getTotal_0() {
    Event testEvent = new Event(10, 1, 1, 1);
    assertEquals(Integer.valueOf(0), testEvent.getTotal());
  }

  @Test
  public void newEvent_getGuests_10() {
    Event testEvent = new Event(10, 1, 1, 1);
    assertEquals(Integer.valueOf(10), testEvent.getGuests());
  }

  @Test
  public void newEvent_getMealChoice() {
    Event testEvent = new Event(10, 1, 1, 1);
    String expectedOutput = "";
    assertEquals(expectedOutput, testEvent.getMealChoice());
  }

  @Test
  public void newEvent_getBeverageChoice() {
    Event testEvent = new Event(10, 1, 1, 1);
    String expectedOutput = "";
    assertEquals(expectedOutput, testEvent.getBeverageChoice());
  }

  @Test
  public void newEvent_getEntertainmentChoice() {
    Event testEvent = new Event(10, 1, 1, 1);
    String expectedOutput = "";
    assertEquals(expectedOutput, testEvent.getEntertainmentChoice());
  }

  @Test
  public void newEvent_showMeal() {
    Event testEvent = new Event(10, 2, 1, 1);
    String expectedOutput = "Steak";
    assertEquals(expectedOutput, testEvent.showMeal());
  }

  @Test
  public void newEvent_showBeverage() {
    Event testEvent = new Event(10, 2, 1, 1);
    String expectedOutput = "Alcoholic Beverages";
    assertEquals(expectedOutput, testEvent.showBeverage());
  }

  @Test
  public void newEvent_showEntertainment() {
    Event testEvent = new Event(10, 2, 1, 2);
    String expectedOutput = "DJ";
    assertEquals(expectedOutput, testEvent.showEntertainment());
  }
}
