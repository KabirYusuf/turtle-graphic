public class Room {
    char[][] floor = new char[20][20];

    public char[][] getFloor() {
        return floor;
    }

    public void displayFloor(){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("| ");
                System.out.print(floor[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
    public void setFloor(char[][]floor){
        this.floor = floor;
    }
}
