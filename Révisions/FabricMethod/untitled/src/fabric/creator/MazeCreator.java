package fabric.creator;

import maze.Maze;
import maze.door.Door;
import maze.room.Room;

public class MazeCreator {
    public MazeCreator() {}

    public Maze create() {
        Maze maze = makeMaze();

        Room r1 = makeRoom(1);
        Room r2 = makeRoom(2);
        Door door = makeDoor(r1, r2);

        maze.addRoom(r1);
        maze.addRoom(r2);

        r1.setSide(Room.Direction.EAST, door);
        r1.setSide(Room.Direction.WEST, makeWall());
        r1.setSide(Room.Direction.NORTH, makeWall());
        r1.setSide(Room.Direction.SOUTH, makeWall());

        r2.setSide(Room.Direction.WEST, door);
        r2.setSide(Room.Direction.EAST, makeWall());
        r2.setSide(Room.Direction.NORTH, makeWall());
        r2.setSide(Room.Direction.SOUTH, makeWall());

        return maze;
    }

    public Maze makeMaze() {
        Maze maze = new Maze();
        return maze;
    }

    public maze.room.Room makeRoom(int i) {
        maze.room.Room room = new maze.room.Room(i);
        return room;
    }

    public maze.wall.Wall makeWall() {
        maze.wall.Wall wall = new maze.wall.Wall();
        return wall;
    }

    public maze.door.Door makeDoor(maze.room.Room r1, Room r2) {
        Door door = new Door(r1, r2);
        return door;
    }
}
