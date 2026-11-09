import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocationTest {
    private Location location;
    @BeforeEach
    void setUp() {
        location = new Location();
    }
    @Test
    void testThatLocationExists(){
        assertNotNull(location);
    }
    @Test
    void testThatLocationReturnsCorrectCol(){
        location.setCol(5);
        int col = location.getCol();
        assertEquals(col, 5);
    }

    @Test
    void testThatLocationReturnsCorrectRow(){
        location.setRow(15);
        int row = location.getRow();
        assertEquals(row, 15);
    }
}