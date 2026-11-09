public class Turtle {
    private Pen pen;
    private Location location;
    private DIRECTION direction;

    public Pen getPen() {
        return this.pen;
    }

    public void changePenPosition(int positionValue) {
        if (positionValue == 1){
            pen.raiseUp();
        } else if (positionValue == 2) {
            pen.putDown();
        }
    }
    public void setPen(Pen pen){
        this.pen = pen;
    }

    public void turnLeft() {
            this.direction = DIRECTION.WEST;
    }
    public void turnRight() {
        this.direction = DIRECTION.EAST;
    }
    public void turnUp() {
        this.direction = DIRECTION.NORTH;
    }
    public void turnDown() {
        this.direction = DIRECTION.SOUTH;
    }

    public DIRECTION getDirection() {
        return direction;
    }
    public void setLocation(Location location){
        this.location = location;
    }

    public Location getLocation(){
        return this.location;
    }

    public char[][] move(int numberOfSteps, Room room) {
        char[][]floor = room.getFloor();
        if (direction == DIRECTION.EAST){
            int col = location.getCol();
            for (int i = 0; i < location.getCol() + numberOfSteps ; i++) {
                floor[location.getRow()][col] = '*';
                col++;
            }
            location.setCol(col);
        }
        return floor;
    }
}
