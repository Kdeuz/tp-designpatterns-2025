package fabric.creator;

import fabric.door.MagicDoor;
import fabric.room.EnchantedRoom;
import maze.room.Room;
import maze.door.Door;

public class EnchantedMazeCreator extends MazeCreator {
    public EnchantedMazeCreator() {
        super();
    }

    @Override
    public Room makeRoom(int i) {
        return new EnchantedRoom(i);
    }

    @Override
    public Door makeDoor(Room r1, Room r2) {
        return new MagicDoor(r1, r2);
    }
}
