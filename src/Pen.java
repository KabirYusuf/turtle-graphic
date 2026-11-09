public class Pen {
    private PEN_POSITION penPosition;

    public PEN_POSITION raiseUp() {
        return penPosition = PEN_POSITION.UP;
    }

    public PEN_POSITION putDown() {
        return penPosition = PEN_POSITION.DOWN;
    }

    public PEN_POSITION penPosition() {
        return penPosition;
    }
}
