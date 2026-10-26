package maze.abstractfactories.factory;

import maze.src.maze.Maze;
import maze.src.maze.door.Door;
import maze.src.maze.room.Room;
import maze.src.maze.wall.Wall;

public abstract class MazeFactory {
    public abstract Maze makeMaze();
    public abstract Wall makeWall();
    public abstract Room makeRoom(int roomNumber);
    public abstract Door makeDoor(Room room1, Room room2);

    public static MazeFactory getFactory() {
        return new StandardMazeFactory();
    }
}
