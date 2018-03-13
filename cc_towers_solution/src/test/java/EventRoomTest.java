import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EventRoomTest {
    EventRoom room;

    @Before
    public void before() {
        room = new EventRoom("CC Main Area", 60);
    }

    @Test
    public void hasName() {
        assertEquals("CC Main Area", room.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(60, room.getCapacity());
    }
}
