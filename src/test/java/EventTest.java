import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newEvent_instantiatesCorrectly() {
    Event testEvent = new Event(10, 1, 2 , 3);
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void newEvent_() {
    Event testEvent = new Event(10, 1, 2 , 3);
    assertEquals(true, testEvent instanceof Event);
  }
}
