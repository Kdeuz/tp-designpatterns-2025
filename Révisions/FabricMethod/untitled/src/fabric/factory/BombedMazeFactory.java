package fabric.factory;

import fabric.room.MinedRoom;
import fabric.wall.CrackedWall;
import maze.door.Door;
import maze.wall.Wall;
import maze.Maze;
import maze.room.Room;

public class BombedMazeFactory extends MazeFactory{
    public BombedMazeFactory() {}

    @Override
    public Room makeRoom(int n) {
        return new MinedRoom(n);
    }

    @Override
    public Wall makeWall() {
        return new CrackedWall();
    }
}
