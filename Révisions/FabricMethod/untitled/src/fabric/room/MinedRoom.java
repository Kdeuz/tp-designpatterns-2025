package fabric.room;

public class MinedRoom extends maze.room.Room {
    public MinedRoom(int i) {
        super(i);
    }

    @Override
    public String toString() {
        return "MinedRoom :\n" + super.toString();
    }
}
