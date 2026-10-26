package fabric.factory;

import maze.Maze;
import maze.room.Room;
import maze.door.Door;
import maze.wall.Wall;
public class MazeFactory {
    public MazeFactory() {}

    public maze.door.Door makeDoor(Room r1, maze.room.Room r2) {
        return new Door(r1, r2);
    }

    public Maze makeMaze() {
        return new Maze();
    }

    public Room makeRoom(int n) {
        return new Room(n);
    }

    public Wall makeWall() {
        return new Wall();
    }
}
