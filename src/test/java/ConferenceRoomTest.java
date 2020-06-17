import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom room1;
    private ConferenceRoom room2;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void before() {
        room1 = new ConferenceRoom(1000, "1a", true);
        room2 = new ConferenceRoom(1, "2a", false);
        guest1 = new Guest("Frank");
        guest2 = new Guest("Greg");
    }

    @Test
    public void hasCapacity(){
        assertEquals(1000, room1.getCapacity());
    }

    @Test
    public void canSetCapacity(){
        room1.setCapacity(2);
        assertEquals(2, room1.getCapacity());
    }

    @Test
    public void hasName() {
        assertEquals("1a", room1.getName());
    }

    @Test
    public void canSetName() {
        room1.setName("100a");
        assertEquals("100a", room1.getName());
    }

    @Test
    public void hasProjector(){
        assertEquals(true, room1.isHasProjector());
    }

    @Test
    public void canSetProjector(){
        room1.setHasProjector(false);
        assertEquals(false, room1.isHasProjector());
    }

    @Test
    public void canAddGuest(){
        room1.addGuest(guest1);
        assertEquals(1, room1.guestCount());
    }

}
