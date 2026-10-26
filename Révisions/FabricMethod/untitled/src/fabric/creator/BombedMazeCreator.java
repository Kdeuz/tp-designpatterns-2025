package fabric.creator;

import fabric.room.MinedRoom;
import fabric.wall.CrackedWall;
import maze.room.Room;
import maze.wall.Wall;

public class BombedMazeCreator extends MazeCreator {
    public BombedMazeCreator() {
    }

    @Override
    public Room makeRoom(int i) {
        return new MinedRoom(i);
    }

    @Override
    public Wall makeWall() {
        return new CrackedWall();
    }

}
