package maze.abstractfactories.factory;

import maze.src.maze.Maze;
import maze.src.maze.door.Door;
import maze.src.maze.room.Room;
import maze.src.maze.wall.Wall;
import test.SalleMinee;

public class BombedMazeFactory extends MazeFactory{
    @Override
    public Maze makeMaze() {
        return new Maze();
    }

    @Override
    public Wall makeWall() {
        return new Wall();
    }

    @Override
    public Room makeRoom(int roomNumber) {
        return new SalleMinee(roomNumber);
    }

    @Override
    public Door makeDoor(Room room1, Room room2) {
        return new Door(room1, room2);
    }
}
