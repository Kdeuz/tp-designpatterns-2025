package fabric.factory;

import fabric.door.MagicDoor;
import fabric.room.EnchantedRoom;
import maze.room.Room;
import maze.door.Door;
import maze.wall.Wall;

public class EnchantedMazeFactory extends MazeFactory{
    public EnchantedMazeFactory() {
        super();
    }

    public Room makeRoom(int n) {
        return new EnchantedRoom(n);
    }

    public Door makeDoor(Room r1, Room r2) {
        return new MagicDoor(r1, r2);
    }
}
