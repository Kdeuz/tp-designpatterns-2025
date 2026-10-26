package test;

import maze.src.maze.door.Door;
import maze.src.maze.room.Room;

public class EnchantedMazeFactory extends MazeCreator {
    public Room createRoom(int i) {
        return new SalleEnchantee(i);
    }

    public Door createDoor(Room r1, Room r2) {
        return new PorteMagique(r1, r2);
    }
}
