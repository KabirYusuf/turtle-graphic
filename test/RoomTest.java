import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class RoomTest {
    private Room room;

    @BeforeEach
    void setUp() {
        room = new Room();
    }

    @Test
    public void testToShowThatRoomIsNotNull(){
        assertNotNull(room);
    }
    @Test
    void displayFloor(){
        room.displayFloor();
    }
}