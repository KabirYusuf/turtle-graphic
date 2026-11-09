import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TurtleTest {
    private Turtle turtle;

    @BeforeEach
    void setUp() {
        turtle = new Turtle();
    }
    @Test
    void testThatTurtleExist(){
        assertNotNull(turtle);
    }
    @Test
    void testThatTurtleHasAPen(){
        Pen pen = new Pen();
        turtle.setPen(pen);
        assertNotNull(turtle.getPen());
    }
    @Test
    void testThatWhenOneIsPassedTurtleRaisesPenUp(){
        Pen pen = new Pen();
        turtle.setPen(pen);
        turtle.changePenPosition(1);
        assertEquals(turtle.getPen().penPosition(), PEN_POSITION.UP);
    }
    @Test
    void testThenWhenPenIsDown(){
        Pen pen = new Pen();
        turtle.setPen(pen);
        turtle.changePenPosition(2);
        assertEquals(turtle.getPen().penPosition(), PEN_POSITION.DOWN);
    }
    @Test
    void testThatTurtleCanTurnLeft(){
        turtle.turnLeft();
        assertEquals(turtle.getDirection(), DIRECTION.WEST);
        turtle.turnRight();
        assertEquals(turtle.getDirection(), DIRECTION.EAST);
    }
    @Test
    void testThatTurtleCanMove(){
        Location location = new Location();
        turtle.setLocation(location);
        turtle.turnRight();
        turtle.move(10, new Room());
        assertEquals(turtle.getLocation().getCol() - 1, 9);
        assertEquals(turtle.getLocation().getRow(), 0);
    }

    @Test
    void testThatTurtlePrintsShapeOnBoardWhenPenIsDownAndTurtleDirectionIsRight(){
        Room room = new Room();
        Location location = new Location();
        turtle.setLocation(location);
        turtle.turnRight();
        char[][] floor = turtle.move(10, room);
        assertEquals(turtle.getLocation().getCol() - 1, 9);
        assertEquals(turtle.getLocation().getRow(), 0);
        room.setFloor(floor);
        room.displayFloor();

    }

}